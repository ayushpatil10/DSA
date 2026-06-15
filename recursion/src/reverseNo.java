import java.util.Scanner;
public class reverseNo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = 0;
        int num = input.nextInt();
        System.out.print("Reverse of number:"+ reverse(num,n));
    }
    public static int reverse(int num, int n){
        if(num == 0) return n;
        n = (num % 10) + (n * 10);
        return reverse(num/10,n);
    }
}