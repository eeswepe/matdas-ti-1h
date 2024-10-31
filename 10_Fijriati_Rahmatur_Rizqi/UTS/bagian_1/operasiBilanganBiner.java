import java.util.Scanner;

public class operasiBilanganBiner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih operasi: tambah, kurang, kali, AND, OR, XOR");
        String operasi = sc.nextLine().toLowerCase();

        System.out.println("Masukkan bilangan biner pertama: ");
        String bilangan1 = sc.nextLine();

        System.out.println("Masukkan bilangan biner kedua: ");
        String bilangan2 = sc.nextLine();

        switch (operasi) {
            case "tambah":
                System.out.println("Hasil: " + tambah(bilangan1, bilangan2));
                break;
            case "kurang":
                System.out.println("Hasil: " + kurang(bilangan1, bilangan2));
                break;
            case "kali":
                System.out.println("Hasil: " + kali(bilangan1, bilangan2));
                break;
            case "and":
                System.out.println("Hasil AND: " + and(bilangan1, bilangan2));
                break;
            case "or":
                System.out.println("Hasil OR: " + or(bilangan1, bilangan2));
                break;
            case "xor":
                System.out.println("Hasil XOR: " + xor(bilangan1, bilangan2));
                break;
            default:
                System.out.println("Operasi tidak valid.");
                break;
        }
    }

    public static String tambah(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int result = num1 + num2;
        return Integer.toBinaryString(result);
    }

    public static String kurang(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int result = num1 - num2;
        return Integer.toBinaryString(result);
    }

    public static String kali(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int result = num1 * num2;
        return Integer.toBinaryString(result);
    }

    public static String and(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int result = num1 & num2;
        return Integer.toBinaryString(result);
    }

    public static String or(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int result = num1 | num2;
        return Integer.toBinaryString(result);
    }

    public static String xor(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int result = num1 ^ num2;
        return Integer.toBinaryString(result);
    }
}
