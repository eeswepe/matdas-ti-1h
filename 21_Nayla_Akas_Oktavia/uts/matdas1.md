# Konversi Bilangan
### Penjelasan Fungsi

1. **`konversiKeBiner(int decimal)`**
   - Fungsi ini mengonversi angka desimal ke dalam format biner. Proses konversi dilakukan dengan membagi angka desimal dengan 2 dan menyimpan sisa pembagian (0 atau 1) untuk membentuk string biner.
   ```java
   public static String konversiKeBiner(int decimal) {
       String binary = "";
       int temp = decimal;
       
       while (temp > 0) {
           binary = (temp % 2) + binary;
           temp = temp / 2;
       }
       return binary;
   }
   ```

2. **`konversiKeHeksa(int decimal)`**
   - Fungsi ini mengonversi angka desimal ke dalam format heksadesimal. Angka desimal dibagi dengan 16 dan sisa pembagian (remainder) digunakan untuk menentukan karakter heksadesimal yang sesuai.
   ```java
   public static String konversiKeHeksa(int decimal) {
       String hex = "";
       int temp = decimal;
       char hexChars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
       
       while (temp > 0) {
           int remainder = temp % 16;
           hex = hexChars[remainder] + hex;
           temp = temp / 16;
       }
       return hex;
   }
   ```

3. **`binerKeDesimal(String binary)`**
   - Fungsi ini mengonversi angka biner (dalam bentuk string) menjadi angka desimal. Fungsi ini menggunakan kekuatan 2 berdasarkan posisi digit biner.
   ```java
   public static int binerKeDesimal(String binary) {
       int decimal = 0;
       int power = 0;
       
       for(int i = binary.length()-1; i >= 0; i--) {
           if(binary.charAt(i) == '1') {
               decimal += Math.pow(2, power);
           }
           power++;
       }
       return decimal;
   }
   ```

4. **`desimalKeHeksa(int decimal)`**
   - Fungsi ini juga mengonversi angka desimal ke heksadesimal, mirip dengan `konversiKeHeksa`, tetapi digunakan secara terpisah dalam program.
   ```java
   public static String desimalKeHeksa(int decimal) {
       String hex = "";
       int temp = decimal;
       char hexChars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
       
       while(temp > 0) {
           int remainder = temp % 16;
           hex = hexChars[remainder] + hex;
           temp = temp / 16;
       }
       return hex;
   }
   ```

5. **`heksaKeDesimal(String hex)`**
   - Fungsi ini mengonversi angka heksadesimal (dalam bentuk string) ke angka desimal. Ini dilakukan dengan menentukan nilai setiap karakter heksadesimal berdasarkan posisinya.
   ```java
   public static int heksaKeDesimal(String hex) {
       int decimal = 0;
       int power = 0;
       String hexChars = "0123456789ABCDEF";
       
       for(int i = hex.length()-1; i >= 0; i--) {
           char digit = hex.charAt(i);
           int value = hexChars.indexOf(digit);
           decimal += value * Math.pow(16, power);
           power++;
       }
       return decimal;
   }
   ```

6. **`desimalKeBiner(int decimal)`**
   - Fungsi ini mengonversi angka desimal ke dalam format biner, serupa dengan `konversiKeBiner`, dan digunakan untuk mengonversi hasil desimal kembali ke biner.
   ```java
   public static String desimalKeBiner(int decimal) {
       String binary = "";
       int temp = decimal;
       
       while(temp > 0) {
           binary = (temp % 2) + binary;
           temp = temp / 2;
       }
       return binary;
   }
   ```

### Ringkasan
Fungsi-fungsi di atas bekerja sama untuk melakukan konversi antara format angka desimal, biner, dan heksadesimal dalam aplikasi yang menerima input dari pengguna dan menampilkan hasil konversi.