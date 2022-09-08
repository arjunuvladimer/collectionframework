package com.collections;

import java.util.Hashtable;

public class CollectionHashTable {
    public static void main(String args[]){
        Hashtable<Integer, String> hash1 = new Hashtable<>();


        hash1.put(1,"A");
        hash1.put(2,"R");
        hash1.put(3,"J");
        hash1.put(null,"");
        hash1.put(5,"N");

        System.out.println(hash1);
    }
}
