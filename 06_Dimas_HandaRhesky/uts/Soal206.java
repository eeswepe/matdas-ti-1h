public class Soal206 {
    public static void main(String[] args) {
        // Deklarasi bilangan biner sebagai string untuk diproses secara manual
        String biner1 = "110101";
        String biner2 = "10111";
        String biner3 = "111001";
        String biner4 = "10101";
        String biner5 = "1011";
        String biner6 = "110";
        String biner7 = "101011";
        String biner8 = "110101";

        // Penjumlahan biner: 110101 + 10111
        StringBuilder hasilPenjumlahan = new StringBuilder();
        int carry = 0, i = biner1.length() - 1, j = biner2.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int bit1 = (i >= 0) ? biner1.charAt(i--) - '0' : 0;
            int bit2 = (j >= 0) ? biner2.charAt(j--) - '0' : 0;
            int sum = bit1 + bit2 + carry;
            hasilPenjumlahan.insert(0, sum % 2);
            carry = sum / 2;
        }
        System.out.println("Penjumlahan biner: " + biner1 + " + " + biner2 + " = " + hasilPenjumlahan);

        // Pengurangan biner: 111001 - 10101
        StringBuilder hasilPengurangan = new StringBuilder();
        carry = 0; i = biner3.length() - 1; j = biner4.length() - 1;
        while (i >= 0 || j >= 0) {
            int bit1 = (i >= 0) ? biner3.charAt(i--) - '0' : 0;
            int bit2 = (j >= 0) ? biner4.charAt(j--) - '0' : 0;
            int diff = bit1 - bit2 - carry;
            if (diff < 0) {
                diff += 2;
                carry = 1;
            } else {
                carry = 0;
            }
            hasilPengurangan.insert(0, diff);
        }
        System.out.println("Pengurangan biner: " + biner3 + " - " + biner4 + " = " + hasilPengurangan);

        // Perkalian biner: 1011 * 110
        StringBuilder hasilPerkalian = new StringBuilder("0");
        for (int k = biner6.length() - 1; k >= 0; k--) {
            if (biner6.charAt(k) == '1') {
                StringBuilder temp = new StringBuilder(biner5);
                for (int l = 0; l < (biner6.length() - 1 - k); l++) {
                    temp.append("0");
                }
                // Tambahkan temp ke hasilPerkalian
                carry = 0;
                StringBuilder tempHasil = new StringBuilder();
                int x = hasilPerkalian.length() - 1, y = temp.length() - 1;
                while (x >= 0 || y >= 0 || carry > 0) {
                    int bitX = (x >= 0) ? hasilPerkalian.charAt(x--) - '0' : 0;
                    int bitY = (y >= 0) ? temp.charAt(y--) - '0' : 0;
                    int sum = bitX + bitY + carry;
                    tempHasil.insert(0, sum % 2);
                    carry = sum / 2;
                }
                hasilPerkalian = tempHasil;
            }
        }
        System.out.println("Perkalian biner: " + biner5 + " * " + biner6 + " = " + hasilPerkalian);

        // Operasi AND, OR, XOR pada 101011 dan 110101
        StringBuilder hasilAND = new StringBuilder();
        StringBuilder hasilOR = new StringBuilder();
        StringBuilder hasilXOR = new StringBuilder();
        i = biner7.length() - 1;
        j = biner8.length() - 1;
        while (i >= 0 || j >= 0) {
            int bit1 = (i >= 0) ? biner7.charAt(i--) - '0' : 0;
            int bit2 = (j >= 0) ? biner8.charAt(j--) - '0' : 0;
            hasilAND.insert(0, (bit1 & bit2));
            hasilOR.insert(0, (bit1 | bit2));
            hasilXOR.insert(0, (bit1 ^ bit2));
        }
        System.out.println("Operasi AND: " + biner7 + " & " + biner8 + " = " + hasilAND);
        System.out.println("Operasi OR: " + biner7 + " | " + biner8 + " = " + hasilOR);
        System.out.println("Operasi XOR: " + biner7 + " ^ " + biner8 + " = " + hasilXOR);
    }
}
