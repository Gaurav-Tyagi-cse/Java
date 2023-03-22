public class SumOfArray {
    public static void main(String[] args) {
        int arr[] = {1,5,3};
        int m=0;
        for (int index = 0; index < arr.length; index++) {
           m = arr[index]+ m; 
        }
        System.out.println(m);
    }
}
