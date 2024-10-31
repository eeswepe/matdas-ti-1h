import java.util.Scanner;

public class operasiEnkripsi4 {

    // Fungsi untuk mengonversi biner ke desimal secara manual
    public static int binerKeDesimal(String biner) {
        int desimal = 0;
        for (int i = 0; i < biner.length(); i++) {
            char bit = biner.charAt(biner.length() - 1 - i);
            if (bit == '1') {
                desimal += 1 << i; // Menggunakan bitwise shift untuk menambahkan nilai
            }
        }
        return desimal;
    }

    // Fungsi untuk mengonversi desimal ke biner secara manual
    public static String desimalKeBiner(int desimal) {
        String biner = "";
        for (int i = 7; i >= 0; i--) {
            biner += (desimal & (1 << i)) != 0 ? '1' : '0';
        }
        return biner; // Mengembalikan string biner secara manual
    }

    // Fungsi untuk mengonversi desimal ke heksadesimal secara manual
    public static String desimalKeHeksadesimal(int desimal) {
        String heksadesimal = ""; // Menggunakan string biasa
        
        // Mengganti penggunaan toCharArray()
        char[] heks = new char[16];
        heks[0] = '0';
        heks[1] = '1';
        heks[2] = '2';
        heks[3] = '3';
        heks[4] = '4';
        heks[5] = '5';
        heks[6] = '6';
        heks[7] = '7';
        heks[8] = '8';
        heks[9] = '9';
        heks[10] = 'A';
        heks[11] = 'B';
        heks[12] = 'C';
        heks[13] = 'D';
        heks[14] = 'E';
        heks[15] = 'F';

        if (desimal == 0) {
            return "0"; // Menangani kasus desimal 0
        }

        while (desimal > 0) {
            int remainder = desimal % 16;
            heksadesimal = heks[remainder] + heksadesimal; // Menambahkan karakter heksadesimal di depan
            desimal /= 16;
        }
        
        return heksadesimal; // Mengembalikan string heksadesimal secara manual
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menerima input dari pengguna
        System.out.print("Masukkan bilangan biner 1 (8 bit): ");
        String biner1 = sc.nextLine();
        System.out.print("Masukkan bilangan biner 2 (8 bit): ");
        String biner2 = sc.nextLine();
        System.out.print("Masukkan kunci enkripsi (8 bit): ");
        String kunci = sc.nextLine();

        // Mengonversi biner ke desimal
        int bilangan1 = binerKeDesimal(biner1);
        int bilangan2 = binerKeDesimal(biner2);
        int kunciDesimal = binerKeDesimal(kunci);

        // Melakukan operasi XOR
        int hasilEnkripsi1 = bilangan1 ^ kunciDesimal;
        int hasilEnkripsi2 = bilangan2 ^ kunciDesimal;

        // Mengonversi hasil enkripsi ke biner dan heksadesimal
        String binerHasil1 = desimalKeBiner(hasilEnkripsi1);
        String binerHasil2 = desimalKeBiner(hasilEnkripsi2);
        String heksadesimalHasil1 = desimalKeHeksadesimal(hasilEnkripsi1);
        String heksadesimalHasil2 = desimalKeHeksadesimal(hasilEnkripsi2);

        // Menampilkan hasil
        System.out.println("\nHasil Enkripsi:");
        System.out.println("Biner 1 setelah enkripsi: " + binerHasil1);
        System.out.println("Heksadesimal 1 setelah enkripsi: " + heksadesimalHasil1);
        System.out.println("Biner 2 setelah enkripsi: " + binerHasil2);
        System.out.println("Heksadesimal 2 setelah enkripsi: " + heksadesimalHasil2);

        // Menutup scanner setelah selesai
        sc.close();
    }
}
