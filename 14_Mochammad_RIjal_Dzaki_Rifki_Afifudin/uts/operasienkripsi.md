## Program Operator Enkripsi

### Import Scanner
```java
import java.util.Scanner;
```
Mengimpor kelas `Scanner` dari paket `java.util` yang digunakan untuk membaca input dari pengguna.

### Deklarasi Kelas dan Metode Main
```java
public class operasienkripsi {
    public static void main(String[] args) {
```
Mendeklarasikan kelas `operasienkripsi` dan metode `main` yang merupakan titik awal eksekusi program.

###  Membaca Input Bilangan Biner Pertama
```java
System.out.println("Masukkan Bilangan Biner Pertama (8 bit):");
String binaryInput1 = scanner.nextLine();
while (binaryInput1.length() != 8 || !binaryInput1.matches("[01]+")) {
    System.out.println("Masukkan hanya 0 atau 1 sepanjang 8 bit!");
    binaryInput1 = scanner.nextLine();
}
```
Mengambil input dari pengguna untuk bilangan biner pertama, memastikan input tersebut terdiri dari 8 bit dan hanya mengandung karakter '0' atau '1'.

### Membaca Input Bilangan Biner Kedua
```java
System.out.println("Masukkan Bilangan Biner Kedua (8 bit):");
String binaryInput2 = scanner.nextLine();
while (binaryInput2.length() != 8 || !binaryInput2.matches("[01]+")) {
    System.out.println("Masukkan hanya 0 atau 1 sepanjang 8 bit!");
    binaryInput2 = scanner.nextLine();
}
```
Mengambil input dari pengguna untuk bilangan biner kedua dengan validasi yang sama seperti input pertama.

### Membaca Input Kunci Enkripsi
```java
System.out.println("Masukkan Kunci Enkripsi (8 bit):");
String kunciInput = scanner.nextLine();
while (kunciInput.length() != 8 || !kunciInput.matches("[01]+")) {
    System.out.println("Masukkan hanya 0 atau 1 sepanjang 8 bit!");
    kunciInput = scanner.nextLine();
}
```
Mengambil input dari pengguna untuk kunci enkripsi dengan validasi yang sama seperti input biner.

### Inisialisasi Array untuk Hasil Enkripsi
```java
char[] hasilEnkripsi1 = new char[8];
char[] hasilEnkripsi2 = new char[8];
```
Mendeklarasikan dua array karakter untuk menyimpan hasil enkripsi dari masing-masing bilangan biner.

### Proses XOR untuk Input Pertama
```java
for (int i = 0; i < 8; i++) {
    hasilEnkripsi1[i] = input1[i] == kunci[i] ? '0' : '1';
}
```
Melakukan operasi XOR antara bilangan biner pertama dan kunci, menyimpan hasilnya ke dalam array `hasilEnkripsi1`.

### Proses XOR untuk Input Kedua
```java
for (int i = 0; i < 8; i++) {
    hasilEnkripsi2[i] = input2[i] == kunci[i] ? '0' : '1';
}
```
Melakukan operasi XOR antara bilangan biner kedua dan kunci, menyimpan hasilnya ke dalam array `hasilEnkripsi2`.

### Konversi Biner ke Desimal untuk Input Pertama
```java
int desimal1 = Integer.parseInt(String.valueOf(hasilEnkripsi1), 2);
```
Mengonversi hasil enkripsi biner pertama ke dalam bentuk desimal.

### Konversi Biner ke Desimal untuk Input Kedua
```java
int desimal2 = Integer.parseInt(String.valueOf(hasilEnkripsi2), 2);
```
Mengonversi hasil enkripsi biner kedua ke dalam bentuk desimal.

### Konversi Desimal ke Heksadesimal
```java
String heksa1 = String.format("%02X", desimal1);
String heksa2 = String.format("%02X", desimal2);
```
Mengonversi angka desimal yang dihasilkan menjadi format heksadesimal.

### Menampilkan Hasil
```java
System.out.println("\n--- Input ---");
System.out.println("Bilangan Biner 1: " + binaryInput1);
System.out.println("Bilangan Biner 2: " + binaryInput2);
System.out.println("Kunci: " + kunciInput);

System.out.println("\n--- Hasil Enkripsi ---");
System.out.println("Hasil Biner 1: " + String.valueOf(hasilEnkripsi1));
System.out.println("Hasil Heksa 1: " + heksa1);

System.out.println("\nHasil Biner 2: " + String.valueOf(hasilEnkripsi2));
System.out.println("Hasil Heksa 2: " + heksa2);
```
Menampilkan hasil input dan hasil enkripsi dalam bentuk biner dan heksadesimal ke layar.