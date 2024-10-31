import java.util.Scanner;
public class matdas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jenis konversi bilangan: ");
        System.out.println("1. Desimal ke Biner dan Heksadesimal");
        System.out.println("2. Biner ke Desimal dan Heksadesimal");
        System.out.println("3. Heksadesimal ke Desimal dan Biner");
        System.out.print("Pilih jenis konversi bilangan (1-3): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan bilangan desimal: ");
                int desimal = sc.nextInt();
                System.out.println();
                System.out.println("==================");
                System.out.println("  HASIL KONVERSI  ");
                System.out.println("==================");
                System.out.print("Biner = ");
                desimalBiner(desimal);
                System.out.println();
                System.out.print("Heksadesimal = ");
                desimalHeksa(desimal);
                System.out.println();
                break;
            case 2:
                System.out.print("Masukkan bilangan biner: ");
                String biner = sc.next();
                int desimalBiner = binerDesimal(biner);
                System.out.println();
                System.out.println("==================");
                System.out.println("  HASIL KONVERSI  ");
                System.out.println("==================");
                System.out.println("Desimal = " + desimalBiner);
                System.out.print("Heksadesimal = ");
                desimalHeksa(desimalBiner);
                System.out.println();
                break;
            case 3:
                System.out.print("Masukkan bilangan heksadesimal: ");
                String heksa = sc.next();
                int desimalHeksa = heksaDesimal(heksa);
                System.out.println();
                System.out.println("==================");
                System.out.println("  HASIL KONVERSI  ");
                System.out.println("==================");
                System.out.println("Desimal = " + desimalHeksa);
                System.out.print("Biner = ");
                desimalBiner(desimalHeksa);
                System.out.println();
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        System.out.println();
    }

    public static void desimalBiner(int i) {
        if (i > 1) {
            desimalBiner(i / 2);
        }
        System.out.print(i % 2);
    }

    public static void desimalHeksa(int i) {
        if (i > 15) {
            desimalHeksa(i / 16);
        }
        int hexDigit = i % 16;
        if (hexDigit < 10) {
            System.out.print(hexDigit);
        } else {
            System.out.print((char) ('A' + (hexDigit - 10)));
        }
    }

    public static int binerDesimal(String biner) {
        int desimal = 0;
        int pangkat = 1;
        for (int i = biner.length() - 1; i >= 0; i--) {
            if (biner.charAt(i) == '1') {
                desimal += pangkat;
            }
            pangkat *= 2;
        }
        return desimal;
    }

    public static void binerHeksa(String biner) {
        int desimal = binerDesimal(biner);
        desimalHeksa(desimal);
    }

    public static int heksaDesimal(String heksa) {
        int desimal = 0;
        int pangkat = 1;
        for (int i = heksa.length() - 1; i >= 0; i--) {
            char c = heksa.charAt(i);
            int nilai;
            if (c >= '0' && c <= '9') {
                nilai = c - '0';
            } else {
                nilai = c - 'A' + 10;
            }
            desimal += nilai * pangkat;
            pangkat *= 16;
        }
        return desimal;
    }

    public static void heksaBiner(String heksa) {
        int desimal = heksaDesimal(heksa);
        desimalBiner(desimal);
    }
}