# Tugas Ujian Tengah Semester.
#### Nama: Sahrul Ramadhani
#### NIM : 244107020058
#### Kelas: TI 1H

# Bagian 1: Sistem Bilangan

### 1. Konversi Bilangan
Tugas ini melibatkan pembuatan program yang melakukan konversi antar berbagai sistem bilangan.
- **Desimal ke Biner dan Heksadesimal**: Ubah bilangan desimal `450` ke dalam sistem biner dan heksadesimal.

<img src="image/1point1.png" alt="desimalconverse" width="410">

- **Biner ke Desimal dan Heksadesimal**: Ubah bilangan biner `11011000` ke dalam sistem desimal dan heksadesimal.
<img src="image/1point2.png" alt="binerconverse" width="450">

- **Heksadesimal ke Desimal dan Biner**: Ubah bilangan heksadesimal `1F4` ke dalam sistem desimal dan biner.
<img src="image/1point3.png" alt="binerconverse" width="450">

Program yang dibuat harus menampilkan hasil dari masing-masing konversi ini untuk memudahkan pemahaman.

## Source Code Nomor 1 (Atau bisa anda lihat di File "Source Code"): 
```java
import java.util.Scanner;

public class Soal1 {

    public static int binerKeDesimalManual(String biner) {
        int desimal = 0;
        int panjang = biner.length();

        for (int i = 0; i < panjang; i++) {
            char bit = biner.charAt(panjang - i - 1); 
            if (bit == '1') {
                desimal += Math.pow(2, i); 
            }
        }
        return desimal;
    }

    public static String desimalKeBinerManual(int desimal) {
        StringBuilder biner = new StringBuilder();
        
        while (desimal > 0) {
            int sisa = desimal % 2; 
            biner.insert(0, sisa);
            desimal /= 2; 
        }
        
        return biner.length() > 0 ? biner.toString() : "0";
    }

    public static String desimalKeHexadesimalManual(int desimal) {
        StringBuilder hexa = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        while (desimal > 0) {
            int sisa = desimal % 16;   
            hexa.insert(0, hexChars[sisa]); 
            desimal /= 16;             
        }
        
        return hexa.length() > 0 ? hexa.toString() : "0";
    }

    public static int hexadesimalKeDesimalManual(String hexa) {
        int desimal = 0;
        int panjang = hexa.length();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        for (int i = 0; i < panjang; i++) {
            char digit = hexa.charAt(panjang - i - 1);  
            for (int j = 0; j < hexChars.length; j++) {
                if (digit == hexChars[j]) {
                    desimal += j * Math.pow(16, i);
                    break;
                }
            }
        }
        return desimal;
    }
    public static String binerKeHexadesimalManual(String biner) {
        int desimal = binerKeDesimalManual(biner);
        return desimalKeHexadesimalManual(desimal);
    }

    public static String hexadesimalKeBinerManual(String hexa) {
        int desimal = hexadesimalKeDesimalManual(hexa);
        return desimalKeBinerManual(desimal); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (;;) {
        System.out.println("Pilih jenis konversi:");
        System.out.println("1. Biner ke Desimal dan Heksadesimal");
        System.out.println("2. Desimal ke Biner dan Heksadesimal");
        System.out.println("3. Heksadesimal ke Biner dan Desimal");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); 

        switch (pilihan) {
            case 1 -> {
                System.out.print("Masukkan bilangan biner: ");
                String biner = scanner.nextLine();
                System.out.println("Desimal: " + binerKeDesimalManual(biner));
                System.out.println("Heksadesimal: " + binerKeHexadesimalManual(biner));
                System.out.println("===============================================");
            }
            case 2 -> {
                System.out.print("Masukkan bilangan desimal: ");
                int desimal = scanner.nextInt();
                System.out.println("Biner: " + desimalKeBinerManual(desimal));
                System.out.println("Heksadesimal: " + desimalKeHexadesimalManual(desimal));
                System.out.println("===============================================");
            }
            case 3 -> {
                System.out.print("Masukkan bilangan heksadesimal: ");
                String hexa = scanner.nextLine();
                System.out.println("Biner: " + hexadesimalKeBinerManual(hexa));
                System.out.println("Desimal: " + hexadesimalKeDesimalManual(hexa));
                System.out.println("===============================================");
            }
            default -> System.out.println("Pilihan tidak valid.");
        }
        }
    }
}

```
### 2. Operasi Bilangan Biner
Pada tugas ini, Anda diminta membuat program untuk melakukan berbagai operasi dasar pada bilangan biner:
- **Penjumlahan**: Tambahkan bilangan biner `110101` dan `10111`.
<img src="image/2point1.png" alt="penjumlahanbiner" width="450">
- **Pengurangan**: Kurangkan bilangan biner `111001` dengan `10101`.
<img src="image/2point2.png" alt="penjumlahanbiner" width="450">
- **Perkalian**: Kalikan bilangan biner `1011` dengan `110`.
<img src="image/2point3.png" alt="penjumlahanbiner" width="450">
- **Operasi Bitwise (AND, OR, XOR)**: Lakukan operasi AND, OR, dan XOR pada bilangan biner `101011` dan `110101`.
<img src="image/2point4.png" alt="XOR" width="450">

