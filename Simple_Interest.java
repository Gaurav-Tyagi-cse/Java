import java.util.Scanner;

public class Simple_Interest {

    public static void main(String[] args) {
       try (Scanner ac = new Scanner(System.in)) {
        System.out.println("Enter Principle Value:");
           double p = ac.nextDouble();
           System.out.println("Enter Rate value");
           double r = ac.nextDouble();
           System.out.println("Enter Time");
           double t = ac.nextDouble();
           double result=p*r*t/100;
           System.out.println("Total interest"+result);
           double total = result+p;
           System.out.print("total cost with interest "+total);
    }
    }
}
