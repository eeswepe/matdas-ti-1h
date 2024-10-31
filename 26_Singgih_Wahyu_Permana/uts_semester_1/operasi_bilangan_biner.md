# Operasi Bilangan Biner
## 1. Operasi Aritmatika
### 1. 1. Penjumlahan Bilangan Biner
```py
def add_bin(a, b):
	n = max(len(a), len(b))
	a = a.zfill(n)
	b = b.zfill(n)
	hasil = ""
	simpan = 0
	for i in range(n-1, -1, -1):
		jumlah_tunggal = simpan
		jumlah_tunggal += int(a[i])
		jumlah_tunggal += int(b[i])
		if jumlah_tunggal % 2 == 1:
			hasil = '1' + hasil
		else:
			hasil = '0' + hasil
		if jumlah_tunggal < 2:
			simpan = 0
		else:
			simpan = 1
	if simpan != 0:
		hasil = '1' + hasil
	return hasil
```
### Penjelasan
```py
def add_bin(a, b):
```
Fungsi ini mendefinisikan sebuah fungsi bernama `add_bin` yang memiliki dua parameter `a` dan `b`. Fungsi ini akan melakukan penjumlahan dua bilangan biner dan mengembalikan hasilnya dalam bentuk biner.
```py
n = max(len(a), len(b))
```
Variabel `n` diinisialisasi dengan nilai maksimum dari panjang string `a` dan `b`. Ini digunakan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan penjumlahan.
```py
a = a.zfill(n)
```
String `a` diisi dengan nol di awal hingga panjangnya sama dengan `n`. Ini dilakukan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan penjumlahan.
```py
b = b.zfill(n)
```
String `b` diisi dengan nol di awal hingga panjangnya sama dengan `n`. Ini dilakukan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan penjumlahan.
```py
hasil = ""
```
Variabel `hasil` diinisialisasi sebagai string kosong untuk menyimpan hasil penjumlahan.
```py
simpan = 0
```
Variabel `simpan` diinisialisasi dengan nilai 0 untuk menyimpan nilai simpanan dari penjumlahan.
```py
for i in range(n-1, -1, -1):
```
Loop `for` ini akan berjalan dari kanan ke kiri (dari indeks `n-1` hingga indeks 0) untuk melakukan penjumlahan bit per bit.
```py
jumlah_tunggal = simpan
```
Variabel `jumlah_tunggal` diinisialisasi dengan nilai simpanan dari penjumlahan sebelumnya.
```py
jumlah_tunggal += int(a[i])
```
Nilai `jumlah_tunggal` ditambahkan dengan nilai bit ke-i dari string `a`.
```py
jumlah_tunggal += int(b[i])
```
Nilai `jumlah_tunggal` ditambahkan dengan nilai bit ke-i dari string `b`.
```py
if jumlah_tunggal % 2 == 1:
```
Jika nilai `jumlah_tunggal` habis dibagi 2, maka bit ke-i dari hasil penjumlahan adalah 1.
```py
hasil = '1' + hasil
```
Bit ke-i dari hasil penjumlahan diisi dengan 1.
```py
else:
```
Jika nilai `jumlah_tunggal` tidak habis dibagi 2, maka bit ke-i dari hasil penjumlahan adalah 0.
```py
hasil = '0' + hasil
```
Bit ke-i dari hasil penjumlahan diisi dengan 0.
```py
if jumlah_tunggal < 2:
```
Jika nilai `jumlah_tunggal` kurang dari 2, maka tidak ada nilai simpanan.
```py
simpan = 0
```
Nilai simpanan direset menjadi 0.
```py
else:
	simpan = 1
```
Jika nilai `jumlah_tunggal` tidak kurang dari 2, maka ada nilai simpanan. Nilai simpanan diisi dengan 1.
```py
if simpan != 0:
	hasil = '1' + hasil
```
Jika nilai simpanan tidak sama dengan 0, maka ada nilai simpanan yang perlu ditambahkan ke hasil penjumlahan. Bit ke-i dari hasil penjumlahan diisi dengan 1.
```py
return hasil
```
Fungsi `add_bin` mengembalikan hasil penjumlahan dalam bentuk biner.

