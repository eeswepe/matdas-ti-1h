import java.util.*;
public class KonversiBilangan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);  
        
        // variabel 1a, 1b, 2b
        int[] decimalTemp1A = new int[32];
        int bilangan1, bilangan2, digit, j = 1;
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        // variabel 2a, 2b
        char[] decimalTemp1B = new char[16];
        String bil2;
        char digit2C;
        int l, digit2I, sum2 = 0;

        //variabel 3a, 3b
        String bil3;
        char digit3C;
        int digit3I, sum3 = 0;
        
        System.out.print("Masukkan sistem bilangan awal (1. desimal, 2. biner, 3. heksadesimal): ");
        int sistemBil = input.nextInt();
        input.nextLine();

        switch (sistemBil) {
            case 1:
            // desimal ke biner (1a)
                System.out.print("Masukkan bilangan dalam desimal: ");
                int sementara = input.nextInt();
                bilangan1 = sementara;             

                for (int i = 0; i < j; i++) {
                    digit = bilangan1 % 2;
                    bilangan1 /= 2;
                    decimalTemp1A[i] = digit;
                    if ((bilangan1 == 1 || bilangan1 == 0) && (digit == 1 || digit == 0)) {
                        decimalTemp1A[i+1] = 1;
                        j++;
                        break;
                    }
                    j++;
                }
                int[] decimalNew1A = new int[j];
                System.arraycopy(decimalTemp1A, 0, decimalNew1A, 0, j);
                
                System.out.print("Binernya adalah: ");
                for (int i = decimalNew1A.length - 1; i != -1; i--) {
                    System.out.print(decimalNew1A[i]);
                }
                System.out.println();
                
            // desimal ke heksadesimal (1b)
                bilangan2 = sementara;
                j = 1;

                for (int i = 0; i < j; i++) {
                    digit = bilangan2 % 16;
                    decimalTemp1B[i] = hexa[digit];
                    bilangan2 /= 16;
                    if (bilangan2 == 0) {
                        break;
                    }
                    j++;
                }

                char[] decimalNew1B = new char[j];
                System.arraycopy(decimalTemp1B, 0, decimalNew1B, 0, j);
                
                System.out.print("Heksadesimalnya adalah: ");
                for (int i = decimalNew1B.length - 1; i != -1; i--) {
                    System.out.print(decimalNew1B[i]);
                }

                break;
            case 2:
            // biner ke desimal (2a)
                System.out.print("Masukkan bilangan dalam biner: ");
                bil2 = input.nextLine();
                l = bil2.length();           
                
                for (int i = 0; i < bil2.length(); i++) {
                    digit2C = bil2.charAt(i);
                    digit2I = digit2C - '0';
                    sum2 += (digit2I * Math.pow(2, --l));
                }

                System.out.println("Desimalnya adalah: " + sum2);

            // biner ke heksadesimal (2b)
                j = 1;

                for (int i = 0; i < j; i++) {
                    digit = sum2 % 16;
                    decimalTemp1B[i] = hexa[digit];
                    sum2 /= 16;
                    if (sum2 == 0) {
                        break;
                    }
                    j++;
                }

                char[] decimalNew2B = new char[j];
                System.arraycopy(decimalTemp1B, 0, decimalNew2B, 0, j);
                
                System.out.print("Heksadesimalnya adalah: ");
                for (int i = decimalNew2B.length - 1; i != -1; i--) {
                    System.out.print(decimalNew2B[i]);
                }

                break;
            case 3:
            // heksadesimal ke desimal (3a)
                System.out.print("Masukkan bilangan dalam heksadesimal: ");
                bil3 = input.nextLine();
                l = bil3.length();

                for (int i = 0; i < bil3.length(); i++) {
                    digit3C = bil3.charAt(i);
                    digit3I = digit3C - '0';                                      
                    switch (digit3C) {
                        case 'A':
                            digit3I = 10;
                            break;
                        case 'B':
                            digit3I = 11;
                            break;
                        case 'C':
                            digit3I = 12;
                            break;
                        case 'D':
                            digit3I = 13;
                            break;
                        case 'E':
                            digit3I = 14;
                            break;
                        case 'F':
                            digit3I = 15;
                            break;                       
                        }
                    sum3 += (digit3I * Math.pow(16, --l));
                }

                System.out.println("Desimalnya adalah: " + sum3);

            // heksadesimal ke biner (3b)
                j = 1;          

                for (int i = 0; i < j; i++) {
                    digit = sum3 % 2;
                    sum3 /= 2;
                    decimalTemp1A[i] = digit;
                    if ((sum3 == 1 || sum3 == 0) && (digit == 1 || digit == 0)) {
                        decimalTemp1A[i+1] = 1;
                        j++;
                        break;
                    }
                    j++;
                }
                int[] decimalNew3B = new int[j];
                System.arraycopy(decimalTemp1A, 0, decimalNew3B, 0, j);
                
                System.out.print("Binernya adalah: ");
                for (int i = decimalNew3B.length - 1; i != -1; i--) {
                    System.out.print(decimalNew3B[i]);
                }
                
                break;        
            default:
                System.out.println("Input salah");
                break;
        }
    }
}