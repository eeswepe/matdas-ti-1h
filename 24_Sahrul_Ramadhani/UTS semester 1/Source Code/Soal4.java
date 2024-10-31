import java.util.Scanner;

public class Soal4 {

    public static String enkripsiXOR(String biner1, String biner2) {
        StringBuilder hasil = new StringBuilder();
        int panjang = Math.max(biner1.length(), biner2.length());

        while (biner1.length() < panjang) {
            biner1 = "0" + biner1;
        }
        while (biner2.length() < panjang) {
            biner2 = "0" + biner2;
        }
        for (int i = 0; i < panjang; i++) {
            char bit1 = biner1.charAt(i);
            char bit2 = biner2.charAt(i);
            hasil.append((bit1 == bit2) ? '0' : '1');
        }

        return hasil.toString();
    }

    public static int binerKeDesimalManual(String biner) {
        int desimal = 0;
        int panjang = biner.length();

        for (int i = 0; i < panjang; i++) {
            char bit = biner.charAt(panjang - i - 1);
            if (bit == '1') {
                desimal += Math.pow(2, i);
            }
        }
        return desimal;
    }

    public static String desimalKeHexadesimalManual(int desimal) {
        StringBuilder hexa = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (desimal > 0) {
            int sisa = desimal % 16;
            hexa.insert(0, hexChars[sisa]);
            desimal /= 16;
        }

        return hexa.length() > 0 ? hexa.toString() : "0";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kunci = "10101010";
        System.out.print("Masukkan bilangan biner pertama: ");
        String biner1 = scanner.nextLine();
        System.out.print("Masukkan bilangan biner kedua: ");
        String biner2 = scanner.nextLine();
        String hasilEnkripsi1 = enkripsiXOR(biner1, kunci);
        String hasilEnkripsi2 = enkripsiXOR(biner2, kunci);
        int desimal1 = binerKeDesimalManual(hasilEnkripsi1);
        int desimal2 = binerKeDesimalManual(hasilEnkripsi2);

        System.out.println("Hasil Enkripsi Bilangan Biner Pertama: " + hasilEnkripsi1);
        System.out.println("Hasil Enkripsi Bilangan Biner Pertama (Desimal): " + desimal1);
        System.out.println("Hasil Enkripsi Bilangan Biner Pertama (Heksadesimal): " + desimalKeHexadesimalManual(desimal1));
        System.out.println("===============================================");
        System.out.println("Hasil Enkripsi Bilangan Biner Kedua: " + hasilEnkripsi2);
        System.out.println("Hasil Enkripsi Bilangan Biner Kedua (Desimal): " + desimal2);
        System.out.println("Hasil Enkripsi Bilangan Biner Kedua (Heksadesimal): " + desimalKeHexadesimalManual(desimal2));

        scanner.close();
    }
}
