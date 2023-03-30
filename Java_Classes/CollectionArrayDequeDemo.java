package Java_Classes;

import java.util.ArrayDeque;
import java.util.Iterator;
//Deleted from frontend and added from rear end for normal queue
public class CollectionArrayDequeDemo {
    public static void main(String[] args) throws InterruptedException {
        ArrayDeque<Object> a=new ArrayDeque<Object>();
        a.add(10);
        a.add(20);
        a.addFirst("Java");
        a.addLast(30);
        a.add(46);
        System.out.println(a);
        System.out.println(a.getFirst());
//        for(Object i: a){
//            System.out.print(i+"-->");
//        }
//        System.out.println("null");
        Iterator itr= a.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        while(!a.isEmpty()){
            a.remove();
            System.out.println(a);
            Thread.sleep(2000);
        }

    }
}
