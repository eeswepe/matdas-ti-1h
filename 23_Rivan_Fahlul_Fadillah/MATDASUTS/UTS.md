# UTS MATDAS

## NAMA  : Rivan Fahlul Fadillah 
## NIM   : 244107020239
## KELAS : TI 1H

## No.1.
### A.
```
import java.util.Scanner;
    public class KonversiBilangan1 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
}
```
`import java.util.Scanner;`
Kegunaan: Mengimpor kelas Scanner dari paket java.util. Kelas ini digunakan untuk membaca input dari berbagai sumber, seperti keyboard.
`public class KonversiBilangan1 {`
Kegunaan: Mendeklarasikan kelas publik dengan nama KonversiBilangan1. Kelas ini merupakan unit dasar dari program Java di mana kode dan metode lainnya akan didefinisikan.  
`public static void main(String[] args) {`     
Kegunaan: Mendeklarasikan metode main, yang merupakan titik awal eksekusi program Java. Setiap aplikasi Java harus memiliki metode ini untuk dijalankan.
`Scanner sc = new Scanner(System.in);`
Kegunaan: Membuat objek Scanner bernama sc untuk membaca input dari konsol (keyboard). System.in adalah aliran input standar yang digunakan untuk menerima input dari pengguna.
#
```
System.out.print("Masukkan angka dalam desimal: ");
                int desimal = sc.nextInt();
        
                // Konversi desimal ke biner
                char[] biner = new char[32]; // Maksimal 32 bit untuk biner
                int indexBiner = 0;
        
                if (desimal == 0) {
                    biner[indexBiner++] = '0';
                } else {
                    while (desimal > 0) {
                        biner[indexBiner++] = (char) ('0' + (desimal % 2)); // Simpan biner
                        desimal /= 2; // Bagi desimal dengan 2
                    }
                }
```
`System.out.print(...):` Mencetak pesan ke konsol untuk meminta pengguna memasukkan angka dalam format desimal.  
`int desimal = sc.nextInt();:` Menggunakan objek Scanner (sc) untuk membaca input dari pengguna dan menyimpannya dalam variabel desimal bertipe int.
`char[] biner = new char[32];:` Membuat array karakter biner dengan kapasitas 32 elemen. Ini akan digunakan untuk menyimpan representasi biner dari angka desimal. 32 bit cukup untuk mewakili bilangan bulat dalam tipe data int di Java.  
`int indexBiner = 0;:` Mendeklarasikan dan menginisialisasi variabel indexBiner untuk melacak posisi saat menambahkan karakter biner ke dalam array.  
`if (desimal == 0):` Memeriksa apakah nilai desimal yang dimasukkan pengguna adalah 0.  
`biner[indexBiner++] = '0';:` Jika desimal adalah 0, menyimpan karakter '0' pada indeks saat ini dalam array biner, kemudian meningkatkan indexBiner untuk posisi berikutnya.  
`else { ... }:` Jika desimal tidak 0, maka masuk ke blok ini untuk mengonversi nilai desimal ke biner.  
`while (desimal > 0) { ... }:` Menggunakan loop while untuk terus melakukan konversi selama nilai desimal lebih besar dari 0.
biner[indexBiner++] = (char) ('0' + (desimal % 2));:
desimal % 2 menghasilkan sisa pembagian desimal dengan 2 (0 atau 1). Ini mewakili bit terkecil dari biner.

```
System.out.print("Biner: ");
                for (int i = indexBiner - 1; i >= 0; i--) {
                    System.out.print(biner[i]);
                }
                System.out.println();
        
                // Reset desimal untuk konversi ke heksadesimal
                System.out.print("Masukkan angka dalam desimal untuk heksadesimal: ");
                desimal = sc.nextInt();
                
                char[] heksadesimal = new char[8]; // Maksimal 8 karakter untuk heksadesimal
                int indexHeksadesimal = 0;
```
`System.out.print(...):` Mencetak teks "Biner: " ke konsol untuk memberi tahu pengguna bahwa hasil konversi biner akan ditampilkan segera setelahnya.  
`for (int i = indexBiner - 1; i >= 0; i--) { ... }:` Menggunakan loop for untuk iterasi dari indeks terakhir dari array biner hingga indeks pertama (0).    
`System.out.print(biner[i]);:` Mencetak karakter biner pada indeks i ke konsol, sehingga hasilnya ditampilkan dalam urutan yang benar.  
`desimal = sc.nextInt();:` Membaca input dari pengguna (angka desimal) dan menyimpannya kembali ke dalam variabel desimal.                            
`int indexHeksadesimal = 0;:` Mendeklarasikan dan menginisialisasi variabel indexHeksadesimal untuk melacak posisi saat menambahkan karakter heksadesimal ke dalam array.

```
 if (desimal == 0) {
                    heksadesimal[indexHeksadesimal++] = '0';
                } else {
                    while (desimal > 0) {
                        int sisa = desimal % 16; // Sisa bagi
                        if (sisa < 10) {
                            heksadesimal[indexHeksadesimal++] = (char) ('0' + sisa);
                        } else {
                            heksadesimal[indexHeksadesimal++] = (char) ('A' + (sisa - 10)); // Untuk A-F
                        }
                        desimal /= 16; // Bagi desimal dengan 16
                    }
                }
```
`if (desimal == 0):` Memeriksa apakah nilai desimal yang diberikan sama dengan 0. Jika ya, maka langsung menyimpan '0' sebagai representasi heksadesimal.
`heksadesimal[indexHeksadesimal++] = '0';:` Menyimpan karakter '0' ke dalam array heksadesimal pada indeks indexHeksadesimal, kemudian menaikkan nilai indexHeksadesimal sebesar 1 untuk persiapan penulisan berikutnya.  
`else:`ika nilai desimal lebih besar dari 0, proses konversi ke heksadesimal dilanjutkan.
`while (desimal > 0):`Loop ini akan berjalan selama nilai desimal lebih besar dari 0. Pada setiap iterasi, kita akan menghitung sisa bagi untuk mendapatkan digit heksadesimal.  
`int sisa = desimal % 16;:` Menghitung sisa hasil bagi dari desimal dibagi 16. Ini memberikan digit terakhir dari angka heksadesimal.  
`if (sisa < 10):` Memeriksa apakah sisa kurang dari 10. Jika benar, berarti kita dapat menyimpan angka 0-9 sebagai karakter.  
`heksadesimal[indexHeksadesimal++] = (char) ('0' + sisa);:` Jika sisa adalah angka (0-9), kita mengonversinya ke karakter dengan menambahkan '0'. Misalnya, jika sisa adalah 3, maka karakter yang dihasilkan adalah '3'.  
`else:` Jika sisa adalah 10 atau lebih (yaitu 10 hingga 15), kita menangani kasus untuk karakter A hingga F.  
`heksadesimal[indexHeksadesimal++] = (char) ('A' + (sisa - 10));:` Untuk sisa 10, kita menyimpan 'A', untuk 11 menyimpan 'B', dan seterusnya. Misalnya, jika sisa adalah 12, maka karakter yang dihasilkan adalah 'C'.  
`desimal /= 16;:` Mengurangi nilai desimal dengan membagi 16. Ini diperlukan untuk melanjutkan proses konversi dengan digit berikutnya.

