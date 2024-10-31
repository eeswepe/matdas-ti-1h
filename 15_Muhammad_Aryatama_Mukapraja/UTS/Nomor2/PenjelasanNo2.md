# UTS Nomor 2

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
public class OperasiBilanganBiner {
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
String binary1, binary2;
byte choice, logic;
int l1, l2, digit1I, digit2I, sum1 = 0, sum2 = 0, hasilDec, j = 1, digit;
char operator, digit1C, digit2C;
int[] decimalTemp = new int[32];
```

* `binary1`= input bilangan biner pertama
* `binary2`= input bilangan biner kedua
* `choice`= memilih ingin operasi aritmatika atau operasi logika
* `logic`= memilih ingin operasi logika AND, OR, atau XOR
* `l1` = jumlah digit dalam bilangan biner pertama
* `l2` = jumlah digit dalam bilangan biner kedua
* `digit1C` = mengambil digit paling kiri bilangan biner pertama dalam bentuk Char
* `digit1I`= mengubah `digit1C` dalam bentuk Integer
* `digit2C` = mengambil digit paling kiri bilangan biner kedua dalam bentuk Char
* `digit2I`= mengubah `digit2C` dalam bentuk Integer
* `sum1` = menjumlahkan bilangan desimal saat dikonversi pada bilangan biner pertama
* `sum2` = menjumlahkan bilangan desimal saat dikonversi pada bilangan biner kedua
* `hasilDec` = hasil desimal saat kedua bilangan di operasikan menggunakan operator aritmatika
* `digit` = mengambil modulus yang akan dirangkai ke bilangan biner
* `operator` = menyediakan opsi operator untuk operasi aritmatika
* `int[] decimalTemp = new int[32];` = Array sementara untuk menyimpan variabel `digit` yang didapat
* `j` = variabel untuk menghitung jumlah digit yang diperlukan lalu dideklarasikan ke array baru

### Mengambil Input User

```
System.out.print("Masukkan bilangan biner pertama: ");
binary1 = input.nextLine();
System.out.print("Masukkan bilangan biner kedua: ");
binary2 = input.nextLine();
System.out.print("Ingin melakukan operasi aritmatika atau logika? (1. aritmatika, 2. logika): ");
choice = input.nextByte();
```
###### Mengambil `binary1`, `binary2`, dan `choice`

# Perintah Apabila `choice = 1`

```
if (choice == 1) {
...
}
```
### Konversi `binary1` ke Desimal
```
l1 = binary1.length();
```
Mengambil berapa digit di `binary1` dan disimpan ke `l1`
```
for (int i = 0; i < binary1.length(); i++) {
    ...
}
```
Program untuk mengulangi statement dari index 0 sampai kurang dari `binary.length`, dengan tiap statement terulang akan menambah 1 ke variabel `i`. Berikut statement yang ada di dalam looping:

```
digit1C = binary1.charAt(i);
```
Mengambil digit paling kiri dari `binary1` (karena mengambil dari index 0)
```
digit1I = digit1C - '0';
```
Mengubah digit yang diambil dari char ke integer
```
sum1 += (digit1I * Math.pow(2, --l1));
```
Digit yang diambil dikalikan dengan 2 dipangkat (`l1` dikurangi 1)

### Konversi `binary2` ke Desimal

```
l2 = binary2.length();                          
for (int i = 0; i < binary2.length(); i++) {
    digit2C = binary2.charAt(i);
    igit2I = digit2C - '0';
    sum2 += (digit2I * Math.pow(2, --l2));
    }
```
Proses yang sama dilakukan dengan `binary2`, hanya beda variabel

### Input Operator Aritmatika
```
System.out.print("Masukkan operator ('+' atau '-' atau '*'): ");
operator = input.next().charAt(0);
```
Mengambil inpur user operator aritmatika; bisa berupa +, -, atau *

## Switch Case untuk Operator Aritmatika
```
switch (operator) {
    case '+':
        ...
        break;
    case `-`:
        ...
        break;
    case `*`:
        ...
        break;
    default:
        ...
        break;
    }
```
### Apabila `+`
```
hasilDec = sum1 + sum2;
System.out.println("Hasilnya dalam desimal adalah: " + hasilDec);
```
Menambah hasil desimal dari `binary1` dan `binary2` lalu dicetak
#### Konversi Desimal ke Biner
```
for (int i = 0; i < j; i++) {
    ...
    j++;
}
```
Program untuk mengulang dari `i = 0` sampai `i < j` dengan tiap perulangan menambah nilai `i` dan `j` dengan 1. Statement di dalam looping:
```
    digit = hasilDec % 2;
    hasilDec /= 2;
    decimalTemp[i] = digit;
```
Dari desimal tadi dimodulus dengan 2 (hasilnya antara 0 atau 1), lalu desimal dibagi 2. Digit yang didapat disimpan di array (pada iterasi pertama, digit disimpan di indeks 0. Pada iterasi kedua, digit disimpan di indeks 1, dst)
```
    if ((hasilDec == 1 || hasilDec == 0) && (digit == 1 || digit == 0)) {
        decimalTemp[i+1] = 1;
        j++;
        break;
    }
```
Kondisi ini digunakan ketika sudah di akhir modulus untuk menghentikan loop. Agar digitnya tetap disimpan, tambah array di sini satu indeks lebih banyak dan tambah `j` dengan 1. `j` di sini juga berfungsi untuk menentukan panjang array yang baru
```
int[] decimalNewP = new int[j];
System.arraycopy(decimalTemp, 0, decimalNewP, 0, j);
```
Membuat array baru yang berisi digit yang diperlukan (jumlahnya disimpan di variabel `j`), karena di `decimalTemp[]`, array yang tidak diisi akan otomatis terisi `0`. `arraycopy` berfungsi untuk menyalin dari `decimalTemp[]` ke `decimalNewP[]` dengan isi serta posisi yang sama.
```
System.out.print("Hasilnya dalam biner adalah: ");
for (int i = decimalNewP.length - 1; i >= 0; i--) {
    System.out.print(decimalNewP[i]);
}
```
Mencetak kumpulan digit dari array dari paling belakang ke paling depan dengan looping
### Apabila `-`
Proses sama seperti di atas, hanya beda di awal (`hasilDec = sum1 - sum2`)
```
hasilDec = sum1 - sum2;
System.out.println("Hasilnya dalam desimal adalah: " + hasilDec);
 .
 .
 .
System.out.print("Hasilnya dalam biner adalah: ");
for (int i = decimalNewM.length - 1; i >= 0; i--) {
    System.out.print(decimalNewM[i]);
}
```
### Apabila `*`
Proses sama seperti di atas, hanya beda di awal (`hasilDec = sum1 * sum2`)
```
hasilDec = sum1 * sum2;
System.out.println("Hasilnya dalam desimal adalah: " + hasilDec);
 .
 .
 .
System.out.print("Hasilnya dalam biner adalah: ");
for (int i = decimalNewM.length - 1; i >= 0; i--) {
    System.out.print(decimalNewM[i]);
}
```
### Default
```
System.out.println("Input salah");
```
Default hanya jika input tidak sesuai

# Perintah Apabila `choice = 2`

```
} else if (choice == 2) {
    ...
}
```
### Input Operator Logika
```
System.out.print("Masukkan operator logika (1. AND, 2. OR, 3. XOR): ");
logic = input.nextByte();
int x = 0;
```
* `x` = variabel yang akan digunakan untuk memulai indeks dari 0 untuk bilangan biner yang lebih pendek

Mengambil inpur user operator logika; bisa berupa 1, 2, atau 3
## Switch Case untuk Operator Logika
```
switch (operator) {
    case 1:
        ...
        break;
    case 2:
        ...
        break;
    case 3:
        ...
        break;
    default:
        ...
        break;
    }
    
