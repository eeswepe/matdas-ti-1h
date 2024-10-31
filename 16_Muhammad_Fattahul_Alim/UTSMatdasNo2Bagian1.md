# Penjelasan UTS Matdas

### Biodata
Nama    : Muhammad Fattahul Alim  
Jurusan : Teknologi Informasi  
Prodi : D-4 Teknik Informatika  
Kelas : TI - 1H  
NIM : 244107020018


## UTS Matdas bagian 1 nomor 2

#### Scanner, class dan method pada java (Struktur dasar java)
```
import java.util.Scanner;
```
Kode diatas digunakan agar kita dapat memasukkan inputan pengguna
```
public class utsmatdasbag1no2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
```
#### Deklarasi dan inisialisasi
```
// untuk menyimpan nilai biner
        int biner, biner2;
        // untuk menampilkan hasil
        int[] hasil = new int[200];
        // untuk mencari index
        int index = 0;
        // untuk mencari angka pangkat 2
        int pangkat = 1, pangkat2 = 1;
        // untuk menentukan operasi
        int operasi;
        // untuk variable bantu pada perulangan
        int digit = 0, digit2 = 0;
        // untuk menyimpan nilai desimal
        int desimal = 0, desimal2 = 0;
        // untuk menyimpan hasil setelah operasi
        int desimal3;
        // untuk menyimpan hasil dengan operator logika
        int loghasil;
        // untuk menyimpan nilai string
        String biners, biner2s;
```
Seluruh pernyataan ini merupakan bentuk deklarasi dan inisialisasi variabel yang akan digunakan dalam program uts matdas bagian satu nomor satu variabel variabel tersebut digunakan untuk menyimpan berbagai nilai yang telah dijelaskan dalam code block comment
#### Melakukan inputan pengguna
```
System.out.print("Masukkang angka biner ke-1 (1 dan 0): ");
        biner = sc.nextInt();
        System.out.print("Masukkan angka biner ke-2 (1 dan 0): ");
        biner2 = sc.nextInt();
        System.out.print("Masukkan operasi yang diinginkan (1. + 2. - 3. x 4. and 5. or 6.xor): ");
        operasi = sc.nextInt();

        System.out.println(biner + " dan " + biner2);
```
instruksi yang digunakan untuk memasukkan inputan pengguna dan inputan tersebut akan disimpan pada variabel dengan nama "biner","biner2" dan "operasi" variabel tersebut nantinya akan digunakan untuk menyimpan data, variabel tersebut juga digunakan untuk menentukan operasi apa yang diinginkan oleh pengguna. perintah print juga ada pada iterasi terakhir untuk memastikan angka yang dimasukkan benar 

#### Pemilihan kondisi
```
switch (operasi) {
            case 1:
```
Switch case digunakan untuk melakukan pemilihan kondisi dan akan menjalankan kondisi yang sesuai dengan nilai inputan pengguna di variabel operasi

#### Kode program dalam case 1
```
        switch (operasi) {
            case 1:
                while (biner != 0) {
                    digit = biner % 10;
                    desimal = desimal + (digit * pangkat);
                    pangkat = pangkat * 2;
                    biner = biner / 10;
                }

                while (biner2 != 0) {
                    digit2 = biner2 % 10;
                    desimal2 = desimal2 + (digit2 * pangkat2);
                    pangkat2 = pangkat2 * 2;
                    biner2 = biner2 / 10;
                }
                desimal3 = desimal + desimal2;
```
Apabila pengguna memasukkan inputan ke variabel dengan nama "operasi" dengan nilai 1 maka akan menjalankan kode program didalam case 1 tersebut dalam kode ini kita akan mengubah biner ke desimal dahulu lalu menjumlahkan dua desimal dan mengembalikan nilainya ke biner kembali dengan cara seperti berikut:
* while loop : komputasi dilakukan dengan cara nilai dalam variabel biner dan biner2 di modulus 10 pada loop masing masing, hasil akan disimpan pada variabel digit dan digit2 setelah menemukan variabel tersebut kita akan memasukkan nilai tersebut ke desimal dan desimal2 sekaligus melakukan perkalian dengan variabel pangkat dan pangkat2 yang saat ini nilainya sama dengan 1
* variabel pangkat dan pangkat2 akan dikali dua secara terus menerus hingga loop berhenti dan akan merubah nilai pangkat pada variabel digit dan digit2
* iterasi terakhir : membagi biner 1 dan biner2 dengan 10 secara terus menerus hingga nilai menjadi 0 dan loop akan berhenti saat nilai menjadi 0
* keluar perulangan : kita mendapatkan variabel yang bernilai hasil konversi dari biner ke desimal setelah itu kedua bilangan desimal tersebut akan dijumlah satu sama lain dan hasilnya disimpan pada variabel dengan nama desimal3 

