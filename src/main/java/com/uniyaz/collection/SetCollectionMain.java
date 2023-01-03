package com.uniyaz.collection;

import java.util.*;


public class SetCollectionMain {

    public static void main(String[] args)
    {
        System.out.println("Setttttt");
        Set<String> hash_Set = new HashSet<String>();

        hash_Set.add("Tolga");
        hash_Set.add("Atilla");
        hash_Set.add("İbo");
        hash_Set.add("Tolga");
        hash_Set.add("Osman");

        System.out.println("Set tekrar eden öğelere izin vermez : ");
        System.out.println(  hash_Set);

        System.out.println("-----------------------------");

        Set<Integer> a = new HashSet<Integer>();

        // Adding all elements to List
        a.addAll(Arrays.asList(
                new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));


        Set<Integer> b = new HashSet<Integer>();

        b.addAll(Arrays.asList(
                new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));



        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("İki Kümenin birleşimi");
        System.out.println(union);


        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("İki kümenin birleşimi");
        System.out.println(intersection);


        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("İki kümenin farklı elamanları A -B");
        System.out.println(difference);

        System.out.println("--------------------");

        Set<String> hs = new HashSet<String>();


        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("B");
        hs.add("D");
        hs.add("E");


        System.out.println("Başlangıçta HashSet " + hs);
        System.out.println("Başlangıçta elaman sayısı : " + hs.size());



        hs.remove("B");

        System.out.println("Element Silindikten Sonra " + hs);
        System.out.println("Eleman  silindikten sonra elemansayısı: " + hs.size());


        System.out.println("-------------------------------------------");
        Set<Integer> data = new LinkedHashSet<Integer>();

        data.add(31);
        data.add(21);
        data.add(41);
        System.out.println("Set: " + data);

        data.clear();
        System.out.println("Clear operasyonundan sonra : " + data);

    }
}
