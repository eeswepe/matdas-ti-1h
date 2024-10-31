import java.util.Scanner;

public class SistemBilangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah anda ingin melakukan konversi? (y/n)");
        String isLanjut = sc.next();
        
        while ((isLanjut.equalsIgnoreCase("y"))) {
            
        System.out.println("Pilih jenis konversi:");
        System.out.println("1. Desimal ke Biner");
        System.out.println("2. Desimal ke Heksadesimal");
        System.out.println("3. Biner ke Desimal");
        System.out.println("4. Biner ke Heksadesimal");
        System.out.println("5. Heksadesimal ke Desimal");
        System.out.println("6. Heksadesimal ke Biner");
        System.out.print("Masukkan pilihan (1/2/3/4/5/6): ");
        int pilihan = sc.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan angka desimal: ");
                int desimal = sc.nextInt();
                System.out.println("Desimal ke Biner: " + desimalToBiner(desimal));
                break;
            case 2:
                System.out.print("Masukkan angka desimal: ");
                desimal = sc.nextInt();
                System.out.println("Desimal ke Heksadesimal: " + decimalToHexadecimal(desimal));
                break;
            case 3: 
                 System.out.print("Masukkan angka biner: ");
                String biner = sc.next();
                while (!biner.matches("[01]+")) {
                    System.out.print("Input Tidak Valid! Masukkan angka biner: ");
                    biner = sc.next();
                }
                System.out.println("Biner ke Desimal: " + binaryToDecimal(biner));
                break;
            case 4:
                System.out.print("Masukkan angka biner: ");
                biner = sc.next();
                while (!biner.matches("[01]+")) {
                    System.out.print("Input Tidak Valid! Masukkan angka biner: ");
                    biner = sc.next();
                }
                System.out.println("Biner ke Heksadesimal: " + binaryToHexadecimal(biner));
                break;
             case 5: 
                System.out.print("Masukkan angka heksadesimal: ");
                String heksadesimal = sc.next();
                System.out.println("Heksadesimal ke Desimal: " + hexadecimalToDecimal(heksadesimal));
                break;
            case 6:
                System.out.print("Masukkan angka heksadesimal: ");
                heksadesimal = sc.next();
                System.out.println("Heksadesimal ke Biner: " + hexadecimalToBinary(heksadesimal));
                break;

            default:
                System.out.println("Pilihan tidak valid. pilih 1/2/3.");
                break;

            }
            System.out.print("Apakah anda ingin melanjutkan? (y/n)");
            isLanjut = sc.next();
    };

        sc.close();
    }

    private static String desimalToBiner(int desimal) {
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

    private static int binaryToDecimal(String biner) {
        int desimal = 0;
        int pangkat = biner.length()-1;
        for (int i = 0; i < biner.length(); i++) {
        int digit = biner.charAt(i) - '0';
        desimal+= digit * Math.pow(2, pangkat);
            pangkat--;
        }
        return desimal;
    }

    private static String binaryToHexadecimal(String biner) {
        int desimal = binaryToDecimal(biner);
        return decimalToHexadecimal(desimal);
    }

    private static int hexadecimalToDecimal(String heksadesimal) {
        int desimal = 0;
        int pangkat = heksadesimal.length() - 1;
        for (int i = 0; i < heksadesimal.length(); i++) {
            char c = heksadesimal.charAt(i);
            int digit;
            
            if (c >= '0' && c <= '9') {
                digit = c - '0'; 
            } 
            else if (c >= 'A' && c <= 'F') {
                digit = c - 'A' + 10;
            } 
            else if (c >= 'a' && c <= 'f') {
                digit = c - 'a' + 10; 
            } else {
                throw new IllegalArgumentException("Invalid hexadecimal character: " + c);
            }
            
            desimal += digit * Math.pow(16, pangkat);
            pangkat--;
        }
        return desimal;
    }

        private static String hexadecimalToBinary(String heksadesimal) {
            int desimal = hexadecimalToDecimal(heksadesimal);
            return desimalToBiner(desimal);
        }
} 