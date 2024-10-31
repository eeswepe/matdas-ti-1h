import java.util.Scanner;
public class UTSmatdas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int desimal, sisa, i = 0;
        int biner[] = new int[100];
        char[] heksa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int desimal1;
        String bilHeksa = "";

        System.out.println("============= Soal No 1 Bagian 1 =============");
        
        System.out.print("Masukkan bilangan Desimal  : ");
        desimal = sc.nextInt();
        desimal1 = desimal;
        
        while(desimal != 0) {
            biner[i] = desimal %2;
            desimal = desimal/2;
            i++;
        }
        System.out.print("Bilangan biner nya         : ");
        
        for (int j=i-1; j>=0; j--) {
            System.out.print(biner[j]);
        }
        
        while(desimal1 > 0) {
            sisa = desimal1 % 16;
            bilHeksa = heksa[sisa] + bilHeksa;
            desimal1 = desimal1/16;
        }
        System.out.println();
        System.out.println("Bilangan Heksadesimalnya   : " + bilHeksa );

        bagian2();
        bagian3();
    }
    public static void bagian2() {
        Scanner sc = new Scanner (System.in);

        int bilBiner;
        int desimal = 0;
        int reminder, i = 0 , desimal1; 
        char[] heksa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String bilHeksa = "";

        System.out.println("============= Soal No 1 Bagian 2 =============");

        System.out.print("Masukkan bilangan Biner    : ");
        bilBiner = sc.nextInt();
        
        while (bilBiner != 0) {
            reminder = bilBiner % 10;
            desimal += reminder * Math.pow(2, i);
            i++;
            bilBiner /= 10;
        }
        System.out.print("Bilangan Desimalnya adalah : " + desimal);
        desimal1 = desimal;

        for (int j = i-1; i < 0; j--) {
            System.out.print(desimal);
        }
        while (desimal1 > 0) {
            reminder = desimal1 % 16;
            bilHeksa = heksa[reminder] + bilHeksa;
            desimal1 /= 16;
        }
        System.out.println();
        System.out.println("Bilangan Heksadesimalnya   : " + bilHeksa);
    }
    public static void bagian3() {
        Scanner sc = new Scanner(System.in);

        String bilHeksa;

        System.out.println("============= Soal No 1 Bagian 3 =============");

        // Meminta input bilangan heksadesimal dari pengguna
        System.out.print("Masukkan bilangan Heksadesimal : ");
        bilHeksa = sc.nextLine().toUpperCase(); // Mengubah input menjadi huruf besar
        
        // Konversi dari heksadesimal ke desimal
        int desimal = 0, nilai; 
        int panjang = bilHeksa.length();
        
        // Konversi heksadesimal ke desimal
        for (int i = 0; i < panjang; i++) {
            char karakter = bilHeksa.charAt(i);              

            // Mengonversi karakter heksadesimal menjadi nilai desimal
            if (karakter >= '0' && karakter <= '9') {
                nilai = karakter - '0';
            } else if (karakter >= 'A' && karakter <= 'F') {
                nilai = karakter - 'A' + 10;
            } else {
                System.out.println("Input bukan bilangan heksadesimal yang valid!");
                return;
            }
            // Menghitung nilai desimal dengan menambah nilai setiap digit
            desimal = desimal * 16 + nilai;
        }
        // Output hasil desimal 
        System.out.println("Bilangan Desimalnya adalah     : " + desimal );

        // Konversi dari desimal ke biner
        String bilBiner = "";
        int desimalBiner = desimal;
        if (desimalBiner == 0) {
            bilBiner = "0";
        } else {
            while (desimalBiner > 0) { 
                int sisa = desimalBiner % 2;
                bilBiner = sisa + bilBiner; // Menambah bit ke depan string biner
                desimalBiner /= 2;
            }
        }
        // Output hasil biner 
        System.out.println("Bilangan Binernya adalah       : " + bilBiner);
    }
}