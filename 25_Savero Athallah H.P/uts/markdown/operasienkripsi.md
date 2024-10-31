***OPERASI ENKRIPSI***
```java
System.out.print("Masukkan pesan dasar : ");
String  pesanDasar  =  sc.next();
String  kunci  =  "10101010";
String  operasiXOR  =  "";
StringBuilder  hasilBiner  =  new  StringBuilder();

int  angka1,  angka2;
```
Program dimulai dengan menginput pesan dasar yang akan dienkripsi, dan mendeklarasikan variabel yang dibutuhkan.

```java
if (pesanDasar.length()  ==  kunci.length()) {

for(int  i  =  0; i <  pesanDasar.length();i++) {
angka1 =  Character.getNumericValue(pesanDasar.charAt(i));
angka2 =  Character.getNumericValue(kunci.charAt(i));

int  hasilXOR  = angka1 ^ angka2;
operasiXOR += hasilXOR;
hasilBiner.append(hasilXOR);

}
```
Jika panjang `pesanDasar`sama dengan `kunci` maka looping akan dijalankan, method `Character.getNumericValue()`berfungsi untuk mengubah char pada string menjadi sebuah nilai dengan tipe data integer. 
Setelah diubah menjadi integer, variabel `angka1` dan `angka2`dilakukan operasi XOR (^) dan disimpan di variabel `hasilXOR`lalu disimpan di variabel `operasiXOR` setiap iterasi.

```java
System.out.println("\nHasil Enkripsi (Biner) "  + operasiXOR);
String  hasilEnkripsiBiner  =  hasilBiner.toString();

// Konversi hasil biner ke heksadesimal

int  hasilDesimal  =  binaryToDecimal(hasilEnkripsiBiner);
String  hasilHex  =  decimalToHexadecimal(hasilDesimal);
System.out.println("Hasil Enkripsi (Heksadesimal): "  + hasilHex);
}  else  {
System.out.println("Panjang pesan dasar harus sama dengan panjang kunci (8 bit).");

}
```
Mengubah variabel `hasilBiner`menjadi String supaya function konversi bisa dijalankan dengan memanfaatkan function `binaryToDecimal()` dan `decimalToHexadecimal()`untuk menampilkan hasil enkripsi dalam heksadesimal.
