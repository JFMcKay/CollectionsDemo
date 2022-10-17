package com.revature.collection.demo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    // Sets do not allow duplicates but do not throw and error it just ignores it
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();

        mySet.add(11);
        mySet.add(22);
        mySet.add(44);
        mySet.add(33);
        mySet.add(11);
        for(Integer element:mySet) {
            System.out.println(element);
        }
    }
}
