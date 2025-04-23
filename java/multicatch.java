public class multicatch {
    public static void main(String[] args) {
        try{
            int result = 10/0;
            int arr[] = new int[5];
            arr[5] = 10;
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("The error is" + e);
        } 
    }
}
