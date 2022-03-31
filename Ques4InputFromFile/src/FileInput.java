import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");
        Scanner reader = new Scanner(file);
        PrintWriter writer = new PrintWriter("output.txt");
        int lineNumber = 1;

        while (reader.hasNextLine()){
            String eachLine = reader.nextLine();
            writer.write("/*" + lineNumber + "*/ " + eachLine + "\n");
            lineNumber = lineNumber + 1;
        }
        reader.close();
        writer.close();
    }
}
