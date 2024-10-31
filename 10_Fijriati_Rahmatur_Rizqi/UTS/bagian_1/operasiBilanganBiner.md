**Operasi Bilangan Biner**

**Penjelasan Kode**

**Input Pengguna**

```java
Scanner sc = new Scanner(System.in);

System.out.println("Pilih operasi: tambah, kurang, kali, AND, OR, XOR");
String operasi = sc.nextLine().toLowerCase();

System.out.println("Masukkan bilangan biner pertama: ");
String bilangan1 = sc.nextLine();

System.out.println("Masukkan bilangan biner kedua: ");
String bilangan2 = sc.nextLine();
```

- `Scanner sc = new Scanner(System.in);`: Membuat objek `Scanner` untuk membaca input dari pengguna.
- `System.out.println(...)`: Mencetak pesan ke konsol untuk meminta input pengguna.
- `String operasi = sc.nextLine().toLowerCase();`: Membaca operasi yang akan dilakukan dalam bentuk string dan mengubahnya ke huruf kecil.
- `String bilangan1 = sc.nextLine();` dan `String bilangan2 = sc.nextLine();`: Membaca dua bilangan biner yang akan dioperasikan oleh pengguna.

**Switch Case Berdasarkan Operasi**

```java
switch (operasi) {
    case "tambah":
        System.out.println("Hasil: " + tambah(bilangan1, bilangan2));
        break;
    case "kurang":
        System.out.println("Hasil: " + kurang(bilangan1, bilangan2));
        break;
    case "kali":
        System.out.println("Hasil: " + kali(bilangan1, bilangan2));
        break;
    case "and":
        System.out.println("Hasil AND: " + and(bilangan1, bilangan2));
        break;
    case "or":
        System.out.println("Hasil OR: " + or(bilangan1, bilangan2));
        break;
    case "xor":
        System.out.println("Hasil XOR: " + xor(bilangan1, bilangan2));
        break;
    default:
        System.out.println("Operasi tidak valid.");
        break;
}
```

- `switch (operasi)`: Memilih metode berdasarkan input pengguna (`tambah`, `kurang`, `kali`, `AND`, `OR`, atau `XOR`).
- Jika operasi tidak valid, program mencetak pesan kesalahan.

**Penjelasan Metode Operasi Bilangan Biner**

1. **`tambah(String a, String b)`**

   - **Fungsi:** Menambahkan dua bilangan biner.
   - **Implementasi:** Konversi bilangan biner ke desimal dengan `Integer.parseInt(a, 2)`, lakukan penambahan, lalu konversi hasilnya kembali ke biner dengan `Integer.toBinaryString(result)`.

2. **`kurang(String a, String b)`**

   - **Fungsi:** Mengurangi dua bilangan biner.
   - **Implementasi:** Konversi bilangan biner ke desimal, lakukan pengurangan, dan konversi hasilnya kembali ke biner.

3. **`kali(String a, String b)`**

   - **Fungsi:** Mengalikan dua bilangan biner.
   - **Implementasi:** Sama seperti operasi lainnya, bilangan biner dikonversi ke desimal, dikalikan, lalu hasilnya dikonversi ke biner.

4. **`and(String a, String b)`**

   - **Fungsi:** Melakukan operasi bitwise AND antara dua bilangan biner.
   - **Implementasi:** Bilangan biner dikonversi ke desimal, operasi AND dilakukan dengan operator `&`, dan hasilnya dikonversi ke biner.

5. **`or(String a, String b)`**

   - **Fungsi:** Melakukan operasi bitwise OR antara dua bilangan biner.
   - **Implementasi:** Operasi bitwise OR dilakukan dengan operator `|` setelah bilangan dikonversi ke desimal, dan hasilnya dikonversi kembali ke biner.

6. **`xor(String a, String b)`**
   - **Fungsi:** Melakukan operasi bitwise XOR antara dua bilangan biner.
   - **Implementasi:** Operasi XOR dilakukan dengan operator `^`, dan hasilnya dikonversi ke biner.

Program ini memungkinkan pengguna untuk melakukan berbagai operasi aritmatika dan logika pada dua bilangan biner, menghasilkan output dalam bentuk biner sesuai dengan operasi yang dipilih.
