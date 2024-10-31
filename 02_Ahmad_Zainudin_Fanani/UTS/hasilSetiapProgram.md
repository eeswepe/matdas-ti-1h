# Soal No.1
# Program Konversi Bilangan

Program ini bertujuan untuk melakukan konversi antara bilangan dalam tiga format: desimal, biner, dan heksadesimal. Pengguna dapat memasukkan bilangan dalam satu format dan mendapatkan hasil konversi ke format lainnya. Program ini ditulis dalam bahasa pemrograman Java dan menggunakan metode manual untuk melakukan konversi.

## Struktur Program

Program ini terdiri dari beberapa fungsi, masing-masing memiliki tugas khusus untuk mengonversi bilangan dari satu format ke format lainnya. Berikut adalah rincian fungsi-fungsi tersebut:

### 1. Fungsi `konversiDesimalKeBiner(int desimal)`

```java
public static String konversiDesimalKeBiner(int desimal) {
    StringBuilder biner = new StringBuilder();
    if (desimal == 0) return "0"; // Menangani kasus desimal 0
    while (desimal > 0) {
        biner.insert(0, desimal % 2);
        desimal /= 2;
    }
    return biner.toString();
}
```

- **Deskripsi**: Mengonversi bilangan desimal ke dalam format biner.
- **Input**: Bilangan desimal (integer).
- **Proses**: 
  - Jika `desimal` adalah 0, langsung mengembalikan "0".
  - Menggunakan loop untuk membagi bilangan desimal dengan 2, menyimpan sisa bagi (0 atau 1) di depan string `biner`.
- **Output**: String yang merepresentasikan bilangan dalam format biner.

### 2. Fungsi `konversiBinerKeDesimal(String biner)`

```java
public static int konversiBinerKeDesimal(String biner) {
    int desimal = 0;
    for (int i = 0; i < biner.length(); i++) {
        desimal = desimal * 2 + (biner.charAt(i) - '0');
    }
    return desimal;
}
```

- **Deskripsi**: Mengonversi bilangan biner ke dalam format desimal.
- **Input**: String yang merepresentasikan bilangan biner.
- **Proses**: 
  - Mengiterasi setiap karakter dalam string `biner`, mengalikan `desimal` dengan 2, dan menambahkan nilai bit yang sesuai.
- **Output**: Bilangan desimal (integer).

### 3. Fungsi `konversiHeksadesimalKeDesimal(String heksadesimal)`

```java
public static int konversiHeksadesimalKeDesimal(String heksadesimal) {
    int desimal = 0;
    for (int i = 0; i < heksadesimal.length(); i++) {
        char karakter = heksadesimal.charAt(i);
        int nilai;
        if (karakter >= '0' && karakter <= '9') {
            nilai = karakter - '0';
        } else {
            nilai = karakter - 'A' + 10; // Asumsi huruf kapital
        }
        desimal = desimal * 16 + nilai;
    }
    return desimal;
}
```

- **Deskripsi**: Mengonversi bilangan heksadesimal ke dalam format desimal.
- **Input**: String yang merepresentasikan bilangan heksadesimal.
- **Proses**: 
  - Mengiterasi setiap karakter dalam string `heksadesimal`, menentukan nilai desimal berdasarkan karakter (0-9 untuk angka, A-F untuk huruf).
- **Output**: Bilangan desimal (integer).

### 4. Fungsi `konversiDesimalKeHeksadesimal(int desimal)`

```java
public static String konversiDesimalKeHeksadesimal(int desimal) {
    StringBuilder heksadesimal = new StringBuilder();
    if (desimal == 0) return "0"; // Menangani kasus desimal 0
    while (desimal > 0) {
        int sisa = desimal % 16;
        char karakter;
        if (sisa < 10) {
            karakter = (char) ('0' + sisa); // 0-9
        } else {
            karakter = (char) ('A' + (sisa - 10)); // A-F
        }
        heksadesimal.insert(0, karakter);
        desimal /= 16;
    }
    return heksadesimal.toString();
}
```

