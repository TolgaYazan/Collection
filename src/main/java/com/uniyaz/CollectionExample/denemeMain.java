package com.uniyaz.CollectionExample;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class denemeMain {
    static HashSet<RehberPageIdDeneme> rehberPages = new HashSet<RehberPageIdDeneme>();

    public static void main(String[] args) {
        rehberPages.add(new RehberPageIdDeneme(1,"Tolga2","tolgayazan08@hotmail.coö"));
        rehberPages.add(new RehberPageIdDeneme(2,"Tolga3","tolgayazan08@hotmail.coö"));
        rehberPages.add(new RehberPageIdDeneme(3,"Tolga4","tolgayazan08@hotmail.coö"));
        rehberPages.add(new RehberPageIdDeneme(4,"Tolga5","tolgayazan08@hotmail.coö"));
        rehberPages.add(new RehberPageIdDeneme(5,"Tolga6","tolgayazan08@hotmail.coö"));

        for (RehberPageIdDeneme i : rehberPages) {
            System.out.println(i.toString());
        }

        Scanner scan = new Scanner(System.in);


        System.out.println("Id girin");
        int id = scan.nextInt();

        System.out.println("Ad girin");
        String name = scan.next();

        System.out.println("Email girin");
        String email = scan.next();

        RehberPageIdDeneme rehberPageIdDeneme = new RehberPageIdDeneme(id,name,email);

        rehberPages.add(rehberPageIdDeneme);

        for (RehberPageIdDeneme i : rehberPages) {
            System.out.println(i.toString());
        }





    }

}
