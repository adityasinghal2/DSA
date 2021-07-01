package gfg.algorithm;

class ArrayToBST
{
    static void sortedArrayToBSTHelper(int[] nums, int low, int high, int[] ans, int[] i){

        if(low > high){
            return;
        }

        int mid = low + (high - low)/2;
        ans[i[0]++] = nums[mid];
        sortedArrayToBSTHelper(nums, low, mid-1, ans, i);
        sortedArrayToBSTHelper(nums, mid+1, high, ans, i);



    }

    public static int[] sortedArrayToBST(int[] nums)
    {
        // Code here
        int len =  nums.length;
        int[] ans = new int[len];

        sortedArrayToBSTHelper(nums, 0, len-1, ans, new int[1]);

        return ans;




    }

    static int f(int n){
        return n < 3 ? n-1 : f(n-1) + f(n-2);
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5,6,7};
//        sortedArrayToBST(nums);
            System.out.println(f(7));
    }
}
