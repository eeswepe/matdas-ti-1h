import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Penjumlahan Biner
        System.out.print("Masukkan bilangan biner pertama untuk penjumlahan: ");
        String biner1 = input.next();
        System.out.print("Masukkan bilangan biner kedua untuk penjumlahan: ");
        String biner2 = input.next();

        int desimal1 = 0, desimal2 = 0, pangkat = 1;

        // Konversi biner1 ke desimal
        for (int i = biner1.length() - 1; i >= 0; i--) {
            desimal1 += (biner1.charAt(i) - '0') * pangkat;
            pangkat *= 2;
        }
        // Konversi biner2 ke desimal
        pangkat = 1;
        for (int i = biner2.length() - 1; i >= 0; i--) {
            desimal2 += (biner2.charAt(i) - '0') * pangkat;
            pangkat *= 2;
        }
        int hasilPenjumlahan = desimal1 + desimal2;
        String hasilBinerPenjumlahan = "";
        while (hasilPenjumlahan > 0) {
            hasilBinerPenjumlahan = (hasilPenjumlahan % 2) + hasilBinerPenjumlahan;
            hasilPenjumlahan /= 2;
        }
        while (hasilBinerPenjumlahan.length() < 4) {
            hasilBinerPenjumlahan = "0" + hasilBinerPenjumlahan;
        }
        System.out.println("Hasil Penjumlahan: " + hasilBinerPenjumlahan);

        System.out.println();

        // Pengurangan Biner
        System.out.print("Masukkan bilangan biner pertama untuk pengurangan: ");
        biner1 = input.next();
        System.out.print("Masukkan bilangan biner kedua untuk pengurangan: ");
        biner2 = input.next();

        desimal1 = 0;
        desimal2 = 0;
        pangkat = 1;

        // Konversi biner1 ke desimal untuk pengurangan
        for (int i = biner1.length() - 1; i >= 0; i--) {
            desimal1 += (biner1.charAt(i) - '0') * pangkat;
            pangkat *= 2;
        }
        // Konversi biner2 ke desimal untuk pengurangan
        pangkat = 1;
        for (int i = biner2.length() - 1; i >= 0; i--) {
            desimal2 += (biner2.charAt(i) - '0') * pangkat;
            pangkat *= 2;
        }
        int hasilPengurangan = desimal1 - desimal2;

        // Konversi desimal ke biner
        String hasilBinerPengurangan = "";
        while (hasilPengurangan > 0) {
            hasilBinerPengurangan = (hasilPengurangan % 2) + hasilBinerPengurangan;
            hasilPengurangan /= 2;
        }
        while (hasilBinerPengurangan.length() < 4) {
            hasilBinerPengurangan = "0" + hasilBinerPengurangan;
        }
        System.out.println("Hasil Pengurangan: " + (hasilBinerPengurangan.length() == 0 ? "0" : hasilBinerPengurangan));

        System.out.println();

        // Perkalian Biner
        System.out.print("Masukkan bilangan biner pertama untuk perkalian: ");
        biner1 = input.next();
        System.out.print("Masukkan bilangan biner kedua untuk perkalian: ");
        biner2 = input.next();

        desimal1 = 0;
        desimal2 = 0;
        pangkat = 1;

        // Konversi biner1 ke desimal untuk perkalian
        for (int i = biner1.length() - 1; i >= 0; i--) {
            desimal1 += (biner1.charAt(i) - '0') * pangkat;
            pangkat *= 2;
        }
        // Konversi biner2 ke desimal untuk perkalian
        pangkat = 1;
        for (int i = biner2.length() - 1; i >= 0; i--) {
            desimal2 += (biner2.charAt(i) - '0') * pangkat;
            pangkat *= 2;
        }
        int hasilPerkalian = desimal1 * desimal2;
        String hasilBinerPerkalian = "";
        while (hasilPerkalian > 0) {
            hasilBinerPerkalian = (hasilPerkalian % 2) + hasilBinerPerkalian;
            hasilPerkalian /= 2;
        }
        while (hasilBinerPerkalian.length() < 4) {
            hasilBinerPerkalian = "0" + hasilBinerPerkalian;
        }
        System.out.println("Hasil Perkalian: " + hasilBinerPerkalian);

        System.out.println();

        // Operasi Logika AND, OR, XOR
        System.out.print("Masukkan bilangan biner pertama untuk operasi logika: ");
        biner1 = input.next();
        System.out.print("Masukkan bilangan biner kedua untuk operasi logika: ");
        biner2 = input.next();

        desimal1 = 0;
        desimal2 = 0;
        pangkat = 1;

        // Konversi biner1 ke desimal untuk operasi logika
        for (int i = biner1.length() - 1; i >= 0; i--) {
            desimal1 += (biner1.charAt(i) - '0') * pangkat;
            pangkat *= 2;
        }
        // Konversi biner2 ke desimal untuk operasi logika
        pangkat = 1;
        for (int i = biner2.length() - 1; i >= 0; i--) {
            desimal2 += (biner2.charAt(i) - '0') * pangkat;
            pangkat *= 2;
        }
        int hasilAND = desimal1 & desimal2;
        int hasilOR = desimal1 | desimal2;
        int hasilXOR = desimal1 ^ desimal2;

        String hasilBinerAND = "", hasilBinerOR = "", hasilBinerXOR = "";

        while (hasilAND > 0) {
            hasilBinerAND = (hasilAND % 2) + hasilBinerAND;
            hasilAND /= 2;
        }
        while (hasilOR > 0) {
            hasilBinerOR = (hasilOR % 2) + hasilBinerOR;
            hasilOR /= 2;
        }
        while (hasilXOR > 0) {
            hasilBinerXOR = (hasilXOR % 2) + hasilBinerXOR;
            hasilXOR /= 2;
        }
        while (hasilBinerAND.length() < 4) {
            hasilBinerAND = "0" + hasilBinerAND;
        }
        while (hasilBinerOR.length() < 4) {
            hasilBinerOR = "0" + hasilBinerOR;
        }
        while (hasilBinerXOR.length() < 4) {
            hasilBinerXOR = "0" + hasilBinerXOR;
        }
        System.out.println("Hasil AND: " + hasilBinerAND);
        System.out.println("Hasil OR: " + hasilBinerOR);
        System.out.println("Hasil XOR: " + hasilBinerXOR);

        input.close();
    }
}
