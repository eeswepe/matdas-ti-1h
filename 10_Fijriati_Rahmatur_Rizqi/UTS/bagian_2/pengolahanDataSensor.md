**Pengolahan Data Sensor**

**Penjelasan Kode**

**Input Pengguna**

```java
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan nilai suhu (°C): ");
double suhu = sc.nextDouble();
System.out.print("Masukkan nilai kelembapan (%): ");
int kelembapan = sc.nextInt();
System.out.print("Masukkan nilai CO2 (ppm): ");
int co2 = sc.nextInt();
```

- `Scanner sc = new Scanner(System.in);`: Membuat objek `Scanner` untuk membaca input dari pengguna.
- `System.out.print(...)`: Mencetak pesan ke konsol untuk meminta input dari pengguna.
- `double suhu = sc.nextDouble();`: Membaca nilai suhu dalam bentuk desimal.
- `int kelembapan = sc.nextInt();`: Membaca nilai kelembapan sebagai persentase.
- `int co2 = sc.nextInt();`: Membaca nilai CO₂ dalam satuan ppm.

**Pembulatan Nilai Suhu**

```java
int suhuInteger = (int) Math.round(suhu);
```

- **Pembulatan Suhu:** Menggunakan `Math.round` untuk membulatkan nilai suhu menjadi integer sebelum dikonversi. Jika suhu memiliki nilai desimal di atas 0.5, maka dibulatkan ke atas; jika di bawah 0.5, dibulatkan ke bawah, sesuai kebutuhan.

**Konversi Berdasarkan Tipe Data Sensor**

Program ini mengonversi suhu, kelembapan, dan kadar CO₂ ke dalam format biner dan heksadesimal.

```java
String suhuBinary = decimalToBinary(suhuInteger);
String suhuHexadecimal = decimalToHexadecimal(suhuInteger);

String kelembapanBinary = decimalToBinary(kelembapan);
String kelembapanHexadecimal = decimalToHexadecimal(kelembapan);

String co2Binary = decimalToBinary(co2);
String co2Hexadecimal = decimalToHexadecimal(co2);
```

- **Fungsi `decimalToBinary`**: Mengonversi nilai desimal ke format biner.
- **Fungsi `decimalToHexadecimal`**: Mengonversi nilai desimal ke format heksadesimal.

**Metode Konversi**

1. **`decimalToBinary(int decimal)`**

   - **Fungsi:** Mengonversi bilangan desimal ke biner.
   - **Implementasi:** Menggunakan `Integer.toBinaryString(decimal)`, yang mengembalikan representasi biner dari bilangan desimal.

2. **`decimalToHexadecimal(int decimal)`**
   - **Fungsi:** Mengonversi bilangan desimal ke heksadesimal.
   - **Implementasi:** Menggunakan `Integer.toHexString(decimal).toUpperCase()`, yang mengembalikan representasi heksadesimal dalam huruf kapital.

**Output Program**

Program ini menampilkan hasil konversi dalam format berikut:

```java
System.out.println("\nHasil Konversi Data Sensor:");
System.out.println("Suhu: " + suhuInteger + " °C");
System.out.println("Biner\t\t: " + suhuBinary);
System.out.println("Heksadesimal\t: " + suhuHexadecimal);
System.out.println("====================================");
System.out.println("Kelembapan: " + kelembapan + " %");
System.out.println("Biner\t\t: " + kelembapanBinary);
System.out.println("Heksadesimal\t: " + kelembapanHexadecimal);
System.out.println("====================================");
System.out.println("CO2: " + co2 + " ppm");
System.out.println("Biner\t\t: " + co2Binary);
System.out.println("Heksadesimal\t: " + co2Hexadecimal);
```

Output ditampilkan dalam format berikut:

- **Suhu**: Menampilkan nilai suhu dalam °C, serta konversi ke biner dan heksadesimal.
- **Kelembapan**: Menampilkan nilai kelembapan dalam %, serta konversi ke biner dan heksadesimal.
- **CO₂**: Menampilkan kadar CO₂ dalam ppm, serta konversi ke biner dan heksadesimal.

Dengan penjelasan ini, program diharapkan dapat mempermudah pengguna untuk memahami cara kerja konversi data sensor dan melihat hasilnya dalam berbagai format.
