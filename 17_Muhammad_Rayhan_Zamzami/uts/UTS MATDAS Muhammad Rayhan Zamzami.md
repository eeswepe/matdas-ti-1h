# UTS 1 MATDAS
Made by Muhammad Rayhan Zamzami - TI 1H - 244107020027
## Konversi Bilangan
Program di mulai dengan menentukan tipe data dan variabel yang di butuhkan.

```java
int desimal,angkaBiner,angkaHeks;
String biner =  "";
String heksaDesimal =  ""; 
```
lalu user di minta untuk menginput bilangan Desimal .
```java
System.out.print("Masukkan Bilangan Desimal : ");
desimal =  sc.nextInt();
```
Setelah itu program akan menjalankan logika konversi.
di bawah ini adalah logika konversi desimal ke biner : 
```java
angkaBiner = desimal;
if (angkaBiner ==  0) {
biner =  "0";
} else {
while (angkaBiner >  0) {
biner = (angkaBiner %  2) + biner;
angkaBiner /=  2;
}
}
```
Penjelasan :

-   **Pengecekan untuk Bilangan 0:**
    
    -   Jika nilai `angkaBiner` (bilangan desimal yang dimasukkan) adalah `0`, variabel `biner` langsung diisi dengan `"0"`. Ini menangani kasus khusus di mana input adalah `0`, karena `0` dalam biner tetap `0`.
-   **Konversi dari Desimal ke Biner:**
    
    -   Jika nilai `angkaBiner` bukan `0`, program masuk ke dalam `while` loop.
    -   **Proses `while` Loop:**
        -   `(angkaBiner % 2)` mendapatkan sisa pembagian `angkaBiner` dengan `2`, yang menghasilkan digit biner paling kanan (0 atau 1).
        -   `biner = (angkaBiner % 2) + biner` menambahkan hasil ini ke depan string `biner`. Ini membangun representasi biner dari belakang ke depan, sehingga digit paling signifikan muncul di posisi awal string.
        -   `angkaBiner /= 2` membagi `angkaBiner` dengan `2`, yang menggeser desimal ke kanan untuk mendapatkan digit berikutnya.

Logika Konversi Desimal Ke Heksa
```java
angkaHeks = desimal;
if (angkaHeks ==  0) {
heksaDesimal =  "0";
} else {
String simbolH =  "0123456789ABCDEF";
while (angkaHeks >  0) {
heksaDesimal =  simbolH.charAt(angkaHeks %  16) + heksaDesimal;
angkaHeks /=  16;
}
}
```
Penjelasan : 
-   **Pengecekan untuk Bilangan 0:**
    
    -   Jika nilai `angkaHeks` (bilangan desimal yang dimasukkan) adalah `0`, variabel `heksaDesimal` langsung diisi dengan `"0"`. Ini menangani kasus khusus di mana input adalah `0`, karena `0` dalam heksadesimal tetap `0`.
-   **Inisialisasi Simbol Heksadesimal:**
    
    -   `String simbolH = "0123456789ABCDEF";` mendefinisikan simbol untuk setiap digit heksadesimal, dari `0` hingga `F` (yang mewakili nilai `0` hingga `15`).
-   **Konversi dari Desimal ke Heksadesimal:**
    
    -   Jika `angkaHeks` bukan `0`, program masuk ke dalam `while` loop.
    -   **Proses `while` Loop:**
        -   `angkaHeks % 16` mengambil sisa pembagian `angkaHeks` dengan `16`, yang menghasilkan digit heksadesimal paling kanan (0 hingga 15).
        -   `simbolH.charAt(angkaHeks % 16)` mengambil karakter yang sesuai dari `simbolH` berdasarkan sisa yang dihasilkan, misalnya `10` dikonversi menjadi `A`.
        -   `heksaDesimal = simbolH.charAt(angkaHeks % 16) + heksaDesimal;` menambahkan hasil ini di depan string `heksaDesimal`, membangun representasi heksadesimal dari belakang ke depan.
        -   `angkaHeks /= 16` membagi `angkaHeks` dengan `16`, yang menggeser desimal untuk mendapatkan digit berikutnya.


Program akan menampilkan output nya dengan source code : 
```java
System.out.println("Bilangan Biner : "  + biner);
```
 &
```java
System.out.println("Bilangan Heksa Desimal : "  + heksaDesimal);
```

