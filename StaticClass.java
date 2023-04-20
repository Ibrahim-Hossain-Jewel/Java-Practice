public class StaticClass {
    //declare static class
    public static String name = "7 class type ";
    public static class MyStatic{
        public void show(){
            System.out.println("Non-static method.");
            System.out.println(name);
        }
        public static void jewel(){
            System.out.println("Jewel");
        }
    }
    public static void main(String[] args){
        //unable to create static class instance.
        StaticClass.MyStatic ob = new StaticClass.MyStatic();
        ob.show();
        ob.jewel();
        MyStatic.jewel(); //you can access by the class name
    }
}
