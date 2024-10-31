# Program Konversi Bilangan Desimal

  ## Proses konversi

### Konversi bilangan desimal ke biner
``` java
public  static  String desimalKeBiner(int  desimal) {

String  biner  =  "";
if (desimal  ==  0) return  "0";
while (desimal  >  0) {
biner=(desimal  %  2)+biner;
desimal  /=  2;
}
return  biner;
}
```
  ### Penjelasan

Program tersebut adalah sebuah metode dalam Java yang mengkonversi bilangan desimal (basis 10) menjadi bilangan biner (basis 2). Berikut adalah penjelasan langkah demi langkah tentang cara kerja program tersebut:

1.  **Deklarasi Metode**:
    
    -   `public static String desimalKeBiner(int desimal)`: Metode ini bersifat publik dan statis, menerima satu parameter bertipe `int` yang merupakan bilangan desimal yang akan dikonversi. Metode ini mengembalikan hasil konversi dalam bentuk `String`.
2.  **Inisialisasi String Biner**:
    
    -   `String biner = "";`: Variabel `biner` diinisialisasi sebagai string kosong yang akan digunakan untuk menyimpan hasil konversi.
3.  **Penanganan Kasus Khusus**:
    
    -   `if (desimal == 0) return "0";`: Jika nilai desimal yang diberikan adalah 0, maka metode akan langsung mengembalikan string "0", karena dalam biner, 0 juga ditulis sebagai 0.
4.  **Proses Konversi**:
    
    -   `while (desimal > 0)`: Selama nilai desimal lebih besar dari 0, program akan terus melakukan konversi.
        -   `biner = (desimal % 2) + biner;`: Menghitung sisa hasil bagi `desimal` dengan 2 (`desimal % 2`), yang akan memberikan digit biner terakhir. Digit ini ditambahkan di depan string `biner` untuk membentuk urutan yang benar.
        -   `desimal /= 2;`: Membagi nilai desimal dengan 2 untuk mempersiapkan iterasi berikutnya.
5.  **Pengembalian Hasil**:
    
    -   `return biner;`: Setelah loop selesai (ketika `desimal` menjadi 0), metode mengembalikan string `biner` yang berisi representasi biner dari bilangan desimal yang diberikan.

### Konversi bilangan desimal ke hexadesimal
``` java
public  static  String  desimalKeHexadesimal(int  desimal) {
String  hexadesimal  =  "";
char[] hexChars  = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
if (desimal  ==  0) return  "0";
while (desimal  >  0) {
hexadesimal=hexChars[desimal  %  16]+hexadesimal;
desimal  /=  16;
}
return  hexadesimal;
}
```
### Penjelasan 

Program tersebut adalah sebuah metode dalam Java yang mengkonversi bilangan desimal (basis 10) menjadi bilangan heksadesimal (basis 16). Berikut adalah penjelasan tentang cara kerja program tersebut:

1.  **Deklarasi Metode**:
    
    -   `public static String desimalKeHexadesimal(int desimal)`: Metode ini bersifat publik dan statis, menerima satu parameter bertipe `int` yang merupakan bilangan desimal yang akan dikonversi. Metode ini mengembalikan hasil konversi dalam bentuk `String`.
2.  **Inisialisasi String Heksadesimal**:
    
    -   `String hexadesimal = "";`: Variabel `hexadesimal` diinisialisasi sebagai string kosong yang akan digunakan untuk menyimpan hasil konversi.
3.  **Karakter Heksadesimal**:
    
    -   `char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};`: Array `hexChars` berisi karakter-karakter yang merepresentasikan digit heksadesimal dari 0 hingga 9 dan A hingga F.
4.  **Penanganan Kasus Khusus**:
    
    -   `if (desimal == 0) return "0";`: Jika nilai desimal yang diberikan adalah 0, maka metode akan langsung mengembalikan string "0", karena dalam heksadesimal, 0 juga ditulis sebagai 0.
