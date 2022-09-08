package com.collections;

import java.util.LinkedHashSet;

public class CollectionLinkedHashSet {
    public static void main(String args[]){
        // Order of elements
        // Doubly Linked List across all elements
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Michael");

        lhs.add("Steffi");
        lhs.add("Arjun");
        lhs.add("Michael");

        System.out.println(lhs);
    }
}
