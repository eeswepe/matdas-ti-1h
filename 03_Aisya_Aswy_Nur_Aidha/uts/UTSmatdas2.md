Berikut adalah penjelasan fungsi dari setiap bagian program beserta potongan kodenya dalam format markdown.

---

### 1. Menampilkan Menu Pilihan Operasi

Program menampilkan daftar operasi yang bisa dipilih oleh pengguna dan meminta input berupa angka dari 1 sampai 6. Setiap angka mewakili operasi tertentu (penjumlahan, pengurangan, perkalian, AND, OR, XOR).

```java
System.out.println("Pilih operasi yang diinginkan:");
System.out.println("1. Penjumlahan");
System.out.println("2. Pengurangan");
System.out.println("3. Perkalian");
System.out.println("4. AND");
System.out.println("5. OR");
System.out.println("6. XOR");
System.out.print("Masukkan pilihan (1-6): ");
int pilihan = sc.nextInt();
sc.nextLine();
```

### 2. Input Bilangan Biner

Program meminta pengguna untuk memasukkan dua bilangan biner. Bilangan biner ini disimpan dalam variabel `biner1` dan `biner2`.

```java
System.out.print("Masukkan bilangan biner pertama : ");
String biner1 = sc.nextLine();

System.out.print("Masukkan bilangan biner kedua   : ");
String biner2 = sc.nextLine();
```

### 3. Konversi Biner ke Desimal

Bilangan biner yang diinput oleh pengguna diubah menjadi bilangan desimal menggunakan `Integer.parseInt` dengan basis 2. Ini untuk memudahkan perhitungan pada operasi aritmatika dan logika.

```java
int desimal1 = Integer.parseInt(biner1, 2);
int desimal2 = Integer.parseInt(biner2, 2);
```

### 4. Operasi Berdasarkan Pilihan Pengguna

Program menggunakan `switch` untuk menentukan operasi yang akan dilakukan berdasarkan pilihan pengguna. Setiap operasi dikonversi kembali ke biner setelah perhitungan selesai.

- **Penjumlahan**: Menjumlahkan dua bilangan desimal yang dikonversi dari biner, lalu hasilnya diubah kembali ke biner.

   ```java
   int hasilPenjumlahan = desimal1 + desimal2;
   hasilBiner = Integer.toBinaryString(hasilPenjumlahan);
   System.out.println("Hasil Penjumlahan (biner): " + hasilBiner);
   ```

- **Pengurangan**: Mengurangkan dua bilangan desimal yang dikonversi dari biner, lalu hasilnya diubah kembali ke biner.

   ```java
   int hasilPengurangan = desimal1 - desimal2;
   hasilBiner = Integer.toBinaryString(hasilPengurangan);
   System.out.println("Hasil Pengurangan (biner): " + hasilBiner);
   ```

- **Perkalian**: Mengalikan dua bilangan desimal yang dikonversi dari biner, lalu hasilnya diubah kembali ke biner.

   ```java
   int hasilPerkalian = desimal1 * desimal2;
   hasilBiner = Integer.toBinaryString(hasilPerkalian);
   System.out.println("Hasil Perkalian (biner): " + hasilBiner);
   ```

- **AND**: Melakukan operasi logika AND bitwise pada dua bilangan desimal yang dikonversi dari biner, lalu hasilnya diubah kembali ke biner.

   ```java
   int hasilAnd = desimal1 & desimal2;
   hasilBiner = Integer.toBinaryString(hasilAnd);
   System.out.println("Hasil AND (biner): " + hasilBiner);
   ```

- **OR**: Melakukan operasi logika OR bitwise pada dua bilangan desimal yang dikonversi dari biner, lalu hasilnya diubah kembali ke biner.

   ```java
   int hasilOr = desimal1 | desimal2;
   hasilBiner = Integer.toBinaryString(hasilOr);
   System.out.println("Hasil OR (biner): " + hasilBiner);
   ```

- **XOR**: Melakukan operasi logika XOR bitwise pada dua bilangan desimal yang dikonversi dari biner, lalu hasilnya diubah kembali ke biner.

   ```java
   int hasilXor = desimal1 ^ desimal2;
   hasilBiner = Integer.toBinaryString(hasilXor);
   System.out.println("Hasil XOR (biner): " + hasilBiner);
   ```

- **Default (Pilihan Tidak Valid)**: Jika input tidak valid, program akan mencetak pesan kesalahan.

   ```java
   default:
       System.out.println("Pilihan tidak valid.");
       break;
   ```

### 5. Menutup Scanner

Program menutup objek `Scanner` setelah semua operasi selesai untuk menghindari kebocoran sumber daya.

```java
sc.close();
```

---

### Ringkasan
Program ini mengambil dua bilangan biner sebagai input, mengonversinya ke desimal untuk melakukan operasi aritmatika atau logika sesuai pilihan pengguna, lalu mengonversi hasilnya kembali ke biner sebelum mencetak hasil.