import java.util.Scanner;

class Car{
    String brand;
    int year;

    Car(String brand, int year){
        this.brand = brand;
        this.year = year;

    }
    void display(){
        System.out.println("brand: " + brand + " Year: " + year);
    }

}
public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand = sc.nextLine();
        int year = sc.nextInt();

        Car myCar = new Car(brand, year);
        myCar.display();
    }
}
