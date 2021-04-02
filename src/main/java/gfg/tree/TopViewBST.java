package gfg.tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node {
    int data;
    Node left, right;

    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}

public class TopViewBST {


    Node root;

    public TopViewBST() { root = null; }


    private void TopView(Node root) {

        class QueueObject {
            Node node;
            int hd;

            public QueueObject(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }

        }


        Queue<QueueObject> q = new LinkedList<QueueObject>();
        Map<Integer, Node> map = new TreeMap<Integer, Node>();

        if (root == null) {
            return;
        } else {
            q.add(new QueueObject(root, 0));
        }

        System.out.println(
                "The top view of the tree is : ");

        while (!q.isEmpty()) {
            QueueObject qo = q.poll();
            Node n = qo.node;
            int hd = qo.hd;

            if (!map.containsKey(hd)) {
                map.put(hd, n);
            }

            if (n.left != null) {
                q.add(new QueueObject(n.left, hd - 1));
            }

            if (n.right != null) {
                q.add(new QueueObject(n.right, hd + 1));
            }
        }

            for (Map.Entry<Integer, Node> entry : map.entrySet()) {
                System.out.print(entry.getValue().data);
            }
    }

    public static void main(String[] args)
    {
        /* Create following Binary Tree
            1
        / \
        2 3
        \
            4
            \
            5
            \
                6*/
        TopViewBST tree = new TopViewBST();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.left.right.right = new Node(5);
        tree.root.left.right.right.right = new Node(6);
        System.out.println(
                "Following are nodes in top view of Binary Tree");
        tree.TopView(tree.root);
    }

}
