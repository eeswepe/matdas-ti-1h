import java.util.Scanner;

public class utsmatdas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Untuk menyimpan biner
        int[] biner = new int[200];
        int index = 0;
        // Digit dalam sistem bilangan heksadesimal
        char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        String hexadec = "0123456789ABCDEF";
        // Untuk menyimpan sisa
        int sisa;
        // Untuk menyimpan hasil
        String heksaHasil = "";
        // untuk menyimpan hasil konversi ke desimal
        int desimal = 0;
        // sebagai variabel bantu pada perulangan
        int digit;
        // untuk mencari angka pangkat 2
        int pangkat = 1;

        System.out.print("Masukkan tipe bilangan yang akan dikonversi (1. desimal 2. biner 3. heksadesimal): ");
        int tipe = sc.nextInt();

        switch (tipe) {
            case 1:
                System.out.print("Masukkan angka anda: ");
                int angka = sc.nextInt();
                int simpanan = angka;
                while (angka > 0) {
                    biner[index++] = angka % 2;
                    angka = angka / 2;
                }
                System.out.print("Bentuk biner: ");
                for (int i = index - 1; i >= 0; i--) {
                    System.out.print(biner[i]);
                }
                System.out.println();
                angka = simpanan;
                while (angka > 0) {
                    sisa = angka % 16;
                    heksaHasil = hex[sisa] + heksaHasil;
                    angka /= 16;

                }
                System.out.print("Bentuk Heksadesimal: " + heksaHasil);
                break;
            case 2:
                System.out.print("Masukkan bilangan biner dari kiri ke kanan (1 dan 0): ");
                angka = sc.nextInt();
                simpanan = angka;

                while (angka != 0) {
                    digit = angka % 10;
                    desimal = desimal + (digit * pangkat);
                    pangkat = pangkat * 2;
                    angka = angka / 10;
                }
                System.out.println("Bentuk desimal: " + desimal);
                while (desimal > 0) {
                    sisa = desimal % 16;
                    heksaHasil = hex[sisa] + heksaHasil;
                    desimal /= 16;
                } System.out.println("Bentuk heksadesimal: " + heksaHasil);
                break;
            case 3 : 
            sc.nextLine();
            System.out.print("Masukkan angka heksadesimal: ");
            String angheksa = sc.nextLine();
            int panjang = angheksa.length();
            int convhex = 0;
            for (int i = 0; i<angheksa.length(); i++) {
                char angheksachar = angheksa.charAt(i);
                int  hexvalue = angheksachar - '0';

                if (angheksachar == 'A') {hexvalue = 10;}
                if (angheksachar == 'B') {hexvalue = 11;}
                if (angheksachar == 'C') {hexvalue = 12;}
                if (angheksachar == 'D') {hexvalue = 13;}
                if (angheksachar == 'E') {hexvalue = 14;}
                if (angheksachar == 'F') {hexvalue = 15;}

                convhex = convhex + (hexvalue * (int) Math.pow(16,--panjang));
            } System.out.println("Bentuk desimal: " + (int) convhex);
            while (convhex > 0) {
                biner[index++] = convhex % 2;
                convhex = convhex / 2;
            }
            System.out.print("Bentuk biner: ");
            for (int i = index - 1; i >= 0; i--) {
                System.out.print(biner[i]);
            }
            
            default:
                break;
        }
    }
}
