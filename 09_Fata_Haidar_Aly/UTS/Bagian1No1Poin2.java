import java.util.Scanner;


public class Bagian1No1Poin2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka Biner yang akan diubah ke desimal dan heksadesimal: ");
        String bil_biner = sc.nextLine();
        System.out.println();
    
        int angkadesimal = 0;
        int j = 1;
        for (int i = bil_biner.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(bil_biner.charAt(i));
            angkadesimal += (digit * j);
            j *= 2;
        }
        System.out.println("Hasil dari biner ke desimal = " + angkadesimal);

     
        String heksadesimal = "";
        char heksadesimal_char[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int panjangBilanganBiner = bil_biner.length();
        int desimal = 0;
        int posisiDigitBiner = 0;

        for (int i = 0; i < panjangBilanganBiner; i++) {
            int biner = Character.getNumericValue(bil_biner.charAt(panjangBilanganBiner - i - 1));
            if (biner != 0) {
                desimal += biner * (int) Math.pow(2, posisiDigitBiner);
            }
            posisiDigitBiner++;
            if (posisiDigitBiner > 3 || (i == panjangBilanganBiner - 1 && (panjangBilanganBiner % 4) > 0)) {
                posisiDigitBiner = 0;
                heksadesimal = heksadesimal_char[desimal] + heksadesimal;
                desimal = 0;
            }
        }

        if (heksadesimal.isEmpty()) {
            System.out.println("Hasil dari biner ke heksadesimal = 0");
        } else {
            heksadesimal = heksadesimal.replaceAll("^0+(?!$)", "");
            System.out.println("Hasil dari biner ke heksadesimal = " + heksadesimal);
        }
    }
}