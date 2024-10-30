**Konversi Bilangan**

**Penjelasan Kode**

**Input Pengguna**

```java
Scanner sc = new Scanner(System.in);

System.out.println("Masukkan jenis bilangan awal (desimal/biner/heksadesimal): ");
String jenisAwal = sc.nextLine().toLowerCase();

System.out.println("Masukkan bilangan yang akan dikonversi: ");
String inputBilangan = sc.nextLine();

System.out.println("Masukkan jenis bilangan tujuan (pisahkan dengan koma jika lebih dari 1, contoh: desimal,biner): ");
String[] jenisTujuan = sc.nextLine().toLowerCase().split(",");
```

- `Scanner sc = new Scanner(System.in);`: Membuat objek `Scanner` untuk membaca input dari pengguna.
- `System.out.println(...)`: Mencetak pesan ke konsol untuk meminta input pengguna.
- `String jenisAwal = sc.nextLine().toLowerCase();`: Membaca jenis bilangan awal yang dimasukkan pengguna, dikonversi ke huruf kecil.
- `String inputBilangan = sc.nextLine();`: Membaca bilangan yang akan dikonversi.
- `String[] jenisTujuan = sc.nextLine().toLowerCase().split(",");`: Membaca jenis bilangan tujuan yang dimasukkan pengguna, dikonversi ke huruf kecil, dan dipecah menjadi array berdasarkan koma.

**Konversi Berdasarkan Jenis Bilangan Awal**

```java
System.out.println("Hasil konversi: ");
for (String tujuan : jenisTujuan) {
    switch (jenisAwal) {
        case "desimal":
            // Konversi dari desimal
            if (tujuan.equals("biner")) {
                System.out.println("Biner: " + decimalToBinary(decimal));
            } else if (tujuan.equals("heksadesimal")) {
                System.out.println("Heksadesimal: " + decimalToHexadecimal(decimal));
            }
            break;

        case "biner":
            // Konversi dari biner
            if (tujuan.equals("desimal")) {
                System.out.println("Desimal: " + binaryToDecimal(inputBilangan));
            } else if (tujuan.equals("heksadesimal")) {
                System.out.println("Heksadesimal: " + binaryToHexadecimal(inputBilangan));
            }
            break;

        case "heksadesimal":
            // Konversi dari heksadesimal
            if (tujuan.equals("desimal")) {
                System.out.println("Desimal: " + hexadecimalToDecimal(inputBilangan));
            } else if (tujuan.equals("biner")) {
                System.out.println("Biner: " + hexadecimalToBinary(inputBilangan));
            }
            break;

        default:
            System.out.println("Jenis bilangan awal tidak valid.");
    }
}
```

- `System.out.println("Hasil konversi: ");`: Mencetak hasil konversi

**Penjelasan Metode Konversi Bilangan**

**1. `decimalToBinary(int decimal)`**

- **Fungsi:** Mengkonversi bilangan desimal ke biner.
- **Implementasi:** Menggunakan metode `Integer.toBinaryString(decimal)`, yang secara internal menggunakan algoritma pembagian berulang untuk mendapatkan representasi biner.

**2. `decimalToHexadecimal(int decimal)`**

- **Fungsi:** Mengkonversi bilangan desimal ke heksadesimal.
- **Implementasi:** Menggunakan metode `Integer.toHexString(decimal).toUpperCase()`, yang secara internal menggunakan algoritma pembagian berulang untuk mendapatkan representasi heksadesimal. `toUpperCase()` digunakan untuk memastikan bahwa hasil dalam huruf kapital.

**3. `binaryToDecimal(String binary)`**

- **Fungsi:** Mengkonversi bilangan biner ke desimal.
- **Implementasi:** Menggunakan metode `Integer.parseInt(binary, 2)`, yang secara internal menggunakan algoritma Horner untuk menghitung nilai desimal dari representasi biner. Parameter `2` menunjukkan bahwa bilangan yang dikonversi adalah biner (basis 2).

**4. `binaryToHexadecimal(String binary)`**

- **Fungsi:** Mengkonversi bilangan biner ke heksadesimal.
- **Implementasi:**
  1. Mengkonversi bilangan biner ke desimal menggunakan `binaryToDecimal`.
  2. Mengkonversi hasil desimal ke heksadesimal menggunakan `decimalToHexadecimal`.

**5. `hexadecimalToDecimal(String hex)`**

- **Fungsi:** Mengkonversi bilangan heksadesimal ke desimal.
- **Implementasi:** Menggunakan metode `Integer.parseInt(hex, 16)`, yang secara internal menggunakan algoritma Horner untuk menghitung nilai desimal dari representasi heksadesimal. Parameter `16` menunjukkan bahwa bilangan yang dikonversi adalah heksadesimal (basis 16).

**6. `hexadecimalToBinary(String hex)`**

- **Fungsi:** Mengkonversi bilangan heksadesimal ke biner.
- **Implementasi:**
  1. Mengkonversi bilangan heksadesimal ke desimal menggunakan `hexadecimalToDecimal`.
  2. Mengkonversi hasil desimal ke biner menggunakan `decimalToBinary`.

Dengan menggunakan ini, program dapat melakukan konversi antara berbagai sistem bilangan secara efisien dan akurat.