```
 System.out.print("Heksadesimal: ");
                for (int i = indexHeksadesimal - 1; i >= 0; i--) {
                    System.out.print(heksadesimal[i]);
                }
                System.out.println();
```
Kode tersebut mencetak angka heksadesimal yang disimpan dalam array

##
### B.
```
import java.util.Scanner;
    public class KonversiBilangan2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
}
```
`import java.util.Scanner;`
Kegunaan: Mengimpor kelas Scanner dari paket java.util. Kelas ini digunakan untuk membaca input dari berbagai sumber, seperti keyboard.
`public class KonversiBilangan1 {`
Kegunaan: Mendeklarasikan kelas publik dengan nama KonversiBilangan1. Kelas ini merupakan unit dasar dari program Java di mana kode dan metode lainnya akan didefinisikan.  
`public static void main(String[] args) {`     
Kegunaan: Mendeklarasikan metode main, yang merupakan titik awal eksekusi program Java. Setiap aplikasi Java harus memiliki metode ini untuk dijalankan.
`Scanner sc = new Scanner(System.in);`
Kegunaan: Membuat objek Scanner bernama sc untuk membaca input dari konsol (keyboard). System.in adalah aliran input standar yang digunakan untuk menerima input dari pengguna.
```
  System.out.print("Masukkan bilangan biner: ");
                String biner = sc.nextLine();
        
                // Konversi biner ke desimal
                int desimal = 0;
                int panjang = biner.length();
        
                for (int i = 0; i < panjang; i++) {
                    char bit = biner.charAt(panjang - 1 - i); // Ambil bit dari belakang
                    if (bit == '1') {
                        desimal += 1 << i; // 2^i
                    }
                }
```
`System.out.print("Masukkan bilangan biner: ");:`Mencetak pesan ke konsol untuk meminta pengguna memasukkan bilangan biner.  
`String biner = sc.nextLine();:` Membaca input dari pengguna sebagai string yang berisi bilangan biner.  
`int desimal = 0;:` Mendeklarasikan variabel desimal untuk menyimpan hasil konversi dari biner ke desimal, diinisialisasi dengan 0.  
`int panjang = biner.length();:` Menghitung panjang dari string biner, yang menunjukkan jumlah bit dalam bilangan biner.  
`for (int i = 0; i < panjang; i++) { ... }:` Menggunakan loop for untuk iterasi melalui setiap bit dalam bilangan biner, dari indeks 0 hingga panjang - 1.  
`char bit = biner.charAt(panjang - 1 - i);:` Mengambil bit dari string biner, dimulai dari bit paling kanan (LSB) hingga paling kiri (MSB). panjang - 1 - i digunakan untuk mengakses karakter dari belakang.  
`if (bit == '1') { ... }:` Mengecek apakah bit yang diambil adalah '1'. Jika ya, maka langkah berikutnya akan dilakukan.  
`desimal += 1 << i;:` ika bit adalah '1', maka menambahkan nilai 2^i ke variabel desimal.
```
System.out.println("Desimal: " + desimal);
        
                // Konversi desimal ke heksadesimal
                char[] heksadesimal = new char[8]; // Maksimal 8 karakter untuk heksadesimal
                int indexHeksadesimal = 0;
        
                if (desimal == 0) {
                    heksadesimal[indexHeksadesimal++] = '0';
                } else {
                    while (desimal > 0) {
                        int sisa = desimal % 16; // Sisa bagi
                        if (sisa < 10) {
                            heksadesimal[indexHeksadesimal++] = (char) ('0' + sisa);
                        } else {
                            heksadesimal[indexHeksadesimal++] = (char) ('A' + (sisa - 10)); // Untuk A-F
                        }
                        desimal /= 16; // Bagi desimal dengan 16
                    }
                }
```
`System.out.println("Desimal: " + desimal);:` Mencetak nilai desimal ke konsol agar pengguna tahu nilai yang akan dikonversi.  
`char[] heksadesimal = new char[8];:` Mendeklarasikan array karakter heksadesimal dengan kapasitas maksimum 8 karakter untuk menyimpan hasil konversi ke format heksadesimal.  
`int indexHeksadesimal = 0;:` Mendeklarasikan variabel indexHeksadesimal untuk melacak posisi saat menyimpan karakter ke dalam array heksadesimal.  
`if (desimal == 0) { ... }:` Memeriksa apakah nilai desimal yang diberikan adalah 0. Jika ya, maka akan menyimpan karakter '0' ke dalam array heksadesimal.  
`while (desimal > 0) { ... }:` Loop while digunakan untuk terus melakukan konversi selama nilai desimal lebih besar dari 0.  
`int sisa = desimal % 16;:` Menghitung sisa hasil bagi desimal dengan 16, yang akan memberi tahu nilai digit heksadesimal yang sesuai.  
`if (sisa < 10) { ... }:` Mengecek apakah sisa lebih kecil dari 10. Jika ya, digit heksadesimal adalah angka 0-9.  
`heksadesimal[indexHeksadesimal++] = (char) ('0' + sisa);:` Menyimpan karakter digit ke dalam array heksadesimal. Konversi dari angka ke karakter dilakukan dengan menambahkan sisa ke karakter '0'.  
`else { heksadesimal[indexHeksadesimal++] = (char) ('A' + (sisa - 10)); }:` Jika sisa 10 atau lebih, berarti kita perlu menambahkan huruf A-F. Ini dilakukan dengan menambahkan sisa - 10 ke karakter 'A'.
```
// Menampilkan hasil heksadesimal dalam urutan yang benar
                System.out.print("Heksadesimal: ");
                for (int i = indexHeksadesimal - 1; i >= 0; i--) {
                    System.out.print(heksadesimal[i]);
                }
                System.out.println();
            }
```
`system.out.print("Heksadesimal: ");:` Mencetak teks "Heksadesimal: " ke konsol untuk memberi tahu pengguna bahwa hasil konversi heksadesimal akan ditampilkan segera setelahnya.  
`for (int i = indexHeksadesimal - 1; i >= 0; i--) { ... }:` Menggunakan loop for untuk iterasi dari indeks terakhir (yang diwakili oleh indexHeksadesimal - 1) hingga indeks pertama (0).  
`system.out.print(heksadesimal[i]);:` Mencetak setiap karakter heksadesimal satu per satu dari array heksadesimal, mulai dari karakter terakhir hingga yang pertama. Ini memastikan bahwa hasil ditampilkan dalam urutan yang benar.

