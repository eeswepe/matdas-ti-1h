import java.util.Scanner;

public class matdas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilihan konversi :");
        System.out.println("1. Desimal ke Biner & Heksadesimal");
        System.out.println("2. Biner ke Desimal & Heksadesimal");
        System.out.println("3. Heksadesimal ke Desimal & Biner");
        System.out.println();

        int pilihan;

        System.out.print("Masukkan pilihan : ");
        pilihan = sc.nextInt();
        System.out.println("");

        switch (pilihan) {
            case 1:
                System.out.println("##  Desimal ke Biner & Heksadesimal ##");
                System.out.println("");

                int angkaDes, i;
                int sisa[] = new int[32];

                System.out.print("Masukkan bilangan desimal : ");
                angkaDes = sc.nextInt();

                int angka2 = angkaDes;
                for(i = 0; angkaDes > 0; i++) {
                    sisa[i] = angkaDes%2;
                    angkaDes = angkaDes/2;
                }
                System.out.print("Angka binernya adalah : ");

                for(i = i-1; i >= 0; i--) {
                    System.out.print(sisa[i]);
                }
                System.out.println();

                String hexa = ""; 
                // untuk menyimpan hasil OUTPUT hexadesimal

                while(angka2 != 0) {
                    
                    int bilHexa = angka2 % 16;
                    
                
                    char hexaDigit = (bilHexa <= 9 && bilHexa >= 0) ?
                    (char)(bilHexa + '0') : (char)(bilHexa - 10 + 'A');
                    hexa = hexaDigit + hexa;
                    angka2  = angka2/16;
                }
                System.out.print("Angka hexadesimalnya adalah : " + hexa);
                break;

            case 2:
                System.out.println("## Biner ke Desimal & Heksadesimal ##");   
                System.out.println();

                int angkaBin, digit;
                int angkaDesimal = 0;
                int j = 1;

                System.out.print("Masukkan bilangan biner : ");
                angkaBin = sc.nextInt();

                while (angkaBin != 0) {
                    digit = angkaBin % 10;
                    angkaDesimal = angkaDesimal + (digit * j);

                    j = j*2;
                    angkaBin = angkaBin/10;
                }
                System.out.println("Angka desimalnya adalah : " + angkaDesimal);

                String hexa2 = ""; 
                // untuk menyimpan hasil OUTPUT hexadesimal

                while(angkaDesimal != 0) {
                    
                    int bilHexa = angkaDesimal % 16;
                    
                
                    char hexaDigit = (bilHexa <= 9 && bilHexa >= 0) ?
                    (char)(bilHexa + '0') : (char)(bilHexa - 10 + 'A');
                    hexa2 = hexaDigit + hexa2;
                    angkaDesimal  = angkaDesimal/16;
                }
                System.out.print("Angka hexadesimalnya adalah : " + hexa2);
                break;
           
            case 3:
            System.out.println("## Heksadesimal ke Desimal && Biner ##");   
            System.out.println();

            String angkaHeksa;
            int desimal = 0, h;

            System.out.print("Masukkan bilangan heksadesimal : ");
            angkaHeksa = sc.next();

            for (h = 0; h < angkaHeksa.length(); h++) {
                char karakter = angkaHeksa.charAt(h);
                int nilai;

                if (karakter >= '0' && karakter <= '9') {
                    nilai = karakter - '0';
                }
                else if (karakter >= 'A' && karakter <= 'F') {
                    nilai = karakter - 'A' + 10;
                }
                else if (karakter >= 'a' && karakter <= 'f') {
                    nilai = karakter - 'a' + 10;
                }
                else {
                    System.out.println("input tidak valid.");
                    return;
                }
                desimal = desimal * 16 + nilai;
            }
            System.out.println("Angka desimalnya adalah : " + desimal);

            int sisa2[] = new int[32];

            for(i = 0; desimal > 0; i++) {
                sisa2[i] = desimal%2;
                desimal = desimal/2;
            }
            System.out.print("Angka binernya adalah : ");

            for(i = i-1; i >= 0; i--) {
                System.out.print(sisa2[i]);
            }
            System.out.println();
        } 
    }
}