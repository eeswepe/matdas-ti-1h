import java.util.*;
public class PengolahanDataSensor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double suhuT;
        int moist, CO2, suhu, digit, nilai, j = 1;
        int[] decimalTemp1 = new int[32];
        char[] decimalTemp2 = new char[16];
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        System.out.println("======= DATA SENSOR DALAM DESIMAL =======");
        System.out.print("Suhu (deg celcius): ");
        suhuT = sc.nextDouble();
        System.out.print("Kelembapan (%): ");
        moist = sc.nextInt();
        System.out.print("CO2 (ppm): ");
        CO2 = sc.nextInt();

        // pembulatan suhu
        suhu = (int) (suhuT + 0.5);

        int[] toConvertFix = {suhu, moist, CO2};
    
        // konversi desimal ke biner
        for (int i = 0; i < toConvertFix.length; i++) {
            j = 1;
            nilai = toConvertFix[i];
            for (int k = 0; k < j; k++) {
                digit = nilai % 2;
                nilai /= 2;
                decimalTemp1[k] = digit;
                if ((nilai == 1 || nilai == 0) && (digit == 1 || digit == 0)) {
                    decimalTemp1[k+1] = 1;
                    j++;
                    break;
                }
                j++;
            }

            int[] decimalNew1 = new int[j];
            System.arraycopy(decimalTemp1, 0, decimalNew1, 0, j);
            
            if (i == 0) {
                System.out.println("====== DATA SENSOR DALAM BINER ======");
                System.out.print("Suhu: ");
                for (int h = decimalNew1.length - 1; h >= 0; h--) {
                    System.out.print(decimalNew1[h]);
                }
                System.out.println();
            } else if (i == 1) {
                System.out.print("Kelembapan: ");
                for (int h = decimalNew1.length - 1; h >= 0; h--) {
                    System.out.print(decimalNew1[h]);
                }
                System.out.println();
            } else {
                System.out.print("CO2: ");
                for (int h = decimalNew1.length - 1; h >= 0; h--) {
                    System.out.print(decimalNew1[h]);
                }
                System.out.println();
            }
        }          
            // konversi desimal ke heksadesimal

        for (int i = 0; i < toConvertFix.length; i++) {
            j = 1;
            nilai = toConvertFix[i];
            for (int k = 0; k < j; k++) {
                digit = nilai % 16;
                decimalTemp2[k] = hexa[digit];
                nilai /= 16;
                if (nilai == 0) {
                    break;
                }
                j++;
            }

            char[] decimalNew2 = new char[j];
            System.arraycopy(decimalTemp2, 0, decimalNew2, 0, j);
            
            if (i == 0) {
                System.out.println("====== DATA SENSOR DALAM HEKSADESIMAL ======");
                System.out.print("Suhu: ");
                for (int h = decimalNew2.length - 1; h >= 0; h--) {
                    System.out.print(decimalNew2[h]);
                }
                System.out.println();
            } else if (i == 1) {
                System.out.print("Kelembapan: ");
                for (int h = decimalNew2.length - 1; h >= 0; h--) {
                    System.out.print(decimalNew2[h]);
                }
                System.out.println();
            } else {
                System.out.print("CO2: ");
                for (int h = decimalNew2.length - 1; h >= 0; h--) {
                    System.out.print(decimalNew2[h]);
                }
                System.out.println();
            }
        }
    }
}