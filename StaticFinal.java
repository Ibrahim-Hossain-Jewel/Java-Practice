class ja {
    final int i;
    ja(int j) {
        i = j;
    }
    public void display() {
        System.out.println("your final variable value are here " + i);
    }
}

public class StaticFinal {
    // push an array element inside the existing array.
    public final static void main(String args[]) {
        final int i;
        i = 1;
        System.out.println("initialized your final variable after one step" + i);

        ja obj = new ja(i);
        obj.display();
    }
}
