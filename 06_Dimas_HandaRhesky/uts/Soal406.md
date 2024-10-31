Berikut adalah penjelasan dari setiap bagian program yang melakukan enkripsi bilangan biner menggunakan operasi XOR dan mengonversi hasil enkripsi ke format heksadesimal:

### 1. Deklarasi dan Input Bilangan Biner
Bagian ini menggunakan `Scanner` untuk mengambil input dari pengguna, yaitu dua bilangan biner dan sebuah kunci untuk enkripsi. 

```java
Scanner sc = new Scanner(System.in);
String binary1 = sc.nextLine(); // Bilangan biner pertama
String binary2 = sc.nextLine(); // Bilangan biner kedua
String key = sc.nextLine();      // Kunci untuk enkripsi
```

### 2. Enkripsi Bilangan Biner
Fungsi `xorBinary` digunakan untuk melakukan operasi XOR antara setiap bit dari bilangan biner dan kunci. Hasilnya adalah bilangan biner yang telah dienkripsi.

```java
// Melakukan enkripsi dengan XOR
String encrypted1 = xorBinary(binary1, key);
String encrypted2 = xorBinary(binary2, key);
```

### 3. Menampilkan Hasil Enkripsi
Setelah melakukan enkripsi, hasilnya ditampilkan ke konsol, termasuk bilangan biner asli dan kunci yang digunakan untuk enkripsi.

```java
// Menampilkan hasil enkripsi
System.out.println("Hasil Enkripsi:");
System.out.println("Binary 1: " + binary1);
System.out.println("Key: " + key);
System.out.println("Encrypted Binary 1: " + encrypted1);
System.out.println("Encrypted Binary 2: " + encrypted2);
```

### 4. Konversi ke Heksadesimal
Hasil enkripsi yang berupa bilangan biner dikonversi ke format heksadesimal menggunakan `Integer.parseInt` untuk mengonversi dari biner ke desimal dan `Integer.toHexString` untuk mengonversi dari desimal ke heksadesimal. Hasil akhir ditampilkan dalam huruf besar.

```java
// Konversi hasil enkripsi ke heksadesimal
String encrypted1Hex = Integer.toHexString(Integer.parseInt(encrypted1, 2)).toUpperCase();
String encrypted2Hex = Integer.toHexString(Integer.parseInt(encrypted2, 2)).toUpperCase();

// Menampilkan hasil dalam heksadesimal
System.out.println("Encrypted Binary 1 (Hex): " + encrypted1Hex);
System.out.println("Encrypted Binary 2 (Hex): " + encrypted2Hex);
```

### 5. Fungsi XOR
Fungsi ini melakukan operasi XOR pada dua bilangan biner. Untuk setiap bit, jika kedua bit sama, hasilnya `0`, jika berbeda, hasilnya `1`. Hasil dari operasi ini dikumpulkan dalam `StringBuilder`.

```java
// Fungsi untuk melakukan operasi XOR pada dua bilangan biner
public static String xorBinary(String binary, String key) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < binary.length(); i++) {
        char bit1 = binary.charAt(i);
        char bit2 = key.charAt(i);
        // XOR operation
        result.append((bit1 == bit2) ? '0' : '1');
    }

    return result.toString();
}
```

### Ringkasan
Program ini mengimplementasikan enkripsi bilangan biner menggunakan operasi XOR dan mengonversi hasilnya ke dalam format heksadesimal. Pengguna diminta untuk memasukkan dua bilangan biner dan sebuah kunci, kemudian program menampilkan hasil enkripsi dan hasil dalam bentuk heksadesimal.