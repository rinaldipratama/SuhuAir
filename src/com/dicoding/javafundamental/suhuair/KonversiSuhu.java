package com.dicoding.javafundamental.suhuair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class KonversiSuhu {

    private static double celsiusToKelvin(double C) {
        return C + 273.15;
    }

    private static double celsiusToFahrenheit(double C) {
        return C * 1.8 + 32;
    }

    private static double celsiusToReaumur(double C) {
        return C * 0.8;
    }

    private static double kelvinToCelsius(double K) {
        return K - 273.15;
    }

    private static double kelvinToFahrenheit(double K) {
        return K * 1.8 - 459.67;
    }

    private static double kelvinToReaumur(double K) {
        return (K - 273.15) * 0.8;
    }

    private static double fahrenheitToCelsius(double F) {
        return (F - 32) / 1.8;
    }

    private static double fahrenheitToKelvin(double F) {
        return (F + 459.67) / 1.8;
    }

    private static double fahrenheitToReaumur(double F) {
        return (F - 32) * 0.44;
    }

    private static double reaumurToCelsius(double R) {
        return R / 0.8;
    }

    private static double reaumurToKelvin(double R) {
        return R / 0.8 + 273.15;
    }

    private static double reaumurToFahrenheit(double R) {
        return R * 2.25 + 32;
    }

    private static void menuList() {
        System.out.println("|=======================|");
        System.out.println("| Program Konversi Suhu |");
        System.out.println("|=======================|");
        System.out.println("[1] Dari Celsius");
        System.out.println("[2] Dari Kelvin");
        System.out.println("[3] Dari Fahrenheit");
        System.out.println("[4] Dari Reaumur");
        System.out.println("[5] Keluar");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);

        try {
            System.out.print("\nMasukkan Pilihan Anda = ");
            String input = bufferedReader.readLine();

            if (input.isEmpty()) {
                System.out.println("\nAnda tidak memasukkan inputan, silahkan coba lagi.\n");
                menuList();
            } else {
                int numberOfString = Integer.parseInt(input);

                if (numberOfString == 1) {
                    fromCelsius();
                } else if (numberOfString == 2) {
                    fromKelvin();
                } else if (numberOfString == 3) {
                    fromFahrenheit();
                } else if (numberOfString == 4) {
                    fromReaumur();
                } else if (numberOfString == 5) {
                    System.out.println("\nThank You For Using This Application.\n");
                } else {
                    System.out.println("\nInputan yang Anda masukkan salah. Silahkan coba lagi.\n");
                    menuList();
                }
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("\nInputan yang Anda masukkan salah. Silahkan coba lagi.\n");
            menuList();
        }
    }

    private static void fromCelsius() {
        String coba;

        do {
            double suhu;

            System.out.print("\nMasukkan suhu (C) = ");

            Scanner scanner = new Scanner(System.in);
            suhu = scanner.nextDouble();

            DecimalFormat df = new DecimalFormat("#.#####");
            df.setRoundingMode(RoundingMode.CEILING);

            double resultCtk = celsiusToKelvin(suhu);
            System.out.println((df.format(suhu)) + " Celsius adalah sama dengan " + (df.format(resultCtk)) + " Kelvin");

            double resultCtf = celsiusToFahrenheit(suhu);
            System.out.println((df.format(suhu)) + " Celsius adalah sama dengan " + (df.format(resultCtf)) + " Fahrenheit");

            double resultCtr = celsiusToReaumur(suhu);
            System.out.println((df.format(suhu)) + " Celsius adalah sama dengan " + (df.format(resultCtr)) + " Reaumur");

            System.out.print("\nIngin mencoba lagi? (y/t) = ");
            coba = scanner.next();
        } while (coba.equals("Y") || coba.equals("y"));

        System.out.println("\n");

        menuList();
    }

    private static void fromKelvin() {
        String coba;

        do {
            double suhu;

            System.out.print("\nMasukkan suhu (K) = ");

            Scanner scanner = new Scanner(System.in);
            suhu = scanner.nextDouble();

            DecimalFormat df = new DecimalFormat("#.#####");
            df.setRoundingMode(RoundingMode.CEILING);

            double resultKtc = kelvinToCelsius(suhu);
            System.out.println((df.format(suhu)) + " Kelvin adalah sama dengan " + (df.format(resultKtc)) + " Celsius");

            double resultKtf = kelvinToFahrenheit(suhu);
            System.out.println((df.format(suhu)) + " Kelvin adalah sama dengan " + (df.format(resultKtf)) + " Fahrenheit");

            double resultKtr = kelvinToReaumur(suhu);
            System.out.println((df.format(suhu)) + " Kelvin adalah sama dengan " + (df.format(resultKtr)) + " Reaumur");

            System.out.print("\nIngin mencoba lagi? (y/t) = ");
            coba = scanner.next();
        } while (coba.equals("Y") || coba.equals("y"));

        System.out.println("\n");

        menuList();
    }

    private static void fromFahrenheit() {
        String coba;

        do {
            double suhu;

            System.out.print("\nMasukkan suhu (F) = ");

            Scanner scanner = new Scanner(System.in);
            suhu = scanner.nextDouble();

            DecimalFormat df = new DecimalFormat("#.#####");
            df.setRoundingMode(RoundingMode.CEILING);

            double resultFtc = fahrenheitToCelsius(suhu);
            System.out.println((df.format(suhu)) + " Fahrenheit adalah sama dengan " + (df.format(resultFtc)) + " Celsius");

            double resultFtk = fahrenheitToKelvin(suhu);
            System.out.println((df.format(suhu)) + " Fahrenheit adalah sama dengan " + (df.format(resultFtk)) + " Kelvin");

            double resultFtr = fahrenheitToReaumur(suhu);
            System.out.println((df.format(suhu)) + " Fahrenheit adalah sama dengan " + (df.format(resultFtr)) + " Reaumur");

            System.out.print("\nIngin mencoba lagi? (y/t) = ");
            coba = scanner.next();
        } while (coba.equals("Y") || coba.equals("y"));

        System.out.println("\n");

        menuList();
    }

    private static void fromReaumur() {
        String coba;

        do {
            double suhu;

            System.out.print("\nMasukkan suhu (R) = ");

            Scanner scanner = new Scanner(System.in);
            suhu = scanner.nextDouble();

            DecimalFormat df = new DecimalFormat("#.#####");
            df.setRoundingMode(RoundingMode.CEILING);

            double resultRtc = reaumurToCelsius(suhu);
            System.out.println((df.format(suhu)) + " Reaumur adalah sama dengan " + (df.format(resultRtc)) + " Celsius");

            double resultRtk = reaumurToKelvin(suhu);
            System.out.println((df.format(suhu)) + " Reaumur adalah sama dengan " + (df.format(resultRtk)) + " Kelvin");

            double resultRtf = reaumurToFahrenheit(suhu);
            System.out.println((df.format(suhu)) + " Reaumur adalah sama dengan " + (df.format(resultRtf)) + " Fahrenheit");

            System.out.print("\nIngin mencoba lagi? (y/t) = ");
            coba = scanner.next();
        } while (coba.equals("Y") || coba.equals("y"));

        System.out.println("\n");

        menuList();
    }

    public static void main(String[] args) {
        menuList();
    }
}
