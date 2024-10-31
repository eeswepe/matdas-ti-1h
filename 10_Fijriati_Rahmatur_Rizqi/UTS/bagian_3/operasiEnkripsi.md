**Operasi Enkripsi Bilangan Biner dengan XOR**

**Penjelasan Kode**

**Input Pengguna**

```java
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan bilangan biner yang ingin dienkripsi: ");
String binaryInput = sc.nextLine();
```

- **`Scanner sc = new Scanner(System.in);`**: Membuat objek `Scanner` untuk membaca input dari pengguna.
- **`System.out.print(...)`**: Menampilkan pesan untuk meminta input dari pengguna.
- **`String binaryInput = sc.nextLine();`**: Membaca bilangan biner yang akan dienkripsi.

**Kunci dan Proses XOR**

```java
String key = "10101010";
String enkripsiBiner = xor(binaryInput, key);
```

- **Kunci (`key`)**: String `"10101010"` digunakan sebagai kunci enkripsi tetap.
- **Fungsi `xor`**: Melakukan operasi XOR antara setiap bit dari `binaryInput` dan `key` untuk menghasilkan data terenkripsi.

**Fungsi XOR**

Fungsi `xor` melakukan operasi XOR bitwise antara setiap bit dari `binaryInput` dan kunci.

```java
public static String xor(String binaryInput, String key) {
    StringBuilder enkripsiBiner = new StringBuilder();

    for (int i = 0; i < binaryInput.length(); i++) {
        char bitInput = binaryInput.charAt(i);
        char bitKey = key.charAt(i % key.length());
        enkripsiBiner.append((bitInput == bitKey) ? '0' : '1');
    }
    return enkripsiBiner.toString();
}
```

- **`StringBuilder enkripsiBiner = new StringBuilder();`**: Objek `StringBuilder` untuk menyimpan hasil XOR.
- **Loop `for`**: Mengulang setiap bit dari `binaryInput`.
  - **`bitInput`**: Karakter dari `binaryInput` pada posisi `i`.
  - **`bitKey`**: Karakter dari `key`, diulang menggunakan operasi modulus agar panjang `key` mencocokkan panjang `binaryInput`.
  - **`enkripsiBiner.append(...)`**: Hasil XOR bitwise ditambahkan ke `enkripsiBiner`.

**Konversi Hasil XOR ke Heksadesimal**

Setelah proses XOR, hasil enkripsi biner dikonversi ke heksadesimal menggunakan fungsi `binaryToHexadecimal`.

```java
String enkripsiHeksadesimal = binaryToHexadecimal(enkripsiBiner);
```

**Fungsi Konversi Biner ke Heksadesimal**

Fungsi ini mengonversi string biner ke bentuk heksadesimal.

```java
public static String binaryToHexadecimal(String binary) {
    int decimal = Integer.parseInt(binary, 2);
    return Integer.toHexString(decimal).toUpperCase();
}
```

- **`int decimal = Integer.parseInt(binary, 2);`**: Mengonversi string biner ke desimal.
- **`Integer.toHexString(...)`**: Mengonversi nilai desimal menjadi heksadesimal dan mengubahnya menjadi huruf besar.

**Output Program**

Program mencetak hasil enkripsi dalam format berikut:

```java
System.out.println("Hasil Enkripsi:");
System.out.println("Biner\t\t: " + enkripsiBiner);
System.out.println("Heksadesimal\t: " + enkripsiHeksadesimal);
```

- **Biner**: Menampilkan hasil enkripsi biner.
- **Heksadesimal**: Menampilkan hasil konversi dari hasil enkripsi ke heksadesimal.

Program ini memberikan hasil enkripsi dari input biner dalam dua format, memudahkan pengguna melihat hasil enkripsi secara langsung dalam bentuk biner dan heksadesimal.
