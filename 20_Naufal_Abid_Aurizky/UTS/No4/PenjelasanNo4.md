## Penjelasan kode pemrograman (UTS NO 4)

## Inisialisasi dan Input Data
```
Scanner sc = new Scanner(System.in);

System.out.print("Input nilai suhu (°C): ");
double suhu = sc.nextDouble();

System.out.print("Input nilai kelembapan (%): ");
int kelembapan = sc.nextInt();

System.out.print("Input kadar CO2 (ppm): ");
int co2 = sc.nextInt();
```
* Berfungsi Menginisialisasi Scanner untuk membaca input pengguna dari konsol.
* Input:
    * Suhu: Dalam format desimal (misalnya, 25.5 °C).
    * Kelembapan: Dalam bentuk bilangan bulat persentase (%).
    * CO₂: Dalam satuan ppm (part per million), juga dalam bentuk bilangan bulat.

## Konversi Suhu
Bagian ini membagi suhu menjadi dua bagian (bilangan bulat dan desimal), lalu mengonversinya ke biner dan heksadesimal.

### a. Konversi Bagian Bilangan Bulat ke Biner
```
int suhuInteger = (int) suhu;
StringBuilder binerSuhu = new StringBuilder();
int tempSuhu = suhuInteger;
while (tempSuhu > 0) {
    binerSuhu.insert(0, tempSuhu % 2);
    tempSuhu /= 2;
}
System.out.println("Nilai Biner (Bilangan Bulat)  : " + binerSuhu.toString());
```
* suhuInteger adalah bagian bilangan bulat dari suhu.
* Proses konversi ke biner dilakukan dengan membagi suhuInteger secara berulang dengan 2 dan menyimpan sisanya (tempSuhu % 2) ke binerSuhu.
* Nilai biner dicetak setelah loop selesai.

### b. Konversi Bagian Bilangan Bulat ke Heksadesimal
```
StringBuilder heksaSuhu = new StringBuilder();
char[] heksaDigit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
tempSuhu = suhuInteger;
while (tempSuhu > 0) {
    heksaSuhu.insert(0, heksaDigit[tempSuhu % 16]);
    tempSuhu /= 16;
}
System.out.println("Nilai Heksadesimal (Bilangan Bulat): " + heksaSuhu.toString());
```
* Menggunakan array heksaDigit untuk mendapatkan representasi heksadesimal dari angka 0-15.
* Bagian bilangan bulat suhuInteger dibagi secara berulang dengan 16, dan sisa bagi (tempSuhu % 16) digunakan untuk mengambil digit dari heksaDigit.

### c. Konversi Bagian Desimal ke Biner
```
StringBuilder binerSuhuDecimal = new StringBuilder("0.");
double tempDecimal = suhu - suhuInteger;
int decimalPrecision = 5;
while (tempDecimal > 0 && decimalPrecision > 0) {
    tempDecimal *= 2;
    if (tempDecimal >= 1) {
        binerSuhuDecimal.append("1");
        tempDecimal -= 1;
    } else {
        binerSuhuDecimal.append("0");
    }
    decimalPrecision--;
}
System.out.println("Nilai Biner (Desimal): " + binerSuhuDecimal.toString());
```
* Bagian desimal suhuDecimal dikonversi ke biner dengan mengalikan nilai tersebut dengan 2. Jika hasilnya lebih besar atau sama dengan 1, tambahkan 1 ke hasil konversi, dan kurangi 1 dari nilai sementara.
* Pengulangan dihentikan ketika mencapai presisi maksimum (5 digit desimal).

## Konversi Kelembapan
Mirip dengan suhu, nilai kelembapan juga dikonversi ke biner dan heksadesimal.

### a. Konversi Kelembapan ke Biner
```
StringBuilder binerKelembapan = new StringBuilder();
int tempKelembapan = kelembapan;
while (tempKelembapan > 0) {
    binerKelembapan.insert(0, tempKelembapan % 2);
    tempKelembapan /= 2;
}
System.out.println("Nilai Biner      : " + binerKelembapan.toString());
```
* Menggunakan loop yang serupa dengan konversi suhu untuk mendapatkan representasi biner kelembapan.

### b. Konversi Kelembapan ke Heksadesimal
```
StringBuilder heksaKelembapan = new StringBuilder();
tempKelembapan = kelembapan;
while (tempKelembapan > 0) {
    heksaKelembapan.insert(0, heksaDigit[tempKelembapan % 16]);
    tempKelembapan /= 16;
}
System.out.println("Nilai Heksadesimal: " + heksaKelembapan.toString());
```
* Heksadesimal dari kelembapan dihitung dengan membagi kelembapan dengan 16 secara berulang dan mengonversi sisa bagi menjadi digit heksadesimal.

## Konversi Kadar CO₂
Terakhir, kadar CO₂ dikonversi ke biner dan heksadesimal.

### a. Konversi CO₂ ke Biner
```
StringBuilder binerCO2 = new StringBuilder();
int tempCO2 = co2;
while (tempCO2 > 0) {
    binerCO2.insert(0, tempCO2 % 2);
    tempCO2 /= 2;
}
System.out.println("Nilai Biner      : " + binerCO2.toString());
```
* Mirip dengan konversi lainnya, nilai CO₂ diubah menjadi biner dengan membagi secara berulang oleh 2.

### b. Konversi CO₂ ke Heksadesimal
```
StringBuilder heksaCO2 = new StringBuilder();
tempCO2 = co2;
while (tempCO2 > 0) {
    heksaCO2.insert(0, heksaDigit[tempCO2 % 16]);
    tempCO2 /= 16;
}
System.out.println("Nilai Heksadesimal: " + heksaCO2.toString());
sc.close();
```
* Konversi ke heksadesimal mengikuti metode yang sama seperti di atas, menggunakan array heksaDigit untuk mendapatkan digit yang sesuai.