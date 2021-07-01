package gfg.graph;

import java.util.ArrayList;

class DetectCycle
{

    public static boolean isCyclicHelper(int V, int cur , ArrayList<ArrayList<Integer>> adj, boolean[] dfsc, boolean[] v){
        v[cur] =true;
        dfsc[cur] = true;

        for (int i : adj.get(cur)){
            if (!v[i]){
                return isCyclicHelper(V, i, adj, dfsc, v);
            }else if (dfsc[i]){
                return true;
            }

        }

        dfsc[cur] = false;
        return false;

    }

    //Function to detect cycle in a directed graph.
    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // code here
        boolean[] dfsc = new boolean[V];
        boolean[] v = new  boolean[V];
        for(int i = 0;i<V;i++) {
            if(!v[i]) {
                if(isCyclicHelper(V, i ,adj, dfsc, v) == true) return true;
            }
        }
        return false;
        // return isCyclicHelper(V, 0 ,adj, dfsc, v);



    }

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer> d1 = new ArrayList<>();
        adj.add(d1);
        ArrayList<Integer> d2 = new ArrayList<>();
        d2.add(2);
        adj.add(d2);
        ArrayList<Integer> d3 = new ArrayList<>();
        d3.add(4);
        adj.add(d3);
        ArrayList<Integer> d4 = new ArrayList<>();
        d4.add(1);
        adj.add(d4);
        ArrayList<Integer> d5= new ArrayList<>();
        d5.add(0);
        adj.add(d5);
        ArrayList<Integer> d6 = new ArrayList<>();
        d6.add(3);
        adj.add(d6);
        ArrayList<Integer> d7 = new ArrayList<>();
        d7.add(5);
        adj.add(d7);

        isCyclic(7, adj);
    }
}
