package Java_Classes;
class Demo2{
    int a,b;
    static int x,y;
    Demo2(){
        System.out.println("Demo's Constructor is excecuted");
    }
    static{
        System.out.println("Static Block is Executed");
    }
    {//Non static Block
        System.out.println("Non static Block is Executed");
    }
    void NonStaticDisp(){
        System.out.println("Non static Method is Executed");
    }
    static void staticDisp(){
        System.out.println("Static Method is Executed ");
    }
}
public class staticMethod {
    public static void main(String[] args) {
        Demo2 d1=new Demo2();
        d1.staticDisp();
        d1.NonStaticDisp();
    }
}
