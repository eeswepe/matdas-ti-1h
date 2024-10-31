
# Konversi Bilangan
## 1. Program konversi bilangan Desimal
### 1. 1. Konversi bilangan desimal ke biner
``` py
def num_to_bin(a):
	s = ""
	while a > 0:
		b = a % 2
		a = a // 2
		s = str(b) + s
	return  s
```
### Penjelasan
```py
def num_to_bin(a):
```
Baris kode diatas adalah deklarasi fungsi dimana fungsi tersebut akan mengambil satu buah parameter yang berupa int untuk diubah menjadi bilangan biner.
```py
s = ""
```
Baris kode diatas adalah deklarasi string kosong yang nantinya akan digunakan sebagai tempat menyimpan bilangan biner.
```py
while a > 0: 
```
Loop ini akan mengulang seluruh proses yang ada didalamnya selama a lebih besar dari 0.
```py
b = a % 2
```
Variabel b diisi dengan sisa pembagian ```a``` dengan 2. Jika ```a``` adalah ganjil, maka ```b``` akan bernilai 1, dan jika ```a``` adalah genap, maka ```b``` akan bernilai 0.
```py
a = a // 2
```
Variabel ```a``` akan dibagi dengan 2 tanpa sisa. Sesuai dengan konsep pengubahan bilangan biner ke desimal.
```py
s = str(b) + s
```
Variabel ```s```  akan ditambahkan dengan hasil konversi variabel ```b``` ke string, yang mana akan membentuk string biner dari kanan ke kiri
```py
return s
```
Setelah loop `while` selesai, fungsi `num_to_bin` mengembalikan string `s` yang berisi representasi biner dari nilai numerik asli `a`.

### 1. 2. Konversi bilangan desimal ke heksadesimal
``` py
def num_to_hex(n):
	if n == 0:
		return "0"
	hex_chars = "0123456789ABCDEF"
	hex_str = ""
	while n > 0:
		remainder = n % 16
		hex_str = hex_chars[remainder] + hex_str
		n = n // 16
	return hex_str
```
### Penjelasan
```py
def num_to_hex(n):
```
Baris kode diatas adalah deklarasi fungsi dimana fungsi tersebut akan mengambil satu buah parameter yang berupa int untuk diubah menjadi bilangan heksadesimal.
```py
if n == 0:
	return 0
```
Kondisi ini memeriksa apakah nilai `n` sama dengan 0. Jika benar, maka fungsi akan mengembalikan string "0" secara langsung.
```py
hex_chars = '0123456789ABCDEF'
```
Variabel `hex_chars` diinisialisasi dengan string yang berisi semua karakter heksadesimal, dari 0 hingga F (huruf besar).
```py
hex_str = ""
```
Variabel `hex_str` diinisialisasi sebagai string kosong untuk menyimpan hasil konversi.
```py
while n > 0:
```
Loop `while` ini akan berjalan selama nilai `n` lebih besar dari 0.
```py
remainder = n % 16
```
Variabel `remainder` diisi dengan nilai sisa dari pembagian `n` dengan 16. Ini akan memberikan nilai antara 0 dan 15.
```py
hex_str = hex_chars[remainder] + hex_str
```
Karakter heksadesimal yang sesuai dengan nilai `remainder` diambil dari string `hex_chars` dan ditambahkan ke awal string `hex_str`. Ini akan membangun string heksadesimal dari kanan ke kiri.
```py
n = n // 16
```
Nilai `n` dibagi dengan 16 dan hasilnya disimpan kembali di `n`. Ini akan mengurangi nilai `n` dengan faktor 16.
```py
return hex_str
```
Setelah loop `while` selesai, fungsi `num_to_hex` mengembalikan string `hex_str` yang berisi representasi heksadesimal dari nilai numerik asli `n`.

## 2. Program konversi bilangan Biner
### 2. 1. Konversi bilangan biner ke desimal
```py
def bin_to_num(b):
	b = str(b)
	n = 0
	for digit in b:
		n = n * 2 + int(digit)
	return  n
```
### Penjelasan

```py
def bin_to_num(b):
```
Baris kode ini mendefinisikan sebuah fungsi bernama `bin_to_num` yang memiliki satu parameter `b`. Fungsi ini akan mengubah representasi biner `b` menjadi nilai numerik.
```py
b = str(b)
```
Variabel `b` diubah menjadi string untuk memastikan bahwa nilai input dapat diiterasi sebagai string. 
```py
n = 0
```
Variabel `n` diinisialisasi dengan nilai 0 untuk menyimpan hasil konversi.
```py
for digit in b:
```
Loop `for` ini akan berjalan untuk setiap karakter (digit) dalam string `b`.
```py
n = n * 2 + int(digit)
```
Pada setiap iterasi, nilai `n` dikalikan dengan 2 dan kemudian ditambahkan dengan nilai integer dari digit yang sedang diiterasi. Ini akan membangun nilai numerik dari sebuah bilangan biner.
```py
return  n
```
Setelah loop `for` selesai, fungsi `bin_to_num` mengembalikan nilai numerik yang telah dikonversi dari representasi biner asli `b`.

