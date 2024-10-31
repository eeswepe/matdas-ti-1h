import java.util.Scanner;
/**
 * Tugas2b_23
 */
public class Tugas2b_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan biner pertama (min): ");
        String biner1 = sc.nextLine();
        System.out.print("Masukkan bilangan biner kedua (pengurang): ");
        String biner2 = sc.nextLine();

        // Pengurangan biner
        String hasilPengurangan = penguranganBiner(biner1, biner2);

        System.out.println("Hasil Pengurangan Biner:");
        System.out.println(biner1 + " - " + biner2 + " = " + hasilPengurangan);
    }

    // Metode untuk mengurangi dua bilangan biner
    private static String penguranganBiner(String biner1, String biner2) {
        StringBuilder hasil = new StringBuilder();
        int borrow = 0; // Variabel untuk menyimpan pinjaman

        // Menyesuaikan panjang bilangan biner
        int maxLength = Math.max(biner1.length(), biner2.length());

        // Melakukan pengurangan dari belakang ke depan
        for (int i = 0; i < maxLength; i++) {
            int bit1 = (i < biner1.length()) ? biner1.charAt(biner1.length() - 1 - i) - '0' : 0;
            int bit2 = (i < biner2.length()) ? biner2.charAt(biner2.length() - 1 - i) - '0' : 0;

            // Menghitung pengurangan dengan memperhitungkan borrow
            int result = bit1 - bit2 - borrow;

            if (result < 0) {
                result += 2; // Tambah 2 jika hasil kurang dari 0
                borrow = 1; // Set pinjaman menjadi 1
            } else {
                borrow = 0; // Tidak ada pinjaman
            }

            hasil.append(result); // Tambahkan hasil ke StringBuilder
        }

        // Jika masih ada pinjaman setelah pengurangan
        if (borrow != 0) {
            return "Hasil negatif"; // Jika hasil negatif
        }

        // Membalikkan hasil agar sesuai dengan urutan biner yang benar
        return hasil.reverse().toString();
    }
}
