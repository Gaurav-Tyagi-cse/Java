import java.util.Scanner;

public class Reverse_and_Original_number_are_equal_or_not {
public static void main(String[] args) {
    int rev=0;
    Scanner ac= new Scanner(System.in);
    System.out.print("Enter any value:");
    int n = ac.nextInt();
    int Orignial=n;
    while (n!=0) {
        rev=rev*10+n%10;
        n=n/10;
    }
    if(rev!=Orignial)
      System.out.print("Your Reverse Value are not Equale to Orignial Value:");
    else
        System.out.print("Your Reverse Value are Equale to Orignial Value:");
}
}