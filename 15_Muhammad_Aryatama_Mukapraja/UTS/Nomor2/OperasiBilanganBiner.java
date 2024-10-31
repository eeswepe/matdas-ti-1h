import java.util.*;
public class OperasiBilanganBiner {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String binary1, binary2;
        byte choice, logic;
        int l1, l2, digit1I, digit2I, sum1 = 0, sum2 = 0, hasilDec, j = 1, digit;
        char operator, digit1C, digit2C;
        int[] decimalTemp = new int[32];

        System.out.print("Masukkan bilangan biner pertama: ");
        binary1 = input.nextLine();
        System.out.print("Masukkan bilangan biner kedua: ");
        binary2 = input.nextLine();
        System.out.print("Ingin melakukan operasi aritmatika atau logika? (1. aritmatika, 2. logika): ");
        choice = input.nextByte();
       
        if (choice == 1) {                                  // OPERASI MATEMATIKA
            l1 = binary1.length();                          // konversi binary 1 ke desimal 1
            for (int i = 0; i < binary1.length(); i++) {
                digit1C = binary1.charAt(i);
                digit1I = digit1C - '0';
                sum1 += (digit1I * Math.pow(2, --l1));
            }
    
            l2 = binary2.length();                          // konversi binary 2 ke desimal 2
            for (int i = 0; i < binary2.length(); i++) {
                digit2C = binary2.charAt(i);
                digit2I = digit2C - '0';
                sum2 += (digit2I * Math.pow(2, --l2));
            }

            System.out.print("Masukkan operator ('+' atau '-' atau '*'): ");
            operator = input.next().charAt(0);
            switch (operator) {
                case '+':
                    hasilDec = sum1 + sum2;
                    System.out.println("Hasilnya dalam desimal adalah: " + hasilDec);
                    for (int i = 0; i < j; i++) {
                        digit = hasilDec % 2;
                        hasilDec /= 2;
                        decimalTemp[i] = digit;
                        if ((hasilDec == 1 || hasilDec == 0) && (digit == 1 || digit == 0)) {
                            decimalTemp[i+1] = 1;
                            j++;
                            break;
                        }
                        j++;
                    }
                    int[] decimalNewP = new int[j];
                    System.arraycopy(decimalTemp, 0, decimalNewP, 0, j);
                    
                    System.out.print("Hasilnya dalam biner adalah: ");
                    for (int i = decimalNewP.length - 1; i >= 0; i--) {
                        System.out.print(decimalNewP[i]);
                    }
                    break;
                case '-':
                    hasilDec = sum1 - sum2;
                    System.out.println("Hasilnya dalam desimal adalah: " + hasilDec);
                    for (int i = 0; i < j; i++) {
                        digit = hasilDec % 2;
                        hasilDec /= 2;
                        decimalTemp[i] = digit;
                        if ((hasilDec == 1 || hasilDec == 0) && (digit == 1 || digit == 0)) {
                            decimalTemp[i+1] = 1;
                            j++;
                            break;
                        }
                        j++;
                    }
                    int[] decimalNewM = new int[j];
                    System.arraycopy(decimalTemp, 0, decimalNewM, 0, j);
                    
                    System.out.print("Hasilnya dalam biner adalah: ");
                    for (int i = decimalNewM.length - 1; i >= 0; i--) {
                        System.out.print(decimalNewM[i]);
                    }
                    break;
                case '*':
                    hasilDec = sum1 * sum2;
                    System.out.println("Hasilnya dalam desimal adalah: " + hasilDec);
                    for (int i = 0; i < j; i++) {
                        digit = hasilDec % 2;
                        hasilDec /= 2;
                        decimalTemp[i] = digit;
                        if ((hasilDec == 1 || hasilDec == 0) && (digit == 1 || digit == 0)) {
                            decimalTemp[i+1] = 1;
                            j++;
                            break;
                        }
                        j++;
                    }
                    int[] decimalNewT = new int[j];
                    System.arraycopy(decimalTemp, 0, decimalNewT, 0, j);
                    
                    System.out.print("Hasilnya dalam biner adalah: ");
                    for (int i = decimalNewT.length - 1; i >= 0; i--) {
                        System.out.print(decimalNewT[i]);
                    }
                    break;
                default:
                    System.out.println("Input salah");
                    break;
                }
        } else if (choice == 2) {                                                // OPERASI LOGIKA
            System.out.print("Masukkan operator logika (1. AND, 2. OR, 3. XOR): ");
            logic = input.nextByte();
            int x = 0;          
            switch (logic) {
                case 1:                                                         // AND
                    if (binary1.length() > binary2.length()) {
                        int gap1 = binary1.length() - binary2.length();
                        for (int i = gap1; i < binary1.length(); i++) {
                            digit1C = binary1.charAt(i);
                            digit1I = digit1C - '0';
                            digit2C = binary2.charAt(x);
                            digit2I = digit2C - '0';
                            x++;
                            System.out.print(digit1I & digit2I);
                        }
                    } else if (binary1.length() < binary2.length()) {
                        int gap2 = binary2.length() - binary1.length();
                        for (int i = gap2; i < binary2.length(); i++) {
                            digit1C = binary1.charAt(x);
                            digit1I = digit1C - '0';
                            digit2C = binary2.charAt(i);
                            digit2I = digit2C - '0';
                            x++;
                            System.out.print(digit1I & digit2I);
                        }
                    } else {
                        for (int i = 0; i < binary2.length(); i++) {
                            digit1C = binary1.charAt(i);
                            digit1I = digit1C - '0';
                            digit2C = binary2.charAt(i);
                            digit2I = digit2C - '0';
                            System.out.print(digit1I & digit2I);
                        }
                    }               
                    break;
                case 2:                                                     // OR
                    if (binary1.length() > binary2.length()) {
                        int gap1 = binary1.length() - binary2.length();
                        for (int i = 0; i < gap1; i++) {
                            System.out.print(binary1.charAt(i));
                        }
                        for (int i = gap1; i < binary1.length(); i++) {
                            digit1C = binary1.charAt(i);
                            digit1I = digit1C - '0';
                            digit2C = binary2.charAt(x);
                            digit2I = digit2C - '0';
                            x++;
                            System.out.print(digit1I | digit2I);
                        }
                    } else if (binary1.length() < binary2.length()) {
                        int gap2 = binary2.length() - binary1.length();
                        for (int i = 0; i < gap2; i++) {
                            System.out.print(binary2.charAt(i));
                        }
                        for (int i = gap2; i < binary2.length(); i++) {
                            digit1C = binary1.charAt(x);
                            digit1I = digit1C - '0';
                            digit2C = binary2.charAt(i);
                            digit2I = digit2C - '0';
                            x++;
                            System.out.print(digit1I | digit2I);
                        }
                    } else {
                        for (int i = 0; i < binary2.length(); i++) {
                            digit1C = binary1.charAt(i);
                            digit1I = digit1C - '0';
                            digit2C = binary2.charAt(i);
                            digit2I = digit2C - '0';
                            System.out.print(digit1I | digit2I);
                        }
                    }
                    break;
                case 3:                                                      // XOR
                    if (binary1.length() > binary2.length()) {
                        int gap1 = binary1.length() - binary2.length();
                        for (int i = 0; i < gap1; i++) {
                            System.out.print(binary1.charAt(i));
                    }
                        for (int i = gap1; i < binary1.length(); i++) {
                            digit1C = binary1.charAt(i);
                            digit1I = digit1C - '0';
                            digit2C = binary2.charAt(x);
                            digit2I = digit2C - '0';
                            x++;
                            System.out.print(digit1I ^ digit2I);
                        }
                    } else if (binary1.length() < binary2.length()) {
                        int gap2 = binary2.length() - binary1.length();
                        for (int i = 0; i < gap2; i++) {
                            System.out.print(binary2.charAt(i));
                        }
                        for (int i = gap2; i < binary2.length(); i++) {
                            digit1C = binary1.charAt(x);
                            digit1I = digit1C - '0';
                            digit2C = binary2.charAt(i);
                            digit2I = digit2C - '0';
                            x++;
                            System.out.print(digit1I ^ digit2I);
                        }
                    } else {
                        for (int i = 0; i < binary2.length(); i++) {
                            digit1C = binary1.charAt(i);
                            digit1I = digit1C - '0';
                            digit2C = binary2.charAt(i);
                            digit2I = digit2C - '0';
                            System.out.print(digit1I ^ digit2I);
                        }
                    }
                    break;
                default:
                System.out.println("Input salah");
                    break;
                }
        } else {
            System.out.println("Input salah");
        }      
    }
}