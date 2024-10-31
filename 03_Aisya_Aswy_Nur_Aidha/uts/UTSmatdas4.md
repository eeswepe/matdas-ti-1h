Program ini melakukan enkripsi sederhana pada input biner 8-bit menggunakan operasi XOR dengan kunci tetap (`key`). Setiap bit dari input biner dienkripsi dengan kunci untuk menghasilkan pesan terenkripsi, yang kemudian ditampilkan dalam bentuk biner. Berikut penjelasan setiap bagian dari kode.

---

### 1. Inisialisasi Scanner untuk Input Pengguna

Kode ini menginisialisasi objek `Scanner` untuk membaca input dari pengguna.

```java
Scanner sc = new Scanner(System.in);
```

### 2. Mengambil Input Biner dan Mendefinisikan Kunci

- Program meminta input biner 8-bit dari pengguna melalui `pesanDasar`.
- Kunci `key` adalah string tetap "10101010", yang digunakan untuk melakukan operasi XOR pada tiap bit.

```java
System.out.print("Masukkan nilai biner dasar: ");
String pesanDasar = sc.nextLine();
String key = "10101010";
```

### 3. Enkripsi dengan Operasi XOR

- Program melakukan perulangan sebanyak 8 kali, satu kali untuk setiap bit dari `pesanDasar`.
- Setiap bit dari `pesanDasar` diambil menggunakan `pesanDasar.charAt(i)`.
- Program mengubah setiap karakter bit dari `pesanDasar` dan `key` menjadi nilai integer (`0` atau `1`) dengan mengurangkan karakter '0'.
- Kemudian, program melakukan operasi XOR (`^`) antara bit dari `pesanDasar` dan `key`.
- Hasil XOR ditambahkan ke string `s`, yang menyimpan hasil enkripsi dalam bentuk biner.

```java
for(int i = 0; i < 8; i++){
    int temp = (pesanDasar.charAt(i) - '0') ^ (key.charAt(i) - '0');
    s += temp;
}
```

### 4. Menampilkan Hasil Enkripsi

Setelah proses XOR selesai, program mencetak hasil enkripsi (`s`) ke layar.

```java
System.out.println("Hasil Enkripsi: " + s);
```

### Ringkasan

Program ini menerima input berupa string biner 8-bit dan mengimplementasikan enkripsi sederhana dengan XOR menggunakan kunci tetap `"10101010"`. Hasil XOR setiap bit input dan kunci disimpan dalam `s` dan ditampilkan sebagai hasil enkripsi.
