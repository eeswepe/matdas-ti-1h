# Penjelasan UTS Matdas

### Biodata
Nama    : Muhammad Fattahul Alim  
Jurusan : Teknologi Informasi  
Prodi : D-4 Teknik Informatika  
Kelas : TI - 1H  
NIM : 244107020018


## UTS Matdas bagian 1

#### Scanner, class dan method pada java (Struktur dasar java)
```
import java.util.Scanner;
```
Kode diatas digunakan agar kita dapat memasukkan inputan pengguna

```
public class utsmatdas {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
```
#### Deklarasi dan inisialisasi
```
        // Untuk menyimpan biner
        int[] biner = new int[200];
        int index = 0;
        // Digit dalam sistem bilangan heksadesimal
        char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        String hexadec = "0123456789ABCDEF";
        // Untuk menyimpan sisa
        int sisa;
        // Untuk menyimpan hasil
        String heksaHasil = "";
        // untuk menyimpan hasil konversi ke desimal
        int desimal = 0;
        // sebagai variabel bantu pada perulangan
        int digit;
        // untuk mencari angka pangkat 2
        int pangkat = 1;
```
Seluruh pernyataan ini merupakan bentuk deklarasi dan inisialisasi variabel yang akan digunakan dalam program uts matdas bagian satu nomor satu variabel variabel tersebut digunakan untuk menyimpan berbagai nilai yang telah dijelaskan dalam code block comment

```
        System.out.print("Masukkan tipe bilangan yang akan dikonversi (1. desimal 2. biner 3. heksadesimal): ");
        int tipe = sc.nextInt();
```
instruksi yang digunakan untuk memasukkan inputan pengguna dan inputan tersebut akan disimpan pada variabel dengan nama "tipe", variabel tersebut nantinya akan digunakan untuk menentukan konversi dari tipe bilangan apa ke apa 

#### Pemilihan Kondisi
```
switch (tipe) {
            case 1:
                System.out.print("Masukkan angka anda: ");
                int angka = sc.nextInt();
                int simpanan = angka;
                while (angka > 0) {
                    biner[index++] = angka % 2;
                    angka = angka / 2;
                }
```
Switch case digunakan untuk melakukan pemilihan kondisi dan akan menjalankan kondisi yang sesuai dengan nilai inputan pengguna di variabel tipe 

#### Looping dalam case 1
```
            case 1:
                System.out.print("Masukkan angka anda: ");
                int angka = sc.nextInt();
                int simpanan = angka;
                while (angka > 0) {
                    biner[index++] = angka % 2;
                    angka = angka / 2;
                }
                System.out.print("Bentuk biner: ");
                for (int i = index - 1; i >= 0; i--) {
                    System.out.print(biner[i]);
                }
```
Apabila pengguna memasukkan inputan ke variabel dengan nama "tipe" dengan nilai 1 maka akan menjalankan kode program didalam case 1 tersebut 
* Perintah pertama : Pengguna akan melakukan inputan angka yang ingin dikonversi. Inputan tersebut akan disimpan pada variabel angka
* loop while : pada loop while tersebut akan dilakukan konversi, angka yang diinput oleh pengguna akan dimodulus 2 hingga angka tersebut bernilai 0 dan loop akan dihentikan. hasil modulus akan ditampung pada array biner.
* loop for : loop for digunakan untuk melakukan print array biner secara terbalik agar biner dapat dicetak dalam format yang benar yaitu dari arah kanan ke kiri
```
System.out.println();
                angka = simpanan;
                while (angka > 0) {
                    sisa = angka % 16;
                    heksaHasil = hex[sisa] + heksaHasil;
                    angka /= 16;

                }
                System.out.print("Bentuk Heksadesimal: " + heksaHasil);
                break;
```
* instruksi System.out.println(); => digunakan untuk memberi baris baru pada output
* angka = simpanan; => melakukan inisialisasi angka agar nilai angka dapat sama dengan nilai simpanan dan nilai angka tidak menjadi 0 setelah dilakukan looping konversi ke biner sebelumnya fungsinya agar kita dapat menggunakan variabel angka pada looping while untuk mengkonversi angka inputan pengguna menuju bilangan heksadesimal
* looping while: looping while akan berjalan apabila variabel angka bernilai lebih dari 0 dan akan berhenti apabila variabel angka bernilai 0. Looping while sendiri digunakan untuk mengkonversi bilangan desimal pada variabel angka menjadi bilangan heksadesimal
* Cara kerja loop while: angka akan dimodulus dengan 16 dan hasil dari modulus akan disimpan pada variabel sisa, setelah kita mendapatkan nilai variabel sisa kita akan menggunakan variabel tersebut untuk mengambil nilai array hex berdasarkan index dan menyimpan hasil terseut di heksaHasil. angka di loop tersebut dibagi dengan 16 pada iterasi terakhir agar loop dapat berhenti setelah angka bernilai 0, setelah loop berhenti dan kita keluar dari perulangan maka kode print akan dieksekusi dan menghasilkan tipe bilangan heksadesimal

