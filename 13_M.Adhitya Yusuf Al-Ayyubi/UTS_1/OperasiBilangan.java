import java.util.Scanner;
public class OperasiBilangan {

    public static int binerKeDesimal(String biner) {
        int desimal = 0;
        for (int i = 0; i < biner.length(); i++) {
            desimal = desimal * 2 + (biner.charAt(i) - '0');
        }
        return desimal;
    }

    public static String desimalKeBiner(int desimal) {
        StringBuilder biner = new StringBuilder();
        if (desimal == 0) return "0";
        while (desimal > 0) {
            biner.insert(0, desimal % 2);
            desimal /= 2;
        }
        return biner.toString();
    }

    public static String operasiBiner(String biner1, String biner2, String operasi) {
        int desimal1 = binerKeDesimal(biner1);
        int desimal2 = binerKeDesimal(biner2);
        int hasil = 0;

        switch (operasi) {
            case "tambah":
                hasil = desimal1 + desimal2;
                break;
            case "kurang":
                hasil = desimal1 - desimal2;
                break;
            case "kali":
                hasil = desimal1 * desimal2;
                break;
            case "and":
                hasil = desimal1 & desimal2;
                break;
            case "or":
                hasil = desimal1 | desimal2;
                break;
            case "xor":
                hasil = desimal1 ^ desimal2;
                break;
        }
        return desimalKeBiner(hasil);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan biner pertama: ");
        String biner1 = scanner.nextLine();
        System.out.print("Masukkan bilangan biner kedua: ");
        String biner2 = scanner.nextLine();

        System.out.print("Pilih operasi (tambah, kurang, kali, and, or, xor): ");
        String operasi = scanner.nextLine().toLowerCase();

        String hasil = operasiBiner(biner1, biner2, operasi);
        System.out.println("Hasil: " + hasil);

        scanner.close();
    }
}