- **Deskripsi**: Mengonversi bilangan desimal ke dalam format heksadesimal.
- **Input**: Bilangan desimal (integer).
- **Proses**: 
  - Menggunakan loop untuk membagi bilangan desimal dengan 16, menyimpan sisa bagi di depan string `heksadesimal`.
- **Output**: String yang merepresentasikan bilangan dalam format heksadesimal.

### 5. Fungsi `main(String[] args)`

```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Konversi dari bilangan desimal
    System.out.print("Masukkan bilangan desimal: ");
    int desimal = Integer.parseInt(sc.nextLine());
    System.out.println("Biner: " + konversiDesimalKeBiner(desimal));
    System.out.println("Heksadesimal: " + konversiDesimalKeHeksadesimal(desimal));

    // Konversi dari bilangan biner
    System.out.print("Masukkan bilangan biner: ");
    String inputBiner = sc.nextLine();
    int desimalDariBiner = konversiBinerKeDesimal(inputBiner);
    System.out.println("Desimal: " + desimalDariBiner);
    System.out.println("Heksadesimal: " + konversiDesimalKeHeksadesimal(desimalDariBiner));

    // Konversi dari bilangan heksadesimal
    System.out.print("Masukkan bilangan heksadesimal: ");
    String inputHeksadesimal = sc.nextLine();
    int desimalDariHeksadesimal = konversiHeksadesimalKeDesimal(inputHeksadesimal);
    System.out.println("Desimal: " + desimalDariHeksadesimal);
    System.out.println("Biner: " + konversiDesimalKeBiner(desimalDariHeksadesimal));

    // Menutup scanner setelah selesai
    sc.close();
}
```

- **Deskripsi**: Fungsi utama yang mengatur alur kerja program.
- **Proses**:
  - Meminta input pengguna untuk bilangan dalam tiga format (desimal, biner, heksadesimal).
  - Memanggil fungsi konversi yang sesuai dan menampilkan hasilnya ke konsol.
- **Penggunaan Scanner**: Digunakan untuk menerima input dari pengguna.

## Buat program yang melakukan konversi bilangan. 

### I. Ubah Bilangan Desimal 450 ke dalam Sistem Biner dan Heksadesimal

**Input**:
```
Masukkan bilangan desimal: 450
```

**Output**:
```
Biner: 111000010
Heksadesimal: 1C2
```

### II. Ubah Bilangan Biner 11011000 ke dalam Sistem Desimal dan Heksadesimal

**Input**:
```
Masukkan bilangan biner: 11011000
```

**Output**:
```
Desimal: 216
Heksadesimal: D8
```

### III. Ubah Bilangan Heksadesimal 1F4 ke dalam Sistem Desimal dan Biner

**Input**:
```
Masukkan bilangan heksadesimal: 1F4
```

**Output**:
```
Desimal: 500
Biner: 111110100
```
# Soal No.2
# Dokumentasi Program Operasi Bilangan Biner

Program ini adalah implementasi dari berbagai operasi bilangan biner dalam bahasa Java. Dengan menggunakan fungsi-fungsi tertentu, program ini dapat melakukan penjumlahan, pengurangan, perkalian, serta operasi logika seperti AND, OR, dan XOR pada bilangan biner. Di bawah ini adalah penjelasan mendetail untuk setiap fungsi.

## 1. Fungsi Penjumlahan Biner
```java
public static String binaryAddition(String a, String b) {
    StringBuilder result = new StringBuilder();
    int carry = 0;

    while (a.length() < b.length()) a = "0" + a;
    while (b.length() < a.length()) b = "0" + b;

    for (int i = a.length() - 1; i >= 0; i--) {
        int bitA = a.charAt(i) - '0';
        int bitB = b.charAt(i) - '0';

        int sum = bitA + bitB + carry;
        result.append(sum % 2);
        carry = sum / 2;
    }
    if (carry != 0) {
        result.append(carry);
    }

    return result.reverse().toString();
}
```
- **Deskripsi**: 
  - Fungsi ini menjumlahkan dua bilangan biner. Hasilnya dibangun dari bit paling kanan (LSB) dan disimpan dalam `StringBuilder`. Jika ada carry, itu akan ditambahkan ke hasil. Hasil dibalik sebelum dikembalikan.

