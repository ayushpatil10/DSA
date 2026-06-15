import java.util.Scanner;
public class GCF {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number 1:");
        int num1 = input.nextInt();
        System.out.print("Enter a Number 2:");
        int num2 = input.nextInt();
        int i = Math.min(num1,num2);
        System.out.print("The HCF/GCF :"+ gcf(num1, num2, i));
    }
    private static int gcf(int num1 , int num2, int i){
        if(num1 % i == 0 && num2 % i == 0) return i;
        return gcf(num1, num2, i-1);
    }
}
