package com.dicoding.javafundamental.suhuair;

import java.util.Scanner;

public class SuhuAir {

    public static void main(String[] args) {

        String coba;

        do {
            /* contoh pemakaian IF tiga kasus : wujud air */

            /*Kamus*/
            int T;

            /*Program*/
            System.out.println("Contoh IF tiga kasus");
            System.out.print("Suhu (der. C) = ");

            //scanner untuk masukan suhu air
            Scanner scanner = new Scanner(System.in);
            T = scanner.nextInt(); //masukan suhu air dengan tipe int

            //proses pengecekan dengan if
            if (T <= 0) {
                System.out.println("Wujud air beku " + T);
            } else if (T <= 100) {
                System.out.println("Wujud air cair " + T);
            } else {
                System.out.println("Wujud air uap/gas " + T);
            }

            System.out.print("\nIngin mencoba lagi? (y/t) = ");
            coba = scanner.next();
        } while (coba.equals("Y") || coba.equals("y"));
    }
}
