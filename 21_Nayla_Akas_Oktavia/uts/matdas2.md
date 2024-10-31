# Operasi Bilangan Biner
### Penjelasan Fungsi

1. **`desimalKeBiner(int decimal)`**
   - Fungsi ini mengonversi angka desimal ke dalam format biner. Proses konversi dilakukan dengan membagi angka desimal dengan 2 dan menyimpan sisa pembagian (0 atau 1) untuk membentuk string biner.
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

2. **`tambahBiner(String a, String b)`**
   - Fungsi ini menjumlahkan dua angka biner (dalam bentuk string) dan mengembalikan hasilnya. Penjumlahan dilakukan dengan memeriksa setiap bit dari kanan ke kiri, memperhatikan carry (sisa) jika ada.
   ```java
   public static String tambahBiner(String a, String b) {
       String result = "";
       int carry = 0;
       int i = a.length() - 1;
       int j = b.length() - 1;
       
       while (i >= 0 || j >= 0 || carry > 0) {
           int sum = carry;
           if (i >= 0) sum += a.charAt(i--) - '0';
           if (j >= 0) sum += b.charAt(j--) - '0';
           result = (sum % 2) + result;
           carry = sum / 2;
       }
       return result;
   }    
   ```

3. **`kurangBiner(String a, String b)`**
   - Fungsi ini mengurangi angka biner `b` dari `a` dan mengembalikan hasilnya. Proses ini memperhitungkan pinjaman (borrow) jika digit dari `a` kurang dari digit dari `b`.
   ```java
   public static String kurangBiner(String a, String b) {
       String result = "";
       int borrow = 0;
       int i = a.length() - 1;
       int j = b.length() - 1;
       
       while (i >= 0) {
           int digitA = a.charAt(i) - '0';
           int digitB = j >= 0 ? b.charAt(j) - '0' : 0;
           
           digitA -= borrow;
           if (digitA < digitB) {
               digitA += 2;
               borrow = 1;
           } else {
               borrow = 0;
           }
           
           result = (digitA - digitB) + result;
           i--;
           j--;
       }
       return result;
   }    
   ```

4. **`kaliBiner(String a, String b)`**
   - Fungsi ini mengalikan dua angka biner dengan mengonversinya menjadi desimal terlebih dahulu, mengalikan hasilnya, dan mengembalikan hasil dalam format biner.
   ```java
   public static String kaliBiner(String a, String b) {
       int num1 = stringKeInteger(a);
       int num2 = stringKeInteger(b);
       int product = num1 * num2;
       return desimalKeBiner(product);
   }
   ```

5. **`stringKeInteger(String str)`**
   - Fungsi ini mengonversi string biner ke dalam integer. Fungsi ini membaca setiap karakter dari string dan membangun nilai integer berdasarkan digit yang dibaca.
   ```java
   public static int stringKeInteger(String str){
       int result = 0;
       for (int i = 0; i < str.length(); i++) {
           char c = str.charAt(i);
           
           if (c >= '0' && c <= '9') {
               int digit = c - '0';
               result = result * 10 + digit;
           } else {
               return result;
           }
       }
       return result;
   }
   ```

6. **`operasiAND(String a, String b)`**
   - Fungsi ini melakukan operasi logika AND pada dua angka biner dan mengembalikan hasilnya. Setiap bit hasil adalah 1 jika kedua bit input adalah 1.
   ```java
   public static String operasiAND(String a, String b) {
       String result = "";
       for (int i = 0; i < a.length(); i++) {
           result = result + ((a.charAt(i) == '1' && b.charAt(i) == '1') ? '1' : '0');
       }
       return result;
   }
   ```

7. **`operasiOR(String a, String b)`**
   - Fungsi ini melakukan operasi logika OR pada dua angka biner dan mengembalikan hasilnya. Setiap bit hasil adalah 1 jika salah satu dari bit input adalah 1.
   ```java
   public static String operasiOR(String a, String b) {
       String result = "";
       for (int i = 0; i < a.length(); i++) {
           result = result + ((a.charAt(i) == '1' || b.charAt(i) == '1') ? '1' : '0');
       }
       return result;
   }
   ```

8. **`operasiXOR(String biner, String kunci)`**
   - Fungsi ini melakukan operasi logika XOR pada dua angka biner. Setiap bit hasil adalah 1 jika bit input berbeda (satu 1 dan satu 0).
   ```java
   public static String operasiXOR(String biner, String kunci) {
       String hasil = "";
       for(int i = 0; i < biner.length(); i++) {
           if(biner.charAt(i) != kunci.charAt(i)) {
               hasil = hasil + "1";
           } else {
               hasil = hasil + "0";
           }
       }
       return hasil;
   }    
   ```

### Ringkasan
Fungsi-fungsi di atas bekerja sama untuk melakukan berbagai operasi aritmetika dan logika pada angka biner yang diinput oleh pengguna. Ini mencakup penjumlahan, pengurangan, perkalian, serta operasi logika AND, OR, dan XOR.