Program ini akan membantu memahami operasi dasar aritmatika dan logika dalam sistem biner.

## Source Code Nomor 2 (Atau bisa anda lihat di File "Source Code"): 
```java
import java.util.Scanner;

public class Soal2 {

    // Metode untuk menjumlahkan dua bilangan biner
    public static String tambahBiner(String biner1, String biner2) {
        StringBuilder hasil = new StringBuilder();
        int panjang1 = biner1.length();
        int panjang2 = biner2.length();
        
        int i = panjang1 - 1;
        int j = panjang2 - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int bit1 = (i >= 0) ? biner1.charAt(i--) - '0' : 0;
            int bit2 = (j >= 0) ? biner2.charAt(j--) - '0' : 0;

            int jumlah = bit1 + bit2 + carry;
            hasil.insert(0, jumlah % 2);
            carry = jumlah / 2;
        }
        return hasil.toString();
    }

    // Metode untuk mengurangi dua bilangan biner
    public static String kurangiBiner(String biner1, String biner2) {
        StringBuilder hasil = new StringBuilder();
        int panjang1 = biner1.length();
        int panjang2 = biner2.length();
        
        int i = panjang1 - 1;
        int j = panjang2 - 1;
        int borrow = 0;

        while (i >= 0 || j >= 0) {
            int bit1 = (i >= 0) ? biner1.charAt(i--) - '0' : 0;
            int bit2 = (j >= 0) ? biner2.charAt(j--) - '0' : 0;

            bit1 -= borrow;
            if (bit1 < bit2) {
                bit1 += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }
            hasil.insert(0, bit1 - bit2);
        }

        while (hasil.length() > 1 && hasil.charAt(0) == '0') {
            hasil.deleteCharAt(0);
        }
        
        return hasil.toString();
    }

    // Metode untuk mengalikan dua bilangan biner
    public static String kaliBiner(String biner1, String biner2) {
        String hasil = "0";
        int panjang2 = biner2.length();

        for (int i = panjang2 - 1; i >= 0; i--) {
            if (biner2.charAt(i) == '1') {
                hasil = tambahBiner(hasil, biner1 + "0".repeat(panjang2 - 1 - i));
            }
        }
        
        return hasil;
    }

    // Metode untuk melakukan operasi bitwise
    public static void operasiBitwise(String biner1, String biner2) {
        int num1 = Integer.parseInt(biner1, 2);
        int num2 = Integer.parseInt(biner2, 2);

        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;

        System.out.println("Hasil Operasi Bitwise:");
        System.out.println("AND: " + Integer.toBinaryString(andResult) + " (Desimal: " + andResult + ")");
        System.out.println("OR: " + Integer.toBinaryString(orResult) + " (Desimal: " + orResult + ")");
        System.out.println("XOR: " + Integer.toBinaryString(xorResult) + " (Desimal: " + xorResult + ")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis operasi biner:");
        System.out.println("1. Penjumlahan Biner");
        System.out.println("2. Pengurangan Biner");
        System.out.println("3. Perkalian Biner");
        System.out.println("4. Operasi Bitwise (AND, OR, XOR)");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();  // Mengonsumsi newline

        switch (pilihan) {
            case 1 -> {
                System.out.print("Masukkan bilangan biner pertama: ");
                String biner1 = scanner.nextLine();
                System.out.print("Masukkan bilangan biner kedua: ");
                String biner2 = scanner.nextLine();
                System.out.println("Hasil Penjumlahan: " + tambahBiner(biner1, biner2));
            }
            case 2 -> {
                System.out.print("Masukkan bilangan biner pertama: ");
                String biner1 = scanner.nextLine();
                System.out.print("Masukkan bilangan biner kedua: ");
                String biner2 = scanner.nextLine();
                System.out.println("Hasil Pengurangan: " + kurangiBiner(biner1, biner2));
            }
            case 3 -> {
                System.out.print("Masukkan bilangan biner pertama: ");
                String biner1 = scanner.nextLine();
                System.out.print("Masukkan bilangan biner kedua: ");
                String biner2 = scanner.nextLine();
                System.out.println("Hasil Perkalian: " + kaliBiner(biner1, biner2));
            }
            case 4 -> {
                System.out.print("Masukkan bilangan biner pertama: ");
                String biner1 = scanner.nextLine();
                System.out.print("Masukkan bilangan biner kedua: ");
                String biner2 = scanner.nextLine();
                operasiBitwise(biner1, biner2);
            }
            default -> System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}

```
# Bagian 2: Aplikasi Sistem Bilangan