## 2. Fungsi Pengurangan Biner
```java
public static String binarySubtraction(String a, String b) {
    while (a.length() < b.length()) a = "0" + a;
    while (b.length() < a.length()) b = "0" + b;

    StringBuilder result = new StringBuilder();
    int borrow = 0;

    for (int i = a.length() - 1; i >= 0; i--) {
        int bitA = a.charAt(i) - '0';
        int bitB = b.charAt(i) - '0' + borrow;

        if (bitA < bitB) {
            bitA += 2;
            borrow = 1;
        } else {
            borrow = 0;
        }

        int bitResult = bitA - bitB;
        result.append(bitResult);
    }

    String finalResult = result.reverse().toString();
    return finalResult.replaceAll("^0+", ""); // Hapus leading zero
}
```
- **Deskripsi**:
  - Fungsi ini melakukan pengurangan dua bilangan biner. Jika bit yang akan dikurangi lebih kecil, pinjaman dilakukan dari bit sebelah kiri. Hasil akhir dibalik dan leading zero dihapus.

## 3. Fungsi Perkalian Biner
```java
public static String binaryMultiplication(String a, String b) {
    String result = "0";

    while (b.length() < a.length()) b = "0" + b; // Padding b
    for (int i = 0; i < b.length(); i++) {
        if (b.charAt(b.length() - 1 - i) == '1') {
            result = binaryAddition(result, a + "0".repeat(i));
        }
    }

    return result;
}
```
- **Deskripsi**:
  - Fungsi ini mengalikan dua bilangan biner. Jika bit dari bilangan kedua adalah 1, bilangan pertama yang digeser ditambahkan ke hasil total. 

## 4. Fungsi Operasi AND
```java
public static String binaryAND(String a, String b) {
    StringBuilder result = new StringBuilder();

    while (a.length() < b.length()) a = "0" + a;
    while (b.length() < a.length()) b = "0" + b;

    for (int i = 0; i < a.length(); i++) {
        result.append((a.charAt(i) - '0') & (b.charAt(i) - '0'));
    }

    return result.toString();
}
```
- **Deskripsi**:
  - Fungsi ini melakukan operasi AND antara dua bilangan biner. Hasilnya adalah 1 hanya jika kedua bit adalah 1.

## 5. Fungsi Operasi OR
```java
public static String binaryOR(String a, String b) {
    StringBuilder result = new StringBuilder();

    while (a.length() < b.length()) a = "0" + a;
    while (b.length() < a.length()) b = "0" + b;

    for (int i = 0; i < a.length(); i++) {
        result.append((a.charAt(i) - '0') | (b.charAt(i) - '0'));
    }

    return result.toString();
}
```
- **Deskripsi**:
  - Fungsi ini melakukan operasi OR antara dua bilangan biner. Hasilnya adalah 1 jika salah satu atau kedua bit adalah 1.

## 6. Fungsi Operasi XOR
```java
public static String binaryXOR(String a, String b) {
    StringBuilder result = new StringBuilder();

    while (a.length() < b.length()) a = "0" + a;
    while (b.length() < a.length()) b = "0" + b;

    for (int i = 0; i < a.length(); i++) {
        result.append((a.charAt(i) - '0') ^ (b.charAt(i) - '0'));
    }

    return result.toString();
}
```
- **Deskripsi**:
  - Fungsi ini melakukan operasi XOR antara dua bilangan biner. Hasilnya adalah 1 jika satu bit adalah 1 dan yang lainnya 0.

## Input dan Hasil

### I. Penjumlahan Biner
- **Operasi**: `110101 + 10111`
- **Hasil**: `1001000`

### II. Pengurangan Biner
- **Operasi**: `111001 - 10101`
- **Hasil**: `101000`

### III. Perkalian Biner
- **Operasi**: `1011 × 110`
- **Hasil**: `111110`

### IV. Operasi AND
- **Operasi**: `101011 AND 110101`
- **Hasil**: `100001`

### V. Operasi OR
- **Operasi**: `101011 OR 110101`
- **Hasil**: `111111`

### VI. Operasi XOR
- **Operasi**: `101011 XOR 110101`
- **Hasil**: `011110`

