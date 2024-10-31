import java.util.Scanner;
public class UTSno4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] a=new int[8],b={1,0,1,0,1,0,1,0};
        for (int i=0;i<8;i++){
            System.out.print("Masukkan angka ke-" + (i+1)+ " dari deret bilangan biner yg ingin anda oprasikan : ");
            a[i]=sc.nextInt();
        }System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();
        System.out.print(" ");
        int c,c1,d=8,d1=8,e,e1;
        c=0;
        e =0;
        while (d > e) {
            System.out.print(a[c]);
            c++;
            e++;
        }System.out.println("(2)");
        System.out.print(" ");
        c1=0;
        e1=0;
        while (d1 > e1) {
            System.out.print(b[c1]);
            c1++;
            e1++;
        }System.out.println("(2)");
        e1=0;
        System.out.print(" ");
        while (d1 > e1) {
            System.out.print("-");
            e1++;
        }System.out.println("---");
        int z1[]=new int[d];
        c=0;
        for(int i=0;i<d;i++){
            if (a[i] == b[i]) {
                z1[i]=0;
            }else{ z1[i]=1; }
        }System.out.print(" ");
        c=0;
        e =0;
        while (d > e) {
            System.out.print(z1[c]);
            c++;
            e++;
        }System.out.println("(2)");
        int j[]=new int[9];
        int h=0,i=8-1;
        int f;
        while (true) {
            f=1;
            e=1;
            if (i <= -1) {
                break;
            }
            h++;
            while (4>=e ) {
                if (i == -1) {
                    break;
                }
                if (z1[i] ==1) {
                    j[h] += f;
                }
                e++;
                i--;
                f *= 2; }
        }System.out.print(" ");
        while (true) {
            if (h== 0) {
                break;
            }else {
                if (h == 10) {
                    System.out.print("A");
                }else if (j[h] == 11) {
                    System.out.print("B");
                }else if (j[h] == 12) {
                    System.out.print("C");
                }else if (j[h] == 13) {
                    System.out.print("D");
                }else if (j[h] == 14) {
                    System.out.print("E");
                }else if (j[h] == 15) {
                    System.out.print("F");
                }else {
                    System.out.print(j[h]); }
            }
            h--;
        }
        System.out.println("(16)");
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();
    }
}
