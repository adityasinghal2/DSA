package gfg.recursion;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class DiagonalTree
{

   static class TreeNode
    {
        int data; //node data
        TreeNode left, right; //left and right child's reference

        // Tree node constructor
        public TreeNode(int data)
        {
            this.data = data;
            left = right = null;
        }
    }

     public static void diagonalHelper(TreeNode root, int d, Map<Integer, ArrayList<Integer>> m){

        if(root == null){
            return;
        }





         if(m.get(d) == null){
             m.put(d, new ArrayList<Integer>());
             m.get(d).add(root.data);
         }else{
             m.get(d).add(root.data);
         }

         diagonalHelper(root.left, d+1,m);
         diagonalHelper(root.right, d,m);




    }

    public static ArrayList<Integer> diagonal(TreeNode root)
    {
        //add your code here.
        Map<Integer, ArrayList<Integer>> m = new HashMap<>();
        diagonalHelper(root, 0, m);
        ArrayList<Integer> ans = new ArrayList<Integer>();



        for (ArrayList<Integer> i : m.values()){
            ans.addAll(i);
        }


        return ans;

    }

    public static void main(String[] args) {


        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);
            diagonal(root);

    }
}
