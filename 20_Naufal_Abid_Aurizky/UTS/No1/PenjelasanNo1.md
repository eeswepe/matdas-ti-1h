## Penjelasan kode pemrograman (UTS NO 1)

```
System.out.println("Pilih konversi yang diinginkan:");

```
* Baris ini mencetak pesan ke layar yang menginformasikan pengguna bahwa mereka diminta memilih jenis konversi yang diinginkan.

```
System.out.println("1. Desimal ke Biner dan Heksadesimal");
System.out.println("2. Biner ke Desimal dan Heksadesimal");
System.out.println("3. Heksadesimal ke Desimal dan Biner");
```
* Ketiga baris ini menampilkan pilihan konversi yang tersedia dan setiap pilihan ditampilkan dalam urutan angka :

    Pilihan 1: Mengonversi dari Desimal ke Biner dan Heksadesimal.  
    Pilihan 2: Mengonversi dari Biner ke Desimal dan Heksadesimal.  
    Pilihan 3: Mengonversi dari Heksadesimal ke Desimal dan Biner.

```
System.out.print("Masukkan pilihan (1-3): ");
```
* Baris ini mencetak pesan tanpa menambahkan baris baru, sehingga kursor tetap berada di sebelah kanan teks. Ini memberikan tempat bagi pengguna untuk memasukkan angka sesuai pilihan mereka.

```
int pilihan = sc.nextInt();
```
* Pada baris ini, program menunggu input dari pengguna dalam bentuk bilangan bulat (integer) dan menyimpannya dalam variabel pilihan.
* Variabel pilihan akan digunakan untuk menentukan operasi konversi yang akan dilakukan program, sesuai dengan pilihan yang dimasukkan (1, 2, atau 3).

```
switch (pilihan) {
```
* switch memeriksa nilai pilihan, yaitu input dari pengguna yang mengindikasikan jenis konversi yang ingin dilakukan (Desimal ke Biner/Heksadesimal, Biner ke Desimal/Heksadesimal, atau Heksadesimal ke Desimal/Biner).

## Case 1: Konversi dari Desimal ke Biner dan Heksadesimal
```
case 1:
    System.out.print("Masukkan angka desimal: ");
    int desimal = sc.nextInt();
    System.out.println("Biner: " + desimalToBiner(desimal));
    System.out.println("Heksadesimal: " + desimalToHex(desimal));
    break;
```
* case 1 dipilih jika pengguna memasukkan angka 1 sebagai pilihan.
* Program meminta input angka desimal dari pengguna (sc.nextInt()).
* Konversi ke Biner: Program memanggil metode desimalToBiner() dengan argumen desimal, mengonversi angka desimal ke bentuk biner, lalu menampilkan hasilnya.
* Konversi ke Heksadesimal: Program memanggil metode desimalToHex() dengan argumen desimal, mengonversi angka desimal ke bentuk heksadesimal, lalu menampilkan hasilnya.
* break mengakhiri blok case 1 setelah menjalankan perintah di dalamnya.

## Case 2: Konversi dari Biner ke Desimal dan Heksadesimal
```
case 2:
    System.out.print("Masukkan angka biner: ");
    String biner = sc.next();
    System.out.println("Desimal: " + binerToDesimal(biner));
    System.out.println("Heksadesimal: " + desimalToHex(binerToDesimal(biner)));
    break;

```
* case 2 dipilih jika pengguna memasukkan angka 2 sebagai pilihan.
* Program meminta input angka biner sebagai String dari pengguna (sc.next()).
* Konversi ke Desimal: Program memanggil metode binerToDesimal() untuk mengonversi angka biner ke desimal dan menampilkan hasilnya.
* Konversi ke Heksadesimal: Program pertama-tama mengonversi biner ke desimal menggunakan binerToDesimal(biner), lalu mengonversi hasil desimal tersebut ke heksadesimal menggunakan desimalToHex(), kemudian menampilkan hasil akhirnya.
* break mengakhiri blok case 2.
## Case 3: Konversi dari Heksadesimal ke Desimal dan Biner
```
case 3:
    System.out.print("Masukkan angka heksadesimal: ");
    String heksadesimal = sc.next();
    System.out.println("Desimal: " + hexToDesimal(heksadesimal));
    System.out.println("Biner: " + desimalToBiner(hexToDesimal(heksadesimal)));
    break;

```
* case 3 dipilih jika pengguna memasukkan angka 3 sebagai pilihan.
* Program meminta input angka heksadesimal sebagai String dari pengguna (sc.next()).
* Konversi ke Desimal: Program memanggil metode hexToDesimal() untuk mengonversi angka heksadesimal ke desimal, lalu menampilkan hasilnya.
* Konversi ke Biner: Program pertama-tama mengonversi heksadesimal ke desimal menggunakan hexToDesimal(heksadesimal), kemudian mengonversi hasil desimal tersebut ke biner menggunakan desimalToBiner(), lalu menampilkan hasil akhirnya.
* break mengakhiri blok case 3.
## Default Case: Pilihan Tidak Valid
```
default:
    System.out.println("Pilihan tidak valid.");
```
* default dijalankan jika pilihan tidak cocok dengan angka 1, 2, atau 3, menunjukkan bahwa input pengguna tidak valid. Program akan menampilkan pesan "Pilihan tidak valid.".
## Menutup Scanner 
```
sc.close();
```
* sc.close() menutup scanner sc setelah semua operasi selesai untuk membebaskan sumber daya.
## Konversi Desimal ke Biner
```
public static String desimalToBiner(int desimal) {
    StringBuilder biner = new StringBuilder();
    while (desimal > 0) {
        biner.insert(0, desimal % 2);
        desimal /= 2;
    }
    return biner.length() > 0 ? biner.toString() : "0";
}
```
* Fungsi: Mengonversi angka desimal (int) ke bentuk biner (String).
* Logika:
    * desimal % 2 digunakan untuk mendapatkan sisa pembagian (0 atau 1), yaitu bit paling rendah dari bilangan desimal. Nilai ini ditambahkan di awal string biner menggunakan biner.insert(0, desimal % 2).
    * desimal /= 2 membagi desimal dengan 2 untuk menggeser bit ke kanan dan mempersiapkan perhitungan bit berikutnya.
    * Proses berlanjut hingga desimal menjadi 0.
