import java.util.Scanner;

public class DataSensor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data sensor
        System.out.print("Masukkan Suhu (°C): ");
        float suhuInput = input.nextFloat(); // Mengambil suhu sebagai float
        int suhu = (int) (suhuInput + 0.5); // Pembulatan ke atas jika .5
        System.out.print("Masukkan Kelembapan (%): ");
        int kelembapan = input.nextInt();
        System.out.print("Masukkan CO2 (ppm): ");
        int co2 = input.nextInt();

        // Konversi Suhu ke Biner dan Heksadesimal
        String binerSuhu = "";
        int tempSuhu = suhu;
        while (tempSuhu > 0) {
            binerSuhu = (tempSuhu % 2) + binerSuhu;
            tempSuhu /= 2;
        }
        String heksaSuhu = "";
        tempSuhu = suhu;
        while (tempSuhu > 0) {
            int sisa = tempSuhu % 16;
            if (sisa < 10) {
                heksaSuhu = sisa + heksaSuhu; // Angka 0-9
            } else {
                heksaSuhu = (char) ('A' + (sisa - 10)) + heksaSuhu; // Huruf A-F
            }
            tempSuhu /= 16;
        }
        // Konversi Kelembapan ke Biner dan Heksadesimal
        String binerKelembapan = "";
        int tempKelembapan = kelembapan;
        while (tempKelembapan > 0) {
            binerKelembapan = (tempKelembapan % 2) + binerKelembapan;
            tempKelembapan /= 2;
        }
        String heksaKelembapan = "";
        tempKelembapan = kelembapan;
        while (tempKelembapan > 0) {
            int sisa = tempKelembapan % 16;
            if (sisa < 10) {
                heksaKelembapan = sisa + heksaKelembapan; // Menggunakan angka 0-9
            } else {
                heksaKelembapan = (char) ('A' + (sisa - 10)) + heksaKelembapan; // Menggunakan huruf A-F
            }
            tempKelembapan /= 16;
        }
        // Konversi CO2 ke Biner dan Heksadesimal
        String binerCO2 = "";
        int tempCO2 = co2;
        while (tempCO2 > 0) {
            binerCO2 = (tempCO2 % 2) + binerCO2;
            tempCO2 /= 2;
        }
        String heksaCO2 = "";
        tempCO2 = co2;
        while (tempCO2 > 0) {
            int sisa = tempCO2 % 16;
            if (sisa < 10) {
                heksaCO2 = sisa + heksaCO2; // Menggunakan angka 0-9
            } else {
                heksaCO2 = (char) ('A' + (sisa - 10)) + heksaCO2; // Menggunakan huruf A-F
            }
            tempCO2 /= 16;
        }
        System.out.println();
        // Menampilkan hasil konversi
        System.out.println("Hasil Konversi:");
        System.out.println("Suhu: " + suhu + "°C");
        System.out.println(" - Biner: " + (binerSuhu.equals("") ? "0" : binerSuhu));
        System.out.println(" - Heksadesimal: " + (heksaSuhu.equals("") ? "0" : heksaSuhu));
        System.out.println("Kelembapan: " + kelembapan + "%");
        System.out.println(" - Biner: " + (binerKelembapan.equals("") ? "0" : binerKelembapan));
        System.out.println(" - Heksadesimal: " + (heksaKelembapan.equals("") ? "0" : heksaKelembapan));
        System.out.println("CO2: " + co2 + " ppm");
        System.out.println(" - Biner: " + (binerCO2.equals("") ? "0" : binerCO2));
        System.out.println(" - Heksadesimal: " + (heksaCO2.equals("") ? "0" : heksaCO2));

        input.close();
    }
}
