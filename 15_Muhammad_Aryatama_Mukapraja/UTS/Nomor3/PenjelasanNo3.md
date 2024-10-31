# UTS Nomor 3

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
public class PengolahanDataSensor {
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
double suhuT;
int moist, CO2, suhu, digit, nilai, j = 1;
int[] decimalTemp1 = new int[32];
char[] decimalTemp2 = new char[16];
char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
```
* `suhuT` = input suhu (dalam double) agar bisa koma
* `suhu` = suhu (dalam integer) untuk pembulatan
* `moist` = input kelembapan
* `CO2` = input kelembapan
* `digit` = mengambil modulus yang akan dirangkai ke bilangan biner
* `nilai` = menyimpan nilai sementara untuk nilai suhu, moist, dan CO2
* `j` = variabel untuk menghitung jumlah digit yang diperlukan lalu dideklarasikan ke array baru
* `int[] decimalTemp1 = new int[32];` = array sementara untuk menyimpan variabel `digit` yang didapat
* `char[] decimalTemp2 = new char[16];` = array sementara untuk menyimpan variabel `digit` yang didapat
* `char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};` = inisialisasi array untuk mengambil index yang diperlukan (untuk ke hexadesimal)

### Mengambil Input User
```
System.out.println("======= DATA SENSOR DALAM DESIMAL =======");
System.out.print("Suhu (celcius): ");
suhuT = sc.nextDouble();
System.out.print("Kelembapan (%): ");
moist = sc.nextInt();
System.out.print("CO2 (ppm): ");
CO2 = sc.nextInt();
```
Mengambil input `suhuT`, `moist`, `CO2`

### Pembulatan Suhu
```
suhu = (int) (suhuT + 0.5);
```
Membulatkan `suhuT` dengan mengubahnya menjadi integer setelah ditambah `0.5` lalu disimpan ke `suhu`

### Menyimpan Nilai Suhu, Moist, dan CO2 dengan Array
```
int[] toConvertFix = {suhu, moist, CO2};
```
Menyimpan `suhu` ke indeks ke-`0`, `moist` ke indeks ke-`1`, dan `CO2` ke indeks ke-`2`

### Konversi Biner ke Desimal
```
for (int i = 0; i < toConvertFix.length; i++) {
    j = 1;
    nilai = toConvertFix[i];
}
```
Program untuk mengulangi program for dibawahnya sampai semua input telah diproses. Diawali dengan inisialisasi `j = 1` lalu `nilai` berupa `suhu` pada `i = 0`, dst. Isi statementnya:
```
for (int k = 0; k < j; i++) {
    ...
    j++;
}
```
Program untuk mengulang dari `k = 0` sampai `k < j` dengan tiap perulangan menambah nilai `k` dan `j` dengan 1. Statement di dalam looping:
```
    digit = nilai % 2;
    nilai /= 2;
    decimalTemp1[k] = digit;
```
Dari desimal tadi dimodulus dengan 2 (hasilnya antara 0 atau 1), lalu desimal dibagi 2. Digit yang didapat disimpan di array (pada iterasi pertama, digit disimpan di indeks 0. Pada iterasi kedua, digit disimpan di indeks 1, dst)
```
    if ((bilangan1 == 1 || bilangan1 == 0) && (digit == 1 || digit == 0)) {
        decimalTemp1[i+1] = 1;
        j++;
        break;
    }
```
Kondisi ini digunakan ketika sudah di akhir modulus untuk menghentikan loop. Agar digitnya tetap disimpan, tambah array di sini satu indeks lebih banyak dan tambah `j` dengan 1. `j` di sini juga berfungsi untuk menentukan panjang array yang baru
```
int[] decimalNew1 = new int[j];
System.arraycopy(decimalTemp1, 0, decimalNew1, 0, j);
```
Membuat array baru yang berisi digit yang diperlukan (jumlahnya disimpan di variabel `j`), karena di `decimalTemp1[]`, array yang tidak diisi akan otomatis terisi `0`. `arraycopy` berfungsi untuk menyalin dari `decimalTemp1[]` ke `decimalNew1[]` dengan isi serta posisi yang sama
### Output dalam Biner
```
if (i == 0) {
    System.out.println("====== DATA SENSOR DALAM BINER ======");
    System.out.print("Suhu: ");
    for (int h = decimalNew1.length - 1; h >= 0; h--) {
        System.out.print(decimalNew1[h]);
        }
    System.out.println();
} else if (i == 1) {
    System.out.print("Kelembapan: ");
        for (int h = decimalNew1.length - 1; h >= 0; h--) {
            System.out.print(decimalNew1[h]);
        }
    System.out.println();
} else {
    System.out.print("CO2: ");
    for (int h = decimalNew1.length - 1; h >= 0; h--) {
        System.out.print(decimalNew1[h]);
                }
    System.out.println();
}
```
Dimulai jika `i = 0`, yaitu data `suhu`, dan seterusnya

Cara cetaknya sama:
```
for (int h = decimalNew1.length - 1; h >= 0; h--) {
    System.out.print(decimalNew1[h]);
}
System.out.println();
```
Mencetak kumpulan digit dari array dari paling belakang ke paling depan dengan looping, lalu mencetak baris baru

### Konversi Desimal ke Heksadesimal
```
for (int i = 0; i < toConvertFix.length; i++) {
    j = 1;
    nilai = toConvertFix[i];
    for (int k = 0; k < j; k++) {
        digit = nilai % 16;
        decimalTemp2[k] = hexa[digit];
        nilai /= 16;
    if (nilai == 0) {
        break;
    }
    j++;
}
char[] decimalNew2 = new char[j];
System.arraycopy(decimalTemp2, 0, decimalNew2, 0, j);
```
Proses sama seperti tadi, perbedaannya di `digit` diambil dengan dimodulus `16`; lalu isi `decimalTemp2[]` diambil dari index ke-(`digit`) dari array hexa[]. `nilai` lalu dibagi dengan `16`. Jika sudah habis (`nilai == 0`) looping akan berhenti
### Output dalam Heksadesimal
```
if (i == 0) {
    System.out.println("====== DATA SENSOR DALAM HEKSADESIMAL ======");
    System.out.print("Suhu: ");
    for (int h = decimalNew1.length - 1; h >= 0; h--) {
        System.out.print(decimalNew1[h]);
        }
    System.out.println();
} else if (i == 1) {
    System.out.print("Kelembapan: ");
        for (int h = decimalNew1.length - 1; h >= 0; h--) {
            System.out.print(decimalNew1[h]);
        }
    System.out.println();
} else {
    System.out.print("CO2: ");
    for (int h = decimalNew1.length - 1; h >= 0; h--) {
        System.out.print(decimalNew1[h]);
                }
    System.out.println();
}
```
Proses sama seperti tadi, tapi versi heksadesimal