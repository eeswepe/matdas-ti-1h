Algoritma **Penggabungan (Union)** dari dua himpunan. Algoritma ini bertujuan untuk menghasilkan himpunan baru yang berisi semua elemen dari dua himpunan tanpa ada duplikasi.

### Langkah-langkah Algoritma Union

1. **Input** : Dua himpunan, A dan B.
2. **Inisialisasi** : Buat himpunan kosong C untuk menyimpan hasil penggabungan.
3. **Tambahkan Elemen dari A** : Untuk setiap elemen x dalam himpunan A, tambahkan x ke himpunan C.
4. **Tambahkan Elemen dari B** : Untuk setiap elemen y dalam himpunan B:
   - Jika y tidak ada di C, tambahkan y ke C.
5. **Output** : Kembalikan himpunan C sebagai hasil penggabungan.

### Pseudocode

Berikut adalah pseudocode untuk algoritma penggabungan:

```
FUNCTION union(A, B)
    SET C = {}  // Himpunan kosong untuk hasil
    // Tambahkan elemen dari himpunan A
    FOR EACH x IN A DO
        ADD x TO C
    END FOR
    
    // Tambahkan elemen dari himpunan B
    FOR EACH y IN B DO
        IF y NOT IN C THEN
            ADD y TO C
        END IF
    END FOR
    
    RETURN C  // Kembalikan himpunan hasil penggabungan
END FUNCTION
```

### Contoh Penerapan

Misalkan kita memiliki dua himpunan:

- A = {1, 2, 3}
- B = {3, 4, 5}

**Langkah-langkahnya**:

1. Mulai dengan himpunan C yang kosong.
2. Tambahkan elemen dari A ke C:
   - C = {1}
   - C = {1, 2}
   - C = {1, 2, 3}
3. Tambahkan elemen dari B ke C:
   - y = 3, sudah ada di C, jadi lewati.
   - y = 4, tambahkan ke C → C = {1, 2, 3, 4}
   - y = 5, tambahkan ke C → C = {1, 2, 3, 4, 5}
4. Hasil akhir dari penggabungan A dan B adalah C = {1, 2, 3, 4, 5}.

Algoritma ini berguna dalam berbagai aplikasi, seperti basis data, analisis set, dan pemrograman komputasi.

## Kesimpulan 

Penggabungan (Union) adalah bahwa algoritma ini secara efektif menggabungkan dua himpunan, A dan B, menjadi himpunan baru C yang berisi semua elemen unik dari kedua himpunan. Prosesnya meliputi penambahan elemen dari himpunan A dan kemudian elemen dari himpunan B dengan memeriksa duplikasi. Hasil akhir adalah himpunan C yang bebas dari elemen duplikat, dan algoritma ini memiliki aplikasi luas dalam pengolahan data, basis data, dan analisis set.