package com.uniyaz.collection;
import java.util.*;

public class LinkindList {
    public static void main(String[] args) {
        LinkedList<String> arabalar = new LinkedList<String>();
        arabalar.add("Volvo");
        arabalar.add("BMW");
        arabalar.add("Ford");
        arabalar.add("Mazda");
        System.out.println(arabalar);

        System.out.println();
        arabalar.addFirst("TOGG");
        System.out.println("TOGG Başa eklendi " + arabalar);

        System.out.println();
        arabalar.addLast("Mercedes");
        System.out.println("Mercedes sona eklendi " + arabalar);

        System.out.println();
        arabalar.removeFirst();
        System.out.println("İlk eleman Togg silindi  " + arabalar);

        System.out.println();
        arabalar.removeLast();
        System.out.println("Son eleman Mercedes silindi  " + arabalar);

        System.out.println();
        System.out.println("İlk elaman  getirildi " +  arabalar.getFirst());

        System.out.println();
        System.out.println("Son elaman  getirildi " +  arabalar.getLast());

        System.out.println();

        System.out.println("Farklı Neseleri tutabilirim :)");

        System.out.println();
        System.out.println("2. indexdeki elamana erişebilirim " + arabalar.get(2));

        System.out.println();
        System.out.println(arabalar);
        System.out.println("2. indexdeki elamananı silebilirim ");
        arabalar.remove(2);
        System.out.println(arabalar);

        System.out.println();
        System.out.println(arabalar);
        System.out.println(" Hepsini silebilirim");
        arabalar.clear();
        System.out.println(arabalar);


        LinkedList list1 = new LinkedList();
        list1.add("Hello World!");
        list1.add(21);

        Araba araba = new Araba(2015, "Audi");
        list1.add(araba.toString());

        System.out.println(list1);


}
}
