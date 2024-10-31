import java.util.Scanner;

public class utsmatdasbag1no2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // untuk menyimpan nilai biner
        int biner, biner2;
        // untuk menampilkan hasil
        int[] hasil = new int[200];
        // untuk mencari index
        int index = 0;
        // untuk mencari angka pangkat 2
        int pangkat = 1, pangkat2 = 1;
        // untuk menentukan operasi
        int operasi;
        // untuk variable bantu pada perulangan
        int digit = 0, digit2 = 0;
        // untuk menyimpan nilai desimal
        int desimal = 0, desimal2 = 0;
        // untuk menyimpan hasil setelah operasi
        int desimal3;
        // untuk menyimpan hasil dengan operator logika
        int loghasil;
        // untuk menyimpan nilai string
        String biners, biner2s;


        System.out.print("Masukkang angka biner ke-1 (1 dan 0): ");
        biner = sc.nextInt();
        System.out.print("Masukkan angka biner ke-2 (1 dan 0): ");
        biner2 = sc.nextInt();
        System.out.print("Masukkan operasi yang diinginkan (1. + 2. - 3. x 4. and 5. or 6.xor): ");
        operasi = sc.nextInt();

        System.out.println(biner + " dan " + biner2);

        switch (operasi) {
            case 1:
                while (biner != 0) {
                    digit = biner % 10;
                    desimal = desimal + (digit * pangkat);
                    pangkat = pangkat * 2;
                    biner = biner / 10;
                }

                while (biner2 != 0) {
                    digit2 = biner2 % 10;
                    desimal2 = desimal2 + (digit2 * pangkat2);
                    pangkat2 = pangkat2 * 2;
                    biner2 = biner2 / 10;
                }
                desimal3 = desimal + desimal2;
                while (desimal3 > 0) {
                    hasil[index++] = desimal3 % 2;
                    desimal3 = desimal3 / 2;
                }
                System.out.print("hasil akhir penjumlahan: ");
                for (int i = index - 1; i >= 0; i--) {
                    System.out.print(hasil[i]);
                }
                break;
            case 2:
                while (biner != 0) {
                    digit = biner % 10;
                    desimal = desimal + (digit * pangkat);
                    pangkat = pangkat * 2;
                    biner = biner / 10;
                }

                while (biner2 != 0) {
                    digit2 = biner2 % 10;
                    desimal2 = desimal2 + (digit2 * pangkat2);
                    pangkat2 = pangkat2 * 2;
                    biner2 = biner2 / 10;
                }
                desimal3 = desimal - desimal2;
                while (desimal3 > 0) {
                    hasil[index++] = desimal3 % 2;
                    desimal3 = desimal3 / 2;
                }
                System.out.print("hasil akhir pengurangan: ");
                for (int i = index - 1; i >= 0; i--) {
                    System.out.print(hasil[i]);
                }
                break;
            case 3:
                while (biner != 0) {
                    digit = biner % 10;
                    desimal = desimal + (digit * pangkat);
                    pangkat = pangkat * 2;
                    biner = biner / 10;
                }

                while (biner2 != 0) {
                    digit2 = biner2 % 10;
                    desimal2 = desimal2 + (digit2 * pangkat2);
                    pangkat2 = pangkat2 * 2;
                    biner2 = biner2 / 10;
                }
                desimal3 = desimal * desimal2;
                while (desimal3 > 0) {
                    hasil[index++] = desimal3 % 2;
                    desimal3 = desimal3 / 2;
                }
                System.out.print("hasil akhir perkalian: ");
                for (int i = index - 1; i >= 0; i--) {
                    System.out.print(hasil[i]);
                }
                break;
            case 4:
                biners = Integer.toString(biner);
                biner2s = Integer.toString(biner2);
                for (int i = 0; i < biners.length(); i++) {
                    if (biners.charAt(i) == '1' && biner2s.charAt(i) == '1') {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }
                break;
            case 5:
                biners = Integer.toString(biner);
                biner2s = Integer.toString(biner2);
                for (int i = 0; i < biners.length(); i++) {
                    if (biners.charAt(i) == '1' | biner2s.charAt(i) == '1') {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }
                break;
            case 6:
                biners = Integer.toString(biner);
                biner2s = Integer.toString(biner2);
                for (int i = 0; i < biners.length(); i++) {
                    if (biners.charAt(i) == '1' & biner2s.charAt(i) == '0'
                            | biners.charAt(i) == '0' & biner2s.charAt(i) == '1') {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }
                break;
            default:
                break;
        }

    }
}
