import java.util.Scanner;
import java.io.*;

public class IO{
    public static void main(String[] args) {
        System.out.println("Input/Output Example");

        File file;
        Scanner scan;

        try{
            file = new File("data.csv");
            scan = new Scanner(file);

            while (scan.hasNextLine()){
                String line = scan.nextLine();
                System.out.println("The next line is " + line);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Done");
        }

        // throws -> some other code handles it, not my problem
        // try/catch -> we manage it ourselves

       
    }
}