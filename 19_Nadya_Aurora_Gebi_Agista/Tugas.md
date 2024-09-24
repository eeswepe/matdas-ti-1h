# Hashing: Dari Pencarian Data Hingga Keamanan Digital
Nama Anggota :
* Nadya Aurora Gebi Agista (244107020034)
* Nayla Akas Oktavia (244107020038)

### Pengertian
Algoritma hashing adalah teknik yang digunakan untuk mengubah data input menjadi nilai tetap yang biasanya lebih kecil, yang disebut hash code atau hash value. Proses ini sangat berguna dalam berbagai aplikasi, terutama dalam pengelolaan data, struktur data, dan algoritma pencarian.

### Konsep Dasar Hashing
* Hash Function: Fungsi yang mengubah input (kunci) menjadi hash code. Fungsi ini mengambil input dari ukuran yang bervariasi dan menghasilkan output dengan ukuran tetap.
* Hash Code: Nilai yang dihasilkan oleh fungsi hash. Biasanya, hash code adalah bilangan bulat yang menunjukkan posisi elemen dalam struktur data.

### Fungsi Hash
Fungsi hash memiliki beberapa karakteristik yang penting:
1. Deterministik: Fungsi hash harus menghasilkan output yang sama untuk input yang sama setiap kali fungsi dipanggil.
2. Panjang Tetap: Hash code biasanya memiliki panjang tetap, terlepas dari ukuran input.
3. Distribusi yang Baik: Hash code yang dihasilkan harus terdistribusi merata untuk menghindari collision (peristiwa ketika dua input berbeda menghasilkan hash code yang sama).
   
### Cara Kerja Hashing
Berikut adalah langkah-langkah umum dalam proses hashing:
1. *Input Data:* Algoritma hashing menerima data input yang ingin diubah menjadi hash.
2. *Fungsi Hash:* Data input diproses melalui fungsi hash, yang merupakan algoritma matematis yang dirancang khusus untuk menghasilkan hash.
3. *Output Hash:* Fungsi hash menghasilkan output berupa hash yang unik dan memiliki panjang tetap. 

### Kegunaan Algoritma Hashing

Algoritma hashing memiliki berbagai aplikasi penting dalam berbagai bidang, termasuk:
* *Keamanan Data:* Hashing digunakan untuk mengamankan data dengan cara menghasilkan hash yang unik untuk setiap data. Hal ini digunakan dalam *enkripsi* dan *autentikasi* untuk memastikan integritas data dan mencegah pemalsuan.
* *Pencarian Data:* Hashing digunakan untuk mempercepat pencarian data dalam database besar dengan cara menyimpan hash dari data dan menggunakannya untuk mencari data yang diinginkan.
* *Blockchain:* Hashing merupakan bagian integral dari teknologi blockchain, di mana setiap blok data dalam blockchain dikaitkan dengan hash dari blok sebelumnya. Hal ini membuat blockchain menjadi aman dan transparan.

### Jenis Algoritma Hashing

Ada beberapa jenis algoritma hashing yang umum digunakan, seperti:
* *MD5 (Message Digest 5):* Algoritma hash yang menghasilkan hash 128-bit.
* *SHA-1 (Secure Hash Algorithm 1):* Algoritma hash yang menghasilkan hash 160-bit.
* *SHA-256 (Secure Hash Algorithm 256):* Algoritma hash yang menghasilkan hash 256-bit.
* *SHA-512 (Secure Hash Algorithm 512):* Algoritma hash yang menghasilkan hash 512-bit.

### Pseudecode
Berikut adalah pseudocode sederhana untuk sebuah fungsi hash yang menggunakan operasi perkalian dan penambahan nilai ASCII:

    FUNCTION simple_hash(data):
        hash = 0   
        FOR EACH character c IN data:
            hash = (hash * 31) + ASCII(c) 
        RETURN hash
    END FUNCTION
    
#### Penjelasan Pseudocode:
* Fungsi Hash(data): Mendefinisikan fungsi bernama Hash yang menerima data sebagai input.
* Inisialisasi variabel hash: Variabel hash diinisialisasi dengan nilai 0. Ini adalah nilai awal hash.
* Iterasi melalui data: Fungsi iterasi melalui setiap karakter c dalam data input.
* Perhitungan hash: Pada setiap iterasi, nilai hash dikalikan dengan konstanta (dalam contoh ini, 31). Kemudian, nilai ASCII dari karakter c ditambahkan ke hash. 
* Kembalikan nilai hash: Setelah semua karakter diproses, fungsi mengembalikan nilai hash yang telah dihitung.

#### Contoh Penggunaan:
    data = "Hello World!"
    hash_value = simple_hash(data)
    OUTPUT "Hash dari data", data, "adalah", hash_value
    
Dalam contoh penggunaan, data "Hello World!" diubah menjadi hash menggunakan fungsi Hash. Fungsi ord(c) mengembalikan nilai ASCII dari karakter c. Proses hashing dilakukan dengan mengalikan dan menambahkan nilai ASCII dari setiap karakter dalam data input. Setelah semua karakter diproses, nilai hash akhir dicetak ke layar.


## KESIMPULAN
Algoritma hashing adalah teknik penting yang mengubah data menjadi nilai tetap yang lebih kecil, digunakan untuk keamanan, pencarian cepat, dan blockchain. Fungsi hash yang baik bersifat deterministik, memiliki panjang tetap, dan mendistribusikan data dengan merata. Hashing memudahkan pengelolaan data besar dan memastikan integritas serta keamanan informasi, membuatnya sangat penting dalam dunia digital.
