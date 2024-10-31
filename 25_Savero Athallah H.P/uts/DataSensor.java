import java.util.Scanner;
public class DataSensor {
    
    public static void main(String[] args) {
        
        String[] data = {"Suhu", "Kelembapan", "CO2"};

        for(int i = 0; i < data.length; i++) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai " + data[i] + " : ");
        double dataInput = sc.nextDouble();

        int inputBulat = (int) dataInput;
        double hasilKoma = dataInput - inputBulat;

        if (hasilKoma >= 0.5) {
            inputBulat++;
        } else {
            inputBulat--;
        }

        String konversiBiner = desimalToBiner(inputBulat);
        System.out.println("Konversi data ke biner : " + konversiBiner);

        String konversiHexa = decimalToHexadecimal(inputBulat);
        System.out.println("Konversi data ke hexadecimal : " + konversiHexa);

        }

    }

    private static String desimalToBiner(int desimal) {
        if (desimal == 0) {
            return "0";
        }
        StringBuilder biner = new StringBuilder();
        while (desimal > 0) {
            biner.append(desimal % 2);
            desimal /= 2;
        }
        return biner.reverse().toString();
    }

    private static String decimalToHexadecimal(int desimal) {
        StringBuilder heksadesimal = new StringBuilder();
        String hexChars = "0123456789ABCDEF";
        while (desimal > 0) {
            heksadesimal.append(hexChars.charAt(desimal % 16));
            desimal /= 16;
        }
        return heksadesimal.reverse().toString();
    }
}
