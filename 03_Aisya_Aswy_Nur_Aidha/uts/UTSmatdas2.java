import java.util.Scanner;
public class UTSmatdas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        // Menu pilihan operasi
        System.out.println("Pilih operasi yang diinginkan:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. AND");
        System.out.println("5. OR");
        System.out.println("6. XOR");
        System.out.print("Masukkan pilihan (1-6): ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        // Input bilangan biner pertama
        System.out.print("Masukkan bilangan biner pertama : ");
        String biner1 = sc.nextLine();

        // Input bilangan biner kedua
        System.out.print("Masukkan bilangan biner kedua   : ");
        String biner2 = sc.nextLine();
        
        // Konversi biner ke desimal
        int desimal1 = Integer.parseInt(biner1, 2);
        int desimal2 = Integer.parseInt(biner2, 2);
        
        
        // Variabel untuk menyimpan hasil operasi
        String hasilBiner = "";

        // Melakukan operasi sesuai pilihan
        switch (pilihan) {
            case 1:
                int hasilPenjumlahan = desimal1 + desimal2;
                hasilBiner = Integer.toBinaryString(hasilPenjumlahan);
                System.out.println("Hasil Penjumlahan (biner): " + hasilBiner);
                break;
            case 2:
                int hasilPengurangan = desimal1 - desimal2;
                hasilBiner = Integer.toBinaryString(hasilPengurangan);
                System.out.println("Hasil Pengurangan (biner): " + hasilBiner);
                break;
            case 3:
                int hasilPerkalian = desimal1 * desimal2;
                hasilBiner = Integer.toBinaryString(hasilPerkalian);
                System.out.println("Hasil Perkalian (biner): " + hasilBiner);
                break;
            case 4:
                int hasilAnd = desimal1 & desimal2;
                hasilBiner = Integer.toBinaryString(hasilAnd);
                System.out.println("Hasil AND (biner): " + hasilBiner);
                break;
            case 5:
                int hasilOr = desimal1 | desimal2;
                hasilBiner = Integer.toBinaryString(hasilOr);
                System.out.println("Hasil OR (biner): " + hasilBiner);
                break;
            case 6:
                int hasilXor = desimal1 ^ desimal2;
                hasilBiner = Integer.toBinaryString(hasilXor);
                System.out.println("Hasil XOR (biner): " + hasilBiner);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        sc.close();
    }
}