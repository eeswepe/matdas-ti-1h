## SISTEM BILANGAN

  
  
  

Konversi Bilangan


```

1. Membuat Function Konversi

- Desimal ke Biner

```java

private static String desimalToBiner(int desimal) {

StringBuilder biner = new StringBuilder();

while (desimal > 0) {

biner.append(desimal % 2);

desimal /= 2;

}

return biner.reverse().toString();

}```

```

Penjelasan :

function tersebut memiliki 1 paramater yaitu desimal yang diinputkan oleh user

```java

StringBuilder biner = new StringBuilder();

```

mendeklarasikan variabel `biner` dengan tipe data StringBuilder, tujuannya supaya String tersebut bisa dioperasikan seperti ditambah dengan method ''.append''

  

```java

while (desimal > 0)

{  biner.append(desimal % 2);

desimal /= 2;  }

```

selama input `desimal` lebih dari 0, sisa pembagian akan terus ditambah ke dalam variabel biner dan desimal akan terus dibagi 2.

```java

return biner.reverse().toString();

```

fungsi ini mengembalikan nilai variabel `biner` yang di reverse sehingga sesuai dengan ketentuan konversi yaitu diawali oleh most significant bit (MSB) dan diakhiri oleh least significant bit (LSB)

  

method ".toString()" untuk mengubah nilai integer menjadi string

  

- Desimal ke Heksadesimal

```java

private static String decimalToHexadecimal(int desimal) {

StringBuilder heksadesimal = new StringBuilder();

String hexChars = "0123456789ABCDEF";

while (desimal > 0) {

heksadesimal.append(hexChars.charAt(desimal % 16));

desimal /= 16;

}

return heksadesimal.reverse().toString();

}

```

```java

String hexChars = "0123456789ABCDEF";```

```

Hampir sama dengan konversi biner ke desimal, perbedaannya :

1. perlu inisiasi nilai variabel `hexChars` yang berisi elemen digit dalam heksadesimal.

  

```java

while (desimal > 0) 
{  heksadesimal.append(hexChars.charAt(desimal % 16)); desimal /= 16;  }

```

Selama nilai `desimal` lebih dari 0, kode ini mengambil sisa hasil pembagian `desimal % 16`, kemudian memilih karakter heksadesimal yang sesuai dari `hexChars` menggunakan `charAt`. Karakter tersebut ditambahkan ke variabel `heksadesimal`, dan `desimal` dibagi 16 untuk perulangan berikutnya.

  

- Biner ke Desimal

```java

private static int binaryToDecimal(String biner) {
int desimal = 0;
int pangkat = biner.length()-1;

for (int i = 0; i < biner.length(); i++) {
int digit = biner.charAt(i) - '0';
desimal+= digit * Math.pow(2, pangkat);
pangkat--;
}
return desimal;

}

```

Function ini memiliki parameter `biner` dengan tipe data String yang diinputkan oleh user

[![IMG-20241031-202627.jpg](https://i.postimg.cc/fb4t80XH/IMG-20241031-202627.jpg)](https://postimg.cc/9DpQM0LT)

Sesuai dengan Rumus Konversi Radiks-r ke desimal, inisiasi terlebih dahulu variabel `pangkat` menjadi panjang input biner dikurangi 1 untuk mendapatkan indeks terakhir dari sebuah radiks (karena indeks diurutkan mulai dari kanan)

  

```java

for (int  i = 0; i < biner.length(); i++) {
int  digit = biner.charAt(i) - '0';
desimal+= digit * Math.pow(2, pangkat);
pangkat--;
}

```

**`digit`** dihitung dengan mengambil karakter pada posisi `i` dalam `biner` dan mengonversinya menjadi integer. Karena `charAt(i)` menghasilkan karakter `'0'` atau `'1'`, maka mengurangi `'0'` mengubahnya menjadi angka `0` atau `1`.

**`desimal`** ditambah dengan hasil perkalian `digit` dengan `2` pangkat `pangkat`. **`pangkat`** adalah variabel yang berfungsi sebagai eksponen untuk basis 2, dan nilainya dikurangi satu setiap iterasi.

  

- Heksadesimal ke Desimal

```java

