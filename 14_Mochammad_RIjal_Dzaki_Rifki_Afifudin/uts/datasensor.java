import java.util.Scanner;

public class datasensor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai suhu
        System.out.print("Masukkan nilai suhu (dalam °C): ");
        double suhu = scanner.nextDouble();

        // Input nilai kelembapan
        System.out.print("Masukkan nilai kelembapan (dalam %): ");
        int kelembapan = scanner.nextInt();

        // Input nilai CO2
        System.out.print("Masukkan nilai CO2 (dalam ppm): ");
        int co2 = scanner.nextInt();

        System.out.println("\nSuhu:");
        System.out.println("Desimal: " + suhu + " °C");
        
        // Konversi Biner Bagian Bulat
        int suhuBulat = (int) suhu;
        String suhuBinerBulat = "";
        int tempSuhuBulat = suhuBulat;
        
        // Konversi bilangan bulat ke biner
        while (tempSuhuBulat > 0) {
            suhuBinerBulat = (tempSuhuBulat % 2) + suhuBinerBulat;
            tempSuhuBulat /= 2;
        }
        
        // Konversi Biner Bagian Pecahan
        String suhuBinerPecahan = "0.";
        double pecahan = suhu - suhuBulat;
        
        for (int i = 0; i < 8; i++) {
            pecahan *= 2;
            int digitPecahan = (int) pecahan;
            suhuBinerPecahan += digitPecahan;
            pecahan -= digitPecahan;
        }
        
        // Konversi Heksadesimal
        String suhuHeks = "";
        int tempSuhuHeks = suhuBulat;
        char[] heksDigit = {'0', '1', '2', '3', '4', '5', '6', '7', 
                            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        while (tempSuhuHeks > 0) {
            suhuHeks = heksDigit[tempSuhuHeks % 16] + suhuHeks;
            tempSuhuHeks /= 16;
        }
        
        System.out.println("Biner: " + suhuBinerBulat + " " + suhuBinerPecahan);
        System.out.println("Heksadesimal: " + suhuHeks);

        // Konversi Kelembapan
        System.out.println("\nKelembapan:");
        System.out.println("Desimal: " + kelembapan + " %");
        
        // Konversi Biner Kelembapan
        String kelembapanBiner = "";
        int tempKelembapan = kelembapan;
        
        while (tempKelembapan > 0) {
            kelembapanBiner = (tempKelembapan % 2) + kelembapanBiner;
            tempKelembapan /= 2;
        }
        
        // Konversi Heksadesimal Kelembapan
        String kelembapanHeks = "";
        int tempKelembapanHeks = kelembapan;
        
        while (tempKelembapanHeks > 0) {
            kelembapanHeks = heksDigit[tempKelembapanHeks % 16] + kelembapanHeks;
            tempKelembapanHeks /= 16;
        }
        
        System.out.println("Biner: " + kelembapanBiner);
        System.out.println("Heksadesimal: " + kelembapanHeks);

        // Konversi CO2
        System.out.println("\nCO2:");
        System.out.println("Desimal: " + co2 + " ppm");
        
        // Konversi Biner CO2
        String co2Biner = "";
        int tempCo2 = co2;
        
        while (tempCo2 > 0) {
            co2Biner = (tempCo2 % 2) + co2Biner;
            tempCo2 /= 2;
        }
        
        // Konversi Heksadesimal CO2
        String co2Heks = "";
        int tempCo2Heks = co2;
        
        while (tempCo2Heks > 0) {
            co2Heks = heksDigit[tempCo2Heks % 16] + co2Heks;
            tempCo2Heks /= 16;
 }
        
        System.out.println("Biner: " + co2Biner);
        System.out.println("Heksadesimal: " + co2Heks);
    }
}