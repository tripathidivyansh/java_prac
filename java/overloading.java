import java.util.Scanner;

class overloadin{
    int a, b, c;
    int sum;
    int add(int a, int b){
        sum = a + b; 
        return sum;
    }
    int add(int a, int b, int c){
        sum  = a + b + c;
        return sum;
    }
    // int add(a, double b){
    //     sum  = a + b;
    //     return sum;
    // }
    void display(){
        System.out.println("The sym is: " + sum);
    }
}
public class overloading{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        overloadin obj = new overloadin();
        obj.add(a, b);
        obj.display();

        obj.add(a, b, c);
        obj.display();

        // obj.ad(10, 10);
        // obj.display();
    }
}
