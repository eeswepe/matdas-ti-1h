import java.util.Scanner;
/**
 * Bagian1Nomer2Poin1
 */
public class Bagian1No2Poin2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka biner pertama yang mau dikurangi: "); 
        String x = sc.next();
        System.out.print("Masukkan angka biner kedua yang mau dikurangi: ");
        String y = sc.next();

        // Mengonversi angka biner ke desimal
        int n1 = Integer.parseInt(x, 2);
        int n2 = Integer.parseInt(y, 2);

        // Mengurangi kedua angka desimal
        int n3 = n1 - n2;

        // Menampilkan hasil pengurangan dalam format biner
        if (n3 < 0) {
            System.out.println("Hasil dari pengurangan " + x + " dengan " + y + " adalah negatif.");
        } else {
            System.out.println("Hasil dari pengurangan " + x + " dengan " + y + " = " + Integer.toBinaryString(n3));
        }
        
        sc.close(); // Menutup scanner
    }
}