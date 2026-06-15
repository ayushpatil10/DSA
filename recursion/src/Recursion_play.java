import java.util.Scanner;
public class Recursion_play {
    public static int k = 1;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Wlc to table write by Recursion");
        System.out.print("Enter the Number:");
        int Num = input.nextInt();
        int i = 1;
        lessCount(Num,i);
    }
    public static void  lessCount(int number, int i){
        if( i > number) return;
        lessCount(number, i+1);
        System.out.println(k+ " = "+ number *k);
        k++;
    }
}
