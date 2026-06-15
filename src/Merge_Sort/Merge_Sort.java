package Merge_Sort;

public class Merge_Sort {
    public static void main (String[] args) {
        int[] arr = {8, 2, 9, 4, 5};
        System.out.print("Before Merge Sort: ");
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        merge_sort(arr);
        System.out.print("After Merge Sort: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void merge_sort(int[] arr){
        //base case of length 0 or 1
        if(arr.length <= 1) return;

        //divide
        int mid = arr.length/2;
        int [] Left_arr = new int[mid];
        int [] Right_arr = new int[arr.length - mid];

        //assgin value
        int temp = 0;
        for(int i = 0; i < Left_arr.length; i++){
            Left_arr[i] = arr[i];
        }
        for(int i = mid; i < arr.length; i++){
            Right_arr[temp] = arr[i];
            temp++;
        }

        //conquer
        merge_sort(Left_arr);
        merge_sort(Right_arr);

        Merge(arr, Left_arr, Right_arr);
    }
    public static void Merge(int[] arr, int[] Left_arr ,int[] Right_arr){
        int LeftLength = Left_arr.length;
        int RightLength = Right_arr.length;

        //compare
        int i = 0; int j = 0 ; int k = 0;
        while(i < LeftLength && j < RightLength){
            if(Left_arr[i] <= Right_arr[j]){
                arr[k] = Left_arr[i];
                i++;
                k++;
            }else{
                arr[k] = Right_arr[j];
                j++;
                k++;
            }
        }

        //remaining after complete of any array
        while(j < Right_arr.length){
            arr[k] = Right_arr[j];
            j++;
            k++;
        }
        while(i < LeftLength){
            arr[k] = Left_arr[i];
            i++;
            k++;
        }
    }
}

