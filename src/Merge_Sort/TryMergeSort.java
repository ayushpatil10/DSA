package Merge_Sort;
import java.util.Scanner;
public class TryMergeSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = input.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the "+(i+1)+":");
            arr[i] = input.nextInt();
        }
        System.out.print("The given Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        divide(arr);
        System.out.println();
        System.out.print("The Merge sort array:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void divide(int[] arr){
        if(arr.length <= 1) return; // 1<1 false infinit loop 1-2,1-2...!
        int[] leftarr = new int[arr.length/2]; //mid
        int[] rightarr = new int[arr.length - arr.length/2];  //length-mid = remaining
        int temp = 0;

        for(int i = 0; i < leftarr.length; i++){
            leftarr[i] = arr[i];
        }
        for(int i = leftarr.length; i < arr.length; i++){
            rightarr[temp] = arr[i];
            temp++;
        }
        divide(leftarr);
        divide(rightarr);
        merge(leftarr, rightarr, arr);
    }
    public static void merge(int[] leftarr, int[] rightarr, int[] arr){
        //compare
        int left_i=0;int right_j=0;int arr_k=0;
        int leftlength = leftarr.length;
        int rightlength = rightarr.length;
        while(leftlength > left_i && rightlength > right_j){
            if(leftarr[left_i] > rightarr[right_j]){
                arr[arr_k] = rightarr[right_j];
                arr_k++;
                right_j++;
            }else{
                arr[arr_k] = leftarr[left_i];
                arr_k++;
                left_i++;
            }
        }
        //remaining
        while(left_i < leftlength){
            arr[arr_k] = leftarr[left_i];
            arr_k++;
            left_i++;
        }
        while(right_j < rightlength){
            arr[arr_k] = rightarr[right_j];
            right_j++;
            arr_k++;
        }
    }
}
