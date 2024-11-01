import java.util.Scanner;

public class utsn4 {
    public static void main(String[] args) {
        Scanner sucrose = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("=              Operasi Enkripsi             =");
        System.out.println("=============================================");
        System.out.println();
        // Input bilangan biner pertama, kedua, dan kunci
        System.out.print("Masukkan bilangan biner pertama: ");
        String biner1 = sucrose.nextLine();
        System.out.print("Masukkan bilangan biner kedua: ");
        String biner2 = sucrose.nextLine();
        System.out.print("Masukkan kunci enkripsi (biner): ");
        String kunci = sucrose.nextLine();

        // Proses enkripsi dan tampilkan hasil
        for (String biner : new String[]{biner1, biner2}) {
            StringBuilder hasilBiner = new StringBuilder();
            String heksadesimal = "";

            // Operasi XOR dan konversi ke biner dan heksadesimal sekaligus
            for (int i = 0; i < biner.length(); i++) {
                // Operasi XOR
                char bit = biner.charAt(i);
                char keyBit = kunci.charAt(i);
                char xorResult = (bit == keyBit) ? '0' : '1';
                hasilBiner.append(xorResult);

                // Setiap 4 bit, konversi ke heksadesimal
                if ((i + 1) % 4 == 0) {
                    int nilai = 0;
                    if (hasilBiner.charAt(i - 3) == '1') nilai += 8;
                    if (hasilBiner.charAt(i - 2) == '1') nilai += 4;
                    if (hasilBiner.charAt(i - 1) == '1') nilai += 2;
                    if (hasilBiner.charAt(i) == '1') nilai += 1;

                    heksadesimal += (nilai < 10) ? (char) ('0' + nilai) : (char) ('A' + (nilai - 10));
                }
            }

            // Cetak hasil enkripsi dalam format biner dan heksadesimal
            System.out.println("\nHasil Enkripsi untuk bilangan biner " + biner + ":");
            System.out.println("Biner: " + hasilBiner);
            System.out.println("Heksadesimal: " + heksadesimal);
        }
        System.out.println();
        System.out.println("=============================================");
        System.out.println("=          Operasi Enkripsi Selesai         =");
        System.out.println("=============================================");

        sucrose.close();
    }
}
