import java.util.Scanner;

public class konversiBilangan1 {

    // Fungsi untuk mengonversi desimal ke biner
    public static String konversiDesimalKeBiner(int desimal) {
        StringBuilder biner = new StringBuilder();
        if (desimal == 0) return "0"; // Menangani kasus desimal 0
        while (desimal > 0) {
            biner.insert(0, desimal % 2);
            desimal /= 2;
        }
        return biner.toString();
    }

    // Fungsi untuk mengonversi biner ke desimal
    public static int konversiBinerKeDesimal(String biner) {
        int desimal = 0;
        for (int i = 0; i < biner.length(); i++) {
            desimal = desimal * 2 + (biner.charAt(i) - '0');
        }
        return desimal;
    }

    // Fungsi untuk mengonversi heksadesimal ke desimal
    public static int konversiHeksadesimalKeDesimal(String heksadesimal) {
        int desimal = 0;
        for (int i = 0; i < heksadesimal.length(); i++) {
            char karakter = heksadesimal.charAt(i);
            int nilai;
            if (karakter >= '0' && karakter <= '9') {
                nilai = karakter - '0';
            } else {
                nilai = karakter - 'A' + 10; // Asumsi huruf kapital
            }
            desimal = desimal * 16 + nilai;
        }
        return desimal;
    }

    // Fungsi untuk mengonversi desimal ke heksadesimal secara manual
    public static String konversiDesimalKeHeksadesimal(int desimal) {
        StringBuilder heksadesimal = new StringBuilder();
        if (desimal == 0) return "0"; // Menangani kasus desimal 0
        while (desimal > 0) {
            int sisa = desimal % 16;
            char karakter;
            if (sisa < 10) {
                karakter = (char) ('0' + sisa); // 0-9
            } else {
                karakter = (char) ('A' + (sisa - 10)); // A-F
            }
            heksadesimal.insert(0, karakter);
            desimal /= 16;
        }
        return heksadesimal.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Konversi dari bilangan desimal
        System.out.print("Masukkan bilangan desimal: ");
        int desimal = Integer.parseInt(sc.nextLine());
        System.out.println("Biner: " + konversiDesimalKeBiner(desimal));
        System.out.println("Heksadesimal: " + konversiDesimalKeHeksadesimal(desimal));

        // Konversi dari bilangan biner
        System.out.print("Masukkan bilangan biner: ");
        String inputBiner = sc.nextLine();
        int desimalDariBiner = konversiBinerKeDesimal(inputBiner);
        System.out.println("Desimal: " + desimalDariBiner);
        System.out.println("Heksadesimal: " + konversiDesimalKeHeksadesimal(desimalDariBiner));

        // Konversi dari bilangan heksadesimal
        System.out.print("Masukkan bilangan heksadesimal: ");
        String inputHeksadesimal = sc.nextLine();
        int desimalDariHeksadesimal = konversiHeksadesimalKeDesimal(inputHeksadesimal);
        System.out.println("Desimal: " + desimalDariHeksadesimal);
        System.out.println("Biner: " + konversiDesimalKeBiner(desimalDariHeksadesimal));

        // Menutup scanner setelah selesai
        sc.close();
    }
}
