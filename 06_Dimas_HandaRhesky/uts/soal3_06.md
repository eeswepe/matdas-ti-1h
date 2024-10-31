Berikut adalah penjelasan dari setiap bagian kode dalam program Java di atas, beserta kode yang mewakili setiap fungsinya:

### 1. Deklarasi dan Inisialisasi Variabel Sensor
Program dimulai dengan mendeklarasikan dan menginisialisasi variabel `suhu`, `kelembapan`, dan `co2` untuk menyimpan data sensor suhu, kelembapan, dan konsentrasi CO₂ dalam satuan yang sesuai.

```java
double suhu = 28.6;    // Suhu dalam Celsius
int kelembapan = 65;   // Kelembapan dalam persen
int co2 = 420;         // Konsentrasi CO2 dalam ppm
```

### 2. Konversi Suhu ke Biner dan Heksadesimal
Bagian ini mengonversi nilai suhu (hanya bagian integer dari `suhu`) menjadi representasi biner dan heksadesimal.

#### a. Konversi Suhu ke Biner
Program mengambil bagian integer dari `suhu`, lalu menggunakan `while` loop untuk menghitung nilai biner dari suhu tersebut, dengan menambahkan setiap bit hasil konversi ke awal `suhuBiner`.

```java
int suhuInt = (int) suhu;
StringBuilder suhuBiner = new StringBuilder();
int nilaiSuhu = suhuInt;
while (nilaiSuhu > 0) {
    suhuBiner.insert(0, nilaiSuhu % 2);
    nilaiSuhu /= 2;
}
```

#### b. Konversi Suhu ke Heksadesimal
Untuk mengonversi `suhuInt` ke heksadesimal, program menggunakan array `heksDigit` sebagai acuan untuk nilai heksadesimal dan `while` loop untuk membagi `suhuInt` ke basis 16.

```java
StringBuilder suhuHeksadesimal = new StringBuilder();
nilaiSuhu = suhuInt;
char[] heksDigit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
while (nilaiSuhu > 0) {
    suhuHeksadesimal.insert(0, heksDigit[nilaiSuhu % 16]);
    nilaiSuhu /= 16;
}
```

### 3. Konversi Kelembapan ke Biner dan Heksadesimal
Bagian ini mengonversi `kelembapan` menjadi representasi biner dan heksadesimal dengan cara yang sama seperti pada suhu.

#### a. Konversi Kelembapan ke Biner
Program ini menghitung nilai biner untuk `kelembapan` menggunakan `while` loop, menyisipkan setiap bit ke awal `kelembapanBiner`.

```java
StringBuilder kelembapanBiner = new StringBuilder();
int nilaiKelembapan = kelembapan;
while (nilaiKelembapan > 0) {
    kelembapanBiner.insert(0, nilaiKelembapan % 2);
    nilaiKelembapan /= 2;
}
```

#### b. Konversi Kelembapan ke Heksadesimal
Untuk mengonversi `kelembapan` ke heksadesimal, program menggunakan array `heksDigit` dan membagi `kelembapan` ke basis 16.

```java
StringBuilder kelembapanHeksadesimal = new StringBuilder();
nilaiKelembapan = kelembapan;
while (nilaiKelembapan > 0) {
    kelembapanHeksadesimal.insert(0, heksDigit[nilaiKelembapan % 16]);
    nilaiKelembapan /= 16;
}
```

### 4. Konversi CO₂ ke Biner dan Heksadesimal
Bagian ini melakukan konversi `co2` menjadi representasi biner dan heksadesimal dengan cara yang sama seperti pada suhu dan kelembapan.

#### a. Konversi CO₂ ke Biner
Menggunakan `while` loop, program menghitung nilai biner untuk `co2`.

```java
StringBuilder co2Biner = new StringBuilder();
int nilaiCO2 = co2;
while (nilaiCO2 > 0) {
    co2Biner.insert(0, nilaiCO2 % 2);
    nilaiCO2 /= 2;
}
```

#### b. Konversi CO₂ ke Heksadesimal
Program ini mengonversi `co2` ke heksadesimal dengan menggunakan `heksDigit` array.

```java
StringBuilder co2Heksadesimal = new StringBuilder();
nilaiCO2 = co2;
while (nilaiCO2 > 0) {
    co2Heksadesimal.insert(0, heksDigit[nilaiCO2 % 16]);
    nilaiCO2 /= 16;
}
```

### 5. Menampilkan Hasil Konversi
Program kemudian mencetak data sensor asli (dalam desimal) dan hasil konversinya dalam biner dan heksadesimal untuk suhu, kelembapan, dan CO₂.

```java
System.out.println("Data Sensor:");
System.out.println("Suhu (Desimal): " + suhu + " °C");
System.out.println("Suhu (Biner): " + suhuBiner);
System.out.println("Suhu (Heksadesimal): " + suhuHeksadesimal);

System.out.println("\nKelembapan (Desimal): " + kelembapan + " %");
System.out.println("Kelembapan (Biner): " + kelembapanBiner);
System.out.println("Kelembapan (Heksadesimal): " + kelembapanHeksadesimal);

System.out.println("\nCO2 (Desimal): " + co2 + " ppm");
System.out.println("CO2 (Biner): " + co2Biner);
System.out.println("CO2 (Heksadesimal): " + co2Heksadesimal);
```

Kode di atas akan menampilkan hasil konversi untuk setiap sensor dalam bentuk desimal, biner, dan heksadesimal di konsol.