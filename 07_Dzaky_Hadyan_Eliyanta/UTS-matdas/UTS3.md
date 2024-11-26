# Penjelasan kode program UTS matdas nomor 3
* Nama: Dzaky Hadyan Eliyanta
* No. Absen: 07
* NIM: 244107020117
## 
```import java.util.Scanner;```  
Sintaks di atas merupakan salah satu class di dalam util package yang mana digunakan untuk mengambil input dari user  
```
public class UTS3 {
public static void main(String[] args) {
```
Mendeklarasikan class UTS3 dan method main  
```
Scanner sc = new Scanner(System.in);
```  
Membuat objek Scanner bernama sc untuk membaca input dari terminal  
```
System.out.print("Suhu(°C): ");
double suhu = sc.nextDouble();
System.out.print("Kelembapan(%): ");
int kelembapan = sc.nextInt();
System.out.print("CO2(ppm): ");
int CO2 = sc.nextInt();
```  
Meminta pengguna untuk memasukkan nilai suhu (dalam °C), kelembapan (dalam %), dan konsentrasi CO2 (dalam ppm), dan menyimpannya dalam variabel suhu, kelembapan, dan CO2  
```
int suhuInt = (int) suhu;
double koma = suhu - suhuInt;
if (koma >= 0.5) {
    suhuInt += 1;
}
```  
Mengonversi suhu dari double ke int untuk membulatkan ke bilangan bulat terdekat. Jika bagian desimal (koma) lebih besar atau sama dengan 0.5, maka suhuInt ditambah 1  
```
int [] listModulus = new int[99];
int i = 0;
do {
    listModulus[i] = suhuInt % 2;
    suhuInt /= 2;
    i++;
} while (suhuInt != 0);
```  
Menggunakan modulus 2 untuk mengonversi nilai suhu bulat ke biner dan menyimpannya dalam array listModulus  
```
System.out.print("Suhu dalam biner: ");
for (; i >= 0; i--) {
    System.out.print(listModulus[i]);
}
System.out.println();
```  
Mencetak hasil konversi suhu ke biner dengan mencetak elemen array dalam urutan terbalik  
```
int suhuInt1 = (int) suhu;
double koma1 = suhu - suhuInt;
if (koma >= 0.5) {
    suhuInt1 += 1;
}
```  
Sama dengan proses sebelumnya untuk pembulatan suhu  
```
char [] listModulus1 = new char[99];
int j = 0;
do {
    int modulus = suhuInt1 % 16;
    if (modulus < 10) {
        listModulus1[j] = (char) ('0' + modulus);
    } else {
        listModulus1[j] = (char) ('A' + (modulus - 10));
    }
    suhuInt1 /= 16;
    j++;
} while (suhuInt1 != 0);
```  
Menggunakan modulus 16 untuk mengonversi nilai suhu bulat ke heksadesimal dan menyimpannya dalam array listModulus1. Jika modulus kurang dari 10, maka ditambahkan karakter '0', jika lebih dari 10, ditambahkan karakter 'A'  
```
System.out.print("Suhu dalam hexadesimal: ");
for (int k = j-1; k >= 0; k--) {
    System.out.print(listModulus1[k]);
}
System.out.println();
```  
Mencetak hasil konversi suhu ke heksadesimal dengan mencetak elemen array dalam urutan terbalik  
```
int kelembapanBiner = kelembapan;
int [] listModulus2 = new int[99];
int k = 0;
do {
    listModulus2[k] = kelembapanBiner % 2;
    kelembapanBiner /= 2;
    k++;
} while (kelembapanBiner != 0);
```  
Proses yang sama dilakukan untuk mengonversi kelembapan ke biner  
```
System.out.print("Kelembapan dalam biner: ");
for (; k >= 0; k--) {
    System.out.print(listModulus2[k]);
}
System.out.println();
```  
Mencetak hasil konversi kelembapan ke biner  
```
int kelembapanHexa = kelembapan;
char [] listModulus3 = new char[99];
int l = 0;
do {
    int modulus = kelembapanHexa % 16;
    if (modulus < 10) {
        listModulus3[l] = (char) ('0' + modulus);
    } else {
        listModulus3[l] = (char) ('A' + (modulus - 10));
    }
    kelembapanHexa /= 16;
    l++;
} while (kelembapanHexa != 0);
```  
Proses yang sama seperti sebelumnya untuk mengonversi kelembapan ke heksadesimal  
```
System.out.print("Kelembapan dalam hexadesimal: ");
for (int m = l-1; m >= 0; m--) {
    System.out.print(listModulus3[m]);
}
System.out.println();
```  
Mencetak hasil konversi kelembapan ke heksadesimal  
```
int CO2Biner = CO2;
int [] listModulus4 = new int[99];
int m = 0;
do {
    listModulus4[m] = CO2Biner % 2;
    CO2Biner /= 2;
    m++;
} while (CO2Biner != 0);
```  
Proses yang sama dilakukan untuk mengonversi nilai CO2 ke biner  
```
System.out.print("CO2 dalam biner: ");
for (; m >= 0; m--) {
    System.out.print(listModulus4[m]);
}
System.out.println();
```  
Mencetak hasil konversi CO2 ke biner  
```
int CO2Hexa = CO2;
char [] listModulus5 = new char[99];
int n = 0;
do {
    int modulus = CO2Hexa % 16;
    if (modulus < 10) {
        listModulus5[n] = (char) ('0' + modulus);
    } else {
        listModulus5[n] = (char) ('A' + (modulus - 10));
    }
    CO2Hexa /= 16;
    n++;
} while (CO2Hexa != 0);
```  
Proses yang sama dilakukan untuk mengonversi nilai CO2 ke heksadesimal  
```
System.out.print("CO2 dalam hexadesimal: ");
for (int o = n-1; o >= 0; o--) {
    System.out.print(listModulus5[o]);
}
System.out.println();
```  
Mencetak hasil konversi CO2 ke heksadesimal  
```
sc.close();
```  
Menutup objek Scanner untuk membebaskan sumber daya yang digunakan