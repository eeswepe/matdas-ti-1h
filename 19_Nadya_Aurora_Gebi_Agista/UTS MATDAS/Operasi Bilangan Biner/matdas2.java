import java.util.Scanner;
public class matdas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            System.out.println("\nPilih operasi:");
            System.out.println("1. Penjumlahan Biner");
            System.out.println("2. Pengurangan Biner");
            System.out.println("3. Perkalian Biner");
            System.out.println("4. Operasi AND, OR, XOR");
            System.out.print("Masukkan pilihan (1-4): ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan < 1 || pilihan > 4) {
                System.out.println("Pilihan tidak valid!");
                return; 
            }

            System.out.print("Masukkan bilangan biner pertama : ");
            String biner1 = scanner.nextLine();
            System.out.print("Masukkan bilangan biner kedua   : ");
            String biner2 = scanner.nextLine();

            // Konversi biner ke desimal
            int bil1 = binerDesimal(biner1);
            int bil2 = binerDesimal(biner2);

            if (bil1 == -1 || bil2 == -1) {
                System.out.println("Tidak valid. Silakan coba lagi!");
                return;
            }

            switch (pilihan) {
                case 1: // Penjumlahan
                    int penjumlahan = bil1 + bil2;
                    System.out.println("HASIL: ");
                    System.out.println( biner1 + " + " + biner2 + " = " + desimalBiner(penjumlahan));
                    break;
                case 2: // Pengurangan
                    int pengurangan = bil1 - bil2;
                    if (pengurangan < 0) {
                        System.out.println("Hasil pengurangan negatif. Periksa kembali inputnya.");
                    } else {
                        System.out.println("HASIL: ");
                        System.out.println(biner1 + " - " + biner2 + " = " + desimalBiner(pengurangan));
                    }
                    break;
                case 3: // Perkalian
                    int perkalian = bil1 * bil2;
                    System.out.println("HASIL: " );
                    System.out.println( biner1 + " * " + biner2 + " = " + desimalBiner(perkalian));
                    break;
                case 4: // Operasi logika AND, OR, XOR
                    System.out.println("HASIL AND" + " = " + desimalBiner(bil1 & bil2));
                    System.out.println("HASIL OR " + " = " + desimalBiner(bil1 | bil2));
                    System.out.println("HASIL XOR" + " = " + desimalBiner(bil1 ^ bil2));
                    break;
                default:
                    System.out.println("Pilihan invalid");
                    break;
            }
        }
    
    // Konversi biner ke desimal
    public static int binerDesimal(String biner) {
        int desimal = 0;
        for (int i = 0; i < biner.length(); i++) {
            char bit = biner.charAt(biner.length() - 1 - i);
            if (bit == '1') {
                desimal += (1 << i); 
            } else if (bit != '0') {
                return -1; 
            }
        }
        return desimal;
    }

    // Konversi desimal ke biner
    public static String desimalBiner(int desimal) {
        if (desimal == 0) return "0";
        String hasil = "";
        while (desimal > 0) {
            hasil = (desimal % 2) + hasil;
            desimal /= 2;
        }
        return hasil;
    }
}