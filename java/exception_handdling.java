
public class exception_handdling{
    public static void main(String[] args) {
        try {
            int result = 10/0;
        } catch (Exception e) {
           System.out.println("This is not valid");
        }finally{
            System.out.println("run the next dayS");
        }
    }
}