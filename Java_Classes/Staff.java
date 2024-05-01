package com.Java_Classes;
 class Staff1{
    String name;
    int id;
     public Staff1(String name , int id){
         this.name = name;
         this.id = id;
         System.out.println("Staff Class Created");
     }
     void display(){
         System.out.println("Staff name : "+ this.name + "\nId : "+ this.id);
     }
}
class Teacher extends Staff1{
     String subject;
     public Teacher(String name, int id ,String subject){
         super(name,id);
         this.subject = subject;
         System.out.println("Teacher Object Created");
     }

    void display(){
        System.out.println("Teacher name : "+ this.name + "\nId : "+ this.id + "\nSub: "+ this.subject);
    }

}
class Officer extends Staff1{
    String grade;
    public Officer(String name , int id, String grade){
        super(name,id);
        this.grade = grade;
        System.out.println("Officer object it is");
    }
    void display(){
        System.out.println("Officer name : "+ this.name + "\nId : "+ this.id + "\nGrade: "+ this.grade);
    }
}

class Typist extends Staff1{
     int speed;
     public Typist(String name , int id, int speed){
         super(name,id);
         this.speed  = speed;
         System.out.println("Typist object it is");
     }
}

class Regular extends Typist{
     public Regular(String name , int id , int speed){
         super(name,id,speed);
     }
    void display(){
        System.out.println("Regular Typist name : "+ this.name + "\nId : "+ this.id + "\nSpeed: "+ this.speed  + "wpm");
    }
}
class Casual extends Typist{
    public Casual(String name , int id , int speed){
        super(name,id,speed);
    }
    void display(){
        System.out.println("Casual Typist name : "+ this.name + "\nId : "+ this.id + "\nSpeed: "+ this.speed  + "wpm");
    }
}
public class Staff {

}
