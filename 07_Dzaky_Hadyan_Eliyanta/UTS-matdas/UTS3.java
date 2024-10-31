import java.util.Scanner;
public class UTS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Suhu(°C): ");
        double suhu = sc.nextDouble();
        System.out.print("Kelembapan(%): ");
        int kelembapan = sc.nextInt();
        System.out.print("CO2(ppm): ");
        int CO2 = sc.nextInt();
        //suhu ke biner
        int suhuInt = (int) suhu;
        double koma = suhu - suhuInt;
        if (koma >= 0.5) {
            suhuInt += 1;
        }
        int [] listModulus = new int[99];
        int i = 0;
        do {
            listModulus[i] = suhuInt % 2;
            suhuInt /= 2;
            i++;
        } while (suhuInt != 0);
        System.out.print("Suhu dalam biner: ");
        for (; i >= 0; i--) {
            System.out.print(listModulus[i]);
        }
        System.out.println();
        //suhu desimal ke hexadesimal
        int suhuInt1 = (int) suhu;
        double koma1 = suhu - suhuInt;
        if (koma >= 0.5) {
            suhuInt1 += 1;
        }
        char [] listModulus1 = new char[99];
        int j = 0;
        do {
            int modulus = suhuInt1 % 16;
            if (modulus < 10) {
                listModulus1[j] = (char) ('0' + modulus);
            } else {
                listModulus1[j] = (char) ('A' + (modulus - 10));
            }
            suhuInt1 /= 16;
            j++;
        } while (suhuInt1 != 0);
        System.out.print("Suhu dalam hexadesimal: ");
        //perulangan print
        for (int k = j-1; k >= 0; k--) {
            System.out.print(listModulus1[k]);
        }
        System.out.println();
        //kelembapan ke biner
        int kelembapanBiner = kelembapan;
        int [] listModulus2 = new int[99];
        int k = 0;
        do {
            listModulus[k] = kelembapanBiner % 2;
            kelembapanBiner /= 2;
            k++;
        } while (kelembapanBiner != 0);
        System.out.print("Kelembapan dalam biner: ");
        for (; k >= 0; k--) {
            System.out.print(listModulus[k]);
        }
        System.out.println();
        //kelembapan ke hexadesimal
        int kelembapanHexa = kelembapan;
        char [] listModulus3 = new char[99];
        int l = 0;
        do {
            int modulus = kelembapanHexa % 16;
            if (modulus < 10) {
                listModulus3[l] = (char) ('0' + modulus);
            } else {
                listModulus3[l] = (char) ('A' + (modulus - 10));
            }
            kelembapanHexa /= 16;
            l++;
        } while (kelembapanHexa != 0);
        System.out.print("Kelembapan dalam hexadesimal: ");
        //perulangan print
        for (int m = l-1; m >= 0; m--) {
            System.out.print(listModulus3[m]);
        }
        System.out.println();
        //CO2 ke biner
        int CO2Biner = CO2;
        int [] listModulus4 = new int[99];
        int m = 0;
        do {
            listModulus4[m] = CO2Biner % 2;
            CO2Biner /= 2;
            m++;
        } while (CO2Biner != 0);
        System.out.print("CO2 dalam biner: ");
        for (; m >= 0; m--) {
            System.out.print(listModulus[m]);
        }
        System.out.println();
        //CO2 ke hexadesimal
        int CO2Hexa = CO2;
        char [] listModulus5 = new char[99];
        int n = 0;
        do {
            int modulus = CO2Hexa % 16;
            if (modulus < 10) {
                listModulus5[n] = (char) ('0' + modulus);
            } else {
                listModulus5[n] = (char) ('A' + (modulus - 10));
            }
            CO2Hexa /= 16;
            n++;
        } while (CO2Hexa != 0);
        System.out.print("CO2 dalam hexadesimal: ");
        //perulangan print
        for (int o = n-1; o >= 0; o--) {
            System.out.print(listModulus5[o]);
        }
        System.out.println();
        sc.close();
    }
}