### Ringkasan Hasil

| **Operasi**            | **Input**                   | **Hasil**   |
|------------------------|-----------------------------|-------------|
| Penjumlahan            | `110101 + 10111`            | `1001000`   |
| Pengurangan            | `111001 - 10101`            | `101000`    |
| Perkalian              | `1011 × 110`                | `111110`    |
| AND                    | `101011 AND 110101`         | `100001`    |
| OR                     | `101011 OR 110101`          | `111111`    |
| XOR                    | `101011 XOR 110101`         | `011110`    |



# Soal No.3

Berikut adalah dokumentasi lengkap dengan penjelasan yang lebih rinci untuk program `pengolahanDataSensor3`

# Dokumentasi Program Pengolahan Data Sensor

Program ini dirancang untuk mengolah data sensor, termasuk suhu, kelembapan, dan kadar CO2. Program ini tidak hanya mengonversi nilai-nilai tersebut dari desimal ke biner dan heksadesimal, tetapi juga memvalidasi input pengguna untuk memastikan bahwa nilai-nilai tersebut positif. Dalam dokumen ini, setiap bagian kode dijelaskan secara mendetail untuk memberikan pemahaman yang lebih baik.

## Fungsi-Fungsi dalam Program

### 1. Fungsi `konversiDesimalKeBiner(int desimal)`
```java
public static String konversiDesimalKeBiner(int desimal) {
    StringBuilder biner = new StringBuilder();
    if (desimal == 0) return "0"; // Menangani kasus desimal 0
    while (desimal > 0) {
        biner.insert(0, desimal % 2);
        desimal /= 2;
    }
    return biner.toString();
}
```
- **Deskripsi**: 
  - Fungsi ini mengonversi bilangan desimal (bagian bulat) menjadi representasi biner. 
  - Menggunakan `StringBuilder` untuk membangun string biner secara manual. 
  - Dalam proses ini, bilangan desimal dibagi dengan 2 secara berulang, dan sisa pembagian (0 atau 1) dimasukkan ke dalam string biner dari belakang. 
  - Fungsi ini juga menangani kasus khusus di mana bilangan desimal yang diberikan adalah 0 dengan langsung mengembalikan "0".

### 2. Fungsi `konversiPecahanKeBiner(double pecahan)`
```java
public static String konversiPecahanKeBiner(double pecahan) {
    StringBuilder biner = new StringBuilder();
    biner.append(".");
    for (int i = 0; i < 4; i++) { // Batasi hingga 4 digit
        pecahan *= 2;
        int bit = (int) pecahan;
        biner.append(bit);
        pecahan -= bit;
        if (pecahan == 0) break; // Hentikan jika tidak ada sisa
    }
    return biner.toString();
}
```
- **Deskripsi**: 
  - Fungsi ini mengonversi bagian pecahan desimal menjadi biner dengan membatasi hasil hingga 4 digit.
  - Dalam setiap iterasi, pecahan dikalikan dengan 2 untuk mendapatkan bit biner selanjutnya. 
  - Hasil bit ditambahkan ke string biner, dan jika tidak ada sisa pecahan yang tersisa, proses akan dihentikan.

### 3. Fungsi `konversiDesimalKeHeksadesimal(int desimal)`
```java
public static String konversiDesimalKeHeksadesimal(int desimal) {
    StringBuilder heksadesimal = new StringBuilder();
    if (desimal == 0) return "0"; // Menangani kasus desimal 0
    while (desimal > 0) {
        int sisa = desimal % 16;
        char karakter;
        if (sisa < 10) {
            karakter = (char) ('0' + sisa); // 0-9
        } else {
            karakter = (char) ('A' + (sisa - 10)); // A-F
        }
        heksadesimal.insert(0, karakter);
        desimal /= 16;
    }
    return heksadesimal.toString();
}
```
- **Deskripsi**: 
  - Fungsi ini mengonversi bilangan desimal menjadi representasi heksadesimal.
  - Setiap digit heksadesimal dihasilkan dengan membagi bilangan desimal dengan 16 dan mengambil sisa.
  - Fungsi ini juga menangani konversi sisa menjadi karakter heksadesimal (0-9 untuk sisa 0-9 dan A-F untuk sisa 10-15).
  - Seperti fungsi sebelumnya, hasil dibangun menggunakan `StringBuilder`.

