package Java_Classes;
//How Static works and accessibility of static variable
class Demo3{
    int a,b;
    static int x,y;
    static{
        x=10;
        y=20;
    }
    {
        x=999;
        y=888;
    }
    void nonStaticDisp(){
        System.out.println(x);
        System.out.println(y);
    }
    static void staticDisp(){
        System.out.println(x);
        System.out.println(y);
    }
}
public class AccessStatic {
    public static void main(String[] args) {
    Demo3 d1=new Demo3();
    d1.nonStaticDisp();
    d1.nonStaticDisp();
    }
}
