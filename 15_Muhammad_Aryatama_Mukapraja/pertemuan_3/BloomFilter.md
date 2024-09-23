# Tugas Matematika Dasar 2024

### Algoritma dari Bloom Filter
Anggota: 
- Muhammad Aryatama Mukapraja (15)
- Muhammad Fattahul Alim (16)

## Penjelasan Bloom Filter

Bloom Filter adalah struktur data probabilistik yang digunakan untuk menguji apakah suatu elemen mungkin ada dalam suatu himpunan.

## Algoritma

Bayangkan kamu mempunyai kotak yang berisi lampu-lampu kecil (seperti lampu LED), dan setiap lampu berada dalam kondisi antara mati (0) atau menyala (1). Kotak ini adalah **Bloom filter**.

1. Persiapan

  - Mulai dengan keadaan lampu semua mati (0)
  - Anda punya alat spesial (yang disebut *hash function*) yang dapat membantu Anda memilih lampu mana yang akan dinyalakan

2. Menambah *item*

- Saat Anda ingin menambah sesuatu ke **Bloom filter** Anda (misal, ingin menambahkan kata "apel"), Anda dapat menggunakan alat spesial untuk memilih beberapa lampu untuk menyala
- Misalnya, Anda punya 3 alat, alat itu mungkin mengarahkan Anda untuk menyalakan lampu ke-2, ke-5, dan ke-7
- Sekarang, lampu tersebut menyala (1)

3. Melakukan pengecekan *item*
 
- Saat ini, Anda telah menambah banyak kata lain selain "apel"
- Ketika anda ingin memeriksa apakah ada kata di dalam **Bloom filter** (misal, kata "pisang"), Anda dapat menggunakan alat-alat spesial Anda.
- Alat tersebut akan memberi tau lampu mana untuk dinyalakan
  - Jika semua lampu yang ditunjuk alat tersebut menyala, maka kata "pisang" mungkin ada di **Bloom filter**
  - Jika ada lampu yang tidak menyala, maka kata "pisang" pasti tidak ada di **Bloom filter**
  
## Contoh

Katakanlah, Anda punya kotak dengan 10 lampu

            [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

1. Menambah kata "apel" :
  - Alat anda memberi tau untuk menyalakan lampu 2, 5, dan 7
  - Kotaknya sekarang akan seperti berikut:
    
            [0, 0, 1, 0, 0, 1, 0, 1, 0, 0]
    

2. Menambah kata "pisang" :
  - Alat anda memberi tau untuk menyalakan lampu 1, 3, 8
  - Kotaknya sekarang akan seperti berikut:


            [0, 1, 1, 1, 0, 1, 0, 1, 1, 0]


3. Cek kata "apel" :
  - Alat-alat anda mengecek lampu 2, 5, dan 7.
  - Semua lampu menyala, maka kata "apel" mungkin ada di **Bloom filter**

4. Cek kata "anggur" :
  - Alat-alat anda mengecek lampu 0, 4, dan 9
  - Misal Anda tidak memasukkan kata "anggur" di **Bloom filter**
  - Lampu nomor 4 tidak menyala, maka kata "anggur" pasti tidak ada di **Bloom filter**
  
## Pseudocode

    Initialize BloomFilter with size m (number of bits) and k (number of hash functions)

    FUNCTION InitializeBloomFilter(m, k):
    bit_array = Array of size m, initialized to 0
    hash_functions = Array of k hash functions (H1, H2, ..., Hk)
    
    FUNCTION AddElement(bloomFilter, element):
    FOR i FROM 1 TO k DO:
        hash_value = HashFunctionHi(element) MOD m
        bloomFilter.bit_array[hash_value] = 1
    END FOR
    
    FUNCTION CheckElement(bloomFilter, element):
    FOR i FROM 1 TO k DO:
        hash_value = HashFunctionHi(element) MOD m
        IF bloomFilter.bit_array[hash_value] == 0 THEN
            RETURN "Element is definitely not in the set"
    END FOR
    RETURN "Element might be in the set"
    
### Penjelasan

InitializeBloomFilter: Membuat Bloom Filter dengan ukuran m (banyaknya bit) dan k (jumlah fungsi hash)

AddElement: Menambahkan elemen ke Bloom Filter dengan cara menghitung hash dari elemen tersebut menggunakan setiap fungsi hash, lalu menandai bit yang sesuai dalam array bit menjadi 1

CheckElement: Memeriksa apakah elemen ada dalam set dengan cara memeriksa nilai bit di lokasi hash dari elemen tersebut. Jika salah satu bit masih 0, elemen pasti tidak ada. Jika semua bit 1, elemen mungkin ada

### Contoh penggunaan
    bloomFilter = InitializeBloomFilter(m = 10, k = 3)

### Menambah elemen
    AddElement(bloomFilter, "apel")
    AddElement(bloomFilter, "pisang")

### Cek elemen
    CheckElement(bloomFilter, "apel")  // Output: "Elemen mungkin ada di himpunan"
    CheckElement(bloomFilter, "jeruk") // Output: "Elemen pasti tidak ada di himpunan"
   
## Relasi Bloom Filter dengan Prinsip Himpunan

1. Elemen dan Anggota:
    
   - Himpunan merupakan kumpulan daripada objek/anggota yang berbeda. Anda bisa mencari tau apakah elemen tersebut merupakan anggota dari suatu himpunan.
   - Di dalam **Bloom filter**, *bit array* merepresentasikan sebuah himpunan, dan Anda dapat memeriksa apakah sebuah elemen merupakan anggota dari himpunan tersebut.

2. *Union* dan *Intersection*:
   - *Union* / gabungan : Menggabungkan 2 buah himpunan untuk menyertakan semua elemen dalam kedua himpunan.
     - Pada **Bloom filter** Anda dapat menggabungkan dua **Bloom filter** dengan  melakukan operasi *bitwise OR* pada suatu *bit array*
   - *Intersection* / irisan : Mencari elemen-elemen yang sama pada kedua himpunan
     - Pada **Bloom filter**, Anda dapat mencari irisan dengan melakukan operasi *bitwise AND* pada suatu *bit array*

3. *Subset*:
   - Dalam teori himpunan, suatu himpunan dikatakan *subset* (merupakan bagian) dengan himpunan lain jika himpunan pertama juga merupakan himpunan kedua
     - Untuk mengetahui apakah sebuah **Bloom filter** merupakan *subset* dari **Bloom filter* lainnya, cukup periksa apakah setiap bit yang bernilai 1 pada filter pertama juga bernilai 1 pada filter kedua

Diberi dua himpunan:
- Himpunan A: {apel, pisang}
- Himpunan B: {pisang, anggur}

Menggunakan **Bloom filter**:
- **Bloom filter** untuk himpunan A mungkin terlihat seperti:
 
                [0, 1, 1, 1, 0, 1, 0, 1, 1, 0]

- **Bloom filter** untuk himpunan B mungkin terlihat seperti:
 
                [1, 1, 0, 1, 1, 0, 0, 0, 1, 1]

- *Union*: Gabungkan kedua himpunan untuk mendapatkan elemen {apel, pisang, anggur}
  - Bitwise OR:
   
                [1, 1, 1, 1, 1, 1, 0, 1, 1, 1]

- *Intersection*: Mencari elemen yang sama dari kedua himpunan {pisang}
  - Bitwise AND:
   
                [0, 1, 0, 1, 0, 0, 0, 0, 1, 0]