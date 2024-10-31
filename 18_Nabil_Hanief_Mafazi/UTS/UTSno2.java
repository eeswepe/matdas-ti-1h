import java.util.Scanner;
public class UTSno2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int layanan;

        while (true) {
            System.out.println();
            System.out.println(" __________________________________________________");
            System.out.println("| Menu layanan  :                                  |");
            System.out.println("|  1.Penjumlahan 2 deret bilangan biner            |");
            System.out.println("|  2.Pengurangan 2 deret bilangan biner            |");
            System.out.println("|  3.Perkalian 2 deret bilangan biner              |");
            System.out.println("|  4.Operasi AND,OR, dan XOR pada bilangan biner   |");
            System.out.println("|  5.Keluar                                        |");
            System.out.println("|__________________________________________________|");
            System.out.print("Masukkan angka dari layanan yg ingin anda gunakan : ");
            layanan = sc.nextInt();
            if (layanan == 1) {
                System.out.println(" ____________________________________ ");
                System.out.println("| Penjumlahan 2 deret bilangan biner |");
                System.out.println("|____________________________________|");
                System.out.println("DERET PERTAMA");
                System.out.println("-------------");
                int a[]=new int[20],c =0,d,e=1,b=0,f=1;
                System.out.print("Berapa jumlah angka dari deret bilangan biner pertama yg ingin anda jumlahkan : ");
                d = sc.nextInt();
                while (d >= e) {
                    System.out.print("  Masukkan angka ke-" + e + " dari deret bilangan biner pertama yg ingin anda jumlahkan : ");
                    a[c] = sc.nextInt();
                    c++;
                    e++;
                }e =1;
                c=0;
                System.out.print("Deret bilangan biner pertama yg ingin anda jumlahkan : ");
                while (d >= e) {
                    System.out.print(a[c]);
                    c++;
                    e++;
                }e =1;
                System.out.println("(2)");
                while (d >= e) {
                    if (a[c-1] ==1) {
                       b += f;
                    }else{b+=0;}
                    e++;
                    c--;
                    f *= 2;
                }
                System.out.println("Desimal = "+b);
                System.out.println("-------------------------------------------------------------");
                int ab[]=new int[20],c1 =0,d1,e1=1,b1=0,f1=1;
                System.out.println("DERET KEDUA");
                System.out.println("-----------");
                System.out.print("Berapa jumlah angka dari deret bilangan biner kedua yg ingin anda jumlahkan : ");
                d1 = sc.nextInt();
                while (d1 >= e1) {
                    System.out.print("  Masukkan angka ke-" + e1 + " dari deret bilangan biner kedua yg ingin anda jumlahkan : ");
                    ab[c1] = sc.nextInt();
                    c1++;
                    e1++;
                }e1 =1;
                c1=0;
                System.out.print("Deret bilangan biner kedua yg ingin anda jumlahkan : ");
                while (d1 >= e1) {
                    System.out.print(ab[c1]);
                    c1++;
                    e1++;
                }e1 =1;
                System.out.println("(2)");
                while (d1 >= e1) {
                    if (ab[c1-1] ==1) {
                       b1 += f1;
                    }else{b1+=0;}
                    e1++;
                    c1--;
                    f1 *= 2;
                }
                System.out.println("Desimal = "+b1);
                System.out.println("-------------------------------------------------------------");
                int m = b + b1;
                int de[]=new int[20],c2= 0;
                int[] bc = new int[20];
                de[0] = m % 2;
                bc[0]= m/2;
                while (true) {
                    if (bc[c2] == 0) {
                        break;
                    }else {
                        de[c2+1] = bc[c2] % 2;
                        bc[c2+1]= bc[c2]/2;
                        c2++; }
                }
                e =1;
                c=0;
                while (d >= e) {
                    System.out.print(a[c]);
                    c++;
                    e++;
                }
                System.out.print(" + ");
                e1 =1;
                c1=0;
                while (d1 >= e1) {
                    System.out.print(ab[c1]);
                    c1++;
                    e1++;
                }
                System.out.print(" = ");
                while (true) {
                    if (c2== -1) {
                        break;
                    }else {
                        System.out.print(de[c2]); }
                    c2--;
                }
                System.out.println("(2)");
                System.out.println(b +" + " + b1 +" = " + m+ "(10)");
                
            }else if (layanan ==2) {
                System.out.println(" ____________________________________ ");
                System.out.println("| Pengurangan 2 deret bilangan biner |");
                System.out.println("|____________________________________|");
                System.out.println("DERET PERTAMA");
                System.out.println("-------------");
                int a[]=new int[20],c =0,d,e=1,b=0,f=1;
                System.out.print("Berapa jumlah angka dari deret bilangan biner pertama yg ingin anda kurangkan : ");
                d = sc.nextInt();
                while (d >= e) {
                    System.out.print("  Masukkan angka ke-" + e + " dari deret bilangan biner pertama yg ingin anda kurangkan : ");
                    a[c] = sc.nextInt();
                    c++;
                    e++;
                }e =1;
                c=0;
                System.out.print("Deret bilangan biner pertama yg ingin anda kurangkan : ");
                while (d >= e) {
                    System.out.print(a[c]);
                    c++;
                    e++;
                }e =1;
                System.out.println("(2)");
                while (d >= e) {
                    if (a[c-1] ==1) {
                       b += f;
                    }else{b+=0;}
                    e++;
                    c--;
                    f *= 2;
                }
                System.out.println("Desimal = "+b);
                System.out.println("-------------------------------------------------------------");
                int ab[]=new int[20],c1 =0,d1,e1=1,b1=0,f1=1;
                System.out.println("DERET KEDUA");
                System.out.println("-----------");
                System.out.print("Berapa jumlah angka dari deret bilangan biner kedua yg ingin anda kurangkan : ");
                d1 = sc.nextInt();
                while (d1 >= e1) {
                    System.out.print("  Masukkan angka ke-" + e1 + " dari deret bilangan biner kedua yg ingin anda kurangkan : ");
                    ab[c1] = sc.nextInt();
                    c1++;
                    e1++;
                }e1 =1;
                c1=0;
                System.out.print("Deret bilangan biner kedua yg ingin anda kurangkan : ");
                while (d1 >= e1) {
                    System.out.print(ab[c1]);
                    c1++;
                    e1++;
                }e1 =1;
                System.out.println("(2)");
                while (d1 >= e1) {
                    if (ab[c1-1] ==1) {
                       b1 += f1;
                    }else{b1+=0;}
                    e1++;
                    c1--;
                    f1 *= 2;
                }
                System.out.println("Desimal = "+b1);
                System.out.println("-------------------------------------------------------------");
                int m = b - b1;
                int de[]=new int[20],c2= 0;
                int[] bc = new int[20];
                de[0] = m % 2;
                bc[0]= m/2;
                while (true) {
                    if (bc[c2] == 0) {
                        break;
                    }else {
                        de[c2+1] = bc[c2] % 2;
                        bc[c2+1]= bc[c2]/2;
                        c2++; }
                }
                e =1;
                c=0;
                while (d >= e) {
                    System.out.print(a[c]);
                    c++;
                    e++;
                }
                System.out.print(" - ");
                e1 =1;
                c1=0;
                while (d1 >= e1) {
                    System.out.print(ab[c1]);
                    c1++;
                    e1++;
                }
                System.out.print(" = ");
                while (true) {
                    if (c2== -1) {
                        break;
                    }else {
                        System.out.print(de[c2]); }
                    c2--;
                }
                System.out.println("(2)");
                System.out.println(b +" - " + b1 +" = " + m+ "(10)");
                
            }else if (layanan ==3) {
                System.out.println(" ____________________________________ ");
                System.out.println("| Perkalian 2 deret bilangan biner   |");
                System.out.println("|____________________________________|");
                System.out.println("DERET PERTAMA");
                System.out.println("-------------");
                int a[]=new int[20],c =0,d,e=1,b=0,f=1;
                System.out.print("Berapa jumlah angka dari deret bilangan biner pertama yg ingin anda kalikan : ");
                d = sc.nextInt();
                while (d >= e) {
                    System.out.print("  Masukkan angka ke-" + e + " dari deret bilangan biner pertama yg ingin anda kalikan : ");
                    a[c] = sc.nextInt();
                    c++;
                    e++;
                }e =1;
                c=0;
                System.out.print("Deret bilangan biner pertama yg ingin anda kalikan : ");
                while (d >= e) {
                    System.out.print(a[c]);
                    c++;
                    e++;
                }e =1;
                System.out.println("(2)");
                while (d >= e) {
                    if (a[c-1] ==1) {
                       b += f;
                    }else{b+=0;}
                    e++;
                    c--;
                    f *= 2;
                }
                System.out.println("Desimal = "+b);
                System.out.println("-------------------------------------------------------------");
                int ab[]=new int[20],c1 =0,d1,e1=1,b1=0,f1=1;
                System.out.println("DERET KEDUA");
                System.out.println("-----------");
                System.out.print("Berapa jumlah angka dari deret bilangan biner kedua yg ingin anda kalikan : ");
                d1 = sc.nextInt();
                while (d1 >= e1) {
                    System.out.print("  Masukkan angka ke-" + e1 + " dari deret bilangan biner kedua yg ingin anda kalikan : ");
                    ab[c1] = sc.nextInt();
                    c1++;
                    e1++;
                }e1 =1;
                c1=0;
                System.out.print("Deret bilangan biner kedua yg ingin anda kalikan : ");
                while (d1 >= e1) {
                    System.out.print(ab[c1]);
                    c1++;
                    e1++;
                }e1 =1;
                System.out.println("(2)");
                while (d1 >= e1) {
                    if (ab[c1-1] ==1) {
                       b1 += f1;
                    }else{b1+=0;}
                    e1++;
                    c1--;
                    f1 *= 2;
                }
                System.out.println("Desimal = "+b1);
                System.out.println("-------------------------------------------------------------");
                int m = b * b1;
                int de[]=new int[20],c2= 0;
                int[] bc = new int[20];
                de[0] = m % 2;
                bc[0]= m/2;
                while (true) {
                    if (bc[c2] == 0) {
                        break;
                    }else {
                        de[c2+1] = bc[c2] % 2;
                        bc[c2+1]= bc[c2]/2;
                        c2++; }
                }
                e =1;
                c=0;
                while (d >= e) {
                    System.out.print(a[c]);
                    c++;
                    e++;
                }
                System.out.print(" x ");
                e1 =1;
                c1=0;
                while (d1 >= e1) {
                    System.out.print(ab[c1]);
                    c1++;
                    e1++;
                }
                System.out.print(" = ");
                while (true) {
                    if (c2== -1) {
                        break;
                    }else {
                        System.out.print(de[c2]); }
                    c2--;
                }
                System.out.println("(2)");
                System.out.println(b +" x " + b1 +" = " + m+ "(10)");
             
            }else if (layanan ==5) {
                System.out.println("Terimakasih telah menggunakan layanan NABIL");
                break;
            }else if (layanan ==4) {
                int d;
                System.out.println(" ______________________________________________");
                System.out.println("| Operasi AND,OR, dan XOR pada bilangan biner  |");
                System.out.println("|______________________________________________|");
                System.out.print("Berapa jumlah angka dari deret bilangan biner yg ingin anda oprasikan : ");
                d = sc.nextInt();
                System.out.println("DERET PERTAMA");
                System.out.println("-------------");
                int a[]=new int[20],c =0,e=1,b=0,f=1;
                while (d >= e) {
                    System.out.print("  Masukkan angka ke-" + e + " dari deret bilangan biner pertama yg ingin anda oprasikan : ");
                    a[c] = sc.nextInt();
                    c++;
                    e++;
                }e =1;
                c=0;
                System.out.print("Deret bilangan biner pertama yg ingin anda kalikan : ");
                while (d >= e) {
                    System.out.print(a[c]);
                    c++;
                    e++;
                }
                System.out.println("(2)");
                System.out.println("-------------------------------------------------------------");
                int ab[]=new int[20],c1 =0,d1,e1=1,b1=0,f1=1;
                System.out.println("DERET KEDUA");
                System.out.println("-----------");
                d1=d;
                while (d1 >= e1) {
                    System.out.print("  Masukkan angka ke-" + e + " dari deret bilangan biner kedua yg ingin anda oprasikan : ");
                    ab[c1] = sc.nextInt();
                    c1++;
                    e1++;
                }e1 =1;
                c1=0;
                System.out.print("Deret bilangan biner kedua yg ingin anda kalikan : ");
                while (d1 >= e1) {
                    System.out.print(ab[c1]);
                    c1++;
                    e1++;
                }
                System.out.println("(2)");
                System.out.println("-------------------------------------------------------------");
                System.out.println();
                System.out.println("_____________");
                System.out.println("|  AND (&&)  |");
                System.out.println("|____________|");
                System.out.print(" ");
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
                    System.out.print(ab[c1]);
                    c1++;
                    e1++;
                }System.out.println("(2)");
                e1=0;
                System.out.print(" ");
                while (d1 > e1) {
                    System.out.print("-");
                    e1++;
                }System.out.println("---");
                int z[]=new int[d];
                c=0;
                for(int i=0;i<d;i++){
                    if (a[i] == 0 || ab[i]==0) {
                        z[i]=0;
                    }else{ z[i]=1; }
                }System.out.print(" ");
                c=0;
                e =0;
                while (d > e) {
                    System.out.print(z[c]);
                    c++;
                    e++;
                }System.out.println("(2)");
                System.out.println();
                System.out.println("-------------------------------------------------------------");
                System.out.println();
                System.out.println("______________");
                System.out.println("|   OR (||)   |");
                System.out.println("|_____________|");
                System.out.print(" ");
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
                    System.out.print(ab[c1]);
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
                    if (a[i] == 1 || ab[i]==1) {
                        z1[i]=1;
                    }else{ z1[i]=0; }
                }System.out.print(" ");
                c=0;
                e =0;
                while (d > e) {
                    System.out.print(z1[c]);
                    c++;
                    e++;
                }System.out.println("(2)");
                System.out.println();
                System.out.println("-------------------------------------------------------------");
                System.out.println();
                System.out.println("_______________");
                System.out.println("|   XOR (!=)   |");
                System.out.println("|______________|");
                System.out.print(" ");
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
                    System.out.print(ab[c1]);
                    c1++;
                    e1++;
                }System.out.println("(2)");
                e1=0;
                System.out.print(" ");
                while (d1 > e1) {
                    System.out.print("-");
                    e1++;
                }System.out.println("---");
                int z2[]=new int[d];
                c=0;
                for(int i=0;i<d;i++){
                    if (a[i] == ab[i]) {
                        z2[i]=0;
                    }else{ z2[i]=1; }
                }System.out.print(" ");
                c=0;
                e =0;
                while (d > e) {
                    System.out.print(z2[c]);
                    c++;
                    e++;
                }System.out.println("(2)");
                System.out.println();
                System.out.println("-------------------------------------------------------------");
                System.out.println();
            }else { System.out.println("Angka yg dari layanan yg anda masukkan invalid, mohon masukkan ulang dengan benar"); }
        }
  
    } 
}