### 4. Fungsi `konversiPecahanKeHeksadesimal(double pecahan)`
```java
public static String konversiPecahanKeHeksadesimal(double pecahan) {
    StringBuilder heksadesimal = new StringBuilder();
    heksadesimal.append(".");
    int count = 0;
    while (pecahan > 0 && count < 4) { // Batasi hingga 4 digit
        pecahan *= 16;
        int digit = (int) pecahan;
        if (digit < 10) {
            heksadesimal.append(digit);
        } else {
            heksadesimal.append((char) ('A' + (digit - 10))); // A-F
        }
        pecahan -= digit;
        count++;
    }
    return heksadesimal.toString();
}
```
- **Deskripsi**: 
  - Fungsi ini mengonversi bagian pecahan desimal menjadi heksadesimal.
  - Seperti fungsi untuk biner, tetapi dikalikan dengan 16 untuk mendapatkan digit heksadesimal.
  - Prosesnya juga dibatasi hingga 4 digit.

### 5. Fungsi `parseSuhu(String input)`
```java
public static double parseSuhu(String input) {
    StringBuilder angka = new StringBuilder();
    for (char c : input.toCharArray()) {
        if (Character.isDigit(c) || c == '.') {
            angka.append(c);
        }
    }
    return Double.parseDouble(angka.toString());
}
```
- **Deskripsi**: 
  - Fungsi ini menghapus karakter non-digit dari input suhu dan mengonversi hasilnya menjadi tipe `double`.
  - Dengan menggunakan `StringBuilder`, fungsi ini mengumpulkan semua karakter yang valid (digit dan titik) dari input pengguna.

### 6. Fungsi `parseInput(String input)`
```java
public static int parseInput(String input) {
    StringBuilder angka = new StringBuilder();
    for (char c : input.toCharArray()) {
        if (Character.isDigit(c)) {
            angka.append(c);
        }
    }
    return Integer.parseInt(angka.toString());
}
```
- **Deskripsi**: 
  - Fungsi ini menghapus karakter non-digit dari input (seperti kelembapan dan CO2) dan mengonversi hasilnya menjadi tipe `int`.
  - Ini memastikan bahwa hanya angka yang diproses, menjaga agar program tetap robust terhadap input yang tidak valid.

## Fungsi `main`
```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US); // Menggunakan locale yang sesuai

    double suhu;
    int kelembapan, co2;

    // Mengambil input dari pengguna
    do {
        System.out.print("Masukkan suhu       : ");
        String inputSuhu = sc.nextLine();
        suhu = parseSuhu(inputSuhu); // Ambil angka dari input suhu
        
        System.out.print("Masukkan kelembapan : ");
        String inputKelembapan = sc.nextLine();
        kelembapan = parseInput(inputKelembapan); // Ambil angka dengan menghapus karakter non-digit
        
        System.out.print("Masukkan CO2        : ");
        String inputCO2 = sc.nextLine();
        co2 = parseInput(inputCO2); // Ambil angka dengan menghapus karakter non-digit
    } while (suhu < 0 || kelembapan < 0 || co2 < 0); // Memastikan input tidak negatif

    // Mengonversi dan menampilkan hasil
    System.out.println("\nData Sensor:");
    System.out.println("Suhu: " + suhu + "°C");
    System.out.println("Kelembapan: " + kelembapan + "%");
    System.out.println("CO2: " + co2 + "ppm");
    
    // Pisahkan bagian bulat dan pecahan suhu
    int bagianBulat = (int) suhu;
    double bagianPecahan = suhu - bagianBulat;

    // Mengonversi suhu
    System.out.println("\nSuhu dalam Biner: " + konversiDesimalKeBiner(bagianBulat) + konversiPecahanKeBiner(bagianPecahan));
    System.out.println("Suhu dalam Heksadesimal: " + konversiDesimalKeHeksadesimal(bagianBulat) + konversiPecahanKeHeksadesimal(bagianPecahan));

    // Mengonversi kelembapan
    System.out.println("Kelembapan dalam Biner: " + konversiDesimalKeBiner(kelembapan));
    System.out.println("Kelembapan dalam Heksadesimal: " + konversiDesimalKeHeksadesimal(kelembapan));

    // Mengonversi kadar CO2
    System.out.println("CO2 dalam Biner: " + konversiDesimalKeBiner(co2));
    System.out.println("CO2 dalam Heksadesimal: " + konversiDesimalKeHeksadesimal(co2));

    // Menutup scanner setelah selesai
    sc.close();
}
```
- **Deskripsi**: 
  - Fungsi utama yang menjalankan program.
  - Mengambil input dari pengguna untuk suhu, kelembapan, dan kadar CO2.
  - Melakukan valid

