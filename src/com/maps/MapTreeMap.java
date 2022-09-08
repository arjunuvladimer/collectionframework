package com.maps;

import java.util.TreeMap;

public class MapTreeMap {
    public static void main(String[] args){
        TreeMap<String, Integer> tm = new TreeMap<>();
        // Adding Elements
        tm.put("Second",2);
        tm.put("Third",3);
        tm.put("First",1);
        tm.put("Fourth",4);
        tm.put("Five",5);
        tm.put(null,null);

        System.out.println("Map using Tree Map:" + tm);


    }
}
