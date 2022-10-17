package com.revature.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
        // Use generic with Diamond operator <> to use only a certain datatype
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(10);
        myList.add(20);
        myList.add(35);
        myList.add(45);

        for(int i=0;i<myList.size();i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("*********************************");

        for (Integer element:myList)
        {
            System.out.println(element + " * 2 = " + element*2);
        }

        System.out.println("*********************************");

        Iterator itr = myList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
