import java.util.Scanner;
/**
 * Bagian1Nomer2Poin1
 */
public class Bagian1No2Poin1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka biner pertama yang mau ditambahkan: "); 
        String x = sc.next();
        System.out.print("Masukkan angka biner kedua yang mau ditambahkan: ");
        String y = sc.next();

        int n1 = Integer.parseInt(x, 2);
        int n2 = Integer.parseInt(y, 2);
        int n3 = n1 + n2;

        
        System.out.println("Hasil dari pertambahan " + x + " dengan " + y + " = " + Integer.toBinaryString(n3));
        
        
    }
}