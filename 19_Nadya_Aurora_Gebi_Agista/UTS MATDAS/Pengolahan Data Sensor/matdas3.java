import java.util.Scanner;
public class matdas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan suhu (°C): ");
        double suhu = scanner.nextDouble();
        
        System.out.print("Masukkan kelembapan (%): ");
        int kelembapan = scanner.nextInt();
        
        System.out.print("Masukkan CO2 (ppm): ");
        int co2 = scanner.nextInt();


        System.out.println("\n------------------------");
        System.out.println("--- DATA SENSOR AWAL ---");
        System.out.println("------------------------");
        System.out.println("Suhu: " + suhu + " °C");
        System.out.println("Kelembapan: " + kelembapan + " %");
        System.out.println("CO2: " + co2 + " ppm");
        System.out.println();


        System.out.println("------------------------");
        System.out.println("     HASIL KONVERSI     ");
        System.out.println("------------------------");

        
        // Konversi Suhu
        System.out.println("1. Suhu (" + (int)suhu + " °C)");
        int suhuInt = (int)(suhu); 
        System.out.print("   Biner: ");
        printBiner(suhuInt);
        System.out.print("   Hexa : ");
        printHexa(suhuInt);

        // Konversi Kelembapan
        System.out.println("2. Kelembapan (" + kelembapan + " %)");
        System.out.print("   Biner: ");
        printBiner(kelembapan);
        System.out.print("   Hexa : ");
        printHexa(kelembapan);
    
        // Konversi CO2
        System.out.println("3. CO2 (" + co2 + " ppm)");
        System.out.print("   Biner: ");
        printBiner(co2);
        System.out.print("   Hexa : ");
        printHexa(co2);
    }

    public static void printBiner(int n) {
        if (n == 0) {
            System.out.println("0");
            return;
        }
        
        int[] biner = new int[32];
        int i = 0;
        
        while (n > 0) {
            biner[i] = n % 2;
            n = n / 2;
            i++;
        }
        
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(biner[j]);
        }
        System.out.println();
    }

    public static void printHexa(int n) {
        if (n == 0) {
            System.out.println("0");
            return;
        }
        
        char[] hexa = new char[100];
        int i = 0;
        
        while (n != 0) {
            int temp = n % 16;
            if (temp < 10) {
                hexa[i] = (char)(temp + 48);
            } else {
                hexa[i] = (char)(temp + 55);
            }
            i++;
            n = n / 16;
        }
        
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(hexa[j]);
        }
        System.out.println();
    }
}