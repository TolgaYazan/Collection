package com.uniyaz.fileOperations;

import java.io.*;
import java.util.Scanner;

public class IoUtils {
    public static void dir(String path) {
        File file = new File(path);
        File[] fileList = file.listFiles();
        for (File fileFile : fileList) {
            System.out.println(fileFile.getName());
        }
    }

    public static String cd(String komut, String path) {
        String[] komutArray = komut.split(" ");
        File file = new File(path);
        if (komutArray.length <= 1) {
            System.out.println("cd komutu yol bekler");

        } else if (komutArray[1].equals("..")) {
            path = file.getParent();

        } else {
            String araKomut = komutArray[1];
            path = path + "\\" + araKomut;
        }
        return path;
    }

    public static void mkdir(String path, String komut) {
        String[] komutArray = komut.split(" ");
        path = path + "\\" + komutArray[1];
        File f = new File(path);

        try {
            if (!f.exists()) { // eğer dosya yoksa
                f.createNewFile(); // dosyamızı oluşturur.
                System.out.println(f.getName() + " adlı dosya Oluşturuldu..");
            } else {
                System.out.println("Dosya olduğundan oluşturma işlemi yapılmayacaktır. ");
            }
        } catch (IOException e) { // hata yakalama

            e.printStackTrace();
        }
    }

    public static void exit() {
        System.out.println("Çıkış Yapıldı");
        System.exit(0);
    }

    public static void write(String path) throws IOException {
        File file = new File(path);
        if (file.getName().endsWith(".txt")) {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Scanner scan = new Scanner(System.in);
            System.out.println("Girmek istediğinz yazıyı girin");
            String input = scan.next();
            bufferedWriter.append(input);
            System.out.println("Dosyaya yazıldı");
            bufferedWriter.close();

        } else {
            System.out.println("Txt file bulunamadı");
        }
    }

    public static void oku(String path) throws IOException {
        File file = new File(path);
        if (file.getName().endsWith(".txt")) {
            FileWriter fileWriter = new FileWriter(file, true);

            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            StringBuilder stringBuilder = new StringBuilder();// Performans için StringBuilder tercih edilmesi daha iyi olur.
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\r\n");
            }

            System.out.println("Okunan Metin : \r\n" + stringBuilder.toString());
            bufferedReader.close();
        } else {
            System.out.println("Txt file bulunamadı");
        }
    }

}
