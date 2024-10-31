import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ubah bilangan desimal ke biner dan heksadesimal
        System.out.print("Masukkan bilangan desimal: ");
        int desimal = input.nextInt();
        
        // Konversi ke biner
        String biner = "";
        int sisa = desimal;
        while (sisa > 0) {
            biner = (sisa % 2) + biner;
            sisa /= 2;
        }
        while (biner.length() < 4) {
            biner = "0" + biner;
        }
        
        // Konversi ke heksadesimal
        String heksadesimal = "";
        sisa = desimal;
        char[] hexDigit = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (sisa > 0) {
            heksadesimal = hexDigit[sisa % 16] + heksadesimal;
            sisa /= 16;
        }
        
        System.out.println("Desimal ke Biner: " + biner);
        System.out.println("Desimal ke Heksadesimal: " + heksadesimal);

        System.out.println();
        
        // Ubah bilangan biner ke desimal dan heksadesimal
        System.out.print("Masukkan bilangan biner: ");
        String binerInput = input.next();
        
        int desimalDariBiner = 0;
        int nilai = 1; // 2^0 = 1
        for (int i = binerInput.length() - 1; i >= 0; i--) {
            desimalDariBiner += (binerInput.charAt(i) - '0') * nilai;
            nilai *= 2; // Kalikan nilai dengan 2 untuk pangkat berikutnya
        }
        
        // Konversi desimalDariBiner ke heksadesimal
        heksadesimal = "";
        sisa = desimalDariBiner;
        while (sisa > 0) {
            heksadesimal = hexDigit[sisa % 16] + heksadesimal;
            sisa /= 16;
        }
        
        System.out.println("Biner ke Desimal: " + desimalDariBiner);
        System.out.println("Biner ke Heksadesimal: " + heksadesimal);

        System.out.println();
        
        // Ubah bilangan heksadesimal ke desimal dan biner
        System.out.print("Masukkan bilangan heksadesimal: ");
        String heksadesimalInput = input.next().toUpperCase();
        
        int desimalDariHex = 0;
        nilai = 1; // 16^0 = 1
        for (int i = heksadesimalInput.length() - 1; i >= 0; i--) {
            char hexChar = heksadesimalInput.charAt(i);
            int nilaiHex = (hexChar >= '0' && hexChar <= '9') ? (hexChar - '0') : (hexChar - 'A' + 10);
            desimalDariHex += nilaiHex * nilai;
            nilai *= 16; // Kalikan nilai dengan 16 untuk pangkat berikutnya
        }
        
        // Konversi desimalDariHex ke biner
        biner = "";
        sisa = desimalDariHex;
        while (sisa > 0) {
            biner = (sisa % 2) + biner;
            sisa /= 2;
        }
        while (biner.length() < 4) {
            biner = "0" + biner;
        }
        
        System.out.println("Heksadesimal ke Desimal: " + desimalDariHex);
        System.out.println("Heksadesimal ke Biner: " + biner);
        
        input.close();
    }
}