Program `Public Static Void` main telah selesai dan memanggil `Public Static Void` yang ada di bawah nya source code nya sebagai berikut :
```java
point2();
point3();
``` 
Program `Public Static Void point2` berjalan di mulai dengan menentukan tipe data dan variabel yang di butuhkan.
```java
String biner;
String heksaDesimal =  "";
int desimal =  0;
```
lalu user di minta untuk menginput bilangan Biner.
```java
System.out.print("Masukkan Bilangan Biner : ");
biner =  sc.nextLine();
```
Setelah itu program akan menjalankan logika konversi.
di bawah ini adalah Logika untuk konversi biner ke desimal.
```java
for(int i =  0; i <  biner.length(); i++){
char bit =  biner.charAt(biner.length() -  1  - i);
if (bit ==  '1') {
desimal +=  1  << i;
}
}
```
Penjelasan : 
-   **Looping melalui Setiap Karakter Biner:**
    
    -   `for(int i = 0; i < biner.length(); i++)` mengulangi proses ini untuk setiap karakter dalam string `biner`, dimulai dari posisi paling kanan ke kiri (karena digit paling kanan mewakili nilai terkecil).
-   **Mengambil Karakter Biner dari Belakang:**
    
    -   `char bit = biner.charAt(biner.length() - 1 - i);` mengambil karakter dari string `biner`, dimulai dari karakter terakhir (`biner.length() - 1`) hingga karakter pertama (indeks `0`). Ini memastikan bahwa konversi dimulai dari bit paling tidak signifikan ke bit paling signifikan.
-   **Mengonversi Karakter Biner ke Nilai Desimal:**
    
    -   **Jika `bit` adalah `'1'`:**
        -   Program menambahkan nilai biner yang sesuai ke variabel `desimal` menggunakan operasi pergeseran bit (`<<`).
        -   `1 << i` menggeser `1` ke kiri sebanyak `i` kali, yang sama dengan menaikkan `2` pangkat `i`. Misalnya:
            -   Untuk `i = 0`, `1 << i` menghasilkan `1`.
            -   Untuk `i = 1`, `1 << i` menghasilkan `2`.
            -   Untuk `i = 2`, `1 << i` menghasilkan `4`.
        -   Setiap kali ada `bit` yang bernilai `1`, nilai `1 << i` ditambahkan ke `desimal`, sehingga jumlah total mewakili nilai desimal akhir dari biner.

Lalu menampilkan output dari hasil konversi dengan source code nya :
```java
System.out.println("Bilangan desimal : "  + desimal);
```
Setelah Konversi ke biner ke desimal lalu desimal ke heksa agar lebih mudah
berikut adalah logika desimal ke heksa : 
```java
if (desimal ==  0) {
heksaDesimal =  "0";
} else {
String simbolH =  "0123456789ABCDEF";
while (desimal >  0) {
heksaDesimal =  simbolH.charAt(desimal %  16) + heksaDesimal;
desimal /=  16;
}
}
```
Penjelasan : 
-   **Pengecekan untuk Bilangan 0:**
    
    -   Jika `desimal` (nilai desimal yang akan dikonversi) bernilai `0`, variabel `heksaDesimal` langsung diisi dengan `"0"`. Ini menangani kasus khusus di mana input adalah `0`, karena `0` dalam heksadesimal juga tetap `0`.
-   **Inisialisasi Simbol Heksadesimal:**
    
    -   `String simbolH = "0123456789ABCDEF";` mendefinisikan karakter yang mewakili setiap digit dalam sistem heksadesimal (0-9 dan A-F, yang bernilai 10-15 dalam desimal).
-   **Konversi dari Desimal ke Heksadesimal:**
    
    -   Jika `desimal` bukan `0`, program memasuki `while` loop.
    -   **Proses `while` Loop:**
        -   `desimal % 16` mengambil sisa pembagian `desimal` dengan `16`, menghasilkan digit paling kanan dalam heksadesimal (0 hingga 15).
        -   `simbolH.charAt(desimal % 16)` mengambil karakter yang sesuai dari `simbolH`, misalnya `10` menjadi `'A'`, `11` menjadi `'B'`, dan seterusnya.
        -   `heksaDesimal = simbolH.charAt(desimal % 16) + heksaDesimal` menambahkan hasil ini di depan string `heksaDesimal`. Ini membangun representasi heksadesimal dari belakang ke depan, sehingga digit paling signifikan muncul di posisi awal string.
        -   `desimal /= 16` membagi `desimal` dengan `16` untuk menggeser digit ke kanan, sehingga digit berikutnya dalam sistem heksadesimal dapat dihitung.

