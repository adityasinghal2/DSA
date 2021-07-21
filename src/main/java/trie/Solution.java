package trie;

class Solution {
    //Function to find most frequent word in an array of strings.
    static int max = Integer.MIN_VALUE;
    static int maxStart = Integer.MIN_VALUE;
    static class Trie{
        char ch;
        int we;
        int start = -1;
        Trie[] t;

        Trie(char ch){
            this.ch = ch;
            t = new Trie[26];

        }

    }




    static boolean trieInsertion(String s, Trie node, int start){

        for(char c : s.toCharArray()){
            if(node.t[c-'a'] == null){
                node.t[c-'a'] = new Trie(c);
            }
            node = node.t[c-'a'];
        }

        node.we = node.we +1;

        if(node.we == 1){
            node.start  = start;
        }


        if(node.we > max){
            max = node.we;
            return true;
        }else if (node.we == max  && maxStart<=node.start){
            maxStart = node.start;
            return true;

        }
        return false;

    }


    public static String mostFrequentWord(String arr[],int n)
    {
        // code here
        Trie node = new Trie('\0');
        String ans = "";
        for(int i =0;i<n;i++){

            if(trieInsertion(arr[i], node, i)){
                ans  = arr[i];
            }

        }

        return ans;


    }

    public static void main(String[] args) {
        String[] s = {"xejdcj", "xejdcj", "lvjpb", "tmyuiu", "lvjpb", "tmyuiu", "ovoba", "lvjpb", "lvjpb", "fqhyu", "fqhyu", "tmyuiu", "xejdcj", "tmyuiu", "fqhyu", "ovoba", "xejdcj"

        };

        System.out.println(mostFrequentWord(s,s.length));
    }

}
