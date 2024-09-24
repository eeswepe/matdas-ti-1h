# ALGORITMA HASHING

Algoritma hashing adalah teknik yang digunakan untuk mengubah data input menjadi nilai tetap yang biasanya lebih kecil, yang disebut hash code atau hash value. Proses ini sangat berguna dalam berbagai aplikasi, terutama dalam pengelolaan data, struktur data, dan algoritma pencarian.
Konsep Dasar Hashing
Hash Function: Fungsi yang mengubah input (kunci) menjadi hash code. Fungsi ini mengambil input dari ukuran yang bervariasi dan menghasilkan output dengan ukuran tetap.
Hash Code: Nilai yang dihasilkan oleh fungsi hash. Biasanya, hash code adalah bilangan bulat yang menunjukkan posisi elemen dalam struktur data.

Proses Hashing
Proses hashing melibatkan beberapa langkah:
1. Input Kunci: Pengguna atau program menyediakan data yang ingin di-hash.
2. Penerapan Fungsi Hash: Fungsi hash diterapkan pada input untuk menghasilkan hash code.
3. Penggunaan Hash Code: Hash code digunakan untuk menyimpan atau mengambil data dari struktur data, seperti tabel hash.

Fungsi Hash
Fungsi hash memiliki beberapa karakteristik yang penting:
1. Deterministik: Fungsi hash harus menghasilkan output yang sama untuk input yang sama setiap kali fungsi dipanggil.
2. Panjang Tetap: Hash code biasanya memiliki panjang tetap, terlepas dari ukuran input.
3. Distribusi yang Baik: Hash code yang dihasilkan harus terdistribusi merata untuk menghindari collision (peristiwa ketika dua input berbeda menghasilkan hash code yang sama).

Contoh Fungsi Hash
Berikut adalah contoh fungsi hash yang sederhana dalam Python:
def simple_hash(key):
    return sum(ord(char) for char in key) % 10  # Menghasilkan hash cod antara 0-9
