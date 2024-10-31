import java.util.*;
public class OperasiEnkripsi {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String binary1, binary2, hasilEncryptS = "";
        int x = 0, digit1I, digit2I, l, digit, sum = 0, j = 1;
        char digit1C, digit2C;
        int[] encrypt = new int[32];
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] decimalTemp = new char[16];

        System.out.print("Masukkan kode biner: ");
        binary1 = sc.nextLine();
        System.out.print("Masukkan kode enkripsi: ");
        binary2 = sc.nextLine();
        
        if (binary1.length() > binary2.length()) {
            int gap1 = binary1.length() - binary2.length();
            for (int i = 0; i < gap1; i++) {
                digit1C = binary1.charAt(i);
                digit1I = digit1C - '0';
                encrypt[i] = digit1I;
            }
            for (int i = gap1; i < binary1.length(); i++) {
                digit1C = binary1.charAt(i);
                digit1I = digit1C - '0';
                digit2C = binary2.charAt(x);
                digit2I = digit2C - '0';
                x++;
                encrypt[i] = digit1I ^ digit2I;
            }
            for (int k = 0; k < binary1.length(); k++){
                hasilEncryptS += encrypt[k] + "";
            }
            System.out.println("Hasil enkripsi dalam biner adalah " + hasilEncryptS);
        } else if (binary1.length() < binary2.length()) {
            int gap2 = binary2.length() - binary1.length();
            for (int i = 0; i < gap2; i++) {
                digit2C = binary1.charAt(i);
                digit2I = digit2C - '0';
                encrypt[i] = digit2I;
            }
            for (int i = gap2; i < binary2.length(); i++) {
                digit1C = binary1.charAt(x);
                digit1I = digit1C - '0';
                digit2C = binary2.charAt(i);
                digit2I = digit2C - '0';
                x++;
                encrypt[i] += digit1I ^ digit2I;
            }
            for (int k = 0; k < binary2.length(); k++){
                hasilEncryptS = encrypt[k] + "";
            }
            System.out.println("Hasil enkripsi dalam biner adalah " + hasilEncryptS);
        } else {
            for (int i = 0; i < binary2.length(); i++) {
                digit1C = binary1.charAt(i);
                digit1I = digit1C - '0';
                digit2C = binary2.charAt(i);
                digit2I = digit2C - '0';
                encrypt[i] = digit1I ^ digit2I;
            }
            for (int k = 0; k < binary1.length(); k++){
                hasilEncryptS += encrypt[k] + "";
            }
            System.out.println("Hasil enkripsi dalam biner adalah " + hasilEncryptS);
        }

        // konversi biner ke desimal
        l = hasilEncryptS.length();           
                
        for (int i = 0; i < hasilEncryptS.length(); i++) {
            digit2C = hasilEncryptS.charAt(i);
            digit2I = digit2C - '0';
            sum += (digit2I * Math.pow(2, --l));
        }

        // konversi desimal ke heksadesimal

        for (int i = 0; i < j; i++) {
            digit = sum % 16;
            decimalTemp[i] = hexa[digit];
            sum /= 16;
            if (sum == 0) {
                break;
            }
            j++;
        }

        char[] decimalNew = new char[j];
        System.arraycopy(decimalTemp, 0, decimalNew, 0, j);
                
        System.out.print("Hasil enkripsi dalam heksadesimal adalah: ");
        for (int i = decimalNew.length - 1; i >= 0; i--) {
            System.out.print(decimalNew[i]);
        }
    }
}