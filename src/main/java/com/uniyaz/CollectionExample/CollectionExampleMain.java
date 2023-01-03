package com.uniyaz.CollectionExample;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExampleMain {
    static ArrayList<RehberPage> rehberPages  = new ArrayList<RehberPage>();


    public static void main(String[] args) {

        boolean exit = false;

        while(!exit){
            System.out.println("Hoş Geldiniz");
            System.out.println("Rehber Eklemek için 1 e basın");
            System.out.println("Rehberi Yazdırmak için 2 e basın");
            System.out.println("Rehberi Silmek için 3 ye basın");
            System.out.println("Rehberi Güncellemek için 4 ye basın");
            System.out.println("Çıkmak için 5 e basın");
            Scanner scanChoose= new Scanner(System.in);
            int choose = scanChoose.nextInt();

            switch (choose) {
                case 1:
                        rehberEkle();
                    System.out.println("Rehbere Eklendi");
                    break;
                case 2:
                    System.out.println("------------");
                    System.out.println("Rehber gösterildi");
                    rehberGöster();

                    break;
                case 3:
                    rehberSil();
                    System.out.println("Rehber silindi");
                    break;
                case 4:
                rehberGüncllemek();
                    System.out.println("Rehber güncellendi");
                break;
                case 5:
                    exit=true;
                    System.out.println("Çıkış Yapıldı");
                    break;

            }


        }


    }
    public static  void rehberEkle(){
        Scanner scannerRehberEkle = new Scanner(System.in);
        System.out.println("İsim girin");
        String name = scannerRehberEkle.nextLine();
        System.out.println("Email Girin");
        String email = scannerRehberEkle.nextLine();
        RehberPage rehberPage = new RehberPage(name,email);
        rehberPages.add(rehberPage);

    }
   /* public static  void rehberEkleWithId(){
        Scanner scannerRehberEkle = new Scanner(System.in);
        System.out.println("İsim girin");
        String name = scannerRehberEkle.nextLine();
        System.out.println("Email Girin");
        String email = scannerRehberEkle.nextLine();
        int max = rehberPages.get(0).getId();
        for(int i = 0 ; i<rehberPages.size();i++){
            if()
        }



     //   RehberPage rehberPage = new RehberPage(rehberPages.lastIndexOf() name,email);
     //   rehberPages.add(rehberPage);

    }*/

    public static  void rehberGöster(){

        for (int i  = 0 ; i<rehberPages.size();i++){
            System.out.println(rehberPages.get(i).toString());
        }

    }

    public static  void rehberSil() {
        Scanner scannerRehberEkle = new Scanner(System.in);
        System.out.println("Silmek İstediğiniz rehberin idsini girin");
        int inputId = scannerRehberEkle.nextInt();
        RehberPage silinecekRehBer  =new RehberPage();
        silinecekRehBer.setId(inputId);
        rehberPages.remove(silinecekRehBer);
        

    }
    public static  void rehberGüncllemek(){
        Scanner scannerRehberEkle = new Scanner(System.in);
        System.out.println("Güncellemek istediğiniz kişinin Id sini girin ");
        int inputId = scannerRehberEkle.nextInt();
        System.out.println("Değiştirmek istediğiniz adı girin ");
        String name  = scannerRehberEkle.next();

        for(int i = 0 ; i<rehberPages.size();i++){
            if(rehberPages.get(i).getId() == inputId){
                rehberPages.get(i).setName(name);
            }
            else{
                System.out.println("Id bulunamadı tekrar deneyin");
        }

        }

    }

}
