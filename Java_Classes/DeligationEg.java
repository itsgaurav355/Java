package Java_Classes;
class Knowledge
{
    Knowledge()
    {
        System.out.println("Employee Gained Knowledge");
    }
    void checkKnowledge()
    {
        System.out.println("Employee have Knowledge");
    }
}
class Property
{
    Property()
    {
        System.out.println("Property has been Created ");
    }
    void chcekProperty()
    {
        System.out.println("The Employee Have Property");
    }
}
class Employee
{
    int id;
    String name;
    Knowledge k= new Knowledge();
    Employee()
    {
    id=0;
    name=null;
    System.out.println("Employee is Created Without name and id ");

    }
    Employee(int i,String n)
    {
        id=i;
        name=n;
        System.out.println("Employee is Created");
    }
    void checkEmp()
    {
        System.out.println("The Employees are Working");
    }
    void carCheck(Car c)
    {
        System.out.println("Employee have a Car");
    }
    void propertyCheck(Property p)
    {
        System.out.println("Employee have property");
    }
}
class Person extends Employee{
    Heart h=new Heart();
    Brain b= new Brain();
    Person()
    {
        System.out.println("Person is Created With Heart and Brain");
    }
}
public class DeligationEg {
    public static void main(String[] args) {
        Employee e=new Employee();
        Car c=new Car();
        Property p=new Property();
        Person p1=new Person();
        p1.h.checkHeart();
        p1.b.checkBrain();
        e.k.checkKnowledge();
        e.carCheck(c);
        e.propertyCheck(p);
    }
}
