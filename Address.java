

public class Address {
    String state;
    String country;
    String city;
    public Address(String state, String country, String city){
        this.state = state;
        this.country = country;
        this.city = city;
    }
    void display(){
        System.out.println("State : " + state + " City : " + city + "Country : " + country);
    }
}
