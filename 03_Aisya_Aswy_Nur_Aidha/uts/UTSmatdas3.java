public class UTSmatdas3 {
    public static void main(String[] args) {

        double suhu = 28.6;
        int kelembapan = 65;
        int co2 = 420; 
        int suhuInt = (int) suhu;

        System.out.print("Suhu       : " + suhu + " °C"); 
        System.out.print(" (Biner: ");

        int[] binerSuhu = new int[32];
        int i = 0; 

        while (suhuInt > 0) { 
            binerSuhu[i] = suhuInt % 2; 
            suhuInt /= 2; 
            i++; 
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binerSuhu[j]); 
        }

        System.out.print(", Heksadesimal: ");
        char[] hexSuhu = new char[32]; 

        i = 0; 
        suhuInt = (int) suhu; 
        char[] heksadesimal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}; 

        while (suhuInt > 0) { 
            hexSuhu[i] = heksadesimal[suhuInt % 16]; 
            suhuInt /= 16; 
            i++; 
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(hexSuhu[j]); 
        }

        System.out.println(")");
        System.out.print("Kelembapan : " + kelembapan + " %");
        System.out.print("    (Biner: ");

        int[] binerKelembapan = new int[32]; 
        i = 0; 

        while (kelembapan > 0) { 
            binerKelembapan[i] = kelembapan % 2; 
            kelembapan /= 2; 
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binerKelembapan[j]); 
        }

        System.out.print(", Heksadesimal: ");
        char[] hexKelembapan = new char[32]; 
        i = 0; 
        kelembapan = 65; 

        while (kelembapan > 0) { 
            hexKelembapan[i] = heksadesimal[kelembapan % 16];
            kelembapan /= 16; 
            i++; 
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(hexKelembapan[j]); 
        }

        System.out.println(")");
        System.out.print("CO2        : " + co2 + " ppm"); 
        System.out.print(" (Biner: ");
        
        int[] binerCO2 = new int[32]; 
        i = 0; 

        while (co2 > 0) { 
            binerCO2[i] = co2 % 2; 
            co2 /= 2;
            i++; 
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binerCO2[j]); 
        }

        System.out.print(", Heksadesimal: ");

        char[] hexCO2 = new char[32]; 
        i = 0; 
        co2 = 420;

        while (co2 > 0) { 
            hexCO2[i] = heksadesimal[co2 % 16]; 
            co2 /= 16; 
            i++; 
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(hexCO2[j]); 
        }
        System.out.println(")");
    }
}