Setelah itu akan menampilkan hasil program dengan sout seperti menampilkan hasil konversi yang di atas dan program `public  static  void  point2`selesai dan di lanjutkan dengan program
`public  static  void  point3`

Program berjalan di mulai dengan menentukan tipe data dan variabel yang di butuhkan.
```java
String heksaDesimal;
String biner =  "";
int desimal =  0;
int nilaiHeksa;
```
lalu user di minta untuk menginput bilangan heksadesimal.
```java
System.out.print("Masukkan Bilangan Heksadesimal : ");
heksaDesimal =  sc.nextLine();
```
Setelah itu program akan menjalankan logika konversi.
di bawah ini adalah Logika untuk Konversi HeksaDesimal ke desimal.
```java 
for (int i =  0;i <  heksaDesimal.length();i++){
// mengambil karakter dari belakang
char karakter =  heksaDesimal.charAt(heksaDesimal.length() -  1  - i);
// menentukan nilai heksadesimal
if (karakter >=  '0'  && karakter <=  '9') {
// mengonversi karakter ke int
nilaiHeksa = karakter -  '0';
}else  if (karakter >=  'A'  && karakter <=  'F') {
// mengonversi karakter A-F ke 10-15
nilaiHeksa = karakter -  'A'  +  10;
}else{
System.out.println("Karakter heksadesimal tidak valid!");
continue;
}
desimal += nilaiHeksa * (1  << (4  * i));
}
```
Penjelasan : 
-   **Looping melalui Setiap Karakter Heksadesimal dari Belakang:**
    
    -   `for (int i = 0; i < heksaDesimal.length(); i++)` mengulangi proses ini untuk setiap karakter dalam string `heksaDesimal`, mulai dari karakter paling kanan (posisi paling tidak signifikan) ke karakter paling kiri.
    -   `char karakter = heksaDesimal.charAt(heksaDesimal.length() - 1 - i);` mengambil karakter dari belakang ke depan, yang memungkinkan konversi heksadesimal dimulai dari digit paling tidak signifikan.
-   **Menentukan Nilai Heksadesimal untuk Setiap Karakter:**
    
    -   Jika `karakter` adalah antara `'0'` dan `'9'`, maka karakter dikonversi menjadi nilai integer yang sesuai dengan `nilaiHeksa = karakter - '0'`. Misalnya, `'5'` akan dikonversi menjadi `5`.
    -   Jika `karakter` adalah antara `'A'` dan `'F'`, maka karakter dikonversi menjadi nilai integer yang sesuai (10 untuk `'A'`, 11 untuk `'B'`, dan seterusnya) menggunakan `nilaiHeksa = karakter - 'A' + 10`.
    -   Jika `karakter` bukan digit yang valid dalam heksadesimal, pesan kesalahan dicetak, dan perulangan melanjutkan ke iterasi berikutnya dengan `continue`.
-   **Mengonversi Setiap Digit Heksadesimal menjadi Nilai Desimal:**
    
    -   `desimal += nilaiHeksa * (1 << (4 * i));` menghitung nilai desimal dari digit heksadesimal yang diproses, dengan rumus:
        -   `(1 << (4 * i))` menggeser nilai `1` ke kiri sebanyak `4 * i` posisi, yang setara dengan `16^i` (di mana 4 bit digunakan untuk setiap digit heksadesimal).
        -   `nilaiHeksa * (1 << (4 * i))` menghasilkan kontribusi nilai dari digit heksadesimal yang sesuai pada posisi `i`, dan hasilnya ditambahkan ke variabel `desimal`.

 menampilkan output dengan source code.
