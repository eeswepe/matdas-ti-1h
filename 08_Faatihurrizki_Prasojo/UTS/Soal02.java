import java.util.Scanner;
public class Soal02 {
    public static void main(String[] args) {
        Scanner prasojo = new Scanner(System.in);

        System.out.println("============================================================================");
        System.out.println("-                           UTS MATEMATIKA DASAR                           -");
        System.out.println("============================================================================");
        System.out.print("Masukkan bilangan biner ke-1 : ");
        String bilBiner1 = prasojo.nextLine();
        System.out.print("Masukkan bilangan biner ke-2 : ");
        String bilBiner2 = prasojo.next();
        System.out.println("============================================================================");
        System.out.println("Pilih jenis operasi:");
        System.out.println("1. Penjumlahan ");
        System.out.println("2. Pengurangan ");
        System.out.println("3. Perkalian ");
        System.out.println("4. AND, OR, XOR ");
        System.out.print("Masukkan jenis pilihan 1 - 4 : ");
        int pilihan = prasojo.nextInt();
        System.out.println("============================================================================");
        switch(pilihan) {
            case 1 :
            int desimal1 = 0, desimal2 = 0;
                int pangkat1 = 1, pangkat2 = 1;
                // Konversi biner ke desimal
                for (int i = bilBiner1.length() - 1; i >= 0; i--) {
                    if (bilBiner1.charAt(i) == '1') {
                    desimal1 += pangkat1;
                    }pangkat1 *= 2;
                }
                for (int j = bilBiner2.length() - 1; j >= 0; j--) {
                    if (bilBiner2.charAt(j) == '1') {
                    desimal2 += pangkat2;
                    }pangkat2 *= 2;
                }
                int totalDes = desimal1 + desimal2;
                String totBiner = "";
                for (int i = totalDes; i > 0; i /= 2) {
                    totBiner = (i % 2) + totBiner;
                }
                System.out.println("Hasil dari " + bilBiner1 + " + " + bilBiner2 + " = " + totBiner);
                break;

            case 2 :
            desimal1 = 0; desimal2 = 0;
                pangkat1 = 1; pangkat2 = 1;
                // Konversi biner ke desimal
                for (int i = bilBiner1.length() - 1; i >= 0; i--) {
                    if (bilBiner1.charAt(i) == '1') {
                    desimal1 += pangkat1;
                    }pangkat1 *= 2;
                }
                for (int j = bilBiner2.length() - 1; j >= 0; j--) {
                    if (bilBiner2.charAt(j) == '1') {
                    desimal2 += pangkat2;
                    }pangkat2 *= 2;
                }
                totalDes = desimal1 - desimal2;
                totBiner = "";
                for (int i = totalDes; i > 0; i /= 2) {
                    totBiner = (i % 2) + totBiner;
                }
                System.out.println("Hasil dari " + bilBiner1 + " - " + bilBiner2 + " = " + totBiner);
                break;
            case 3 :
            desimal1 = 0; desimal2 = 0;
                pangkat1 = 1; pangkat2 = 1;
                // Konversi biner ke desimal
                for (int i = bilBiner1.length() - 1; i >= 0; i--) {
                    if (bilBiner1.charAt(i) == '1') {
                    desimal1 += pangkat1;
                    }pangkat1 *= 2;
                }
                for (int j = bilBiner2.length() - 1; j >= 0; j--) {
                    if (bilBiner2.charAt(j) == '1') {
                    desimal2 += pangkat2;
                    }pangkat2 *= 2;
                }
                totalDes = desimal1 * desimal2;
                totBiner = "";
                for (int i = totalDes; i > 0; i /= 2) {
                    totBiner = (i % 2) + totBiner;
                }
                System.out.println("Hasil dari " + bilBiner1 + " x " + bilBiner2 + " = " + totBiner);
                break;
            case 4 :
        // Operasi AND
        String hasilAnd = "";
        for (int i = bilBiner1.length() - 1; i >= 0; i--) {
            char bit1 = bilBiner1.charAt(i);
            char bit2 = bilBiner2.charAt(i);
            hasilAnd = (bit1 == '1' && bit2 == '1') ? "1" + hasilAnd : "0" + hasilAnd;
        }

        // Operasi OR
        String hasilOr = "";
        for (int i = bilBiner1.length() - 1; i >= 0; i--) {
            char bit1 = bilBiner1.charAt(i);
            char bit2 = bilBiner2.charAt(i);
            hasilOr = (bit1 == '1' || bit2 == '1') ? "1" + hasilOr : "0" + hasilOr;
        }

        // Operasi XOR
        String hasilXor = "";
        for (int i = bilBiner1.length() - 1; i >= 0; i--) {
            char bit1 = bilBiner1.charAt(i);
            char bit2 = bilBiner2.charAt(i);
            hasilXor = (bit1 != bit2) ? "1" + hasilXor : "0" + hasilXor;
        }
        System.out.println("Hasil AND: " + hasilAnd);
        System.out.println("Hasil OR: " + hasilOr);
        System.out.println("Hasil XOR: " + hasilXor);
    }prasojo.close();            
}
}