    import java.util.Scanner;

    public class OperasiEnkripsi {
        
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

                System.out.print("Masukkan pesan dasar : ");
                String pesanDasar = sc.next();

                String kunci = "10101010";
                String operasiXOR = "";
                StringBuilder hasilBiner = new StringBuilder();

                int angka1, angka2;

            if (pesanDasar.length() == kunci.length()) {
                for(int i = 0; i < pesanDasar.length();i++) {
                    angka1 = Character.getNumericValue(pesanDasar.charAt(i));
                    angka2 = Character.getNumericValue(kunci.charAt(i));
                    int hasilXOR = angka1 ^ angka2;
                    operasiXOR += hasilXOR;
                    hasilBiner.append(hasilXOR);
                }
                        
                System.out.println("\nHasil Enkripsi (Biner) " + operasiXOR);
                String hasilEnkripsiBiner = hasilBiner.toString();
                
            // Konversi hasil biner ke heksadesimal
            int hasilDesimal = binaryToDecimal(hasilEnkripsiBiner);
            String hasilHex = decimalToHexadecimal(hasilDesimal);

            System.out.println("Hasil Enkripsi (Heksadesimal): " + hasilHex);
                
            }  else {
                System.out.println("Panjang pesan dasar harus sama dengan panjang kunci (8 bit).");
            }
        }

        private static int binaryToDecimal(String biner) {
            int desimal = 0;
            int pangkat = biner.length()-1;
            for (int i = 0; i < biner.length(); i++) {
            int digit = biner.charAt(i) - '0';
            desimal+= digit * Math.pow(2, pangkat);
                pangkat--;
            }
            return desimal;
        }

        private static String decimalToHexadecimal(int desimal) {
            StringBuilder heksadesimal = new StringBuilder();
            String hexChars = "0123456789ABCDEF";
            while (desimal > 0) {
                heksadesimal.append(hexChars.charAt(desimal % 16));
                desimal /= 16;
            }
            return heksadesimal.reverse().toString();
        }  
    }
