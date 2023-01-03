package com.uniyaz.collection;

import java.util.*;

public class TreeSetCollectionMain {
    public static void main(String[] args) {


        System.out.println("Treee Settt");

        SortedSet<String> ts
                = new TreeSet<String>();


        ts.add("B");
        ts.add("A");
        ts.add("C");
        ts.add("A");

        System.out.println("Ben a dan z ye sıralarım :):");
        System.out.println(ts);
        System.out.println("--------------------------");
        SortedSet<Integer> rakam
                = new TreeSet<Integer>();


        rakam.add(8);
        rakam.add(3);
        rakam.add(2);
        rakam.add(1);
        rakam.add(9);

        System.out.println("Ben 1 den 9 a kadar sıralarım:");
        System.out.println(rakam);
        System.out.println("--------------------------");

        SortedSet<String> tss
                = new TreeSet<String>();


        tss.add("A");
        tss.add("B");
        tss.add("C");
        tss.add("A");

        System.out.println("Tree Set elamanlarrı " + tss);

        String check = "D";


        System.out.println("içeriri mi " + check
                + " " + tss.contains(check));


        System.out.println("İlk Değer " + tss.first());


        System.out.println("Son Değer " + tss.last());

        System.out.println("--------------------------");


        SortedSet<String> ts1
                = new TreeSet<String>();

        // Elements are added using add() method
        ts1.add("A");
        ts1.add("B");
        ts1.add("C");
        ts1.add("B");
        ts1.add("D");
        ts1.add("E");

        System.out.println("İlk Başta TreeSet " + ts1);


        ts.remove("B");

        System.out.println("Eleman silindikten sonra " + ts1);
        System.out.println("--------------------------");
        Set<Integer> data = new TreeSet<Integer>();

        data.add(31);
        data.add(21);
        data.add(41);
        System.out.println("Set: " + data);

        data.clear();
        System.out.println("Clear operasyonundan sonra : " + data);

    }
}