```
                while (desimal3 > 0) {
                    hasil[index++] = desimal3 % 2;
                    desimal3 = desimal3 / 2;
                }
                System.out.print("hasil akhir penjumlahan: ");
                for (int i = index - 1; i >= 0; i--) {
                    System.out.print(hasil[i]);
                }
                break;
```
* loop while : pada loop while tersebut akan dilakukan konversi, nilai desimal3 akan dimodulus 2 hingga angka tersebut bernilai 0 dan loop akan dihentikan. hasil modulus akan ditampung pada array hasil.
* loop for : loop for digunakan untuk melakukan print array hasil secara terbalik agar biner dapat dicetak dalam format yang benar yaitu dari arah kanan ke kiri, variabel hasil sendiri merupakan jawaban atas operasi penjumlahan yang telah dilakukan dan sudah menjadi biner kembali

#### Switch case 2
```
                while (biner != 0) {
                    digit = biner % 10;
                    desimal = desimal + (digit * pangkat);
                    pangkat = pangkat * 2;
                    biner = biner / 10;
                }

                while (biner2 != 0) {
                    digit2 = biner2 % 10;
                    desimal2 = desimal2 + (digit2 * pangkat2);
                    pangkat2 = pangkat2 * 2;
                    biner2 = biner2 / 10;
                } 
                desimal3 = desimal - desimal2;
```
Apabila pengguna memasukkan inputan ke variabel dengan nama "operasi" dengan nilai 2 maka akan menjalankan kode program didalam case 2 tersebut, dalam kode ini kita akan mengubah biner ke desimal dahulu lalu menjumlahkan dua desimal dan mengembalikan nilainya ke biner kembali dengan cara seperti berikut:
* while loop : komputasi dilakukan dengan cara nilai dalam variabel biner dan biner2 di modulus 10 pada loop masing masing, hasil akan disimpan pada variabel digit dan digit2 setelah menemukan variabel tersebut kita akan memasukkan nilai tersebut ke desimal dan desimal2 sekaligus melakukan perkalian dengan variabel pangkat dan pangkat2 yang saat ini nilainya sama dengan 1
* variabel pangkat dan pangkat2 akan dikali dua secara terus menerus hingga loop berhenti dan akan merubah nilai pangkat pada variabel digit dan digit2
* iterasi terakhir : membagi biner 1 dan biner2 dengan 10 secara terus menerus hingga nilai menjadi 0 dan loop akan berhenti saat nilai menjadi 0
* keluar perulangan : kita mendapatkan variabel yang bernilai hasil konversi dari biner ke desimal setelah itu kedua bilangan desimal tersebut akan dikurang satu sama lain dan hasilnya disimpan pada variabel dengan nama desimal3 

```
                while (desimal3 > 0) {
                    hasil[index++] = desimal3 % 2;
                    desimal3 = desimal3 / 2;
                }
                System.out.print("hasil akhir pengurangan: ");
                for (int i = index - 1; i >= 0; i--) {
                    System.out.print(hasil[i]);
                }
                break;
```
* loop while : pada loop while tersebut akan dilakukan konversi, nilai desimal3 akan dimodulus 2 hingga angka tersebut bernilai 0 dan loop akan dihentikan. hasil modulus akan ditampung pada array hasil.
* loop for : loop for digunakan untuk melakukan print array hasil secara terbalik agar biner dapat dicetak dalam format yang benar yaitu dari arah kanan ke kiri, variabel hasil sendiri merupakan jawaban atas operasi pengurangan yang telah dilakukan dan sudah menjadi biner kembali


#### Switch case 3
```
while (biner != 0) {
                    digit = biner % 10;
                    desimal = desimal + (digit * pangkat);
                    pangkat = pangkat * 2;
                    biner = biner / 10;
                }

                while (biner2 != 0) {
                    digit2 = biner2 % 10;
                    desimal2 = desimal2 + (digit2 * pangkat2);
                    pangkat2 = pangkat2 * 2;
                    biner2 = biner2 / 10;
                }
                desimal3 = desimal * desimal2;
```
Apabila pengguna memasukkan inputan ke variabel dengan nama "operasi" dengan nilai 3 maka akan menjalankan kode program didalam case 3 tersebut, dalam kode ini kita akan mengubah biner ke desimal dahulu lalu menjumlahkan dua desimal dan mengembalikan nilainya ke biner kembali dengan cara seperti berikut:
* while loop : komputasi dilakukan dengan cara nilai dalam variabel biner dan biner2 di modulus 10 pada loop masing masing, hasil akan disimpan pada variabel digit dan digit2 setelah menemukan variabel tersebut kita akan memasukkan nilai tersebut ke desimal dan desimal2 sekaligus melakukan perkalian dengan variabel pangkat dan pangkat2 yang saat ini nilainya sama dengan 1
* variabel pangkat dan pangkat2 akan dikali dua secara terus menerus hingga loop berhenti dan akan merubah nilai pangkat pada variabel digit dan digit2
* iterasi terakhir : membagi biner 1 dan biner2 dengan 10 secara terus menerus hingga nilai menjadi 0 dan loop akan berhenti saat nilai menjadi 0
* keluar perulangan : kita mendapatkan variabel yang bernilai hasil konversi dari biner ke desimal setelah itu kedua bilangan desimal tersebut akan dikali satu sama lain dan hasilnya disimpan pada variabel dengan nama desimal3 


