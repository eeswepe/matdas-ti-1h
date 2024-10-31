Berikut adalah penjelasan untuk setiap fungsi dari kode Java yang Anda berikan, beserta potongan kode yang relevan dalam format markdown.

### 1. **Import dan Deklarasi Kelas**

```java
import java.util.Scanner;

public class matdas1 {
```
- **Penjelasan**: Mengimpor kelas `Scanner` untuk membaca input dari pengguna. Deklarasi kelas `matdas1`, yang merupakan titik awal program.

### 2. **Metode `main`**

```java
public static void main(String[] args) {
```
- **Penjelasan**: Metode utama yang dieksekusi ketika program dijalankan.

### 3. **Membaca Pilihan Konversi**

```java
Scanner sc = new Scanner(System.in);
System.out.println("Pilihan konversi :");
System.out.println("1. Desimal ke Biner & Heksadesimal");
System.out.println("2. Biner ke Desimal & Heksadesimal");
System.out.println("3. Heksadesimal ke Desimal & Biner");
System.out.print("Masukkan pilihan : ");
pilihan = sc.nextInt();
```
- **Penjelasan**: Menggunakan `Scanner` untuk menampilkan menu konversi dan membaca pilihan pengguna.

### 4. **Konversi Desimal ke Biner dan Heksadesimal**

```java
case 1:
    System.out.println("##  Desimal ke Biner & Heksadesimal ##");
    int angkaDes, i;
    int sisa[] = new int[32];
    System.out.print("Masukkan bilangan desimal : ");
    angkaDes = sc.nextInt();
```
- **Penjelasan**: Memulai konversi dari desimal ke biner dan heksadesimal. Menerima input bilangan desimal dari pengguna.

#### Konversi Desimal ke Biner

```java
for(i = 0; angkaDes > 0; i++) {
    sisa[i] = angkaDes % 2;
    angkaDes = angkaDes / 2;
}
System.out.print("Angka binernya adalah : ");
for(i = i-1; i >= 0; i--) {
    System.out.print(sisa[i]);
}
```
- **Penjelasan**: Menghitung biner dengan membagi bilangan desimal dengan 2, menyimpan sisa dalam array, dan mencetak hasilnya.

#### Konversi Desimal ke Heksadesimal

```java
String hexa = ""; 
while(angka2 != 0) {
    int bilHexa = angka2 % 16;
    char hexaDigit = (bilHexa <= 9 && bilHexa >= 0) ? 
                     (char)(bilHexa + '0') : (char)(bilHexa - 10 + 'A');
    hexa = hexaDigit + hexa;
    angka2 = angka2 / 16;
}
System.out.print("Angka hexadesimalnya adalah : " + hexa);
```
- **Penjelasan**: Menghitung heksadesimal dengan membagi bilangan dengan 16, mengonversi sisa menjadi karakter heksadesimal, dan menyimpannya dalam string.

### 5. **Konversi Biner ke Desimal dan Heksadesimal**

```java
case 2:
    System.out.println("## Biner ke Desimal & Heksadesimal ##");   
    int angkaBin, digit;
    int angkaDesimal = 0;
    int j = 1;
    System.out.print("Masukkan bilangan biner : ");
    angkaBin = sc.nextInt();
```
- **Penjelasan**: Memulai konversi dari biner ke desimal dan heksadesimal. Menerima input bilangan biner dari pengguna.

#### Konversi Biner ke Desimal

```java
while (angkaBin != 0) {
    digit = angkaBin % 10;
    angkaDesimal = angkaDesimal + (digit * j);
    j = j * 2;
    angkaBin = angkaBin / 10;
}
System.out.println("Angka desimalnya adalah : " + angkaDesimal);
```
- **Penjelasan**: Menghitung desimal dari biner dengan mengalikan setiap digit biner dengan kekuatan dua sesuai posisinya.

#### Konversi Desimal ke Heksadesimal

```java
String hexa2 = ""; 
while(angkaDesimal != 0) {
    int bilHexa = angkaDesimal % 16;
    char hexaDigit = (bilHexa <= 9 && bilHexa >= 0) ? 
                     (char)(bilHexa + '0') : (char)(bilHexa - 10 + 'A');
    hexa2 = hexaDigit + hexa2;
    angkaDesimal = angkaDesimal / 16;
}
System.out.print("Angka hexadesimalnya adalah : " + hexa2);
```
- **Penjelasan**: Proses yang sama seperti pada konversi desimal ke heksadesimal, dilakukan setelah mendapatkan nilai desimal dari biner.

### 6. **Konversi Heksadesimal ke Desimal dan Biner**

```java
case 3:
    System.out.println("## Heksadesimal ke Desimal && Biner ##");   
    String angkaHeksa;
    int desimal = 0, h;
    System.out.print("Masukkan bilangan heksadesimal : ");
    angkaHeksa = sc.next();
```
- **Penjelasan**: Memulai konversi dari heksadesimal ke desimal dan biner. Menerima input bilangan heksadesimal dari pengguna.

#### Konversi Heksadesimal ke Desimal

```java
for (h = 0; h < angkaHeksa.length(); h++) {
    char karakter = angkaHeksa.charAt(h);
    int nilai;
    if (karakter >= '0' && karakter <= '9') {
        nilai = karakter - '0';
    } else if (karakter >= 'A' && karakter <= 'F') {
        nilai = karakter - 'A' + 10;
    } else if (karakter >= 'a' && karakter <= 'f') {
        nilai = karakter - 'a' + 10;
    } else {
        System.out.println("input tidak valid.");
        return;
    }
    desimal = desimal * 16 + nilai;
}
System.out.println("Angka desimalnya adalah : " + desimal);
```
- **Penjelasan**: Menghitung nilai desimal dari heksadesimal dengan mengonversi setiap karakter ke nilai desimal dan mengakumulasikannya.

#### Konversi Desimal ke Biner

```java
int sisa2[] = new int[32];
for(i = 0; desimal > 0; i++) {
    sisa2[i] = desimal % 2;
    desimal = desimal / 2;
}
System.out.print("Angka binernya adalah : ");
for(i = i-1; i >= 0; i--) {
    System.out.print(sisa2[i]);
}
```
- **Penjelasan**: Sama seperti sebelumnya, menghitung biner dari desimal dan mencetak hasilnya.

### 7. **Penutupan Program**

```java
} 
```
- **Penjelasan**: Menandai akhir dari blok `switch` dan metode `main`.

Program ini berfungsi untuk mengkonversi antara bilangan desimal, biner, dan heksadesimal berdasarkan pilihan pengguna, dan memberikan hasilnya dalam format yang sesuai.