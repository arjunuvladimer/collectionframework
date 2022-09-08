package com.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapInterface {
    // Object that maps with key value pairs
    // Duplicate keys are not allowed

    // Exceptions
    // 1. Null Pointer Exception => null Object
    // 2. No Such Element => get an element which doesn't exist
    // 3. Class Cast Exception => object is incompatible
    // 4. Unsupported Operation => unmodifiable map

    // HashMap
    // Stores key and value pairs => keys should always unique
    public static void main(String args[]){
        HashMap<String, Integer> numbers = new HashMap<>();

        // Adding elements
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);
        numbers.put("Three",10);
        numbers.put(null,null);
        numbers.put(null,11);

        System.out.println("HashMap: " +numbers);

        // Access Keys
        System.out.println("Keys:" + numbers.keySet());

        // Access Values
        System.out.println("Values: "+ numbers.values());

        // Iterating the values
        Iterator itr = numbers.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry pair = (Map.Entry)itr.next();
            System.out.println(pair.getKey()+ "=>" + pair.getValue());
        }



        int returnedValue = numbers.merge("Three", 7, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("Values after Merged: " + returnedValue);
        System.out.println("Hashmap updated:" + numbers);

    }
}
