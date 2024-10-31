# Penjelasan UTS Matdas

### Biodata
Nama    : Muhammad Fattahul Alim  
Jurusan : Teknologi Informasi  
Prodi : D-4 Teknik Informatika  
Kelas : TI - 1H  
NIM : 244107020018


## UTS Matdas bagian 3 

#### Scanner, class dan method pada java (Struktur dasar java)
```
import java.util.Scanner;
```
Kode diatas digunakan agar kita dapat memasukkan inputan pengguna
```
public class utsmatdasbag3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
```
#### deklarasi dan inisialisasi
```
        // untuk menyimpan nilai string
        String binerS, kuncienkripS;
        //untuk menyimpan nilai heksa desimal
        char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        // untuk variabel pada loop int
        int desimal = 0, pangkat = 1, digit, sisa;
        String heksaHasil = "";
```
Seluruh pernyataan ini merupakan bentuk deklarasi dan inisialisasi variabel yang akan digunakan dalam program uts matdas bagian satu nomor satu variabel variabel tersebut digunakan untuk menyimpan berbagai nilai yang telah dijelaskan dalam code block comment

#### Input pesan dan kunci enkrip
```
        System.out.print("Masukkan biner pesan: ");
        binerS = sc.nextLine();
        System.out.print("Masukkan kunci enkrip: ");
        kuncienkripS = sc.nextLine();
        System.out.println();
```
instruksi digunakan untuk memasukkan inputan pesan dan kunci enkrip agar proses enkripsi dapat berjalan

#### Proses enkripsi dengan xor
```
        for (int i = 0; i < binerS.length(); i++) {
            if (binerS.charAt(i) == '1' & kuncienkripS.charAt(i) == '0'
                    | binerS.charAt(i) == '0' & kuncienkripS.charAt(i) == '1') {
                        System.out.print(1);
            } else {
                System.out.print(0);
            }
        } System.out.println();
```
* Loop for : Membandingkan kedua biner tersebut satu persatu dengan indeks i ke 0 hingga i kurang dari panjang variabel biner atau hingga perulangan berhenti
* pemilihan kondisi if = apabila pada indeks ke i biners bernilai 1 dan biner2s bernilai 0 atau sebaliknya maka akan melakukan print 1 sebagai hasil outputnya, apabila kondisi diatas tidak terpenuhi maka akan melakukan print 0 sebagai hasil outputnya

#### Proses input hasil enkripsi
```
        System.out.print("Masukkan hasil enkrip yang tampil di layar: ");
        int angka = sc.nextInt();
```
Pengguna diharapkan melakukan input hasil setelah dilakukan operasi xor

#### Mengubah hasil xor ke desimal
```
        while (angka != 0) {
            digit = angka % 10;
            desimal = desimal + (digit * pangkat);
            pangkat = pangkat * 2;
            angka = angka / 10;
        }
        System.out.println("Bentuk desimal: " + desimal);
```
* while loop : komputasi yang dilakukan adalah nilai dalam variabel angka modulus 10, hasil akan disimpan pada variabel digit setelah menemukan variabel digit kita akan memasukkan nilai tersebut ke desimal sekaligus melakukan perkalian dengan variabel pangkat yang saat ini nilainya sama dengan 1
* variabel pangkat akan dikali dua secara terus menerus hingga loop berhenti dan akan merubah nilai pangkat pada variabel desimal
* iterasi terakhir : membagi angka dengan 10 secara terus menerus hingga angka menjadi 0 dan loop akan berhenti saat nilai angka menjadi 0
* keluar perulangan : melakukan print hasil perhitungan konversi agar menampilkan nilai bilangan ke terminal

#### Mengubah desimal ke heksadesimal
```
        while (desimal > 0) {
            sisa = desimal % 16;
            heksaHasil = hex[sisa] + heksaHasil;
            desimal /= 16;
        } System.out.println("Bentuk heksadesimal: " + heksaHasil);

```
Cara kerja loop: 
* loop akan terus berjalan selama nilai desimal bernilai lebih dari 0 dan akan berhenti saat nilai desimal sama dengan 0 atau bahkan kurang dari
* Komputasi : variabel desimal modulus 16 dan hasilnya akan disimpan di sisa, setelah itu sisa akan digunakan sebagai index untuk mencari nilai array yang tepat pada variabel hex. iterasi terakhir digunakan agar loop dapat berhenti
* Setelah loop berhenti maka akan dilakukan perintah print untuk melakukan output dari nilai variabel yang telah berisi bilangan heksadesimal sesuai dengan indexnya   
