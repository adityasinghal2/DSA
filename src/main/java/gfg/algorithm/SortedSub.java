package gfg.algorithm;


import java.util.ArrayList;

class SortedSub {
    static ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        // add code here.
        ArrayList<Integer> ans = new ArrayList<>();

        // add code here.
        int f = arr.get(0);
        int count  = 1;

        for (int i=1;i<n;i++){
            if (f < arr.get(i)){
                f = arr.get(i);
                count ++;
            }

        }

        if (count > 2){
            ans.add(1);
            return ans;
        }
        ans.add(0);
        return ans;
    }

    public static void  main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);
//        a.add(3);
        System.out.println(find3Numbers(a, a.size()));

    }
}
