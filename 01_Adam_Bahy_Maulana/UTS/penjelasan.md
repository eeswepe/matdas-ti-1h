## 1. Konversi Bilangan Desimal

### Alur Proses

1. **Input dari Pengguna:**

   - Program meminta pengguna untuk memilih jenis konversi (ke biner atau heksadesimal atau sebaliknya) dan memasukkan bilangan desimal atau biner atau heksadesimal yang ingin dikonversi.

2. **Proses Konversi:**

   - **Konversi ke Biner:**

     - Menggunakan metode `DesimalToBiner(int desimal)`, yang berulang kali membagi bilangan desimal dengan 2, menyimpan sisa hasil bagi sebagai digit biner.
     - **Contoh Kode:**
       ```java
       public static String DesimalToBiner(int desimal) {
           StringBuilder biner = new StringBuilder();
           while (desimal > 0) {
               biner.insert(0, desimal % 2);
               desimal /= 2;
           }
           return biner.toString();
       }
       ```
   - **Konversi ke Heksadesimal:**
     - Menggunakan metode `DesimalToHexadesimal(int desimal)` yang mirip, tetapi menggunakan basis 16.
     - **Contoh Kode:**
       ```java
       public static String DesimalToHexadesimal(int desimal) {
           StringBuilder hexadesimal = new StringBuilder();
           while (desimal > 0) {
               hexadesimal.insert(0, desimal % 16);
               desimal /= 16;
           }
           return hexadesimal.toString();
       }
       ```
3. **Output:**
   - Hasil konversi ditampilkan kepada pengguna.

---

## 2. Operasi Biner

### Alur Proses

1. **Input dari Pengguna:**

   - Program meminta pengguna untuk memasukkan dua bilangan biner dan memilih operasi biner (seperti penjumlahan atau pengurangan).

2. **Proses Operasi Biner:**

### 1. Penjumlahan Biner

- **Deskripsi:** Menjumlahkan dua bilangan biner dan menangani carry jika diperlukan.
- **Implementasi:**

  - Menggunakan fungsi `binaryAddition(String bin1, String bin2)`.
  - **Contoh Kode:**

    ```java
    public static String binaryAddition(String bin1, String bin2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int maxLength = Math.max(bin1.length(), bin2.length());

        for (int i = 0; i < maxLength; i++) {
            int bit1 = (i < bin1.length()) ? bin1.charAt(bin1.length() - 1 - i) - '0' : 0;
            int bit2 = (i < bin2.length()) ? bin2.charAt(bin2.length() - 1 - i) - '0' : 0;

            int sum = bit1 + bit2 + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            result.insert(0, carry);
        }
        return result.toString();
    }
    ```

- **Kegunaan:** Menggabungkan dua angka biner ke dalam satu hasil.

### 2. Pengurangan Biner

- **Deskripsi:** Mengurangi bilangan biner kedua dari bilangan biner pertama.
- **Contoh Kode:**
    ```java
    public static String binarySubtraction(String bin1, String bin2) {
            StringBuilder result = new StringBuilder();
            int borrow = 0;

            for (int i = 0; i < bin1.length(); i++) {
                int bit1 = bin1.charAt(bin1.length() - 1 - i) - '0';
                int bit2 = (i < bin2.length()) ? bin2.charAt(bin2.length() - 1 - i) - '0' : 0;

                int diff = bit1 - bit2 - borrow;

                if (diff < 0) {
                    diff += 2;
                    borrow = 1;
                } else {
                    borrow = 0;
                }
                result.insert(0, diff);
            }
            return result.toString();
        }
    ```
- **Kegunaan:** Digunakan dalam penghitungan yang melibatkan pengurangan nilai.

### 3. Perkalian Biner

- **Deskripsi:** Mengalikan dua bilangan biner.
- **Implementasi:** Menggunakan metode perkalian yang mirip dengan perkalian desimal.
- **Contoh Kode:**
  ```java
  public static String binaryMultiplication(String bin1, String bin2) {
      String result = "0"; // Hasil awal adalah 0
      for (int i = bin2.length() - 1; i >= 0; i--) {
          if (bin2.charAt(i) == '1') {
              String shiftedBin1 = bin1 + "0".repeat(bin2.length() - 1 - i);
              result = binaryAddition(result, shiftedBin1);
          }
      }
      return result;
  }
  ```