#### Looping pada case 2
```
            case 2:
                System.out.print("Masukkan bilangan biner dari kiri ke kanan (1 dan 0): ");
                angka = sc.nextInt();
                simpanan = angka;

                while (angka != 0) {
                    digit = angka % 10;
                    desimal = desimal + (digit * pangkat);
                    pangkat = pangkat * 2;
                    angka = angka / 10;
                }
                System.out.println("Bentuk desimal: " + desimal);
```
Apabila pengguna memasukkan inputan ke variabel dengan nama "tipe" dengan nilai 2 maka akan menjalankan kode program didalam case 2 tersebut 
* kode program pertama: Pengguna akan melakukan inputan angka yang ingin dikonversi. Inputan tersebut akan disimpan pada variabel angka
* variabel simpanan digunakan sebagai duplikat nilai variabel angka
* while loop : komputasi yang dilakukan adalah nilai dalam variabel angka modulus 10, hasil akan disimpan pada variabel digit setelah menemukan variabel digit kita akan memasukkan nilai tersebut ke desimal sekaligus melakukan perkalian dengan variabel pangkat yang saat ini nilainya sama dengan 1
* variabel pangkat akan dikali dua secara terus menerus hingga loop berhenti dan akan merubah nilai pangkat pada variabel desimal
* iterasi terakhir : membagi angka dengan 10 secara terus menerus hingga angka menjadi 0 dan loop akan berhenti saat nilai angka menjadi 0
* keluar perulangan : melakukan print hasil perhitungan konversi agar menampilkan nilai bilangan ke terminal
```
                while (desimal > 0) {
                    sisa = desimal % 16;
                    heksaHasil = hex[sisa] + heksaHasil;
                    desimal /= 16;
                } System.out.println("Bentuk heksadesimal: " + heksaHasil);
                break;
```
Cara kerja loop: 
* loop akan terus berjalan selama nilai desimal bernilai lebih dari 0 dan akan berhenti saat nilai desimal sama dengan 0 atau bahkan kurang dari
* Komputasi : variabel desimal modulus 16 dan hasilnya akan disimpan di sisa, setelah itu sisa akan digunakan sebagai index untuk mencari nilai array yang tepat pada variabel hex. iterasi terakhir digunakan agar loop dapat berhenti
* Setelah loop berhenti maka akan dilakukan perintah print untuk melakukan output dari nilai variabel yang telah berisi bilangan heksadesimal sesuai dengan indexnya   

#### Looping pada case 3
```
case 3 : 
            sc.nextLine();
            System.out.print("Masukkan angka heksadesimal: ");
            String angheksa = sc.nextLine();
            int panjang = angheksa.length();
            int convhex = 0;
```
Kode program sc.nextline digunakan untuk membersihkan inputan pengguna sebelumnya seperti enter dsb, setelah itu kita dapat melakukan input dengan tipe data string tanpa adanya masalah. variabel panjang digunakan untuk menyimpan jumlah karakter yang terkandung dalam variabel angheksa dan convhex digunakan untuk menyimpan nilai konversi dari bilangan heksa desimal

```
            for (int i = 0; i<angheksa.length(); i++) {
                char angheksachar = angheksa.charAt(i);
                int  hexvalue = angheksachar - '0';

                if (angheksachar == 'A') {hexvalue = 10;}
                if (angheksachar == 'B') {hexvalue = 11;}
                if (angheksachar == 'C') {hexvalue = 12;}
                if (angheksachar == 'D') {hexvalue = 13;}
                if (angheksachar == 'E') {hexvalue = 14;}
                if (angheksachar == 'F') {hexvalue = 15;}

                convhex = convhex + (hexvalue * (int) Math.pow(16,--panjang));
            } System.out.println("Bentuk desimal: " + (int) convhex);
```
Cara kerja loop:
* i digunakan untuk mencari index letak character pada variabel angheksa, loop juga akan berhenti apabila i bernilai sama dengan panjang variabel angheksa.
* int hexvalue = angheksachar - '0' digunakan untuk melakukan konversi dari karakter pada string menjadi nilai integer, setiap karakter memiliki nilainya masing masing yang dijelaskan pada kode if dibawahnya
* hexvalue tadi akan dipangkatkan dengan 16 pangkat jumlah panjang dikurang 1 yang akan terus berkurang seiring berjalnnya loop
* setelah kondisi loop tidak terpenuhi loop akan berhenti dan mengeksekusi kode program diluar loop untuk menghasilkan output bilangan desimal atau hasil dari konversi heksa desimal

```
            while (convhex > 0) {
                biner[index++] = convhex % 2;
                convhex = convhex / 2;
            }
            System.out.print("Bentuk biner: ");
            for (int i = index - 1; i >= 0; i--) {
                System.out.print(biner[i]);
            }
```
Cara kerja kode program loop:
* loop while : pada loop while tersebut akan dilakukan konversi, angka hasil konversi sebelumnya yang akan dimodulus 2 hingga angka tersebut bernilai 0 dan loop akan dihentikan. hasil modulus akan ditampung pada array biner.
* loop for : loop for digunakan untuk melakukan print array biner secara terbalik agar biner dapat dicetak dalam format yang benar yaitu dari arah kanan ke kiri
