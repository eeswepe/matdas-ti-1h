import java.util.Scanner;
/**
 * Tugas3_23
 */
public class Tugas3_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Data sensor
        double suhu = 28.6; // Suhu dalam °C
        int kelembapan = 65; // Kelembapan dalam %
        int co2 = 420; // CO2 dalam ppm

        // Menampilkan data asli
        System.out.println("Data Sensor:");
        System.out.println("Suhu: " + suhu + " °C");
        System.out.println("Kelembapan: " + kelembapan + " %");
        System.out.println("CO2: " + co2 + " ppm");

        // Data untuk konversi
        int[] data = {(int) suhu, kelembapan, co2}; // Array untuk menyimpan data sensor
        String[] labels = {"Suhu", "Kelembapan", "CO2"};

        for (int i = 0; i < data.length; i++) {
            // Menampilkan desimal
            System.out.println("\n" + labels[i] + ": " + data[i]);

            // Konversi ke biner
            char[] biner = new char[32]; // Maksimal 32 bit untuk biner
            int indexBiner = 0;
            int desimal = data[i];

            if (desimal == 0) {
                biner[indexBiner++] = '0';
            } else {
                while (desimal > 0) {
                    biner[indexBiner++] = (char) ('0' + (desimal % 2));
                    desimal /= 2;
                }
            }

            // Menampilkan hasil biner dalam urutan yang benar
            System.out.print("Biner: ");
            for (int j = indexBiner - 1; j >= 0; j--) {
                System.out.print(biner[j]);
            }

            // Konversi ke heksadesimal
            desimal = data[i];
            char[] heksadesimal = new char[8]; // Maksimal 8 digit heksadesimal
            int indexHeksadesimal = 0;

            if (desimal == 0) {
                System.out.println("\nHeksadesimal: 0");
            } else {
                while (desimal > 0) {
                    int sisa = desimal % 16;
                    if (sisa < 10) {
                        heksadesimal[indexHeksadesimal++] = (char) ('0' + sisa);
                    } else {
                        heksadesimal[indexHeksadesimal++] = (char) ('A' + (sisa - 10));
                    }
                    desimal /= 16;
                }

                // Menampilkan hasil heksadesimal dalam urutan yang benar
                System.out.print("\nHeksadesimal: ");
                for (int j = indexHeksadesimal - 1; j >= 0; j--) {
                    System.out.print(heksadesimal[j]);
                }
            }
            System.out.println(); // Untuk baris baru
        }
    }
}
