import java.util.Scanner;
public class UTSmatdas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "";
        System.out.print("Masukkan nilai biner dasar: ");
        String pesanDasar = sc.nextLine();
        String key = "10101010";

        for(int i=0;i<8;i++){
            int temp = (pesanDasar.charAt(i) - '0') ^ (key.charAt(i) - '0');
            s += temp;
        }
        System.out.println("Hasil Enkripsi: " + s);

    }
}
