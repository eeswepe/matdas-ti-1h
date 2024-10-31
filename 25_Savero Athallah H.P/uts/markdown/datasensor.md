```DATA SENSOR```
```java
String[] data  =  {"Suhu",  "Kelembapan",  "CO2"};

for(int  i  =  0; i <  data.length; i++) {
Scanner  sc  =  new  Scanner(System.in);
System.out.print("Masukkan nilai "  + data[i] +  " : ");
double  dataInput  =  sc.nextDouble();
```
Looping dilakukan untuk melakukan input 3 data yang dimaksukkan yaitu suhu, kelembapan, dan CO2

```java
int  inputBulat  = (int) dataInput;
double  hasilKoma  = dataInput - inputBulat;

if (hasilKoma >=  0.5) {
inputBulat++;
}  else  {
inputBulat--;
}
```
Kode untuk membulatkan sebuah input dengan tipe data `double`, dengan cara membuat variabel `inputBulat`dengan tipe data int untuk menyimpan `dataInput` yang dicasting menjadi int
`hasilKoma` digunakan untuk menyimpan bilangan koma yang ada di suatu bilangan.
Pengondisian digunakan untuk menentukan apakah `dataInput`dibulatkan ke atas ataupun ke bawah.

```java
String  konversiBiner  =  desimalToBiner(inputBulat);
System.out.println("Konversi data ke biner : "  + konversiBiner);

String  konversiHexa  =  decimalToHexadecimal(inputBulat);
System.out.println("Konversi data ke hexadecimal : "  + konversiHexa);
```
Memanfaatkan function `decimalToBiner()` dan `decimalToHexadecimal`yang ada di program" sebelumnya untuk mengkonversi data ke biner dan ke hexadecimal