## Contoh Penggunaan

Program ini meminta pengguna untuk memasukkan suhu, kelembapan, dan kadar CO2. Setelah data diinput, program akan mengonversi nilai tersebut dan menampilkannya dalam format biner dan heksadesimal.

### Contoh Input dan Output
```
Masukkan suhu       : 28.6
Masukkan kelembapan : 65
Masukkan CO2        : 420

Data Sensor:
Suhu: 28.6°C
Kelembapan: 65%
CO2: 420ppm

Suhu dalam Biner: 11100.1001
Suhu dalam Heksadesimal: 1C.9

Kelembapan dalam Biner: 1000001
Kelembapan dalam Heksadesimal: 41

CO2 dalam Biner: 110100100
CO2 dalam Heksadesimal: 1A4
```

# Soal No.4

Berikut adalah dokumentasi lengkap untuk program `operasiEnkripsi4`

# Dokumentasi Program Operasi Enkripsi

Program ini mengimplementasikan enkripsi sederhana menggunakan operasi XOR pada dua bilangan biner. Program ini juga mengonversi hasil enkripsi dari desimal ke biner dan heksadesimal. Berikut adalah penjelasan setiap bagian kode secara rinci.

## Fungsi-Fungsi dalam Program

### 1. Fungsi `binerKeDesimal(String biner)`
```java
public static int binerKeDesimal(String biner) {
    int desimal = 0;
    for (int i = 0; i < biner.length(); i++) {
        char bit = biner.charAt(biner.length() - 1 - i);
        if (bit == '1') {
            desimal += 1 << i; // Menggunakan bitwise shift untuk menambahkan nilai
        }
    }
    return desimal;
}
```
- **Deskripsi**:
  - Fungsi ini mengonversi string biner ke bilangan desimal.
  - Iterasi dilakukan dari bit paling kanan ke kiri. Jika bit bernilai '1', nilai desimal akan ditambahkan menggunakan operasi bitwise shift (`1 << i`).
  - Hasil akhir adalah nilai desimal yang ekuivalen dengan bilangan biner yang diberikan.

### 2. Fungsi `desimalKeBiner(int desimal)`
```java
public static String desimalKeBiner(int desimal) {
    String biner = "";
    for (int i = 7; i >= 0; i--) {
        biner += (desimal & (1 << i)) != 0 ? '1' : '0';
    }
    return biner; // Mengembalikan string biner secara manual
}
```
- **Deskripsi**:
  - Fungsi ini mengonversi bilangan desimal ke dalam format biner 8-bit.
  - Menggunakan loop dari 7 hingga 0, memeriksa setiap bit dengan operasi bitwise AND. Jika bit bernilai 1, tambahkan '1' ke string, jika tidak tambahkan '0'.
  - Fungsi ini mengembalikan representasi biner sebagai string.

