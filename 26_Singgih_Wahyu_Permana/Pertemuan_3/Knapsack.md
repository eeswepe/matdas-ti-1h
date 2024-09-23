## Algoritma Knapsack dengan Dynamic Programming: Pendekatan Himpunan

### Pendahuluan

**Masalah Knapsack** adalah sebuah permasalahan optimasi klasik dalam ilmu komputer. Masalah ini berfokus pada pemilihan item dari sekumpulan item yang memiliki bobot dan nilai masing-masing, dengan tujuan memaksimalkan total nilai item yang dipilih tanpa melebihi kapasitas maksimum suatu wadah (knapsack).

**Dynamic Programming** adalah teknik pemecahan masalah dengan cara memecah masalah besar menjadi submasalah yang lebih kecil, kemudian menyimpan solusi submasalah tersebut untuk digunakan kembali dalam perhitungan solusi submasalah yang lebih besar. Teknik ini sangat efektif untuk masalah yang memiliki substruktur optimal, seperti masalah knapsack.

### Konsep Himpunan dalam Knapsack

Dalam konteks masalah knapsack, kita dapat memandang setiap item sebagai elemen dalam sebuah himpunan. Himpunan ini kemudian akan menjadi ruang sampel untuk kita pilih item mana saja yang akan dimasukkan ke dalam knapsack.

**Himpunan Bagian** memainkan peran penting dalam permasalahan ini. Setiap kombinasi item yang mungkin dapat kita pilih sebenarnya adalah sebuah himpunan bagian dari himpunan item keseluruhan. Dengan demikian, kita dapat menggunakan konsep himpunan bagian untuk mencari kombinasi item yang menghasilkan nilai total maksimum tanpa melebihi kapasitas knapsack.

### Pseudocode Algoritma Knapsack dengan Dynamic Programming

```
Fungsi knapsack(W, wt, val, n)
    # W: Kapasitas knapsack
    # wt: Array bobot item
    # val: Array nilai item
    # n: Jumlah item

    K[n+1][W+1]  // Buat tabel 2D untuk menyimpan hasil submasalah

    // Inisialisasi baris dan kolom pertama
    for i in range(n+1):
        for w in range(W+1):
            if i == 0 or w == 0:
                K[i][w] = 0

    // Isi tabel K menggunakan pendekatan bottom-up
    for i in range(1, n+1):
        for w in range(1, W+1):
            if wt[i-1] <= w:
                K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w])
            else:
                K[i][w] = K[i-1][w]

    return K[n][W]   

```

### Penjelasan Cara Kerja

1.  **Tabel K:** Tabel dua dimensi `K` digunakan untuk menyimpan hasil submasalah. `K[i][w]` menyimpan nilai maksimum yang dapat dicapai dengan menggunakan i item pertama dan kapasitas knapsack sebesar w.
2.  **Inisialisasi:** Baris dan kolom pertama dari tabel K diinisialisasi dengan 0 karena jika tidak ada item atau kapasitas knapsack adalah 0, maka nilai maksimumnya adalah 0.
3.  **Pengisian Tabel:** Tabel K diisi secara bottom-up. Untuk setiap item i dan kapasitas w, kita memiliki dua pilihan:
    -   **Memasukkan item:** Jika bobot item ke-i kurang dari atau sama dengan kapasitas yang tersisa, maka kita hitung nilai maksimum yang diperoleh jika item ke-i dimasukkan ke dalam knapsack ditambah dengan nilai maksimum yang diperoleh dari submasalah sebelumnya (dengan kapasitas yang dikurangi bobot item ke-i).
    -   **Tidak memasukkan item:** Jika bobot item ke-i lebih besar dari kapasitas yang tersisa, maka kita hanya mempertimbangkan nilai maksimum yang diperoleh dari submasalah sebelumnya.
4.  **Nilai Optimal:** Nilai maksimum yang dapat dicapai dengan menggunakan semua item dan kapasitas knapsack W disimpan dalam `K[n][W]`.

**Contoh Masalah Knapsack:**

