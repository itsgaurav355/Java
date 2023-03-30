package Java_Classes;
interface Compute
{
void add();
void sub();
}
class Addition implements Compute
{
public void add()
{
    int a=10,b=20,c;
    c=a+b;
    System.out.println("The addition is : "+c);
}
public void sub()
{
    int a=10,b=20,c;
    c=a-b;
    System.out.println("The Subtraction is : "+c);
}
void mul()
{
    int a=5,b=7,c;
    c=a*b;
    System.out.println("the multiplication of two number is : "+ c);
}
}
public class interfacesInJava {
    public static void main(String[] args) {
        Addition a=new Addition();
        Compute ptr;
        ptr=a;
        ptr.add();
        ptr.sub();
        ((Addition)(ptr)).mul();//DownCasting
    }
}
