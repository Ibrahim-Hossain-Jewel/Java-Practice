import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
    //FileWrite
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("bbc.txt");    
        fos.write(333); //write a byte to the file (interpreted as an integer)
        fos.close();
    }
    
}
