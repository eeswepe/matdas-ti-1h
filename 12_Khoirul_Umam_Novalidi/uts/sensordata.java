public class sensordata {
    public static void main(String[] args) {
        // Data sensor
        double suhu = 28.6;
        int kelembapan = 65;
        int co2 = 420;

        System.out.println("Data Sensor:");
        System.out.println("Suhu: " + suhu + " °C");
        System.out.println("Kelembapan: " + kelembapan + " %");
        System.out.println("CO2: " + co2 + " ppm");

        // Konversi suhu ke biner dan heksadesimal
        String suhuBiner = toBinary((int) suhu);
        String suhuHex = toHexadecimal((int) suhu);
        
        // Konversi kelembapan ke biner dan heksadesimal
        String kelembapanBiner = toBinary(kelembapan);
        String kelembapanHex = toHexadecimal(kelembapan);
        
        // Konversi CO2 ke biner dan heksadesimal
        String co2Biner = toBinary(co2);
        String co2Hex = toHexadecimal(co2);

        // Tampilkan hasil konversi
        System.out.println("\nHasil Konversi:");
        System.out.println("Suhu dalam Biner: " + suhuBiner);
        System.out.println("Suhu dalam Hexadesimal: " + suhuHex);
        System.out.println("Kelembapan dalam Biner: " + kelembapanBiner);
        System.out.println("Kelembapan dalam Hexadesimal: " + kelembapanHex);
        System.out.println("CO2 dalam Biner: " + co2Biner);
        System.out.println("CO2 dalam Hexadesimal: " + co2Hex);
    }

    // Fungsi untuk konversi desimal ke biner
    public static String toBinary(int num) {
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.insert(0, num % 2);
            num = num / 2;
        }
        return binary.length() > 0 ? binary.toString() : "0";
    }

    // Fungsi untuk konversi desimal ke heksadesimal
    public static String toHexadecimal(int num) {
        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (num > 0) {
            hex.insert(0, hexChars[num % 16]);
            num = num / 16;
        }
        return hex.length() > 0 ? hex.toString() : "0";
    }
}
