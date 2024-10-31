import java.util.Scanner;

public class operasiEnkripsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan biner yang ingin dienkripsi: ");
        String binaryInput = sc.nextLine();

        String key = "10101010";

        String enkripsiBiner = xor(binaryInput, key);
        String enkripsiHeksadesimal = binaryToHexadecimal(enkripsiBiner);

        System.out.println("Hasil Enkripsi:");
        System.out.println("Biner\t\t: " + enkripsiBiner);
        System.out.println("Heksadesimal\t: " + enkripsiHeksadesimal);
    }

    public static String xor(String binaryInput, String key) {
        StringBuilder enkripsiBiner = new StringBuilder();

        for (int i = 0; i < binaryInput.length(); i++) {
            char bitInput = binaryInput.charAt(i);
            char bitKey = key.charAt(i % key.length());
            enkripsiBiner.append((bitInput == bitKey) ? '0' : '1');
        }
        return enkripsiBiner.toString();
    }

    public static String binaryToHexadecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toHexString(decimal).toUpperCase();
    }
}