- **Kegunaan:** Berguna dalam penghitungan dan aplikasi yang memerlukan perkalian.

### 4. Operasi AND Biner

- **Deskripsi:** Menghasilkan 1 hanya jika kedua bit yang dibandingkan adalah 1.
- **Implementasi:**
  - Menggunakan loop untuk membandingkan setiap bit dari dua bilangan biner.
  - **Contoh Kode:**
  ```java
  public static String binaryAnd(String bin1, String bin2) {
      StringBuilder result = new StringBuilder();
      int maxLength = Math.max(bin1.length(), bin2.length());
      for (int i = 0; i < maxLength; i++) {
          int bit1 = (i < bin1.length()) ? bin1.charAt(bin1.length() - 1 - i) - '0' : 0;
          int bit2 = (i < bin2.length()) ? bin2.charAt(bin2.length() - 1 - i) - '0' : 0;
          result.insert(0, (bit1 & bit2));
      }
      return result.toString();
  }
  ```
- **Kegunaan:** Penting dalam operasi logika dan kontrol aliran data.

### 5. Operasi OR Biner

- **Deskripsi:** Menghasilkan 1 jika salah satu dari kedua bit yang dibandingkan adalah 1.
- **Implementasi:** Mirip dengan operasi AND, tetapi menggunakan operator OR.
- **Contoh Kode:**
  ```java
  public static String binaryOr(String bin1, String bin2) {
      StringBuilder result = new StringBuilder();
      int maxLength = Math.max(bin1.length(), bin2.length());
      for (int i = 0; i < maxLength; i++) {
          int bit1 = (i < bin1.length()) ? bin1.charAt(bin1.length() - 1 - i) - '0' : 0;
          int bit2 = (i < bin2.length()) ? bin2.charAt(bin2.length() - 1 - i) - '0' : 0;
          result.insert(0, (bit1 | bit2));
      }
      return result.toString();
  }
  ```
- **Kegunaan:** Digunakan dalam logika digital dan aplikasi yang memerlukan pemeriksaan beberapa kondisi.

### 6. Operasi XOR Biner

- **Deskripsi:** Menghasilkan 1 hanya jika satu dari kedua bit yang dibandingkan adalah 1 (berlawanan).
- **Implementasi:** Menggunakan metode yang sama dengan AND dan OR, tetapi dengan logika XOR.
- **Contoh Kode:**
  ```java
  public static String binaryXor(String bin1, String bin2) {
      StringBuilder result = new StringBuilder();
      int maxLength = Math.max(bin1.length(), bin2.length());
      for (int i = 0; i < maxLength; i++) {
          int bit1 = (i < bin1.length()) ? bin1.charAt(bin1.length() - 1 - i) - '0' : 0;
          int bit2 = (i < bin2.length()) ? bin2.charAt(bin2.length() - 1 - i) - '0' : 0;
          result.insert(0, (bit1 ^ bit2));
      }
      return result.toString();
  }
  ```
- **Kegunaan:** Berguna dalam enkripsi dan algoritma kriptografi karena sifatnya yang memisahkan bit.


---

## 3. Pembulatan dan Konversi Suhu

### Alur Proses

1. **Input dari Pengguna:**

   - Program meminta suhu, kelembapan, dan kadar CO₂ dari pengguna.

