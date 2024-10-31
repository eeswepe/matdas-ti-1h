import java.util.Scanner;
public class konversi1{
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int fitur;
            int desimal;
            String biner, hexa;

            System.out.println("----FITUR KONVERSI YANG TERSEDIA----");
            System.out.println("-- 1.Desimal > Biner-HeksaDesimal --");
            System.out.println("-- 2.Biner > Desimal-HeksaDesimal --");
            System.out.println("-- 3.HeksaDesimal > Desimal-Biner --");
            System.out.println("____________________________________");
            System.out.println();
            System.out.print("SEBUTKAN KONVERSI YANG INGIN DIGUNAKAN : ");
            fitur=sc.nextInt();
            sc.nextLine();

            if(fitur == 1){
                System.out.print("Masukkan bilangan Desimal : ");
                desimal=sc.nextInt();

                System.out.println("Biner : " + desimaltobiner(desimal));
                System.out.println("HeksaDesimal : " + desimaltohexa(desimal));
            }else if(fitur == 2){
                System.out.print("Masukkan bilangan Biner : ");
                biner=sc.nextLine();

                System.out.println("Desimal : " + binertodesimal(biner));
                System.out.println("HeksaDesimal : " + binertohexa(biner));
            }else if(fitur == 3){
                System.out.print("Masukkan bilangan HeksaDesimal : ");
                hexa=sc.nextLine();

                System.out.println("Desimal : " + hexatodesimal(hexa));
                biner = hexatobiner(hexa);
                System.out.println("Biner : " + biner);
            }
    }
    
    
    // desimal ke biner
    public static String desimaltobiner(int desimal){
        StringBuilder biner = new StringBuilder();
        while (desimal > 0){
            int sisa = desimal % 2;
            biner.insert(0, sisa);
            desimal /= 2;
        }
        return biner.length() > 0 ? biner.toString() : "0";
    }
    

    // desimal ke hexadesimal
    public static String desimaltohexa(int desimal){
        StringBuilder hexa = new StringBuilder();
        char[] hexachar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (desimal > 0){
            int sisa = desimal % 16;
            hexa.insert(0, hexachar[sisa]);
            desimal /= 16;
        }
        return hexa.length() > 0 ? hexa.toString() : "0" ;
    }


    // biner ke desimal
    public static int binertodesimal(String biner){
        int desimal = 0;
        int panjang = biner.length();

        for(int i = 0; i < panjang; i++){
            char bit = biner.charAt(panjang - 1 - i);
            if (bit == '1'){
                desimal += Math.pow(2, i);
            }
        }
        return desimal;
    }


    // biner ke hexadesimal
    public static String binertohexa(String biner){
        int desimal = binertodesimal(biner);
        return desimaltohexa(desimal);
    }


    // hexadesimal ke desimal 
    public static int hexatodesimal(String hexa){
        int desimalvalue = 0;
        int length = hexa.length();
        for (int i = 0; i < length; i++){
            char hexchar = hexa.charAt(i);
            int digitvalue = hexCharToDigit(hexchar);
            desimalvalue = desimalvalue * 16 + digitvalue;
        }
        return desimalvalue;
    }
    public static int hexCharToDigit(char hexachar) {
        if (hexachar >= '0' && hexachar <= '9') {
            return hexachar - '0';
        } else if (hexachar >= 'A' && hexachar <= 'F') {
            return 10 + (hexachar - 'A');
        } else {
            throw new IllegalArgumentException("Input tidak valid: " + hexachar);
        }
    }


    // hexadesimal ke biner
    public static String hexatobiner(String hexa) {
        StringBuilder biner = new StringBuilder();

        for (int i = 0; i < hexa.length(); i++) {
            char hexachar = hexa.charAt(i);
            biner.append(hexachartobiner(hexachar));
        }
        return biner.toString();
    }
    public static String hexachartobiner(char hexachar) {
        switch (hexachar) {
            case '0': return "0000";
            case '1': return "0001";
            case '2': return "0010";
            case '3': return "0011";
            case '4': return "0100";
            case '5': return "0101";
            case '6': return "0110";
            case '7': return "0111";
            case '8': return "1000";
            case '9': return "1001";
            case 'A': return "1010";
            case 'B': return "1011";
            case 'C': return "1100";
            case 'D': return "1101";
            case 'E': return "1110";
            case 'F': return "1111";
            default: throw new IllegalArgumentException("Karakter tidak valid: " + hexachar);
        }
    }
}