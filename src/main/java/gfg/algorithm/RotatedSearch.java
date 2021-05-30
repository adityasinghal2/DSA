package gfg.algorithm;

public class RotatedSearch {

    static int Search(int nums[], int target)
    {
        // code here
        int low = 0;
        int end = nums.length-1;
        while(low <= end){

            int mid = low + (end-low)/2;

            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] > target){
                if (nums[low] <= nums[mid]  && nums[low] > target){
                    low = mid + 1;
                }else{
                    end = mid -1;
                }

            }else{
                if (nums[mid] <= nums[end] &&  target > nums[end]){
                    end = mid-1;
                }else{
                    low = mid +1;
                }

            }



        }
        return -1;
    }


    public static void main(String[] args){
        int[] arr = {5, 6,7,8,9,10,1,2,3};
        Search(arr, 10);

    }

}
