import java.util.Scanner;

public class matdas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("=== SOAL 1.1 ===");
        System.out.print("Masukkan desimal: ");
        int desimal = sc.nextInt();
        
        String biner = konversiKeBiner(desimal);
        String heksa = konversiKeHeksa(desimal);
        
        System.out.println("Desimal: " + desimal);
        System.out.println("Biner: " + biner); 
        System.out.println("Heksadesimal: " + heksa);
        
        System.out.println("\n=== SOAL 1.2 ===");
        System.out.print("Masukkan biner2: ");
        String biner2 = sc.next();
        
        int desimal2 = binerKeDesimal(biner2);
        String heksa2 = desimalKeHeksa(desimal2);
        
        System.out.println("Biner: " + biner2);
        System.out.println("Desimal: " + desimal2);
        System.out.println("Heksadesimal: " + heksa2);

        System.out.println("\n=== SOAL 1.3 ===");
        System.out.print("Masukkan heksa3: ");
        String heksa3 = sc.next();
        
        int desimal3 = heksaKeDesimal(heksa3);
        String biner3 = desimalKeBiner(desimal3);
        
        System.out.println("Heksadesimal: " + heksa3);
        System.out.println("Desimal: " + desimal3);
        System.out.println("Biner: " + biner3);
    }

    public static String konversiKeBiner(int decimal) {
        String binary = "";
        int temp = decimal;
        
        while (temp > 0) {
            binary = (temp % 2) + binary;
            temp = temp / 2;
        }
        return binary;
    }

    public static String konversiKeHeksa(int decimal) {
        String hex = "";
        int temp = decimal;
        char hexChars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        while (temp > 0) {
            int remainder = temp % 16;
            hex = hexChars[remainder] + hex;
            temp = temp / 16;
        }
        return hex;
    }
    
    public static int binerKeDesimal(String binary) {
        int decimal = 0;
        int power = 0;
        
        for(int i = binary.length()-1; i >= 0; i--) {
            if(binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
    
    public static String desimalKeHeksa(int decimal) {
        String hex = "";
        int temp = decimal;
        char hexChars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        while(temp > 0) {
            int remainder = temp % 16;
            hex = hexChars[remainder] + hex;
            temp = temp / 16;
        }
        return hex;
    }
    
    public static int heksaKeDesimal(String hex) {
        int decimal = 0;
        int power = 0;
        String hexChars = "0123456789ABCDEF";
        
        for(int i = hex.length()-1; i >= 0; i--) {
            char digit = hex.charAt(i);
            int value = hexChars.indexOf(digit);
            decimal += value * Math.pow(16, power);
            power++;
        }
        return decimal;
    }
    
    public static String desimalKeBiner(int decimal) {
        String binary = "";
        int temp = decimal;
        
        while(temp > 0) {
            binary = (temp % 2) + binary;
            temp = temp / 2;
        }
        return binary;
    }
}