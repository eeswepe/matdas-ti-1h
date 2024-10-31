# UTS Nomor 4

#### Oleh Muhammad Aryatama Mukapraja (15) TI-1H  NIM 244107020028
#### Tahun Pelajaran 2024/2025
#### Politeknik Negeri Malang

# Struktur Awal
### Import

```
import java.util.*;
```
###### Untuk meng-import utility yang ada di Java, salah satu yang digunakan adalah Scanner untuk input user

### Class dan Method

```
public class OperasiEnkripsi {
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
String binary1, binary2, hasilEncryptS = "";
int x = 0, digit1I, digit2I, l, digit, sum = 0, j = 1;
char digit1C, digit2C;
int[] encrypt = new int[32];
char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
char[] decimalTemp = new char[16];
```
* `binary1` = input bilangan biner yang ingin dienkripsi
* `binary2` = input bilangan biner sebagai kunci
* `digit` = mengambil modulus yang akan dirangkai ke bilangan biner
* `hasilEncryptS = ""` = tempat untuk merangkai bilangan biner hasil enkripsi ke dalam String
* `digit1C` = mengambil digit paling kiri bilangan biner pertama dalam bentuk Char
* `digit1I` = mengubah `digit1C` dalam bentuk Integer
* `digit2C` = mengambil digit paling kiri bilangan biner kedua dalam bentuk Char
* `digit2I` = mengubah `digit2C` dalam bentuk Integer
* `sum` = menjumlahkan bilangan desimal saat dikonversi pada bilangan biner hasil enkripsi
* `l` = mengambil panjang digit hasil enkripsi
* `j` = variabel untuk menghitung jumlah digit yang diperlukan lalu dideklarasikan ke array baru
* `x` = variabel yang akan digunakan untuk memulai indeks dari 0 untuk bilangan biner yang lebih pendek
* `int[] encrypt = new int[32];` = array sementara untuk menyimpan variabel `digit` yang didapat
* `char[] decimalTemp = new char[16];` = array sementara untuk menyimpan variabel `digit` yang didapat
* `char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};` = inisialisasi array untuk mengambil index yang diperlukan (untuk ke hexadesimal)

### Mengambil Input User
```
System.out.print("Masukkan kode biner: ");
binary1 = sc.nextLine();
System.out.print("Masukkan kode enkripsi: ");
binary2 = sc.nextLine();
```
Mengambil input `binary1` dan `binary2`
## Program XOR
### Skenario 1
```
if (binary1.length() > binary2.length()) {
    ...
}
```
Program ini dijalankan JIKA panjang `binary1` lebih panjang daripada `binary2`. Isi statementnya:
```
int gap1 = binary1.length() - binary2.length();
```
Menghitung perbedaaan panjang digit
```
for (int i = 0; i < gap1; i++) {
    digit1C = binary1.charAt(i);
    digit1I = digit1C - '0';
    encrypt[i] = digit1I;
}
```
Mendapat digit dari index ke `0` dari `binary1` (binary yang lebih panjang) sampai `gap1` (perbedaan kedua digit binary). Digit tersebut lalu diubah ke integer, lalu disimpan ke `encrypt[]`
```
for (int i = gap1; i < binary1.length(); i++) {
    digit1C = binary1.charAt(i);
    digit1I = digit1C - '0';
    digit2C = binary2.charAt(x);
    digit2I = digit2C - '0';
    x++;
    encrypt[i] = digit1I ^ digit2I;
}
```
`digit1C` mengambil `binary1` (yang lebih panjang) dari index sesuai `gap1`, yaitu perbedaan digitnya, sedangkan `digit2C`(yang lebih pendek) dari `x`, yaitu `0`

Digit yang diambil lalu diubah ke integer, lalu kedua digit di operasikan dengan operasi `|` dan disimpan di `encrypt[]`

Setiap perulangan akan menambah nilai `i` dan `x` , sampai panjang digit yang lebih besar (`binary1`)

```
for (int k = 0; k < binary1.length(); k++){
    hasilEncryptS += encrypt[k] + "";
    }
System.out.println("Hasil enkripsi dalam biner adalah " + hasilEncryptS);
```
Setiap digit di `encrypt[]` ditaruh di `hasilEncrpytS`, lalu di cetak