2. **Proses Pembulatan dan Konversi:**

   - **Pembulatan:**

     - Fungsi `manualCeil(double value)` dan `manualFloor(double value)` digunakan untuk membulatkan angka ke atas dan ke bawah.
     - **Contoh Kode:**
       ```java
       public static int manualCeil(double value) {
           int intValue = (int) value;
           if (value > intValue) {
               return intValue + 1;
           }
           return intValue;
       }
       ```
     - **Kegunaan:** Berguna dalam konteks pengolahan data, seperti suhu, kelembapan dan kadar CO2

   - **Konversi ke Biner dan Heksadesimal:**
     - Menggunakan `decimalToBinary(int decimal)` dan `decimalToHexadecimal(int decimal)` untuk mendapatkan representasi biner dan heksadesimal dari suhu yang dibulatkan.
     - **Contoh Kode:**
       ```java
       public static String decimalToBinary(int decimal) {
           StringBuilder binary = new StringBuilder();
           while (decimal > 0) {
               binary.insert
       (0, decimal % 2);
       decimal /= 2;
       }
       return binary.toString();
       }
 - **Kegunaan:** Menyediakan representasi alternatif untuk data yang lebih kompleks.

3. **Output:**
   - Menampilkan hasil pembulatan dan konversi suhu.

---

## 4. Enkripsi Sederhana dengan XOR

### Alur Proses

1. **Input dari Pengguna:**
   - Program meminta pengguna untuk memasukkan data dalam bentuk **biner** dan **kunci enkripsi** juga dalam bentuk biner.

2. **Proses Enkripsi:**
   - **Operasi XOR Manual**:
     - Menggunakan fungsi `binaryXor(String bin, String key)` untuk melakukan XOR secara manual antara data biner dan kunci. Jika panjang kunci lebih pendek dari data, kunci akan diulang.
     - **Contoh Kode:**
       ```java
       public static String binaryXor(String bin, String key) {
           StringBuilder result = new StringBuilder();
           for (int i = 0; i < bin.length(); i++) {
               char bit1 = bin.charAt(i);
               char bit2 = key.charAt(i % key.length()); // Jika kunci lebih pendek, ulangi
               result.append(xorBit(bit1, bit2));
           }
           return result.toString();
       }
       ```
     - **Fungsi XOR Bit**:
       - Operasi XOR dilakukan antar dua bit (`0` atau `1`). Hasilnya adalah `0` jika bit sama dan `1` jika berbeda.
       - **Contoh Kode:**
         ```java
         public static char xorBit(char bit1, char bit2) {
             return (bit1 == bit2) ? '0' : '1';
         }
         ```

   - **Konversi Hasil XOR ke Heksadesimal**:
     - Hasil XOR dalam bentuk biner dikonversi ke heksadesimal untuk memudahkan pembacaan, menggunakan fungsi `binaryToHexadecimal`.
     - **Contoh Kode:**
       ```java
       public static String binaryToHexadecimal(String binary) {
           StringBuilder hex = new StringBuilder();
           int length = binary.length();
           
           // Menambahkan nol di depan jika panjang biner bukan kelipatan 4
           while (length % 4 != 0) {
               binary = "0" + binary;
               length++;
           }

           // Mengonversi setiap 4 bit menjadi 1 digit heksadesimal
           for (int i = 0; i < binary.length(); i += 4) {
               String nibble = binary.substring(i, i + 4);
               hex.append(binaryNibbleToHex(nibble));
           }
           return hex.toString();
       }
       ```

     - **Konversi Nibble Biner ke Heksadesimal**:
       - Setiap empat bit biner (`nibble`) dikonversi ke satu karakter heksadesimal.
       - **Contoh Kode:**
         ```java
         public static char binaryNibbleToHex(String nibble) {
             int decimalValue = 0;
             int power = 0;

             for (int i = nibble.length() - 1; i >= 0; i--) {
                 int bit = nibble.charAt(i) - '0';
                 decimalValue += bit * Math.pow(2, power);
                 power++;
             }

             if (decimalValue < 10) {
                 return (char) (decimalValue + '0');
             } else {
                 return (char) (decimalValue - 10 + 'A');
             }
         }
         ```

3. **Output:**
   - **Data terenkripsi dalam format biner dan heksadesimal** ditampilkan kepada pengguna.

### Penjelasan Fungsi-Fungsi Kunci
- **binaryXor**: Melakukan XOR manual antara data biner dan kunci, mengulang kunci jika lebih pendek dari data.
- **binaryToHexadecimal**: Mengonversi hasil XOR dalam biner menjadi heksadesimal.
- **binaryNibbleToHex**: Mengonversi setiap 4 bit (nibble) menjadi satu digit heksadesimal.