##
### C.
```
import java.util.Scanner;
    public class KonversiBilangan3 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
}
```
`import java.util.Scanner;`
Kegunaan: Mengimpor kelas Scanner dari paket java.util. Kelas ini digunakan untuk membaca input dari berbagai sumber, seperti keyboard.
`public class KonversiBilangan1 {`
Kegunaan: Mendeklarasikan kelas publik dengan nama KonversiBilangan1. Kelas ini merupakan unit dasar dari program Java di mana kode dan metode lainnya akan didefinisikan.  
`public static void main(String[] args) {`     
Kegunaan: Mendeklarasikan metode main, yang merupakan titik awal eksekusi program Java. Setiap aplikasi Java harus memiliki metode ini untuk dijalankan.
`Scanner sc = new Scanner(System.in);`
Kegunaan: Membuat objek Scanner bernama sc untuk membaca input dari konsol (keyboard). System.in adalah aliran input standar yang digunakan untuk menerima input dari pengguna.
```
// Konversi Heksadesimal ke Desimal dan Biner
                System.out.print("Masukkan bilangan heksadesimal: ");
                String heksadesimal = sc.nextLine();
                
                // Konversi heksadesimal ke desimal
                int desimal = 0;
                int panjang = heksadesimal.length();
```
`System.out.print("Masukkan bilangan heksadesimal: ");:` Mencetak teks ke konsol yang meminta pengguna untuk memasukkan angka dalam format heksadesimal. Ini memberikan instruksi yang jelas kepada pengguna tentang apa yang diharapkan.
`String heksadesimal = sc.nextLine();:` Menggunakan objek Scanner (sc) untuk membaca input dari pengguna dalam bentuk string. Input ini disimpan dalam variabel heksadesimal, yang akan digunakan untuk konversi selanjutnya.  
`int desimal = 0;:` Inisialisasi variabel desimal dengan nilai 0. Variabel ini akan digunakan untuk menyimpan hasil konversi dari heksadesimal ke desimal.  
`int panjang = heksadesimal.length();:` Menghitung panjang string heksadesimal menggunakan metode length(). Panjang ini akan digunakan untuk iterasi selanjutnya saat menghitung nilai desimal dari setiap digit heksadesimal.
```
 for (int i = 0; i < panjang; i++) {
                    char digit = heksadesimal.charAt(panjang - 1 - i); // Ambil digit dari belakang
                    int nilai;
        
                    if (digit >= '0' && digit <= '9') {
                        nilai = digit - '0'; // Konversi karakter ke nilai desimal
                    } else {
                        nilai = digit - 'A' + 10; // Konversi A-F ke nilai desimal
                    }
                    desimal += nilai * (1 << (i * 4)); // 16^i = 2^(i*4)
                }
```
`for (int i = 0; i < panjang; i++) {:` Memulai loop yang akan berjalan sebanyak panjang string heksadesimal. Loop ini digunakan untuk mengakses setiap digit heksadesimal dari belakang (digit terkecil ke terbesar).  
`char digit = heksadesimal.charAt(panjang - 1 - i);:` Mengambil karakter pada posisi panjang - 1 - i dari string heksadesimal. Ini berarti kita mulai dari digit paling kanan (terakhir) dan bergerak ke kiri.  
`int nilai;:` Deklarasi variabel nilai yang akan menyimpan nilai desimal dari karakter heksadesimal yang sedang diproses.  
`if (digit >= '0' && digit <= '9') {:` Memeriksa apakah digit adalah salah satu karakter numerik (0-9). Jika ya, kita menggunakan konversi yang sesuai.  
`nilai = digit - '0';:` Menghitung nilai desimal untuk digit numerik dengan mengurangi karakter '0' dari karakter digit. Misalnya, jika digit adalah '3', maka nilai menjadi 3.  
`else { nilai = digit - 'A' + 10; }:` Jika digit adalah salah satu karakter dari 'A' hingga 'F', kita menghitung nilai desimalnya dengan mengurangi 'A' dari digit dan menambahkan 10. Jadi, 'A' menjadi 10, 'B' menjadi 11, dan seterusnya hingga 'F' menjadi 15.  
`desimal += nilai * (1 << (i * 4));:` Menambahkan nilai desimal yang dihitung ke variabel desimal. 
```
 // Konversi desimal ke biner
                char[] biner = new char[32]; // Maksimal 32 bit untuk biner
                int indexBiner = 0;
        
                if (desimal == 0) {
                    biner[indexBiner++] = '0';
                } else {
                    while (desimal > 0) {
                        biner[indexBiner++] = (char) ('0' + (desimal % 2)); // Simpan biner
                        desimal /= 2; // Bagi desimal dengan 2
                    }
                }
```
`char[] biner = new char[32];:` Mendeklarasikan array karakter biner dengan ukuran 32. Ini bertujuan untuk menyimpan representasi biner dari angka desimal, dengan asumsi maksimum 32 bit (yang cukup untuk angka 32-bit).  
`int indexBiner = 0;:` Inisialisasi variabel indexBiner untuk melacak indeks saat menyimpan bit biner dalam array. Indeks ini akan bertambah setiap kali bit baru ditambahkan.  
`if (desimal == 0) { biner[indexBiner++] = '0'; }:` Memeriksa apakah nilai desimal sama dengan 0. Jika ya, maka array biner diisi dengan karakter '0', dan indexBiner akan bertambah 1. Ini menangani kasus khusus di mana angka desimal yang dimasukkan adalah 0.  
`else { while (desimal > 0) { ... } }:` Jika nilai desimal tidak sama dengan 0, kita memasuki loop while yang akan terus berjalan selama desimal lebih besar dari 0. Loop ini digunakan untuk melakukan konversi biner.  
`biner[indexBiner++] = (char) ('0' + (desimal % 2));:` Menghitung bit terakhir dari angka desimal menggunakan operasi modulus (%). Jika desimal % 2 menghasilkan 0, maka karakter yang disimpan adalah '0', jika 1, karakter yang disimpan adalah '1'.
Kemudian, karakter ini disimpan di indeks indexBiner dari array biner, dan indexBiner bertambah satu.  
`desimal /= 2;:` Mengubah nilai desimal dengan membaginya dengan 2. Ini menghapus bit yang telah diproses dan mempersiapkan nilai untuk iterasi berikutnya.

```
// Menampilkan hasil biner dalam urutan yang benar
                System.out.print("Desimal dari heksadesimal: " + (desimal + (1 << (indexBiner * 4))));
                System.out.print("\nBiner dari heksadesimal: ");
                for (int i = indexBiner - 1; i >= 0; i--) {
                    System.out.print(biner[i]);
                }
                System.out.println();
```

