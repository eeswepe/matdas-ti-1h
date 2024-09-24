## Mencari komplemen Himpunan Menggunakan Set Difference

Algoritma untuk mencari perbedaan diantara dua himpunan A dan B

**Pseudocode:**

'''
Output: Hitung (A-B)
Input: Himpunan A, Himpunan B;
    Buat Himpunan C untuk menampung (A-B).
    for setiap elemen a di Himpunan A:
        if a tidak ada di Himpunan B:
            tambah a ke Himpunan C;
    Return Himpunan C;
'''

**Implementasi dalam Java:**

```
import java.util.HashSet;

public class Tester {
    public static HashSet<String> setDifference(HashSet<String> A, HashSet<String> B) {
        HashSet<String> C = new HashSet<String>();
        for (String element : A) {
            if (!B.contains(element)) {
                C.add(element);
            }
        }
        return C;
    }

    public static void main (String[] args) {
        HashSet<String> A = new HashSet<String>();
        HashSet<String> B = new HashSet<String>();

        A.add("X");
        A.add("Y");
        A.add("Z");
        B.add("X");
        B.add("Y");

        HashSet<String> C = setDifference(A, B);
        // Set C akan menampung elemen "Z"
        System.out.println(C);
    }
}
```

**Penjelasan:**

Kode program di atas memiliki space complexity O(n) karena himpunan baru yaitu himpunan C digunakan untuk menampung semua elemen n di program.

Kode program di atas juga memiliki time complexity O(n) karena kita hanya perlu untuk mengiterasi semua elemen n di himpunan A sekali. Dan untuk setiap elemen n, kita uji keanggotaan himpunan B dalam waktu O(1).