### 1. 2. Pengurangan Bilangan Biner
```py
def subtract_bin(a, b):
	n = max(len(a), len(b))
	a = a.zfill(n)
	b = b.zfill(n)
	hasil = ""
	pinjam = 0
	for i in range(n-1, -1, -1):
		pengurangan_tunggal = int(a[i]) - int(b[i]) - pinjam
		if pengurangan_tunggal < 0:
			hasil = '1' + hasil
			pinjam = 1
		else:
			hasil = str(pengurangan_tunggal) + hasil
			pinjam = 0
	return hasil
```
### Penjelasan
```py
def subtract_bin(a, b):
```
Fungsi ini mendefinisikan sebuah fungsi bernama `subtract_bin` yang memiliki dua parameter `a` dan `b`. Fungsi ini akan melakukan pengurangan dua bilangan biner dan mengembalikan hasilnya dalam bentuk biner.
```py
n = max(len(a), len(b))
```
Variabel `n` diinisialisasi dengan nilai maksimum dari panjang string `a` dan `b`. Ini digunakan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan pengurangan.
```py
a = a.zfill(n)
```
String `a` diisi dengan nol di awal hingga panjangnya sama dengan `n`. Ini dilakukan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan pengurangan.
```py
b = b.zfill(n)
```
String `b` diisi dengan nol di awal hingga panjangnya sama dengan `n`. Ini dilakukan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan pengurangan.
```py
hasil = ""
```
Variabel `hasil` diinisialisasi sebagai string kosong untuk menyimpan hasil pengurangan.
```py
pinjam = 0
```
Variabel `pinjam` diinisialisasi dengan nilai 0 untuk menyimpan nilai pinjam dari pengurangan.
```py
for i in range(n-1, -1, -1):
```
Loop `for` ini akan berjalan dari kanan ke kiri (dari indeks `n-1` hingga indeks 0) untuk melakukan pengurangan bit per bit.
```py
pengurangan_tunggal = int(a[i]) - int(b[i]) - pinjam
```
Variabel `pengurangan_tunggal` diinisialisasi dengan nilai pengurangan antara bit ke-i dari string `a` dan `b`, dengan mempertimbangkan nilai pinjam.
```py
if pengurangan_tunggal < 0:
```
Jika nilai `pengurangan_tunggal` kurang dari 0, maka perlu dilakukan pinjam.
```py
hasil = '1' + hasil
```
Bit ke-i dari hasil pengurangan diisi dengan 1.
```py
pinjam = 1
```
Nilai pinjam diisi dengan 1.
```py
else:
```
Jika nilai `pengurangan_tunggal` tidak kurang dari 0, maka tidak perlu dilakukan pinjam.
```py
hasil = str(pengurangan_tunggal) + hasil
```
Bit ke-i dari hasil pengurangan diisi dengan nilai `pengurangan_tunggal`.
```py
pinjam = 0
```
Nilai pinjam direset menjadi 0.
```py
return hasil
```
Fungsi `subtract_bin` mengembalikan hasil pengurangan dalam bentuk biner.


### 1. 3. Perkalian Bilangan Biner
```py
def multiply_bin(a, b):
	n = max(len(a), len(b))
	a = a.zfill(n)
	b = b.zfill(n)
	hasil = ""
	for i in range(n-1, -1, -1):
		if int(b[i]) == 1:
		hasil = add_bin(hasil, a)
		a = a[1:] + '0'
	result hasil
```

### Penjelasan
```py
def multiply_bin(a, b):
```
Fungsi ini mendefinisikan sebuah fungsi bernama `multiply_bin` yang memiliki dua parameter `a` dan `b`. Fungsi ini akan melakukan perkalian dua bilangan biner dan mengembalikan hasilnya dalam bentuk biner.
```py
n = max(len(a), len(b))
```
Variabel `n` diinisialisasi dengan nilai maksimum dari panjang string `a` dan `b`. Ini digunakan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan perkalian.
```py
a = a.zfill(n)
```
String `a` diisi dengan nol di awal hingga panjangnya sama dengan `n`. Ini dilakukan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan perkalian.
```py
b = b.zfill(n)
```
String `b` diisi dengan nol di awal hingga panjangnya sama dengan `n`. Ini dilakukan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan perkalian.
```py
hasil = ""
```
Variabel `hasil` diinisialisasi sebagai string kosong untuk menyimpan hasil perkalian.
```py
for i in range(n-1, -1, -1):
```
Loop `for` ini akan berjalan dari kanan ke kiri (dari indeks `n-1` hingga indeks 0) untuk melakukan perkalian bit per bit.
```py
if int(b[i]) == 1:
```
Jika bit ke-i dari string `b` adalah 1, maka perlu dilakukan penjumlahan dengan string `a`.
```py
hasil = add_bin(hasil, a)
```
Fungsi `add_bin` dipanggil untuk melakukan penjumlahan antara string `hasil` dan `a`.
```py
a = a[1:] + '0'
```
String `a` digeser ke kanan dengan menambahkan nol di akhir.
```py
return hasil
```
Fungsi `muliply_bin` mengembalikan hasil perkalian dalam bentuk biner.


