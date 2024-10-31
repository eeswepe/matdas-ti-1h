import java.util.Scanner;

public class no1 {

    public static String DesimalToBiner(int desimal) {
        StringBuilder biner = new StringBuilder();
        while (desimal > 0) {
            int remainder = desimal % 2;
            biner.insert(0, remainder);
            desimal /= 2;
        }
        return biner.toString();
    }

    public static String DesimalToHexadesimal(int desimal) {
        StringBuilder hexadesimal = new StringBuilder();
        char[] simbolhexadesimal = "0123456789ABCDEF".toCharArray();
        while (desimal > 0) {
            int remainder = desimal % 16;
            hexadesimal.insert(0, simbolhexadesimal[remainder]);
            desimal /= 16;
        }
        return hexadesimal.toString();
    }

    public static int BinerToDesimal(String biner) {
        int desimal = 0;
        int power = 0;
        for (int i = biner.length() - 1; i >= 0; i--) {
            int bit = biner.charAt(i) - '0';
            desimal += bit * Math.pow(2, power);
            power++;
        }
        return desimal;
    }

    public static int HexadesimalToDesimal(String hex) {
        int desimal = 0;
        int power = 0;
        for (int i = hex.length() - 1; i >= 0; i--) {
            char hexChar = hex.charAt(i);
            int hexValue = (hexChar >= '0' && hexChar <= '9') ? hexChar - '0' : hexChar - 'A' + 10;
            desimal += hexValue * Math.pow(16, power);
            power++;
        }
        return desimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean mulai = true;

        while (mulai) {
            System.out.println("\nPilih jenis konversi:");
            System.out.println("1. Desimal ke Biner");
            System.out.println("2. Desimal ke Heksadesimal");
            System.out.println("3. Biner ke Desimal");
            System.out.println("4. Heksadesimal ke Desimal");
            System.out.println("0. Keluar");

            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan bilangan desimal: ");
                    int DesimalToBiner = scanner.nextInt();
                    String hasilBiner = DesimalToBiner(DesimalToBiner);
                    System.out.println("Hasil dalam biner: " + hasilBiner);
                    break;

                case 2:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimalToConvert = scanner.nextInt();
                    String hexResult = DesimalToHexadesimal(desimalToConvert);
                    System.out.println("Hasil dalam heksadesimal: " + hexResult);
                    break;

                case 3:
                    System.out.print("Masukkan bilangan biner: ");
                    String binerToConvert = scanner.next();
                    int desimalFrombiner = BinerToDesimal(binerToConvert);
                    System.out.println("Hasil dalam desimal: " + desimalFrombiner);
                    break;

                case 4:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String hexToConvert = scanner.next();
                    int desimalFromHex = HexadesimalToDesimal(hexToConvert);
                    System.out.println("Hasil dalam desimal: " + desimalFromHex);
                    break;

                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    mulai = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
        scanner.close();
    }
}
