import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suhu;

        System.out.println("====== Sensor Suhu ======");
        System.out.println("Masukkan Suhu : ");
        suhu = sc.nextDouble();
        // Membulatkan Bagian suhu
        // Membagi nilai desimal menjadi bagian bulat dan bagian desimalnya
        int bulat = (int) suhu;
        double bagianSuhu = suhu - bulat;

        // pembulatan
        int suhuBulat;
        if (bagianSuhu >= 0.5) {
            suhuBulat = bulat + 1;
        } else {
            suhuBulat = bulat;
        }
        System.out.println("Pembulatan dari suhu user input : " + suhuBulat);

        // Mengkonversi desimal ke biner
        String biner = "";
        if (suhuBulat == 0) {
            biner = "0";
        } else {
            while (suhuBulat > 0) {
                biner = (suhuBulat % 2) + biner;
                suhuBulat /= 2;
            }
        }
        // Mengkonversi desimal ke heksa
        int heksa;
        String heksaDesimal = "";
        heksa = suhuBulat;
        if (heksa == 0) {
            heksaDesimal = "0";
        } else {
            String simbolH = "0123456789ABCDEF";
            while (heksa > 0) {
                heksaDesimal = simbolH.charAt(heksa % 16) + heksaDesimal;
                heksa /= 16;
            }
        }
        System.out.println("Bilangan Biner : " + biner);
        System.out.println("Bilangan Heksa Desimal : " + heksaDesimal);
        point2();
        point3();
    }
    public static void point2(){
        Scanner sc = new Scanner(System.in);
        int kelembapan;

        System.out.println("====== Sensor kelembapan ======");
        System.out.println("Masukkan Kelembapan : ");
        kelembapan = sc.nextInt();

        // Mengkonversi desimal ke biner
        String biner = "";
        if (kelembapan == 0) {
            biner = "0";
        } else {
            while (kelembapan > 0) {
                biner = (kelembapan % 2) + biner;
                kelembapan /= 2;
            }
        }
        // Mengkonversi desimal ke heksa
        int heksa;
        String heksaDesimal = "";
        heksa = kelembapan;
        if (heksa == 0) {
            heksaDesimal = "0";
        } else {
            String simbolH = "0123456789ABCDEF";
            while (heksa > 0) {
                heksaDesimal = simbolH.charAt(heksa % 16) + heksaDesimal;
                heksa /= 16;
            }
        }
        System.out.println("Bilangan Biner : " + biner);
        System.out.println("Bilangan Heksa Desimal : " + heksaDesimal);
    }
    public static void point3(){
        Scanner sc = new Scanner(System.in);
        int co2;

        System.out.println("====== Sensor CO2 ======");
        System.out.println("Masukkan CO2 : ");
        co2 = sc.nextInt();

        // Mengkonversi desimal ke biner
        String biner = "";
        if (co2 == 0) {
            biner = "0";
        } else {
            while (co2 > 0) {
                biner = (co2 % 2) + biner;
                co2 /= 2;
            }
        }
        // Mengkonversi desimal ke heksa
        int heksa;
        String heksaDesimal = "";
        heksa = co2;
        if (heksa == 0) {
            heksaDesimal = "0";
        } else {
            String simbolH = "0123456789ABCDEF";
            while (heksa > 0) {
                heksaDesimal = simbolH.charAt(heksa % 16) + heksaDesimal;
                heksa /= 16;
            }
        }
        System.out.println("Bilangan Biner : " + biner);
        System.out.println("Bilangan Heksa Desimal : " + heksaDesimal);
    }
}