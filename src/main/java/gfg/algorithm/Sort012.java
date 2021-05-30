package gfg.algorithm;

public class Sort012 {


    public static void sort012(int a[], int n)
    {
        // code here

        int zCount = 0;
        int oCount = 0;
        int tcount = 0;

        for (int i =0 ;i< n;i++){

            if (a[i] == 0){
                zCount++;

            }else if (a[i] == 1){
                oCount++;
            }else{
                tcount++;
            }
        }

        for (int i =0 ;i< n;i++){

            if (zCount != 0){
                a[i] = 0;
                zCount--;
            }else if (oCount != 0){
                a[i] = 1;
                oCount--;
            }else{
                a[i] = 2;
            }
        }




    }

    public static void sort012Efficient(int a[], int n) {
        // code here

        int low = 0;
        int mid = 0;
        int high  = n-1;

        while(mid <= high){

            if(a[mid] == 0){
                a[mid] = a[low];
                a[low] = 0;
                low++;
                mid++;
            }else if (a[mid] == 1){
                mid++;
            }else if (a[mid] == 2){
                a[mid] = a[high];
                a[high] = 2;
                high--;
            }


        }



    }

    public static void  main(String[] args){

        int arr[]= {0 ,2, 1, 2, 0};
        sort012Efficient(arr, arr.length);

    }


}