### 3. Fungsi `desimalKeHeksadesimal(int desimal)`
```java
public static String desimalKeHeksadesimal(int desimal) {
    String heksadesimal = ""; // Menggunakan string biasa
    
    // Mengganti penggunaan toCharArray()
    char[] heks = new char[16];
    heks[0] = '0';
    heks[1] = '1';
    heks[2] = '2';
    heks[3] = '3';
    heks[4] = '4';
    heks[5] = '5';
    heks[6] = '6';
    heks[7] = '7';
    heks[8] = '8';
    heks[9] = '9';
    heks[10] = 'A';
    heks[11] = 'B';
    heks[12] = 'C';
    heks[13] = 'D';
    heks[14] = 'E';
    heks[15] = 'F';

    if (desimal == 0) {
        return "0"; // Menangani kasus desimal 0
    }

    while (desimal > 0) {
        int remainder = desimal % 16;
        heksadesimal = heks[remainder] + heksadesimal; // Menambahkan karakter heksadesimal di depan
        desimal /= 16;
    }
    
    return heksadesimal; // Mengembalikan string heksadesimal secara manual
}
```
- **Deskripsi**:
  - Fungsi ini mengonversi bilangan desimal ke heksadesimal.
  - Menggunakan array karakter untuk menyimpan representasi heksadesimal (0-9 dan A-F).
  - Jika desimal adalah 0, fungsi akan mengembalikan "0".
  - Dalam loop, sisa dari pembagian desimal dengan 16 digunakan untuk mendapatkan karakter heksadesimal yang sesuai dan ditambahkan ke string hasil.

## Fungsi `main`
```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Menerima input dari pengguna
    System.out.print("Masukkan bilangan biner 1 (8 bit): ");
    String biner1 = sc.nextLine();
    System.out.print("Masukkan bilangan biner 2 (8 bit): ");
    String biner2 = sc.nextLine();
    System.out.print("Masukkan kunci enkripsi (8 bit): ");
    String kunci = sc.nextLine();

    // Mengonversi biner ke desimal
    int bilangan1 = binerKeDesimal(biner1);
    int bilangan2 = binerKeDesimal(biner2);
    int kunciDesimal = binerKeDesimal(kunci);

    // Melakukan operasi XOR
    int hasilEnkripsi1 = bilangan1 ^ kunciDesimal;
    int hasilEnkripsi2 = bilangan2 ^ kunciDesimal;

    // Mengonversi hasil enkripsi ke biner dan heksadesimal
    String binerHasil1 = desimalKeBiner(hasilEnkripsi1);
    String binerHasil2 = desimalKeBiner(hasilEnkripsi2);
    String heksadesimalHasil1 = desimalKeHeksadesimal(hasilEnkripsi1);
    String heksadesimalHasil2 = desimalKeHeksadesimal(hasilEnkripsi2);

    // Menampilkan hasil
    System.out.println("\nHasil Enkripsi:");
    System.out.println("Biner 1 setelah enkripsi: " + binerHasil1);
    System.out.println("Heksadesimal 1 setelah enkripsi: " + heksadesimalHasil1);
    System.out.println("Biner 2 setelah enkripsi: " + binerHasil2);
    System.out.println("Heksadesimal 2 setelah enkripsi: " + heksadesimalHasil2);

    // Menutup scanner setelah selesai
    sc.close();
}
```
- **Deskripsi**:
  - Fungsi `main` adalah titik awal dari program.
  - Menerima input dari pengguna untuk dua bilangan biner dan satu kunci enkripsi, semuanya dalam format 8-bit.
  - Bilangan biner diubah menjadi desimal menggunakan fungsi `binerKeDesimal`.
  - Operasi enkripsi dilakukan dengan XOR antara bilangan biner dan kunci.
  - Hasil enkripsi kemudian dikonversi kembali ke biner dan heksadesimal.
  - Hasil akhir ditampilkan kepada pengguna.
  - Scanner ditutup setelah semua proses selesai untuk mencegah kebocoran sumber daya.

## Penggunaan

Program ini meminta pengguna untuk memasukkan dua bilangan biner (masing-masing 8 bit) dan kunci enkripsi (juga 8 bit). Setelah data diinput, program akan mengenkripsi bilangan tersebut dan menampilkan hasilnya dalam format biner dan heksadesimal.


### Input dan Output
```
Masukkan bilangan biner 1 (8 bit): 01101100
Masukkan bilangan biner 2 (8 bit): 11010110
Masukkan kunci enkripsi (8 bit): 10101010

Hasil Enkripsi:
Biner 1 setelah enkripsi: 11000110
Heksadesimal 1 setelah enkripsi: C6
Biner 2 setelah enkripsi: 01111100
Heksadesimal 2 setelah enkripsi: 7C
```
