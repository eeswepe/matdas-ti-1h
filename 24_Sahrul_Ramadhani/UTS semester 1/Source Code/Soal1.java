import java.util.Scanner;

public class Soal1 {

    public static int binerKeDesimalManual(String biner) {
        int desimal = 0;
        int panjang = biner.length();

        for (int i = 0; i < panjang; i++) {
            char bit = biner.charAt(panjang - i - 1); 
            if (bit == '1') {
                desimal += Math.pow(2, i); 
            }
        }
        return desimal;
    }

    public static String desimalKeBinerManual(int desimal) {
        StringBuilder biner = new StringBuilder();
        
        while (desimal > 0) {
            int sisa = desimal % 2; 
            biner.insert(0, sisa);
            desimal /= 2; 
        }
        
        return biner.length() > 0 ? biner.toString() : "0";
    }

    public static String desimalKeHexadesimalManual(int desimal) {
        StringBuilder hexa = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        while (desimal > 0) {
            int sisa = desimal % 16;   
            hexa.insert(0, hexChars[sisa]); 
            desimal /= 16;             
        }
        
        return hexa.length() > 0 ? hexa.toString() : "0";
    }

    public static int hexadesimalKeDesimalManual(String hexa) {
        int desimal = 0;
        int panjang = hexa.length();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        for (int i = 0; i < panjang; i++) {
            char digit = hexa.charAt(panjang - i - 1);  
            for (int j = 0; j < hexChars.length; j++) {
                if (digit == hexChars[j]) {
                    desimal += j * Math.pow(16, i);
                    break;
                }
            }
        }
        return desimal;
    }
    public static String binerKeHexadesimalManual(String biner) {
        int desimal = binerKeDesimalManual(biner);
        return desimalKeHexadesimalManual(desimal);
    }

    public static String hexadesimalKeBinerManual(String hexa) {
        int desimal = hexadesimalKeDesimalManual(hexa);
        return desimalKeBinerManual(desimal); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (;;) {
        System.out.println("Pilih jenis konversi:");
        System.out.println("1. Biner ke Desimal dan Heksadesimal");
        System.out.println("2. Desimal ke Biner dan Heksadesimal");
        System.out.println("3. Heksadesimal ke Biner dan Desimal");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); 

        switch (pilihan) {
            case 1 -> {
                System.out.print("Masukkan bilangan biner: ");
                String biner = scanner.nextLine();
                System.out.println("Desimal: " + binerKeDesimalManual(biner));
                System.out.println("Heksadesimal: " + binerKeHexadesimalManual(biner));
                System.out.println("===============================================");
            }
            case 2 -> {
                System.out.print("Masukkan bilangan desimal: ");
                int desimal = scanner.nextInt();
                System.out.println("Biner: " + desimalKeBinerManual(desimal));
                System.out.println("Heksadesimal: " + desimalKeHexadesimalManual(desimal));
                System.out.println("===============================================");
            }
            case 3 -> {
                System.out.print("Masukkan bilangan heksadesimal: ");
                String hexa = scanner.nextLine();
                System.out.println("Biner: " + hexadesimalKeBinerManual(hexa));
                System.out.println("Desimal: " + hexadesimalKeDesimalManual(hexa));
                System.out.println("===============================================");
            }
            default -> System.out.println("Pilihan tidak valid.");
        }
        }
    }
}