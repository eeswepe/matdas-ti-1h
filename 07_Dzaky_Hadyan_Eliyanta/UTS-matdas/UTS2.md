# Penjelasan kode program UTS matdas nomor 2
* Nama: Dzaky Hadyan Eliyanta
* No. Absen: 07
* NIM: 244107020117
## 
```import java.util.Scanner;```  
Sintaks di atas merupakan salah satu class di dalam util package yang mana digunakan untuk mengambil input dari user  
```
public class UTS2 {
public static void main(String[] args) {
```
Mendeklarasikan class UTS2 dan method main  
```
Scanner sc = new Scanner(System.in);
```  
Membuat objek Scanner bernama sc untuk membaca input dari terminal  
```
System.out.println("1. Penjumlahan");
System.out.println("2. Pengurangan");
System.out.println("3. Perkalian");
System.out.println("4. Operasi logika(AND, OR, XOR)");
System.out.print("Pilih operasi terhadap biner: ");
```  
Menampilkan empat pilihan operasi (Penjumlahan, Pengurangan, Perkalian, dan Operasi logika) dan meminta input user
```
int operasi = sc.nextInt();
String sampah = sc.nextLine();
```
Membaca input pilihan operasi dari pengguna dan mengabaikan sisa baris yang tersisa  
```
System.out.print("Bilangan pertama: ");
String bilanganPertama = sc.nextLine();
System.out.print("Bilangan kedua: ");
String bilanganKedua = sc.nextLine();
```  
Membaca dua bilangan biner sebagai string (bilanganPertama dan bilanganKedua)  
```
int digit1 = bilanganPertama.length();
int digit2 = bilanganKedua.length();
```  
Menghitung panjang (jumlah digit) dari kedua bilangan biner  
```
switch (operasi) {
```  
Memeriksa pilihan operasi yang dipilih oleh pengguna dan melanjutkan dengan proses sesuai dengan nilai operasi  
```
case 1:
```  
Memulai proses untuk melakukan penjumlahan  
```
int decimal11 = 0;
for (int i = 0; i < digit1; i++) {
    char bit = bilanganPertama.charAt(digit1 - 1 - i);
    if (bit == '1') {
        decimal11 += Math.pow(2, i);
    }
}
System.out.println("Desimal 1: " + decimal11);
```  
Menghitung nilai desimal dari bilanganPertama dengan memeriksa setiap bit dan menjumlahkan nilai yang sesuai (2^i) jika bit adalah '1'  
```
int decimal12 = 0;
for (int i = 0; i < digit2; i++) {
    char bit = bilanganKedua.charAt(digit2 - 1 - i);
    if (bit == '1') {
        decimal12 += Math.pow(2, i);
    }
}
System.out.println("Desimal 2: " + decimal12);
```  
Proses yang sama dilakukan untuk bilanganKedua  
```
int jumlahDesimal = decimal11 + decimal12;
```  
Menjumlahkan hasil desimal dari kedua bilangan  
```
int [] listModulus1 = new int[99];
int i = 0;
do {
    listModulus1[i] = jumlahDesimal % 2;
    jumlahDesimal /= 2;
    i++;
} while (jumlahDesimal != 0);
```  
Menggunakan modulus 2 untuk mengonversi jumlah desimal kembali ke biner dan menyimpannya dalam array listModulus1  
```
for (; i >= 0; i--) {
    System.out.print(listModulus1[i]);
}
```  
Mencetak hasil penjumlahan dalam bentuk biner
```
case 2:
```  
Memulai proses untuk melakukan pengurangan
```
int kurangDesimal = decimal21 - decimal22;
```  
Mengurangi nilai desimal yang diperoleh  
```
case 3:
```  
Memulai proses untuk melakukan perkalian  
```
int kaliDesimal = decimal31 * decimal32;
```  
Mengalikan dua nilai desimal yang diperoleh  
```
case 4:
```  
Memulai proses untuk melakukan operasi logika  
```
System.out.print("AND: ");
for (int l = 0; l < digit1; l++) {
    if (bilanganPertama.charAt(l) == '1' && bilanganKedua.charAt(l) == '1') {
        System.out.print("1");
    } else {
        System.out.print("0");
    }
}
System.out.println();
```  
Menerapkan operasi AND pada setiap bit dan mencetak hasilnya  
```
System.out.print("OR: ");
for (int l = 0; l < digit1; l++) {
    if (bilanganPertama.charAt(l) == '1' || bilanganKedua.charAt(l) == '1') {
        System.out.print("1");
    } else {
        System.out.print("0");
    }
}
System.out.println();
```  
Menerapkan operasi OR pada setiap bit dan mencetak hasilnya  
```
System.out.print("XOR: ");
for (int l = 0; l < digit1; l++) {
    if (bilanganPertama.charAt(l) == bilanganKedua.charAt(l)) {
        System.out.print("0");
    } else {
        System.out.print("1");
    }
}
```  
Menerapkan operasi XOR pada setiap bit dan mencetak hasilnya  
```
sc.close();
```  
Menutup objek Scanner untuk membebaskan sumber daya yang digunakan