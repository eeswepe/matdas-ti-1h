utsmatdas3
utsmatdas3
Program di atas melakukan konversi data suhu, kelembapan, dan CO2 dari desimal ke representasi biner dan heksadesimal. Setiap nilai ditampilkan dalam ketiga format (desimal, biner, dan heksadesimal). Berikut penjelasan fungsi tiap bagian program beserta potongan kodenya dalam format markdown.

---

### 1. Deklarasi dan Inisialisasi Variabel

Program mendeklarasikan dan menginisialisasi variabel `suhu`, `kelembapan`, dan `co2` dengan nilai desimal awal. Variabel `suhuInt` digunakan untuk menyimpan nilai suhu dalam bentuk integer agar dapat dikonversi.

```java
double suhu = 28.6;
int kelembapan = 65;
int co2 = 420; 
int suhuInt = (int) suhu;
```

### 2. Menampilkan Suhu dalam Desimal, Biner, dan Heksadesimal

- Program pertama-tama menampilkan nilai suhu dalam format desimal (`suhu`).
- Lalu, program mengonversi `suhuInt` ke biner dengan membagi `suhuInt` secara berulang dengan 2 dan menyimpan sisa bagi. Hasil konversi disimpan dalam array `binerSuhu`.
- Setelah itu, program mengonversi `suhuInt` ke heksadesimal dengan membagi `suhuInt` secara berulang dengan 16 dan menyimpan sisa bagi dalam array `hexSuhu`.

```java
System.out.print("Suhu       : " + suhu + " °C");
System.out.print(" (Biner: ");

int[] binerSuhu = new int[32];
int i = 0; 

while (suhuInt > 0) { 
    binerSuhu[i] = suhuInt % 2; 
    suhuInt /= 2; 
    i++; 
}
for (int j = i - 1; j >= 0; j--) {
    System.out.print(binerSuhu[j]); 
}

System.out.print(", Heksadesimal: ");
char[] hexSuhu = new char[32]; 
i = 0; 
suhuInt = (int) suhu;
char[] heksadesimal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}; 

while (suhuInt > 0) { 
    hexSuhu[i] = heksadesimal[suhuInt % 16]; 
    suhuInt /= 16; 
    i++; 
}
for (int j = i - 1; j >= 0; j--) {
    System.out.print(hexSuhu[j]); 
}
System.out.println(")");
```

### 3. Menampilkan Kelembapan dalam Desimal, Biner, dan Heksadesimal

- Program menampilkan nilai `kelembapan` dalam format desimal.
- Selanjutnya, `kelembapan` dikonversi ke biner dengan cara serupa dan disimpan dalam `binerKelembapan`.
- Setelah itu, `kelembapan` juga dikonversi ke heksadesimal, hasilnya disimpan dalam `hexKelembapan`, dan ditampilkan.

```java
System.out.print("Kelembapan : " + kelembapan + " %");
System.out.print("    (Biner: ");

int[] binerKelembapan = new int[32]; 
i = 0; 

while (kelembapan > 0) { 
    binerKelembapan[i] = kelembapan % 2; 
    kelembapan /= 2; 
    i++;
}
for (int j = i - 1; j >= 0; j--) {
    System.out.print(binerKelembapan[j]); 
}

System.out.print(", Heksadesimal: ");
char[] hexKelembapan = new char[32]; 
i = 0; 
kelembapan = 65; 

while (kelembapan > 0) { 
    hexKelembapan[i] = heksadesimal[kelembapan % 16];
    kelembapan /= 16; 
    i++; 
}
for (int j = i - 1; j >= 0; j--) {
    System.out.print(hexKelembapan[j]); 
}
System.out.println(")");
```

### 4. Menampilkan CO2 dalam Desimal, Biner, dan Heksadesimal

- Program menampilkan nilai `co2` dalam format desimal.
- Nilai `co2` kemudian dikonversi ke biner, hasilnya disimpan dalam `binerCO2`, dan ditampilkan.
- Selanjutnya, `co2` juga dikonversi ke heksadesimal, hasilnya disimpan dalam `hexCO2`, dan ditampilkan.

```java
System.out.print("CO2        : " + co2 + " ppm"); 
System.out.print(" (Biner: ");

int[] binerCO2 = new int[32]; 
i = 0; 

while (co2 > 0) { 
    binerCO2[i] = co2 % 2; 
    co2 /= 2;
    i++; 
}
for (int j = i - 1; j >= 0; j--) {
    System.out.print(binerCO2[j]); 
}

System.out.print(", Heksadesimal: ");

char[] hexCO2 = new char[32]; 
i = 0; 
co2 = 420;

while (co2 > 0) { 
    hexCO2[i] = heksadesimal[co2 % 16]; 
    co2 /= 16; 
    i++; 
}
for (int j = i - 1; j >= 0; j--) {
    System.out.print(hexCO2[j]); 
}
System.out.println(")");
```

---

### Ringkasan
Program ini mengambil nilai `suhu`, `kelembapan`, dan `co2`, lalu menampilkan setiap nilai dalam tiga format: desimal, biner, dan heksadesimal. Program menggunakan perulangan untuk membagi nilai desimal dan menyimpan sisa bagi untuk konversi biner dan heksadesimal.
Markdown 4006 bytes 584 words 135 lines Ln 135, Col 265HTML 3122 characters 560 words 97 paragraphs