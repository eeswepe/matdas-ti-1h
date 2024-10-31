import java.util.Scanner;

public class enskripsi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = "";
        System.out.print("MASUKKAN NILAI BINER DASAR : ");
        String nilaidasar = input.nextLine();
        String key = "10101010";

        for (int i = 0; i < 8; i++){
            int temp = (nilaidasar.charAt(i) - '0') ^ (key.charAt(i) - '0');
            a += temp;
        }

        System.out.println("Hasil Enkripsi: " + a);
    }
}