import java.util.Scanner;
public class No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih konversi yang diinginkan:");
        System.out.println("1. Desimal ke Biner dan Heksadesimal");
        System.out.println("2. Biner ke Desimal dan Heksadesimal");
        System.out.println("3. Heksadesimal ke Desimal dan Biner");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan angka desimal: ");
                int desimal = sc.nextInt();
                System.out.println("Biner: " + desimalToBiner(desimal));
                System.out.println("Heksadesimal: " + desimalToHex(desimal));
                break;
            case 2:
                System.out.print("Masukkan angka biner: ");
                String biner = sc.next();
                System.out.println("Desimal: " + binerToDesimal(biner));
                System.out.println("Heksadesimal: " + desimalToHex(binerToDesimal(biner)));
                break;
            case 3:
                System.out.print("Masukkan angka heksadesimal: ");
                String heksadesimal = sc.next();
                System.out.println("Desimal: " + hexToDesimal(heksadesimal));
                System.out.println("Biner: " + desimalToBiner(hexToDesimal(heksadesimal)));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        sc.close();
    }

    // Konversi Desimal ke Biner
    public static String desimalToBiner(int desimal) {
        StringBuilder biner = new StringBuilder();
        while (desimal > 0) {
            biner.insert(0, desimal % 2);
            desimal /= 2;
        }
        return biner.length() > 0 ? biner.toString() : "0";
    }

    // Konversi Desimal ke Heksadesimal
    public static String desimalToHex(int desimal) {
        StringBuilder hex = new StringBuilder();
        char[] hexDigits = "0123456789ABCDEF".toCharArray();
        while (desimal > 0) {
            hex.insert(0, hexDigits[desimal % 16]);
            desimal /= 16;
        }
        return hex.length() > 0 ? hex.toString() : "0";
    }

    // Konversi Biner ke Desimal
    public static int binerToDesimal(String biner) {
        int desimal = 0;
        for (int i = 0; i < biner.length(); i++) {
            desimal = desimal * 2 + (biner.charAt(i) - '0');
        }
        return desimal;
    }

    // Konversi Heksadesimal ke Desimal
    public static int hexToDesimal(String hex) {
        int desimal = 0;
        char[] hexDigits = "0123456789ABCDEF".toCharArray();
        for (int i = 0; i < hex.length(); i++) {
            char c = Character.toUpperCase(hex.charAt(i));
            int nilai = 0;
            for (int j = 0; j < hexDigits.length; j++) {
                if (c == hexDigits[j]) {
                    nilai = j;
                    break;
                }
            }
            desimal = desimal * 16 + nilai;
        }
        return desimal;
    }
}