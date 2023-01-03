package com.uniyaz.linkindlistvsArraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ComparisonArrayListLinkindList {

    static Random rand = new Random();

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        LinkedList<String> linkedList = new LinkedList<String>();


        long firstTime = System.currentTimeMillis();
        for (Integer i = 0; i <= 1000000; i++) {
            arrayList.add(i.toString());
        }
        long lastTime = System.currentTimeMillis();

        System.out.println("Add operation time ArrayList : " + (lastTime - firstTime));


        firstTime = System.currentTimeMillis();
        for (Integer i = 0; i <= 1000000; i++) {
            linkedList.add(i.toString());
        }
        lastTime = System.currentTimeMillis();

        System.out.println("Add operation time LinknedList : " + (lastTime - firstTime));

        firstTime = System.currentTimeMillis();
        for (Integer i = 0; i < 10; i++) {

            arrayList.remove(i * 1000);
        }
        lastTime = System.currentTimeMillis();
        System.out.println("Remove operation time ArrayList : " + (lastTime - firstTime));


        firstTime = System.currentTimeMillis();
        for (Integer i = 0; i < 10; i++) {

            linkedList.remove(i * 1000);
        }
        lastTime = System.currentTimeMillis();
        System.out.println("Remove operation time LinkindList : " + (lastTime - firstTime));


        firstTime = System.currentTimeMillis();
        for (Integer i = 1; i < 10; i++) {

            arrayList.get(i * 1000);
        }
        lastTime = System.currentTimeMillis();
        System.out.println("Acces operation time ArrayList : " + (lastTime - firstTime));


        firstTime = System.currentTimeMillis();
        for (Integer i = 1; i < 10; i++) {

            linkedList.get(i * 1000);
        }
        lastTime = System.currentTimeMillis();
        System.out.println("Acces operation time LinkindList : " + (lastTime - firstTime));


    }
}