```java
System.out.println("Bilangan bilangan Desimal : "  + desimal);
```
Setelah itu Heksa yang sudah di konversi ke desimal akan akan dikonversikan lagi ke biner agar lebih mudah.
```java
if (desimal ==  0) {
biner =  "0";
} else {
while (desimal >  0) {
biner = (desimal %  2) + biner;
desimal /=  2;
}
```
Penjelasan : 
-   **Pengecekan untuk Bilangan 0:**
    
    -   Jika nilai `angkaBiner` (bilangan desimal yang dimasukkan) adalah `0`, variabel `biner` langsung diisi dengan `"0"`. Ini menangani kasus khusus di mana input adalah `0`, karena `0` dalam biner tetap `0`.
-   **Konversi dari Desimal ke Biner:**
    
    -   Jika nilai `angkaBiner` bukan `0`, program masuk ke dalam `while` loop.
    -   **Proses `while` Loop:**
        -   `(angkaBiner % 2)` mendapatkan sisa pembagian `angkaBiner` dengan `2`, yang menghasilkan digit biner paling kanan (0 atau 1).
        -   `biner = (angkaBiner % 2) + biner` menambahkan hasil ini ke depan string `biner`. Ini membangun representasi biner dari belakang ke depan, sehingga digit paling signifikan muncul di posisi awal string.
        -   `angkaBiner /= 2` membagi `angkaBiner` dengan `2`, yang menggeser desimal ke kanan untuk mendapatkan digit berikutnya.

