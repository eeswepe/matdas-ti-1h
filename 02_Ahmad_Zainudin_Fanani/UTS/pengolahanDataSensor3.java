import java.util.*;

public class pengolahanDataSensor3{

    // Fungsi untuk mengonversi desimal ke biner (bagian bulat) secara manual
    public static String konversiDesimalKeBiner(int desimal) {
        StringBuilder biner = new StringBuilder();
        if (desimal == 0) return "0"; // Menangani kasus desimal 0
        while (desimal > 0) {
            biner.insert(0, desimal % 2);
            desimal /= 2;
        }
        return biner.toString();
    }

    // Fungsi untuk mengonversi pecahan desimal ke biner secara manual dengan 4 digit
    public static String konversiPecahanKeBiner(double pecahan) {
        StringBuilder biner = new StringBuilder();
        biner.append(".");
        for (int i = 0; i < 4; i++) { // Batasi hingga 4 digit
            pecahan *= 2;
            int bit = (int) pecahan;
            biner.append(bit);
            pecahan -= bit;
            if (pecahan == 0) break; // Hentikan jika tidak ada sisa
        }
        return biner.toString();
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

    // Fungsi untuk mengonversi pecahan desimal ke heksadesimal secara manual
    public static String konversiPecahanKeHeksadesimal(double pecahan) {
        StringBuilder heksadesimal = new StringBuilder();
        heksadesimal.append(".");
        int count = 0;
        while (pecahan > 0 && count < 4) { // Batasi hingga 4 digit
            pecahan *= 16;
            int digit = (int) pecahan;
            if (digit < 10) {
                heksadesimal.append(digit);
            } else {
                heksadesimal.append((char) ('A' + (digit - 10))); // A-F
            }
            pecahan -= digit;
            count++;
        }
        return heksadesimal.toString();
    }

    // Fungsi untuk menghapus karakter non-digit dan non-desimal secara manual
    public static double parseSuhu(String input) {
        StringBuilder angka = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c) || c == '.') {
                angka.append(c);
            }
        }
        return Double.parseDouble(angka.toString());
    }

    // Fungsi untuk menghapus karakter non-digit secara manual
    public static int parseInput(String input) {
        StringBuilder angka = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                angka.append(c);
            }
        }
        return Integer.parseInt(angka.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Menggunakan locale yang sesuai

        double suhu;
        int kelembapan, co2;

        // Mengambil input dari pengguna
        do {
            System.out.print("Masukkan suhu       : ");
            String inputSuhu = sc.nextLine();
            suhu = parseSuhu(inputSuhu); // Ambil angka dari input suhu
            
            System.out.print("Masukkan kelembapan : ");
            String inputKelembapan = sc.nextLine();
            kelembapan = parseInput(inputKelembapan); // Ambil angka dengan menghapus karakter non-digit
            
            System.out.print("Masukkan CO2        : ");
            String inputCO2 = sc.nextLine();
            co2 = parseInput(inputCO2); // Ambil angka dengan menghapus karakter non-digit
        } while (suhu < 0 || kelembapan < 0 || co2 < 0); // Memastikan input tidak negatif

        // Mengonversi dan menampilkan hasil
        System.out.println("\nData Sensor:");
        System.out.println("Suhu: " + suhu + "°C");
        System.out.println("Kelembapan: " + kelembapan + "%");
        System.out.println("CO2: " + co2 + "ppm");
        
        // Pisahkan bagian bulat dan pecahan suhu
        int bagianBulat = (int) suhu;
        double bagianPecahan = suhu - bagianBulat;

        // Mengonversi suhu
        System.out.println("\nSuhu dalam Biner: " + konversiDesimalKeBiner(bagianBulat) + konversiPecahanKeBiner(bagianPecahan));
        System.out.println("Suhu dalam Heksadesimal: " + konversiDesimalKeHeksadesimal(bagianBulat) + konversiPecahanKeHeksadesimal(bagianPecahan));

        // Mengonversi kelembapan
        System.out.println("Kelembapan dalam Biner: " + konversiDesimalKeBiner(kelembapan));
        System.out.println("Kelembapan dalam Heksadesimal: " + konversiDesimalKeHeksadesimal(kelembapan));

        // Mengonversi kadar CO2
        System.out.println("CO2 dalam Biner: " + konversiDesimalKeBiner(co2));
        System.out.println("CO2 dalam Heksadesimal: " + konversiDesimalKeHeksadesimal(co2));

        // Menutup scanner setelah selesai
        sc.close();
    }
}
