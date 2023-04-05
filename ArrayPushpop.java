class ja {
    final int i;
    ja(int j){
        //final variable can be initialized in the constructor; if it is static then it will be static block
        i = j;
    }
    public void display(){
        System.out.println("your current value " + i);
    }
}
public class ArrayPushpop {
    //push an array element inside the existing array.
    public final static void main(String args[]){
        final int i;
        i = 1;
        System.out.println("Hello world" + i);

    }
}
