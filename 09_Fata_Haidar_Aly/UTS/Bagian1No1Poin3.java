import java.util.Scanner;

/**
 * nomer1Poin3
 */
public class Bagian1No1Poin3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String biner = "";
        long desimal = 0;

        System.out.print("Masukkan angka heksadesimal yang akan diubah ke desimal: ");
        String heksadesimal = sc.nextLine().toUpperCase(); 
        int panjang_heksadesimal = heksadesimal.length();
        System.out.println();

        
        for (int i = 0; i < panjang_heksadesimal; i++) {
            char key = heksadesimal.charAt(i);
            int nilaiHex;

            if (key >= '0' && key <= '9') {
                nilaiHex = key - '0'; 
            } else if (key >= 'A' && key <= 'F') {
                nilaiHex = key - 'A' + 10; 
            } else {
                System.out.println("Karakter heksadesimal tidak valid: " + key);
                return; 
            }

            desimal += nilaiHex * Math.pow(16, panjang_heksadesimal - 1 - i);
        }
        System.out.println("Hasil dari heksadesimal ke desimal = " + desimal);

        
        for (int i = 0; i < panjang_heksadesimal; i++) {
            char index = heksadesimal.charAt(i);
            String binaryValue = "";

            if (index >= '0' && index <= '9') {
                binaryValue = String.format("%4s", Integer.toBinaryString(index - '0')).replace(' ', '0');
            } else if (index >= 'A' && index <= 'F') {
                binaryValue = String.format("%4s", Integer.toBinaryString(index - 'A' + 10)).replace(' ', '0');
            } else {
                System.out.println("Karakter heksadesimal tidak valid: " + index);
                return; 
            }

            biner += binaryValue; 
        }

      
        biner = biner.replaceFirst("^0+(?!$)", "");
        
        System.out.println("Hasil dari heksadesimal ke biner = " + biner);
    }
}