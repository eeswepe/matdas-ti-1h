import java.util.Scanner;
public class UTS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Operasi logika(AND, OR, XOR)");
        System.out.print("Pilih operasi terhadap biner: ");
        int operasi = sc.nextInt();
        String sampah = sc.nextLine();
        System.out.print("Bilangan pertama: ");
        String bilanganPertama = sc.nextLine();
        System.out.print("Bilangan kedua: ");
        String bilanganKedua = sc.nextLine();
        int digit1 = bilanganPertama.length();
        int digit2 = bilanganKedua.length();
        switch (operasi) {
            //penjumlahan
            case 1:
            //biner 1 ke desimal
            int decimal11 = 0;
                    for (int i = 0; i < digit1; i++) {
                        char bit = bilanganPertama.charAt(digit1 - 1 - i);
                        if (bit == '1') {
                            decimal11 += Math.pow(2, i);
                        }
                    }
                    System.out.println("Desimal 1: " + decimal11);
            //biner 2 ke desimal
            int decimal12 = 0;
                    for (int i = 0; i < digit2; i++) {
                        char bit = bilanganKedua.charAt(digit2 - 1 - i);
                        if (bit == '1') {
                            decimal12 += Math.pow(2, i);
                        }
                    }
                    System.out.println("Desimal 2: " + decimal12);
            int jumlahDesimal = decimal11 + decimal12;
            //jumlahDesimal ke biner
                    int [] listModulus1 = new int[99];
                    int i = 0;
                    do {
                        listModulus1[i] = jumlahDesimal % 2;
                        jumlahDesimal /= 2;
                        i++;
                    } while (jumlahDesimal != 0);
                    for (; i >= 0; i--) {
                        System.out.print(listModulus1[i]);
                    }
                    break;
            //pengurangan
            case 2:
            //biner 1 ke desimal
            int decimal21 = 0;
                    for (int j = 0; j < digit1; j++) {
                        char bit = bilanganPertama.charAt(digit1 - 1 - j);
                        if (bit == '1') {
                            decimal21 += Math.pow(2, j);
                        }
                    }
                    System.out.println("Desimal 1: " + decimal21);
            //biner 2 ke desimal
            int decimal22 = 0;
                    for (int j = 0; j < digit2; j++) {
                        char bit = bilanganKedua.charAt(digit2 - 1 - j);
                        if (bit == '1') {
                            decimal22 += Math.pow(2, j);
                        }
                    }
                    System.out.println("Desimal 2: " + decimal22);
            int kurangDesimal = decimal21 + decimal22;
            //kurangDesimal ke biner
                    int [] listModulus2 = new int[99];
                    int j = 0;
                    do {
                        listModulus2[j] = kurangDesimal % 2;
                        kurangDesimal /= 2;
                        j++;
                    } while (kurangDesimal != 0);
                    for (; j >= 0; j--) {
                        System.out.print(listModulus2[j]);
                    }
                break;
            //perkalian
            case 3:
            //biner 1 ke desimal
            int decimal31 = 0;
                    for (int k = 0; k < digit1; k++) {
                        char bit = bilanganPertama.charAt(digit1 - 1 - k);
                        if (bit == '1') {
                            decimal31 += Math.pow(2, k);
                        }
                    }
                    System.out.println("Desimal 1: " + decimal31);
            //biner 2 ke desimal
            int decimal32 = 0;
                    for (int k = 0; k < digit2; k++) {
                        char bit = bilanganKedua.charAt(digit2 - 1 - k);
                        if (bit == '1') {
                            decimal32 += Math.pow(2, k);
                        }
                    }
                    System.out.println("Desimal 2: " + decimal32);
            int kaliDesimal = decimal31 * decimal32;
            //kaliDesimal ke biner
                    int [] listModulus3 = new int[99];
                    int k = 0;
                    do {
                        listModulus3[k] = kaliDesimal % 2;
                        kaliDesimal /= 2;
                        k++;
                    } while (kaliDesimal != 0);
                    for (; k >= 0; k--) {
                        System.out.print(listModulus3[k]);
                    }
                break;
            //logika
            case 4:
            //AND
            System.out.print("AND: ");
            for (int l = 0; l < digit1; l++) {
                if (bilanganPertama.charAt(l) == '1' && bilanganKedua.charAt(l) == '1') {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
            //OR
            System.out.print("OR: ");
            for (int l = 0; l < digit1; l++) {
                if (bilanganPertama.charAt(l) == '1' || bilanganKedua.charAt(l) == '1') {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
            //XOR
            System.out.print("XOR: ");
            for (int l = 0; l < digit1; l++) {
                if (bilanganPertama.charAt(l) == bilanganKedua.charAt(l)) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            break;
        }
        sc.close();
    }
}