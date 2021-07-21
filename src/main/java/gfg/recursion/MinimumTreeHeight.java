package gfg.recursion;

class NodeE {
    int data;
    Node left, right;

    public NodeE(int item)
    {
        data = item;
        left = right = null;
    }
}

public class MinimumTreeHeight {
    // Root of the Binary Tree
    Node root;

    int minimumDepth() { return minimumDepth(root, 0); }

    /* Function to calculate the minimum depth of the tree
     */
    int minimumDepth(Node root, int level)
    {

        if (root == null)
            return level;
        level++;

        return Math.min(minimumDepth(root.left, level),
                minimumDepth(root.right, level));
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        MinimumTreeHeight tree = new MinimumTreeHeight();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);

        System.out.println("The minimum depth of "
                + "binary tree is : "
                + tree.minimumDepth());
    }
}