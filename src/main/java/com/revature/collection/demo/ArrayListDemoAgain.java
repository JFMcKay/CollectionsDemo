package com.revature.collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemoAgain {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();

        myList.add("Waleed");
        myList.add("Thomas");
        myList.add("MD");
        myList.add("Matthew");

        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);
        Collections.reverse(myList);
        System.out.println(myList);
    }
}
