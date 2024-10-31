import java.util.Scanner;

public class matdas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("\n=== SOAL 4 ===");
        
        System.out.print("Masukkan dataBiner1: ");
        String dataBiner1 = input.next();
        System.out.print("Masukkan dataBiner2: ");
        String dataBiner2 = input.next();
        System.out.print("Masukkan kunciEnkripsi: ");
        String kunciEnkripsi = input.next();

        System.out.println("\nData 1:");
        System.out.println("Biner Awal: " + dataBiner1);
        String hasilXOR1 = operasiXOR(dataBiner1, kunciEnkripsi);
        System.out.println("Hasil XOR: " + hasilXOR1);
        int nilaiDesimal1 = binerKeDesimal(hasilXOR1);
        System.out.println("Heksadesimal: " + desimalKeHeksa(nilaiDesimal1));

        System.out.println("\nData 2:");
        System.out.println("Biner Awal: " + dataBiner2);
        String hasilXOR2 = operasiXOR(dataBiner2, kunciEnkripsi);
        System.out.println("Hasil Enkripsi XOR: " + hasilXOR2);
        int nilaiDesimal2 = binerKeDesimal(hasilXOR2);
        System.out.println("Heksadesimal: " + desimalKeHeksa(nilaiDesimal2));
    }
    
    public static int binerKeDesimal(String binary) {
        int decimal = 0;
        int power = 0;
        
        for(int i = binary.length()-1; i >= 0; i--) {
            if(binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
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
    
    public static String operasiXOR(String biner, String kunci) {
        String hasil = "";
        for(int i = 0; i < biner.length(); i++) {
            if(biner.charAt(i) != kunci.charAt(i)) {
                hasil = hasil + "1";
            } else {
                hasil = hasil + "0";
            }
        }
        return hasil;
    }    
}