`System.out.print("Desimal dari heksadesimal: " + (desimal + (1 << (indexBiner * 4))));:` Mencetak teks "Desimal dari heksadesimal: " diikuti oleh hasil perhitungan.  
`System.out.print("\nBiner dari heksadesimal: ");:` Mencetak teks baru "Biner dari heksadesimal: " di konsol untuk memberi tahu pengguna bahwa hasil biner dari heksadesimal akan ditampilkan berikutnya.  
`for (int i = indexBiner - 1; i >= 0; i--) { ... }:` Menggunakan loop for untuk iterasi melalui array biner dari indeks terakhir (indexBiner - 1) hingga indeks pertama (0). Ini penting untuk mencetak representasi biner dalam urutan yang benar karena bit terakhir yang disimpan adalah bit paling signifikan (MSB).
`System.out.print(biner[i]);:` Mencetak karakter biner yang ada di indeks i dari array biner ke konsol.  
`System.out.println();:` Mencetak baris baru setelah semua bit biner ditampilkan untuk memperjelas output.

## No.2
### A.
```
import java.util.Scanner;
    public class Tugas2a_23 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
}
```
`import java.util.Scanner;`
Kegunaan: Mengimpor kelas Scanner dari paket java.util. Kelas ini digunakan untuk membaca input dari berbagai sumber, seperti keyboard.
`public class KonversiBilangan1 {`
Kegunaan: Mendeklarasikan kelas publik dengan nama KonversiBilangan1. Kelas ini merupakan unit dasar dari program Java di mana kode dan metode lainnya akan didefinisikan.  
`public static void main(String[] args) {`     
Kegunaan: Mendeklarasikan metode main, yang merupakan titik awal eksekusi program Java. Setiap aplikasi Java harus memiliki metode ini untuk dijalankan.
`Scanner sc = new Scanner(System.in);`
Kegunaan: Membuat objek Scanner bernama sc untuk membaca input dari konsol (keyboard). System.in adalah aliran input standar yang digunakan untuk menerima input dari pengguna.
```
 System.out.print("Masukkan bilangan biner pertama: ");
                String biner1 = sc.nextLine();
                System.out.print("Masukkan bilangan biner kedua: ");
                String biner2 = sc.nextLine();
        
                // Penjumlahan biner
                String hasilPenjumlahan = penjumlahanBiner(biner1, biner2);
        
                System.out.println("Hasil Penjumlahan Biner:");
                System.out.println(biner1 + " + " + biner2 + " = " + hasilPenjumlahan);
            }
```
Penjelasan Kode Program:  
`Membaca Input dari Pengguna:` Baris ini mencetak pesan ke konsol meminta pengguna untuk memasukkan bilangan biner pertama.
`sc.nextLine()`  digunakan untuk membaca input dari pengguna dan menyimpannya dalam variabel biner1.  
`Membaca Bilangan Biner Kedua:` Baris ini juga mencetak pesan meminta pengguna untuk memasukkan bilangan biner kedua.                            `Penjumlahan Biner:` Di sini, fungsi penjumlahanBiner dipanggil dengan dua argumen biner1 dan biner2.
Fungsi ini diharapkan melakukan operasi penjumlahan biner antara kedua bilangan biner yang diberikan.
Hasil dari penjumlahan ini disimpan dalam variabel hasilPenjumlahan.        `Menampilkan Hasil Penjumlahan:` Baris pertama mencetak judul "Hasil Penjumlahan Biner:" ke konsol.
Baris kedua mencetak hasil penjumlahan biner dalam format yang jelas, menunjukkan operasi yang dilakukan, yaitu biner1 + biner2 = hasilPenjumlahan.
java.
```
// Metode untuk menjumlahkan dua bilangan biner
            private static String penjumlahanBiner(String biner1, String biner2) 
                int maxLength = Math.max(biner1.length(), biner2.length());
                StringBuilder hasil = new StringBuilder();
                int carry = 0;
        
                for (int i = 0; i < maxLength; i++) {
                    int bit1 = (i < biner1.length()) ? biner1.charAt(biner1.length() - 1 - i) - '0' : 0;
                    int bit2 = (i < biner2.length()) ? biner2.charAt(biner2.length() - 1 - i) - '0' : 0;
                    sum = bit1 + bit2 + carry;
                    hasil.append(sum % 2);
                    carry = sum / 2;
                }
        
                if (carry != 0) {
                    hasil.append(carry);
                }
        
                return hasil.reverse().toString();
```
`Deklarasi Metode:` Metode ini bernama penjumlahanBiner dan bertugas untuk menjumlahkan dua bilangan biner yang diberikan sebagai parameter.
Tipe kembalian metode ini adalah String, yang akan mengembalikan hasil penjumlahan dalam bentuk biner.Menentukan `Panjang Maksimal:Variabel maxLength` diatur untuk menyimpan panjang dari bilangan biner terpanjang antara biner1 dan biner2.
Ini digunakan untuk memastikan loop mencakup semua bit dari kedua bilangan.
Inisialisasi Hasil dan` Carry StringBuilder` hasil digunakan untuk menyimpan hasil penjumlahan biner secara efisien.
Variabel carry digunakan untuk menyimpan nilai carry (nilai yang dibawa) jika penjumlahan menghasilkan lebih dari satu bit.
Loop untuk Penjumlahan .
Proses Penjumlahan  
`Menjumlahkan Bit dan Carry:`
Setelah mendapatkan bit1 dan bit2, Anda akan menjumlahkan keduanya bersama dengan nilai carry, namun bagian ini tidak ditampilkan dalam potongan kode Anda. Biasanya, ini akan mencakup logika untuk mengelola hasil penjumlahan dan pembaruan carry, mirip dengan penjumlahan di sistem desimal.
Kembali Hasil  
`Mengembalikan Hasil:`
Setelah selesai menjumlahkan semua bit, hasil akan disimpan dalam StringBuilder hasil, dan Anda akan mengonversinya menjadi String untuk mengembalikannya dari metode.

