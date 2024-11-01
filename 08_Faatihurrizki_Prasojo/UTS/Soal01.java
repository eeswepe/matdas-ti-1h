import java.util.Scanner;
public class Soal01 {
    public static void main(String[] args) {
        Scanner prasojo = new Scanner(System.in);

        System.out.println("============================================================================");
        System.out.println("-                           UTS MATEMATIKA DASAR                           -");
        System.out.println("============================================================================");
        System.out.println("Pilih jenis konversi:");
        System.out.println("1. Bilangan Desimal ke Bilangan Biner dan Bilangan Heksadesimal ");
        System.out.println("2. Bilangan Biner ke Bilangan Desimal dan Bilangan Heksadesimal");
        System.out.println("3. Bilangan Heksadesimal ke Bilangan Desimal dan Bilangan Biner");
        System.out.println("============================================================================");
        System.out.print("Masukkan jenis pilihan 1 - 3 : ");
        int pilihan = prasojo.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan bilangan desimal : ");
                int desimal = prasojo.nextInt();
        // Konversi ke biner
                String biner = "";
                for (int i = desimal; i > 0; i /= 2) {
                    biner = (i % 2) + biner;
                }
                System.out.println("Bilangan biner : " + biner);
           
        // Konversi ke heksadesimal
                String heksadesimal = "";
                char[] arrayHeksa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                for (int i = desimal; i > 0; i /= 16) {
                    heksadesimal = arrayHeksa[i % 16] + heksadesimal;
                }
                System.out.println("Bilangan heksadesimal : " + heksadesimal);
                System.out.println("============================================================================");
                break;
            case 2:
                System.out.print("Masukkan bilangan biner : ");
                biner = prasojo.next();
                desimal = 0;
                int pangkat = 1;
                // Konversi biner ke desimal
                for (int i = biner.length() - 1; i >= 0; i--) {
                    if (biner.charAt(i) == '1') {
                    desimal += pangkat;
                    }pangkat *= 2;
                }
                System.out.println("Bilangan desimal : " + desimal);

                // Konversi biner ke heksadesimal
                heksadesimal = "";
                char[] arrayheksa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                while (desimal > 0) {
                heksadesimal = arrayheksa[desimal % 16] + heksadesimal;
                desimal /= 16;
                }
                System.out.println("Bilangan heksadesimal : " + heksadesimal);
                System.out.println("============================================================================");
                break;
            case 3:
                System.out.print("Masukkan bilangan heksadesimal: ");
                heksadesimal = prasojo.next();
        
        // Konversi heksadesimal ke desimal
                desimal = 0;
                pangkat = heksadesimal.length() - 1;
                for (int i = 0; i < heksadesimal.length(); i++) {
                char digit = heksadesimal.charAt(i);
                int nilaiDigit;
                if (digit >= '0' && digit <= '9') {
                    nilaiDigit = digit - '0';
                } else {
                    nilaiDigit = digit - 'A' + 10; // Konversi huruf A-F menjadi nilai desimal 10-15
                }
                desimal += nilaiDigit * 16^pangkat;
                pangkat--;
                }
        
        // Konversi desimal ke biner
                biner = "";
                while (desimal > 0) {
                biner = (desimal % 2) + biner;
                desimal /= 2;
                }
                System.out.println("Bilangan desimal: " + desimal);
                System.out.println("Bilangan biner: " + biner);
                System.out.println("============================================================================");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.out.println("============================================================================"); 
        } prasojo.close();
    }
}
