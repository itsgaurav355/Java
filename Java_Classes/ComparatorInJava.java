package Java_Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer2{
    private String name;
    private int wickets;
    private int runs;
    private float avgEconomy;

    public String getName() {
        return name;
    }

    public int getWickets() {
        return wickets;
    }

    public int getRuns() {
        return runs;
    }

    public float getAvgEconomy() {
        return avgEconomy;
    }
    Cricketer2(String name,int wickets,int runs,float abgEconomy){
        this.name=name;
        this.wickets=wickets;
        this.runs=runs;
        this.avgEconomy=abgEconomy;
    }
    public String toString(){
        return "Cricketer [name="+name+",wickets="+wickets+",avgEconomy="+avgEconomy+", runs="+runs+"]";
    }
}
class SortingSample implements Comparator<Cricketer2>{
    @Override
    public int compare(Cricketer2 o1, Cricketer2 o2) {
        //for runs
    /*    if(o1.getRuns()>o2.getRuns()){
            //Swapping will occur if this is true
            return 1;

        }else if(o1.getRuns()<o2.getRuns()){
            //nothing
            return -1;
        }else{
            //nothing
            return 0;

     */
        //for String
        return o1.getName().compareTo(o2.getName());



    }
}
public class ComparatorInJava {
    public static void main(String[] args) {
        ArrayList<Cricketer2> a=new ArrayList<Cricketer2>();
        Cricketer2 c1=new Cricketer2("Sachin ",100,15000,153.78f);
        Cricketer2 c2=new Cricketer2("Dhoni ",50,10000,173.85f);
        Cricketer2 c3=new Cricketer2("Sewagh ",105,8000,163.58f);
        a.add(c1);
        a.add(c2);
        a.add(c3);
        System.out.println("Before Sorting : ");
        for(Cricketer2 c: a){
            System.out.println(c);
        }
        System.out.println("After Sorting: ");
        Collections.sort(a,new SortingSample());
        for(Cricketer2 c: a){
            System.out.println(c);
        }
    }
}