* Return Value: Jika panjang biner lebih dari 0, hasil konversi dikembalikan. Jika desimal awalnya 0, maka fungsi mengembalikan string "0".
## Konversi Desimal ke Heksadesimal
```
public static String desimalToHex(int desimal) {
    StringBuilder hex = new StringBuilder();
    char[] hexDigits = "0123456789ABCDEF".toCharArray();
    while (desimal > 0) {
        hex.insert(0, hexDigits[desimal % 16]);
        desimal /= 16;
    }
    return hex.length() > 0 ? hex.toString() : "0";
}
```
* Fungsi: Mengonversi angka desimal (int) ke bentuk heksadesimal (String).
* Logika:
    * desimal % 16 memberikan sisa pembagian dengan 16, yang menghasilkan nilai 0–15. Array hexDigits digunakan untuk memilih karakter heksadesimal yang sesuai untuk setiap nilai.
    * hex.insert(0, hexDigits[desimal % 16]) menyisipkan karakter hasil konversi ke awal string hex.
    * desimal /= 16 menggeser bit dengan membagi desimal dengan 16 dan mengulangi proses untuk setiap digit heksadesimal.
* Return Value: Jika panjang hex lebih dari 0, hasil konversi dikembalikan. Jika desimal awalnya 0, fungsi mengembalikan string "0".
## Konversi Biner ke Desimal
```
public static int binerToDesimal(String biner) {
    int desimal = 0;
    for (int i = 0; i < biner.length(); i++) {
        desimal = desimal * 2 + (biner.charAt(i) - '0');
    }
    return desimal;
}
```
* Fungsi: Mengonversi bilangan biner dalam bentuk String ke bilangan desimal (int).
* Logika:
    * desimal = desimal * 2 + (biner.charAt(i) - '0'): Untuk setiap digit biner dari kiri ke kanan, desimal dikalikan 2 (untuk menggandakan posisi nilai saat berpindah tempat) dan kemudian menambahkan nilai dari digit biner ('0' atau '1').
    * biner.charAt(i) - '0': Mengonversi karakter '0' atau '1' menjadi integer (0 atau 1).
* Return Value: Setelah semua digit biner dikonversi, nilai akhir desimal dikembalikan.
## Konversi Heksadesimal ke Desimal
```
public static int hexToDesimal(String hex) {
    int desimal = 0;
    char[] hexDigits = "0123456789ABCDEF".toCharArray();
    for (int i = 0; i < hex.length(); i++) {
        char c = Character.toUpperCase(hex.charAt(i));
        int nilai = 0;
        for (int j = 0; j < hexDigits.length; j++) {
            if (c == hexDigits[j]) {
                nilai = j;
                break;
            }
        }
        desimal = desimal * 16 + nilai;
    }
    return desimal;
}
```
* Fungsi: Mengonversi bilangan heksadesimal dalam bentuk String ke bilangan desimal (int).
* Logika:
    * Character.toUpperCase(hex.charAt(i)): Mengonversi karakter heksadesimal saat ini menjadi huruf besar (untuk standar).
    * Loop Nested: Loop kedua (for) mencocokkan karakter dengan hexDigits, menetapkan nilai desimal yang sesuai ke nilai.
    * desimal = desimal * 16 + nilai: Untuk setiap digit heksadesimal, desimal dikalikan 16 untuk menyiapkan tempat desimal dan ditambahkan nilai yang sesuai.
* Return Value: Setelah semua karakter heksadesimal dikonversi, desimal akhir dikembalikan.