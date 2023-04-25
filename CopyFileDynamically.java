import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFileDynamically {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner scnr = new Scanner(System.in);
        String fileInput = scnr.nextLine();
        Scanner scnr2 = new Scanner(System.in);
        String fileDestination = scnr2.nextLine();
        FileInputStream fis = new FileInputStream(fileInput); //Input exsiting file.
        FileOutputStream fos = new FileOutputStream(fileDestination);
        int data;
        while((data = fis.read()) != -1){
            fos.write((char)data);
        }
    }
}
