public class Soal06 {
    public static void main(String[] args) {
        // Konversi dari desimal 450 ke biner dan heksadesimal
        int desimal450 = 450;
        String biner450 = konversiDesimalKeBiner(desimal450);
        String heksadesimal450 = konversiDesimalKeHeksadesimal(desimal450);
        
        System.out.println("Desimal 450 ke Biner: " + biner450);
        System.out.println("Desimal 450 ke Heksadesimal: " + heksadesimal450);
        
        // Konversi dari biner 11011000 ke desimal dan heksadesimal
        String biner11011000 = "11011000";
        int desimal11011000 = konversiBinerKeDesimal(biner11011000);
        String heksadesimal11011000 = konversiDesimalKeHeksadesimal(desimal11011000);
        
        System.out.println("Biner 11011000 ke Desimal: " + desimal11011000);
        System.out.println("Biner 11011000 ke Heksadesimal: " + heksadesimal11011000);
        
        // Konversi dari heksadesimal 1F4 ke desimal dan biner
        String heksadesimal1F4 = "1F4";
        int desimal1F4 = konversiHeksadesimalKeDesimal(heksadesimal1F4);
        String biner1F4 = konversiDesimalKeBiner(desimal1F4);
        
        System.out.println("Heksadesimal 1F4 ke Desimal: " + desimal1F4);
        System.out.println("Heksadesimal 1F4 ke Biner: " + biner1F4);
    }
    
    // Fungsi konversi dari desimal ke biner
    public static String konversiDesimalKeBiner(int desimal) {
        StringBuilder biner = new StringBuilder();
        while (desimal > 0) {
            biner.insert(0, desimal % 2);
            desimal = desimal / 2;
        }
        return biner.toString();
    }
    
    // Fungsi konversi dari desimal ke heksadesimal
    public static String konversiDesimalKeHeksadesimal(int desimal) {
        StringBuilder heksadesimal = new StringBuilder();
        char[] heksDigit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (desimal > 0) {
            heksadesimal.insert(0, heksDigit[desimal % 16]);
            desimal = desimal / 16;
        }
        return heksadesimal.toString();
    }
    
    // Fungsi konversi dari biner ke desimal
    public static int konversiBinerKeDesimal(String biner) {
        int desimal = 0;
        int pangkat = 0;
        for (int i = biner.length() - 1; i >= 0; i--) {
            if (biner.charAt(i) == '1') {
                desimal += Math.pow(2, pangkat);
            }
            pangkat++;
        }
        return desimal;
    }
    
    // Fungsi konversi dari heksadesimal ke desimal
    public static int konversiHeksadesimalKeDesimal(String heksadesimal) {
        int desimal = 0;
        int pangkat = 0;
        for (int i = heksadesimal.length() - 1; i >= 0; i--) {
            char hexChar = heksadesimal.charAt(i);
            int nilai = (hexChar >= 'A' && hexChar <= 'F') ? hexChar - 'A' + 10 : hexChar - '0';
            desimal += nilai * Math.pow(16, pangkat);
            pangkat++;
        }
        return desimal;
    }
}
