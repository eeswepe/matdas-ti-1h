import java.util.Scanner;
/**
 * Bagian2
 */
public class Bagian2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan suhu: ");
        double suhu = sc.nextDouble(); 
        System.out.print("Masukkan Kelembapan: ");
        int kelembapan = sc.nextInt();
        System.out.print("Masukkan co2: ");
        int co2 = sc.nextInt();

        
        int suhuBulat = roundSuhu(suhu);

     
        String suhuBiner = Integer.toBinaryString(suhuBulat);
        String suhuHex = Integer.toHexString(suhuBulat);

        
        String kelembapanBiner = Integer.toBinaryString(kelembapan);
        String kelembapanHex = Integer.toHexString(kelembapan);

     
        String co2Biner = Integer.toBinaryString(co2);
        String co2Hex = Integer.toHexString(co2);

      
        System.out.println("Data Sensor:");
        System.out.printf("Suhu: %.1f °C (dibulatkan: %d)\n", suhu, suhuBulat);
        System.out.println("  Biner: " + suhuBiner);
        System.out.println("  Heksadesimal: " + suhuHex);
        
        System.out.printf("Kelembapan: %d %%\n", kelembapan);
        System.out.println("  Biner: " + kelembapanBiner);
        System.out.println("  Heksadesimal: " + kelembapanHex);
        
        System.out.printf("CO2: %d ppm\n", co2);
        System.out.println("  Biner: " + co2Biner);
        System.out.println("  Heksadesimal: " + co2Hex);
    }

    
    public static int roundSuhu(double value) {
        int roundedValue;
        double decimalPart = value - Math.floor(value); 

        if (decimalPart >= 0.5 && decimalPart < 1) {
            roundedValue = (int) Math.ceil(value); 
        } else {
            roundedValue = (int) Math.floor(value); 
        }
        return roundedValue;
    }
}
 