import java.util.Scanner;

public class matdas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n=== SOAL 2.1 ===");
        System.out.println("Masukkan angka biner1: ");
        String angkaBiner1 = input.next();
        System.out.println("Masukkan angka biner2: ");
        String angkaBiner2 = input.next();
        System.out.println("Penjumlahan: " + angkaBiner1 + " + " + angkaBiner2);
        System.out.println("Hasil: " + tambahBiner(angkaBiner1, angkaBiner2));
        
        System.out.println("\n=== SOAL 2.2 ===");
        System.out.println("Masukkan angka biner3: ");
        String angkaBiner3 = input.next();
        System.out.println("Masukkan angka biner4: ");
        String angkaBiner4 = input.next();
        System.out.println("Pengurangan: " + angkaBiner3 + " - " + angkaBiner4);
        System.out.println("Hasil: " + kurangBiner(angkaBiner3, angkaBiner4));
        
        System.out.println("\n=== SOAL 2.3 ===");
        System.out.println("Masukkan angka biner5: ");
        String angkaBiner5 = input.next();
        System.out.println("Masukkan angka biner6: ");
        String angkaBiner6 = input.next();
        System.out.println("Perkalian: " + angkaBiner5 + " × " + angkaBiner6);
        System.out.println("Hasil: " + kaliBiner(angkaBiner5, angkaBiner6));
        
        System.out.println("\n=== SOAL 2.4 ===");
        System.out.println("Masukkan angka biner7: ");
        String angkaBiner7 = input.next();
        System.out.println("Masukkan angka biner8: ");
        String angkaBiner8 = input.next();
        System.out.println("Operasi Logika pada " + angkaBiner7 + " dan " + angkaBiner8 + ":");
        System.out.println("AND: " + operasiAND(angkaBiner7, angkaBiner8));
        System.out.println("OR: " + operasiOR(angkaBiner7, angkaBiner8));
        System.out.println("XOR: " + operasiXOR(angkaBiner7, angkaBiner8));
    }

    public static String desimalKeBiner(int decimal) {
        String binary = "";
        int temp = decimal;
        
        while(temp > 0) {
            binary = (temp % 2) + binary;
            temp = temp / 2;
        }
        return binary;
    }

    public static String tambahBiner(String a, String b) {
        String result = "";
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            result = (sum % 2) + result;
            carry = sum / 2;
        }
        return result;
    }    
    
    public static String kurangBiner(String a, String b) {
        String result = "";
        int borrow = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        while (i >= 0) {
            int digitA = a.charAt(i) - '0';
            int digitB = j >= 0 ? b.charAt(j) - '0' : 0;
            
            digitA -= borrow;
            if (digitA < digitB) {
                digitA += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }
            
            result = (digitA - digitB) + result;
            i--;
            j--;
        }
        return result;
    }    
    
    public static String kaliBiner(String a, String b) {
        int num1 = stringKeInteger(a);
        int num2 = stringKeInteger(b);
        int product = num1 * num2;
        return desimalKeBiner(product);
    }

    public static int stringKeInteger(String str){
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (c >= '0' && c <= '9') {
                int digit = c - '0';
                result = result * 10 + digit;
            } else {
                return result;
            }
        }
        return result;
    }
    
    public static String operasiAND(String a, String b) {
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            result = result + ((a.charAt(i) == '1' && b.charAt(i) == '1') ? '1' : '0');
        }
        return result;
    }
    
    public static String operasiOR(String a, String b) {
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            result = result + ((a.charAt(i) == '1' || b.charAt(i) == '1') ? '1' : '0');
        }
        return result;
    }
    
    public static String operasiXOR(String biner, String kunci) {
        String hasil = "";
        for(int i = 0; i < biner.length(); i++) {
            if(biner.charAt(i) != kunci.charAt(i)) {
                hasil = hasil + "1";
            } else {
                hasil = hasil + "0";
            }
        }
        return hasil;
    }    
}