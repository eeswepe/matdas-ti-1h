# UTS Nomor 1

#### Oleh Muhammad Aryatama Mukapraja (15) TI-1H  NIM 244107020028
#### Tahun Pelajaran 2024/2025
#### Politeknik Negeri Malang

# Introduction

(1a) desimal ke biner 

(1b) desimal ke heksadesimal

(2a) biner ke desimal 

(2b) biner ke heksadesimal 

(3a) heksadesimal ke desimal 

(3b) heksadesimal ke biner 

# Struktur Awal
### Import

```
import java.util.*;
```
###### Untuk meng-import utility yang ada di Java, salah satu yang digunakan adalah Scanner untuk input user

### Class dan Method

```
public class KonversiBilangan {
    public static void main(String[] args) {
        ...
    }
}
```
###### Struktur dasar dalam java yang berisi class dan method

### Deklarasi Scanner

```
Scanner input = new Scanner(System.in);
```
###### Membuat variabel `input` agar dapat meng-input dalam java

### Deklarasi Variabel dan Array

```
int[] decimalTemp1A = new int[32];
int bilangan1, bilangan2, digit, j = 1;
char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
char[] decimalTemp1B = new char[16];
String bil2;
char digit2C;
int l, digit2I, sum2 = 0;
String bil3;
char digit3C;
int digit3I, sum3 = 0;
```
* `int[] decimalTemp1A = new int[32];` = array sementara untuk menyimpan variabel `digit` yang didapat (untuk nomor 1a)
* `char[] decimalTemp1B = new char[16];` = Array sementara untuk menyimpan variabel `digit` yang didapat (untuk nomor 1b)
* `char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};` = inisialisasi array untuk mengambil index yang diperlukan (untuk ke hexadesimal)
* `bilangan1`= input bilangan desimal (untuk nomor 1a)
* `bilangan2`= input bilangan desimal (untuk nomor 1b)
* `bil2` = input bilangan biner (untuk nomor 2)
* `bil3` = input bilangan heksadesimal (untuk nomor 3)
* `digit`= mengambil modulus yang akan dirangkai ke bilangan biner
* `j` = variabel untuk menghitung jumlah digit yang diperlukan lalu dideklarasikan ke array baru
* `l` = mengambil panjang digit dari suatu bilangan
* `digit2C` = mengambil digit paling kiri bilangan biner dalam bentuk Char
* `digit2I` = mengubah `digit2C` menjadi Integer
* `digit3C` = mengambil digit paling kiri bilangan heksadesimal dalam bentuk Char
* `digit3I` = mengubah `digit3C` menjadi Integer
* `sum2` = menjumlahkan bilangan desimal saat dikonversi pada bilangan biner (untuk nomor 2)
* `sum3` = menjumlahkan bilangan desimal saat dikonversi pada bilangan biner (untuk nomor 3)

### Mengambil Input User
```
System.out.print("Masukkan sistem bilangan awal (1. desimal, 2. biner, 3. heksadesimal): ");
int sistemBil = input.nextInt();
input.nextLine();
```
Memberi pilihan sistem bilangan awal yang akan dikonversi ke sistem lain
# Switch Case untuk Sistem Bilangan
```
switch (sistemBil) {
    case '1':
        ...
        break;
    case `2`:
        ...
        break;
    case `3`:
        ...
        break;
    default:
        ...
        break;
    }
```
## Apabila `sistemBil = 1`
```
System.out.print("Masukkan bilangan dalam desimal: ");
int sementara = input.nextInt();
bilangan1 = sementara;
```
Mengambil input bilangan desimal lalu disimpan ke variabel `sementara`. Untuk operasi berikutnya, kita akan menggunakan `bilangan1`

### Mengubah Desimal ke Binary
```
for (int i = 0; i < j; i++) {
    ...
    j++;
}
```
Program untuk mengulang dari `i = 0` sampai `i < j` dengan tiap perulangan menambah nilai `i` dan `j` dengan 1. Statement di dalam looping:
```
    digit = bilangan1 % 2;
    bilangan1 /= 2;
    decimalTemp1A[i] = digit;
```
Dari desimal tadi dimodulus dengan 2 (hasilnya antara 0 atau 1), lalu desimal dibagi 2. Digit yang didapat disimpan di array (pada iterasi pertama, digit disimpan di indeks 0. Pada iterasi kedua, digit disimpan di indeks 1, dst)
```
    if ((bilangan1 == 1 || bilangan1 == 0) && (digit == 1 || digit == 0)) {
        decimalTemp1A[i+1] = 1;
        j++;
        break;
    }
```
Kondisi ini digunakan ketika sudah di akhir modulus untuk menghentikan loop. Agar digitnya tetap disimpan, tambah array di sini satu indeks lebih banyak dan tambah `j` dengan 1. `j` di sini juga berfungsi untuk menentukan panjang array yang baru
```
int[] decimalNew1A = new int[j];
System.arraycopy(decimalTemp1A, 0, decimalNew1A, 0, j);
```
Membuat array baru yang berisi digit yang diperlukan (jumlahnya disimpan di variabel `j`), karena di `decimalTemp1A[]`, array yang tidak diisi akan otomatis terisi `0`. `arraycopy` berfungsi untuk menyalin dari `decimalTemp1A[]` ke `decimalNew1A[]` dengan isi serta posisi yang sama
```
System.out.print("Binernya adalah: ");
for (int i = decimalNew1A.length - 1; i >= 0; i--) {
    System.out.print(decimalNew1A[i]);
}
System.out.println()
```
Mencetak kumpulan digit dari array dari paling belakang ke paling depan dengan looping, lalu mencetak baris baru

