package com.uniyaz.collection;

import java.util.*;


public class MapCollection {
    public static void main(String[] args) {

        Map<String, Integer> hm
                = new HashMap<String, Integer>();


        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));
       hm.put("d", new Integer(800));
        hm.put("k", new Integer(400));

        for (Map.Entry<String, Integer> me :
                hm.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        System.out.println( "-----------------------");
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);



        System.out.println("Size of map is: "
                + map.size());


        System.out.println(map);


        if (map.containsKey("vishal")) {

            // Mapping
            Integer a = map.get("vishal");

            System.out.println("value for key"
                    + " \"vishal\" is:- " + a);
        }

        System.out.println("-----------------------");

        // No need to mention the
        // Generic type twice
        Map<Integer, String> hm1 = new HashMap<Integer, String>();

        // Add Elements using put method
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        // Initialization of a HashMap
        // using Generics
        HashMap<Integer, String> hm2
                = new HashMap<Integer, String>(hm1);

        System.out.println("Mappings of HashMap hm1 are : "
                + hm1);

        System.out.println("Mapping of HashMap hm2 are : "
                + hm2);

        System.out.println("-------------------------------------");

        HashMap<Integer, String> hmap
                = new HashMap<Integer, String>();


        hmap.put(1, "Tolga");
        hmap.put(2, "Tolga");
        hmap.put(3, "Tolga");

        System.out.println("iLk başta " + hmap);

        hmap.put(2, "For");

        System.out.println("Sonrada " + hmap);

        System.out.println("-----------------------------------");
        System.out.println("İlk başta HashMap  : "
                + hmap);

        hmap.remove(2);

        // Final HashMap
        System.out.println("Remove operayonundan sonra hashmap : "
                + hmap);


        System.out.println("-----------------------------------");
        System.out.println("Clear operasyonun önce");
       if(hmap.isEmpty()){
           System.out.println("Ben boş kümeyim");

       }
       else {
           System.out.println("Ben boş küme değilim");

    }

       hmap.clear();

        System.out.println("Clear operasyonudnan sonra");
        if(hmap.isEmpty()){
            System.out.println("Ben boş kümeyim");

        }
        else {
            System.out.println("Ben boş küme değilim");

        }



    }

}
