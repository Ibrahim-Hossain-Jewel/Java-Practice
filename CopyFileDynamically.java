import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDynamically {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream(args[0]); //Input exsiting file.
        FileOutputStream fos = new FileOutputStream(args[1]);
        int data;
        while((data = fis.read()) != -1){
            fos.write((char)data);
        }
    }
}
