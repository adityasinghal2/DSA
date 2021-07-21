package gfg.sortFunction;

class QuickSort {
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // code here
        // high = high-1;
        if (low < high) {

            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot);
            quickSort(arr, pivot + 1, high);

        }

    }

    static int partition(int arr[], int low, int high) {
        // your code here
        int pivot = arr[low];

        int i = low;
        int j = high;
        while (i < j) {

            while (i < arr.length && pivot >= arr[i])
                i++;
            while (j>=0 && pivot < arr[j]) j--;

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }


        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;


    }


    public static void main(String[] args) {
        int arr[] = {4, 1, 3, 9, 7};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "||");
        }
    }
}