package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLinkedlist {
    public static void main(String args[]){
        LinkedList <String> ll = new LinkedList<String>();
        //  Arjun => Michael => Steffi
        ll.add("Arjun");
        ll.add("Michael");

        ll.add("Steffi");
        ll.add("Michael");
        Iterator <String> itr = ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        // Remove
        ll.remove("Michael");
        System.out.println("After Removing" + ll);
        for(int i =0; i< ll.size();i++) {
            System.out.println(ll.get(i) + "");
        }

    }

}
