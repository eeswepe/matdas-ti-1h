Berikut adalah penjelasan dari setiap fungsi di kode di atas, lengkap dengan baris kode yang mewakili:

---

### 1. `main` Method
Fungsi `main` adalah titik awal eksekusi program. Di sini, data dari sensor (suhu, kelembapan, dan CO2) didefinisikan dalam variabel, lalu dikonversi ke format biner dan heksadesimal menggunakan fungsi-fungsi tambahan (`toBinary` dan `toHexadecimal`). Hasil konversi ditampilkan di konsol.

```java
public static void main(String[] args) {
    // Data sensor
    double suhu = 28.6;
    int kelembapan = 65;
    int co2 = 420;

    System.out.println("Data Sensor:");
    System.out.println("Suhu: " + suhu + " °C");
    System.out.println("Kelembapan: " + kelembapan + " %");
    System.out.println("CO2: " + co2 + " ppm");

    // Konversi suhu ke biner dan heksadesimal
    String suhuBiner = toBinary((int) suhu);
    String suhuHex = toHexadecimal((int) suhu);

    // Konversi kelembapan ke biner dan heksadesimal
    String kelembapanBiner = toBinary(kelembapan);
    String kelembapanHex = toHexadecimal(kelembapan);

    // Konversi CO2 ke biner dan heksadesimal
    String co2Biner = toBinary(co2);
    String co2Hex = toHexadecimal(co2);

    // Tampilkan hasil konversi
    System.out.println("\nHasil Konversi:");
    System.out.println("Suhu dalam Biner: " + suhuBiner);
    System.out.println("Suhu dalam Hexadesimal: " + suhuHex);
    System.out.println("Kelembapan dalam Biner: " + kelembapanBiner);
    System.out.println("Kelembapan dalam Hexadesimal: " + kelembapanHex);
    System.out.println("CO2 dalam Biner: " + co2Biner);
    System.out.println("CO2 dalam Hexadesimal: " + co2Hex);
}
```

---

### 2. `toBinary` Method
Fungsi `toBinary` mengonversi angka desimal (`int num`) menjadi representasi biner dalam bentuk `String`. Pengulangan dilakukan dengan membagi angka secara berturut-turut hingga hasilnya nol, dan hasilnya dikumpulkan dalam urutan terbalik.

```java
public static String toBinary(int num) {
    StringBuilder binary = new StringBuilder();
    while (num > 0) {
        binary.insert(0, num % 2);
        num = num / 2;
    }
    return binary.length() > 0 ? binary.toString() : "0";
}
```

- **`StringBuilder binary = new StringBuilder();`** - Membuat objek `StringBuilder` untuk menyimpan hasil konversi.
- **`binary.insert(0, num % 2);`** - Menambahkan hasil modulus (`0` atau `1`) ke posisi pertama.
- **`num = num / 2;`** - Memperbarui `num` dengan membagi nilai saat ini dengan 2.
- **`return binary.length() > 0 ? binary.toString() : "0";`** - Mengembalikan hasil konversi atau "0" jika input adalah nol.

---

### 3. `toHexadecimal` Method
Fungsi `toHexadecimal` mengonversi angka desimal (`int num`) ke representasi heksadesimal dalam bentuk `String`. Pengulangan dilakukan dengan membagi angka dengan 16 secara berturut-turut, dan nilai sisanya dikonversi ke karakter heksadesimal.

```java
public static String toHexadecimal(int num) {
    StringBuilder hex = new StringBuilder();
    char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    while (num > 0) {
        hex.insert(0, hexChars[num % 16]);
        num = num / 16;
    }
    return hex.length() > 0 ? hex.toString() : "0";
}
```

- **`StringBuilder hex = new StringBuilder();`** - Membuat objek `StringBuilder` untuk menyimpan hasil konversi.
- **`char[] hexChars = {...};`** - Mendefinisikan array karakter heksadesimal.
- **`hex.insert(0, hexChars[num % 16]);`** - Menyisipkan karakter heksadesimal ke awal hasil konversi.
- **`num = num / 16;`** - Memperbarui `num` dengan membagi nilai saat ini dengan 16.
- **`return hex.length() > 0 ? hex.toString() : "0";`** - Mengembalikan hasil konversi atau "0" jika input adalah nol.