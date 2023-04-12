import java.util.Random;
import java.util.UUID;
public class RandomClass {
    //Stream api for collection or object.
    public static void main(String[] args) {
        System.out.println("StringBuilder");
        //Represents an UUID
        UUID uuid = UUID.randomUUID();
        System.out.println(UUID.randomUUID()); //randomUUID() is a static method.
        //create 6 digit random number
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        System.out.println("Your 6 digit number : " + number);
    }
}
