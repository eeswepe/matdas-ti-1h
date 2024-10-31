Berikut adalah penjelasan setiap proses dalam kode Java yang kamu berikan. Kode ini mengonversi nilai suhu, kelembapan, dan konsentrasi CO2 ke dalam format desimal, biner, dan heksadesimal. Saya juga akan menambahkan potongan kode untuk setiap proses yang dijelaskan.

### 1. Inisialisasi dan Input Data

```java
Scanner sc = new Scanner(System.in);
double a[] = new double[3];
double kelembapan;

System.out.println();
System.out.println("-------------------------------------------");
System.out.println();

System.out.print("Masukkan suhu : ");
a[0] = sc.nextDouble();
System.out.println("Contoh memasukkan kelembapan --> Kelembapan 65%, masukkan 65 saja tanpa (%)");
System.out.print("Masukkan kelembapan : ");
kelembapan = sc.nextDouble();
a[1] = kelembapan / 100; // Mengonversi kelembapan ke dalam format desimal
System.out.print("Masukkan CO2 : ");
a[2] = sc.nextDouble();
```

**Penjelasan**:
- Menggunakan `Scanner` untuk mengambil input dari pengguna.
- Membuat array `a` untuk menyimpan nilai suhu, kelembapan, dan CO2.
- Mengambil nilai suhu, kelembapan (dalam persentase, kemudian diubah ke desimal), dan konsentrasi CO2 dari pengguna.

### 2. Menyimpan Nilai Desimal dan Pecahan

```java
int b[] = new int[3];
b[0] = (int) a[0]; // Mengonversi suhu ke bilangan bulat
b[1] = (int) a[1]; // Mengonversi kelembapan ke bilangan bulat
b[2] = (int) a[2]; // Mengonversi CO2 ke bilangan bulat

double j[] = new double[3];
j[0] = a[0] - b[0]; // Menyimpan pecahan dari suhu
j[1] = a[1] - b[1]; // Menyimpan pecahan dari kelembapan
j[2] = a[2] - b[2]; // Menyimpan pecahan dari CO2
```

**Penjelasan**:
- Membuat array `b` untuk menyimpan nilai bulat dari suhu, kelembapan, dan CO2.
- Menghitung nilai pecahan dari masing-masing input dengan mengurangi nilai desimal dari nilai bulatnya.

### 3. Mencetak Nilai Desimal, Biner, dan Heksadesimal

```java
String[] kondisi = {"SUHU", "KELEMBAPAN", "CO2"};
for (int c = 0; c < 3; c++) {
    System.out.println(" " + kondisi[c]);
    System.out.println("   - Desimal = " + a[c] + "(10)");
    System.out.print("   - Biner = ");
    
    if (j[c] >= 0.5) {
        a[c]++;
        b[c]++;
    }
```

**Penjelasan**:
- Menggunakan loop untuk iterasi setiap elemen dalam array `kondisi` yang berisi label "Suhu", "Kelembapan", dan "CO2".
- Mencetak nilai desimal untuk setiap input.
- Menambahkan 1 ke nilai jika nilai pecahan ≥ 0.5, untuk pembulatan.

### 4. Konversi Desimal ke Biner

```java
int d[] = new int[20], e[] = new int[20], f = 0;
d[f] = (int) a[c] % 2;
e[f] = (int) a[c] / 2;

while (true) {
    if (e[f] == 0) {
        break;
    } else {
        d[f + 1] = e[f] % 2;
        e[f + 1] = e[f] / 2;
        f++;
    }
}

while (true) {
    if (f == -1) {
        break;
    } else {
        System.out.print(d[f]);
    }
    f--;
}
System.out.println("(2)");
```

**Penjelasan**:
- Membuat dua array `d` dan `e` untuk menyimpan hasil konversi biner dan nilai desimal sementara.
- Loop pertama melakukan pembagian untuk mendapatkan nilai biner, dan loop kedua mencetak hasil biner dari array `d`.

### 5. Konversi Desimal ke Heksadesimal

```java
System.out.print("   - Heksadesimal = ");
int g[] = new int[20], h = 0;
int[] i = new int[20];
g[0] = b[c] % 16;
i[0] = b[c] / 16;

while (true) {
    if (i[h] == 0) {
        break;
    } else {
        g[h + 1] = i[h] % 16;
        i[h + 1] = i[h] / 16;
        h++;
    }
}

while (true) {
    if (h == -1) {
        break;
    } else {
        if (g[h] == 10) {
            System.out.print("A");
        } else if (g[h] == 11) {
            System.out.print("B");
        } else if (g[h] == 12) {
            System.out.print("C");
        } else if (g[h] == 13) {
            System.out.print("D");
        } else if (g[h] == 14) {
            System.out.print("E");
        } else if (g[h] == 15) {
            System.out.print("F");
        } else {
            System.out.print(g[h]);
        }
    }
    h--;
}
System.out.println("(16)");
```

**Penjelasan**:
- Membuat dua array `g` dan `i` untuk menyimpan hasil konversi heksadesimal.
- Loop pertama melakukan pembagian untuk mendapatkan nilai heksadesimal, dan loop kedua mencetak hasil heksadesimal dengan memperhatikan konversi angka 10-15 menjadi karakter A-F.

### 6. Menampilkan Hasil

```java
System.out.println();
System.out.println("-------------------------------------------");
System.out.println();
```

**Penjelasan**:
- Menambahkan garis pemisah dan baris kosong untuk memperjelas output program.