### B.
##
```
import java.util.Scanner;
    public class Tugas2b_23 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
}
```
`import java.util.Scanner;`
Kegunaan: Mengimpor kelas Scanner dari paket java.util. Kelas ini digunakan untuk membaca input dari berbagai sumber, seperti keyboard.
`public class KonversiBilangan1 {`
Kegunaan: Mendeklarasikan kelas publik dengan nama KonversiBilangan1. Kelas ini merupakan unit dasar dari program Java di mana kode dan metode lainnya akan didefinisikan.  
`public static void main(String[] args) {`     
Kegunaan: Mendeklarasikan metode main, yang merupakan titik awal eksekusi program Java. Setiap aplikasi Java harus memiliki metode ini untuk dijalankan.
`Scanner sc = new Scanner(System.in);`
Kegunaan: Membuat objek Scanner bernama sc untuk membaca input dari konsol (keyboard). System.in adalah aliran input standar yang digunakan untuk menerima input dari pengguna.
```
 System.out.print("Masukkan bilangan biner pertama (min): ");
        String biner1 = sc.nextLine();
        System.out.print("Masukkan bilangan biner kedua (pengurang): ");
        String biner2 = sc.nextLine();

        // Pengurangan biner
        String hasilPengurangan = penguranganBiner(biner1, biner2);

        System.out.println("Hasil Pengurangan Biner:");
        System.out.println(biner1 + " - " + biner2 + " = " + hasilPengurangan);
    }
```
`System.out.print("Masukkan bilangan biner pertama (min): ");`Menampilkan pesan untuk meminta pengguna memasukkan bilangan biner pertama, yang akan berfungsi sebagai minuend 
`String biner1 = sc.nextLine();` Membaca input yang dimasukkan pengguna dan menyimpannya dalam variabel biner1.
`System.out.print("Masukkan bilangan biner kedua (pengurang): ");` Menampilkan pesan untuk meminta pengguna memasukkan bilangan biner kedua
`String biner2 = sc.nextLine();` Membaca input yang dimasukkan pengguna dan menyimpannya dalam variabel biner2.
Pengurangan Biner:
String hasilPengurangan = penguranganBiner(biner1, biner2);
Memanggil fungsi penguranganBiner, yangbiner1Dbiner2Bahasa Indonesia:hasilPengurangan.
```
// Metode untuk mengurangi dua bilangan biner
    private static String penguranganBiner(String biner1, String biner2) {
        StringBuilder hasil = new StringBuilder();
        int borrow = 0; // Variabel untuk menyimpan pinjaman

        // Menyesuaikan panjang bilangan biner
        int maxLength = Math.max(biner1.length(), biner2.length());

        // Melakukan pengurangan dari belakang ke depan
        for (int i = 0; i < maxLength; i++) {
            int bit1 = (i < biner1.length()) ? biner1.charAt(biner1.length() - 1 - i) - '0' : 0;
            int bit2 = (i < biner2.length()) ? biner2.charAt(biner2.length() - 1 - i) - '0' : 0;

            // Menghitung pengurangan dengan memperhitungkan borrow
            int result = bit1 - bit2 - borrow;
```
`private static String penguranganBiner(String biner1, String biner2) {` Mendeklarasikan metode penguranganBineryang digunakanbiner1danbiner2. Bertemu
`StringBuilder hasil = new StringBuilder();` Digunakan StringBuilderuntuk priaStringBuilderlebih baik untuk penggabungan
`int borrow = 0;` Mendeklarasikan variabel borrowuntuk menyimpan nilai
`int maxLength = Math.max(biner1.length(), biner2.length());` Menentukan panjang maksimum antara kedua bilangan biner, sehingga loop dapat berjalan
`for (int i = 0; i < maxLength; i++) {` Memulai
int bit1 = (i < biner1.length()) ? biner1.charAt(biner1.length() - 1 - i) - '0' : 0;
Mengambil sedikit dari biner1.ilebih kbiner1, ambil0.
int bit2 = (i < biner2.length()) ? biner2.charAt(biner2.length() - 1 - i) - '0' : 0;
Mengambil sedikit daribiner2dengan cara yang sama.
int result = bit1 - bit2 - borrow;
Menghitung hasil pengurangan antara bit1, `bitbit2, dan borrow. Jika ada pinjaman sebit1.
```
  if (result < 0) {
                result += 2; // Tambah 2 jika hasil kurang dari 0
                borrow = 1; // Set pinjaman menjadi 1
            } else {
                borrow = 0; // Tidak ada pinjaman
            }

            hasil.append(result); // Tambahkan hasil ke StringBuilder
        }

        // Jika masih ada pinjaman setelah pengurangan
        if (borrow != 0) {
            return "Hasil negatif"; // Jika hasil negatif
        }

        // Membalikkan hasil agar sesuai dengan urutan biner yang benar
        return hasil.reverse().toString();
    }
```
hasil pencarian:mengecek apakah hasil pengurangan ( result) kurang dari 0.
Menambahkan 2 dan mengatur Pinjaman:ika hasil kurang dari 0, kami menambahkan 2 resultuntuk menyesuaikan yang dimilikiborrow kemudian diatur
Pengaturan Pinjaman Jika Tidak Ada:ika hasil tidak kurang dari 0, kita tidak perlu meminjam, jadi borrowdiatur menjadi 0.
Menyimpan Hasil:Menambahkan nilai result(0 atau 1) ke objek `StringBuStringBuilder hasil Ini
Meminta Pinjaman 
Memeriksa Pinjaman Setelah Loop

### C.
##
```
import java.util.Scanner;
    public class Tugas2c_23 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
}
```
`import java.util.Scanner;`
Kegunaan: Mengimpor kelas Scanner dari paket java.util. Kelas ini digunakan untuk membaca input dari berbagai sumber, seperti keyboard.
`public class KonversiBilangan1 {`
Kegunaan: Mendeklarasikan kelas publik dengan nama KonversiBilangan1. Kelas ini merupakan unit dasar dari program Java di mana kode dan metode lainnya akan didefinisikan.  
`public static void main(String[] args) {`     
Kegunaan: Mendeklarasikan metode main, yang merupakan titik awal eksekusi program Java. Setiap aplikasi Java harus memiliki metode ini untuk dijalankan.
`Scanner sc = new Scanner(System.in);`
Kegunaan: Membuat objek Scanner bernama sc untuk membaca input dari konsol (keyboard). System.in adalah aliran input standar yang digunakan untuk menerima input dari pengguna. 
```
 System.out.print("Masukkan bilangan biner pertama: ");
                String biner1 = sc.nextLine();
                
                System.out.print("Masukkan bilangan biner kedua: ");
                String biner2 = sc.nextLine();
        
                // Perkalian biner
                String hasilPerkalian = perkalianBiner(biner1, biner2);
        
                System.out.println("Hasil Perkalian Biner:");
                System.out.println(biner1 + " * " + biner2 + " = " + hasilPerkalian);
            }
        
            // Metode untuk mengalikan dua bilangan biner
            private static String perkalianBiner(String biner1, String biner2) {
                // Hasil perkalian awal
                String hasil = "0";
```
Meminta Bilangan Biner Pertama:Program meminta pengguna untuk memasukkan bilangan biner pertama dan menyimpannya dalam Program, meminta pengguna untuk memasukkan bilangan biner kedua dan menyimpannya dalam variabel biner2.Program memanggil metode perkalianBiner, yang akan melakukabiner1dan biner2, lalu simpan hasilnya dalahasilPerkalian.Menampilkan Hasil Perkalian Inisialisasi Hasil
```
 // Melakukan perkalian bit demi bit
                for (int i = 0; i < biner2.length(); i++) {
                    // Ambil bit dari biner2
                    if (biner2.charAt(biner2.length() - 1 - i) == '1') {
                        // Tambahkan biner1 yang digeser ke kiri i posisi
                        String temp = biner1 + "0".repeat(i); // Menggeser biner1
                        hasil = penjumlahanBiner(hasil, temp); // Menjumlahkan hasil
                    }
                }
        
                return hasil;
            }
        
            // Metode untuk menjumlahkan dua bilangan biner
            private static String penjumlahanBiner(String biner1, String biner2) 
                StringBuilder hasil = new StringBuilder();
                int carry = 0;
                int maxLength = Math.max(biner1.length(), biner2.length());
```
loop untuk Setiap Bit pada biner2Loop ini iterasi melalui setiap bit dalam biner2, mulai dari Mengambil Sedikit dari biner2 Memeriksa apakah bit yang diambil dari biner2adalah '1'. Jika
Menggeser biner1 ika bit dari biner2adalah '1', kita anggotatempdengan menggeser biner1ke kiriiposisi. Ini dilakukan dengan menambahijumlah tidakbiner1.
Jumlahkan Hasil: Menggunakan metode penjumlahanBineruntuk menambahhasildengan temp. Hasil penjumlahan ini akan disimpan kembali di variabehasil.
Mengembalikan Hasil Akhir: Setelah menyelesaikan loop untuk semua bit pada biner2, kita meng
Metode penjumlahanBiner:
Metode Deklarasi: Metode ini dideklarasikan
Inisialisasi Variabel: StringBuilder hasiluntuk menyimpan hasil penju
int carryuntuk menyimpan nol
```
 for (int i = 0; i < maxLength; i++) {
                    int bit1 = (i < biner1.length()) ? biner1.charAt(biner1.length() - 1 - i) - '0' : 0;
                    int bit2 = (i < biner2.length()) ? biner2.charAt(biner2.length() - 1 - i) - '0' : 0;
        
                    int sum = bit1 + bit2 + carry;
                    hasil.append(sum % 2);
                    carry = sum / 2;
                }
        
                if (carry != 0) {
                    hasil.append(carry);
                }
        
                return hasil.reverse().toString()
```
loop untuk Mengiterasi Bit:loop ini akan berjalan dari 0 hingga maxLength, biner1danbiner2.
Menambahkan Carry Akhir:jika ada carry yang tersisa setelah loop, kami tambahkan carry tersebut ke StringBuilder.
Membalikkan Hasil dan Mengembalikannya:Hasil akhir dibalik menggunakan reverse()ka

