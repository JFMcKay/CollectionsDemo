package com.revature.collection.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Double> empMap=new HashMap<>();
        empMap.put("Anwar",new Double(2000));
        empMap.put("Oleg",new Double(2050));
        empMap.put("DavidM",new Double(2100));
        empMap.put("David",new Double(2222));

        System.out.println(empMap+"\n");
        System.out.println("Anwar is getting paid! Dolla dolla bills y'all = " +empMap.get("Anwar"));

        Set<String> empKeys= empMap.keySet();

        for (String element:empKeys) {
            System.out.println(element+ " - " + empMap.get(element));
        }
        empMap.remove("David");
        System.out.println(empMap);

        empMap.replace("Oleg", 2150d);

        System.out.println("Oleg gotta raise yo! Dolla dolla bills y'all = " +empMap.get("Oleg"));
    }
}
