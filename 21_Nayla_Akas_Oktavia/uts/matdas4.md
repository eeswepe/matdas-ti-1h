# Operasi enkripsi
### Penjelasan Fungsi

1. **`main(String[] args)`**
   - Fungsi utama yang menangani interaksi dengan pengguna. Program meminta pengguna untuk memasukkan dua angka biner untuk dijumlahkan, dikurangkan, dikalikan, dan melakukan operasi logika (AND, OR, XOR). Hasil dari setiap operasi ditampilkan.
   ```java
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("\n=== SOAL 2.1 ===");
       ...
       System.out.println("Hasil: " + tambahBiner(angkaBiner1, angkaBiner2));
       ...
   }
   ```

2. **`desimalKeBiner(int decimal)`**
   - Mengonversi angka desimal menjadi string biner. Proses dilakukan dengan membagi angka desimal dengan 2 dan menyimpan sisa pembagian dalam bentuk string.
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

3. **`tambahBiner(String a, String b)`**
   - Menjumlahkan dua angka biner. Fungsi ini menggunakan logika penjumlahan biner, memperhitungkan carry (nilai yang dibawa) jika jumlah lebih dari 1.
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

4. **`kurangBiner(String a, String b)`**
   - Mengurangkan dua angka biner. Menggunakan logika pengurangan biner, termasuk pengaturan borrow (pinjaman) saat digit pertama kurang dari digit kedua.
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

5. **`kaliBiner(String a, String b)`**
   - Mengalikan dua angka biner. Fungsi ini mengonversi string biner ke integer, melakukan perkalian, dan mengonversi hasilnya kembali ke biner.
   ```java
   public static String kaliBiner(String a, String b) {
       int num1 = stringKeInteger(a);
       int num2 = stringKeInteger(b);
       int product = num1 * num2;
       return desimalKeBiner(product);
   }
   ```

6. **`stringKeInteger(String str)`**
   - Mengonversi string yang merepresentasikan angka biner ke dalam integer. Fungsi ini membaca setiap karakter dari string dan menghitung nilai desimalnya.
   ```java
   public static int stringKeInteger(String str){
       int result = 0;
       for (int i = 0; i < str.length(); i++) {
           char c = str.charAt(i);
           
           if (c >= '0' && c <= '1') {
               int digit = c - '0';
               result = result * 2 + digit;
           } else {
               return result;
           }
       }
       return result;
   }
   ```

7. **`operasiAND(String a, String b)`**
   - Melakukan operasi logika AND pada dua angka biner. Hasilnya adalah string biner yang dihasilkan dari AND antara masing-masing digit.
   ```java
   public static String operasiAND(String a, String b) {
       String result = "";
       for (int i = 0; i < a.length(); i++) {
           result = result + ((a.charAt(i) == '1' && b.charAt(i) == '1') ? '1' : '0');
       }
       return result;
   }
   ```

8. **`operasiOR(String a, String b)`**
   - Melakukan operasi logika OR pada dua angka biner. Hasilnya adalah string biner yang dihasilkan dari OR antara masing-masing digit.
   ```java
   public static String operasiOR(String a, String b) {
       String result = "";
       for (int i = 0; i < a.length(); i++) {
           result = result + ((a.charAt(i) == '1' || b.charAt(i) == '1') ? '1' : '0');
       }
       return result;
   }
   ```

9. **`operasiXOR(String biner, String kunci)`**
   - Melakukan operasi logika XOR pada dua angka biner. Hasilnya adalah string biner yang dihasilkan dari XOR antara masing-masing digit.
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
Fungsi-fungsi ini bekerja sama untuk melakukan berbagai operasi pada angka biner, termasuk penjumlahan, pengurangan, perkalian, dan operasi logika. Program ini memungkinkan pengguna untuk memasukkan angka biner dan mendapatkan hasil dari operasi yang diinginkan.