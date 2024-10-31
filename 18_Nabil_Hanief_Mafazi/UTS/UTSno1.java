    import java.util.Scanner;
    public class UTSno1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int layanan;

            while (true) {
                System.out.println();
                System.out.println(" ______________________________________");
                System.out.println("| Menu layanan  :                      |");
                System.out.println("|  1.Desimal --> Biner & Heksadesimal  |");
                System.out.println("|  2.Biner --> Desimal & Heksadesimal  |");
                System.out.println("|  3.Heksadedimal --> Biner & Desimal  |");
                System.out.println("|  4.Keluar                            |");
                System.out.println("|______________________________________|");
                System.out.print("Masukkan angka dari layanan yg ingin anda gunakan : ");
                layanan = sc.nextInt();
                if (layanan == 1) {
                    int a,d[]=new int[20],c= 0;
                    System.out.println(" __________________________________ ");
                    System.out.println("| Desimal --> Biner & Heksadesimal |");
                    System.out.println("|__________________________________|");
                    System.out.print("Masukkan angka yg ingin dikonversikan : ");
                    a = sc.nextInt();
                    int[] b = new int[20];
                    
                    d[c] = a % 2;
                    b[0]= a/2;
                    while (true) {
                        if (b[c] == 0) {
                            break;
                        }else {
                            d[c+1] = b[c] % 2;
                            b[c+1]= b[c]/2;
                            c++; }
                    }
                    while (true) {
                        if (c== -1) {
                            break;
                        }else {
                            System.out.print(d[c]); }
                        c--;
                    }
                    System.out.println("(2)");
                    System.out.print(" Heksadesimal = ");
                    int g[]=new int[20],f= 0;
                    int[] e = new int[20];
                    g[0] = a % 16;
                    e[0]= a/16;
                    while (true) {
                        if (e[f] == 0) {
                            break;
                        }else {
                            g[f+1] = e[f] % 16;
                            e[f+1]= e[f]/16;
                            f++; }
                        }
                    while (true) {
                        if (f== -1) {
                            break;
                        }else {
                            if (g[f] == 10) {
                                System.out.print("A");
                            }else if (g[f] == 11) {
                                System.out.print("B");
                            }else if (g[f] == 12) {
                                System.out.print("C");
                            }else if (g[f] == 13) {
                                System.out.print("D");
                            }else if (g[f] == 14) {
                                System.out.print("E");
                            }else if (g[f] == 15) {
                                System.out.print("F");
                            }else {
                                System.out.print(g[f]); }
                            }
                        f--;
                    }
                    System.out.println("(16)");
                }else if (layanan ==2) {
                    System.out.println(" __________________________________ ");
                    System.out.println("| Biner --> Desimal & Heksadesimal |");
                    System.out.println("|__________________________________|");
                    int a[]=new int[20],c =0,d,e=1,k=0,f=1;
                    System.out.print("Berapa jumlah angka dari susunan bilangan biner yg ingin anda konversikan : ");
                    d = sc.nextInt();
                    while (d >= e) {
                        System.out.print("Masukkan angka ke-" + e + " dari deratan bilangan biner yg ingin anda konversikan : ");
                        a[c] = sc.nextInt();
                        c++;
                        e++;
                    }e =1;
                    c=0;
                    System.out.print("Deratan bilangan biner yg ingin anda konversikan : ");
                    while (d >= e) {
                        System.out.print(a[c]);
                        c++;
                        e++;
                    }e =1;
                    System.out.println("(2)");
                    while (d >= e) {
                        if (a[c-1] ==1) {
                        k += f;
                        }else{k+=0;}
                        e++;
                        c--;
                        f *= 2;
                    }
                    System.out.println(" Desimal = " + k+"(10)");
                    int j[]=new int[9];
                    int h=0,i=d-1;
                    System.out.print(" Heksadesimal = ");
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
                            if (a[i] ==1) {
                                j[h] += f;
                            }
                            e++;
                            i--;
                            f *= 2; }
                    }
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
                }else if (layanan ==3) {
                    System.out.println(" __________________________________ ");
                    System.out.println("| Heksadesimal --> Biner & Desimal |");
                    System.out.println("|__________________________________|");
                    int c =0,d,e=1,k=0,f=1,b=0;
                    String a[]= new String[5];
                    System.out.print("Berapa jumlah angka dari susunan bilangan heksadesimal yg ingin anda konversikan : ");
                    d = sc.nextInt();
                    sc.nextLine();
                    while (d >= e) {
                        System.out.print("Masukkan bilangan ke-" + e + " dari deratan bilangan heksadesimal yg ingin anda konversikan : ");
                        a[c] = sc.nextLine();
                        c++;
                        e++;
                    }
                    e =1;
                    c=0;
                    System.out.print("Deratan bilangan heksadesimal yg ingin anda konversikan : ");
                    while (d >= e) {
                        System.out.print(a[c]);
                        c++;
                        e++;
                    }
                    System.out.println("(16)");
                    System.out.print(" Biner = ");
                    c =0;
                    e=1;
                    while (d >= e) {
                        if (a[c].equalsIgnoreCase("1")) {
                            System.out.print("0001");
                        }else if (a[c].equalsIgnoreCase("2")) {
                            System.out.print("0010");
                        }else if (a[c].equalsIgnoreCase("3")) {
                            System.out.print("0011");
                        }else if (a[c].equalsIgnoreCase("4")) {
                            System.out.print("0100");
                        }else if (a[c].equalsIgnoreCase("5")) {
                            System.out.print("0101");
                        }else if (a[c].equalsIgnoreCase("6")) {
                            System.out.print("0110");
                        }else if (a[c].equalsIgnoreCase("7")) {
                            System.out.print("0111");
                        }else if (a[c].equalsIgnoreCase("8")) {
                            System.out.print("1000");
                        }else if (a[c].equalsIgnoreCase("9")) {
                            System.out.print("1001");
                        }else if (a[c].equalsIgnoreCase("a")) {
                            System.out.print("1010");
                        }else if (a[c].equalsIgnoreCase("b")) {
                            System.out.print("1011");
                        }else if (a[c].equalsIgnoreCase("c")) {
                            System.out.print("1100");
                        }else if (a[c].equalsIgnoreCase("d")) {
                            System.out.print("1101");
                        }else if (a[c].equalsIgnoreCase("e")) {
                            System.out.print("1110");
                        }else if (a[c].equalsIgnoreCase("f")) {
                            System.out.print("1111");
                        }
                        c++;
                        e++;
                    }
                    System.out.println("(2)");
                    e=1;
                    c-=1;
                    while (d >= e) {
                        if (a[c].equalsIgnoreCase("1")) {
                        k = 1;
                        }else if (a[c].equalsIgnoreCase("2")) {
                            k = 2;
                        }else if (a[c].equalsIgnoreCase("3")) {
                            k = 3;
                        }else if (a[c].equalsIgnoreCase("4")) {
                            k = 4;
                        }else if (a[c].equalsIgnoreCase("5")) {
                            k = 5;
                        }else if (a[c].equalsIgnoreCase("6")) {
                            k = 6;
                        }else if (a[c].equalsIgnoreCase("7")) {
                            k = 7;
                        }else if (a[c].equalsIgnoreCase("8")) {
                            k = 8;
                        }else if (a[c].equalsIgnoreCase("9")) {
                            k = 9;
                        }else if (a[c].equalsIgnoreCase("a")) {
                            k = 10;
                        }else if (a[c].equalsIgnoreCase("b")) {
                            k = 11;
                        }else if (a[c].equalsIgnoreCase("c")) {
                            k = 12;
                        }else if (a[c].equalsIgnoreCase("d")) {
                            k = 13;
                        }else if (a[c].equalsIgnoreCase("e")) {
                            k = 14;
                        }else if (a[c].equalsIgnoreCase("f")) {
                            k = 15;
                        }
                        b += (k*f);
                        e++;
                        c--;
                        f *= 16;
                    }
                    System.out.println(" Desimal = " + b + "(10)");

                }else if (layanan ==4) {
                    System.out.println("Terimakasih telah menggunakan layanan NABIL");
                    break;
                }else { System.out.println("Angka yg dari layanan yg anda masukkan invalid, mohon masukkan ulang dengan benar"); }
            }
        } 
    }