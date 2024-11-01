# UTS MatDas

Nama    : Helmi Rizqi Ramadhan  
NIM     : 244107020107  
Kelas   : TI-1H


## Nomor 4 "Operasi Enkripsi"

Kode program ini ditulis dalam bahasa Java dan berfungsi untuk mengenkripsi dua bilangan biner menggunakan metode XOR dengan kunci biner. Program ini mengambil input dari pengguna, melakukan enkripsi, dan menampilkan hasil dalam format biner dan heksadesimal.

## Import dan Deklarasi Kelas

```java
import java.util.Scanner;

public class utsn4 {
    public static void main(String[] args) {
```

- **`import java.util.Scanner;`**: Mengimpor kelas `Scanner` dari paket `java.util`, yang digunakan untuk mengambil input dari pengguna.
- **`public class utsn4`**: Mendefinisikan kelas publik bernama `utsn4`.
- **`public static void main(String[] args)`**: Metode `main` adalah titik masuk utama program. Setiap program Java membutuhkan metode ini untuk dieksekusi.

## Inisialisasi Scanner dan Input Data

```java
Scanner sucrose = new Scanner(System.in);

// Input bilangan biner pertama, kedua, dan kunci
System.out.print("Masukkan bilangan biner pertama: ");
String biner1 = sucrose.nextLine();
System.out.print("Masukkan bilangan biner kedua: ");
String biner2 = sucrose.nextLine();
System.out.print("Masukkan kunci enkripsi (biner): ");
String kunci = sucrose.nextLine();
```

- **`Scanner sucrose = new Scanner(System.in);`**: Membuat objek `Scanner` yang bernama `sucrose` untuk membaca input dari konsol.
- Menggunakan `System.out.print` untuk meminta pengguna memasukkan dua bilangan biner dan kunci enkripsi.
- **`String biner1 = sucrose.nextLine();`**: Mengambil input bilangan biner pertama sebagai string.
- **`String biner2 = sucrose.nextLine();`**: Mengambil input bilangan biner kedua sebagai string.
- **`String kunci = sucrose.nextLine();`**: Mengambil input kunci enkripsi sebagai string.

## Proses Enkripsi dan Output

```java
for (String biner : new String[]{biner1, biner2}) {
    StringBuilder hasilBiner = new StringBuilder();
    String heksadesimal = "";
```

- **`for (String biner : new String[]{biner1, biner2})`**: Loop ini iterasi melalui dua bilangan biner yang dimasukkan oleh pengguna.
- **`StringBuilder hasilBiner = new StringBuilder();`**: Menginisialisasi objek `StringBuilder` untuk menyimpan hasil enkripsi dalam format biner.
- **`String heksadesimal = "";`**: Menginisialisasi string untuk menyimpan hasil konversi ke heksadesimal.

### Operasi XOR dan Konversi

```java
for (int i = 0; i < biner.length(); i++) {
    // Operasi XOR
    char bit = biner.charAt(i);
    char keyBit = kunci.charAt(i);
    char xorResult = (bit == keyBit) ? '0' : '1';
    hasilBiner.append(xorResult);
```

- **`for (int i = 0; i < biner.length(); i++)`**: Loop untuk iterasi setiap bit dalam bilangan biner.
- **`char bit = biner.charAt(i);`**: Mengambil bit saat ini dari bilangan biner.
- **`char keyBit = kunci.charAt(i);`**: Mengambil bit kunci yang sesuai.
- **`char xorResult = (bit == keyBit) ? '0' : '1';`**: Melakukan operasi XOR. Jika bit sama, hasilnya '0'; jika berbeda, hasilnya '1'.
- **`hasilBiner.append(xorResult);`**: Menambahkan hasil XOR ke `StringBuilder` hasilBiner.

### Konversi ke Heksadesimal

```java
// Setiap 4 bit, konversi ke heksadesimal
if ((i + 1) % 4 == 0) {
    int nilai = 0;
    if (hasilBiner.charAt(i - 3) == '1') nilai += 8;
    if (hasilBiner.charAt(i - 2) == '1') nilai += 4;
    if (hasilBiner.charAt(i - 1) == '1') nilai += 2;
    if (hasilBiner.charAt(i) == '1') nilai += 1;

    heksadesimal += (nilai < 10) ? (char) ('0' + nilai) : (char) ('A' + (nilai - 10));
}
```

- Setiap 4 bit dari hasil biner dikonversi menjadi heksadesimal.
- **`int nilai = 0;`**: Menginisialisasi variabel untuk menyimpan nilai desimal dari 4 bit.
- Menggunakan serangkaian `if` untuk memeriksa setiap bit dan menambahkan nilai sesuai dengan posisi bit.
- **`heksadesimal += (nilai < 10) ? (char) ('0' + nilai) : (char) ('A' + (nilai - 10));`**: Mengonversi nilai desimal ke karakter heksadesimal dan menambahkannya ke string heksadesimal.

## Mencetak Hasil Enkripsi

```java
// Cetak hasil enkripsi dalam format biner dan heksadesimal
System.out.println("\nHasil Enkripsi untuk bilangan biner " + biner + ":");
System.out.println("Biner: " + hasilBiner);
System.out.println("Heksadesimal: " + heksadesimal);
```

- Mencetak hasil enkripsi untuk setiap bilangan biner yang dimasukkan, termasuk hasil dalam format biner dan heksadesimal.

## Menutup Program

```java
sucrose.close();
```

- Menutup objek `Scanner` untuk mencegah kebocoran memori.

## Kesimpulan

Program ini mengenkripsi dua bilangan biner menggunakan operasi XOR dengan kunci biner, kemudian mengonversi hasil enkripsi ke dalam format biner dan heksadesimal. Program ini menunjukkan penggunaan dasar pengolahan string, loop, dan operasi bit dalam Java.
