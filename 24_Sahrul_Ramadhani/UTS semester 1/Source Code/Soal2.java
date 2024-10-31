import java.util.Scanner;

public class Soal2 {

    // Metode untuk menjumlahkan dua bilangan biner
    public static String tambahBiner(String biner1, String biner2) {
        StringBuilder hasil = new StringBuilder();
        int panjang1 = biner1.length();
        int panjang2 = biner2.length();
        
        int i = panjang1 - 1;
        int j = panjang2 - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int bit1 = (i >= 0) ? biner1.charAt(i--) - '0' : 0;
            int bit2 = (j >= 0) ? biner2.charAt(j--) - '0' : 0;

            int jumlah = bit1 + bit2 + carry;
            hasil.insert(0, jumlah % 2);
            carry = jumlah / 2;
        }
        return hasil.toString();
    }

    // Metode untuk mengurangi dua bilangan biner
    public static String kurangiBiner(String biner1, String biner2) {
        StringBuilder hasil = new StringBuilder();
        int panjang1 = biner1.length();
        int panjang2 = biner2.length();
        
        int i = panjang1 - 1;
        int j = panjang2 - 1;
        int borrow = 0;

        while (i >= 0 || j >= 0) {
            int bit1 = (i >= 0) ? biner1.charAt(i--) - '0' : 0;
            int bit2 = (j >= 0) ? biner2.charAt(j--) - '0' : 0;

            bit1 -= borrow;
            if (bit1 < bit2) {
                bit1 += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }
            hasil.insert(0, bit1 - bit2);
        }

        while (hasil.length() > 1 && hasil.charAt(0) == '0') {
            hasil.deleteCharAt(0);
        }
        
        return hasil.toString();
    }

    // Metode untuk mengalikan dua bilangan biner
    public static String kaliBiner(String biner1, String biner2) {
        String hasil = "0";
        int panjang2 = biner2.length();

        for (int i = panjang2 - 1; i >= 0; i--) {
            if (biner2.charAt(i) == '1') {
                hasil = tambahBiner(hasil, biner1 + "0".repeat(panjang2 - 1 - i));
            }
        }
        
        return hasil;
    }

    // Metode untuk melakukan operasi bitwise
    public static void operasiBitwise(String biner1, String biner2) {
        int num1 = Integer.parseInt(biner1, 2);
        int num2 = Integer.parseInt(biner2, 2);

        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;

        System.out.println("Hasil Operasi Bitwise:");
        System.out.println("AND: " + Integer.toBinaryString(andResult) + " (Desimal: " + andResult + ")");
        System.out.println("OR: " + Integer.toBinaryString(orResult) + " (Desimal: " + orResult + ")");
        System.out.println("XOR: " + Integer.toBinaryString(xorResult) + " (Desimal: " + xorResult + ")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis operasi biner:");
        System.out.println("1. Penjumlahan Biner");
        System.out.println("2. Pengurangan Biner");
        System.out.println("3. Perkalian Biner");
        System.out.println("4. Operasi Bitwise (AND, OR, XOR)");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();  // Mengonsumsi newline

        switch (pilihan) {
            case 1 -> {
                System.out.print("Masukkan bilangan biner pertama: ");
                String biner1 = scanner.nextLine();
                System.out.print("Masukkan bilangan biner kedua: ");
                String biner2 = scanner.nextLine();
                System.out.println("Hasil Penjumlahan: " + tambahBiner(biner1, biner2));
            }
            case 2 -> {
                System.out.print("Masukkan bilangan biner pertama: ");
                String biner1 = scanner.nextLine();
                System.out.print("Masukkan bilangan biner kedua: ");
                String biner2 = scanner.nextLine();
                System.out.println("Hasil Pengurangan: " + kurangiBiner(biner1, biner2));
            }
            case 3 -> {
                System.out.print("Masukkan bilangan biner pertama: ");
                String biner1 = scanner.nextLine();
                System.out.print("Masukkan bilangan biner kedua: ");
                String biner2 = scanner.nextLine();
                System.out.println("Hasil Perkalian: " + kaliBiner(biner1, biner2));
            }
            case 4 -> {
                System.out.print("Masukkan bilangan biner pertama: ");
                String biner1 = scanner.nextLine();
                System.out.print("Masukkan bilangan biner kedua: ");
                String biner2 = scanner.nextLine();
                operasiBitwise(biner1, biner2);
            }
            default -> System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
