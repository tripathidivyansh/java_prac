import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class stream {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("output.txt");
            FileOutputStream output = new FileOutputStream("Copy.txt");

            int data;
            while ((data = input.read()) != -1) {
                output.write(data);
            }

            input.close();
            output.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
