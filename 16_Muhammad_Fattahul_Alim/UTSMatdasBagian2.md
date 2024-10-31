# Penjelasan UTS Matdas

### Biodata
Nama    : Muhammad Fattahul Alim  
Jurusan : Teknologi Informasi  
Prodi : D-4 Teknik Informatika  
Kelas : TI - 1H  
NIM : 244107020018


## UTS Matdas bagian 2 

#### Scanner, class dan method pada java (Struktur dasar java)
```
import java.util.Scanner;
```
Kode diatas digunakan agar kita dapat memasukkan inputan pengguna

```
public class utsmatdasbag2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
```

#### Deklarasi dan inisialisasi
```
  double suhu, lembapDecimal, CO2, kelembapan;
        // tempat untuk menyimpan hasil pembulatan
        int suhuI, lembapI, CO2I;
        // untuk menyimpan pangkat
        int pangkat = 1;
        // untuk menyimpan nilai index
        int index = 0, indexlem= 0, indexco = 0;
        // untuk menyimpan nilai heksadesimal
        char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
```
Seluruh pernyataan ini merupakan bentuk deklarasi dan inisialisasi variabel yang akan digunakan dalam program uts matdas bagian satu nomor satu variabel variabel tersebut digunakan untuk menyimpan berbagai nilai yang telah dijelaskan dalam code block comment

#### Input data yang diinginkan pengguna
```
System.out.print("Masukkan data suhu: ");
        suhu = sc.nextDouble();
        suhu += 0.5;
        System.out.print("Masukkan data kelembapan dalam bentuk % : ");
        kelembapan = sc.nextInt();
        kelembapan += 0.5;
        System.out.print("Masukkan kadar CO2: ");
        CO2 = sc.nextDouble();
        CO2 += 0.5;
```
instruksi digunakan untuk memasukkan inputan pengguna dan inputan tersebut akan disimpan pada variabel dengan nama "suhu", "kelembapan", CO2 setelah itu seluruh data akan langsung ditambahkan 0,5 untuk nantinya dilakukan pembulatan
#### Pembulatan 
```
// konversi
        suhuI = (int) suhu;
        int simpanhek = suhuI;
        lembapI = (int) kelembapan;
        int simpanlemhek = lembapI;
        CO2I = (int) CO2;
        int simpancohek = CO2I;
```
Pada kode tersebut semua variabel yang bernilai double dan telah dijumlah dengan 0,5 akan diubah tipenya menjadi integer agar nilai variabel dapat dibulatkan

#### Konversi data suhu ke biner
```
 // konversi ke suhu ke biner
        int[] binSuhu = new int[100];
        while (suhuI > 0) {
            binSuhu[index++] = suhuI % 2;
            suhuI /= 2;
        }
        System.out.print("Suhu dalam bentuk biner: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binSuhu[i]);
        } System.out.println();
```
* loop while : pada loop while tersebut akan dilakukan konversi,nilai pada variabel suhuI yang telah dibulatkan akan dimodulus 2 hingga angka tersebut bernilai 0 dan loop akan dihentikan. hasil modulus akan ditampung pada array binSuhu.
* loop for : loop for digunakan untuk melakukan print array binSuhu secara terbalik agar biner dapat dicetak dalam format yang benar yaitu dari arah kanan ke kiri

#### Konversi data suhu ke heksa desimal
```
        // untuk menyimpan sisa
         int sisa;
         // konversi ke heksadesimal
            String heksaHasil = "";
            while (simpanhek > 0) {
            sisa = simpanhek % 16;
            heksaHasil = hex[sisa] + heksaHasil;
            simpanhek /= 16;

        }   System.out.println("Suhu dalam bentuk heksadesimal: " + heksaHasil);
```
Disitu terdapat penambahan variabel untuk memudahkan looping
* looping while: looping while akan berjalan apabila variabel simpanhek yang merupakan duplikat dari suhuI bernilai lebih dari 0 dan akan berhenti apabila variabel simpanhek bernilai 0. Looping while sendiri digunakan untuk mengkonversi bilangan desimal pada variabel simpanhek menjadi bilangan heksadesimal
* Cara kerja loop while: simpanhek akan dimodulus dengan 16 dan hasil dari modulus akan disimpan pada variabel sisa, setelah kita mendapatkan nilai variabel sisa kita akan menggunakan variabel tersebut untuk mengambil nilai array hex berdasarkan nilai dari variabel sisa sebagai index dan menyimpan hasil tersebut di heksaHasil. simpanhek di loop tersebut dibagi dengan 16 pada iterasi terakhir agar loop dapat berhenti setelah angka bernilai 0, setelah loop berhenti dan kita keluar dari perulangan maka kode print akan dieksekusi dan menghasilkan tipe bilangan heksadesimal

