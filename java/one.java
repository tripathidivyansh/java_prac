import java.util.Scanner;

enum Day{
    Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Saunday
}
public class one{
    public static void printfun(Day day){
        if(day == Day.Monday){
            System.out.println("Its a Monday     " + day);
        }
    }
    public static void main(String[] args){
        // scanner sc = new int(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you day");
        String dayInput = sc.nextLine();

        Day day = Day.valueOf(dayInput);

        printfun(day);
        sc.close();

    }   
    
}