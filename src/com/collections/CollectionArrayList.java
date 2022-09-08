package com.collections;
import java.util.*;

public class CollectionArrayList {
    public static void main(String[] args){
        
        // al Object of Class ArrayList
        ArrayList al = new ArrayList();
        // Appending/Adding to the Array List
        al.add("Arjun");
        al.add("Michael");
        al.add("Steffi");
        al.add(1,"Jack");

        //Interface itr = al.iterator()
        Iterator itr = al.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
