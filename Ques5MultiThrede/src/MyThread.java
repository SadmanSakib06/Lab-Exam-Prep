import java.io.File;
import java.util.Scanner;

public class MyThread extends Thread{
    private String fileName;
    private String hasToFind;
    public MyThread(String fileName, String hasToFind){
        this.fileName = fileName;
        this.hasToFind = hasToFind;
    }

    public void run(){
        try{
            Scanner scanner = new Scanner(new File(fileName));
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                if(line.contains(hasToFind)){
                    System.out.println(fileName + ": " + line);
                }
            }
            scanner.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
