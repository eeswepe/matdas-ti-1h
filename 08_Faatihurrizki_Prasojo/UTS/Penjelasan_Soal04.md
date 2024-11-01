# UTS MatDas

Nama    : Faatihurrizki Prasojo 
NIM     : 244107020142  
Kelas   : TI-1H


## Nomor 4 "Operasi Enskipsi"

**Point 1 : Mempertimbangkan 2 Bilangan Biner**
```
import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
```
`import java.util.Scanner;` Mengimpor kelas Scanner dari pustaka Java, yang digunakan untuk membaca input dari pengguna.  
`public class Tugas4` Mendeklarasikan kelas publik bernama KonversiBilangan. Kelas ini akan menyimpan metode main.  
`public static void main(String[] args)` Mendeklarasikan metode utama yang menjadi titik awal eksekusi program.
```
        // Input bilangan biner
        System.out.print("Masukkan bilangan biner pertama (8 bit): ");
        String biner1 = input.next();
        System.out.print("Masukkan bilangan biner kedua (8 bit): ");
        String biner2 = input.next();
        System.out.print("Masukkan kunci (8 bit): ");
        String kunci = input.next();
```
`System.out.print("Masukkan bilangan biner pertama (8 bit): ");` Menampilkan permintaan input untuk bilangan biner pertama.  
`String biner1 = input.next();` Membaca bilangan biner pertama dari pengguna sebagai string, yang disimpan dalam variabel `biner1`.  
`String biner2 = input.next();` Membaca bilangan biner kedua dan menyimpannya dalam variabel `biner2`.  
`String kunci = input.next();` Membaca kunci enkripsi sebagai string dan menyimpannya dalam variabel `kunci`.
```
        // Pastikan panjang biner dan kunci 8 bit
        if (biner1.length() != 8 || biner2.length() != 8 || kunci.length() != 8) {
            System.out.println("Semua input harus berupa 8 bit!");
            return; // Keluar jika input tidak valid
        }
```
`if (biner1.length() != 8 || biner2.length() != 8 || kunci.length() != 8)` Mengecek apakah setiap string `(biner1, biner2, dan kunci)` memiliki panjang tepat 8 karakter.  
`System.out.println("Semua input harus berupa 8 bit!");` Jika panjang input tidak sama dengan 8, maka pesan error akan ditampilkan.  
`return;` Mengakhiri program jika input tidak valid.
#
**Point 2 : Operasi Enkripsi Menggunakan XOR**
```
        // Proses enkripsi menggunakan XOR
        String hasilXOR = "";
        for (int i = 0; i < 8; i++) {
            char bit1 = biner1.charAt(i); // Ambil bit dari biner1
            char bit2 = biner2.charAt(i); // Ambil bit dari biner2
            char bitKunci = kunci.charAt(i); // Ambil bit dari kunci

            // Operasi XOR
            char hasilBit = (char) ((bit1 - '0') ^ (bit2 - '0') ^ (bitKunci - '0') + '0');
            hasilXOR += hasilBit; // Tambahkan hasil bit ke hasilXOR
        }
```
`String hasilXOR = "";` Mendeklarasikan string kosong untuk menyimpan hasil XOR bit demi bit.  
`for (int i = 0; i < 8; i++)` Loop untuk setiap bit dari bilangan biner dan kunci (karena panjangnya 8 bit).  
`char bit1 = biner1.charAt(i);` Mengambil bit pada indeks i dari `biner1`.  
`char bit2 = biner2.charAt(i);` Mengambil bit pada indeks i dari `biner2`.  
`char bitKunci = kunci.charAt(i);` Mengambil bit pada indeks i dari `kunci`.  
`char hasilBit = (char) ((bit1 - '0') ^ (bit2 - '0') ^ (bitKunci - '0') + '0');` Melakukan operasi XOR pada tiga bit:  
`(bit1 - '0')` Mengonversi karakter bit menjadi angka 0 atau 1.  
`(bit1 - '0') ^ (bit2 - '0') ^ (bitKunci - '0')` Operasi XOR antara `bit1, bit2, dan bitKunci`.  
`'0'` Mengonversi hasil XOR kembali menjadi karakter 0 atau 1.  
`hasilXOR += hasilBit;` Menambahkan hasil bit XOR ke string hasilXOR.
```
        // Konversi hasilXOR ke desimal
        int decimalHasilXOR = 0;
        for (int i = 0; i < 8; i++) {
            if (hasilXOR.charAt(i) == '1') {
                decimalHasilXOR += (1 << (7 - i)); // Menghitung nilai desimal
            }
        }
```
`int decimalHasilXOR = 0;` Mendeklarasikan variabel decimalHasilXOR untuk menyimpan hasil konversi biner ke desimal.  
`for (int i = 0; i < 8; i++)` Loop untuk mengonversi setiap bit hasil XOR ke nilai desimal.  
`if (hasilXOR.charAt(i) == '1')` Mengecek apakah bit pada indeks i di hasilXOR adalah 1.  
`decimalHasilXOR += (1 << (7 - i));` Menghitung nilai desimal berdasarkan posisi bit yang bernilai 1, dengan 1 << (7 - i) menggantikan nilai bit.  
```
        // Konversi desimal ke heksadesimal
        String heksadesimalHasilXOR = "";
        while (decimalHasilXOR > 0) {
            int sisa = decimalHasilXOR % 16; // Ambil sisa bagi 16
            if (sisa < 10) {
                heksadesimalHasilXOR = sisa + heksadesimalHasilXOR; // Tambahkan angka 0-9
            } else {
                heksadesimalHasilXOR = (char) ('A' + (sisa - 10)) + heksadesimalHasilXOR; // Tambahkan huruf A-F
            }
            decimalHasilXOR /= 16; // Mengurangi nilai desimal
        }
```
`String heksadesimalHasilXOR = "";` Mendeklarasikan string kosong untuk menyimpan hasil konversi ke heksadesimal.  
`while (decimalHasilXOR > 0)` Loop untuk mengonversi nilai desimal decimalHasilXOR ke heksadesimal.  
`int sisa = decimalHasilXOR % 16;` Menghitung sisa pembagian dengan 16.  
`if (sisa < 10) {...}` Jika sisa kurang dari 10, tambahkan angka 0-9 ke heksadesimalHasilXOR.  
`else {...}` Jika sisa lebih dari atau sama dengan 10, tambahkan huruf A-F ke `heksadesimalHasilXOR`, dengan `(char) ('A' + (sisa - 10))` untuk mengonversi angka menjadi karakter.  
`decimalHasilXOR /= 16;` Membagi decimalHasilXOR dengan 16 untuk iterasi berikutnya.
#
**Point 3 : Menampilkan Hasil Enkripsi Dalam Format Biner dan Heksadesimal**
```
        // Tampilkan hasil
        System.out.println();
        System.out.println("Hasil Enkripsi:");
        System.out.println(" - Biner: " + hasilXOR);
        System.out.println(" - Heksadesimal: " + heksadesimalHasilXOR);
        
        input.close();
    }
}
```
`System.out.println("Hasil Enkripsi:");` Mencetak judul untuk hasil enkripsi.  
`System.out.println(" - Biner: " + hasilXOR);` Menampilkan hasil enkripsi dalam format biner.  
`System.out.println(" - Heksadesimal: " + heksadesimalHasilXOR);` Menampilkan hasil enkripsi dalam format heksadesimal.  
`input.close();` Menutup objek Scanner untuk mengakhiri input dari konsol.
#
**Contoh Output**

![alt text](enkripsi.png)