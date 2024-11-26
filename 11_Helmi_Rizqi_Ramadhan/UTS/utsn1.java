import java.util.Scanner;
public class utsn1 {
      public static void main(String[] args) {
          Scanner emu = new Scanner(System.in);

          System.out.println("=========================================");
          System.out.println("= Konversi Bilangan dengan Program Java =");
          System.out.println("=========================================");
          System.out.println();
          System.out.println("Pilih jenis konversi:");
          System.out.println("1. Desimal ke Biner dan Heksadesimal");
          System.out.println("2. Biner ke Desimal dan Heksadesimal");
          System.out.println("3. Heksadesimal ke Desimal dan Biner");
          System.out.print("Masukkan pilihan Anda (1/2/3): ");
          int pilihan = emu.nextInt();
          emu.nextLine();
          System.out.println();
  
          switch (pilihan) {
              case 1:
                  System.out.print("Masukkan bilangan desimal: ");
                  int desimal = emu.nextInt();
  
                  // Desimal ke Biner
                  StringBuilder biner = new StringBuilder();
                  int sisaDesimal = desimal;
                  while (sisaDesimal > 0) {
                      biner.insert(0, sisaDesimal % 2);
                      sisaDesimal /= 2;
                  }
                  System.out.println("Desimal ke Biner: " + (biner.length() == 0 ? "0" : biner));
  
                  // Desimal ke Heksadesimal
                  StringBuilder heksa = new StringBuilder();
                  char[] heksChar = "0123456789ABCDEF".toCharArray();
                  sisaDesimal = desimal;
                  while (sisaDesimal > 0) {
                      heksa.insert(0, heksChar[sisaDesimal % 16]);
                      sisaDesimal /= 16;
                  }
                  System.out.println("Desimal ke Heksadesimal: " + (heksa.length() == 0 ? "0" : heksa));
                  break;
  
              case 2:
                  System.out.print("Masukkan bilangan biner: ");
                  String binerInput = emu.nextLine();
  
                  // Biner ke Desimal
                  int desimalDariBiner = 0;
                  for (int i = 0; i < binerInput.length(); i++) {
                      desimalDariBiner = desimalDariBiner * 2 + (binerInput.charAt(i) - '0');
                  }
                  System.out.println("Biner ke Desimal: " + desimalDariBiner);
  
                  // Desimal ke Heksadesimal dari hasil biner
                  heksa = new StringBuilder();
                  sisaDesimal = desimalDariBiner;
                  char[] heksaChar = "0123456789ABCDEF".toCharArray();
                  while (sisaDesimal > 0) {
                      heksa.insert(0, heksaChar[sisaDesimal % 16]);
                      sisaDesimal /= 16;
                  }
                  System.out.println("Biner ke Heksadesimal: " + (heksa.length() == 0 ? "0" : heksa));
                  break;
  
              case 3:
                  System.out.print("Masukkan bilangan heksadesimal: ");
                  String heksaInput = emu.nextLine();
  
                  // Heksadesimal ke Desimal
                  int desimalDariHeksa = 0;
                  for (int i = 0; i < heksaInput.length(); i++) {
                      char c = heksaInput.charAt(i);
                      int nilai = (c >= '0' && c <= '9') ? c - '0' : c - 'A' + 10;
                      desimalDariHeksa = desimalDariHeksa * 16 + nilai;
                  }
                  System.out.println("Heksadesimal ke Desimal: " + desimalDariHeksa);
  
                  // Desimal ke Biner dari hasil heksadesimal
                  biner = new StringBuilder();
                  sisaDesimal = desimalDariHeksa;
                  while (sisaDesimal > 0) {
                      biner.insert(0, sisaDesimal % 2);
                      sisaDesimal /= 2;
                  }
                  System.out.println("Heksadesimal ke Biner: " + (biner.length() == 0 ? "0" : biner));
                  break;
  
              default:
                  System.out.println("Pilihan tidak valid.");
                  break;
          }
          System.out.println();
          System.out.println("=========================================");
          System.out.println("=       Konversi Bilangan Selesai       =");
          System.out.println("=========================================");
          emu.close();
      }
  }
  