### Mengubah Desimal ke Heksadesimal
```
bilangan2 = sementara;
j = 1;
```
Melanjutkan program tadi, `bilangan2` kembali diambil dan `j` kembali diinisialisasikan ke `1`
```
for (int i = 0; i < j; i++) {
    digit = bilangan2 % 16;
    decimalTemp1B[i] = hexa[digit];
    bilangan2 /= 16;
    if (bilangan2 == 0) {
        break;
    }
    j++;
}
```
Proses sama seperti tadi, perbedaannya di `digit` diambil dengan dimodulus `16`; lalu isi `decimalTemp1B[]` diambil dari index ke-(`digit`) dari array hexa[]. `bilangan2` lalu dibagi dengan `16`. Jika sudah habis (`bilangan == 0`) looping akan berhenti
```
char[] decimalNew1B = new char[j];
System.arraycopy(decimalTemp1B, 0, decimalNew1B, 0, j);
              
System.out.print("Heksadesimalnya adalah: ");
for (int i = decimalNew1B.length - 1; i >= 0; i--) {
    System.out.print(decimalNew1B[i]);
}
```
Proses sama seperti tadi, yaitu untuk menampilkan hasil konversi

## Apabila `sistemBil = 2`
```
System.out.print("Masukkan bilangan dalam biner: ");
bil2 = input.nextLine();
l = bil2.length();
```
Mengambil input berupa `String`, dan `l` sesuai berapa digit di `bil2`
### Mengubah Binary ke Desimal
```
for (int i = 0; i < bil2.length(); i++) {
    ...
}
```
Program untuk mengulangi statement dari index 0 sampai kurang dari `bil2.length`, dengan tiap statement terulang akan menambah 1 ke variabel `i`. Berikut statement yang ada di dalam looping:

```
digit2C = bil2.charAt(i);
```
Mengambil digit paling kiri dari `bil1` (karena mengambil dari index 0)
```
digit2I = digit2C - '0';
```
Mengubah digit yang diambil dari char ke integer
```
sum2 += (digit2I * Math.pow(2, --l));
System.out.println("Desimalnya adalah: " + sum2);
```
Digit yang diambil dikalikan dengan 2 dipangkat (`l` dikurangi 1) lalu dicetak hasilnya
### Mengubah Binary ke Heksadesimal
```
j = 1;
```
Melanjutkan program di atas, inisialisasi kembali `j = 1`  
Karena kita sudah merubah bilangan biner ke desimal di atas, proses ini akan sama seperti desimal ke heksadesimal (perbedaan hanya menggunakan `decimalTemp2B[]` dan `decimalNew2B[]`) :
```
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
for (int i = decimalNew2B.length - 1; i >= 0; i--) {
    System.out.print(decimalNew2B[i]);
}
```
## Apabila `sistemBil = 3`
```
System.out.print("Masukkan bilangan dalam heksadesimal: ");
bil3 = input.nextLine();
l = bil3.length();
```
Mengambil input berupa `String`, dan` l` sesuai berapa digit di `bil3`
### Mengubah Heksadesimal ke Desimal
```
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
```
Bilangan heksadesimal paling kiri (indeks `0`) akan diambil `digit3C`, lalu char itu diubah menjadi integer. Jika `digit3I` berupa char, maka dengan `switch case`, tiap char dapat dikonversi menjadi integer masing-masing char dari `A` sampai `F`

Setelah dapat, `digit3I` dikali `16` pangkat (`l` dikurangi 1), hasilnya dijumlahkan oleh `sum3`, lalu dicetak `sum3` setelah looping berakhir (`i < jumlah digit`)

### Mengubah Heksadesimal ke Binary
```
j = 1;
```
Melanjutkan program di atas, inisialisasi kembali `j = 1`  
Karena kita sudah merubah bilangan heksadesimal ke desimal di atas, proses ini akan sama seperti desimal ke binary (perbedaan hanya menggunakan `decimalNew3B[]`) :
```
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
    for (int i = decimalNew3B.length - 1; i >= 0; i--) {
    System.out.print(decimalNew3B[i]);
}
```
## Apabila Default
```
System.out.println("Input salah");
```
Hanya muncul apabila input tidak valid