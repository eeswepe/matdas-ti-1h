public class soal3_06 {
    public static void main(String[] args) {
        // Data sensor
        double suhu = 28.6;    // Suhu dalam Celsius
        int kelembapan = 65;   // Kelembapan dalam persen
        int co2 = 420;         // Konsentrasi CO2 dalam ppm

        // Konversi suhu (bagian integer) ke biner dan heksadesimal
        int suhuInt = (int) suhu;
        StringBuilder suhuBiner = new StringBuilder();
        int nilaiSuhu = suhuInt;
        while (nilaiSuhu > 0) {
            suhuBiner.insert(0, nilaiSuhu % 2);
            nilaiSuhu /= 2;
        }
        
        StringBuilder suhuHeksadesimal = new StringBuilder();
        nilaiSuhu = suhuInt;
        char[] heksDigit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (nilaiSuhu > 0) {
            suhuHeksadesimal.insert(0, heksDigit[nilaiSuhu % 16]);
            nilaiSuhu /= 16;
        }

        // Konversi kelembapan ke biner dan heksadesimal
        StringBuilder kelembapanBiner = new StringBuilder();
        int nilaiKelembapan = kelembapan;
        while (nilaiKelembapan > 0) {
            kelembapanBiner.insert(0, nilaiKelembapan % 2);
            nilaiKelembapan /= 2;
        }

        StringBuilder kelembapanHeksadesimal = new StringBuilder();
        nilaiKelembapan = kelembapan;
        while (nilaiKelembapan > 0) {
            kelembapanHeksadesimal.insert(0, heksDigit[nilaiKelembapan % 16]);
            nilaiKelembapan /= 16;
        }

        // Konversi CO2 ke biner dan heksadesimal
        StringBuilder co2Biner = new StringBuilder();
        int nilaiCO2 = co2;
        while (nilaiCO2 > 0) {
            co2Biner.insert(0, nilaiCO2 % 2);
            nilaiCO2 /= 2;
        }

        StringBuilder co2Heksadesimal = new StringBuilder();
        nilaiCO2 = co2;
        while (nilaiCO2 > 0) {
            co2Heksadesimal.insert(0, heksDigit[nilaiCO2 % 16]);
            nilaiCO2 /= 16;
        }

        // Tampilkan hasil konversi
        System.out.println("Data Sensor:");
        System.out.println("Suhu (Desimal): " + suhu + " °C");
        System.out.println("Suhu (Biner): " + suhuBiner);
        System.out.println("Suhu (Heksadesimal): " + suhuHeksadesimal);

        System.out.println("\nKelembapan (Desimal): " + kelembapan + " %");
        System.out.println("Kelembapan (Biner): " + kelembapanBiner);
        System.out.println("Kelembapan (Heksadesimal): " + kelembapanHeksadesimal);

        System.out.println("\nCO2 (Desimal): " + co2 + " ppm");
        System.out.println("CO2 (Biner): " + co2Biner);
        System.out.println("CO2 (Heksadesimal): " + co2Heksadesimal);
    }
}
