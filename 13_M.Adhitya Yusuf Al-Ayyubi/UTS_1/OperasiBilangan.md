# OPERASI BILANGAN #
```
public static int binerKeDesimal(String biner) {
        int desimal = 0;
        for (int i = 0; i < biner.length(); i++) {
            desimal = desimal * 2 + (biner.charAt(i) - '0');
        }
        return desimal;
    }
```
Metode biner ke desimal :  
``desimal = desimal * 2 + (biner.charAt(i) - '0')``: Dalam loop, setiap karakter biner dari kiri ke kanan diambil dan dikonversi menjadi nilai integer ``(biner.charAt(i) - '0')``. Nilai desimal kemudian dikalikan dengan 2 (karena basis biner) dan ditambahkan dengan nilai bit biner saat ini.  
Misalkan, ``biner = "101"``:  
``desimal = 0 * 2 + 1 = 1``  
``desimal = 1 * 2 + 0 = 2``  
``desimal = 2 * 2 + 1 = 5``  
Hasilnya adalah ``5``, yang merupakan nilai desimal dari ``101`` dalam biner.  

```
public static String desimalKeBiner(int desimal) {
    StringBuilder biner = new StringBuilder();
    if (desimal == 0) return "0";
    while (desimal > 0) {
        biner.insert(0, desimal % 2);
        desimal /= 2;
    }
    return biner.toString();
}
```
Metode desimal ke biner :  
``biner.insert(0, desimal % 2)``: Menyisipkan hasil pembagian sisa ``desimal`` dengan 2 di awal ``StringBuilder``. Ini menghasilkan bit paling kanan dari bilangan biner.  
``desimal /= 2``: Membagi ``desimal`` dengan 2 untuk mengurangi nilainya, yang pada akhirnya menghasilkan representasi biner ketika diulang.  
Misalnya, ``desimal = 5``:  
``biner.insert(0, 5 % 2)``: ``5 % 2 = 1`` menghasilkan "1"  
``desimal = 5 / 2 = 2``  
``biner.insert(0, 2 % 2)``: ``2 % 2 = 0`` menghasilkan "01"    
``desimal = 2 / 2 = 1``  
``biner.insert(0, 1 % 2)``: ``1 % 2 = 1`` menghasilkan "101"  
Hasil akhir: ``101``.  

```
public static String operasiBiner(String biner1, String biner2, String operasi) {
    int desimal1 = binerKeDesimal(biner1);
    int desimal2 = binerKeDesimal(biner2);
    int hasil = 0;

    switch (operasi) {
        case "tambah":
            hasil = desimal1 + desimal2;
            break;
        case "kurang":
            hasil = desimal1 - desimal2;
            break;
        case "kali":
            hasil = desimal1 * desimal2;
            break;
        case "and":
            hasil = desimal1 & desimal2;
            break;
        case "or":
            hasil = desimal1 | desimal2;
            break;
        case "xor":
            hasil = desimal1 ^ desimal2;
            break;
    }
    return desimalKeBiner(hasil);
}
```
Metode operasi bilangan :  
``int desimal1 = binerKeDesimal(biner1); int desimal2 = binerKeDesimal(biner2);``
Mengonversi kedua bilangan biner menjadi desimal.     
``hasil = desimal1 + desimal2:`` Penjumlahan.  
``hasil = desimal1 - desimal2:`` Pengurangan.  
``hasil = desimal1 * desimal2:`` Perkalian.  
``hasil = desimal1 & desimal2:`` Operasi AND bitwise, membandingkan bit secara berpasangan dan mengembalikan 1 hanya jika kedua bit bernilai 1.   
``hasil = desimal1 | desimal2:`` Operasi OR bitwise, mengembalikan 1 jika salah satu atau kedua bit bernilai 1.  
``hasil = desimal1 ^ desimal2:`` Operasi XOR bitwise, mengembalikan 1 jika hanya satu dari kedua bit bernilai 1.  
Hasil dari operasi dikonversi kembali ke biner menggunakan ``desimalKeBiner`` dan dikembalikan dalam bentuk string.