### D.
##
```
import java.util.Scanner;
    public class Tugas2d_23 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
}
```
`import java.util.Scanner;`
Kegunaan: Mengimpor kelas Scanner dari paket java.util. Kelas ini digunakan untuk membaca input dari berbagai sumber, seperti keyboard.
`public class KonversiBilangan1 {`
Kegunaan: Mendeklarasikan kelas publik dengan nama KonversiBilangan1. Kelas ini merupakan unit dasar dari program Java di mana kode dan metode lainnya akan didefinisikan.  
`public static void main(String[] args) {`     
Kegunaan: Mendeklarasikan metode main, yang merupakan titik awal eksekusi program Java. Setiap aplikasi Java harus memiliki metode ini untuk dijalankan.
`Scanner sc = new Scanner(System.in);`
Kegunaan: Membuat objek Scanner bernama sc untuk membaca input dari konsol (keyboard). System.in adalah aliran input standar yang digunakan untuk menerima input dari pengguna.
```
 System.out.print("Masukkan bilangan biner pertama: ");
                String biner1 = sc.nextLine();
                System.out.print("Masukkan bilangan biner kedua: ");
                String biner2 = sc.nextLine();
        
                // Menentukan panjang maksimum
                int maxLength = Math.max(biner1.length(), biner2.length());
                
                // Menambahkan nol di depan jika panjang biner berbeda
                String hasilAnd = "";
                String hasilOr = "";
                String hasilXor = "";
```
`System.out.print("Masukkan bilangan biner pertama: ");` Menampilkan pesan untuk meminta pengguna memasukkan nilai yang ingin diinput
`String biner1 = sc.nextLine();`Membaca input dari pengguna dan menyimpannya dalam variabel biner1.
`System.out.print("Masukkan bilangan biner kedua: ");`Menampilkan pesan untuk meminta pengguna masukka
`String biner2 = sc.nextLine()` Membaca input dari pengguna dan menyimpannya dalam variabel biner2.
`int maxLength = Math.max(biner1.length(), biner2.length());` Menghitung panjang maksimum antara biner1hari itubiner2tidak
Inisial
`String hasilAnd = "";`Mendeklarasikan variabel hasilAnduntuk menyisihkan
`String hasilOr = "";` Mendeklarasikan variabel hasilOruntuk menyimpan
`String hasilXor = "";`Mendeklarasikan variabel hasilXorke
```
// Melakukan operasi biner
                for (int i = 0; i < maxLength; i++) 
                    char bit1 = (i < biner1.length()) ? biner1.charAt(biner1.length() - 1 - i) : '0';
                    char bit2 = (i < biner2.length()) ? biner2.charAt(biner2.length() - 1 - i) : '0';
        
                    // Operasi AND
                    hasilAnd = ((bit1 == '1' && bit2 == '1') ? '1' : '0') + hasilAnd;
                    // Operasi OR
                    hasilOr = ((bit1 == '1' || bit2 == '1') ? '1' : '0') + hasilOr;
                    // Operasi XOR
                    hasilXor = ((bit1 != bit2) ? '1' : '0') + hasilXor;
```
`for (int i = 0; i < maxLength; i++) {` Mengulangi proses untuk setiap bit hingga mencapai panjang maksimum dari kedua bilangan biner.  
`char bit1 = (i < biner1.length()) ? biner1.charAt(biner1.length() - 1 - i) : '0';` Mengambil sedikit dari biner1. Jika indilebih kecil dari pbiner1.  
`char bit2 = (i < biner2.length()) ? biner2.charAt(biner2.length() - 1 - i) : '0';` Mengambil sedikit daribiner2dengan cara yang sama sepbiner1.  
`Operasi DAN:`
hasilAnd = ((bit1 == '1' && bit2 == '1') ? '1' : '0') + hasilAnd;
Jika bit kedua adalah '1', maka hasilnya '1', jika tidak '0'. Hasil ini ditambahkan di depan hasilAnd.  
`Operasi ATAU:`
hasilOr = ((bit1 == '1' || bit2 == '1') ? '1' : '0') + hasilOr;
Jika salah satu dari kedua bit adalah '1', maka hasilnya '1', jika tidak '0'. Hasil ditambahkan di depan hasilOr.  
`Operasi XOR:`
hasilXor = ((bit1 != bit2) ? '1' : '0') + hasilXor;
Jika kedua sedikit berbeda (satu '1' dan yang lain '0'), hasilnya '1'; jika sama, hasilnya '0'. Hasil ditambahkan di depan hasilXor.

