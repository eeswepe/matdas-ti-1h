import java.util.Scanner;

public class matdas2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("===================================");
        System.out.println("| PILIH DARI 4 DAFTAR DIBAWAH INI |");
        System.out.println("|  1. PENJUMLAHAN                 |");
        System.out.println("|  2. PENGURANGAN                 |");
        System.out.println("|  3. PERKALIAN                   |");
        System.out.println("|  4. OPERASI OR, AND, dan XOR    |");
        System.out.println("===================================");
        System.out.println();

        System.out.print("MASUKKAN PILIHAN : ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1:
                // 1. Penjumlahan
                System.out.println("Penjumlahan biner:");
                System.out.print("Masukkan bilangan biner pertama: ");
                String binary1 = scanner.nextLine();
                System.out.print("Masukkan bilangan biner kedua: ");
                String binary2 = scanner.nextLine();
                String sum = addBinary(binary1, binary2);
                System.out.println("Hasil penjumlahan: " + sum);
                break;
            
            case 2:
                // 2. Pengurangan
                System.out.println("\nPengurangan biner:");
                System.out.print("Masukkan bilangan biner pertama: ");
                binary1 = scanner.nextLine();
                System.out.print("Masukkan bilangan biner kedua: ");
                binary2 = scanner.nextLine();
                String difference = subtractBinary(binary1, binary2);
                System.out.println("Hasil pengurangan: " + difference);
                break;

            case 3:
                // 3. Perkalian
                System.out.println("\nPerkalian biner:");
                System.out.print("Masukkan bilangan biner pertama: ");
                binary1 = scanner.nextLine();
                System.out.print("Masukkan bilangan biner kedua: ");
                binary2 = scanner.nextLine();
                String product = multiplyBinary(binary1, binary2);
                System.out.println("Hasil perkalian: " + product);
                break;

            case 4:
                // 4. Operasi AND, OR, XOR
                System.out.println("\nOperasi AND, OR, XOR:");
                System.out.print("Masukkan bilangan biner pertama: ");
                binary1 = scanner.nextLine();
                System.out.print("Masukkan bilangan biner kedua: ");
                binary2 = scanner.nextLine();
                System.out.println("Hasil AND: " + andBinary(binary1, binary2));
                System.out.println("Hasil OR: " + orBinary(binary1, binary2));
                System.out.println("Hasil XOR: " + xorBinary(binary1, binary2));

                scanner.close();
                break;

                default:
                break;
        }
          
    }

    // Fungsi untuk penjumlahan biner
    public static String addBinary(String binary1, String binary2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        // Membalik string agar kita bisa mulai dari digit paling kanan
        binary1 = new StringBuilder(binary1).reverse().toString();
        binary2 = new StringBuilder(binary2).reverse().toString();

        int maxLength = Math.max(binary1.length(), binary2.length());

        for (int i = 0; i < maxLength; i++) {
            int bit1 = (i < binary1.length()) ? (binary1.charAt(i) - '0') : 0;
            int bit2 = (i < binary2.length()) ? (binary2.charAt(i) - '0') : 0;

            int sum = bit1 + bit2 + carry;

            result.append(sum % 2);
            carry = sum / 2;
        }

        if (carry > 0) {
            result.append(carry);
        }

        // Membalik hasil kembali ke urutan yang benar
        return result.reverse().toString();
    }

    // Fungsi untuk pengurangan biner
    public static String subtractBinary(String binary1, String binary2) {
        // Pastikan binary1 lebih besar dari binary2
        if (binary1.length() < binary2.length() || 
            (binary1.length() == binary2.length() && binary1.compareTo(binary2) < 0)) {
            return "Pengurangan tidak valid (bilangan pertama harus lebih besar atau sama dengan bilangan kedua).";
        }

        StringBuilder result = new StringBuilder();
        int borrow = 0;

        // Membalik string agar kita bisa mulai dari digit paling kanan
        binary1 = new StringBuilder(binary1).reverse().toString();
        binary2 = new StringBuilder(binary2).reverse().toString();

        for (int i = 0; i < binary1.length(); i++) {
            int bit1 = binary1.charAt(i) - '0'; // Mengonversi char ke int
            int bit2 = (i < binary2.length()) ? (binary2.charAt(i) - '0') : 0; // Mengambil bit dari binary2 atau 0 jika sudah habis
            
            // Menghitung hasil pengurangan dengan meminjam jika perlu
            int sub = bit1 - bit2 - borrow;

            if (sub < 0) {
                sub += 2; // Meminjam
                borrow = 1; // Menandakan kita meminjam
            } else {
                borrow = 0; // Tidak ada pinjaman
            }

            result.append(sub);
        }

        // Menghapus leading zeros
        while (result.length() > 1 && result.charAt(result.length() - 1) == '0') {
            result.deleteCharAt(result.length() - 1);
        }

        // Membalik hasil kembali ke urutan yang benar
        return result.reverse().toString();
    }

    // Fungsi untuk perkalian biner
    public static String multiplyBinary(String binary1, String binary2) {
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        int product = decimal1 * decimal2;

        return Integer.toBinaryString(product);
    }

    // Fungsi untuk operasi AND biner
    public static String andBinary(String binary1, String binary2) {
        StringBuilder result = new StringBuilder();

        // Membalik string agar kita bisa mulai dari digit paling kanan
        binary1 = new StringBuilder(binary1).reverse().toString();
        binary2 = new StringBuilder(binary2).reverse().toString();

        int maxLength = Math.max(binary1.length(), binary2.length());

        for (int i = 0; i < maxLength; i++) {
            int bit1 = (i < binary1.length()) ? (binary1.charAt(i) - '0') : 0;
            int bit2 = (i < binary2.length()) ? (binary2.charAt(i) - '0') : 0;

            result.append((bit1 & bit2) == 1 ? 1 : 0);
        }

        // Membalik hasil kembali ke urutan yang benar
        return result.reverse().toString();
    }

    // Fungsi untuk operasi OR biner
    public static String orBinary(String binary1, String binary2) {
        StringBuilder result = new StringBuilder();

        // Membalik string agar kita bisa mulai dari digit paling kanan
        binary1 = new StringBuilder(binary1).reverse().toString();
        binary2 = new StringBuilder(binary2).reverse().toString();

        int maxLength = Math.max(binary1.length(), binary2.length());

        for (int i = 0; i < maxLength; i++) {
            int bit1 = (i < binary1.length()) ? (binary1.charAt(i) - '0') : 0;
            int bit2 = (i < binary2.length()) ? (binary2.charAt(i) - '0') : 0;

            result.append((bit1 | bit2) == 1 ? 1 : 0);
        }

        // Membalik hasil kembali ke urutan yang benar
        return result.reverse().toString();
    }

    // Fungsi untuk operasi XOR biner
    public static String xorBinary(String binary1, String binary2) {
        StringBuilder result = new StringBuilder();

        // Membalik string agar kita bisa mulai dari digit paling kanan
        binary1 = new StringBuilder(binary1).reverse().toString();
        binary2 = new StringBuilder(binary2).reverse().toString();

        int maxLength = Math.max(binary1.length(), binary2.length());

        for (int i = 0; i < maxLength; i++) {
            int bit1 = (i < binary1.length()) ? (binary1.charAt(i) - '0') : 0;
            int bit2 = (i < binary2.length()) ? (binary2.charAt(i) - '0') : 0;

            result.append((bit1 ^ bit2) == 1 ? 1 : 0);
        }

        // Membalik hasil kembali ke urutan yang benar
        return result.reverse().toString();
    }
}