

Tentu, mari kita bahas kode Java di atas secara detail. Program ini adalah aplikasi konversi angka antara sistem desimal, biner, dan heksadesimal. Berikut adalah penjelasan dari setiap bagian kode beserta proses yang dilakukan:

### 1. **Import dan Deklarasi Kelas**
```java
import java.util.Scanner;

public class UTSno1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int layanan;
```
- **Import Scanner**: `import java.util.Scanner;` digunakan untuk mengimpor kelas `Scanner`, yang memungkinkan kita untuk menerima input dari pengguna.
- **Deklarasi Kelas**: Kelas `UTSno1` adalah kelas utama dari program.
- **Inisialisasi Scanner**: Objek `Scanner` (`sc`) digunakan untuk membaca input dari konsol.
- **Variabel `layanan`**: Digunakan untuk menyimpan pilihan menu yang dimasukkan oleh pengguna.

### 2. **Menu Utama**
```java
while (true) {
    System.out.println();
    System.out.println(" ______________________________________");
    System.out.println("| Menu layanan  :                      |");
    System.out.println("|  1.Desimal --> Biner & Heksadesimal  |");
    System.out.println("|  2.Biner --> Desimal & Heksadesimal  |");
    System.out.println("|  3.Heksadedimal --> Biner & Desimal  |");
    System.out.println("|  4.Keluar                            |");
    System.out.println("|______________________________________|");
    System.out.print("Masukkan angka dari layanan yg ingin anda gunakan : ");
    layanan = sc.nextInt();
```
- **Loop Tak Terbatas**: `while (true)` digunakan untuk menjalankan program terus menerus hingga pengguna memilih untuk keluar.
- **Menampilkan Menu**: Menampilkan menu layanan konversi. Pengguna diminta untuk memasukkan pilihan menu (`layanan`).

### 3. **Pilihan Menu 1: Desimal ke Biner & Heksadesimal**
```java
if (layanan == 1) {
    int a, d[] = new int[20], c = 0;
    System.out.println(" __________________________________ ");
    System.out.println("| Desimal --> Biner & Heksadesimal |");
    System.out.println("|__________________________________|");
    System.out.print("Masukkan angka yg ingin dikonversikan : ");
    a = sc.nextInt();
    int[] b = new int[20];

    d[c] = a % 2;
    b[0] = a / 2;
    while (true) {
        if (b[c] == 0) {
            break;
        } else {
            d[c + 1] = b[c] % 2;
            b[c + 1] = b[c] / 2;
            c++;
        }
    }
```
- **Membaca Input**: Mengambil input angka desimal yang ingin dikonversikan (`a`).
- **Konversi ke Biner**:
  - Menyimpan sisa pembagian `a` dengan 2 ke dalam array `d` untuk menyimpan angka biner.
  - `b[0]` menyimpan hasil bagi `a` dengan 2. Proses ini dilanjutkan dalam loop `while` untuk membagi hingga hasilnya 0.

#### **Mencetak Hasil Biner**
```java
while (true) {
    if (c == -1) {
        break;
    } else {
        System.out.print(d[c]);
    }
    c--;
}
System.out.println("(2)");
```
- **Menampilkan Hasil Biner**: Menggunakan loop untuk mencetak angka biner dari array `d` dari indeks tertinggi hingga 0.

#### **Konversi ke Heksadesimal**
```java
System.out.print(" Heksadesimal = ");
int g[] = new int[20], f = 0;
int[] e = new int[20];
g[0] = a % 16;
e[0] = a / 16;
while (true) {
    if (e[f] == 0) {
        break;
    } else {
        g[f + 1] = e[f] % 16;
        e[f + 1] = e[f] / 16;
        f++;
    }
}
```
- **Konversi ke Heksadesimal**: Prosesnya mirip dengan konversi ke biner, tetapi menggunakan 16 sebagai basis. Hasilnya disimpan di array `g`.

