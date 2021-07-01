package gfg.algorithm;

import java.util.HashMap;
import java.util.Map;

class  CountOccurence{

   static int search(String pat, String txt) {
        // code here
        int plen = pat.length();
        int slen = txt.length();
        Map<Character, Integer> m = new HashMap<>();

        for (int i = 0;i<plen; i++){
            char ca = pat.charAt(i);
            if(m.get(ca) != null){
                m.put(ca, m.get(ca)+1);
            }else{
                m.put(ca, 1);
            }
        }

        int count = m.size();
        int ans = 0;

        int i = 0;
        int j = 0;

        while(j < slen){
            char c = txt.charAt(j);
            if( m.get(c) != null){
                m.put(c, m.get(c)-1);

                if (m.get(c) == 0){
                    count--;
                }
            }

            if ((j-i +1) == plen){
                if (count == 0){
                    ans++;
                }

                char fc = txt.charAt(i);

                if (m.get(fc) != null){

                    if (m.get(fc) == 0){
                        count++;
                    }

                    m.put(fc, m.get(fc)+1);


                }

                i++;

            }

            j++;


        }

        return ans;

    }

    public static void main(String[] args) {
        search("kkkkk","kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }
}
