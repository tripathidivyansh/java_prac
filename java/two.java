import java.util.*;

enum LEVEL{
    BEGINNER, INTERMIDIATE, EXPERT
}
public class two {
    public static void printLevel(LEVEL level){
        if(level == LEVEL.BEGINNER){
            System.out.println("Yor are BEGiNNER  " + level);
        }else if(level == LEVEL.INTERMIDIATE){
            System.out.println("Yor are  INTERMIDIATE" + level);
        }else if(level == LEVEL.EXPERT){
            System.out.println("Yor are EXPERT  " + level);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();

        LEVEL level = LEVEL.valueOf(input); // string to enum conversion 

        printLevel(level);
        sc.close();
    }
}