### 3. Pengolahan Data Sensor
Tugas ini mensimulasikan pengolahan data dari sensor dalam format desimal, biner, dan heksadesimal:
- **Data Sensor yang Diberikan**:
  - Suhu: `28.6 °C`
  - Kelembapan: `65 %`
  - CO2: `420 ppm`
  <img src="image/3point1.png" alt="data sensor"  width="600">

# Source Code Nomor 3 (Atau bisa anda lihat di File "Source Code"): 
```java 
import java.util.Scanner;

public class Soal3 {

    public static String desimalKeBinerManual(int desimal) {
        StringBuilder biner = new StringBuilder();
        
        while (desimal > 0) {
            int sisa = desimal % 2; 
            biner.insert(0, sisa);
            desimal /= 2; 
        }
        
        return biner.length() > 0 ? biner.toString() : "0";
    }

    public static String desimalKeHexadesimalManual(int desimal) {
        StringBuilder hexa = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        while (desimal > 0) {
            int sisa = desimal % 16;   
            hexa.insert(0, hexChars[sisa]); 
            desimal /= 16;             
        }
        
        return hexa.length() > 0 ? hexa.toString() : "0";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Suhu Udara Saat ini (°C)=  ");
        String suhuInput = scanner.nextLine().replace("°C", "").trim();
        double suhu = Double.parseDouble(suhuInput); 
        int suhuBulat = (int) Math.round(suhu);
        System.out.print("Kelembapan Saat ini (%) = ");
        String kelembapanInput = scanner.nextLine().replace("%", "").trim();
        int kelembapan = Integer.parseInt(kelembapanInput);
        System.out.print("CO2 Saat ini (ppm) = ");
        String co2Input = scanner.nextLine().replace("ppm", "").trim();
        int CO2 = Integer.parseInt(co2Input); 

        System.out.println("===============================================");
        System.out.println("Suhu Saat ini Adalah = ");
        System.out.println("Biner: " + desimalKeBinerManual(suhuBulat) + " °C");
        System.out.println("Heksadesimal: " + desimalKeHexadesimalManual(suhuBulat) +" °C");
        System.out.println("===============================================");
        System.out.println("Kelembapan Saat ini Adalah = ");
        System.out.println("Biner: " + desimalKeBinerManual(kelembapan) + " %");
        System.out.println("Heksadesimal: " + desimalKeHexadesimalManual(kelembapan) +" %");
        System.out.println("===============================================");
        System.out.println("CO2 Saat ini Adalah = ");
        System.out.println("Biner: " + desimalKeBinerManual(CO2) + " ppm");
        System.out.println("Heksadesimal: " + desimalKeHexadesimalManual(CO2) +" ppm");
        System.out.println("===============================================");
        }
        }


```

