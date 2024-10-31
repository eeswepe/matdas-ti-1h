Berikut adalah penjelasan setiap fungsi dari kode Java di atas, lengkap dengan baris kode yang mewakili fungsi tersebut dalam format markdown.

### Penjelasan Kode

#### Fungsi `main`
Fungsi `main` adalah titik masuk program. Di dalamnya, kita mendeklarasikan variabel untuk suhu, kelembapan, dan CO2. Kemudian, kita mengonversi nilai-nilai ini ke format biner dan heksadesimal, dan menampilkan hasilnya.

```java
public static void main(String[] args) {
    // Data sensor
    double suhu = 28.6;
    int kelembapan = 65;
    int co2 = 420;

    // Konversi ke biner
    String suhuBiner = decimalToBinary(suhu);
    String kelembapanBiner = decimalToBinary(kelembapan);
    String co2Biner = decimalToBinary(co2);

    // Konversi ke heksadesimal
    String suhuHex = decimalToHex(suhu);
    String kelembapanHex = decimalToHex(kelembapan);
    String co2Hex = decimalToHex(co2);

    // Tampilkan hasil
    System.out.println("Suhu:");
    System.out.println("Desimal: " + suhu);
    System.out.println("Biner: " + suhuBiner);
    System.out.println("Hexadecimal: " + suhuHex);
    
    System.out.println("\nKelembapan:");
    System.out.println("Desimal: " + kelembapan);
    System.out.println("Biner: " + kelembapanBiner);
    System.out.println("Hexadecimal: " + kelembapanHex);
    
    System.out.println("\nCO2:");
    System.out.println("Desimal: " + co2);
    System.out.println("Biner: " + co2Biner);
    System.out.println("Hexadecimal: " + co2Hex);
}
```

#### Fungsi `decimalToBinary`
Fungsi ini mengonversi angka desimal (baik integer maupun fraksional) menjadi format biner. Ia membagi bagian integer dan fraksional dan mengonversi masing-masing ke biner.

```java
private static String decimalToBinary(double decimal) {
    // Konversi bagian integer
    long integerPart = (long) decimal;
    String integerBinary = "";
    while (integerPart > 0) {
        integerBinary = (integerPart % 2) + integerBinary;
        integerPart /= 2;
    }

    // Konversi bagian fraksional
    double fractionalPart = decimal - (long) decimal;
    String fractionalBinary = ".";
    for (int i = 0; i < 8; i++) {
        fractionalPart *= 2;
        if (fractionalPart >= 1) {
            fractionalBinary += "1";
            fractionalPart -= 1;
        } else {
            fractionalBinary += "0";
        }
    }

    return integerBinary + fractionalBinary;
}
```

#### Fungsi `decimalToHex`
Fungsi ini mengonversi angka desimal (baik integer maupun fraksional) menjadi format heksadesimal. Sama seperti `decimalToBinary`, ia membagi bagian integer dan fraksional untuk konversi.

```java
private static String decimalToHex(double decimal) {
    // Konversi bagian integer
    long integerPart = (long) decimal;
    String integerHex = "";
    while (integerPart > 0) {
        char hexChar = (char) ((integerPart % 16) + '0');
        if (hexChar > '9') {
            hexChar = (char) (hexChar + 'A' - '9' - 1);
        }
        integerHex = hexChar + integerHex;
        integerPart /= 16;
    }

    // Konversi bagian fraksional
    double fractionalPart = decimal - (long) decimal;
    String fractionalHex = ".";
    for (int i = 0; i < 4; i++) {
        fractionalPart *= 16;
        char hexChar = (char) ((long) fractionalPart + '0');
        if (hexChar > '9') {
            hexChar = (char) (hexChar + 'A' - '9' - 1);
        }
        fractionalHex += hexChar;
        fractionalPart -= (long) fractionalPart;
    }

    return integerHex + fractionalHex;
}
```

### Kesimpulan
Program ini bertujuan untuk mengonversi nilai suhu, kelembapan, dan CO2 dari desimal ke biner dan heksadesimal, serta menampilkan hasilnya dengan format yang mudah dibaca.