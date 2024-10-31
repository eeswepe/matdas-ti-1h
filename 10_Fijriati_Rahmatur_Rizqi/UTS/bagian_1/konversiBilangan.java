import java.util.Scanner;

public class konversiBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jenis bilangan awal (desimal/biner/heksadesimal): ");
        String jenisAwal = sc.nextLine().toLowerCase();

        System.out.println("Masukkan bilangan yang akan dikonversi: ");
        String inputBilangan = sc.nextLine();

        System.out.println(
                "Masukkan jenis bilangan tujuan (pisahkan dengan koma jika lebih dari 1, contoh: desimal,biner): ");
        String[] jenisTujuan = sc.nextLine().toLowerCase().split(",");

        System.out.println("Hasil konversi: ");
        for (String tujuan : jenisTujuan) {
            switch (jenisAwal) {
                case "desimal":
                    int decimal = Integer.parseInt(inputBilangan);
                    if (tujuan.equals("biner")) {
                        System.out.println("Biner: " + decimalToBinary(decimal));
                    } else if (tujuan.equals("heksadesimal")) {
                        System.out.println("Heksadesimal: " + decimalToHexadecimal(decimal));
                    }
                    break;

                case "biner":
                    if (tujuan.equals("desimal")) {
                        System.out.println("Desimal: " + binaryToDecimal(inputBilangan));
                    } else if (tujuan.equals("heksadesimal")) {
                        System.out.println("Heksadesimal: " + binaryToHexadecimal(inputBilangan));
                    }
                    break;

                case "heksadesimal":
                    if (tujuan.equals("desimal")) {
                        System.out.println("Desimal: " + hexadecimalToDecimal(inputBilangan));
                    } else if (tujuan.equals("biner")) {
                        System.out.println("Biner: " + hexadecimalToBinary(inputBilangan));
                    }
                    break;

                default:
                    System.out.println("Jenis bilangan awal tidak valid.");
                    break;
            }
        }
    }

    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static String decimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static String binaryToHexadecimal(String binary) {
        int decimal = binaryToDecimal(binary);
        return decimalToHexadecimal(decimal);
    }

    public static int hexadecimalToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static String hexadecimalToBinary(String hex) {
        int decimal = hexadecimalToDecimal(hex);
        return decimalToBinary(decimal);
    }
}
