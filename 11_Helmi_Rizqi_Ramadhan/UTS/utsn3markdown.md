# UTS MatDas

Nama    : Helmi Rizqi Ramadhan  
NIM     : 244107020107  
Kelas   : TI-1H


## Nomor 3 "Pengolahan Data Sensor"

Kode program ini ditulis dalam bahasa Java dan berfungsi untuk mengolah data sensor seperti suhu, kelembapan, dan konsentrasi CO2. Program ini menerima input dari pengguna dan mengonversi nilai tersebut ke dalam format biner dan heksadesimal.

## Import dan Deklarasi Kelas

```java
import java.util.Scanner;

public class utsn3 {
    public static void main(String[] args) {
```

- **`import java.util.Scanner;`**: Mengimpor kelas `Scanner` dari paket `java.util`, yang digunakan untuk mengambil input dari pengguna.
- **`public class utsn3`**: Mendefinisikan kelas publik bernama `utsn3`.
- **`public static void main(String[] args)`**: Metode `main` adalah titik masuk utama program. Setiap program Java membutuhkan metode ini untuk dieksekusi.

## Inisialisasi Scanner dan Input Data

```java
Scanner gotou = new Scanner(System.in);

System.out.println("=========================================");
System.out.println("=         Pengolahan Data Sensor        =");
System.out.println("=========================================");
System.out.println();
```

- **`Scanner gotou = new Scanner(System.in);`**: Membuat objek `Scanner` yang bernama `gotou` untuk membaca input dari konsol.
- Bagian ini mencetak header yang menjelaskan program.

## Mengambil Input dari Pengguna

```java
System.out.print("Masukkan suhu (°C): ");
double suhu = gotou.nextDouble();

System.out.print("Masukkan kelembapan (%): ");
int kelembapan = gotou.nextInt();

System.out.print("Masukkan CO2 (ppm): ");
int co2 = gotou.nextInt();
```

- Menggunakan `System.out.print` untuk meminta pengguna memasukkan data suhu, kelembapan, dan konsentrasi CO2.
- **`double suhu = gotou.nextDouble();`**: Mengambil input suhu dalam bentuk desimal.
- **`int kelembapan = gotou.nextInt();`**: Mengambil input kelembapan sebagai bilangan bulat.
- **`int co2 = gotou.nextInt();`**: Mengambil input CO2 sebagai bilangan bulat.

## Konversi dan Output Data Suhu

```java
System.out.println("\nSuhu (" + suhu + " °C):");

int suhuInteger = (int) suhu;
double suhuDecimal = suhu - suhuInteger;
```

- Mencetak nilai suhu yang dimasukkan.
- Memisahkan bagian integer dan desimal dari suhu untuk konversi lebih lanjut.

### Konversi Suhu ke Biner dan Heksadesimal

#### Konversi ke Biner

```java
StringBuilder binerSuhu = new StringBuilder();
int tempSuhu = suhuInteger;
while (tempSuhu > 0) {
    binerSuhu.insert(0, tempSuhu % 2);
    tempSuhu /= 2;
}
System.out.println("Biner (Integer)   : " + binerSuhu.toString());
```

- **`StringBuilder binerSuhu = new StringBuilder();`**: Menginisialisasi objek `StringBuilder` untuk menyimpan hasil konversi biner.
- Menggunakan loop `while` untuk mengonversi bagian integer dari suhu ke biner.
- Mencetak hasil konversi biner dari suhu.

#### Konversi ke Heksadesimal

```java
StringBuilder heksaSuhu = new StringBuilder();
char[] heksaDigit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
tempSuhu = suhuInteger;
while (tempSuhu > 0) {
    heksaSuhu.insert(0, heksaDigit[tempSuhu % 16]);
    tempSuhu /= 16;
}
System.out.println("Heksadesimal (Integer): " + heksaSuhu.toString());
```

- **`char[] heksaDigit = {...};`**: Mendefinisikan array karakter untuk digit heksadesimal.
- Menggunakan loop `while` untuk mengonversi bagian integer dari suhu ke heksadesimal.
- Mencetak hasil konversi heksadesimal dari suhu.

#### Konversi Bagian Desimal ke Biner

```java
StringBuilder binerSuhuDecimal = new StringBuilder("0.");
double tempDecimal = suhuDecimal;
int decimalPrecision = 5; // Mengatur presisi biner untuk angka desimal
while (tempDecimal > 0 && decimalPrecision > 0) {
    tempDecimal *= 2;
    if (tempDecimal >= 1) {
        binerSuhuDecimal.append("1");
        tempDecimal -= 1;
    } else {
        binerSuhuDecimal.append("0");
    }
    decimalPrecision--;
}
System.out.println("Biner (Desimal): " + binerSuhuDecimal.toString());
```

- Mengonversi bagian desimal dari suhu ke biner dengan presisi maksimum 5 digit.
- Mencetak hasil konversi biner dari bagian desimal suhu.

## Konversi dan Output Data Kelembapan

Proses konversi untuk kelembapan dan CO2 mirip dengan yang dilakukan untuk suhu. Berikut adalah bagian untuk kelembapan:

### Kelembapan

```java
System.out.println("\nKelembapan (" + kelembapan + "%):");

StringBuilder binerKelembapan = new StringBuilder();
int tempKelembapan = kelembapan;
while (tempKelembapan > 0) {
    binerKelembapan.insert(0, tempKelembapan % 2);
    tempKelembapan /= 2;
}
System.out.println("Biner      : " + binerKelembapan.toString());

StringBuilder heksaKelembapan = new StringBuilder();
tempKelembapan = kelembapan;
while (tempKelembapan > 0) {
    heksaKelembapan.insert(0, heksaDigit[tempKelembapan % 16]);
    tempKelembapan /= 16;
}
System.out.println("Heksadesimal: " + heksaKelembapan.toString());
```

### CO2

```java
System.out.println("\nCO2 (" + co2 + " ppm):");

StringBuilder binerCO2 = new StringBuilder();
int tempCO2 = co2;
while (tempCO2 > 0) {
    binerCO2.insert(0, tempCO2 % 2);
    tempCO2 /= 2;
}
System.out.println("Biner      : " + binerCO2.toString());

StringBuilder heksaCO2 = new StringBuilder();
tempCO2 = co2;
while (tempCO2 > 0) {
    heksaCO2.insert(0, heksaDigit[tempCO2 % 16]);
    tempCO2 /= 16;
}
System.out.println("Heksadesimal: " + heksaCO2.toString());
```

- Proses konversi kelembapan dan CO2 ke format biner dan heksadesimal dilakukan dengan cara yang sama seperti suhu.

## Menutup Program

```java
System.out.println();
System.out.println("=========================================");
System.out.println("=         Konversi Data Selesai         =");
System.out.println("=========================================");
gotou.close();
```

- Mencetak garis pemisah dan menutup objek `Scanner` untuk mencegah kebocoran memori.

## Kesimpulan

Program ini mengambil input suhu, kelembapan, dan konsentrasi CO2 dari pengguna, kemudian mengonversi dan mencetak nilai tersebut dalam format biner dan heksadesimal. Program ini menggunakan teknik dasar pemrograman Java seperti pengambilan input, penggunaan loop, dan manipulasi string.