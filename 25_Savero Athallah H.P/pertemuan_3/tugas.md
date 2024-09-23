## Disjoint Set Union (DSU)

### Pendahuluan

**Salah satu algoritma** yang berhubungan dengan himpunan adalah Union-Find atau Disjoint Set Union (DSU). Algoritma ini digunakan untuk mengelola sekumpulan elemen yang dibagi menjadi beberapa himpunan terpisah (disjoint sets). Algoritma ini terutama digunakan untuk menentukan apakah dua elemen berada dalam himpunan yang sama, serta untuk menggabungkan dua himpunan yang terpisah.

### Konsep Himpunan dalam DSU 

**Kami merepresentasikan Disjoint Set Union (DSU)** sebagai hutan dari pohon-pohon, di mana setiap pohon mewakili satu himpunan, dan akar dari pohon tersebut berfungsi sebagai wakil atau pemimpin dari himpunan itu. Dalam struktur ini, setiap elemen menunjuk ke induknya, dan akar adalah induk terakhir untuk semua elemen dalam himpunan. Organisasi hierarkis ini memungkinkan pengelolaan himpunan secara efisien dan memungkinkan penentuan wakil elemen dengan cepat melalui penelusuran ke akar. Struktur ini mendukung tiga operasi utama: menginisialisasi himpunan, mencari wakil dari sebuah himpunan, dan menggabungkan dua himpunan. Operasi-operasi ini sangat mendasar dalam mengelola himpunan-himpunan yang tidak saling beririsan.

### Penjelasan Cara Kerja 

**Langkah-langkah Algoritma Union-Find**
Algoritma Union-Find terdiri dari dua operasi dasar:

Find: Mengembalikan representasi (atau "akar") dari himpunan di mana suatu elemen berada. Ini memungkinkan kita untuk menentukan apakah dua elemen berada dalam himpunan yang sama.

Langkah-langkah:
Mulai dari elemen yang diberikan.
Telusuri ke atas dalam struktur pohon hingga mencapai akar (representasi dari himpunan).
Lakukan path compression agar elemen yang dilalui langsung menunjuk ke akar, mempercepat pencarian berikutnya.
Union: Menggabungkan dua himpunan yang berbeda menjadi satu himpunan.

Langkah-langkah:
Temukan akar dari kedua himpunan yang ingin digabungkan.
Bandingkan akar dari kedua himpunan.
Gabungkan himpunan yang lebih kecil ke himpunan yang lebih besar untuk mengurangi tinggi pohon (optimasi yang disebut union by rank).
Pseudocode Union-Find

### Pseudocode Algoritma Union-FInd

```
// Inisialisasi himpunan
function initialize(n):
    parent = new array of size n
    rank = new array of size n
    for i from 0 to n-1:
        parent[i] = i
        rank[i] = 0

// Mencari akar dari suatu elemen x
function find(x):
    if parent[x] != x:
        parent[x] = find(parent[x]) // Path compression
    return parent[x]

// Menggabungkan dua himpunan x dan y
function union(x, y):
    rootX = find(x)
    rootY = find(y)

    if rootX != rootY:
        // Union by rank
        if rank[rootX] > rank[rootY]:
            parent[rootY] = rootX
        elif rank[rootX] < rank[rootY]:
            parent[rootX] = rootY
        else:
            parent[rootY] = rootX
            rank[rootX] = rank[rootX] + 1

```

### Contoh Penggunaan Union-Find 

```
Misalnya, kita memiliki 5 elemen (0, 1, 2, 3, 4)
initialize(5)

// Gabungkan beberapa himpunan
union(0, 1) // Gabungkan himpunan yang mengandung 0 dan 1
union(1, 2) // Gabungkan himpunan yang mengandung 1 dan 2
union(3, 4) // Gabungkan himpunan yang mengandung 3 dan 4

// Cek apakah elemen 0 dan 2 berada dalam himpunan yang sama
if find(0) == find(2):
    print("0 dan 2 berada dalam himpunan yang sama")

// Cek apakah elemen 0 dan 3 berada dalam himpunan yang sama
if find(0) != find(3):
    print("0 dan 3 berada dalam himpunan yang berbeda")

```
**Penjelasan Pseudocode**
Inisialisasi:

parent: Menyimpan "orang tua" dari setiap elemen. Pada awalnya, setiap elemen menunjuk pada dirinya sendiri.
rank: Digunakan untuk menyimpan tinggi pohon untuk optimasi "union by rank"

Find: Fungsi ini mencari akar dari elemen x. Jika parent[x] bukan x, maka elemen x mengikuti akar dari orang tuanya, hingga menemukan akar sebenarnya.
Path compression diterapkan untuk mempercepat pencarian berikutnya dengan langsung menunjuk ke akar.

Union:Fungsi ini menggabungkan dua himpunan berdasarkan akarnya.
Union by rank diterapkan untuk menjaga pohon tetap pendek dengan selalu menggabungkan pohon yang lebih kecil ke pohon yang lebih besar.
Contoh Kasus Penggunaan

Algoritma Union-Find banyak digunakan dalam:
Pencarian komponen terhubung dalam graf.
MST (Minimum Spanning Tree), seperti algoritma Kruskal.
Problema dynamic connectivity, misalnya untuk menentukan apakah ada jalur antara dua titik pada graf yang berubah-ubah.

### Kesimpulan 

Kesimpulannya Algoritma Union-Find memudahkan kita mengelola dan melacak kelompok elemen yang saling berhubungan. Dengan operasi Find untuk mengetahui kelompok suatu elemen dan Union untuk menggabungkan dua kelompok, algoritma ini efisien dalam memeriksa keterhubungan dan mengelola banyak elemen. Optimasi seperti path compression dan union by rank membuatnya sangat cepat digunakan, terutama dalam masalah graf dan himpunan terpisah