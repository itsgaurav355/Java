package Java_Classes;

public class StringsDemo {
    public static void main(String[] args) {
        String name1= new String("Hello");
        String name2= new String("Hello");
        boolean flag= name1==name2;
        //Here we are comparing the addresses of the String Both the strings are pointing to
        //different Strings in non-constant pool that is Hello it means both variable contains the different addresses
        System.out.println(flag);
    }
}