```
while (desimal3 > 0) {
                    hasil[index++] = desimal3 % 2;
                    desimal3 = desimal3 / 2;
                }
                System.out.print("hasil akhir perkalian: ");
                for (int i = index - 1; i >= 0; i--) {
                    System.out.print(hasil[i]);
                }
                break;
```
* loop while : pada loop while tersebut akan dilakukan konversi, nilai desimal3 akan dimodulus 2 hingga angka tersebut bernilai 0 dan loop akan dihentikan. hasil modulus akan ditampung pada array hasil.
* loop for : loop for digunakan untuk melakukan print array hasil secara terbalik agar biner dapat dicetak dalam format yang benar yaitu dari arah kanan ke kiri, variabel hasil sendiri merupakan jawaban atas operasi perkalian yang telah dilakukan dan sudah menjadi biner kembali

#### Switch Case 4
```
                biners = Integer.toString(biner);
                biner2s = Integer.toString(biner2);
                for (int i = 0; i < biners.length(); i++) {
                    if (biners.charAt(i) == '1' && biner2s.charAt(i) == '1') {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }
                break;
```
Apabila pengguna memasukkan inputan ke variabel dengan nama "operasi" dengan nilai 4 maka akan menjalankan kode program didalam case 4 tersebut, dalam kode ini kita akan membandingkan dua biner dengan operasi logika and:
* Mengubah tipe data biner yang diinput pengguna menjadi String dan menyimpan hasilnya dalam variabel biners dan biner2s
* Loop for : Membandingkan kedua biner tersebut satu persatu dengan indeks i ke 0 hingga i kurang dari panjang variabel biner
* pemilihan kondisi if = apabila nilai pada biners dan biner2s indeks ke i semuanya bernilai satu maka akan melakukan print 1 sebagai output dan apabila ada yang tidak bernilai 1 maka akan melakukan print 0 sebagai output


#### Switch Case 5
```
 biners = Integer.toString(biner);
                biner2s = Integer.toString(biner2);
                for (int i = 0; i < biners.length(); i++) {
                    if (biners.charAt(i) == '1' | biner2s.charAt(i) == '1') {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }
                break;
```
Apabila pengguna memasukkan inputan ke variabel dengan nama "operasi" dengan nilai 5 maka akan menjalankan kode program didalam case 5 tersebut, dalam kode ini kita akan membandingkan dua biner dengan operasi logika or:
* Mengubah tipe data biner yang diinput pengguna menjadi String dan menyimpan hasilnya dalam variabel biners dan biner2s
* Loop for : Membandingkan kedua biner tersebut satu persatu dengan indeks i ke 0 hingga i kurang dari panjang variabel biner
* pemilihan kondisi if = apabila salah satu nilai pada biners dan biner2s indeks ke i adalah 1 maka akan melakukan print 1 sebagai output dan apabila kedua biner bernilai 0 maka akan melakukan prit 0 sebagai output


#### Switch case 6
```
biners = Integer.toString(biner);
                biner2s = Integer.toString(biner2);
                for (int i = 0; i < biners.length(); i++) {
                    if (biners.charAt(i) == '1' & biner2s.charAt(i) == '0'
                            | biners.charAt(i) == '0' & biner2s.charAt(i) == '1') {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }
                break;
```
Apabila pengguna memasukkan inputan ke variabel dengan nama "operasi" dengan nilai 6 maka akan menjalankan kode program didalam case 6 tersebut, dalam kode ini kita akan membandingkan dua biner dengan operasi logika xor:
* Mengubah tipe data biner yang diinput pengguna menjadi String dan menyimpan hasilnya dalam variabel biners dan biner2s
* Loop for : Membandingkan kedua biner tersebut satu persatu dengan indeks i ke 0 hingga i kurang dari panjang variabel biner
* pemilihan kondisi if = apabila pada indeks ke i biners bernilai 1 dan biner2s bernilai 0 atau sebaliknya maka akan melakukan print 1 sebagai hasil outputnya, apabila kondisi diatas tidak terpenuhi maka akan melakukan print 0 sebagai hasil outputnya