import java.util.Scanner;

public class main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int desimal,angkaBiner,angkaHeks;
        String biner = "";
        String heksaDesimal = "";

        System.out.println("----- Point 1 Dari No 1 -----");
        // input Pengguna
        System.out.print("Masukkan Bilangan Desimal : ");
        desimal = sc.nextInt();

        // Konversi Desimal Ke Biner
        angkaBiner = desimal;
        if (angkaBiner == 0) {
            biner = "0";
        } else {
            while (angkaBiner > 0) {
                biner = (angkaBiner % 2) + biner;
                angkaBiner /= 2;
            }
        }

        // Konversi Desimal Ke Heksa
        angkaHeks = desimal;
        if (angkaHeks == 0) {
            heksaDesimal = "0";
        } else {
            String simbolH = "0123456789ABCDEF";
            while (angkaHeks > 0) {
                heksaDesimal = simbolH.charAt(angkaHeks % 16) + heksaDesimal;
                angkaHeks /= 16;
            }
        }
        
        System.out.println("Bilangan Biner : " + biner);
        System.out.println("Bilangan Heksa Desimal : " + heksaDesimal);

        // memanggil public static void yang lain
        point2();
        point3();
    }

    public static void point2(){
        Scanner sc = new Scanner(System.in);

        String biner;
        String heksaDesimal = "";
        int desimal = 0;

        System.out.println("----- Point 2 Dari No 1 -----");
        System.out.print("Masukkan Bilangan Biner : ");
        biner = sc.nextLine();

        // Konversi biner ke Desimal
        for(int i = 0; i < biner.length(); i++){
            // mengambil karakter biner dari belakang
            char bit = biner.charAt(biner.length() - 1 - i);

            // jika bit = '1',tambahkan nilai yang sesuai ke desimal
            if (bit == '1') {
                desimal += 1 << i; 
            }
        }

        System.out.println("Bilangan desimal : " + desimal);
        
        // Setelah konversi biner ke desimal lalu desimal ke heksa
        if (desimal == 0) {
            heksaDesimal = "0";
        } else {
            String simbolH = "0123456789ABCDEF";
            while (desimal > 0) {
                heksaDesimal = simbolH.charAt(desimal % 16) + heksaDesimal;
                desimal /= 16;
            }
        }

        System.out.println("Bilangan Heksadesimal : " + heksaDesimal);
    }

    public static void point3(){
        Scanner sc = new Scanner(System.in);

        String heksaDesimal;
        String biner = "";
        int desimal = 0; 
        int nilaiHeksa;

        System.out.println("----- Point 3 Dari No 1 -----");
        System.out.print("Masukkan Bilangan Heksadesimal : ");
        heksaDesimal = sc.nextLine();

        // konversi Heksadesimal ke desimal
        for (int i = 0;i < heksaDesimal.length();i++){
            // mengambil karakter dari belakang
            char karakter = heksaDesimal.charAt(heksaDesimal.length() - 1 - i);

            // menentukan nilai heksadesimal
            if (karakter >= '0' && karakter <= '9') {
                // mengonversi karakter ke int
                nilaiHeksa = karakter - '0';
            }else if (karakter >= 'A' && karakter <= 'F') {
                // mengonversi karakter A-F ke 10-15
                nilaiHeksa = karakter - 'A' + 10;
            }else{
                System.out.println("Karakter heksadesimal tidak valid!");
                continue;
            }

            desimal += nilaiHeksa * (1 << (4 * i));
        }

        System.out.println("Bilangan bilangan Desimal : " + desimal);

        // Setelah di konversi ke desimal maka desimal di konversi ke biner agar lebih mudah
        if (desimal == 0) {
            biner = "0";
        } else {
            while (desimal > 0) {
                biner = (desimal % 2) + biner;
                desimal /= 2;
            }

            System.out.println("Bilangan Biner : " + biner);
        }
    }
}