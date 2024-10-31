import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryOperations2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "", b = "";

        while (true) {
            System.out.println("Pilih operasi:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Operasi Bitwise (AND, OR, XOR)");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1-5): ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka dari 1 hingga 5.");
                scanner.nextLine(); // Bersihkan input yang tidak valid
                continue;
            }

            if (choice == 5) {
                System.out.println("Keluar dari program.");
                break;
            }

            // Meminta input jika pilihan adalah 1, 2, atau 3
            if (choice >= 1 && choice <= 3) {
                System.out.print("Masukkan bilangan biner pertama: ");
                a = scanner.next();
                System.out.print("Masukkan bilangan biner kedua: ");
                b = scanner.next();
            } else if (choice == 4) {
                if (a.isEmpty() || b.isEmpty()) {
                    System.out.print("Masukkan bilangan biner pertama: ");
                    a = scanner.next();
                    System.out.print("Masukkan bilangan biner kedua: ");
                    b = scanner.next();
                }
                // Langsung lakukan semua operasi bitwise
                System.out.println("Hasil AND: " + binaryAND(a, b));
                System.out.println("Hasil OR: " + binaryOR(a, b));
                System.out.println("Hasil XOR: " + binaryXOR(a, b));
                System.out.println();
                continue; // Lewati menu utama setelah operasi bitwise
            } else {
                System.out.println("Pilihan tidak valid.");
                continue; // Lewati menu utama jika tidak valid
            }

            switch (choice) {
                case 1:
                    System.out.println("Hasil Penjumlahan: " + binaryAddition(a, b));
                    break;
                case 2:
                    System.out.println("Hasil Pengurangan: " + binarySubtraction(a, b));
                    break;
                case 3:
                    System.out.println("Hasil Perkalian: " + binaryMultiplication(a, b));
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        }

        scanner.close();
    }

    // Method untuk penjumlahan biner manual
    public static String binaryAddition(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        while (a.length() < b.length()) a = "0" + a;
        while (b.length() < a.length()) b = "0" + b;

        for (int i = a.length() - 1; i >= 0; i--) {
            int bitA = a.charAt(i) - '0';
            int bitB = b.charAt(i) - '0';

            int sum = bitA + bitB + carry;
            result.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }

    // Method untuk pengurangan biner manual
    public static String binarySubtraction(String a, String b) {
        while (a.length() < b.length()) a = "0" + a;
        while (b.length() < a.length()) b = "0" + b;

        StringBuilder result = new StringBuilder();
        int borrow = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            int bitA = a.charAt(i) - '0';
            int bitB = b.charAt(i) - '0' + borrow;

            if (bitA < bitB) {
                bitA += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }

            int bitResult = bitA - bitB;
            result.append(bitResult);
        }

        String finalResult = result.reverse().toString();
        return finalResult.replaceAll("^0+", ""); // Hapus leading zero
    }

    // Method untuk perkalian biner manual
    public static String binaryMultiplication(String a, String b) {
        String result = "0";

        while (b.length() < a.length()) b = "0" + b; // Padding b
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(b.length() - 1 - i) == '1') {
                result = binaryAddition(result, a + "0".repeat(i));
            }
        }

        return result;
    }

    // Method untuk operasi AND manual
    public static String binaryAND(String a, String b) {
        StringBuilder result = new StringBuilder();

        while (a.length() < b.length()) a = "0" + a;
        while (b.length() < a.length()) b = "0" + b;

        for (int i = 0; i < a.length(); i++) {
            result.append((a.charAt(i) - '0') & (b.charAt(i) - '0'));
        }

        return result.toString();
    }

    // Method untuk operasi OR manual
    public static String binaryOR(String a, String b) {
        StringBuilder result = new StringBuilder();

        while (a.length() < b.length()) a = "0" + a;
        while (b.length() < a.length()) b = "0" + b;

        for (int i = 0; i < a.length(); i++) {
            result.append((a.charAt(i) - '0') | (b.charAt(i) - '0'));
        }

        return result.toString();
    }

    // Method untuk operasi XOR manual
    public static String binaryXOR(String a, String b) {
        StringBuilder result = new StringBuilder();

        while (a.length() < b.length()) a = "0" + a;
        while (b.length() < a.length()) b = "0" + b;

        for (int i = 0; i < a.length(); i++) {
            result.append((a.charAt(i) - '0') ^ (b.charAt(i) - '0'));
        }

        return result.toString();
    }
}
