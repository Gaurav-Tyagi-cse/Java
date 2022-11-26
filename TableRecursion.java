//This program  table useing recursion


import java.util.Scanner;
public class TableRecursion {
    static void table(int num,int count){
        //Termination case
        if (count==11) {
            return;
        }
        int a=num*count;
        System.out.println(num+ "*" +count+ "=="+a);
        count = count + 1;
        table(num, count);//resursion
    
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter table no");
            int num= sc.nextInt();
            table(num,1);
        }
        }
    }
