# Operasi Enkripsi XOR
### Kode Program
```py
def bin_to_num(b):
	b = str(b)
	n = 0
	for digit in b:
		n = n * 2 + int(digit)
	return n
  
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
  
def bin_to_hex(a):
	b = bin_to_num(a)
	return num_to_hex(b)

def  num_to_bin(a):
	s = ""
	while a > 0:
		b = a % 2
		a = a // 2
		s = str(b) + s
	return s

def xor(a, b):
	s = ""
	for i in range(len(a)):
		s = s + str(int(a[i]) ^ int(b[i%len(b)]))
	return s
  
def encrypt(a, b):
	return xor(a, b), bin_to_hex(xor(a,b))

def  enc_string(a,b):
	s = ""
	a = str(a)
	for c in  a:
		c = num_to_bin(ord(c))
		c = c.zfill(8)
		s += chr(bin_to_num(xor(c,b)))
	return s
```
### Penjelasan setiap fungsi
```py
def bin_to_num(b):
	.
	.
	.
```
Fungsi `bin_to_num` digunakan untuk mengonversi string biner ke dalam format numerik. Fungsi ini menggunakan loop untuk mengiterasi setiap digit dalam string biner, dan kemudian mengonversi digit tersebut ke dalam format numerik menggunakan operasi `int(digit)`. Hasil konversi kemudian dikalikan dengan 2 dan ditambahkan dengan hasil sebelumnya untuk mendapatkan hasil akhir.
```py
def num_to_hex(n):
	.
	.
	.
```
Fungsi `num_to_hex` digunakan untuk mengonversi format numerik ke dalam format heksadesimal. Fungsi ini menggunakan loop untuk mengiterasi setiap digit dalam format numerik, dan kemudian mengonversi digit tersebut ke dalam format heksadesimal menggunakan operasi `remainder = n % 16`. Hasil konversi kemudian ditambahkan dengan string heksadesimal sebelumnya untuk mendapatkan hasil akhir.
```py
def bin_to_hex(a):
	.
	.
	.
```
Fungsi `bin_to_hex` digunakan untuk mengonversi string biner ke dalam format heksadesimal. Fungsi ini menggunakan fungsi `bin_to_num` untuk mengonversi string biner ke dalam format numerik, dan kemudian menggunakan fungsi `num_to_hex` untuk mengonversi format numerik ke dalam format heksadesimal.
```py
def num_to_bin(a):
	.
	.
	.
```
Fungsi `num_to_bin` digunakan untuk mengonversi format numerik ke dalam format biner. Fungsi ini menggunakan loop untuk mengiterasi setiap digit dalam format numerik, dan kemudian mengonversi digit tersebut ke dalam format biner menggunakan operasi `a % 2`. Hasil konversi kemudian ditambahkan dengan string biner sebelumnya untuk mendapatkan hasil akhir.
```py
def xor(a,b):
	.
	.
	.
```
Fungsi `xor` digunakan untuk melakukan operasi XOR antara dua string biner `a` dan `b`. Fungsi ini menggunakan loop untuk mengiterasi setiap digit dalam string biner `a`, dan kemudian melakukan operasi XOR dengan digit yang sama dalam string biner `b` menggunakan operasi `int(a[i]) ^ int(b[i%len(b)])`. Hasil XOR kemudian ditambahkan dengan string sebelumnya untuk mendapatkan hasil akhir.
```py
def encrypt(a,b):
	.
	.
	.
```
Fungsi `ecrypt` digunakan untuk melakukan operasi enkripsi XOR antara dua string biner `a` dan `b`. Fungsi ini menggunakan fungsi `xor` untuk melakukan operasi XOR antara dua string biner, dan kemudian menggunakan fungsi `bin_to_hex` untuk mengonversi hasil XOR ke dalam format heksadesimal. Hasil enkripsi kemudian dikembalikan dalam bentuk tuple yang terdiri dari hasil XOR dan hasil konversi ke dalam format heksadesimal.
### Advance Encrypt
Untuk penggunaan lebih lanjut, kita dapat menambahkan fungsi seperti dibawah ini:
```py
def enc_string(a,b):
	s = ""
	a = str(a)
	for c in  a:
		c = num_to_bin(ord(c))
		c = c.zfill(8)
		s += chr(bin_to_num(xor(c,b)))
	return s
```
Fungsi `enc_string` digunakan untuk melakukan enkripsi pada string `a` menggunakan kunci `b`. Fungsi ini menggunakan teknik enkripsi XOR untuk mengenkripsi setiap karakter dalam string `a` dan mengembalikannya dalam string yang sudah di enkripsi setiap karakternya.
