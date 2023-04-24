import java.io.*;
public class FileRead {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("abc.txt");
        int data1 = fis.read();
        int data2 = fis.read();
        int data3 = fis.read();
        System.out.println("Data1 : " + (char)data1);
        System.out.println("Data2 : " + (char) data2);
        System.out.println("Data3 : " + (char)data3);
    }
}