```
// Menampilkan hasil
                System.out.println("Hasil Operasi Biner:");
                System.out.println("Operasi AND: " + biner1 + " AND " + biner2 + " = " + hasilAnd);
                System.out.println("Operasi OR: " + biner1 + " OR " + biner2 + " = " + hasilOr);
                System.out.println("Operasi XOR: " + biner1 + " XOR " + biner2 + " = " + hasilXor);
```
`System.out.println("Hasil Operasi Biner:");` Menampilkan judul untuk hasil operasi b
`System.out.println("Operasi AND: " + biner1 + " AND " + biner2 + " = " + hasilAnd);` Menampilkan hasil operasi AND antara biner1dan `bibiner2 For
Masukan:`biner1biner1
Operator: `DANAND
Masukan: biner2
Hasil: hasilAnd
`System.out.println("Operasi OR: " + biner1 + " OR " + biner2 + " = " + hasilOr);` Menampilkan hasil operasi OR dengan format yang sama, menggunakan hasilOr.  
`System.out.println("Operasi XOR: " + biner1 + " XOR " + biner2 + " = " + hasilXor);`Menampilkan hasil operasi XOR dengan format yang sama, menggunakan hasilXor.

## No.3
```
import java.util.Scanner;
    public class Tugas3_23 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
}
```
`import java.util.Scanner;`
Kegunaan: Mengimpor kelas Scanner dari paket java.util. Kelas ini digunakan untuk membaca input dari berbagai sumber, seperti keyboard.
`public class KonversiBilangan1 {`
Kegunaan: Mendeklarasikan kelas publik dengan nama KonversiBilangan1. Kelas ini merupakan unit dasar dari program Java di mana kode dan metode lainnya akan didefinisikan.  
`public static void main(String[] args) {`     
Kegunaan: Mendeklarasikan metode main, yang merupakan titik awal eksekusi program Java. Setiap aplikasi Java harus memiliki metode ini untuk dijalankan.
`Scanner sc = new Scanner(System.in);`
Kegunaan: Membuat objek Scanner bernama sc untuk membaca input dari konsol (keyboard). System.in adalah aliran input standar yang digunakan untuk menerima input dari pengguna.
```
double suhu = 28.6; // Suhu dalam °C
        int kelembapan = 65; // Kelembapan dalam %
        int co2 = 420; // CO2 dalam ppm

        // Menampilkan data asli
        System.out.println("Data Sensor:");
        System.out.println("Suhu: " + suhu + " °C");
        System.out.println("Kelembapan: " + kelembapan + " %");
        System.out.println("CO2: " + co2 + " ppm");

        // Data untuk konversi
        int[] data = {(int) suhu, kelembapan, co2}; // Array untuk menyimpan data sensor
        String[] labels = {"Suhu", "Kelembapan", "CO2}
```
Definisi Variabel:  
`double suhu = 28.6;:` Menyimpan nilai suhu dalam derajat Celsius.  
`int kelembapan = 65;:` Menyimpan nilai kelembapan dalam persen.  
`int co2 = 420;:` Menyimpan kadar CO2 dalam part per million (ppm).  
Menampilkan Data Asli:  
`System.out.println(...):` Menampilkan nilai asli dari suhu, kelembapan, dan CO2 ke konsol.  
Array untuk Data Sensor:  
`int[] data = {(int) suhu, kelembapan, co2};:` Mengonversi nilai suhu dari tipe double ke int (membuang desimal) dan menyimpan semua nilai sensor dalam array data.  
`String[] labels = {...};:` Menyimpan label untuk setiap jenis data sensor agar lebih mudah dikenali saat ditampilkan.
```
 for (int i = 0; i < data.length; i++) {
            // Menampilkan desimal
            System.out.println("\n" + labels[i] + ": " + data[i]);

            // Konversi ke biner
            char[] biner = new char[32]; // Maksimal 32 bit untuk biner
            int indexBiner = 0;
            int desimal = data[i];

            if (desimal == 0) {
                biner[indexBiner++] = '0';
            } else {
                while (desimal > 0) {
                    biner[indexBiner++] = (char) ('0' + (desimal % 2));
                    desimal /= 2;
                }
            }
```
Loop ini digunakan untuk iterasi melalui setiap elemen dalam array data. Variabel i berfungsi sebagai indeks untuk mengakses elemen yang sesuai dalam array data dan labels.
Menampilkan Data Desimal
Konversi Desimal ke Biner
Inisialisasi Array untuk Biner:
```

            // Menampilkan hasil biner dalam urutan yang benar
            System.out.print("Biner: ");
            for (int j = indexBiner - 1; j >= 0; j--) {
                System.out.print(biner[j]);
            }

            // Konversi ke heksadesimal
            desimal = data[i];
            char[] heksadesimal = new char[8]; // Maksimal 8 digit heksadesimal
            int indexHeksadesimal = 0;

            if (desimal == 0) {
                System.out.println("\nHeksadesimal: 0");
            } else {
                while (desimal > 0) {
                    int sisa = desimal % 16;
                    if (sisa < 10) {
                        heksadesimal[indexHeksadesimal++] = (char) ('0' + sisa);
                    } else {
                        heksadesimal[indexHeksadesimal++] = (char) ('A' + (sisa - 10));
                    }
                    desimal /= 16;
                }
```
`Baris ini mencetak kata "Biner: "`  ke konsol. Kemudian, menggunakan loop for, kode ini mencetak isi array biner dalam urutan yang benar. Karena saat konversi ke biner, bit yang paling signifikan (MSB) disimpan terakhir, maka loop dimulai dari indexBiner - 1 hingga 0, untuk membalik urutan. `Inisialisasi untuk Konversi Heksadesimal:`   Mengatur desimal kembali ke nilai saat ini dari data[i] untuk konversi ke heksadesimal.
Mendeklarasikan array karakter heksadesimal untuk menyimpan representasi heksadesimal dengan kapasitas maksimal 8 karakter. indexHeksadesimal digunakan untuk melacak posisi saat menyimpan digit heksadesimal.  
Cek Jika Nilai Desimal 0
Konversi Desimal ke Heksadesimal:ka desimal tidak 0, maka kode masuk ke dalam loop while untuk melakukan konversi.
```
// Menampilkan hasil heksadesimal dalam urutan yang benar
                System.out.print("\nHeksadesimal: ");
                for (int j = indexHeksadesimal - 1; j >= 0; j--) {
                    System.out.print(heksadesimal[j]);
                }
            }
            System.out.println(); // Untuk baris baru
        }
```
Menampilkan Hasil Heksadesimal:
`System.out.print("\nHeksadesimal: ");` Baris ini mencetak teks `"Heksadesimal: "` ke konsol. Teks ini memberi tahu pengguna bahwa hasil konversi heksadesimal dari data sensor akan ditampilkan berikutnya.
Karakter \n di awal menambahkan baris baru sebelum teks, sehingga output terlihat lebih terorganisir.
Loop untuk Mencetak Isi Array Heksadesimal:
`for (int j = indexHeksadesimal - 1; j >= 0; j--) {`

## No.4
```
import java.util.Scanner;
    public class Tugas4_23 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
}
```
`import java.util.Scanner;`
Kegunaan: Mengimpor kelas Scanner dari paket java.util. Kelas ini digunakan untuk membaca input dari berbagai sumber, seperti keyboard.
`public class KonversiBilangan1 {`
Kegunaan: Mendeklarasikan kelas publik dengan nama KonversiBilangan1. Kelas ini merupakan unit dasar dari program Java di mana kode dan metode lainnya akan didefinisikan.  
`public static void main(String[] args) {`     
Kegunaan: Mendeklarasikan metode main, yang merupakan titik awal eksekusi program Java. Setiap aplikasi Java harus memiliki metode ini untuk dijalankan.
`Scanner sc = new Scanner(System.in);`
Kegunaan: Membuat objek Scanner bernama sc untuk membaca input dari konsol (keyboard). System.in adalah aliran input standar yang digunakan untuk menerima input dari pengguna.
```
// Bilangan biner yang akan dienkripsi
        String biner1 = "01101100";
        String biner2 = "11010110";
        String kunci = "10101010";

        // Hasil enkripsi
        char[] hasilEnkripsi1 = new char[biner1.length()];
        char[] hasilEnkripsi2 = new char[biner2.length()];

        // Melakukan enkripsi dengan XOR
        for (int i = 0; i < biner1.length(); i++) {
            // XOR untuk biner1
            hasilEnkripsi1[i] = (biner1.charAt(i) == kunci.charAt(i)) ? '0' : '1';
            // XOR untuk biner2
            hasilEnkripsi2[i] = (biner2.charAt(i) == kunci.charAt(i)) ? '0' : '1';
        }
```
Deklarasi Bilangan Biner dan Kunci
Inisialisasi Array untuk Hasil Enkripsi
Proses Enkripsi Menggunakan XOR:Menggunakan loop for, kode ini melakukan iterasi melalui setiap bit dalam biner1 dan biner2.
```
// Menampilkan hasil enkripsi
        System.out.println("Biner 1: " + biner1);
        System.out.println("Biner 2: " + biner2);
        System.out.println("Kunci: " + kunci);
        System.out.println("Hasil Enkripsi Biner 1: " + new String(hasilEnkripsi1));
        System.out.println("Hasil Enkripsi Biner 2: " + new String(hasilEnkripsi2));

        // Konversi ke desimal dan heksadesimal
        String hasilBiner1 = new String(hasilEnkripsi1);
        String hasilBiner2 = new String(hasilEnkripsi2);

        // Konversi hasil biner ke desimal
        int desimal1 = 0;
        int desimal2 = 0;

        for (int i = 0; i < hasilBiner1.length(); i++) 
            if (hasilBiner1.charAt(hasilBiner1.length() - 1 - i) == '1') {
                desimal1 += Math.pow(2, i);
            }
            if (hasilBiner2.charAt(hasilBiner2.length() - 1 - i) == '1') {
                desimal2 += Math.pow(2, i);
```
Menampilkan Hasil Enkripsi:
Kode ini mencetak bilangan biner yang digunakan `(biner1 dan biner2)`, kunci yang digunakan untuk enkripsi, serta hasil enkripsi yang disimpan dalam hasilEnkripsi1 dan hasilEnkripsi2.
`new String(hasilEnkripsi1)` dan `new String(hasilEnkripsi2)` digunakan untuk mengubah array karakter hasil enkripsi menjadi string agar dapat dicetak. Inisialisasi Variabel untuk Konversi ke Desimal:Dua string hasilBiner1 dan hasilBiner2 diinisialisasi dengan hasil enkripsi yang baru saja dihitung. Konversi Hasil Biner ke Desimal:Loop for ini digunakan untuk mengiterasi setiap bit dalam hasilBiner1 dan hasilBiner2 dari belakang ke depan (dari bit paling kanan.
```
// Konversi desimal ke heksadesimal
        StringBuilder heksadesimal1 = new StringBuilder();
        StringBuilder heksadesimal2 = new StringBuilder();

        int[] desimalArr = {desimal1, desimal2};

        for (int j = 0; j < 2; j++) {
            int desimal = desimalArr[j];
            if (desimal == 0) {
                heksadesimal1.append("0");
            }
            while (desimal > 0) {
                int sisa = desimal % 16;
                if (sisa < 10) {
                    if (j == 0) {
                        heksadesimal1.append((char) ('0' + sisa));
                    } else {
                        heksadesimal2.append((char) ('0' + sisa));
```
Konversi Desimal ke Heksadesimal
Inisialisasi StringBuilder: Dua objek StringBuilder diinisialisasi untuk menyimpan hasil konversi heksadesimal dari desimal1 dan desimal2. Menggunakan StringBuilder lebih efisien daripada menggabungkan string secara langsung karena dapat memodifikasi konten tanpa membuat objek string baru.
Array untuk Menyimpan Nilai Desimal: Array desimalArr berisi dua elemen, yaitu desimal1 dan desimal2, yang merupakan hasil konversi dari hasil enkripsi biner ke desimal. Ini memudahkan iterasi.Loop untuk Konversi:Loop ini berjalan dua kali `(untuk j = 0 dan j = 1)` untuk melakukan konversi pada kedua nilai desimal.
Jika nilai desimal adalah 0, maka "0" ditambahkan ke heksadesimal1. Namun, sepertinya ada kekurangan dalam logika ini, karena heksadesimal2 tidak diperiksa jika j == 1.
Konversi Heksadesimal:Selama desimal lebih besar dari 0, loop while ini mengambil sisa hasil bagi desimal dengan 16, yang menentukan digit heksadesimal.
`Jika sisa kurang dari 10`, karakter '0' ditambahkan ke sisa untuk mendapatkan representasi karakter (misalnya, 0-9).
`Jika sisa adalah 10 atau lebih`, karakter 'A' ditambahkan (dari 10 hingga 15) untuk mendapatkan representasi A-F.
Setelah setiap iterasi, desimal dibagi dengan 16 untuk mendapatkan nilai desimal untuk digit berikutnya.
```
 } else {
                    if (j == 0) {
                        heksadesimal1.append((char) ('A' + (sisa - 10)));
                    } else {
                        heksadesimal2.append((char) ('A' + (sisa - 10)));
                    }
                }
                desimal /= 16;
            }
        }

        // Output hasil
        System.out.println("Hasil Enkripsi (Desimal 1): " + desimal1);
        System.out.println("Hasil Enkripsi (Heksadesimal 1): " + heksadesimal1.reverse().toString());
        System.out.println("Hasil Enkripsi (Desimal 2): " + desimal2);
        System.out.println("Hasil Enkripsi (Heksadesimal 2): " + heksadesimal2.reverse().toString());
    }
}
```
Output Hasil Enkripsi
Mencetak Hasil Enkripsi Desimal 1:Baris ini mencetak hasil konversi biner pertama (hasil enkripsi) ke dalam format desimal. desimal1 adalah variabel yang menyimpan nilai desimal yang dihasilkan dari konversi biner setelah enkripsi dengan operasi XOR.
Mencetak Hasil Enkripsi Heksadesimal 1:Ini mencetak hasil konversi heksadesimal dari desimal1.Mencetak Hasil Enkripsi Desimal 2:baris ini mencetak hasil konversi biner kedua (hasil enkripsi) ke dalam format desimal. desimal2 menyimpan nilai desimal dari hasil enkripsi kedua










































