import java.util.Scanner;

public class no2 {

    // Operasi penjumlahan biner manual
    public static String binaryAddition(String bin1, String bin2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int maxLength = Math.max(bin1.length(), bin2.length());

        for (int i = 0; i < maxLength; i++) {
            int bit1 = (i < bin1.length()) ? bin1.charAt(bin1.length() - 1 - i) - '0' : 0;
            int bit2 = (i < bin2.length()) ? bin2.charAt(bin2.length() - 1 - i) - '0' : 0;

            int sum = bit1 + bit2 + carry;
            result.insert(0, sum % 2);  // Masukkan bit hasil penjumlahan di depan
            carry = sum / 2; // Hitung carry untuk iterasi berikutnya
        }

        if (carry != 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }

    // Operasi pengurangan biner manual
    public static String binarySubtraction(String bin1, String bin2) {
        StringBuilder result = new StringBuilder();
        int borrow = 0;

        for (int i = 0; i < bin1.length(); i++) {
            int bit1 = bin1.charAt(bin1.length() - 1 - i) - '0';
            int bit2 = (i < bin2.length()) ? bin2.charAt(bin2.length() - 1 - i) - '0' : 0;

            int diff = bit1 - bit2 - borrow;

            if (diff < 0) {
                diff += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result.insert(0, diff);
        }

        return result.toString();
    }

    public static String addZeros(String str, int count) {
        StringBuilder result = new StringBuilder(str);
        for (int i = 0; i < count; i++) {
            result.append("0");
        }
        return result.toString();
    }
    
    public static String binaryMultiplication(String bin1, String bin2) {
        String result = "0";
        int shift = 0;
    
        for (int i = bin2.length() - 1; i >= 0; i--) {
            if (bin2.charAt(i) == '1') {
                String partialProduct = addZeros(bin1, shift);  // Menambahkan 0 secara manual
                result = binaryAddition(result, partialProduct);
            }
            shift++;
        }
    
        return result;
    }
    

    // Operasi AND biner manual
    public static String binaryAnd(String bin1, String bin2) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(bin1.length(), bin2.length());

        for (int i = 0; i < maxLength; i++) {
            int bit1 = (i < bin1.length()) ? bin1.charAt(bin1.length() - 1 - i) - '0' : 0;
            int bit2 = (i < bin2.length()) ? bin2.charAt(bin2.length() - 1 - i) - '0' : 0;

            result.insert(0, (bit1 & bit2));
        }

        return result.toString();
    }

    // Operasi OR biner manual
    public static String binaryOr(String bin1, String bin2) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(bin1.length(), bin2.length());

        for (int i = 0; i < maxLength; i++) {
            int bit1 = (i < bin1.length()) ? bin1.charAt(bin1.length() - 1 - i) - '0' : 0;
            int bit2 = (i < bin2.length()) ? bin2.charAt(bin2.length() - 1 - i) - '0' : 0;

            result.insert(0, (bit1 | bit2));
        }

        return result.toString();
    }

    // Operasi XOR biner manual
    public static String binaryXor(String bin1, String bin2) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(bin1.length(), bin2.length());

        for (int i = 0; i < maxLength; i++) {
            int bit1 = (i < bin1.length()) ? bin1.charAt(bin1.length() - 1 - i) - '0' : 0;
            int bit2 = (i < bin2.length()) ? bin2.charAt(bin2.length() - 1 - i) - '0' : 0;

            result.insert(0, (bit1 ^ bit2));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueOperations = true;

        while (continueOperations) {
            System.out.println("\nPilih operasi biner:");
            System.out.println("1. Penjumlahan Biner");
            System.out.println("2. Pengurangan Biner");
            System.out.println("3. Perkalian Biner");
            System.out.println("4. Operasi AND Biner");
            System.out.println("5. Operasi OR Biner");
            System.out.println("6. Operasi XOR Biner");
            System.out.println("7. Keluar");

            System.out.print("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 6) {
                System.out.print("Masukkan bilangan biner pertama: ");
                String bin1 = scanner.next();
                System.out.print("Masukkan bilangan biner kedua: ");
                String bin2 = scanner.next();

                switch (choice) {
                    case 1:
                        System.out.println("Hasil Penjumlahan: " + binaryAddition(bin1, bin2));
                        break;

                    case 2:
                        System.out.println("Hasil Pengurangan: " + binarySubtraction(bin1, bin2));
                        break;

                    case 3:
                        System.out.println("Hasil Perkalian: " + binaryMultiplication(bin1, bin2));
                        break;

                    case 4:
                        System.out.println("Hasil AND: " + binaryAnd(bin1, bin2));
                        break;

                    case 5:
                        System.out.println("Hasil OR: " + binaryOr(bin1, bin2));
                        break;

                    case 6:
                        System.out.println("Hasil XOR: " + binaryXor(bin1, bin2));
                        break;
                }
            } else if (choice == 7) {
                System.out.println("Terima kasih! Program selesai.");
                continueOperations = false;
            } else {
                System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
        scanner.close();
    }
}
