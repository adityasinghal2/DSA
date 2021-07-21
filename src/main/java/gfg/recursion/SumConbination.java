package gfg.recursion;

import java.util.ArrayList;

class SumCobination {

    // A Tree node
    static class Node
    {
        int key;
        Node left, right;
    };

    // Utility function to create a new node
    static Node newNode(int key)
    {
        Node temp = new Node();
        temp.key = key;
        temp.left = temp.right = null;
        return (temp);
    }

    static void printPathsUtil(Node curr_node, int sum,
                               int sum_so_far,
                               ArrayList<Integer> path)
    {
        if (curr_node == null)
            return;

        // Add the current node's value
        sum_so_far += curr_node.key;

        // Add the value to path
        path.add(curr_node.key);

        // Print the required path
        if (sum_so_far == sum)
        {
            System.out.print("Path found: ");
            for(int i = 0; i < path.size(); i++)
                System.out.print(path.get(i) + " ");

            System.out.println();
        }

        // If left child exists
        if (curr_node.left != null)
            printPathsUtil(curr_node.left, sum,
                    sum_so_far, path);

        // If right child exists
        if (curr_node.right != null)
            printPathsUtil(curr_node.right, sum,
                    sum_so_far, path);

        // Remove last element from path
        // and move back to parent
        path.remove(path.size() - 1);
    }

    static void printPathsHelper(Node root, int sum , ArrayList<Integer> path){



        if(root == null){
            return;
        }

        if(sum  < 0){
            return;
        }

        sum-= root.key;
        path.add(root.key);


        if(sum == 0){
            System.out.print("Path found: ");
            for(int i = 0; i < path.size(); i++)
                System.out.print(path.get(i) + " ");

            System.out.println();
//            path.remove(path.size()-1);


//            return;
        }



        if(sum  < 0){
            path.remove(path.size()-1);
            return;
        }


        if(root.left != null)
        printPathsHelper(root.left, sum , path);
        if(root.right != null)
        printPathsHelper(root.right, sum , path);
        path.remove(path.size()-1);


    }

    // Wrapper over printPathsUtil
    static void printPaths(Node root, int sum)
    {
        ArrayList<Integer> path = new ArrayList<>();
//        printPathsUtil(root, sum, 0, path);
        printPathsHelper(root, sum, path);
    }

    // Driver code
    public static void main(String[] args)
    {

    /*    10
       /     \
     28       13
           /     \
         14       15
        /   \     /  \
       21   22   23   24*/
        Node root = newNode(10);
        root.left = newNode(28);
        root.right = newNode(13);

        root.right.left = newNode(14);
        root.right.right = newNode(15);

        root.right.left.left = newNode(21);
        root.right.left.left.left = newNode(6);
        root.right.left.left.right = newNode(5);
        root.right.left.right = newNode(22);
        root.right.right.left = newNode(23);
        root.right.right.right = newNode(24);

        int sum = 38;

        printPaths(root, sum);
    }
}
