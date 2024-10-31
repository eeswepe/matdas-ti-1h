
------------------------------------------------------- 

## Bagian 1: Sistem Bilangan
### 1.  Konversi Bilangan
- Fungsi binary_to_decimal: Mengonversi angka biner menjadi desimal.
- Fungsi desimal_to_biner: Mengonversi angka desimal menjadi biner.
- Fungsi aritmatika_biner: Melakukan operasi aritmatika pada dua angka biner berdasarkan operasi yang dipilih dan mengonversi    hasilnya kembali ke biner.
- Fungsi main: Mengatur logika input/output dan memanggil fungsi yang sesuai berdasarkan input pengguna.

### 2. Operasi Bilangan Biner
- Fungsi binary_to_decimal: Mengonversi angka biner menjadi desimal.
- Fungsi decimal_to_hexadecimal: Mengonversi angka desimal menjadi heksadesimal.
- Fungsi main:
Meminta input pesan dasar dari pengguna.
Menggunakan kunci tetap 10101010 untuk enkripsi.
Melakukan operasi XOR pada setiap bit dari pesan dasar dan kunci.
Menampilkan hasil enkripsi dalam format biner dan heksadesimal.
Memastikan panjang pesan dasar sesuai dengan panjang kunci.

## Bagian 2: Aplikasi Sistem Bilangan
### 3. Pengolahan Data Sensor
- Fungsi binary_to_decimal
Mengonversi string biner menjadi desimal dengan cara yang sama seperti di Java, tetapi disesuaikan dengan gaya Python.
- Fungsi decimal_to_hexadecimal
Fungsi ini mengonversi desimal ke heksadesimal dengan mengambil sisa pembagian dan menggunakan string hex_chars untuk mendapatkan karakter heksadesimal yang sesuai.
- Fungsi main
Fungsi ini meminta input dari pengguna untuk pesanDasar, melakukan operasi XOR antara setiap karakter pesanDasar dan kunci, lalu menampilkan hasil enkripsi dalam bentuk biner dan heksadesimal.

## Bagian 3: Enkripsi dan Keamanan
### 4. Operasi Enkripsi
- xor_bit(bit1, bit2):
Mengembalikan '0' jika bit1 sama dengan bit2, dan '1' jika berbeda.
- binary_xor(bin_data, key):
Melakukan operasi XOR manual antara setiap bit dari bin_data dengan key. Jika key lebih pendek dari bin_data, ia akan mengulangi key dari awal.
- binary_to_hexadecimal(binary):
Mengubah string biner menjadi heksadesimal dengan menambahkan nol di depan (padding) agar panjang biner kelipatan 4, lalu mengonversi setiap 4 bit biner menjadi 1 digit heksadesimal menggunakan binary_nibble_to_hex.
- binary_nibble_to_hex(nibble):
Mengonversi 4 bit biner (nibble) menjadi satu digit heksadesimal dengan menghitung nilai desimal dari nibble lalu mengonversinya ke karakter heksadesimal.
- main():
Meminta input data dan key dari pengguna, memeriksa panjang key terhadap data, melakukan enkripsi XOR, dan menampilkan hasilnya dalam bentuk biner dan heksadesimal.