#### **Mencetak Hasil Heksadesimal**
```java
while (true) {
    if (f == -1) {
        break;
    } else {
        if (g[f] == 10) {
            System.out.print("A");
        } else if (g[f] == 11) {
            System.out.print("B");
        } else if (g[f] == 12) {
            System.out.print("C");
        } else if (g[f] == 13) {
            System.out.print("D");
        } else if (g[f] == 14) {
            System.out.print("E");
        } else if (g[f] == 15) {
            System.out.print("F");
        } else {
            System.out.print(g[f]);
        }
    }
    f--;
}
System.out.println("(16)");
```
- **Menampilkan Hasil Heksadesimal**: Angka yang disimpan dalam array `g` dicetak. Jika angka adalah 10-15, akan ditampilkan sebagai huruf A-F.

### 4. **Pilihan Menu 2: Biner ke Desimal & Heksadesimal**
```java
} else if (layanan == 2) {
    System.out.println(" __________________________________ ");
    System.out.println("| Biner --> Desimal & Heksadesimal |");
    System.out.println("|__________________________________|");
    int a[] = new int[20], c = 0, d, e = 1, k = 0, f = 1;
    System.out.print("Berapa jumlah angka dari susunan bilangan biner yg ingin anda konversikan : ");
    d = sc.nextInt();
    while (d >= e) {
        System.out.print("Masukkan angka ke-" + e + " dari deratan bilangan biner yg ingin anda konversikan : ");
        a[c] = sc.nextInt();
        c++;
        e++;
    }
```
- **Membaca Input Biner**: Pengguna diminta memasukkan jumlah dan angka biner yang ingin dikonversikan.

#### **Mencetak Hasil Biner**
```java
e = 1;
c = 0;
System.out.print("Deratan bilangan biner yg ingin anda konversikan : ");
while (d >= e) {
    System.out.print(a[c]);
    c++;
    e++;
}
e = 1;
System.out.println("(2)");
```
- **Menampilkan Deratan Biner**: Mencetak deratan bilangan biner yang dimasukkan pengguna.

#### **Konversi ke Desimal**
```java
while (d >= e) {
    if (a[c - 1] == 1) {
        k += f;
    } else {
        k += 0;
    }
    e++;
    c--;
    f *= 2;
}
System.out.println(" Desimal = " + k + "(10)");
```
- **Menghitung Desimal**: Menghitung nilai desimal dari angka biner berdasarkan posisi digit. Jika digit adalah 1, menambahkannya ke total.

#### **Konversi ke Heksadesimal**
```java
int j[] = new int[9];
int h = 0, i = d - 1;
System.out.print(" Heksadesimal = ");
while (true) {
    f = 1;
    e = 1;
    if (i <= -1) {
        break;
    }
    h++;
    while (4 >= e) {
        if (i == -1) {
            break;
        }
        if (a[i] == 1) {
            j[h] += f;
        }
        e++;
        i--;
        f *= 2;
    }
}
```
- **Menghitung Heksadesimal**: Mengonversi nilai desimal yang sudah dihitung menjadi heksadesimal dengan cara menghitung nilai dari empat bit sekaligus.

#### **Mencetak Hasil Heksadesimal**
```java
while (true) {
    if (h == 0) {
        break;
    } else {
        if (h == 10) {
            System.out.print("A");
        } else if (j[h] == 11) {
            System.out.print("B");
        } else if (j[h] == 12) {
            System.out.print("C");
        } else if (j[h] == 13) {
            System.out.print("D");
        } else if (j[h] == 14) {
            System.out.print("E");
        } else if (j[h] == 15) {
            System.out.print("F");
        } else {
            System.out.print(j[h]);
        }
    }
    h--;
}
System.out.println("(16)");
```
- **Menampilkan Hasil Heksadesimal**: Menampilkan hasil konversi heksadesimal dari nilai yang telah dihitung.

### 5. **Pilihan Menu 3: Heksadesimal ke Biner & Desimal**
```java
} else if (layanan)