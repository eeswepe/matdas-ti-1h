# Program Operator Biner 

### Konversi Biner ke Desimal
Fungsi ini mengonversi string biner menjadi bilangan desimal dengan menjumlahkan nilai masing-masing bit yang bernilai `1`.
```java
static int konversiBinerKeDesimal(String biner) {
    int desimal = 0;
    int panjang = biner.length();
    
    for (int i = 0; i < panjang; i++) {
        if (biner.charAt(panjang - 1 - i) == '1') {
            desimal += Math.pow(2, i);
        }
    }   
    return desimal;
}
```
### **Konversi Desimal ke Biner**
Fungsi ini mengonversi bilangan desimal menjadi string biner dengan membagi desimal hingga mencapai nol dan menyimpan sisa bagi.
```java
static String konversiDesimalKeBiner(int desimal) {
    if (desimal == 0) return "0";
    
    String biner = "";
    while (desimal > 0) {
        biner = (desimal % 2) + biner;
        desimal /= 2;
    }
    
    return biner;
}

```
### Tambah Biner
Fungsi ini menjumlahkan dua bilangan biner dengan mengonversinya ke desimal, melakukan penjumlahan, lalu mengonversi kembali ke biner.
```java
static String tambahBiner(String a, String b) {
    int desimal1 = konversiBinerKeDesimal(a);
    int desimal2 = konversiBinerKeDesimal(b);
    int hasilDesimal = desimal1 + desimal2;
    return konversiDesimalKeBiner(hasilDesimal);
}

```
### Kurang Biner
Fungsi ini mengurangkan dua bilangan biner dengan cara yang sama seperti fungsi tambah, tetapi untuk pengurangan.
```java
static String kurangBiner(String a, String b) {
    int desimal1 = konversiBinerKeDesimal(a);
    int desimal2 = konversiBinerKeDesimal(b);
    int hasilDesimal = desimal1 - desimal2;
    return konversiDesimalKeBiner(hasilDesimal);
}

```
### Kali Biner
Fungsi ini mengalikan dua bilangan biner dengan cara yang sama, tetapi untuk perkalian.
```java
static String kaliBiner(String a, String b) {
    int desimal1 = konversiBinerKeDesimal(a);
    int desimal2 = konversiBinerKeDesimal(b);
    int hasilDesimal = desimal1 * desimal2;
    return konversiDesimalKeBiner(hasilDesimal);
}

```
### AND Biner
Fungsi ini melakukan operasi bitwise AND pada dua bilangan biner.
```java
static String andBiner(String a, String b) {
    int desimal1 = konversiBinerKeDesimal(a);
    int desimal2 = konversiBinerKeDesimal(b);
    int hasilDesimal = desimal1 & desimal2;
    return konversiDesimalKeBiner(hasilDesimal);
}

```
### OR Biner
Fungsi ini melakukan operasi bitwise OR pada dua bilangan biner.
```java
static String orBiner(String a, String b) {
    int desimal1 = konversiBinerKeDesimal(a);
    int desimal2 = konversiBinerKeDesimal(b);
    int hasilDesimal = desimal1 | desimal2;
    return konversiDesimalKeBiner(hasilDesimal);
}

```
### XOR Biner
Fungsi ini melakukan operasi bitwise XOR pada dua bilangan biner.
```java
static String xorBiner(String a, String b) {
    int desimal1 = konversiBinerKeDesimal(a);
    int desimal2 = konversiBinerKeDesimal(b);
    int hasilDesimal = desimal1 ^ desimal2;
    return konversiDesimalKeBiner(hasilDesimal);
}

```