package gfg.algorithm;

public class Commoncharacters {

    public static void commonCharacters(String[] str, int n){

        int[] sc = new int[26];
        for (String s: str) {
            boolean[] oc = new boolean[26];
            for (char c : s.toCharArray()) {

                if (!oc[c - 'a']) {
                    sc[c - 'a']++;
                    oc[c - 'a'] = true;
                }
            }

        }

        for(int i = 0;i<26;i++){
            if (sc[i] == 4){
                int c = 'a' + i;
                System.out.println((char) c);
            }
        }


    }


    public static void main(String[] args){





                    String str[] = { "geeksforgeeks",
                            "gemkstones",
                            "acknowledges",
                            "aguelikes" };

        int n = str.length;
        commonCharacters(str, n);

    }
}
