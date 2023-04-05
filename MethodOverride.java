class BaseMessage{
    public void print(int i){
        System.out.println("BaseMessage with integer value");
    }
    public void print(double i) {
        System.out.println("BaseMessage with double value" + i);
    }
}
class ChildMessage extends BaseMessage{
    @Override
    public void print(int i) {
      System.out.println("ChildMessage with no value" + i);  
    }
}
class MethodOverride{
    public static void main(String[] args) {
        ChildMessage obj = new ChildMessage();
        obj.print(10); //which method will be called it's completely depend on the 
                        //argument value type in java
        obj.print(10.0);
    }
}