## 2. Operasi Logika
### 2. 1. Operasi AND
```py
def and_bin(a, b):
	n = max(len(a), len(b))
	a = a.zfill(n)
	b = b.zfill(n)
	hasil = ""
	for i in range(n):
		tambahan = int(a[i]) & int(b[i])
		hasil += str(tambahan)
	return hasil
```
### Penjelasan 
```py
def and_bin(a, b):
```
Fungsi ini mendefinisikan sebuah fungsi bernama `and_bin` yang memiliki dua parameter `a` dan `b`. Fungsi ini akan melakukan operasi AND biner antara dua bilangan biner dan mengembalikan hasilnya dalam bentuk biner.
```py
n = max(len(a), len(b))
```
Variabel `n` diinisialisasi dengan nilai maksimum dari panjang string `a` dan `b`. Ini digunakan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan operasi AND.
```py
a = a.zfill(n)
```
String `a` diisi dengan nol di awal hingga panjangnya sama dengan `n`. Ini dilakukan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan operasi AND.
```py
b = b.zfill(n)
```
String `b` diisi dengan nol di awal hingga panjangnya sama dengan `n`. Ini dilakukan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan operasi AND.
```py
hasil = ""
```
Variabel `hasil` diinisialisasi sebagai string kosong untuk menyimpan hasil operasi AND.
```py
for i in range(n):
```
Loop `for` ini akan berjalan dari kiri ke kanan (dari indeks 0 hingga indeks `n-1`) untuk melakukan operasi AND bit per bit.
```py
tambahan = int(a[i]) & int(b[i])
```
Operasi AND biner dilakukan antara bit ke-i dari string `a` dan `b`. Hasilnya disimpan dalam variabel `tambahan`.
```py
hasil += str(tambahan)
```
Hasil operasi AND disimpan dalam string `hasil`.
```py
return hasil
```
Fungsi `and_bin` mengembalikan hasil operasi AND dalam bentuk biner.
	 
### 2. 2. Operasi OR
```py
def or_bin(a, b):
	n = max(len(a), len(b))
	a = a.zfill(n)
	b = b.zfill(n)
	hasil = ""
	for i in range(n):
		tambahan = int(a[i]) | int(b[i])
		hasil += str(tambahan)
	return hasil
```
```py
def or_bin(a, b):
```
Fungsi ini mendefinisikan sebuah fungsi bernama `or_bin` yang memiliki dua parameter `a` dan `b`. Fungsi ini akan melakukan operasi OR biner antara dua bilangan biner dan mengembalikan hasilnya dalam bentuk biner.
```py
n = max(len(a), len(b))
```
Variabel `n` diinisialisasi dengan nilai maksimum dari panjang string `a` dan `b`. Ini digunakan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan operasi OR.
```py
a = a.zfill(n)
```
String `a` diisi dengan nol di awal hingga panjangnya sama dengan `n`. Ini dilakukan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan operasi OR.
```py
b = b.zfill(n)
```
String `b` diisi dengan nol di awal hingga panjangnya sama dengan `n`. Ini dilakukan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan operasi OR.
```py
hasil = ""
```
Variabel `hasil` diinisialisasi sebagai string kosong untuk menyimpan hasil operasi OR.
```py
for i in range(n):
```
Loop `for` ini akan berjalan dari kiri ke kanan (dari indeks 0 hingga indeks `n-1`) untuk melakukan operasi OR bit per bit.
```py
tambahan = int(a[i]) | int(b[i])
```
Operasi OR biner dilakukan antara bit ke-i dari string `a` dan `b`. Hasilnya disimpan dalam variabel `tambahan`.
```py
hasil += str(tambahan)
```
Hasil operasi OR disimpan dalam string `hasil`.
```py
return hasil
```
Fungsi `or_bin` mengembalikan hasil operasi OR dalam bentuk biner.

### 2. 3. Operasi XOR
```py
def xor_bin(a, b):
	n = max(len(a), len(b))
	a = a.zfill(n)
	b = b.zfill(n)
	hasil = ""
	for i in range(n):
		tambahan = int(a[i]) ^ int(b[i])
		hasil += str(tambahan)
	return hasil
```
### Penjelasan
```py
def xor_bin(a, b):
```
Fungsi ini mendefinisikan sebuah fungsi bernama `xor_bin` yang memiliki dua parameter `a` dan `b`. Fungsi ini akan melakukan operasi XOR biner antara dua bilangan biner dan mengembalikan hasilnya dalam bentuk biner.
```py
n = max(len(a), len(b))
```
Variabel `n` diinisialisasi dengan nilai maksimum dari panjang string `a` dan `b`. Ini digunakan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan operasi XOR.
```py
a = a.zfill(n)
```
String `a` diisi dengan nol di awal hingga panjangnya sama dengan `n`. Ini dilakukan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan operasi XOR.
```py
b = b.zfill(n)
```
String `b` diisi dengan nol di awal hingga panjangnya sama dengan `n`. Ini dilakukan untuk memastikan bahwa kedua string memiliki panjang yang sama sebelum melakukan operasi XOR.
```py
hasil = ""
```
Variabel `hasil` diinisialisasi sebagai string kosong untuk menyimpan hasil operasi XOR.
```py
for i in range(n):
```
Loop `for` ini akan berjalan dari kiri ke kanan (dari indeks 0 hingga indeks `n-1`) untuk melakukan operasi XOR bit per bit.
```py
tambahan = int(a[i]) ^ int(b[i])
```
Operasi XOR biner dilakukan antara bit ke-i dari string `a` dan `b`. Hasilnya disimpan dalam variabel `tambahan`.
```py
hasil += str(tambahan)
```
Hasil operasi XOR disimpan dalam string `hasil`.
```py
return hasil
```
Fungsi `xor_bin` mengembalikan hasil operasi XOR dalam bentuk biner.

