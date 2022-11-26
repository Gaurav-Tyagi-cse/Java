public class RecursionDemo {

    static void printNumber(int num){
        if(num==0)
        {
            return ;
        }
        
        printNumber(num-1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        //System.out.println("I am Recursion");
        //main(null);
printNumber(5);
    }
}
