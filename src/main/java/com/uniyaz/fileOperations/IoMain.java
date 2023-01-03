package com.uniyaz.fileOperations;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IoMain {

    static String path;
    static String cCommand;

    public static void main(String[] args) throws IOException {
        System.out.println("Hoş geldiniz");
        System.out.println("Girmek istediğiniz pathi girin ");
        File file;

        Scanner scanner = new Scanner(System.in);
        String startPath = "C:\\";

        while (true) {
            System.out.print(startPath + ">");
            String komut = scanner.nextLine();
            file = new File(startPath);

            if ("dir".equals(komut)) {
                IoUtils.dir(startPath);
            } else if (komut.startsWith("cd")) {
                startPath = IoUtils.cd(komut, startPath);
            } else if (komut.startsWith("mkdir")) {
                IoUtils.mkdir(startPath, komut);
            } else if (komut.equals("exit")) {
                IoUtils.exit();
            } else if (komut.startsWith("write")) {
                IoUtils.write(startPath);
            } else if (komut.startsWith("oku")) {
                IoUtils.oku(startPath);
            } else {
                System.out.println("Tanımsız Komut Girdiniz ");
            }
        }
    }
}
