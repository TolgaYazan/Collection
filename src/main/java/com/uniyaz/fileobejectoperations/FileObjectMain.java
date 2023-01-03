package com.uniyaz.fileobejectoperations;

import com.uniyaz.fileOperations.IoUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileObjectMain {

    public static void main(String[] args) throws IOException {
        System.out.println("Hoş geldiniz");
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
                FileObjectUtils.writeObect(startPath);
            } else if (komut.startsWith("oku")) {
                FileObjectUtils.fileObjectDisplay(startPath);
            } else {
                System.out.println("Tanımsız Komut Girdiniz ");
            }
        }
    }
    }

