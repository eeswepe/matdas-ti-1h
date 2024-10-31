import java.util.Scanner;
public class UTSno3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a[]=new double[3];
        double kelembapan;
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();
        System.out.print("Masukkan suhu : ");
        a[0] = sc.nextDouble();
        System.out.println("Contoh memasukkan kelembapan --> Kelembapan 65%, masukkan 65 saja tanpa (%)");
        System.out.print("Masukkan kelembapan : ");
        kelembapan =sc.nextDouble();
        a[1] = kelembapan/100;
        System.out.print("Masukkan CO2 : ");
        a[2] = sc.nextDouble();
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();
        int b[]=new int[3];
        b[0]=(int)a[0];
        b[1]=(int)a[1];
        b[2]=(int)a[2];
        double j[]=new double[3];
        j[0]=a[0]-b[0];
        j[1]=a[1]-b[1];
        j[2]=a[2]-b[2];
        String[] kondisi={"SUHU","KELEMBAPAN","CO2"};
        for (int c=0;c<3;c++){
            System.out.println(" "+kondisi[c]);
                System.out.println("   - Desimal = "+a[c]+"(10)");
                System.out.print("   - Biner = ");
            if (j[c]>= 0.5) {
                a[c]++;
                b[c]++;
            }
            int d[]=new int[20],e[] =new int[20],f=0;
                d[f] =(int) a[c] % 2;
                e[f]=(int) a[c]/2;
                while (true) {
                    if (e[f] == 0) {
                        break;
                    }else {
                        d[f+1] = e[f] % 2;
                        e[f+1]= e[f]/2;
                        f++; }
                }
                
                while (true) {
                    if (f== -1) {
                        break;
                    }else {
                        System.out.print(d[f]); }
                    f--;
                }
                System.out.println("(2)");
                System.out.print("   - Heksadesimal = ");
                int g[]=new int[20],h= 0;
                int[] i = new int[20];
                g[0] = b[c] % 16;
                i[0]= b[c]/16;
                while (true) {
                    if (i[h] == 0) {
                        break;
                    }else {
                        g[h+1] = i[h] % 16;
                        i[h+1]= i[h]/16;
                        h++; }
                    }
                while (true) {
                    if (h== -1) {
                        break;
                    }else {
                        if (g[h] == 10) {
                            System.out.print("A");
                        }else if (g[h] == 11) {
                            System.out.print("B");
                        }else if (g[h] == 12) {
                            System.out.print("C");
                        }else if (g[h] == 13) {
                            System.out.print("D");
                        }else if (g[h] == 14) {
                            System.out.print("E");
                        }else if (g[h] == 15) {
                            System.out.print("F");
                        }else {
                            System.out.print(g[h]); }
                        }
                    h--;
                }
                System.out.println("(16)");
        }
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();
    }
}
