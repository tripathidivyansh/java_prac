public class throw_thorws {
    static void chackage(int age) throws Exception{
        if(age < 18){
            throw new Exception("underage");
        }else{
            System.out.println("Allowed");
        }
    }
    public static void main(String[] args) {
        try {
            chackage(20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