```
### Apabila 1 (AND)
Perhatikan contoh operator AND :
```
1 1 0 1 0 0 1 1
0 0 0 0 1 1 1 1
________________
0 0 0 0 0 0 1 1
```
Operator AND hanya mengoperasi digit sesuai binary yang paling pendek, sedangkan yang lain nilainya `0`
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
for (int i = gap1; i < binary1.length(); i++) {
    digit1C = binary1.charAt(i);
    digit1I = digit1C - '0';
    digit2C = binary2.charAt(x);
    digit2I = digit2C - '0';
    x++;
    System.out.print(digit1I & digit2I);
}
```
`digit1C` mengambil `binary1` (yang lebih panjang) dari index sesuai `gap1`, yaitu perbedaan digitnya, sedangkan `digit2C`(yang lebih pendek) dari `x`, yaitu `0`.

Digit yang diambil lalu diubah ke integer, lalu kedua digit di operasikan dengan operasi `&`

Setiap perulangan akan menambah nilai `i` dan `x` , sampai panjang digit yang lebih besar (`binary1`)

### Skenario 2
```
} else if (binary1.length() < binary2.length()) {
    ...
}
```
Program ini dijalankan JIKA panjang `binary2` lebih panjang daripada `binary1`. Isi statement dan cara kerjanya sama seperti di atas, hanya dibalik antara `binary2` dengan `binary1`:
```
 } else if (binary1.length() < binary2.length()) {
        int gap2 = binary2.length() - binary1.length();
        for (int i = gap2; i < binary2.length(); i++) {
            digit1C = binary1.charAt(x);
            digit1I = digit1C - '0';
            digit2C = binary2.charAt(i);
            digit2I = digit2C - '0';
            x++;
            System.out.print(digit1I & digit2I);
        }
    }
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
    System.out.print(digit1I & digit2I);
}
```
## Apabila 2 (OR)

