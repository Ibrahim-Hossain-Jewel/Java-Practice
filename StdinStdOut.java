import java.util.Scanner;

public class StdinStdOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your name is : " + name);
    }
}