5.  **Proses Konversi**:
    
    -   `while (desimal > 0)`: Selama nilai desimal lebih besar dari 0, program akan terus melakukan konversi.
        -   `hexadesimal = hexChars[desimal % 16] + hexadesimal;`: Menghitung sisa hasil bagi `desimal` dengan 16 (`desimal % 16`). Hasil ini digunakan sebagai indeks untuk mengambil karakter dari array `hexChars`. Karakter tersebut ditambahkan di depan string `hexadesimal` untuk membentuk urutan yang benar.
        -   `desimal /= 16;`: Membagi nilai desimal dengan 16 untuk mempersiapkan iterasi berikutnya.
6.  **Pengembalian Hasil**:
    
    -   `return hexadesimal;`: Setelah loop selesai (ketika `desimal` menjadi 0), metode mengembalikan string `hexadesimal` yang berisi representasi heksadesimal dari bilangan desimal yang diberikan.
### Konversi Biner ke Desimal
``` java
public  static  int  binerKeDesimal(String  biner) {
int  desimal  =  0;
for (int  i  =  0; i  <  biner.length(); i++) {
desimal  =  desimal  *  2  + (biner.charAt(i) -  '0');
}
return  desimal;
}
```
### Penjelasan

Program tersebut adalah sebuah metode dalam Java yang mengkonversi bilangan biner (basis 2) yang diberikan dalam bentuk string menjadi bilangan desimal (basis 10). Berikut adalah penjelasan tentang cara kerja program tersebut:

1.  **Deklarasi Metode**:
    
    -   `public static int binerKeDesimal(String biner)`: Metode ini bersifat publik dan statis, menerima satu parameter bertipe `String` yang merupakan representasi biner yang akan dikonversi. Metode ini mengembalikan hasil konversi dalam bentuk `int`.
2.  **Inisialisasi Variabel Desimal**:
    
    -   `int desimal = 0;`: Variabel `desimal` diinisialisasi dengan nilai 0. Variabel ini akan digunakan untuk menyimpan hasil konversi dari biner ke desimal.
3.  **Proses Konversi**:
    
    -   `for (int i = 0; i < biner.length(); i++)`: Loop ini akan mengiterasi setiap karakter dalam string `biner`.
        -   `desimal = desimal * 2 + (biner.charAt(i) - '0');`: Dalam setiap iterasi:
            -   `biner.charAt(i)` mengambil karakter ke-i dari string biner.
            -   `(biner.charAt(i) - '0')` mengkonversi karakter biner (yang berupa '0' atau '1') menjadi nilai integer (0 atau 1).
            -   `desimal * 2` menggeser nilai desimal ke kiri (mengalikan dengan 2) untuk memberi ruang bagi digit biner berikutnya.
            -   Hasil penjumlahan memberikan nilai desimal yang terupdate berdasarkan digit biner yang sedang diproses.
4.  **Pengembalian Hasil**:
    
    -   `return desimal;`: Setelah loop selesai (setelah semua digit biner diproses), metode mengembalikan nilai `desimal`, yang merupakan representasi desimal dari string biner yang diberikan.
### Konversi Biner ke  Hexadesimal
```java
public  static  String  binerKeHexadesimal(String  biner) {
int  desimal  =  binerKeDesimal(biner);
return  desimalKeHexadesimal(desimal);
}
```
### Penjelasan
Program tersebut adalah sebuah metode dalam Java yang mengkonversi bilangan biner (basis 2) yang diberikan dalam bentuk string menjadi bilangan heksadesimal (basis 16). Berikut adalah penjelasan tentang cara kerja program tersebut:

1.  **Deklarasi Metode**:
    
    -   `public static String binerKeHexadesimal(String biner)`: Metode ini bersifat publik dan statis, menerima satu parameter bertipe `String` yang merupakan representasi biner yang akan dikonversi. Metode ini mengembalikan hasil konversi dalam bentuk `String`.
2.  **Konversi Biner ke Desimal**:
    
    -   `int desimal = binerKeDesimal(biner);`: Metode ini memanggil metode lain, `binerKeDesimal`, untuk mengkonversi string biner menjadi bilangan desimal. Hasil konversi disimpan dalam variabel `desimal`.