Perhatikan contoh operator OR :
```
1 0 0 1 0 0 1 1
0 0 0 0 1 1 1 1
________________
1 0 0 1 1 1 1 1
```
Operator OR hanya mengoperasi digit sesuai binary yang paling pendek, sedangkan yang lain nilainya sama seperti sisa yang tidak dioperasikan

### Skenario 1
```
if (binary1.length() > binary2.length()) {
    ...
}
```
Program ini dijalankan JIKA panjang `binary1` lebih panjang daripada `binary2`. Isi statementnya:
```
int gap1 = binary1.length() - binary2.length();
for (int i = 0; i < gap1; i++) {
    System.out.print(binary1.charAt(i));
}
```
Mencetak digit dari index ke `0` dari `binary1` (binary yang lebih panjang) sampai `gap1` (perbedaan kedua digit binary)
```
for (int i = gap1; i < binary1.length(); i++) {
    digit1C = binary1.charAt(i);
    digit1I = digit1C - '0';
    digit2C = binary2.charAt(x);
    digit2I = digit2C - '0';
    x++;
    System.out.print(digit1I | digit2I);
}
```
`digit1C` mengambil `binary1` (yang lebih panjang) dari index sesuai `gap1`, yaitu perbedaan digitnya, sedangkan `digit2C`(yang lebih pendek) dari `x`, yaitu `0`

Digit yang diambil lalu diubah ke integer, lalu kedua digit di operasikan dengan operasi `|`

Setiap perulangan akan menambah nilai `i` dan `x` , sampai panjang digit yang lebih besar (`binary1`)

### Skenario 2
```
} else if (binary1.length() < binary2.length()) {
    ...
}
```
Program ini dijalankan JIKA panjang `binary2` lebih panjang daripada `binary1`. Isi statement dan cara kerjanya sama seperti di atas, hanya dibalik antara `binary2` dengan `binary1`:
```
int gap2 = binary2.length() - binary1.length();
for (int i = 0; i < gap2; i++) {
    System.out.print(binary2.charAt(i));
}
for (int i = gap2; i < binary2.length(); i++) {
    digit1C = binary1.charAt(x);
    digit1I = digit1C - '0';
    digit2C = binary2.charAt(i);
    digit2I = digit2C - '0';
    x++;
    System.out.print(digit1I | digit2I);
}
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
    System.out.print(digit1I | digit2I);
}
```
## Apabila 3 (XOR)
Perhatikan contoh operator XOR :
```
1 0 0 1 1 0 0 1
0 0 0 0 1 1 1 1
________________
1 0 0 1 0 1 1 0
```
Sama seperti OR, Operator XOR hanya mengoperasi digit sesuai binary yang paling pendek, sedangkan yang lain nilainya sama seperti sisa yang tidak dioperasikan. Hanya perbedaannya adalah operasinya adalah`digit1I ^ digit2I`

### Skenario 1
```
if (binary1.length() > binary2.length()) {
    int gap1 = binary1.length() - binary2.length();
            .
            .
            .
        System.out.print(digit1I ^ digit2I);
        }
    }
```
### Skenario 2
```
} else if (binary1.length() < binary2.length()) {
        int gap2 = binary2.length() - binary1.length();
            .
            .
            .
        System.out.print(digit1I ^ digit2I);
        }
    }
```
### Skenario 3
```
else {
    for (int i = 0; i < binary2.length(); i++) {
    digit1C = binary1.charAt(i);
    digit1I = digit1C - '0';
    digit2C = binary2.charAt(i);
    digit2I = digit2C - '0';
    }
}
```

## Default
```
default:
    System.out.println("Input salah");
    break;
}
```
Hanya jika input tidak valid

# Perintah Apabila Selain 1 dan 2
```
else {
    System.out.println("Input salah");
}
```
Hanya jika input tidak valid