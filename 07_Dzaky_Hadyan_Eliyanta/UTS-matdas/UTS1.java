import java.util.Scanner;
public class UTS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Biner");
        System.out.println("2. Desimal");
        System.out.println("3. Heksadesimal");
        System.out.print("From: ");
        int convertFrom = sc.nextInt();
        System.out.print("To: ");
        int convertTo = sc.nextInt();
        System.out.print("Bilangan: ");
        String input = sc.next();
        int digit = input.length();
        switch (convertFrom) {
            case 1:
                switch (convertTo) {
                    //biner ke desimal
                    case 2:
                    int decimal12 = 0;
                    for (int i = 0; i < digit; i++) {
                        char bit = input.charAt(digit - 1 - i);
                        if (bit == '1') {
                            decimal12 += Math.pow(2, i);
                        }
                    }
                        System.out.print("Hasil: " + decimal12);
                        break;
                    //biner ke heksa
                    case 3:
                    //ubah ke desimal dulu
                    int decimal13 = 0;
                    for (int i = 0; i < digit; i++) {
                        char bit = input.charAt(digit - 1 - i);
                        if (bit == '1') {
                            decimal13 += Math.pow(2, i);
                        }
                    }
                    //perulangan convert
                    char [] listModulus1 = new char[99];
                    int i = 0;
                    do {
                        int modulus = decimal13 % 16;
                        if (modulus < 10) {
                            listModulus1[i] = (char) ('0' + modulus);
                        } else {
                            listModulus1[i] = (char) ('A' + (modulus - 10));
                        }
                        decimal13 /= 16;
                        i++;
                    } while (decimal13 != 0);
                    System.out.print("Hasil: ");
                    //perulangan print
                    for (int j = i-1; j >= 0; j--) {
                        System.out.print(listModulus1[j]);
                    }
                    break;
                }
            case 2:
                switch (convertTo) {
                    //desimal ke biner
                    case 1:
                    int angka = Integer.valueOf(input);
                    int [] listModulus = new int[99];
                    int i = 0;
                    do {
                        listModulus[i] = angka % 2;
                        angka /= 2;
                        i++;
                    } while (angka != 0);
                    System.out.print("Hasil: ");
                    for (; i >= 0; i--) {
                        System.out.print(listModulus[i]);
                    }
                    break;
                    //desimal ke heksa
                    case 3:
                    int decimal23 = Integer.valueOf(input);
                    char [] listModulus1 = new char[99];
                    int j = 0;
                    do {
                        int modulus = decimal23 % 16;
                        if (modulus < 10) {
                            listModulus1[j] = (char) ('0' + modulus);
                        } else {
                            listModulus1[j] = (char) ('A' + (modulus - 10));
                        }
                        decimal23 /= 16;
                        j++;
                    } while (decimal23 != 0);
                    System.out.print("Hasil: ");
                    //perulangan print
                    for (int k = j-1; k >= 0; k--) {
                        System.out.print(listModulus1[k]);
                    }
                    break;
                }
            case 3:
                switch (convertTo) {
                    //heksa ke biner
                    case 1:
                    //Ubah ke desimal dulu
                    int angka = Integer.parseInt(input, 16);
                    int[] listModulus = new int[32];
                    int i = 0;
                    //Perulangan convert
                    do {
                        listModulus[i] = angka % 2;
                        angka /= 2;
                        i++;
                    } while (angka != 0);

                    //Perulangan print
                    System.out.print("Hasil: ");
                    for (int j = i - 1; j >= 0; j--) {
                        System.out.print(listModulus[j]);
                    }
                    break;
                    //heksa ke desimal
                    case 2:
                    int angka1 = Integer.parseInt(input, 16);
                    int[] listModulus1 = new int[32];
                    int j = 0;
                    System.out.print("Hasil: " + angka1);
                    break;
            }
        }
        sc.close();
    }
}