***OPERASI BINER***
Program ini menangani operasi aritmatika dua bilangan biner, dengan memanfaatkan fungsi `binaryToDecimal()`dan `desimalToBiner()` dari program sebelumnya. Program ini bisa jadi lebih mudah untuk dijalankan

```java
public  static  String  aritmatikaBiner  (String  biner1,  char  operasi,  String  biner2)  {

int  desimal1  =  binaryToDecimal(biner1);
int  desimal2  =  binaryToDecimal(biner2);
int  operasiDesimal  =  0;

switch (operasi) {
case  '*':
operasiDesimal = desimal1 * desimal2;
break;
case  '+':
operasiDesimal = desimal1 + desimal2;
break;
case  '-':
operasiDesimal = desimal1 - desimal2;
break;
case  '&':
operasiDesimal = desimal1 & desimal2;
break;
case  '|':
operasiDesimal = desimal1 | desimal2;
break;
case  '^':
operasiDesimal = desimal1 ^ desimal2;
default:
System.out.println("Operasi tidak valid!");
return  "";
}
String  hasilBiner  =  desimalToBiner(operasiDesimal);
System.out.println(biner1 +  " "  + operasi +  " "  + biner2 +  " = "  + hasilBiner);
return hasilBiner;
}
```
Function diatas memiliki parameter  String `biner1`, char `operasi`dan String `biner2` yang diambil dari input user.

```java
int  desimal1  =  binaryToDecimal(biner1);
int  desimal2  =  binaryToDecimal(biner2);
int  operasiDesimal  =  0;
```
kedua String `biner` dikonversi menjadi desimal terlebih dahulu
lalu baru dihitung menggunakan operasi aritmatika bilangan desimal untuk mempermudah operasi hitung.

```java
switch (operasi) {
case  '*':
operasiDesimal = desimal1 * desimal2;
break;
case  '+':
operasiDesimal = desimal1 + desimal2;
break;
case  '-':
operasiDesimal = desimal1 - desimal2;
break;
case  '&':
operasiDesimal = desimal1 & desimal2;
break;
case  '|':
operasiDesimal = desimal1 | desimal2;
break;
case  '^':
operasiDesimal = desimal1 ^ desimal2;
default:
System.out.println("Operasi tidak valid!");
return  "";
}
```
variabel `operasiDesimal` akan dieksekusi sesuai input `operasi` dari user menggunakan switch case. 
```java
String  hasilBiner  =  desimalToBiner(operasiDesimal);
System.out.println(biner1 +  " "  + operasi +  " "  + biner2 +  " = "  + hasilBiner);
return hasilBiner;
```
Setelah menentukan `operasiDesimal`, buat String baru `hasilBiner` untuk menyimpan hasil konversi untuk kembali menjadi biner menggunakan function `desimalToBiner()` dan function ini mengembalikan `hasilBiner()`

```java
Scanner  sc  =  new  Scanner(System.in);
String  biner1,  biner2;
System.out.print("Masukkan angka biner pertama : ");
biner1 =  sc.next();
System.out.print("Masukkan operasi hitung : ");
char  operasi  =  sc.next().charAt(0);
System.out.print("Masukkan angka biner kedua : ");
biner2 =  sc.next();
aritmatikaBiner(biner1, operasi, biner2);
```
Melakukan Input untuk `biner1`, `operasi`, dan `biner2` lalu menjalankan function `aritmatikaBiner()`