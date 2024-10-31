import java.util.Scanner;

public class operasibiner {

    // Fungsi untuk menambahkan dua bilangan biner dalam bentuk String
    public static String tambahBiner(String a, String b) {
        StringBuilder hasil = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;
            int jumlah = bitA + bitB + carry;
            hasil.append(jumlah % 2);
            carry = jumlah / 2;
            i--;
            j--;
        }
        
        return hasil.reverse().toString();
    }

    // Fungsi untuk mengurangi dua bilangan biner dalam bentuk String
    public static String kurangBiner(String a, String b) {
        StringBuilder hasil = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int borrow = 0;

        while (i >= 0 || j >= 0) {
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;
            bitA -= borrow;
            
            if (bitA < bitB) {
                bitA += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }
            
            hasil.append(bitA - bitB);
            i--;
            j--;
        }

        return hasil.reverse().toString().replaceFirst("^0+(?!$)", "");
    }

    // Fungsi untuk mengalikan dua bilangan biner dalam bentuk String
    public static String kaliBiner(String a, String b) {
        String hasil = "0";

        for (int i = b.length() - 1; i >= 0; i--) {
            if (b.charAt(i) == '1') {
                hasil = tambahBiner(hasil, a + "0".repeat(b.length() - 1 - i));
            }
        }

        return hasil.replaceFirst("^0+(?!$)", "");
    }

    // Fungsi untuk operasi AND pada dua bilangan biner
    public static String andBiner(String a, String b) {
        StringBuilder hasil = new StringBuilder();
        int panjang = Math.max(a.length(), b.length());
        
        for (int i = 0; i < panjang; i++) {
            char bitA = (i < a.length()) ? a.charAt(a.length() - 1 - i) : '0';
            char bitB = (i < b.length()) ? b.charAt(b.length() - 1 - i) : '0';
            hasil.append((bitA == '1' && bitB == '1') ? '1' : '0');
        }
        
        return hasil.reverse().toString();
    }

    // Fungsi untuk operasi OR pada dua bilangan biner
    public static String orBiner(String a, String b) {
        StringBuilder hasil = new StringBuilder();
        int panjang = Math.max(a.length(), b.length());
        
        for (int i = 0; i < panjang; i++) {
            char bitA = (i < a.length()) ? a.charAt(a.length() - 1 - i) : '0';
            char bitB = (i < b.length()) ? b.charAt(b.length() - 1 - i) : '0';
            hasil.append((bitA == '1' || bitB == '1') ? '1' : '0');
        }
        
        return hasil.reverse().toString();
    }

    // Fungsi untuk operasi XOR pada dua bilangan biner
    public static String xorBiner(String a, String b) {
        StringBuilder hasil = new StringBuilder();
        int panjang = Math.max(a.length(), b.length());
        
        for (int i = 0; i < panjang; i++) {
            char bitA = (i < a.length()) ? a.charAt(a.length() - 1 - i) : '0';
            char bitB = (i < b.length()) ? b.charAt(b.length() - 1 - i) : '0';
            hasil.append((bitA != bitB) ? '1' : '0');
        }
        
        return hasil.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("| PILIH DARI 4 DAFTAR DIBAWAH INI |");
        System.out.println("|  1. PENJUMLAHAN                 |");
        System.out.println("|  2. PENGURANGAN                 |");
        System.out.println("|  3. PERKALIAN                   |");
        System.out.println("|  4. OPERASI OR, AND, dan XOR    |");
        System.out.println("===================================");
        System.out.println();
        System.out.print("SEBUTKAN ANGKA YANG INGIN DIPILIH : ");
        int daftar = input.nextInt();
        input.nextLine();

        switch (daftar) {
            case 1 :

                // Penjumlahan biner: 110101 + 10111
                String biner1 = "110101";
                String biner2 = "10111";
                System.out.println("Penjumlahan: " + biner1 + " + " + biner2 + " = " + tambahBiner(biner1, biner2));
                
                break;
        
            case 2 :

                // Pengurangan biner: 111001 - 10101
                String biner3 = "111001";
                String biner4 = "10101";
                System.out.println("Pengurangan: " + biner3 + " - " + biner4 + " = " + kurangBiner(biner3, biner4));

                break;
                
            case 3 :

                // Perkalian biner: 1011 * 110
                String biner5 = "1011";
                String biner6 = "110";
                System.out.println("Perkalian: " + biner5 + " * " + biner6 + " = " + kaliBiner(biner5, biner6));

                break;

            case 4 :
                
                // Operasi AND, OR, XOR pada bilangan biner: 101011 dan 110101
                String biner7 = "101011";
                String biner8 = "110101";
                System.out.println("Operasi AND: " + biner7 + " & " + biner8 + " = " + andBiner(biner7, biner8));
                System.out.println("Operasi OR: " + biner7 + " | " + biner8 + " = " + orBiner(biner7, biner8));
                System.out.println("Operasi XOR: " + biner7 + " ^ " + biner8 + " = " + xorBiner(biner7, biner8));

                break;

            default:
                break;
        }
    }
}