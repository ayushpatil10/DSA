package Merge_Sort;

import java.util.Scanner;

public class playwithMagic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num:");
        int num = input.nextInt();
        Square_1tonum(num);
    }
    private static void Square_1tonum(int num){
        if(num <= 1) return;
        num--;
        Square_1tonum(num);
        Print(num);
    }
    private static void Print(int num){
        System.out.println(num+" * "+num+" = "+(num*num));
    }
}
