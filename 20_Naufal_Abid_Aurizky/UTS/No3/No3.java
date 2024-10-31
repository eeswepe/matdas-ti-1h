package No3;
import java.util.Scanner;
public class No3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data suhu (dengan bilangan desimal)
        System.out.print("Input nilai suhu (°C): ");
        double suhu = sc.nextDouble();

        // Input data kelembapan
        System.out.print("Input nilai kelembapan (%): ");
        int kelembapan = sc.nextInt();

        // Input data CO2
        System.out.print("Input kadar CO2 (ppm): ");
        int co2 = sc.nextInt();

        // Konversi dan cetak hasil untuk suhu
        System.out.println("\nNilai Suhu (" + suhu + " °C):");

        // Pisahkan bagian integer dan desimal dari suhu
        int suhuInteger = (int) suhu;
        double suhuDecimal = suhu - suhuInteger;

        // Konversi bagian integer ke biner
        StringBuilder binerSuhu = new StringBuilder();
        int tempSuhu = suhuInteger;
        while (tempSuhu > 0) {
            binerSuhu.insert(0, tempSuhu % 2);
            tempSuhu /= 2;
        }
        System.out.println("Nilai Biner (Bilangan Bulat)  : " + binerSuhu.toString());

        // Konversi bagian integer ke heksadesimal
        StringBuilder heksaSuhu = new StringBuilder();
        char[] heksaDigit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        tempSuhu = suhuInteger;
        while (tempSuhu > 0) {
            heksaSuhu.insert(0, heksaDigit[tempSuhu % 16]);
            tempSuhu /= 16;
        }
        System.out.println("Nilai Heksadesimal (Bilangan Bulat): " + heksaSuhu.toString());

        // Konversi bagian desimal ke biner (maksimal 5 digit setelah koma)
        StringBuilder binerSuhuDecimal = new StringBuilder("0.");
        double tempDecimal = suhuDecimal;
        int decimalPrecision = 5; // Mengatur presisi biner untuk angka desimal
        while (tempDecimal > 0 && decimalPrecision > 0) {
            tempDecimal *= 2;
            if (tempDecimal >= 1) {
                binerSuhuDecimal.append("1");
                tempDecimal -= 1;
            } else {
                binerSuhuDecimal.append("0");
            }
            decimalPrecision--;
        }
        System.out.println("Nilai Biner (Desimal): " + binerSuhuDecimal.toString());

        // Konversi dan cetak hasil untuk kelembapan
        System.out.println("\nNilai Kelembapan (" + kelembapan + "%):");

        // Konversi ke biner
        StringBuilder binerKelembapan = new StringBuilder();
        int tempKelembapan = kelembapan;
        while (tempKelembapan > 0) {
            binerKelembapan.insert(0, tempKelembapan % 2);
            tempKelembapan /= 2;
        }
        System.out.println("Nilai Biner      : " + binerKelembapan.toString());

        // Konversi ke heksadesimal
        StringBuilder heksaKelembapan = new StringBuilder();
        tempKelembapan = kelembapan;
        while (tempKelembapan > 0) {
            heksaKelembapan.insert(0, heksaDigit[tempKelembapan % 16]);
            tempKelembapan /= 16;
        }
        System.out.println("Nilai Heksadesimal: " + heksaKelembapan.toString());

        // Konversi dan cetak hasil untuk CO2
        System.out.println("\nKadar CO2 (" + co2 + " ppm):");

        // Konversi ke biner
        StringBuilder binerCO2 = new StringBuilder();
        int tempCO2 = co2;
        while (tempCO2 > 0) {
            binerCO2.insert(0, tempCO2 % 2);
            tempCO2 /= 2;
        }
        System.out.println("Nilai Biner      : " + binerCO2.toString());

        // Konversi ke heksadesimal
        StringBuilder heksaCO2 = new StringBuilder();
        tempCO2 = co2;
        while (tempCO2 > 0) {
            heksaCO2.insert(0, heksaDigit[tempCO2 % 16]);
            tempCO2 /= 16;
        }
        System.out.println("Nilai Heksadesimal: " + heksaCO2.toString());
        sc.close();
    }
}