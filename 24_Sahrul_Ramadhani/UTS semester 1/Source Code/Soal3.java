import java.util.Scanner;

public class Soal3 {

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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Suhu Udara Saat ini (°C)=  ");
        String suhuInput = scanner.nextLine().replace("°C", "").trim();
        double suhu = Double.parseDouble(suhuInput); 
        int suhuBulat = (int) Math.round(suhu);
        System.out.print("Kelembapan Saat ini (%) = ");
        String kelembapanInput = scanner.nextLine().replace("%", "").trim();
        int kelembapan = Integer.parseInt(kelembapanInput);
        System.out.print("CO2 Saat ini (ppm) = ");
        String co2Input = scanner.nextLine().replace("ppm", "").trim();
        int CO2 = Integer.parseInt(co2Input); 

        System.out.println("===============================================");
        System.out.println("Suhu Saat ini Adalah = ");
        System.out.println("Biner: " + desimalKeBinerManual(suhuBulat) + " °C");
        System.out.println("Heksadesimal: " + desimalKeHexadesimalManual(suhuBulat) +" °C");
        System.out.println("===============================================");
        System.out.println("Kelembapan Saat ini Adalah = ");
        System.out.println("Biner: " + desimalKeBinerManual(kelembapan) + " %");
        System.out.println("Heksadesimal: " + desimalKeHexadesimalManual(kelembapan) +" %");
        System.out.println("===============================================");
        System.out.println("CO2 Saat ini Adalah = ");
        System.out.println("Biner: " + desimalKeBinerManual(CO2) + " ppm");
        System.out.println("Heksadesimal: " + desimalKeHexadesimalManual(CO2) +" ppm");
        System.out.println("===============================================");
        }
        }

