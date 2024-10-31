# Penjelasan kode program UTS matdas nomor 4
* Nama: Dzaky Hadyan Eliyanta
* No. Absen: 07
* NIM: 244107020117
## 
```import java.util.Scanner;```  
Sintaks di atas merupakan salah satu class di dalam util package yang mana digunakan untuk mengambil input dari user  
```
public class UTS4 {
public static void main(String[] args) {
```
Mendeklarasikan class UTS4 dan method main  
```
Scanner sc = new Scanner(System.in);
```  
Membuat objek Scanner bernama sc untuk membaca input dari terminal  
```
System.out.print("Pesan dasar: ");
String pesanDasar = sc.nextLine();
System.out.print("Kunci: ");
String kunci = sc.nextLine();
```  
Meminta pengguna untuk memasukkan pesan dasar dan kunci, menyimpannya dalam variabel pesanDasar dan kunci  
```
int intPesanDasar = Integer.valueOf(pesanDasar);
int intKunci = Integer.valueOf(kunci);
```  
Mengonversi string pesanDasar dan kunci ke integer. Namun, dalam konteks ini, sepertinya tidak diperlukan karena kode selanjutnya tidak menggunakan variabel ini  
```
String [] hasilEnkripsi = new String[pesanDasar.length()];
```  
Membuat array hasilEnkripsi untuk menyimpan hasil enkripsi biner dari setiap karakter dalam pesanDasar  
```
for (int l = 0; l < pesanDasar.length(); l++) {
    hasilEnkripsi[l] = "";
    if (pesanDasar.charAt(l) == kunci.charAt(l)) {
        hasilEnkripsi[l] += "0";
    } else {
        hasilEnkripsi[l] += "1";
    }
}
```  
Mengiterasi setiap karakter dari pesanDasar dan kunci. Jika karakter pada pesanDasar dan kunci sama, hasilnya adalah '0', jika tidak sama, hasilnya adalah '1'. Hasilnya disimpan dalam hasilEnkripsi  
```
System.out.print("Hasil enkripsi dalam biner: ");
for (int l = 0; l < hasilEnkripsi.length; l++) {
    System.out.print(hasilEnkripsi[l]);
}
System.out.println();
```  
Mencetak hasil enkripsi biner dengan mengiterasi array hasilEnkripsi  
```
System.out.print("Hasil enkripsi dalam heksadesimal: ");
String stringHasilEnkripsi = "";
for (int i = 0; i < hasilEnkripsi.length; i++) {
    stringHasilEnkripsi += hasilEnkripsi[i];
}
```  
Menggabungkan elemen-elemen dalam hasilEnkripsi menjadi satu string stringHasilEnkripsi  
```  
int decimalEnkripsi = 0;
for (int i = 0; i < stringHasilEnkripsi.length(); i++) {
    char bit = stringHasilEnkripsi.charAt(stringHasilEnkripsi.length() - 1 - i);
    if (bit == '1') {
        decimalEnkripsi += Math.pow(2, i);
    }
}
```  
Mengonversi string biner stringHasilEnkripsi ke desimal dengan menghitung nilai berdasarkan posisi bit  
```
char [] listModulusEnkripsi = new char[99];
int i = 0;
do {
    int modulus = decimalEnkripsi % 16;
    if (modulus < 10) {
        listModulusEnkripsi[i] = (char) ('0' + modulus);
    } else {
        listModulusEnkripsi[i] = (char) ('A' + (modulus - 10));
    }
    decimalEnkripsi /= 16;
    i++;
} while (decimalEnkripsi != 0);
```  
Menggunakan modulus 16 untuk mengonversi nilai desimal decimalEnkripsi ke heksadesimal dan menyimpannya dalam array listModulusEnkripsi  
```
for (int j = i-1; j >= 0; j--) {
    System.out.print(listModulusEnkripsi[j]);
}
```  
Mencetak hasil konversi heksadesimal dengan mengiterasi array listModulusEnkripsi dalam urutan terbalik  
```
sc.close();
```  
Menutup objek Scanner untuk membebaskan sumber daya yang digunakan