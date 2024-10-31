import java.util.Scanner;

public class Bagian1No1Poin1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      
        System.out.print("Masukkan angka Desimal yang akan diubah ke biner: ");
        int angka = sc.nextInt();
        

        System.out.print("Masukkan angka Desimal yang akan diubah ke heksadesimal: ");
        int angka_desimal = sc.nextInt();
        System.out.println();

      
        StringBuilder angkaBiner = new StringBuilder();
        if (angka == 0) {
            angkaBiner.append("0");
        } else {
            while (angka > 0) {
                int sisa = angka % 2;
                angkaBiner.insert(0, sisa); 
                angka = angka / 2;
            }
        }
        System.out.println("Hasil dari desimal ke biner = " + angkaBiner);

       
        String heksadesimal = "";
        char heksadesimal_char[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        if (angka_desimal == 0) {
            heksadesimal = "0";
        } else {
            while (angka_desimal > 0) {
                int index = angka_desimal % 16;
                heksadesimal = heksadesimal_char[index] + heksadesimal; 
                angka_desimal = angka_desimal / 16;
            }
        }
        System.out.println("Hasil dari desimal ke heksadesimal = " + heksadesimal);
    }
}