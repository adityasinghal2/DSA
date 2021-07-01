package gfg.algorithm;

import java.util.HashMap;
import java.util.Map;

public class minSubsString {

    public static String minWindow(String s, String t) {

        int len = s.length();
        int size = t.length();
        if(len<size || size==0 || len==0)
            return "";
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0;i< size;i++){
            char c = t.charAt(i);
            if (m.get(c) == null){
                m.put(c,1);
            }else{
                m.put(c, m.get(c)+1);
            }

        }

        int i =0;
        int j = 0;
        int start = -1;
        int min = Integer.MAX_VALUE;
        int count = m.size();



        while(j < len){

            char ch = s.charAt(j);
            if (m.get(ch) != null){
                m.put(ch,m.get(ch)-1 );

                if (m.get(ch) == 0){
                    count--;
                }
            }

            if (count == 0){


                while(count == 0){
                    char chs = s.charAt(i);
                    if (m.get(chs) != null){
                        m.put( chs, m.get(chs)+1);
                        if(m.get(chs) > 0){
                            count++;
                        }
                    }

                    if ((j-i+1) < min){
                        start = i;
                        min = j-i+1;
                    }

                    i++;
                }




            }


            System.out.println("qwd"+ min);
            System.out.println("qswawd"+start);
            j++;

        }

        if( start < 0)
            return "";
        return s.substring(start, start+min);





    }


    public static void main(String[] args){
        String s = "cabwefgewcwaefgcf";
        String t = "cae";
        System.out.println(minWindow(s,t));

    }

}
