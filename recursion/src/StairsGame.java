// Nth Stairs game 1 or 2 steps can taken count all possible ways to reach at Nth no. of stairs.
import java.util.Scanner;
public class StairsGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Nth stairs :");
        int n = input.nextInt();
        System.out.print("No. of ways to reach Nth stairs is:"+ stairs(n));
    }
    public static int stairs(int n){
        if(n == 0 || n ==1) return 1;
        return stairs(n-1) + stairs(n-2) ;
    }
}
