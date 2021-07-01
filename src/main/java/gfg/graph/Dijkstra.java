package gfg.graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {

    static class Node implements Comparable<Node>{

        int vertex;
        int weight;

        Node(int vertex, int weight){
            this.vertex = vertex;
            this.weight = weight;
        }


        @Override
        public int compareTo(Node o) {
            if (this.weight > o.weight)
                return 1;
            else if (this.weight < o.weight){
                return -1;
            }else{
                return 0;
            }

        }
    }

    static void shortestPath(int src, ArrayList<ArrayList<Node>> adj, int[] d, PriorityQueue<Node> q){

        q.add(new Node(src, 0));
        d[src] = 0;

        while(!q.isEmpty()){

            Node n = q.poll();
            int v = n.vertex;
            for(Node c : adj.get(v)){
                if((d[v] + c.weight) < d[c.vertex]){
                    d[c.vertex] = d[v] + c.weight;
                    q.add(new Node(c.vertex,d[c.vertex]));
                }

            }


        }


    }



    public static void main(String[] args) {

        int V = 5;
        ArrayList<ArrayList<Node>> adj = new ArrayList<>();

        for(int i =0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new Node(1, 2));
        adj.get(1).add(new Node(0, 2));

        adj.get(1).add(new Node(2, 4));
        adj.get(2).add(new Node(1, 4));

        adj.get(0).add(new Node(3, 1));
        adj.get(3).add(new Node(0, 1));

        adj.get(3).add(new Node(2, 3));
        adj.get(2).add(new Node(3, 3));

        adj.get(1).add(new Node(4, 5));
        adj.get(4).add(new Node(1, 5));

        adj.get(2).add(new Node(4, 1));
        adj.get(4).add(new Node(2, 1));

        int[] d = new int[V];
        for(int i =0;i<V;i++){
            d[i] = Integer.MAX_VALUE;
        }


        PriorityQueue<Node>  q = new PriorityQueue<>(V);

        shortestPath(0, adj, d, q);

        for (int i = 0; i < V; i++)
        {
            System.out.print( d[i] + " ");
        }




    }
}
