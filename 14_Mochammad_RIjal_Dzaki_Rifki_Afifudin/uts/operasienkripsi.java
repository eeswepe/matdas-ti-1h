import java.util.Scanner;

public class operasienkripsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input bilangan biner pertama
        System.out.println("Masukkan Bilangan Biner Pertama (8 bit):");
        String binaryInput1 = scanner.nextLine();
        while (binaryInput1.length() != 8 || !binaryInput1.matches("[01]+")) {
            System.out.println("Masukkan hanya 0 atau 1 sepanjang 8 bit!");
            binaryInput1 = scanner.nextLine();
        }
        char[] input1 = binaryInput1.toCharArray();

        // Input bilangan biner kedua
        System.out.println("Masukkan Bilangan Biner Kedua (8 bit):");
        String binaryInput2 = scanner.nextLine();
        while (binaryInput2.length() != 8 || !binaryInput2.matches("[01]+")) {
            System.out.println("Masukkan hanya 0 atau 1 sepanjang 8 bit!");
            binaryInput2 = scanner.nextLine();
        }
        char[] input2 = binaryInput2.toCharArray();

        // Input kunci enkripsi
        System.out.println("Masukkan Kunci Enkripsi (8 bit):");
        String kunciInput = scanner.nextLine();
        while (kunciInput.length() != 8 || !kunciInput.matches("[01]+")) {
            System.out.println("Masukkan hanya 0 atau 1 sepanjang 8 bit!");
            kunciInput = scanner.nextLine();
        }
        char[] kunci = kunciInput.toCharArray();

        // Array untuk menyimpan hasil enkripsi
        char[] hasilEnkripsi1 = new char[8];
        char[] hasilEnkripsi2 = new char[8];

        // Proses XOR manual untuk input pertama
        for (int i = 0; i < 8; i++) {
            hasilEnkripsi1[i] = input1[i] == kunci[i] ? '0' : '1';
        }

        // Proses XOR manual untuk input kedua
        for (int i = 0; i < 8; i++) {
            hasilEnkripsi2[i] = input2[i] == kunci[i] ? '0' : '1';
        }

        // Konversi manual biner ke desimal untuk input pertama
        int desimal1 = Integer.parseInt(String.valueOf(hasilEnkripsi1), 2);
        
        // Konversi manual biner ke desimal untuk input kedua
        int desimal2 = Integer.parseInt(String.valueOf(hasilEnkripsi2), 2);

        // Konversi desimal ke heksadesimal
        String heksa1 = String.format("%02X", desimal1);
        String heksa2 = String.format("%02X", desimal2);

        // Tampilkan hasil
        System.out.println("\n--- Input ---");
        System.out.println("Bilangan Biner 1: " + binaryInput1);
        System.out.println("Bilangan Biner 2: " + binaryInput2);
        System.out.println("Kunci: " + kunciInput);

        System.out.println("\n--- Hasil Enkripsi ---");
        System.out.println("Hasil Biner 1: " + String.valueOf(hasilEnkripsi1));
        System.out.println("Hasil Heksa 1: " + heksa1);

        System.out.println("\nHasil Biner 2: " + String.valueOf(hasilEnkripsi2));
        System.out.println("Hasil Heksa 2: " + heksa2);

    }
}