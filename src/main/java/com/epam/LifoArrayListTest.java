package com.epam;

import java.util.Iterator;

public class LifoArrayListTest {
    public static void main(String[] args) {
        LifoArrayList<String> lifo = new LifoArrayList<String>();

        lifo.add("first");
        lifo.add("second");
        lifo.add("third");
        lifo.add("fourth");

        Iterator iterator = lifo.iterator();

        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);
        }
    }
}