### Skenario 2
```
} else if (binary1.length() < binary2.length()) {
    ...
}
```
Program ini dijalankan JIKA panjang `binary2` lebih panjang daripada `binary1`. Isi statement dan cara kerjanya sama seperti di atas, hanya dibalik antara `binary2` dengan `binary1`:
```
for (int i = 0; i < gap2; i++) {
digit2C = binary1.charAt(i);
digit2I = digit2C - '0';
encrypt[i] = digit2I;
}
for (int i = gap2; i < binary2.length(); i++) {
    digit1C = binary1.charAt(x);
    digit1I = digit1C - '0';
    digit2C = binary2.charAt(i);
    digit2I = digit2C - '0';
    x++;
    encrypt[i] += digit1I ^ digit2I;
}
for (int k = 0; k < binary2.length(); k++){
    hasilEncryptS = encrypt[k] + "";
}
System.out.println("Hasil enkripsi dalam biner adalah " + hasilEncryptS);
```
### Skenario 3
```
} else {
    ...
   }
}
```
Program ini dijalankan JIKA panjang `binary1` sama dengan `binary2`. Isi statementnya dan cara kerjanya sama seperti di atas, tapi `i` dan `x` disamakan indexnya dari `0`:

```
for (int i = 0; i < binary2.length(); i++) {
    digit1C = binary1.charAt(i);
    digit1I = digit1C - '0';
    digit2C = binary2.charAt(i);
    digit2I = digit2C - '0';
    encrypt[i] = digit1I ^ digit2I;
}
for (int k = 0; k < binary1.length(); k++){
    hasilEncryptS += encrypt[k] + "";
}
System.out.println("Hasil enkripsi dalam biner adalah " + hasilEncryptS);
```
### Konversi Biner ke Desimal

```
l = hasilEncryptS.length();
```
Mengambil panjang digit bilangan biner hasil enkripsi
```
for (int i = 0; i < hasilEncryptS.length(); i++) {
    ...
}
```
Program untuk mengulangi statement dari index 0 sampai kurang dari `hasilEncryptS.length`, dengan tiap statement terulang akan menambah 1 ke variabel `i`. Berikut statement yang ada di dalam looping:

```
digit2C = hasilEncryptS.charAt(i);
```
Mengambil digit paling kiri dari `hasilEncryptS` (karena mengambil dari index 0)
```
digit2I = digit2C - '0';
```
Mengubah digit yang diambil dari char ke integer
```
sum += (digit2I * Math.pow(2, --l));
```
Digit yang diambil dikalikan dengan 2 dipangkat (`l` dikurangi 1), semua hasil perkalian diakumulasi dalam `sum`

### Konversi Desimal ke Heksadesimal
```
for (int i = 0; i < j; i++) {
    ...
    j++;
}
```
Program untuk mengulang dari `i = 0` sampai `i < j` dengan tiap perulangan menambah nilai `i` dan `j` dengan 1. Statement di dalam looping:
```
    digit = sum % 16;
    decimalTemp[i] = hexa[digit];
    sum /= 16;
```
Dari desimal tadi dimodulus dengan 16, lalu desimal dibagi 16. Digit yang didapat disimpan di array (pada iterasi pertama, digit disimpan di indeks 0. Pada iterasi kedua, digit disimpan di indeks 1, dst)
```
   if (sum == 0) {
        break;
    }
```
Kondisi ini digunakan ketika sudah di akhir modulus untuk menghentikan loop. `j` di sini berfungsi untuk menentukan panjang array yang baru
```
int[] decimalNew = new int[j];
System.arraycopy(decimalTemp, 0, decimalNew, 0, j);
```
Membuat array baru yang berisi digit yang diperlukan (jumlahnya disimpan di variabel `j`), karena di `decimalTemp[]`, array yang tidak diisi akan otomatis terisi `0`. `arraycopy` berfungsi untuk menyalin dari `decimalTemp[]` ke `decimalNew[]` dengan isi serta posisi yang sama
```
System.out.print("Hasil enkripsi dalam heksadesimal adalah: ");
for (int i = decimalNew.length - 1; i >= 0; i--) {
    System.out.print(decimalNew[i]);
}
```
Mencetak kumpulan digit dari array dari paling belakang ke paling depan dengan looping