import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream fin = new FileInputStream("bbc.txt"); //Inject the file to my app.
        FileOutputStream fos = new FileOutputStream("abc.txt"); //Send data to the file system.
        int allData;
        while((allData = fin.read())!= -1){
            fos.write((char)allData);
        }
        fin.close();
    }
}
