import java.util.Scanner;
public class primeNo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a no till prime no. print:");
        int num = input.nextInt();

        for (int i = 2; i < num; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }
}
