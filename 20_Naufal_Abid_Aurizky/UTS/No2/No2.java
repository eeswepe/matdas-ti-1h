package No2;
public class No2 {
    // Fungsi untuk penjumlahan biner
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            result.insert(0, sum % 2);
            carry = sum / 2;
        }
        
        return result.toString();
    }
    
    // Fungsi untuk pengurangan biner
    public static String subtractBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int borrow = 0;
        char[] num1 = a.toCharArray();
        char[] num2 = b.toCharArray();
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        while (i >= 0) {
            int digit1 = num1[i] - '0';
            int digit2 = (j >= 0) ? num2[j] - '0' : 0;
            
            digit1 = digit1 - borrow;
            
            if (digit1 < digit2) {
                digit1 = digit1 + 2;
                borrow = 1;
            } else {
                borrow = 0;
            }
            
            result.insert(0, digit1 - digit2);
            i--;
            j--;
        }
        
        // Menghapus leading zeros
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        
        return result.toString();
    }
    
    // Fungsi untuk perkalian biner
    public static String multiplyBinary(String a, String b) {
        String result = "0";
        String temp = a;
        
        for (int i = b.length() - 1; i >= 0; i--) {
            if (b.charAt(i) == '1') {
                result = addBinary(result, temp);
            }
            temp += "0";
        }
        
        return result;
    }
    
    // Fungsi untuk operasi AND
    public static String andBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());
        
        // Pad dengan nol di depan jika panjangnya berbeda
        a = String.format("%" + maxLength + "s", a).replace(' ', '0');
        b = String.format("%" + maxLength + "s", b).replace(' ', '0');
        
        for (int i = 0; i < maxLength; i++) {
            result.append((a.charAt(i) == '1' && b.charAt(i) == '1') ? '1' : '0');
        }
        
        return result.toString();
    }
    
    // Fungsi untuk operasi OR
    public static String orBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());
        
        a = String.format("%" + maxLength + "s", a).replace(' ', '0');
        b = String.format("%" + maxLength + "s", b).replace(' ', '0');
        
        for (int i = 0; i < maxLength; i++) {
            result.append((a.charAt(i) == '1' || b.charAt(i) == '1') ? '1' : '0');
        }
        
        return result.toString();
    }
    
    // Fungsi untuk operasi XOR
    public static String xorBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());
        
        a = String.format("%" + maxLength + "s", a).replace(' ', '0');
        b = String.format("%" + maxLength + "s", b).replace(' ', '0');
        
        for (int i = 0; i < maxLength; i++) {
            result.append(a.charAt(i) == b.charAt(i) ? '0' : '1');
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        // Test penjumlahan: 110101 + 10111
        String num1 = "110101";
        String num2 = "10111";
        System.out.println("Penjumlahan: " + num1 + " + " + num2 + " = " + addBinary(num1, num2));
        
        // Test pengurangan: 111001 - 10101
        num1 = "111001";
        num2 = "10101";
        System.out.println("Pengurangan: " + num1 + " - " + num2 + " = " + subtractBinary(num1, num2));
        
        // Test perkalian: 1011 × 110
        num1 = "1011";
        num2 = "110";
        System.out.println("Perkalian: " + num1 + " × " + num2 + " = " + multiplyBinary(num1, num2));
        
        // Test operasi logika: 101011 dan 110101
        num1 = "101011";
        num2 = "110101";
        System.out.println("AND: " + num1 + " AND " + num2 + " = " + andBinary(num1, num2));
        System.out.println("OR: " + num1 + " OR " + num2 + " = " + orBinary(num1, num2));
        System.out.println("XOR: " + num1 + " XOR " + num2 + " = " + xorBinary(num1, num2));
    }
}