3.  **Konversi Desimal ke Heksadesimal**:
    
    -   `return desimalKeHexadesimal(desimal);`: Setelah mendapatkan nilai desimal, metode ini memanggil metode lain, `desimalKeHexadesimal`, untuk mengkonversi bilangan desimal tersebut menjadi heksadesimal. Hasil konversi dikembalikan sebagai output metode `binerKeHexadesimal`.

### Konversi Hexadesimal ke Desimal
``` java
public  static  int  hexadesimalKeDesimal(String  hexadesimal) {
return  Integer.parseInt(hexadesimal, 16);
}
```
### Penjelasan
Program tersebut adalah sebuah metode dalam Java yang mengkonversi bilangan heksadesimal (basis 16) yang diberikan dalam bentuk string menjadi bilangan desimal (basis 10). Berikut adalah penjelasan tentang cara kerja program tersebut:

1.  **Deklarasi Metode**:
    
    -   `public static int hexadesimalKeDesimal(String hexadesimal)`: Metode ini bersifat publik dan statis, menerima satu parameter bertipe `String` yang merupakan representasi heksadesimal yang akan dikonversi. Metode ini mengembalikan hasil konversi dalam bentuk `int`.
2.  **Konversi Menggunakan `Integer.parseInt`**:
    
    -   `return Integer.parseInt(hexadesimal, 16);`: Metode ini menggunakan fungsi `parseInt` dari kelas `Integer` untuk melakukan konversi.
        -   Parameter pertama adalah string `hexadesimal` yang ingin dikonversi.
        -   Parameter kedua adalah 16, yang menunjukkan bahwa string tersebut adalah dalam basis heksadesimal.
### Konversi Hexadesimal ke Biner
``` java
public  static  String  hexadesimalKeBiner(String  hexadesimal) {
int  desimal  =  hexadesimalKeDesimal(hexadesimal);
return  desimalKeBiner(desimal);
}
```
### Penjelasan 
Program tersebut adalah sebuah metode dalam Java yang mengkonversi bilangan heksadesimal (basis 16) yang diberikan dalam bentuk string menjadi bilangan biner (basis 2). Berikut adalah penjelasan tentang cara kerja program tersebut:

1.  **Deklarasi Metode**:
    
    -   `public static String hexadesimalKeBiner(String hexadesimal)`: Metode ini bersifat publik dan statis, menerima satu parameter bertipe `String` yang merupakan representasi heksadesimal yang akan dikonversi. Metode ini mengembalikan hasil konversi dalam bentuk `String`.
2.  **Konversi Heksadesimal ke Desimal**:
    
    -   `int desimal = hexadesimalKeDesimal(hexadesimal);`: Metode ini memanggil metode lain, `hexadesimalKeDesimal`, untuk mengkonversi string heksadesimal menjadi bilangan desimal. Hasil konversi disimpan dalam variabel `desimal`.
3.  **Konversi Desimal ke Biner**:
    
    -   `return desimalKeBiner(desimal);`: Setelah mendapatkan nilai desimal, metode ini memanggil metode lain, `desimalKeBiner`, untuk mengkonversi bilangan desimal tersebut menjadi biner. Hasil konversi dikembalikan sebagai output metode `hexadesimalKeBiner`.
