import java.util.Scanner;

public class Character_is_Upper_case_or_Lower_case {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter any Character:");
        char v= ac.next().charAt(0);
        if(v>='a' && v<='z'){
            System.out.print("Lower");
        }
        else
        System.out.println("Upper");
    }
}