private static int hexadecimalToDecimal(String heksadesimal) {

int desimal = 0;
int pangkat = heksadesimal.length() - 1;

for (int i = 0; i < heksadesimal.length(); i++) {
char c = heksadesimal.charAt(i);
int digit;
if (c >= '0' && c <= '9') {
digit = c - '0';
}
else if (c >= 'A' && c <= 'F') {
digit = c - 'A' + 10;
}
else if (c >= 'a' && c <= 'f') {
digit = c - 'a' + 10;
} else {
throw new IllegalArgumentException("karakter heksadesimal tidak valid!: " + c);
}

desimal += digit * Math.pow(16, pangkat);
pangkat--;

}

return desimal;

}

```

```java

for (int i = 0; i < heksadesimal.length(); i++)

{ char c = heksadesimal.charAt(i); int digit;

```

Perulangan `for` dimulai dari indeks pertama `i = 0` dan berlanjut hingga seluruh karakter dalam `heksadesimal`.

`c` mengambil setiap karakter heksadesimal pada index `i`, dan `digit` digunakan untuk menyimpan nilai angka dari karakter tersebut.

  

```java

if (c >= '0' && c <= '9') {

digit = c - '0';
}
else  if (c >= 'A' && c <= 'F') {
digit = c - 'A' + 10;
}
else  if (c >= 'a' && c <= 'f') {
digit = c - 'a' + 10;
}  else  {
throw  new  IllegalArgumentException("karakter heksadesimal tidak valid!: " + c);
}

```

  

Digit Angka (0–9): Jika karakter `c` berada dalam rentang `'0'` hingga `'9'`, maka nilai desimal dari `c` diperoleh dengan mengurangi `'0'` dari karakter tersebut. Hal ini mengonversi karakter `'0'` hingga `'9'` menjadi nilai numerik 0 hingga 9.

Digit Huruf Besar (A–F) : Jika karakter `c` berada dalam rentang `'A'` hingga `'F'`, maka nilai desimalnya diperoleh dengan mengurangi `'A'` dari `c` dan menambahkan 10, karena `'A'` mewakili nilai 10 dalam heksadesimal, `'B'` mewakili 11, dan seterusnya hingga `'F'` yang bernilai 15.

Digit Huruf Kecil (a–f): Jika karakter `c` adalah huruf kecil antara `'a'` hingga `'f'`, konversi dilakukan dengan cara yang sama seperti untuk huruf besar, sehingga `'a'` mewakili 10, `'b'` mewakili 11, hingga `'f'` yang bernilai 15.

```java

desimal += digit * Math.pow(16, pangkat);

pangkat--;
```
Menyesuaikan rumus Konversi radiks seperti function sebelumnya.

- Biner ke Heksadesimal
```java
private  static  String  binaryToHexadecimal(String  biner)  {
int  desimal  =  binaryToDecimal(biner);
return  decimalToHexadecimal(desimal);
}
```
Function ini mengonversi biner ke desimal terlebih dahulu menggunakan fungsi yang ada lalu dikonversi dari desimal menjadi hexadecimal menggunakan fungsi yang ada

- Heksadesimal ke Biner
```java
private  static  String  hexadecimalToBinary(String  heksadesimal)  {
int  desimal  =  hexadecimalToDecimal(heksadesimal);
return  desimalToBiner(desimal);
}
```
Function ini mengonversi heksadesimal ke desimal terlebih dahulu menggunakan fungsi yang ada lalu dikonversi dari heksadesimal menjadi desimal menggunakan fungsi yang ada.

**Kedua Fungsi di atas mengkonversi ke desimal terlebih dahulu supaya lebih mudah untuk dihitung**