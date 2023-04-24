import java.io.*;
public class FileRead {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("abc.txt");
        // Without dynamic read file data.
        // int data1 = fis.read();
        // int data2 = fis.read();
        // int data3 = fis.read();
        // System.out.println("Data1 : " + (char)data1);
        // System.out.println("Data2 : " + (char) data2);
        // System.out.println("Data3 : " + data3); 
        // FileInputStream returns byte by byte data.
        System.out.println("Dynamic file data read");
        int all;
        while((all = fis.read()) != -1){ //You can assign value with while loop.
            System.out.println(all);
        }
        fis.close();
    }
}