## Program Input & Output
```java
public  static  void  main(String[] args) {
Scanner  scanner  =  new  Scanner(System.in);
while (true) {
System.out.println("\nPilih menu konversi:");
System.out.println("1. Desimal ke Biner dan Hexadesimal");
System.out.println("2. Biner ke Desimal dan Hexadesimal");
System.out.println("3. Hexadesimal ke Desimal dan Biner");
System.out.println("4. Keluar");
System.out.print("\nMasukkan pilihan (1-4): ");
int  pilihan  =  scanner.nextInt();
Scanner.nextLine(); // Membersihkan newline
switch (pilihan) {
case  1:
System.out.print("Masukkan bilangan desimal: ");
int  desimal  =  scanner.nextInt();
System.out.println("Biner: "  +  desimalKeBiner(desimal));
System.out.println("Hexadesimal: "  +  desimalKeHexadesimal(desimal));
break;
case  2:
System.out.print("Masukkan bilangan biner: ");
String  biner  =  scanner.nextLine();
System.out.println("Desimal: "  +  binerKeDesimal(biner));
System.out.println("Hexadesimal: "  +  binerKeHexadesimal(biner));
break;
case  3:
System.out.print("Masukkan bilangan hexadesimal: ");
String  hexadesimal  =  scanner.nextLine();
System.out.println("Desimal: "  +  hexadesimalKeDesimal(hexadesimal));
System.out.println("Biner: "  +  hexadesimalKeBiner(hexadesimal));
break;
case  4:
System.out.println("Program selesai.");
scanner.close();
return;
default:
System.out.println("Pilihan tidak valid. Silakan coba lagi.");
}
}
}
```
### Penjelasan
Program tersebut adalah aplikasi konsol dalam Java yang memungkinkan pengguna untuk melakukan konversi antara bilangan desimal, biner, dan heksadesimal. Berikut adalah penjelasan tentang cara kerja program ini:

1.  **Import Scanner**:
    
    -   Meskipun tidak ditunjukkan dalam potongan kode, program ini biasanya dimulai dengan `import java.util.Scanner;` untuk memungkinkan penggunaan kelas `Scanner`, yang digunakan untuk mengambil input dari pengguna.
2.  **Metode `main`**:
    
    -   `public static void main(String[] args)`: Ini adalah metode utama yang menjadi titik awal eksekusi program.
3.  **Inisialisasi Scanner**:
    
    -   `Scanner scanner = new Scanner(System.in);`: Membuat objek `Scanner` untuk membaca input dari konsol.
4.  **Loop Utama**:
    
    -   `while (true)`: Memulai loop tak terbatas, yang akan terus meminta input dari pengguna hingga pengguna memilih untuk keluar.
5.  **Menu Pilihan**:
    
    -   Program mencetak menu pilihan konversi:
        -   1.  Desimal ke Biner dan Heksadesimal
        -   2.  Biner ke Desimal dan Heksadesimal
        -   3.  Heksadesimal ke Desimal dan Biner
        -   4.  Keluar
6.  **Mengambil Pilihan Pengguna**:
    
    -   `int pilihan = scanner.nextInt();`: Mengambil input pilihan dari pengguna.
    -   `scanner.nextLine();`: Membersihkan newline setelah membaca pilihan.
7.  **Switch Case**:
    
    -   Program menggunakan `switch` untuk menangani pilihan pengguna:
        -   **Kasus 1**: Jika pengguna memilih untuk mengonversi desimal ke biner dan heksadesimal:
            -   Mengambil input desimal dari pengguna dan mencetak hasil konversi ke biner dan heksadesimal menggunakan metode `desimalKeBiner` dan `desimalKeHexadesimal`.
        -   **Kasus 2**: Jika pengguna memilih untuk mengonversi biner ke desimal dan heksadesimal:
            -   Mengambil input biner dari pengguna dan mencetak hasil konversi ke desimal dan heksadesimal menggunakan metode `binerKeDesimal` dan `binerKeHexadesimal`.
        -   **Kasus 3**: Jika pengguna memilih untuk mengonversi heksadesimal ke desimal dan biner:
            -   Mengambil input heksadesimal dari pengguna dan mencetak hasil konversi ke desimal dan biner menggunakan metode `hexadesimalKeDesimal` dan `hexadesimalKeBiner`.
        -   **Kasus 4**: Jika pengguna memilih untuk keluar:
            -   Mencetak pesan "Program selesai." dan menutup `Scanner` sebelum keluar dari program.
        -   **Default**: Jika pengguna memasukkan pilihan yang tidak valid, program akan memberikan pesan kesalahan dan meminta pengguna untuk mencoba lagi.