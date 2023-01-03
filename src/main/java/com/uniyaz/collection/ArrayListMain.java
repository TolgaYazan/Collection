package com.uniyaz.collection;

import java.util.*;


public class ArrayListMain {
    public static void main(String[] args) {


        ArrayList<String> arabalar = new ArrayList<String>();
     //   List<Integer> arraylist = new ArrayList<Integer>();



        arabalar.add("Volvo");
        arabalar.add("BMW");
        arabalar.add("Ford");
        arabalar.add("Mazda");
        System.out.println(arabalar);

        System.out.println();
        System.out.println("0 indexdeki elaman erişiyorum ");
        System.out.println(arabalar.get(0));




        System.out.println();
        System.out.println("0 indexdeki elamanı opel olarak değitiriyorum ");
        arabalar.set(0, "Opel");
        System.out.println(arabalar);

        System.out.println();
        System.out.println("0 indexdeki elamanı siliyorum ");
        arabalar.remove(0);
        System.out.println(arabalar);

        System.out.println();
        System.out.println("Hepsini siliyorum ");
        arabalar.clear();
        System.out.println(arabalar);

        System.out.println();
        System.out.println("Integer Arraylist oluşruyorum");
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(20);
        myNumbers.add(5);
        myNumbers.add(6);
        myNumbers.add(85);
        System.out.println(myNumbers);

        System.out.println();
        System.out.println("Arraylistemin boyutu ");
        System.out.println( myNumbers.size());


        System.out.println();
        System.out.println("Array List e mi sıralıyorum");
        Collections.sort(myNumbers);
        for (int i : myNumbers) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Farklı Neseleri tutabilirim :)");
        ArrayList list = new ArrayList();
        list.add("Hello World!");
        list.add(21);

        Araba araba = new Araba(2015, "Audi");
        list.add(araba);

        System.out.println(list);
    }
}