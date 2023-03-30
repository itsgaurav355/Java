package Java_Classes;
class Demo1{
    int a,b;
    static int x,y;
    Demo1(){
        System.out.println("Demo's Constructor is excecuted");
    }
    static{
        System.out.println("Static Block is Executed");
    }
    {//Non static Block
        System.out.println("Non static Block is Executed");
    }
}

public class BlocksInJava {
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
    }
}
