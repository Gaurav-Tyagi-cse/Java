import java.util.Scanner;


public class LeapYear {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter any year");
        int year = ac.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0 && year%100!=0){
            System.out.println("This year is leap year:"+  year);
        }
        else{
            System.out.println("This year is not leap year:" + year);
        }
    }
}
