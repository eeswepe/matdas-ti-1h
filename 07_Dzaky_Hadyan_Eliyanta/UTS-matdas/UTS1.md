# Penjelasan kode program UTS matdas nomor 1
* Nama: Dzaky Hadyan Eliyanta
* No. Absen: 07
* NIM: 244107020117
## 
```import java.util.Scanner;```  
Sintaks di atas merupakan salah satu class di dalam util package yang mana digunakan untuk mengambil input dari user  
```
public class UTS1 {
public static void main(String[] args) {
```
Mendeklarasikan class UTS1 dan method main  
```
Scanner sc = new Scanner(System.in);
```  
Membuat objek Scanner bernama sc untuk membaca input dari terminal
```
System.out.println("1. Biner");
System.out.println("2. Desimal");
System.out.println("3. Heksadesimal");
```  
Menampilkan pilihan untuk sistem bilangan
```
System.out.print("From: ");
int convertFrom = sc.nextInt();
```
Menampilkan tempat untuk menginput pilihan sistem bilangan akan dikonversi dari sistem bilangan apa  
```
System.out.print("To: ");
int convertTo = sc.nextInt();
```  
Menampilkan tempat untuk menginput pilihan sistem bilangan akan dikonversi ke sistem bilangan apa  
```
System.out.print("Bilangan: ");
String input = sc.next();
```
Menampilkan tempat untuk menginput bilangan yang akan dikonversi
```
int digit = input.length();
```  
Mendeklarasikan variabel integer digit dengan nilai berupa panjang dari variabel input  
```
switch (convertFrom) {
```
Memeriksa sistem bilangan sumber konversi yang dipilih oleh pengguna untuk menentukan jalur konversi  
```
case 1:
    switch (convertTo) {
```
Memeriksa jenis konversi dari biner (1) ke desimal (2) atau heksadesimal (3)  
```
case 2:
int decimal12 = 0;
```  
Menyiapkan variabel decimal12 untuk menyimpan hasil konversi biner ke desimal  
```
for (int i = 0; i < digit; i++) {
    char bit = input.charAt(digit - 1 - i); // Mulai dari bit paling kanan
    if (bit == '1') {
        decimal12 += Math.pow(2, i); // Tambahkan nilai bit
    }
}
```
Menghitung nilai desimal dengan memeriksa setiap bit dari string biner, mulai dari bit paling kanan. Jika bit adalah '1', nilai (2^i) ditambahkan ke decimal12
```
System.out.print("Hasil: " + decimal12);
break;
```
Mencetak hasil konversi ke desimal dan keluar dari switch  
```
case 3:
int decimal13 = 0;
```  
Menyiapkan variabel decimal13 untuk menyimpan nilai desimal sebelum konversi ke heksadesimal  
```
for (int i = 0; i < digit; i++) {
    char bit = input.charAt(digit - 1 - i);
    if (bit == '1') {
        decimal13 += Math.pow(2, i);
    }
}
```  
Menggunakan logika yang sama seperti sebelumnya untuk menghitung nilai desimal  
```
char [] listModulus1 = new char[99];
int i = 0;
do {
    int modulus = decimal13 % 16;
    if (modulus < 10) {
        listModulus1[i] = (char) ('0' + modulus);
    } else {
        listModulus1[i] = (char) ('A' + (modulus - 10));
    }
    decimal13 /= 16;
    i++;
} while (decimal13 != 0);
```  
Menggunakan modulus 16 untuk menghitung nilai heksadesimal dan menyimpannya dalam array listModulus1  
```
System.out.print("Hasil: ");
for (int j = i-1; j >= 0; j--) {
    System.out.print(listModulus1[j]);
}
break;
```  
Mencetak hasil konversi heksadesimal dengan membalik urutan hasil  
```
case 2:
```  
Memeriksa jenis konversi dari desimal (2) ke biner (1) atau heksadesimal (3)  
```
case 1: // Desimal ke Biner
int angka = Integer.valueOf(input);
int [] listModulus = new int[99];
int i = 0;
do {
    listModulus[i] = angka % 2;
    angka /= 2;
    i++;
} while (angka != 0);
```  
Mengonversi input desimal menjadi integer (angka) dan menyiapkan array untuk menyimpan hasil biner. Melakukan konversi menggunakan modulus 2  
```
System.out.print("Hasil: ");
for (; i >= 0; i--) {
    System.out.print(listModulus[i]);
}
break;
```  
Mencetak hasil biner. (Perlu diingat, ini memiliki kesalahan karena indeks bisa keluar batas, seharusnya i-1.)  
```
case 3: // Desimal ke Heksadesimal
int decimal23 = Integer.valueOf(input);
char [] listModulus1 = new char[99];
int j = 0;
do {
    int modulus = decimal23 % 16;
    if (modulus < 10) {
        listModulus1[j] = (char) ('0' + modulus);
    } else {
        listModulus1[j] = (char) ('A' + (modulus - 10));
    }
    decimal23 /= 16;
    j++;
} while (decimal23 != 0);
```  
Menggunakan modulus 16 untuk menghitung nilai heksadesimal dari desimal  
```
System.out.print("Hasil: ");
for (int k = j-1; k >= 0; k--) {
    System.out.print(listModulus1[k]);
}
break;
```  
Mencetak hasil konversi heksadesimal dengan membalik urutan hasil  
```
case 3:
```  
Memeriksa jenis konversi dari heksadesimal (3) ke biner (1) atau desimal (2)  
```
case 1: // Heksadesimal ke Biner
int angka = Integer.parseInt(input, 16);
int[] listModulus = new int[32]; // Array untuk menyimpan digit biner
int i = 0;
do {
    listModulus[i] = angka % 2; // Ambil sisa (digit biner)
    angka /= 2; // Bagi 2 untuk menggeser ke kanan
    i++;
} while (angka != 0);
```  
Mengonversi nilai heksadesimal ke desimal dan kemudian ke biner menggunakan modulus 2  
```
System.out.print("Hasil: ");
for (int j = i - 1; j >= 0; j--) { // Cetak dalam urutan terbalik
    System.out.print(listModulus[j]);
}
break;
```  
Mencetak hasil biner dengan membalik urutan hasil  
```
case 2: // Heksadesimal ke Desimal
int angka1 = Integer.parseInt(input, 16);
System.out.print("Hasil: " + angka1);
break;
```  
Mengonversi heksadesimal langsung ke desimal dan mencetak hasilnya  
```
sc.close();
```  
Menutup objek Scanner untuk membebaskan sumber daya yang digunakan