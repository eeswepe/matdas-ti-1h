import java.util.Scanner;
/**
 * Bagian1No2Poin4
 */
public class Bagian1No2Poin4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka biner pertama yang mau ditambahkan: "); 
        String x=sc.next();
        System.out.print("Masukkan angka biner kedua yang mau ditambahkan: ");
        String y=sc.next();

        
        int n1=Integer.parseInt(x, 2);
        int n2=Integer.parseInt(y, 2);

       
        int andResult = n1 & n2;
        int orResult = n1 | n2;
        int xorResult = n1 ^ n2;

      
        String andBinary = Integer.toBinaryString(andResult);
        String orBinary = Integer.toBinaryString(orResult);
        String xorBinary = Integer.toBinaryString(xorResult);

     
        System.out.println("Operasi AND: " + x + " & " + y + " = " + andBinary);
        System.out.println("Operasi OR: " + x + " | " + y + " = " + orBinary);
        System.out.println("Operasi XOR: " + x + " ^ " + y + " = " + xorBinary);
    }
}
 