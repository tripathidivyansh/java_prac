import java.io.*;

public class read_write_one {

    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("output.txt");
        writer.write("This is my file writer");
        
        writer.close();
        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String line = reader.readLine();

        if(line.equals(line)){
            System.out.println("itS working file");
        }
        if(line.startsWith("This")){
            System.out.println("welcome to malik era");
        }
        System.out.println(line);
        reader.close();
        
    }
    
}