package gfg.sortFunction;

public class MergeSort {


        static void merge(int[] arr, int low, int mid, int high){

            int i = low;
            int j = mid + 1;
            int size = high-low+1;
            int[] temp = new int[size];
            int k = 0;
            while(i<=mid && j<=high){
                if(arr[i]<=arr[j]){
                    temp[k] = arr[i];
                    i++;
                }else{
                    temp[k] = arr[j];
                    j++;
                }
                k++;

            }

            while(i<=mid){
                temp[k] = arr[i];
                k++;
                i++;
            }

            while(j<=high){
                temp[k] = arr[j];
                k++;
                j++;
            }


            for(i = low; i <= high; i += 1) {
                arr[i] = temp[i - low];
            }



        }

        static void mergeSort(int[] arr, int low, int high){

            if(low < high) {
                int mid = low + (high - low) / 2;
                mergeSort(arr, low, mid);
                mergeSort(arr, mid+1, high);
                merge(arr, low, mid, high);
            }
        }


    public static void main(String[] args) {
         int[] arr = {4,2,7,12,9,2};
        mergeSort(arr, 0, arr.length-1);
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}
