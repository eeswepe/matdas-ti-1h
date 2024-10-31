# OPERASI ENKRIPSI #
```
public static String xorBinar(String binar1, String binar2) {
    StringBuilder ulang = new StringBuilder();
    for (int i = 0; i < binar1.length(); i++) {
        char bit1 = binar1.charAt(i);
        char bit2 = binar2.charAt(i);
        ulang.append((bit1 == bit2) ? '0' : '1');
    }
    return ulang.toString();
}
```
Operasi XOR (exclusive OR) antara dua bit menghasilkan 1 jika kedua bit berbeda, dan 0 jika sama. Tabel operasi XOR:  
``0 XOR 0 = 0``  
``0 XOR 1 = 1``  
``1 XOR 0 = 1``  
``1 XOR 1 = 0``  
Implementasi dalam Kode:  
``for (int i = 0; i < binar1.length(); i++)``: Loop yang akan mengulang setiap bit dari ``binar1`` dan ``binar2``.  
``char bit1 = binar1.charAt(i);`` dan ``char bit2 = binar2.charAt(i);``: Mengambil masing-masing bit pada posisi ``i`` dari ``binar1`` dan ``binar2``.  
``ulang.append((bit1 == bit2) ? '0' : '1');``: Memeriksa apakah ``bit1`` dan ``bit2`` sama. Jika ya, tambahkan '0' ke hasil. Jika berbeda, tambahkan '1'.  
```
public static String binarToHex(String binar) {
    StringBuilder hex = new StringBuilder();
    for (int i = 0; i < binar.length(); i += 4) {
        String nibble = binar.substring(i, i + 4);
        int desimal = 0;
        for (int j = 0; j < 4; j++) {
            desimal = desimal * 2 + (nibble.charAt(j) - '0');
        }
        if (desimal < 10) {
            hex.append((char)(desimal + '0'));
        } else {
            hex.append((char)(desimal - 10 + 'A'));
        }
    }
    return hex.toString();
}
```
Konversi Biner ke Heksadesimal:  
->String biner dipecah menjadi kelompok 4-bit (nibble).  
->Setiap nibble dikonversi ke bilangan desimal, lalu ke karakter heksadesimal.  
Implementasi dalam Kode:  
->``for (int i = 0; i < binar.length(); i += 4): ``Loop setiap 4 bit.  
->``String nibble = binar.substring(i, i + 4);``: Mengambil 4 bit dari string ``binar``.  
->``int desimal = 0;``: Mendeklarasikan variabel ``desimal`` untuk menyimpan hasil konversi.  
->Loop internal ``for (int j = 0; j < 4; j++)``: Mengonversi nibble dari biner ke desimal dengan mengalikan ``desimal`` dengan 2 setiap kali (sifat dari sistem biner).  
->``if (desimal < 10)``: Menambahkan karakter 0-9 jika nilainya < 10, atau A-F jika >= 10.  
Contoh:  
Misalnya, jika input biner adalah "01100110", maka kita bagi menjadi:  
"0110" -> Desimal 6 -> Heksadesimal "6"  
"0110" -> Desimal 6 -> Heksadesimal "6"  
Hasilnya: "66".  
```
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan bilangan biner pertama (8 bit): ");
    String binar1 = sc.nextLine();
    
    System.out.print("Masukkan bilangan biner kedua (8 bit): ");
    String binar2 = sc.nextLine();
    String key = "10101010";  

    String enkripsiBinar1 = xorBinar(binar1, key);
    String enkripsiBinar2 = xorBinar(binar2, key);

    String enkripsiHex1 = binarToHex(enkripsiBinar1);
    String enkripsiHex2 = binarToHex(enkripsiBinar2);

    System.out.println("Hasil enkripsi biner pertama (XOR dengan kunci): " + enkripsiBinar1);
    System.out.println("Hasil enkripsi heksadesimal pertama: " + enkripsiHex1);
    System.out.println("Hasil enkripsi biner kedua (XOR dengan kunci): " + enkripsiBinar2);
    System.out.println("Hasil enkripsi heksadesimal kedua: " + enkripsiHex2);

    sc.close();
}
```
Kode program diatas berfungsi untuk membaca input dari pengguna, melakukan enkripsi menggunakan operasi XOR, dan menampilkan hasilnya.