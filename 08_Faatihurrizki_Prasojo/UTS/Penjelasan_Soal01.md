# UTS MatDas

Nama    : Faatihurrizki Prasojo 
NIM     : 244107020142  
Kelas   : TI-1H


## Nomor 1 "Konversi Bilangan"  



Program ini digunakan untuk mengonversi angka dari satu sistem bilangan ke sistem bilangan lain (Desimal, Biner, atau Heksadesimal). Program ini menggunakan Scanner untuk mengambil input dari pengguna dan StringBuilder untuk membangun string hasil konversi.

java
import java.util.Scanner;

- import java.util.Scanner; mengimpor kelas Scanner dari pustaka Java. Scanner digunakan untuk membaca input dari pengguna.

java
public class utsn1 {

- Mendefinisikan kelas publik utsn1, yang merupakan kelas utama dari program ini. Nama kelas harus sesuai dengan nama file Java (dalam hal ini, utsn1.java).

java
    public static void main(String[] args) {

- Mendeklarasikan metode main, yang merupakan titik awal eksekusi program.

### Inisialisasi Scanner dan Tampilan Menu

java
        Scanner emu = new Scanner(System.in);

- Membuat objek Scanner bernama emu untuk membaca input dari sistem.

java
        System.out.println("=========================================");
        System.out.println("= Konversi Bilangan dengan Program Java =");
        System.out.println("=========================================");

- Menampilkan judul program ke konsol.

java
        System.out.println("Pilih jenis konversi:");
        System.out.println("1. Desimal ke Biner dan Heksadesimal");
        System.out.println("2. Biner ke Desimal dan Heksadesimal");
        System.out.println("3. Heksadesimal ke Desimal dan Biner");
        System.out.print("Masukkan pilihan Anda (1/2/3): ");

- Menampilkan opsi menu konversi yang tersedia bagi pengguna.

java
        int pilihan = emu.nextInt();
        emu.nextLine();

- Membaca input integer dari pengguna untuk memilih jenis konversi yang diinginkan. emu.nextLine(); digunakan untuk membersihkan baris input setelahnya.

### Switch-Case untuk Memilih Jenis Konversi

java
        switch (pilihan) {

- switch digunakan untuk memeriksa nilai dari pilihan dan menjalankan blok kode yang sesuai.

---

#### Case 1: Desimal ke Biner dan Heksadesimal

java
            case 1:
                System.out.print("Masukkan bilangan desimal: ");
                int desimal = emu.nextInt();

- case 1: digunakan untuk menangani konversi Desimal ke Biner dan Heksadesimal.
- Program meminta pengguna memasukkan angka desimal dan menyimpannya di variabel desimal.

*Desimal ke Biner*
java
                StringBuilder biner = new StringBuilder();
                int sisaDesimal = desimal;
                while (sisaDesimal > 0) {
                    biner.insert(0, sisaDesimal % 2);
                    sisaDesimal /= 2;
                }
                System.out.println("Desimal ke Biner: " + (biner.length() == 0 ? "0" : biner));

- StringBuilder biner = new StringBuilder(); membuat StringBuilder untuk menyimpan hasil konversi biner.
- while (sisaDesimal > 0) melakukan perulangan hingga nilai sisaDesimal menjadi nol.
- biner.insert(0, sisaDesimal % 2); menambahkan sisa pembagian sisaDesimal dengan 2 di posisi awal biner.
- sisaDesimal /= 2; membagi sisaDesimal dengan 2 untuk melanjutkan perhitungan.
- Menampilkan hasil konversi dalam format biner.

*Desimal ke Heksadesimal*
java
                StringBuilder heksa = new StringBuilder();
                char[] heksChar = "0123456789ABCDEF".toCharArray();
                sisaDesimal = desimal;
                while (sisaDesimal > 0) {
                    heksa.insert(0, heksChar[sisaDesimal % 16]);
                    sisaDesimal /= 16;
                }
                System.out.println("Desimal ke Heksadesimal: " + (heksa.length() == 0 ? "0" : heksa));
                break;

- char[] heksChar = "0123456789ABCDEF".toCharArray(); mendefinisikan array karakter untuk angka heksadesimal.
- while (sisaDesimal > 0) melakukan loop hingga nilai sisaDesimal menjadi nol.
- heksa.insert(0, heksChar[sisaDesimal % 16]); menambahkan karakter heksadesimal di awal heksa.
- Menampilkan hasil konversi dalam format heksadesimal.

---

#### Case 2: Biner ke Desimal dan Heksadesimal

java
            case 2:
                System.out.print("Masukkan bilangan biner: ");
                String binerInput = emu.nextLine();

- case 2: digunakan untuk menangani konversi dari Biner ke Desimal dan Heksadesimal.
- Membaca input biner dari pengguna sebagai String bernama binerInput.

*Biner ke Desimal*
java
                int desimalDariBiner = 0;
                for (int i = 0; i < binerInput.length(); i++) {
                    desimalDariBiner = desimalDariBiner * 2 + (binerInput.charAt(i) - '0');
                }
                System.out.println("Biner ke Desimal: " + desimalDariBiner);

- int desimalDariBiner = 0; mendefinisikan variabel untuk menyimpan hasil desimal.
- for loop mengiterasi setiap karakter dari binerInput dan menghitung nilai desimalnya.

*Desimal ke Heksadesimal*
java
                heksa = new StringBuilder();
                sisaDesimal = desimalDariBiner;
                while (sisaDesimal > 0) {
                    heksa.insert(0, heksChar[sisaDesimal % 16]);
                    sisaDesimal /= 16;
                }
                System.out.println("Biner ke Heksadesimal: " + (heksa.length() == 0 ? "0" : heksa));
                break;

- Menggunakan hasil desimalDariBiner untuk mengonversi ke heksadesimal dengan cara yang sama seperti pada case 1.

---

#### Case 3: Heksadesimal ke Desimal dan Biner

java
            case 3:
                System.out.print("Masukkan bilangan heksadesimal: ");
                String heksaInput = emu.nextLine();

- case 3: digunakan untuk menangani konversi dari Heksadesimal ke Desimal dan Biner.
- Membaca input heksadesimal dari pengguna.

*Heksadesimal ke Desimal*
java
                int desimalDariHeksa = 0;
                for (int i = 0; i < heksaInput.length(); i++) {
                    char c = heksaInput.charAt(i);
                    int nilai = (c >= '0' && c <= '9') ? c - '0' : c - 'A' + 10;
                    desimalDariHeksa = desimalDariHeksa * 16 + nilai;
                }
                System.out.println("Heksadesimal ke Desimal: " + desimalDariHeksa);

- Menggunakan loop for untuk mengonversi karakter heksadesimal menjadi nilai desimal.

*Desimal ke Biner*
java
                biner = new StringBuilder();
                sisaDesimal = desimalDariHeksa;
                while (sisaDesimal > 0) {
                    biner.insert(0, sisaDesimal % 2);
                    sisaDesimal /= 2;
                }
                System.out.println("Heksadesimal ke Biner: " + (biner.length() == 0 ? "0" : biner));
                break;

- Menggunakan desimalDariHeksa untuk mengonversi ke biner dengan cara yang sama seperti pada case 1.

---

### Penanganan Input Tidak Valid

java
            default:
                System.out.println("Pilihan tidak valid.");
                break;

- Jika pengguna memilih opsi yang tidak ada dalam menu, program akan menampilkan pesan "Pilihan tidak valid."