Andai kita memiliki sebuah tas ransel dengan kapasitas maksimal 10 kg. Kita memiliki beberapa barang dengan berat dan nilai masing-masing, seperti yang tertera pada tabel berikut:

|Barang|Berat (kg)|Nilai|
|--|--|--|
|A|2|10|
|B|3|15|
|C|5|20|

Langkah penyelesaian termudah adalah dengan memvisualisasikan menggunakan tabel knapsack

**Tujuan:** Pilihlah kombinasi barang yang dapat dimasukkan ke dalam tas ransel sehingga total nilai barang yang dibawa maksimal, tanpa melebihi kapasitas tas ransel.

**Penyelesaian dengan Algoritma Dynamic Programming:**

**Langkah-langkah:**

1.  **Buat Tabel:**
    
    -   Buat tabel 2D dengan ukuran (jumlah barang + 1) x (kapasitas tas + 1).
    -   Baris mewakili barang (0 hingga jumlah barang), kolom mewakili kapasitas tas (0 hingga kapasitas maksimal).
    -   Setiap sel dalam tabel akan menyimpan nilai maksimum yang dapat dicapai dengan menggunakan barang-barang hingga baris tersebut dan kapasitas tas hingga kolom tersebut.
2.  **Inisialisasi Tabel:**
    
    -   Isi baris pertama dan kolom pertama dengan 0. Ini karena jika tidak ada barang atau tidak ada kapasitas, maka nilai maksimumnya adalah 0.
3.  **Isi Tabel:**
    
    -   Mulai dari baris kedua dan kolom kedua, isi setiap sel dengan nilai maksimum yang dapat dicapai.
    -   Untuk setiap sel (i, w), kita memiliki dua pilihan:
        -   **Tidak mengambil barang i:** Nilai sel ini sama dengan nilai sel di atasnya (i-1, w).
        -   **Mengambil barang i:** Jika berat barang i kurang dari atau sama dengan kapasitas yang tersisa (w), maka nilai sel ini adalah maksimum antara nilai sel di atasnya (i-1, w) dan nilai barang i ditambah nilai sel di kiri atas (i-1, w-berat barang i).
4.  **Nilai Optimal:**
    
    -   Nilai pada sel kanan bawah tabel (jumlah barang, kapasitas tas) adalah nilai maksimum yang dapat dicapai.

**Visualisasi Tabel:**

Misalkan kita memiliki tabel seperti berikut:
||0|1|2|3|4|5|6|7|8|9|10|
|--|--|--|--|--|--|--|--|--|--|--|--|
|0|0|0|0|0|0|0|0|0|0|0|0|
|A|0|0|10|10|10|10|10|10|10|10|10|
|B|0|0|10|15|15|25|25|25|25|25|25|
|C|0|0|10|15|20|25|35|35|40|40|40|

**Penjelasan:**

-   **Baris 0, kolom 0-10:** Jika tidak ada barang, maka nilai maksimumnya selalu 0.
-   **Baris A, kolom 2:** Jika hanya ada barang A dan kapasitas 2, kita bisa mengambil barang A sehingga nilai maksimumnya 10.
-   **Baris B, kolom 5:** Jika ada barang A dan B, dan kapasitas 5, kita bisa mengambil barang A dan B, sehingga nilai maksimumnya 25 (10+15).
-   **Baris C, kolom 10:** Nilai maksimum yang dapat dicapai adalah 40, artinya dengan kapasitas 10 kg, kita bisa mendapatkan nilai maksimal 40 dengan mengambil kombinasi barang tertentu.

### Kesimpulan

Algoritma knapsack dengan dynamic programming menawarkan solusi efisien untuk masalah optimasi pemilihan item. Dengan menggunakan konsep himpunan bagian, kita dapat memformulasikan masalah ini secara matematis dan menerapkan teknik dynamic programming untuk menemukan solusi optimal. Pendekatan ini sangat berguna dalam berbagai aplikasi, seperti perencanaan produksi, manajemen inventori, dan pemilihan portofolio investasi.