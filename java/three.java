import java.util.Scanner;

enum PLANET{
    EARTH(9.8, "3.2  * 24") , MARS(3.4, "1.2 * 89"), JUPITER(5.4, "1.1 * 39");
    double gravity;
    String mass;

    PLANET(double  gravity, String mass) {
        this.gravity = gravity;
        this.mass= mass;
    }
}
public class three{
    public static  void printPlannet(PLANET planet){
        if(planet == PLANET.EARTH){
            System.out.println("planet " + planet);
            System.out.println("planet " + planet.mass);
            System.out.println("planet " + planet.gravity);
        }else if(planet == PLANET.JUPITER){
            System.out.println("planet " + planet);
            System.out.println("planet " + planet.mass);
            System.out.println("planet " + planet.gravity);
        }
        else if(planet == PLANET.MARS){
            System.out.println("planet" + planet);
            System.out.println("planet" + planet.mass);
            System.out.println("planet" + planet.gravity);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        PLANET planet = PLANET.valueOf(input);
        printPlannet(planet); 
        sc.close();
    }
}