Akan menampilkan output dengan source code : 
```java
System.out.println("Bilangan Biner : "  + biner);
```
Program akan terhenti dan output dari hasil semua program setelah di jalankan  : 
![Ouput](https://i.postimg.cc/mDHP2GLd/image.png)

## Operasi Bilangan Biner

Program di mulai dengan menentukan tipe data dan variabel yang di butuhkan.
```java
String biner1,biner2;
String hasil =  "";
int angkaBiner;
int desimal1 =  0;
int desimal2 =  0;
```
lalu user di minta untuk menginput bilangan biner pertama 
```java
System.out.print("Masukkan bilangan biner Pertama : ");
biner1 =  sc.nextLine();
```
Setelah input dari user program akan menjalankan logika konversi untuk bilangan biner pertama,Logika konversi yang di jalankan adalah mengubah biner ke desimal agar lebih mudah saat penjumlahan atau apapun itu
```java
for(int i =  0; i <  biner1.length(); i++){
char bit =  biner1.charAt(biner1.length()-  1  - i);
if (bit ==  '1') {
desimal1 +=  1  << i;
}
}
```
Penjelasan : 
-   **Looping melalui Setiap Karakter Biner:**
    
    -   `for(int i = 0; i < biner.length(); i++)`  mengulangi proses ini untuk setiap karakter dalam string  `biner`, dimulai dari posisi paling kanan ke kiri (karena digit paling kanan mewakili nilai terkecil).
-   **Mengambil Karakter Biner dari Belakang:**
    
    -   `char bit = biner.charAt(biner.length() - 1 - i);`  mengambil karakter dari string  `biner`, dimulai dari karakter terakhir (`biner.length() - 1`) hingga karakter pertama (indeks  `0`). Ini memastikan bahwa konversi dimulai dari bit paling tidak signifikan ke bit paling signifikan.
-   **Mengonversi Karakter Biner ke Nilai Desimal:**
    
    -   **Jika  `bit`  adalah  `'1'`:**
        -   Program menambahkan nilai biner yang sesuai ke variabel  `desimal`  menggunakan operasi pergeseran bit (`<<`).
        -   `1 << i`  menggeser  `1`  ke kiri sebanyak  `i`  kali, yang sama dengan menaikkan  `2`  pangkat  `i`. Misalnya:
            -   Untuk  `i = 0`,  `1 << i`  menghasilkan  `1`.
            -   Untuk  `i = 1`,  `1 << i`  menghasilkan  `2`.
            -   Untuk  `i = 2`,  `1 << i`  menghasilkan  `4`.
        -   Setiap kali ada  `bit`  yang bernilai  `1`, nilai  `1 << i`  ditambahkan ke  `desimal`, sehingga jumlah total mewakili nilai desimal akhir dari biner.

Setelah itu user di  minta untuk menginput bilangan biner kedua
dan akan menjalankan logika konversi ke desimal seperti di atas,lalu program akan menghitung penjumlahan,pengurangan atau pengurangan.
```java
int jumlah = desimal1 + desimal2;
```
```java
int jumlah = desimal1 - desimal2;
```
```java
int jumlah = desimal1 * desimal2;
```
lalu program akan menjalakan `public  static  void  point4` dan akan menentukan tipe data serta variabel nya.
```java
String biner1,biner2;
String and =  ""; String or =  ""; String xor ="";
int andDesimal,orDesimal,xorDesimal;
int desimal1 =  0;
int desimal2 =  0;
```
Program akan meminta input user bilangan pertama 
```java
System.out.print("Masukkan Bilangan Biner Pertama : ");
biner1 =  sc.nextLine();
```
lalu akan program akan menjalakan logika konversi biner pertama ke desimal seperti di atas,setelah menjalakan logika konversi biner pertama,user akan di minta input biner kedua 
```java
System.out.print("Masukkan Bilangan Biner Kedua : ");
biner2 =  sc.nextLine();
```
dan akan program akan menjalakan logika konversi biner ke desimal lagi.
setelah itu,program akan menjalakan operator bitwise .
```java
andDesimal = desimal1 & desimal2;
orDesimal = desimal1 | desimal2;
xorDesimal = desimal1 ^ desimal2;
``` 
setelah menjalakan operator bitwise hasil operator bitwise desimal akan di konversikan ke biner
```javaif (andDesimal ==  0) {
and =  "0";
} else {
while (andDesimal >  0) {
and = (andDesimal %  2) + and;
andDesimal /=  2;
}
}
if (orDesimal ==  0) {
or =  "0";
} else {
while (orDesimal >  0) {\
or = (orDesimal %  2) + or;
orDesimal /=  2;
}
}
if (xorDesimal ==  0) {
xor =  "0";
} else {
while (xorDesimal >  0) {
xor = (xorDesimal %  2) + xor;
xorDesimal /=  2;
}
}
```
Penjelasan : 
-   **Pengecekan untuk Bilangan 0:**
    
    -   `if (andDesimal == 0) { and = "0"; }`:
        -   Jika `andDesimal` sama dengan `0`, maka string `and` diatur menjadi `"0"`. Ini menangani kasus khusus di mana bilangan desimal yang dikonversi adalah `0`, karena representasi biner dari `0` tetap `0`.
-   **Mengonversi Desimal ke Biner:**
    
    -   **Jika `andDesimal` tidak sama dengan `0`:**
        -   `while (andDesimal > 0)` memulai loop yang berlanjut selama `andDesimal` lebih besar dari `0`.
        -   **Proses dalam `while`:**
            -   `and = (andDesimal % 2) + and;`:
                -   Menghitung sisa pembagian `andDesimal` dengan `2` untuk mendapatkan digit biner (0 atau 1) dan menambahkannya ke string `and`. Ini dilakukan dengan menambahkan digit baru di depan string sehingga urutan digit biner dibangun dari bit paling signifikan ke paling tidak signifikan.
            -   `andDesimal /= 2;`:
                -   Mengurangi `andDesimal` dengan membaginya dengan `2`, yang menggeser bilangan ke kanan dalam representasi biner (setiap pembagian dengan `2` mengurangi satu bit dari bilangan tersebut).
-   **Pengulangan untuk `orDesimal` dan `xorDesimal`:**
    
    -   Logika yang sama diterapkan untuk `orDesimal` dan `xorDesimal`. Masing-masing bilangan desimal akan diperiksa apakah sama dengan `0`, dan jika tidak, akan dikonversi ke biner dengan cara yang sama.

Program akan menampilkan output operator bitwise dan program akan berhenti selesai.
```java
System.out.println("Hasil AND dari kedua biner = "  + and);
System.out.println("Hasil OR dari kedua biner = "  + or);
System.out.println("Hasil XOR dari kedua biner = "  + xor);
```
Lalu menampilkan output.
![enter image description here](https://i.postimg.cc/cLTWYkkd/image.png)
## Pengolahan Data Sensor
Program di mulai dengan menentukan tipe data dan variabel yang di butuhkan.
```java
double suhu;
int kelembapan;
int co2;
```
Program meminta input suhu,kelembapan dan CO2.
```java
System.out.println("Masukkan Suhu : ");
suhu =  sc.nextDouble();
System.out.println("Masukkan Kelembapan : ");
kelembapan =  sc.nextInt();
System.out.println("Masukkan CO2 : ");
co2 =  sc.nextInt();
```
lalu program akan menjalankan logika pembulatan
-   **Konversi ke Bilangan Bulat:**

    ```java
    int bulat = (int) suhu;
    ``` 
    
    -   `suhu` adalah variabel yang berisi nilai suhu dalam tipe data `double`, yang dapat mencakup angka desimal.
    -   `(int) suhu` adalah proses casting (konversi tipe) dari `double` ke `int`. Ini akan mengubah nilai `suhu` menjadi bilangan bulat dengan mengabaikan (truncating) bagian desimalnya.
    -   Misalnya, jika `suhu = 25.75`, maka setelah baris ini, `bulat` akan bernilai `25`.
-   **Menghitung Bagian Desimal:**

    ```java
    double bagianSuhu = suhu - bulat;
    ```
    
    -   Baris ini menghitung selisih antara nilai `suhu` dan bagian bulatnya (`bulat`).
    -   Hasil dari operasi ini adalah nilai desimal yang tersisa setelah bagian bulat.
    -   Dengan contoh sebelumnya, jika `suhu = 25.75`, maka `bagianSuhu` akan dihitung sebagai `25.75 - 25`, yang menghasilkan `0.75`.-  
-   **Konversi ke Bilangan Bulat:**
  
    ```java
    int bulat = (int) suhu;
    ``` 
    
    -   `suhu` adalah variabel yang berisi nilai suhu dalam tipe data `double`, yang dapat mencakup angka desimal.
    -   `(int) suhu` adalah proses casting (konversi tipe) dari `double` ke `int`. Ini akan mengubah nilai `suhu` menjadi bilangan bulat dengan mengabaikan (truncating) bagian desimalnya.
    -   Misalnya, jika `suhu = 25.75`, maka setelah baris ini, `bulat` akan bernilai `25`.
-   **Menghitung Bagian Desimal:**
-     
    ```java
    double bagianSuhu = suhu - bulat;
    ```
    
    -   Baris ini menghitung selisih antara nilai `suhu` dan bagian bulatnya (`bulat`).
    -   Hasil dari operasi ini adalah nilai desimal yang tersisa setelah bagian bulat.
    -   Dengan contoh sebelumnya, jika `suhu = 25.75`, maka `bagianSuhu` akan dihitung sebagai `25.75 - 25`, yang menghasilkan `0.75`.

Program akan menampilkan output suhu yang sudah di bulatkan dan input kelembapan serta CO2  yang tanpa di bulatkan karena cuma input suhu yang di bulatkan ,setelah itu input suhu yang sudah di bulatkan akan di konversi kan ke biner dan ke heksa seperti di **Konversi Bilangan** .

Lalu menampilkan output.
![enter image description here](https://i.postimg.cc/W43v7mxg/image.png)


## Operasi Enkripsi
Program di mulai dengan menentukan tipe dara dan variabel yang di butuhkan.
```java
String keyBiner =  "10101010";
int keyDesimal =  0;
```
Program akan mengkonversi key dari biner ke desimal seperti dengan logika sama persis di **Konversi Bilangan**,setelah itu Program akan meminta input user bilangan biner untuk di enkripsi.
```java
System.out.print("Masukkan bilangan biner untuk dienkripsi : ");
String biner =  sc.nextLine();
```
Program akan menjalankan konversi input user yang awalnya biner berubah ke desimal dengan logika sama seperti di atas,lalu program melalukan operasi XOR bitwise dengan key.
```java
int xor = desimal ^ keyDesimal;
```
Program akan mengkonversi hasil XOR ke biner atau bisa di bilang desimal ke biner dan ke heksa desimal dengan logika sama persis di **Konversi Bilangan**.
```java
String hasilBiner =  "";
int konvert = xor;
if (konvert ==  0) {
hasilBiner =  "0";
} else {
while (konvert >  0) {
hasilBiner = (konvert %  2) + hasilBiner;
konvert /=  2;
}
}
```
```java
String hasilHeks =  "";
konvert = xor;
if (konvert ==  0) {
hasilHeks =  "0";
} else {
String simbolHex =  "0123456789ABCDEF";
while (konvert >  0) {
hasilHeks =  simbolHex.charAt(konvert %  16 ) + hasilHeks;
konvert /=  16;
}
}
```
Program akan menampilkan output. 
![enter image description here](https://i.postimg.cc/XqwSvsyS/image.png)
