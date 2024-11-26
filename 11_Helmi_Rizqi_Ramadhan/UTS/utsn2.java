import java.util.Scanner;

public class utsn2 {
    public static void main(String[] args) {
        Scanner yae = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("=      Pengoperasian Bilangan Biner     =");
        System.out.println("=========================================");
        System.out.println();
        System.out.println("Pilih jenis operasi pada bilangan biner:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Operasi AND");
        System.out.println("5. Operasi OR");
        System.out.println("6. Operasi XOR");
        System.out.print("Masukkan pilihan Anda (1-6): ");
        int pilihan = yae.nextInt();
        yae.nextLine();

        System.out.println();
        System.out.print("Masukkan bilangan biner pertama: ");
        String biner1 = yae.nextLine();
        System.out.print("Masukkan bilangan biner kedua: ");
        String biner2 = yae.nextLine();

        String hasil = "";
        
        switch (pilihan) {
            case 1: // Penjumlahan
                StringBuilder hasilJumlah = new StringBuilder();
                int carry = 0, i = biner1.length() - 1, j = biner2.length() - 1;

                while (i >= 0 || j >= 0 || carry != 0) {
                    int bitA = (i >= 0) ? biner1.charAt(i--) - '0' : 0;
                    int bitB = (j >= 0) ? biner2.charAt(j--) - '0' : 0;
                    int sum = bitA + bitB + carry;
                    hasilJumlah.insert(0, sum % 2);
                    carry = sum / 2;
                }
                hasil = hasilJumlah.toString();
                break;

            case 2: // Pengurangan
                StringBuilder diffResult = new StringBuilder();
                int borrow = 0;
                i = biner1.length() - 1;
                j = biner2.length() - 1;

                while (i >= 0 || j >= 0) {
                    int bitA = (i >= 0) ? biner1.charAt(i--) - '0' : 0;
                    int bitB = (j >= 0) ? biner2.charAt(j--) - '0' : 0;
                    int diff = bitA - bitB - borrow;
                    if (diff < 0) {
                        diff += 2;
                        borrow = 1;
                    } else {
                        borrow = 0;
                    }
                    diffResult.insert(0, diff);
                }
                hasil = diffResult.toString();
                break;

            case 3: // Perkalian
                String result = "0";
                for (int k = biner2.length() - 1; k >= 0; k--) {
                    if (biner2.charAt(k) == '1') {
                        String temp = biner1;
                        for (int m = 0; m < biner2.length() - 1 - k; m++) {
                            temp += "0";
                        }
                        StringBuilder sumResultMult = new StringBuilder();
                        carry = 0;
                        int p = result.length() - 1;
                        int q = temp.length() - 1;

                        while (p >= 0 || q >= 0 || carry != 0) {
                            int bitA = (p >= 0) ? result.charAt(p--) - '0' : 0;
                            int bitB = (q >= 0) ? temp.charAt(q--) - '0' : 0;
                            int sum = bitA + bitB + carry;
                            sumResultMult.insert(0, sum % 2);
                            carry = sum / 2;
                        }
                        result = sumResultMult.toString();
                    }
                }
                hasil = result;
                break;

            case 4: // Operasi AND
                StringBuilder resultnya = new StringBuilder();
                int maksLengthAnd = Math.max(biner1.length(), biner2.length());
                biner1 = String.format("%" + maksLengthAnd + "s", biner1).replace(' ', '0');
                biner2 = String.format("%" + maksLengthAnd + "s", biner2).replace(' ', '0');

                for (int n = 0; n < maksLengthAnd; n++) {
                    resultnya.append((biner1.charAt(n) == '1' && biner2.charAt(n) == '1') ? "1" : "0");
                }
                hasil = resultnya.toString();
                break;

            case 5: // Operasi OR
                StringBuilder resultnyaOr = new StringBuilder();
                int maksLengthOr = Math.max(biner1.length(), biner2.length());
                biner1 = String.format("%" + maksLengthOr + "s", biner1).replace(' ', '0');
                biner2 = String.format("%" + maksLengthOr + "s", biner2).replace(' ', '0');

                for (int n = 0; n < maksLengthOr; n++) {
                    resultnyaOr.append((biner1.charAt(n) == '1' || biner2.charAt(n) == '1') ? "1" : "0");
                }
                hasil = resultnyaOr.toString();
                break;

            case 6: // Operasi XOR
                StringBuilder resultnyaXor = new StringBuilder();
                int maksLengthXor = Math.max(biner1.length(), biner2.length());
                biner1 = String.format("%" + maksLengthXor + "s", biner1).replace(' ', '0');
                biner2 = String.format("%" + maksLengthXor + "s", biner2).replace(' ', '0');

                for (int n = 0; n < maksLengthXor; n++) {
                    resultnyaXor.append((biner1.charAt(n) != biner2.charAt(n)) ? "1" : "0");
                }
                hasil = resultnyaXor.toString();
                break;

            default:
                hasil = "Pilihan tidak valid.";
        }

        System.out.println("Hasil: " + hasil);
        System.out.println();
        System.out.println("=========================================");
        System.out.println("=         Pengoperasian Selesai         =");
        System.out.println("=========================================");
        yae.close();
    }
}
