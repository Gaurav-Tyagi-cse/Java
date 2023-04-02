
import java.util.Scanner;

public class Reverse_a_4_digit_number {
   public static void main(String[] args){
    try (Scanner in = new Scanner(System.in)) {
        System.out.print("Enter any four number");
        int n = in.nextInt();
        int rev = 0;
        while(n!=0){
            rev = rev*10+n%10;
            n= n/10;
        }
        System.out.print(rev);
    }
   }
}
