import java.util.Scanner;
/**
 * Tugas4_23
 */
public class Tugas4_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Bilangan biner yang akan dienkripsi
        String biner1 = "01101100";
        String biner2 = "11010110";
        String kunci = "10101010";

        // Hasil enkripsi
        char[] hasilEnkripsi1 = new char[biner1.length()];
        char[] hasilEnkripsi2 = new char[biner2.length()];

        // Melakukan enkripsi dengan XOR
        for (int i = 0; i < biner1.length(); i++) {
            // XOR untuk biner1
            hasilEnkripsi1[i] = (biner1.charAt(i) == kunci.charAt(i)) ? '0' : '1';
            // XOR untuk biner2
            hasilEnkripsi2[i] = (biner2.charAt(i) == kunci.charAt(i)) ? '0' : '1';
        }

        // Menampilkan hasil enkripsi
        System.out.println("Biner 1: " + biner1);
        System.out.println("Biner 2: " + biner2);
        System.out.println("Kunci: " + kunci);
        System.out.println("Hasil Enkripsi Biner 1: " + new String(hasilEnkripsi1));
        System.out.println("Hasil Enkripsi Biner 2: " + new String(hasilEnkripsi2));

        // Konversi ke desimal dan heksadesimal
        String hasilBiner1 = new String(hasilEnkripsi1);
        String hasilBiner2 = new String(hasilEnkripsi2);

        // Konversi hasil biner ke desimal
        int desimal1 = 0;
        int desimal2 = 0;

        for (int i = 0; i < hasilBiner1.length(); i++) {
            if (hasilBiner1.charAt(hasilBiner1.length() - 1 - i) == '1') {
                desimal1 += Math.pow(2, i);
            }
            if (hasilBiner2.charAt(hasilBiner2.length() - 1 - i) == '1') {
                desimal2 += Math.pow(2, i);
            }
        }

        // Konversi desimal ke heksadesimal
        StringBuilder heksadesimal1 = new StringBuilder();
        StringBuilder heksadesimal2 = new StringBuilder();

        int[] desimalArr = {desimal1, desimal2};

        for (int j = 0; j < 2; j++) {
            int desimal = desimalArr[j];
            if (desimal == 0) {
                heksadesimal1.append("0");
            }
            while (desimal > 0) {
                int sisa = desimal % 16;
                if (sisa < 10) {
                    if (j == 0) {
                        heksadesimal1.append((char) ('0' + sisa));
                    } else {
                        heksadesimal2.append((char) ('0' + sisa));
                    }
                } else {
                    if (j == 0) {
                        heksadesimal1.append((char) ('A' + (sisa - 10)));
                    } else {
                        heksadesimal2.append((char) ('A' + (sisa - 10)));
                    }
                }
                desimal /= 16;
            }
        }

        // Output hasil
        System.out.println("Hasil Enkripsi (Desimal 1): " + desimal1);
        System.out.println("Hasil Enkripsi (Heksadesimal 1): " + heksadesimal1.reverse().toString());
        System.out.println("Hasil Enkripsi (Desimal 2): " + desimal2);
        System.out.println("Hasil Enkripsi (Heksadesimal 2): " + heksadesimal2.reverse().toString());
    }
}