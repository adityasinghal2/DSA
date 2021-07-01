package gfg.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class printVer {
    public static List<String> printVertically(String s) {
        Map<Integer,String> m = new HashMap<>();
        int bucket = Integer.MAX_VALUE;
        for(int i = 0;i< s.length();i++){

            if (s.charAt(i)  == ' ' && bucket == Integer.MAX_VALUE){
                bucket = i - bucket;
            }else{
                if (m.get(i % bucket) == null){
                    m.put(i % bucket, "");
                }else{
                    m.put(i % bucket, m.get(i % bucket));
                }

            }

        }
        return new ArrayList<>();
    }

    public static void main(String[] args){

        String s = "HOW ARE YOU";

        printVertically(s);

    }
}
