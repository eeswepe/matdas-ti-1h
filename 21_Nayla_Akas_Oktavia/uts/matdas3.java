import java.util.Scanner;

public class matdas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n=== SOAL 3.1 ===");
        System.out.print("Masukkan suhu: ");
        double suhu = input.nextDouble();
        System.out.print("Masukkan kelembapan: ");
        int kelembapan = input.nextInt();
        System.out.print("Masukkan karbondioksida: ");
        int karbondioksida = input.nextInt();
        
        int suhuBulat = (int)(suhu * 10); 
        
        System.out.println("\nSUHU (" + suhu + "°C):");
        System.out.println("Biner: " + desimalKeBiner(suhuBulat));
        System.out.println("Heksadesimal: " + desimalKeHeksa(suhuBulat));
        
        System.out.println("\nKELEMBAPAN (" + kelembapan + "%):");
        System.out.println("Biner: " + desimalKeBiner(kelembapan));
        System.out.println("Heksadesimal: " + desimalKeHeksa(kelembapan));
        
        System.out.println("\nCO2 (" + karbondioksida + " ppm):");
        System.out.println("Biner: " + desimalKeBiner(karbondioksida));
        System.out.println("Heksadesimal: " + desimalKeHeksa(karbondioksida));
        
    }
    
    public static String desimalKeHeksa(int decimal) {
        String hex = "";
        int temp = decimal;
        char hexChars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        while(temp > 0) {
            int remainder = temp % 16;
            hex = hexChars[remainder] + hex;
            temp = temp / 16;
        }
        return hex;
    }
    
    public static String desimalKeBiner(int decimal) {
        String binary = "";
        int temp = decimal;
        
        while(temp > 0) {
            binary = (temp % 2) + binary;
            temp = temp / 2;
        }
        return binary;
    }
}