#### Konversi kelembapan ke biner
```
 // konversi kelembapan ke biner
        int[] lemsuhu = new int[100];
        
        while (lembapI > 0) {
            lemsuhu[indexlem++] = lembapI % 2;
            lembapI /= 2;
        }
        System.out.print("Kelembapan dalam bentuk biner: ");
        for (int i = indexlem - 1; i >= 0; i--) {
            System.out.print(lemsuhu[i]);
        } System.out.println();
```
*  loop while : pada loop while tersebut akan dilakukan konversi, nilai pada variabel lembapI yang telah dibulatkan akan dimodulus 2 hingga angka tersebut bernilai 0 dan loop akan dihentikan. hasil modulus akan ditampung pada array lemsuhu.
* loop for : loop for digunakan untuk melakukan print array lemsuhu secara terbalik agar biner dapat dicetak dalam format yang benar yaitu dari arah kanan ke kiri

#### konversi kelembapan ke heksa desimal
```
 // konversi ke heksadesimal
        String hekslem = "";
        int sisalem;
        while (simpanlemhek > 0) {
            sisalem = simpanlemhek % 16;
            hekslem = hex[sisalem] + hekslem;
            simpanlemhek /= 16;

        }   System.out.println("Kelembapan dalam bentuk heksadesimal: " + hekslem);
```
Disitu terdapat penambahan variabel untuk memudahkan looping
* looping while: looping while akan berjalan apabila variabel simpanlemhek yang merupakan duplikat dari lembapI bernilai lebih dari 0 dan akan berhenti apabila variabel simpanlemhek bernilai 0. Looping while sendiri digunakan untuk mengkonversi bilangan desimal pada variabel simpanlemhek menjadi bilangan heksadesimal
* Cara kerja loop while: simpanlemhek akan dimodulus dengan 16 dan hasil dari modulus akan disimpan pada variabel sisalem, setelah kita mendapatkan nilai variabel sisa kita akan menggunakan variabel tersebut untuk mengambil nilai array hex berdasarkan nilai dari variabel sisa sebagai index dan menyimpan hasil tersebut di hekslem. simpanlemhek di loop tersebut dibagi dengan 16 pada iterasi terakhir agar loop dapat berhenti setelah angka bernilai 0, setelah loop berhenti dan kita keluar dari perulangan maka kode print akan dieksekusi dan menghasilkan tipe bilangan heksadesimal

#### Konversi CO2 ke biner
```
        // konversi CO2 ke biner
         int[] binco2 = new int[100];
         while (CO2I > 0) {
             binco2[indexco++] = CO2I % 2;
             CO2I /= 2;
         }
         System.out.print("CO2 dalam bentuk biner: ");
         for (int i = indexco - 1; i >= 0; i--) {
             System.out.print(binco2[i]);
         } System.out.println();

```
*  loop while : pada loop while tersebut akan dilakukan konversi, nilai pada variabel CO2I yang telah dibulatkan akan dimodulus 2 hingga angka tersebut bernilai 0 dan loop akan dihentikan. hasil modulus akan ditampung pada array binco2.
* loop for : loop for digunakan untuk melakukan print array binco2 secara terbalik agar biner dapat dicetak dalam format yang benar yaitu dari arah kanan ke kiri

#### Konversi ke CO2 ke heksadesimal
```
// konversi ke heksadesimal
         String heksco = "";
         int sisaco;
         while (simpancohek > 0) {
             sisaco = simpancohek % 16;
             heksco = hex[sisaco] + heksco;
             simpancohek /= 16;
 
         }   System.out.println("Kelembapan dalam bentuk heksadesimal: " + heksco);
    }
```
Disitu terdapat penambahan variabel untuk memudahkan looping
* looping while: looping while akan berjalan apabila variabel simpanlcohek yang merupakan duplikat dari CO2I bernilai lebih dari 0 dan akan berhenti apabila variabel simpancohek bernilai 0. Looping while sendiri digunakan untuk mengkonversi bilangan desimal pada variabel simpancomhek menjadi bilangan heksadesimal
* Cara kerja loop while: simpancohek akan dimodulus dengan 16 dan hasil dari modulus akan disimpan pada variabel sisaco, setelah kita mendapatkan nilai variabel sisaco kita akan menggunakan variabel tersebut untuk mengambil nilai array hex berdasarkan nilai dari variabel sisaco sebagai index dan menyimpan hasil tersebut di heksco. simpancohek di loop tersebut dibagi dengan 16 pada iterasi terakhir agar loop dapat berhenti setelah angka bernilai 0, setelah loop berhenti dan kita keluar dari perulangan maka kode print akan dieksekusi dan menghasilkan tipe bilangan heksadesimal