public class Maximum_Value_Array {
    public static void main(String[] args) {
        int arr[] = {5,2,4,8,4,9};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            {
                if(max < arr[i])
                {
                max = arr[i];
                }
                

            }
            
        }
        System.out.println(max);

    }
}
