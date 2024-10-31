import java.util.Scanner;

public class utsmatdasbag3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // untuk menyimpan nilai string
        String binerS, kuncienkripS;
        //untuk menyimpan nilai heksa desimal
        char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        // untuk variabel pada loop int
        int desimal = 0, pangkat = 1, digit, sisa;
        String heksaHasil = "";

        System.out.print("Masukkan biner pesan: ");
        binerS = sc.nextLine();
        System.out.print("Masukkan kunci enkrip: ");
        kuncienkripS = sc.nextLine();
        System.out.println();
        System.out.print("Hasil enkripsi: ");
        for (int i = 0; i < binerS.length(); i++) {
            if (binerS.charAt(i) == '1' & kuncienkripS.charAt(i) == '0'
                    | binerS.charAt(i) == '0' & kuncienkripS.charAt(i) == '1') {
                        System.out.print(1);
            } else {
                System.out.print(0);
            }
        } System.out.println();
        System.out.print("Masukkan hasil enkrip yang tampil di layar: ");
        int angka = sc.nextInt();

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

    }
}
