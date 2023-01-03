package com.uniyaz.fileobejectoperations;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileObjectUtils {

    static List<Rehber> rehberList = new ArrayList<>();
    public static void fileObjectDisplay(String path){
        try(FileInputStream fileInputStream = new FileInputStream(path)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Rehber> okunanRehberList = (List<Rehber>) objectInputStream.readObject();
            for (Rehber rehber : okunanRehberList) {
                System.out.println(rehber);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void writeObect(String path){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç kişi giriceksiniz: ");
        int count = scan.nextInt();


        // violate solid
        for(int i = 0 ; i<count;i++) {
            System.out.print("Id girin : ");
            int id = scan.nextInt();
            System.out.print("Ad girin : ");
            String name = scan.next();
            System.out.print("Gsm girin : ");
            String gsm = scan.next();
            Rehber rehber = new Rehber(id,name,gsm);
            rehberList.add(rehber);
        }


        try (FileOutputStream fileOutputStream = new FileOutputStream(path, false)) {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(rehberList);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Veriler eklendi");
    }


}
