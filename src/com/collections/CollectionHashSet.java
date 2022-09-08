package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionHashSet {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<>();

        // Allows null Values
        // Doesn't allow duplicates
        // Iteration Order of the set is not guaranteed
        // Constant time performance (add, remove, contains and size)

        hs.add("Michael");

        hs.add("Steffi");
        hs.add("Michael");
        hs.add(null);
        hs.add(null);
        hs.add(null);

        System.out.println(hs);



    }
}
