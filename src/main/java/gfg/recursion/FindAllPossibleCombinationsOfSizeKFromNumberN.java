package gfg.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllPossibleCombinationsOfSizeKFromNumberN {

    public static void printAllSubsetWithSum(int arrA[] , int sum, int currSum, int start, List<Integer> combinationList){

        if(currSum==sum) {
            System.out.println(combinationList);
            return;
        }

//        int prevElement = -1;
        for (int i = start; i <arrA.length ; i++) {
//            if(prevElement!=arrA[i]) {
                if(currSum+arrA[i]>sum) //array is sorted, no need to check further
                    break;
                combinationList.add(arrA[i]);
                printAllSubsetWithSum(arrA, sum, currSum + arrA[i], i + 1, combinationList);
                combinationList.remove(combinationList.size() - 1);
//                prevElement = arrA[i];
//            }
        }
    }

    public void findCombinations(int N, int K) {

        System.out.println("Given Number: " + N + ", subset size K: " + K);
        List<Integer> combinationList = new ArrayList<>();
        combinationUtil(N, K, 1, combinationList);
    }

    public void combinationUtil(int N, int K, int startNumber, List<Integer> combinationList) {

        if (K == 0) {
            System.out.println(combinationList);
            return;
        }

        for (int i = startNumber; i <= N; i++) {
            combinationList.add(i);
            combinationUtil(N, K-1, i + 1, combinationList);
            combinationList.remove(combinationList.size() - 1);
        }
    }

    public static void findCombinationsSumToN(int n, int sum, int start, List<Integer> combinationList){

        if(sum==n) {
            System.out.println(combinationList);
            return;
        }

        for (int i = start; i <=9 ; i++) {
            if(sum + i > n){
                break;
            }
            combinationList.add(i);
            findCombinationsSumToN(n, sum + i, i + 1, combinationList);
            combinationList.remove(combinationList.size()-1);
        }
    }

    public static void main(String[] args) {
//        int N = 6;
//        int K = 5;
        FindAllPossibleCombinationsOfSizeKFromNumberN f = new FindAllPossibleCombinationsOfSizeKFromNumberN();
//        f.findCombinations(N, K);

        int [] arrA = {1,1,4};
        int sum = 5;


        System.out.println("Given Array: " + Arrays.toString(arrA) + ", required sum: " + sum);
        Arrays.sort(arrA);
        List<Integer> combinationList = new ArrayList<>();
//        printAllSubsetWithSum(arrA, sum, 0, 0, combinationList);


        findCombinationsSumToN(12, 0, 1, combinationList);
    }
}
