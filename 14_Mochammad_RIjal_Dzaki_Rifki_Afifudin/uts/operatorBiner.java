import java.util.Scanner;

public class operatorBiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPilih menu operator :");
            System.out.println("1. Tambah (+)");
            System.out.println("2. Kurang (-)");
            System.out.println("3. Kali (x)");
            System.out.println("4. AND");
            System.out.println("5. OR");
            
            System.out.println("6. XOR");
            System.out.println("7. Keluar");

            System.out.print("\nMasukkan pilihan (1-7): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan bilangan biner pertama: ");
                    String binertambah1 = scanner.nextLine();
                    System.out.print("Masukkan bilangan biner kedua: ");
                    String binertambah2 = scanner.nextLine();
                    String hasilTambah = tambahBiner(binertambah1, binertambah2);
                    System.out.println("Hasil operasi pertambahan : " + hasilTambah);
                    break;

                case 2:
                    System.out.print("Masukkan bilangan biner pertama: ");
                    String binerkurang1 = scanner.nextLine();
                    System.out.print("Masukkan bilangan biner kedua: ");
                    String binerkurang2 = scanner.nextLine();
                    String hasilKurang = kurangBiner(binerkurang1, binerkurang2);
                    System.out.println("Hasil operasi pengurangan : " + hasilKurang);
                    break;

                case 3:
                    System.out.print("Masukkan bilangan biner pertama: ");
                    String binerkali1 = scanner.nextLine();
                    System.out.print("Masukkan bilangan biner kedua: ");
                    String binerkali2 = scanner.nextLine();
                    String hasilKali = kaliBiner(binerkali1, binerkali2);
                    System.out.println("Hasil operasi perkalian : " + hasilKali);
                    break;

                case 4:
                    System.out.print("Masukkan bilangan biner pertama: ");
                    String binerAND1 = scanner.nextLine();
                    System.out.print("Masukkan bilangan biner kedua: ");
                    String binerAND2 = scanner.nextLine();
                    String hasilAND = andBiner(binerAND1, binerAND2);
                    System.out.println("Hasil operasi AND : " + hasilAND);
                    break;

                case 5:
                    System.out.print("Masukkan bilangan biner pertama: ");
                    String binerOR1 = scanner.nextLine();
                    System.out.print("Masukkan bilangan biner kedua: ");
                    String binerOR2 = scanner.nextLine();
                    String hasilOR = orBiner(binerOR1, binerOR2);
                    System.out.println("Hasil operasi OR : " + hasilOR);
                    break;

                case 6:
                    System.out.print("Masukkan bilangan biner pertama: ");
                    String binerXOR1 = scanner.nextLine();
                    System.out.print("Masukkan bilangan biner kedua: ");
                    String binerXOR2 = scanner.nextLine();
                    String hasilXOR = xorBiner(binerXOR1, binerXOR2);
                    System.out.println("Hasil operasi XOR : " + hasilXOR);
                    break;

                case 7:
                    System.out.println("Program selesai.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    // Konversi biner ke desimal manual
    static int konversiBinerKeDesimal(String biner) {
        int desimal = 0;
        int panjang = biner.length();
        
        for (int i = 0; i < panjang; i++) {
            if (biner.charAt(panjang - 1 - i) == '1') {
                desimal += Math.pow(2, i);
            }
        }
        
        return desimal;
    }

    // Konversi desimal ke biner manual
    static String konversiDesimalKeBiner(int desimal) {
        if (desimal == 0) return "0";
        
        String biner = "";
        while (desimal > 0) {
            biner = (desimal % 2) + biner;
            desimal /= 2;
        }
        
        return biner;
    }

    // Tambah biner
    static String tambahBiner(String a, String b) {
        int desimal1 = konversiBinerKeDesimal(a);
        int desimal2 = konversiBinerKeDesimal(b);
        int hasilDesimal = desimal1 + desimal2;
        return konversiDesimalKeBiner(hasilDesimal);
    }

    // Kurang biner
    static String kurangBiner(String a, String b) {
        int desimal1 = konversiBinerKeDesimal(a);
        int desimal2 = konversiBinerKeDesimal(b);
        int hasilDesimal = desimal1 - desimal2;
        return konversiDesimalKeBiner(hasilDesimal);
    }

    // Kali biner
    static String kaliBiner(String a, String b) {
        int desimal1 = konversiBinerKeDesimal(a);
        int desimal2 = konversiBinerKeDesimal(b);
        int hasilDesimal = desimal1 * desimal2;
        return konversiDesimalKeBiner(hasilDesimal);
    }

    // AND biner
    static String andBiner(String a, String b) {
        int desimal1 = konversiBinerKeDesimal(a);
        int desimal2 = konversiBinerKeDesimal(b);
        int hasilDesimal = desimal1 & desimal2;
        return konversiDesimalKeBiner(hasilDesimal);
    }

    // OR biner
    static String orBiner(String a, String b) {
        int desimal1 = konversiBinerKeDesimal(a);
        int desimal2 = konversiBinerKeDesimal(b);
        int hasilDesimal = desimal1 | desimal2;
        return konversiDesimalKeBiner(hasilDesimal);
    }

    // XOR biner
    static String xorBiner(String a, String b) {
        int desimal1 = konversiBinerKeDesimal(a);
        int desimal2 = konversiBinerKeDesimal(b);
        int hasilDesimal = desimal1 ^ desimal2;
        return konversiDesimalKeBiner(hasilDesimal);
    }
}