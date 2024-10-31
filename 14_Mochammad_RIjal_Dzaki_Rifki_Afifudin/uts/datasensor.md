# Program Data Sensor

### Input Data Sensor
Pada bagian ini, kode meminta input dari pengguna untuk nilai suhu, kelembapan, dan CO2.
```java
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan nilai suhu (dalam °C): ");
double suhu = scanner.nextDouble();
System.out.print("Masukkan nilai kelembapan (dalam %): ");
int kelembapan = scanner.nextInt();
System.out.print("Masukkan nilai CO2 (dalam ppm): ");
int co2 = scanner.nextInt();
```
### Menampilkan Nilai Suhu
Kode ini menampilkan nilai suhu yang dimasukkan oleh pengguna dalam format desimal.
```java
System.out.println("\nSuhu:");
System.out.println("Desimal: " + suhu + " °C");
```
### Konversi Suhu ke Biner (Bagian Bulat)
Bagian ini mengonversi bagian bulat dari suhu ke format biner.
```java
int suhuBulat = (int) suhu;
String suhuBinerBulat = "";
int tempSuhuBulat = suhuBulat;

while (tempSuhuBulat > 0) {
    suhuBinerBulat = (tempSuhuBulat % 2) + suhuBinerBulat;
    tempSuhuBulat /= 2;
}
```
### Konversi Suhu ke Biner (Bagian Pecahan)
Bagian ini mengonversi bagian pecahan dari suhu ke format biner.
```java
String suhuBinerPecahan = "0.";
double pecahan = suhu - suhuBulat;

for (int i = 0; i < 8; i++) {
    pecahan *= 2;
    int digitPecahan = (int) pecahan;
    suhuBinerPecahan += digitPecahan;
    pecahan -= digitPecahan;
}

}

```
### Konversi Suhu ke Heksadesimal
Bagian ini mengonversi suhu bulat ke format heksadesimal.
```java
String suhuHeks = "";
int tempSuhuHeks = suhuBulat;
char[] heksDigit = {'0', '1', '2', '3', '4', '5', '6', '7', 
                    '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

while (tempSuhuHeks > 0) {
    suhuHeks = heksDigit[tempSuhuHeks % 16] + suhuHeks;
    tempSuhuHeks /= 16;
}

```
### Menampilkan Hasil Konversi Suhu
Bagian ini menampilkan hasil konversi suhu dalam format biner dan heksadesimal.
```java
System.out.println("Biner: " + suhuBinerBulat + " " + suhuBinerPecahan);
System.out.println("Heksadesimal: " + suhuHeks);
```