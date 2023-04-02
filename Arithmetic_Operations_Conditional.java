import java.util.Scanner;
public class Arithmetic_Operations_Conditional {
    public static void main(String[] args){
        int result;
        try (Scanner ac = new Scanner(System.in)) {
            System.out.print("Enter any number:");
            int n1=ac.nextInt();
            System.out.print("Enter Second number:");
            int n2=ac.nextInt();
            System.out.print("Enter any on operator:");
            String n3=ac.next();

            if (n3 == "*") {
             result=n1*n2;
             System.out.print(result);

            }
            else if(n3.equals("+")){
                result = n1+n2;
                System.out.print(result);

            }
            else if(n3.equals("-")){
                result = n1-n2;
                System.out.print(result);

            }
            else if(n3.equals("/"))
            {
                result = n1/n2;
                System.out.print(result);

            }
            else if(n3.equals("%"))
            {
                result = n1%n2;
                System.out.print(result);

            }
            else if(n3.equals("}"))
            System.out.print("Your operator invalid:");
            else if(n3.equals(")"))
            System.out.print("Your operator invalid:");
            else if(n3.equals("("))
            System.out.print("Your operator invalid:");
            else if(n3.equals("="))
            System.out.print("Your operator invalid:");
        }

    }
}
 