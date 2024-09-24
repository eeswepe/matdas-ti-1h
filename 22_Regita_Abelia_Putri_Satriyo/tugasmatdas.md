## Divide and Conquer

### Penjelasan

Algoritma Divide and Conquer merupakan teknik pemecahan masalah yang digunakan untuk memecahkan masalah dengan membagi masalah utama menjadi beberapa submasalah, menyelesaikannya satu per satu, lalu menggabungkannya untuk menemukan solusi dari masalah awal. Dalam artikel ini, kita akan membahas bagaimana Algoritma Divide and Conquer bermanfaat dan bagaimana kita dapat menggunakannya untuk memecahkan masalah.

### Definisi Divide and Conquer

Algoritma Divide and Conquer melibatkan pemecahan masalah yang lebih besar menjadi submasalah yang lebih kecil, menyelesaikannya secara independen, dan kemudian menggabungkan solusinya untuk menyelesaikan masalah awal. Ide dasarnya adalah membagi masalah secara rekursif menjadi submasalah yang lebih kecil hingga menjadi cukup sederhana untuk diselesaikan secara langsung. Setelah solusi untuk submasalah diperoleh, solusi tersebut kemudian digabungkan untuk menghasilkan solusi keseluruhan.

### Cara Kerja Divide and Conquer

Algoritma Membagi dan Menaklukkan dapat dibagi menjadi tiga langkah: **Membagi** , **Menaklukkan** dan **Menggabungkan** .

1. **Membagi** :
-Memecah masalah asli menjadi submasalah yang lebih kecil.
-Setiap submasalah mesti mewakili bagian dari masalah keseluruhan.
-Tujuannya adalah membagi masalah hingga tidak ada lagi pembagian yang mungkin.
2. **Menaklukkan** :
-Selesaikan setiap submasalah yang lebih kecil satu per satu.
-Jika submasalah cukup kecil (sering disebut sebagai kasus dasar), kami menyelesaikannya secara langsung tanpa rekurensi lebih lanjut.
-Tujuannya adalah untuk menemukan solusi untuk submasalah ini secara mandiri.
3. **Gabungkan** :
-Gabungkan sub-masalah untuk mendapatkan solusi akhir dari keseluruhan masalah.
-Setelah submasalah yang lebih kecil terpecahkan, kami menggabungkan solusinya secara rekursif untuk mendapatkan solusi masalah yang lebih besar.
-Tujuannya adalah merumuskan solusi untuk masalah asli dengan menggabungkan hasil dari submasalah.

### Karakteristik Algoritma Divide and Conquer 

Algoritma Divide and Conquer melibatkan pemecahan masalah menjadi bagian-bagian yang lebih kecil dan lebih mudah dikelola, menyelesaikan setiap bagian secara individual, dan kemudian menggabungkan solusi untuk menyelesaikan masalah awal. Karakteristik Algoritma Divide and Conquer adalah:

-**Membagi Masalah** : Langkah pertama adalah memecah masalah menjadi submasalah yang lebih kecil dan lebih mudah dikelola. Pembagian ini dapat dilakukan secara rekursif hingga submasalah menjadi cukup sederhana untuk dipecahkan secara langsung.
-**Kemandirian Submasalah** : Setiap submasalah harus mandiri dari yang lain, artinya penyelesaian satu submasalah tidak bergantung pada penyelesaian submasalah yang lain. Hal ini memungkinkan pemrosesan paralel atau eksekusi submasalah secara bersamaan, yang dapat menghasilkan peningkatan efisiensi.
-**Menaklukkan Setiap Submasalah** : Setelah dibagi, submasalah dipecahkan secara individual. Ini dapat melibatkan penerapan pendekatan bagi dan taklukkan yang sama secara rekursif hingga submasalah menjadi cukup sederhana untuk dipecahkan secara langsung, atau dapat melibatkan penerapan algoritma atau teknik yang berbeda.
-**Menggabungkan Solusi** : Setelah menyelesaikan submasalah, solusinya digabungkan untuk mendapatkan solusi dari masalah awal. Langkah penggabungan ini harus relatif efisien dan mudah, karena solusi untuk submasalah harus dirancang agar dapat disatukan dengan sempurna.

### Pseudocode divide and conquer
```
FUNCTION MergeSort(arr)
    IF length(arr) <= 1 THEN
        RETURN arr

    mid = length(arr) / 2
    left = MergeSort(arr[0:mid])
    right = MergeSort(arr[mid:length(arr)])

    RETURN Merge(left, right)

FUNCTION Merge(left, right)
    result = []
    i = 0
    j = 0

    WHILE i < length(left) AND j < length(right) DO
        IF left[i] <= right[j] THEN
            APPEND left[i] TO result
            i = i + 1
        ELSE
            APPEND right[j] TO result
            j = j + 1

    WHILE i < length(left) DO
        APPEND left[i] TO result
        i = i + 1

    WHILE j < length(right) DO
        APPEND right[j] TO result
        j = j + 1

    RETURN result

```
**Penjelasan**

1.MergeSort:

-Fungsi ini memeriksa apakah panjang array kurang dari atau sama dengan 1; jika ya, array sudah terurut.
-Kemudian, array dibagi menjadi dua bagian: kiri dan kanan.
-Fungsi ini dipanggil secara rekursif pada kedua bagian.

2.Merge:

-Fungsi ini menggabungkan dua array yang sudah terurut (kiri dan kanan) menjadi satu array terurut.
-Menggunakan dua indeks (i dan j) untuk melacak posisi saat ini di kedua array.
-Elemen yang lebih kecil ditambahkan ke array hasil, hingga semua elemen tergabung.

### Contoh Penggunaan
```
arr = [38, 27, 43, 3, 9, 82, 10]
sortedArr = MergeSort(arr)

```

### Kesimpulan

Kesimpulan dari teks di atas adalah bahwa algoritma Divide and Conquer merupakan metode efisien untuk memecahkan masalah dengan membagi masalah utama menjadi submasalah yang lebih kecil, menyelesaikan masing-masing secara independen, dan kemudian menggabungkan solusinya. Proses ini melibatkan tiga langkah utama: membagi, menaklukkan, dan menggabungkan. Karakteristik utama algoritma ini mencakup pemisahan masalah, kemandirian submasalah, penyelesaian individual, dan penggabungan solusi yang efisien. Contoh konkret, seperti Merge Sort, menggambarkan penerapan teknik ini dalam pengurutan data. Algoritma ini sangat berguna dalam meningkatkan efisiensi dan efektivitas penyelesaian masalah yang kompleks.