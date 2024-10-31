import java.util.Scanner;

public class utsmatdasbag3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // untuk menyimpan nilai string
        String binerS, kuncienkripS;

        System.out.print("Masukkan biner pesan: ");
        binerS = sc.nextLine();
        System.out.print("Masukkan kunci enkrip: ");
        kuncienkripS = sc.nextLine();
        System.out.print("Hasil enkripsi: ");
        for (int i = 0; i < binerS.length(); i++) {
            if (binerS.charAt(i) == '1' & kuncienkripS.charAt(i) == '0'
                    | binerS.charAt(i) == '0' & kuncienkripS.charAt(i) == '1') {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
    }
}
