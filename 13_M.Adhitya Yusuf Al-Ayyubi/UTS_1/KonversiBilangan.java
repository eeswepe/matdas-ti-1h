import java.util.Scanner;
public class KonversiBilangan {

    public static String desimalKeBiner(int desimal) {
        StringBuilder biner = new StringBuilder();
        if (desimal == 0) return "0";
        while (desimal > 0) {
            biner.insert(0, desimal % 2);
            desimal /= 2;
        }
        return biner.toString();
    }

    public static String desimalKeHeksadesimal(int desimal) {
        StringBuilder heksadesimal = new StringBuilder();
        char[] heksArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        if (desimal == 0) return "0";
        while (desimal > 0) {
            heksadesimal.insert(0, heksArray [desimal % 16]);
            desimal /= 16;
        }
        return heksadesimal.toString();
    }

    public static int binerKeDesimal(String biner) {
        int desimal = 0;
        for (int i = 0; i < biner.length(); i++) {
            desimal = desimal * 2 + (biner.charAt(i) - '0');
        }
        return desimal;
    }

    public static String binerKeHeksadesimal(String biner) {
        int desimal = binerKeDesimal(biner);
        return desimalKeHeksadesimal(desimal);
    }

    public static int heksadesimalKeDesimal(String heksadesimal) {
        int desimal = 0;
        char[] heksMap = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < heksadesimal.length(); i++) {
            char c = heksadesimal.charAt(i);
            int nilai = 0;
            for (int j = 0; j < heksMap.length; j++) {
                if (c == heksMap[j]) {
                    nilai = j;
                    break;
                }
            }
            desimal = desimal * 16 + nilai;
        }
        return desimal;
    }

    public static String heksadesimalKeBiner(String heksadesimal) {
        int desimal = heksadesimalKeDesimal(heksadesimal);
        return desimalKeBiner(desimal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keluar = false;

        while (!keluar) {
            System.out.println("\nPilih opsi konversi:");
            System.out.println("1. Desimal ke Biner dan Heksadesimal");
            System.out.println("2. Biner ke Desimal dan Heksadesimal");
            System.out.println("3. Heksadesimal ke Desimal dan Biner");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();     

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimal = scanner.nextInt();
                    System.out.println("Biner: " + desimalKeBiner(desimal));
                    System.out.println("Heksadesimal: " + desimalKeHeksadesimal(desimal));
                    break;

                case 2:
                    System.out.print("Masukkan bilangan biner: ");
                    String biner = scanner.nextLine();
                    System.out.println("Desimal: " + binerKeDesimal(biner));
                    System.out.println("Heksadesimal: " + binerKeHeksadesimal(biner));
                    break;

                case 3:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String heksadesimal = scanner.nextLine().toUpperCase();
                    System.out.println("Desimal: " + heksadesimalKeDesimal(heksadesimal));
                    System.out.println("Biner: " + heksadesimalKeBiner(heksadesimal));
                    break;

                case 4:
                    keluar = true;
                    System.out.println("Keluar program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
        scanner.close();
    }
}
