package gfg.recursion;

public class AddDigitUntil1 {




   static int addDigits(int n){

        if(n/10 == 0){
            return n;
        }

        int sum = 0;

        while(n!=0){
            sum+=n%10;
            n = n/10;
        }

       return addDigits(sum);

    }

    public static void main(String[] args) {

        System.out.println("Input: 256, Output: " +addDigits(256));
        System.out.println("Input: 15, Output: " +addDigits(15));
        System.out.println("Input: 82, Output: " + addDigits(82));
        System.out.println("Input: 242239, Output: " + addDigits(242239));

    }


}
