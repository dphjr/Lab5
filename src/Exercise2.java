import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        try {
            File file = new File("userStrings.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            String line = " ";
            while(!line.equals("DONE")) {
                Scanner input = new Scanner(System.in);
                System.out.print("Please type anything: ");
                line = input.nextLine();
                if (line.equals("DONE")){
                    fileWriter.close();
                }
                printWriter.println(line);
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}