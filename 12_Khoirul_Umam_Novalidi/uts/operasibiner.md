Berikut adalah penjelasan dari setiap fungsi pada kode Java di atas, termasuk penjelasan baris kode utama dalam format markdown:

---

### Fungsi `tambahBiner`
Fungsi ini melakukan penjumlahan dua bilangan biner yang diberikan dalam bentuk `String`. Penjumlahan dilakukan dengan menghitung bit demi bit dari kanan ke kiri, dengan memperhatikan nilai `carry`.

```java
public static String tambahBiner(String a, String b) { ... }
```

- **Baris penting**: Menghitung penjumlahan bit per bit dan carry
  ```java
  int jumlah = bitA + bitB + carry;
  hasil.append(jumlah % 2);
  carry = jumlah / 2;
  ```

---

### Fungsi `kurangBiner`
Fungsi ini digunakan untuk mengurangi dua bilangan biner yang diinput dalam bentuk `String`. Pengurangan dilakukan dari bit paling kanan ke kiri, dengan mengurangi `borrow` jika diperlukan.

```java
public static String kurangBiner(String a, String b) { ... }
```

- **Baris penting**: Mengelola borrow jika nilai `bitA` kurang dari `bitB`
  ```java
  if (bitA < bitB) {
      bitA += 2;
      borrow = 1;
  }
  ```

---

### Fungsi `kaliBiner`
Fungsi ini mengalikan dua bilangan biner yang diberikan dalam bentuk `String`. Proses perkalian dilakukan menggunakan metode shift dan penjumlahan biner.

```java
public static String kaliBiner(String a, String b) { ... }
```

- **Baris penting**: Menggeser nilai `a` dan menambahkannya ke hasil jika bit `b` adalah `1`
  ```java
  hasil = tambahBiner(hasil, a + "0".repeat(b.length() - 1 - i));
  ```

---

### Fungsi `andBiner`
Fungsi ini melakukan operasi `AND` pada dua bilangan biner dalam bentuk `String`. Setiap bit dari kedua input dibandingkan, dan jika kedua bit bernilai `1`, hasilnya adalah `1`; jika tidak, hasilnya `0`.

```java
public static String andBiner(String a, String b) { ... }
```

- **Baris penting**: Melakukan operasi `AND` bit demi bit
  ```java
  hasil.append((bitA == '1' && bitB == '1') ? '1' : '0');
  ```

---

### Fungsi `orBiner`
Fungsi ini menjalankan operasi `OR` pada dua bilangan biner dalam bentuk `String`. Jika salah satu bit dari kedua bilangan bernilai `1`, hasilnya adalah `1`.

```java
public static String orBiner(String a, String b) { ... }
```

- **Baris penting**: Melakukan operasi `OR` bit demi bit
  ```java
  hasil.append((bitA == '1' || bitB == '1') ? '1' : '0');
  ```

---

### Fungsi `xorBiner`
Fungsi ini melakukan operasi `XOR` pada dua bilangan biner. Jika satu bit bernilai `1` dan lainnya `0`, hasilnya `1`; jika keduanya sama, hasilnya `0`.

```java
public static String xorBiner(String a, String b) { ... }
```

- **Baris penting**: Melakukan operasi `XOR` bit demi bit
  ```java
  hasil.append((bitA != bitB) ? '1' : '0');
  ```

---

### Fungsi `main`
Fungsi `main` digunakan untuk menjalankan program. Pengguna memilih operasi yang diinginkan (penjumlahan, pengurangan, perkalian, atau operasi logika), dan program menampilkan hasil berdasarkan pilihan tersebut.

```java
public static void main(String[] args) { ... }
```

- **Baris penting**: Menampilkan menu dan membaca pilihan pengguna
  ```java
  System.out.print("SEBUTKAN ANGKA YANG INGIN DIPILIH : ");
  int daftar = input.nextInt();
  ```

---

Itulah penjelasan dari setiap fungsi yang ada pada kode di atas.