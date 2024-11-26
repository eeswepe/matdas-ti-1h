import java.util.Scanner;
public class UTS4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pesan dasar: ");
        String pesanDasar = sc.nextLine();
        System.out.print("Kunci: ");
        String kunci = sc.nextLine();
        int intPesanDasar = Integer.valueOf(pesanDasar);
        int intKunci = Integer.valueOf(kunci);
        String [] hasilEnkripsi = new String[pesanDasar.length()];
            for (int l = 0; l < pesanDasar.length(); l++) {
                hasilEnkripsi[l] = "";
                if (pesanDasar.charAt(l) == kunci.charAt(l)) {
                    hasilEnkripsi[l] += "0";
                } else {
                    hasilEnkripsi[l] += "1";
                }
            }
            System.out.print("Hasil enkripsi dalam biner: ");
            for (int l = 0; l < hasilEnkripsi.length; l++) {
                System.out.print(hasilEnkripsi[l]);
            }
            System.out.println();
            System.out.print("Hasil enkripsi dalam heksadesimal: ");
            //ubah ke desimal dulu
            String stringHasilEnkripsi = "";
            for (int i = 0; i < hasilEnkripsi.length; i++) {
                stringHasilEnkripsi += hasilEnkripsi[i];
            }
            int decimalEnkripsi = 0;
                    for (int i = 0; i < stringHasilEnkripsi.length(); i++) {
                        char bit = stringHasilEnkripsi.charAt(stringHasilEnkripsi.length() - 1 - i);
                        if (bit == '1') {
                            decimalEnkripsi += Math.pow(2, i);
                        }
                    }
            //perulangan convert
            char [] listModulusEnkripsi = new char[99];
            int i = 0;
            do {
                int modulus = decimalEnkripsi % 16;
                if (modulus < 10) {
                    listModulusEnkripsi[i] = (char) ('0' + modulus);
                } else {
                    listModulusEnkripsi[i] = (char) ('A' + (modulus - 10));
                    }
                decimalEnkripsi /= 16;
                i++;
            } while (decimalEnkripsi != 0);
            //perulangan print
            for (int j = i-1; j >= 0; j--) {
                System.out.print(listModulusEnkripsi[j]);
            }
        sc.close();
    }
}