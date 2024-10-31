import java.util.Scanner;
public class matdas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan biner untuk dienkripsi: ");
        String biner = scanner.nextLine();
        System.out.print("Masukkan kunci biner: ");
        String kunciBiner = scanner.nextLine();

        int bilBiner = binerDesimal(biner);
        int kunci = binerDesimal(kunciBiner);
        int hasilXOR = bilBiner ^ kunci;

        System.out.println("\n---------- HASIL ENKRIPSI ----------");
        System.out.println("Bilangan Biner            : " + biner);
        System.out.println("Kunci                     : " + kunciBiner);
        
        String hasilBiner = "";
        int tempBiner = hasilXOR;
        if(tempBiner == 0) {
            hasilBiner = "0";
        } else {
            while(tempBiner > 0) {
                hasilBiner = (tempBiner % 2) + hasilBiner;
                tempBiner = tempBiner / 2;
            }
        }

        String hasilHexa = "";
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        if(hasilXOR == 0) {
            hasilHexa = "0";
        } else {
            while(hasilXOR > 0) {
                hasilHexa = hexChars[hasilXOR % 16] + hasilHexa;
                hasilXOR = hasilXOR / 16;
            }
        }

        System.out.println("Hasil XOR (biner)         : " + hasilBiner);
        System.out.println("Hasil XOR (Heksadesimal)  : " + hasilHexa);
    }

    static int binerDesimal(String biner) {
        int desimal = 0;
        int nilaiPosisi = 1;
        
        for(int i = biner.length()-1; i >= 0; i--) {
            if(biner.charAt(i) == '1') {
                desimal += nilaiPosisi;
            }
            nilaiPosisi *= 2;
        }
        return desimal;
    }
}