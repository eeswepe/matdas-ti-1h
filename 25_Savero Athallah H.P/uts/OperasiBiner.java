import java.util.Scanner;

public class OperasiBiner {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String biner1, biner2;
        System.out.print("Masukkan angka biner pertama : ");
        biner1 = sc.next();

        System.out.print("Masukkan operasi hitung : ");
        char operasi = sc.next().charAt(0);

        System.out.print("Masukkan angka biner kedua : ");
        biner2 = sc.next();

      aritmatikaBiner(biner1, operasi, biner2);

    }

    private static int binaryToDecimal(String biner) {
        int desimal = 0;
        int pangkat = biner.length()-1;
        for (int i = 0; i < biner.length(); i++) {
        int digit = biner.charAt(i) - '0';
        desimal+= digit * Math.pow(2, pangkat);
            pangkat--;
        }
        return desimal;
    }

    private static String desimalToBiner(int desimal) {
        if (desimal == 0) {
            return "0";
        }
        StringBuilder biner = new StringBuilder();
        while (desimal > 0) {
            biner.append(desimal % 2);
            desimal /= 2;
        }
        return biner.reverse().toString();
    }

    public static String aritmatikaBiner (String biner1, char operasi, String biner2) {

       int desimal1 =  binaryToDecimal(biner1);
       int desimal2 = binaryToDecimal(biner2);
       int operasiDesimal = 0;

       switch (operasi) {
        case '*':
        operasiDesimal = desimal1 * desimal2;
        break;
        case '+':
        operasiDesimal = desimal1 + desimal2;
        break;
        case '-':
        operasiDesimal = desimal1 - desimal2;
        break;     
        case '&':
        operasiDesimal = desimal1 & desimal2;
        break;
        case '|':
        operasiDesimal = desimal1 | desimal2;
        break;  
        case '^':
        operasiDesimal = desimal1 ^ desimal2;
        default:
        System.out.println("Operasi tidak valid!");
        return "";
       }
       String hasilBiner = desimalToBiner(operasiDesimal);

       System.out.println(biner1 + " " + operasi + " " + biner2 + " = " + hasilBiner);
       
       return hasilBiner;

    }

    


    
}
