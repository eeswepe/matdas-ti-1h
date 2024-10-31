import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String biner1,biner2;
        String hasil = "";
        int angkaBiner; 
        int desimal1 = 0;
        int desimal2 = 0;

        System.out.println("====== Perjumlahan biner =====");
        System.out.print("Masukkan bilangan biner Pertama : ");
        biner1 = sc.nextLine();

        // Dikonversikan ke desimal agar lebih mudah
        for(int i = 0; i < biner1.length(); i++){
            // mengambil karakter biner dari belakang
            char bit = biner1.charAt(biner1.length()- 1 - i);

            // jika bit = '1',tambahkan nilai yang sesuai ke desimal
            if (bit == '1') {
                desimal1 += 1 << i; 
            }
        }

        System.out.print("Masukkan bilangan biner Kedua : ");
        biner2 = sc.nextLine();

        // Dikonversikan ke desimal agar lebih mudah
        for(int i = 0; i < biner2.length(); i++){
            // mengambil karakter biner dari belakang
            char bit = biner2.charAt(biner2.length()- 1 - i);

            // jika bit = '1',tambahkan nilai yang sesuai ke desimal
            if (bit == '1') {
                desimal2 += 1 << i; 
            }
        }

        int jumlah = desimal1 + desimal2;
        // lalu mengonversikan jumlah ke Biner
        angkaBiner = jumlah;
        if (angkaBiner == 0) {
            hasil = "0";
        } else {
            while (angkaBiner > 0) {
                hasil = (angkaBiner % 2) + hasil;
                angkaBiner /= 2;
            }
        }
        System.out.println("Hasil Penjumlahan = " + hasil);
        point2();
        point3();
        point4();
    }
    public static void point2(){
        Scanner sc = new Scanner(System.in);
        String biner1,biner2;
        String hasil = "";
        int angkaBiner; 
        int desimal1 = 0;
        int desimal2 = 0;

        System.out.println("====== Pengurangan biner =====");
        System.out.print("Masukkan bilangan biner Pertama : ");
        biner1 = sc.nextLine();

        // Dikonversikan ke desimal agar lebih mudah
        for(int i = 0; i < biner1.length(); i++){
            // mengambil karakter biner dari belakang
            char bit = biner1.charAt(biner1.length()- 1 - i);

            // jika bit = '1',tambahkan nilai yang sesuai ke desimal
            if (bit == '1') {
                desimal1 += 1 << i; 
            }
        }

        System.out.print("Masukkan bilangan biner Kedua : ");
        biner2 = sc.nextLine();

        // Dikonversikan ke desimal agar lebih mudah
        for(int i = 0; i < biner2.length(); i++){
            // mengambil karakter biner dari belakang
            char bit = biner2.charAt(biner2.length()- 1 - i);

            // jika bit = '1',tambahkan nilai yang sesuai ke desimal
            if (bit == '1') {
                desimal2 += 1 << i; 
            }
        }

        int jumlah = desimal1 - desimal2;
        // lalu mengonversikan jumlah ke Biner
        angkaBiner = jumlah;
        if (angkaBiner == 0) {
            hasil = "0";
        } else {
            while (angkaBiner > 0) {
                hasil = (angkaBiner % 2) + hasil;
                angkaBiner /= 2;
            }
        }
        System.out.println("Hasil Pengurangan = " + hasil);
    }
    public static void point3(){
        Scanner sc = new Scanner(System.in);
        String biner1,biner2;
        String hasil = "";
        int angkaBiner; 
        int desimal1 = 0;
        int desimal2 = 0;

        System.out.println("====== Perkalian biner =====");
        System.out.print("Masukkan bilangan biner Pertama : ");
        biner1 = sc.nextLine();

        // Dikonversikan ke desimal agar lebih mudah
        for(int i = 0; i < biner1.length(); i++){
            // mengambil karakter biner dari belakang
            char bit = biner1.charAt(biner1.length()- 1 - i);

            // jika bit = '1',tambahkan nilai yang sesuai ke desimal
            if (bit == '1') {
                desimal1 += 1 << i; 
            }
        }

        System.out.print("Masukkan bilangan biner Kedua : ");
        biner2 = sc.nextLine();

        // Dikonversikan ke desimal agar lebih mudah
        for(int i = 0; i < biner2.length(); i++){
            // mengambil karakter biner dari belakang
            char bit = biner2.charAt(biner2.length()- 1 - i);

            // jika bit = '1',tambahkan nilai yang sesuai ke desimal
            if (bit == '1') {
                desimal2 += 1 << i; 
            }
        }

        int jumlah = desimal1 * desimal2;
        // lalu mengonversikan jumlah ke Biner
        angkaBiner = jumlah;
        if (angkaBiner == 0) {
            hasil = "0";
        } else {
            while (angkaBiner > 0) {
                hasil = (angkaBiner % 2) + hasil;
                angkaBiner /= 2;
            }
        }
        System.out.println("Hasil Perkalian = " + hasil);
    }
    public static void point4(){
        Scanner sc = new Scanner(System.in);
        String biner1,biner2;
        String and = ""; String or = ""; String xor ="";
        int andDesimal,orDesimal,xorDesimal;
        int desimal1 = 0;
        int desimal2 = 0;

        System.out.println("====== Operasi AND, OR, XOR pada biner =====");
        System.out.print("Masukkan Bilangan Biner Pertama : ");
        biner1 = sc.nextLine();
        // Konversi biner ke desimal supaya lebih mudah
        for(int i = 0; i < biner1.length(); i++){
            // mengambil karakter biner dari belakang
            char bit = biner1.charAt(biner1.length()- 1 - i);

            // jika bit = '1',tambahkan nilai yang sesuai ke desimal
            if (bit == '1') {
                desimal1 += 1 << i; 
            }
        }
        System.out.print("Masukkan Bilangan Biner Kedua : ");
        biner2 = sc.nextLine();
        // Konversi biner ke desimal supaya lebih mudah
        for(int i = 0; i < biner2.length(); i++){
            // mengambil karakter biner dari belakang
            char bit = biner2.charAt(biner1.length()- 1 - i);

            // jika bit = '1',tambahkan nilai yang sesuai ke desimal
            if (bit == '1') {
                desimal2 += 1 << i; 
            }
        }
        andDesimal = desimal1 & desimal2;
        orDesimal = desimal1 | desimal2;
        xorDesimal = desimal1 ^ desimal2;

        // mengubah kembali dari desimal ke biner
        if (andDesimal == 0) {
            and = "0";
        } else {
            while (andDesimal > 0) {
                and = (andDesimal % 2) + and;
                andDesimal /= 2;
            }
        }
        if (orDesimal == 0) {
            or = "0";
        } else {
            while (orDesimal > 0) {
                or = (orDesimal % 2) + or;
                orDesimal /= 2;
            }
        }
        if (xorDesimal == 0) {
            xor = "0";
        } else {
            while (xorDesimal > 0) {
                xor = (xorDesimal % 2) + xor;
                xorDesimal /= 2;
            }
        }

        // Menampilkan hasil operator bitwise
        System.out.println("Hasil AND dari kedua biner = " + and);
        System.out.println("Hasil OR dari kedua biner = " + or);
        System.out.println("Hasil XOR dari kedua biner = " + xor);
    }
}