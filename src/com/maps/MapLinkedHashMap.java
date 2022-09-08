package com.maps;

import java.util.LinkedHashMap;

public class MapLinkedHashMap {
    public static void main(String[] args){
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("One", 1);
        lhm.put("Two", 2);
        lhm.put("Three", 3);
        lhm.put("Four", 4);
        lhm.put("Five", 5);
        lhm.put("Three",10);
        lhm.put(null,null);
        lhm.put(null,11);
        System.out.println("Map" + lhm);

        // KEYS
        System.out.println("Keys: "+ lhm.keySet());

        // Values
        System.out.println("Values" + lhm.values());

        // Entries
        System.out.println("Entries: " + lhm.entrySet());
    }
}

