import java.util.Scanner;

public class utsmatdasbag2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double suhu, lembapDecimal, CO2, kelembapan;
        // tempat untuk menyimpan hasil pembulatan
        int suhuI, lembapI, CO2I;
        // untuk menyimpan pangkat
        int pangkat = 1;
        // untuk menyimpan nilai index
        int index = 0, indexlem= 0, indexco = 0;
        // untuk menyimpan nilai heksadesimal
        char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        
        System.out.print("Masukkan data suhu: ");
        suhu = sc.nextDouble();
        suhu += 0.5;
        System.out.print("Masukkan data kelembapan dalam bentuk % : ");
        kelembapan = sc.nextInt();
        kelembapan += 0.5;
        System.out.print("Masukkan kadar CO2: ");
        CO2 = sc.nextDouble();
        CO2 += 0.5;

        // konversi
        suhuI = (int) suhu;
        int simpanhek = suhuI;
        lembapI = (int) kelembapan;
        int simpanlemhek = lembapI;
        CO2I = (int) CO2;
        int simpancohek = CO2I;

        // konversi ke suhu ke biner
        int[] binSuhu = new int[100];
        while (suhuI > 0) {
            binSuhu[index++] = suhuI % 2;
            suhuI /= 2;
        }
        System.out.print("Suhu dalam bentuk biner: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binSuhu[i]);
        } System.out.println();
        // konversi ke heksadesimal
        // untuk menyimpan sisa
        int sisa;
        String heksaHasil = "";
        while (simpanhek > 0) {
            sisa = simpanhek % 16;
            heksaHasil = hex[sisa] + heksaHasil;
            simpanhek /= 16;

        }   System.out.println("Suhu dalam bentuk heksadesimal: " + heksaHasil);

        // konversi kelembapan ke biner
        int[] lemsuhu = new int[100];
        
        while (lembapI > 0) {
            lemsuhu[indexlem++] = lembapI % 2;
            lembapI /= 2;
        }
        System.out.print("Kelembapan dalam bentuk biner: ");
        for (int i = indexlem - 1; i >= 0; i--) {
            System.out.print(lemsuhu[i]);
        } System.out.println();
        // konversi ke heksadesimal
        String hekslem = "";
        int sisalem;
        while (simpanlemhek > 0) {
            sisalem = simpanlemhek % 16;
            hekslem = hex[sisalem] + hekslem;
            simpanlemhek /= 16;

        }   System.out.println("Kelembapan dalam bentuk heksadesimal: " + hekslem);

        // konversi CO2 ke biner
         int[] binco2 = new int[100];
         while (CO2I > 0) {
             binco2[indexco++] = CO2I % 2;
             CO2I /= 2;
         }
         System.out.print("CO2 dalam bentuk biner: ");
         for (int i = indexco - 1; i >= 0; i--) {
             System.out.print(binco2[i]);
         } System.out.println();

         // konversi ke heksadesimal
         String heksco = "";
         int sisaco;
         while (simpancohek > 0) {
             sisaco = simpancohek % 16;
             heksco = hex[sisaco] + heksco;
             simpancohek /= 16;
 
         }   System.out.println("Kelembapan dalam bentuk heksadesimal: " + heksco);
    }
}