### 2. 2.  Konversi bilangan biner ke heksadesimal
```py
def bin_to_hex(a):
	b = bin_to_num(a)
	return num_to_hex(b)
```
### Penjelasan
```py
def bin_to_hex(a):
```
Baris kode ini mendefinisikan sebuah fungsi bernama `bin_to_hex` yang memiliki satu parameter `a`. Fungsi ini akan mengubah representasi biner `a` menjadi nilai heksadesimal.
```py
	b = bin_to_num(a)
```
Baris ini merupakan tahan dimana nilai dari parameter `a` diubah terlebih dahulu menjadi representasi numerik dan dimasukkan dalam variabel `b`.
```py
	return num_to_hex(b)
```
Setelah didapatkan nilai numeriknya, nilai dari variabel `b` diubah menjadi bilangan heksadesimal dengan menggunakan fungsi yang sudah dibuat sebelumnya

## 3. Program konversi bilangan Heksadesimal
### 3. 1. Konversi bilangan heksadesimal ke desimal
```py
def hex_to_num(h):
	h = str(h)
	n = 0
	power = 0
	hex_chars = "0123456789ABCDEF"
	for char in h[::-1]:
		index = hex_chars.index(char.upper())
		n += index * (16 ** power)
		power += 1
	return  n
```
### Penjelasan

```py
def hex_to_num(h):
```
Fungsi ini mendefinisikan sebuah fungsi bernama `hex_to_num` yang memiliki satu parameter `h`. Fungsi ini akan mengubah representasi heksadesimal `h` menjadi nilai numerik.
```py
h = str(h)
```
Variabel `h` diubah menjadi string untuk memastikan bahwa nilai input dapat diiterasi sebagai string.
```py
n = 0
```
Variabel `n` diinisialisasi dengan nilai 0 untuk menyimpan hasil konversi.
```py
power = 0
```
Variabel `power` diinisialisasi dengan nilai 0 untuk menyimpan pangkat yang akan digunakan dalam perhitungan.
```py
hex_chars = "0123456789ABCDEF"
```
Variabel `hex_chars` diinisialisasi dengan string yang berisi semua karakter heksadesimal, dari 0 hingga F (huruf besar).
```py
for char in h[::-1]:
```
Loop `for` ini akan berjalan untuk setiap karakter (digit) dalam string `h`, tetapi dengan urutan terbalik (dari kanan ke kiri).
```py
index = hex_chars.index(char.upper())
```
Pada setiap iterasi, indeks dari karakter yang sedang diiterasi dalam string `hex_chars` diambil. Fungsi `upper()` digunakan untuk memastikan bahwa karakter yang diiterasi diubah menjadi huruf besar.
```py
n += index * (16 ** power)
```
Pada setiap iterasi, nilai `n` ditambahkan dengan hasil perkalian antara indeks karakter yang sedang diiterasi dan pangkat 16 yang sesuai dengan posisi karakter tersebut.
```py
power += 1
```
Pada setiap iterasi, nilai `power` ditambahkan dengan 1 untuk memperbarui pangkat yang digunakan dalam perhitungan.
```py
return  n
```
Setelah loop `for` selesai, fungsi `hex_to_num` mengembalikan nilai numerik yang telah dikonversi dari representasi heksadesimal asli `h`.


### 3. 2. Konversi bilangan heksadesimal ke biner
```py
def hex_to_bin(a):
	b = hex_to_num(a)
	return num_to_bin(b)
```
### Penjelasan
```py
def hex_to_bin(a):
```
Baris kode ini mendefinisikan sebuah fungsi bernama `hex_to_bin` yang memiliki satu parameter `a`. Fungsi ini akan mengubah nilai heksadesimal `a` menjadi representasi biner.
```py
b = hex_to_num(a)
```
Baris ini merupakan tahan dimana nilai dari parameter `a` diubah terlebih dahulu menjadi representasi numerik dan dimasukkan dalam variabel `b`.
```py
return num_to_bin(b)
```
Setelah didapatkan nilai numeriknya, nilai dari variabel `b` diubah menjadi bilangan biner dengan menggunakan fungsi yang sudah dibuat sebelumnya

