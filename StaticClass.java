public class StaticClass {
    //declare static class
    public static String name = "7 class type ";
    public static class MyStatic{
        public void show(){
            System.out.println("static class method.");
            System.out.println(name);
        }
        public static void jewel(){
            System.out.println("Jewel");
        }
    }
    public class NonStatic {
        public void jewel(){
            System.out.println("Hi jewel from non static method");
        }
        public void show(){ 				//inherits static members from class MyStatic.show() and calls non-static members from class NonStatic.
            System.out.println("Non-static method.");
        }
        
    }
    public static void main(String[] args){
        StaticClass obj = new StaticClass();
        StaticClass.NonStatic nonStatic = obj.new NonStatic(); //Creating the nested class
        nonStatic.jewel();
        //Unable to create static class instance.
        StaticClass.MyStatic ob = new StaticClass.MyStatic();
        ob.show();
        ob.jewel();
        MyStatic.jewel(); //you can access by the class name
    }
}
