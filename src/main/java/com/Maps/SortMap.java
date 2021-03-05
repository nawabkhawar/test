package com.Maps;

import java.util.*;

public class SortMap {

    public static Map<String,String> sortMap(Map<String, String> map){
    Map<String, String> newTreeMap = new TreeMap<>(map);
        return newTreeMap;
    }
    public static Map<String,String> sortDescMap(Map<String, String> map){
        Map<String, String> newTreeMap = new TreeMap<String,String>(
                new Comparator<String>(){
                    @Override
                    public int compare(String o1, String o2){
                        return o2.compareTo(o1);

                }
        });
        newTreeMap.putAll(map);
        return newTreeMap;
    }


    public static void main(String args[]){
        Map<String, String> demoMap = new HashMap<>();
        demoMap.put("z","a");
        demoMap.put("d","a");
        demoMap.put("c","a");
        demoMap.put("r","a");
        demoMap.put("p","a");
        demoMap.put("o","a");
        demoMap.put("f","a");

        printTheMap(sortMap(demoMap));
        printTheMap(sortDescMap(demoMap));
    }

    public static void printTheMap(Map<String,String> printMap){
        for(Map.Entry<String,String> entry: printMap.entrySet()){
            System.out.println(entry);
        }
    }
}
