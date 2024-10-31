import java.util.Scanner;

public class konversi {

    // Konversi Desimal ke Biner
    public static String desimalKeBiner(int desimal) {
        String biner = "";
        if (desimal == 0) return "0";
        while (desimal > 0) {
            biner=(desimal % 2)+biner;
            desimal /= 2;
        }
        return biner;
    }

    // Konversi Desimal ke Hexadesimal
    public static String desimalKeHexadesimal(int desimal) {
        String hexadesimal = "";
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        if (desimal == 0) return "0";
        while (desimal > 0) {
            hexadesimal=hexChars[desimal % 16]+hexadesimal;
            desimal /= 16;
        }
        return hexadesimal;
    }

    // Konversi Biner ke Desimal
    public static int binerKeDesimal(String biner) {
        int desimal = 0;
        for (int i = 0; i < biner.length(); i++) {
            desimal = desimal * 2 + (biner.charAt(i) - '0');
        }
        return desimal;
    }

    // Konversi Biner ke Hexadesimal
    public static String binerKeHexadesimal(String biner) {
        int desimal = binerKeDesimal(biner);
        return desimalKeHexadesimal(desimal);
    }

    // Konversi Hexadesimal ke Desimal
    public static int hexadesimalKeDesimal(String hexadesimal) {
        return Integer.parseInt(hexadesimal, 16);
    }

    // Konversi Hexadesimal ke Biner
    public static String hexadesimalKeBiner(String hexadesimal) {
        int desimal = hexadesimalKeDesimal(hexadesimal);
        return desimalKeBiner(desimal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPilih menu konversi:");
            System.out.println("1. Desimal ke Biner dan Hexadesimal");
            System.out.println("2. Biner ke Desimal dan Hexadesimal");
            System.out.println("3. Hexadesimal ke Desimal dan Biner");
            System.out.println("4. Keluar");

            System.out.print("\nMasukkan pilihan (1-4): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimal = scanner.nextInt();

                    System.out.println("Biner: " + desimalKeBiner(desimal));
                    System.out.println("Hexadesimal: " + desimalKeHexadesimal(desimal));
                    break;

                case 2:
                    System.out.print("Masukkan bilangan biner: ");
                    String biner = scanner.nextLine();

                    System.out.println("Desimal: " + binerKeDesimal(biner));
                    System.out.println("Hexadesimal: " + binerKeHexadesimal(biner));
                    break;

                case 3:
                    System.out.print("Masukkan bilangan hexadesimal: ");
                    String hexadesimal = scanner.nextLine();

                    System.out.println("Desimal: " + hexadesimalKeDesimal(hexadesimal));
                    System.out.println("Biner: " + hexadesimalKeBiner(hexadesimal));
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
