Berikut adalah penjelasan dari setiap fungsi dalam program Java di atas beserta kode yang mewakili masing-masing fungsinya:

### 1. `main` Method
Fungsi `main` adalah titik awal eksekusi program. Di dalamnya, terdapat tiga konversi:
   - **Desimal 450 ke Biner dan Heksadesimal**
   - **Biner "11011000" ke Desimal dan Heksadesimal**
   - **Heksadesimal "1F4" ke Desimal dan Biner**

```java
public static void main(String[] args) {
    int desimal450 = 450;
    String biner450 = konversiDesimalKeBiner(desimal450);
    String heksadesimal450 = konversiDesimalKeHeksadesimal(desimal450);
    
    System.out.println("Desimal 450 ke Biner: " + biner450);
    System.out.println("Desimal 450 ke Heksadesimal: " + heksadesimal450);
    
    String biner11011000 = "11011000";
    int desimal11011000 = konversiBinerKeDesimal(biner11011000);
    String heksadesimal11011000 = konversiDesimalKeHeksadesimal(desimal11011000);
    
    System.out.println("Biner 11011000 ke Desimal: " + desimal11011000);
    System.out.println("Biner 11011000 ke Heksadesimal: " + heksadesimal11011000);
    
    String heksadesimal1F4 = "1F4";
    int desimal1F4 = konversiHeksadesimalKeDesimal(heksadesimal1F4);
    String biner1F4 = konversiDesimalKeBiner(desimal1F4);
    
    System.out.println("Heksadesimal 1F4 ke Desimal: " + desimal1F4);
    System.out.println("Heksadesimal 1F4 ke Biner: " + biner1F4);
}
```

### 2. `konversiDesimalKeBiner` Method
Fungsi ini mengonversi bilangan desimal menjadi representasi biner. Program ini memanfaatkan `StringBuilder` dan loop untuk menambahkan sisa hasil pembagian desimal dengan 2 ke depan hasil biner.

```java
public static String konversiDesimalKeBiner(int desimal) {
    StringBuilder biner = new StringBuilder();
    while (desimal > 0) {
        biner.insert(0, desimal % 2);
        desimal = desimal / 2;
    }
    return biner.toString();
}
```

### 3. `konversiDesimalKeHeksadesimal` Method
Fungsi ini mengonversi bilangan desimal ke heksadesimal. Program menggunakan array `heksDigit` untuk menampilkan karakter heksadesimal (`0–F`) dan menambahkan hasil konversi ke awal string.

```java
public static String konversiDesimalKeHeksadesimal(int desimal) {
    StringBuilder heksadesimal = new StringBuilder();
    char[] heksDigit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    while (desimal > 0) {
        heksadesimal.insert(0, heksDigit[desimal % 16]);
        desimal = desimal / 16;
    }
    return heksadesimal.toString();
}
```

### 4. `konversiBinerKeDesimal` Method
Fungsi ini mengonversi bilangan biner yang diinput sebagai `String` ke desimal. Program menggunakan loop untuk menelusuri setiap karakter dari belakang ke depan, lalu menambahkan nilai biner pada setiap posisi menggunakan `Math.pow(2, pangkat)`.

```java
public static int konversiBinerKeDesimal(String biner) {
    int desimal = 0;
    int pangkat = 0;
    for (int i = biner.length() - 1; i >= 0; i--) {
        if (biner.charAt(i) == '1') {
            desimal += Math.pow(2, pangkat);
        }
        pangkat++;
    }
    return desimal;
}
```

### 5. `konversiHeksadesimalKeDesimal` Method
Fungsi ini mengonversi bilangan heksadesimal (dalam bentuk `String`) ke desimal. Program membaca karakter dari belakang, menghitung nilai setiap digit heksadesimal (`0–9` atau `A–F`), dan mengakumulasikannya sesuai pangkat.

```java
public static int konversiHeksadesimalKeDesimal(String heksadesimal) {
    int desimal = 0;
    int pangkat = 0;
    for (int i = heksadesimal.length() - 1; i >= 0; i--) {
        char hexChar = heksadesimal.charAt(i);
        int nilai = (hexChar >= 'A' && hexChar <= 'F') ? hexChar - 'A' + 10 : hexChar - '0';
        desimal += nilai * Math.pow(16, pangkat);
        pangkat++;
    }
    return desimal;
}
```

Setiap fungsi di atas bekerja sama untuk melakukan konversi antara representasi biner, desimal, dan heksadesimal.