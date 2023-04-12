import java.util.Properties;
import java.util.Set;

public class PropertyClass {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        Set states;
        String str;
        capitals.put("UK", "London"); // ISO 3166-1 alpha-2 code for UK is "UK"
        capitals.put("US", "New York"); // ISO 3166-1 alpha-2 code for US is "US"
        capitals.put("Rashia", "Moskow");
        capitals.put("Ukrain", "Ceave");
        capitals.put("BD", "Dhaka"); //Object key Object value
        states = capitals.keySet(); // Returns Set of keys (states) in this Properties object.
        for (Object state : states) { // Iterates through the keys (states) in this Properties object.
            System.out.println(state);
        }

    }
}
