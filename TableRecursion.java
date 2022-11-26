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
        table(5,1);
        }
    }