## Bagian 3: Enkripsi dan Keamanan

### 4. Operasi Enkripsi
Tugas ini berfokus pada enkripsi sederhana menggunakan operasi XOR:
- **Bilangan Biner yang Diberikan**:
  - Bilangan 1: `01101100`
  - Bilangan 2: `11010110`
- **Kunci Enkripsi**: Gunakan kunci `10101010` untuk melakukan operasi XOR pada kedua bilangan biner tersebut.
- **Hasil Enkripsi**: Program harus menampilkan hasil enkripsi dalam format biner dan heksadesimal.
<img src="image/4point1.png" alt="penjumlahanbiner" width="450">

# Source Code Nomor 4 (Atau bisa anda lihat di File "Source Code"): 
```java
import java.util.Scanner;

public class Soal4 {

    public static String enkripsiXOR(String biner1, String biner2) {
        StringBuilder hasil = new StringBuilder();
        int panjang = Math.max(biner1.length(), biner2.length());

        while (biner1.length() < panjang) {
            biner1 = "0" + biner1;
        }
        while (biner2.length() < panjang) {
            biner2 = "0" + biner2;
        }
        for (int i = 0; i < panjang; i++) {
            char bit1 = biner1.charAt(i);
            char bit2 = biner2.charAt(i);
            hasil.append((bit1 == bit2) ? '0' : '1');
        }

        return hasil.toString();
    }

    public static int binerKeDesimalManual(String biner) {
        int desimal = 0;
        int panjang = biner.length();

        for (int i = 0; i < panjang; i++) {
            char bit = biner.charAt(panjang - i - 1);
            if (bit == '1') {
                desimal += Math.pow(2, i);
            }
        }
        return desimal;
    }

    public static String desimalKeHexadesimalManual(int desimal) {
        StringBuilder hexa = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (desimal > 0) {
            int sisa = desimal % 16;
            hexa.insert(0, hexChars[sisa]);
            desimal /= 16;
        }

        return hexa.length() > 0 ? hexa.toString() : "0";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kunci = "10101010";
        System.out.print("Masukkan bilangan biner pertama: ");
        String biner1 = scanner.nextLine();
        System.out.print("Masukkan bilangan biner kedua: ");
        String biner2 = scanner.nextLine();
        String hasilEnkripsi1 = enkripsiXOR(biner1, kunci);
        String hasilEnkripsi2 = enkripsiXOR(biner2, kunci);
        int desimal1 = binerKeDesimalManual(hasilEnkripsi1);
        int desimal2 = binerKeDesimalManual(hasilEnkripsi2);

        System.out.println("Hasil Enkripsi Bilangan Biner Pertama: " + hasilEnkripsi1);
        System.out.println("Hasil Enkripsi Bilangan Biner Pertama (Desimal): " + desimal1);
        System.out.println("Hasil Enkripsi Bilangan Biner Pertama (Heksadesimal): " + desimalKeHexadesimalManual(desimal1));
        System.out.println("===============================================");
        System.out.println("Hasil Enkripsi Bilangan Biner Kedua: " + hasilEnkripsi2);
        System.out.println("Hasil Enkripsi Bilangan Biner Kedua (Desimal): " + desimal2);
        System.out.println("Hasil Enkripsi Bilangan Biner Kedua (Heksadesimal): " + desimalKeHexadesimalManual(desimal2));

        scanner.close();
    }
}
```

### Terima kasih sudah memeriksa sampai akhir Laporan ya bapak..