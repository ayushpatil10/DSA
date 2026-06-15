//You sort the array first
//the array becomes:[1 1 2 3 3]
//Now all original index information is lost.
//Reverse pairs depend on the original positions (i < j), so counting after completely sorting the array is incorrect.

public class Wrong_solutionNT_493 {
    public static int count;
    public static void main(String[] args){
        int[] nums = {1,3,2,3,1};
        int[] M_arr= reversePairs(nums);
        myTechnique(M_arr);
        print(M_arr);
    }
    public static void myTechnique(int[] M_arr){
        int i = 0; int j = 1;count = 0;
        while(j < M_arr.length){
            if(i == j) j++;
            if (M_arr[i] > 2 * M_arr[j]) {
                count = (M_arr.length - j) + count;
                i++;
            }else j++;
        }
    }

    public static void print(int[] M_arr){
        for (int i = 0; i < M_arr.length; i++) {
            System.out.print(M_arr[i]+ " ");
        }
        System.out.println();
        System.out.print("Count --> "+ count);
    }
    public static int[] reversePairs(int[] nums) {
        merge_sort(nums);
        return nums;
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
