package gfg.algorithm;

public class Multiple {
    public static int[] productExceptSelf(int[] nums) {
        int leng = nums.length;
        int[] ret = new int[leng];
        if(leng == 0)
            return ret;
        int runningprefix = 1;
        for(int i = 0; i < leng; i++){
            ret[i] = runningprefix;
            runningprefix*= nums[i];
        }
        int runningsufix = 1;
        for(int i = leng -1; i >= 0; i--){
            ret[i] *= runningsufix;
            runningsufix *= nums[i];
        }
        return ret;

    }

    public static void main(String args[]){
        int[] nums = {3,5,6,7,8,4};
        productExceptSelf(nums);


    }
}
