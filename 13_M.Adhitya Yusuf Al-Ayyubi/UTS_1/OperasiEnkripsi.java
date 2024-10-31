import java.util.Scanner;
public class OperasiEnkripsi {
    public static String xorBinar(String binar1, String binar2) {
        StringBuilder ulang = new StringBuilder();
        for (int i = 0; i < binar1.length(); i++) {
            char bit1 = binar1.charAt(i);
            char bit2 = binar2.charAt(i);
            ulang.append((bit1 == bit2) ? '0' : '1');
        }
        return ulang.toString();
    }
    
    public static String binarToHex(String binar) {
        StringBuilder hex = new StringBuilder();
        for (int i = 0; i < binar.length(); i += 4) {
            String nibble = binar.substring(i, i + 4);
            int desimal = 0;
            for (int j = 0; j < 4; j++) {
                desimal = desimal * 2 + (nibble.charAt(j) - '0');
            }
            if (desimal < 10) {
                hex.append((char)(desimal + '0'));
            } else {
                hex.append((char)(desimal - 10 + 'A'));
            }
        }
        return hex.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan biner pertama (8 bit): ");
        String binar1 = sc.nextLine();
        
        System.out.print("Masukkan bilangan biner kedua (8 bit): ");
        String binar2 = sc.nextLine();
        String key = "10101010";  

        String enkripsiBinar1 = xorBinar(binar1, key);
        String enkripsiBinar2 = xorBinar(binar2, key);

        String enkripsiHex1 = binarToHex(enkripsiBinar1);
        String enkripsiHex2 = binarToHex(enkripsiBinar2);

        System.out.println("Hasil enkripsi biner pertama (XOR dengan kunci): " + enkripsiBinar1);
        System.out.println("Hasil enkripsi heksadesimal pertama: " + enkripsiHex1);
        System.out.println("Hasil enkripsi biner kedua (XOR dengan kunci): " + enkripsiBinar2);
        System.out.println("Hasil enkripsi heksadesimal kedua: " + enkripsiHex2);

        sc.close();
    }
}
