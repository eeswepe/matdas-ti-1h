# KONVERSI BILANGAN #
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
Setiap angka desimal dibagi dengan 2, dan sisa bagi ``(desimal % 2)`` menjadi digit biner paling kanan. Dengan mengulangi proses ini,akan membentuk angka biner dari kanan ke kiri.contoh :  
Input: 13   
Proses:  
13 % 2 = 1 ➔ sisa 1  
6 % 2 = 0 ➔ sisa 0  
3 % 2 = 1 ➔ sisa 1  
1 % 2 = 1 ➔ sisa 1  
Output: 1101.  

```
public static String desimalKeHeksadesimal(int desimal) {
        StringBuilder heksadesimal = new StringBuilder();
        char[] heksArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        if (desimal == 0) return "0";
        while (desimal > 0) {
            heksadesimal.insert(0, heksArray [desimal % 16]);
            desimal /= 16;
        }
        return heksadesimal.toString();
    }
```
Metode desimal ke heksadesimal :  
Setiap angka desimal dibagi dengan 16, dan sisa bagi ``(desimal % 16)`` menentukan digit heksadesimal. Sisa ini dicari dalam array ``heksArray``, yang menyimpan karakter 0-9 dan A-F.  
Contoh:  
Input: 254  
Proses:  
254 % 16 = 14 ➔ sisa E  
15 % 16 = 15 ➔ sisa F  
Output: FE.  

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
Setiap digit biner dikalikan dengan 2 pangkat n, dengan n sebagai posisi dari kanan ke kiri.  
Contoh:  
Input: 1101  
Proses:  
1 * 2 ^ 3 + 1 * 2 ^ 2 + 0 * 2 ^ 1 + 1 * 2 ^ 0 = 13  
Output: 13.  

```
public static String binerKeHeksadesimal(String biner) {
    int desimal = binerKeDesimal(biner);
    return desimalKeHeksadesimal(desimal);
}
```
Metode biner ke heksadesimal :  
Metode ini pertama mengonversi bilangan biner menjadi desimal menggunakan ``binerKeDesimal()``, kemudian desimal menjadi heksadesimal menggunakan ``desimalKeHeksadesimal()``.  

```
public static int heksadesimalKeDesimal(String heksadesimal) {
    int desimal = 0;
    char[] heksMap = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    for (int i = 0; i < heksadesimal.length(); i++) {
        char c = heksadesimal.charAt(i);
        int nilai = 0;
        for (int j = 0; j < heksMap.length; j++) {
            if (c == heksMap[j]) {
                nilai = j;
                break;
            }
        }
        desimal = desimal * 16 + nilai;
    }
    return desimal;
}
```
Metode heksadesimal ke desimal :  
Setiap digit dikonversi ke nilai desimalnya dan dijumlahkan berdasarkan posisinya dalam pangkat 16.  
Contoh:  
Input: 1A  
Proses:  
1 * 16 ^ 1 + 10 * 16 ^ 0 = 26  
Output: 26.  

```
public static String heksadesimalKeBiner(String heksadesimal) {
    int desimal = heksadesimalKeDesimal(heksadesimal);
    return desimalKeBiner(desimal);
}
```
Metode heksadesimal ke biner :  
Metode ini pertama mengonversi heksadesimal ke desimal dengan ``heksadesimalKeDesimal()``, kemudian desimal ke biner menggunakan ``desimalKeBiner()``.  