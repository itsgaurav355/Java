package Java_Classes;
import java.util.Scanner;
 class Student
 {
  String name;
  int age;
  float Height;
  Student()
  {
      name="Unknown";
  }
  Student(String n,int a,float h)
  {
      name=n;
      age=a;
      Height=h;

  }
 }
public class Constructor {
    public static void main(String[] args) {
        Student s1=new Student("Gaurav",15,5.5f);
        Student s2=new Student();
        System.out.println(s1.name +"\n"+s1.age+"\n"+s1.Height);
        System.out.println(s2.name);
    }
}




/*
class Student{
    //Once void is declared for student it is no more be a constructor It becomes Method
    void Student(){
        System.out.println("I am Inside the Constructor ");
    }
    void disp(){
        System.out.println("I am Inside the Display ");
    }
}
public class Constructor {
    public static void main(String[] args) {
    Student s=new Student();
    s.disp();
    s.Student();
    }
}
*/