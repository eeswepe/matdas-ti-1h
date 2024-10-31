# Pengolahan data sensor
### Penjelasan Program
Program dibawah ini adalah simulasi sistem pengukuran menggunakan sensor, dimana setiap sensor akan mengirimkan sebuah bilangan biner kepada sistem. Program yang kita buat bertugas untuk mengubah bilangan desimal yang dikirimkan oleh sensor menjadi sebuah bilangan biner dan heksadesimal, sehingga sistem kita dapat menyimpan data dengan lebih cepat.

### Kode Program
Fungsi mengubah bilangan desimal ke heksadesimal
```py
def  num_to_hex(n):
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
Fungsi mengubah bilangan desimal ke biner
```py
def num_to_bin(a):
	s = ""
	while a > 0:
		b = a % 2
		a = a // 2
		s = str(b) + s
	return s
```
Fungsi utama program 
```py
def  main():
	suhu = input("Masukkan suhu: ")
	kelembapan = input("Masukkan kelembapan: ")
	co2 = input("Masukkan CO2: ")
	
	suhu_bin = num_to_bin(int(float(suhu)))
	kelembapan_bin = num_to_bin(int(float(kelembapan)))
	co2_bin = num_to_bin(int(float(co2)))
	
	suhu_hex = num_to_hex(int(float(suhu)))
	kelembapan_hex = num_to_hex(int(float(kelembapan)))
	co2_hex = num_to_hex(int(float(co2)))
	
	print("Suhu dalam biner: ", suhu_bin)
	print("Kelembapan dalam biner: ", kelembapan_bin)
	print("CO2 dalam biner: ", co2_bin)
	
	print("Suhu dalam hex: ", suhu_hex)
	print("Kelembapan dalam hex: ", kelembapan_hex)
	print("CO2 dalam hex: ", co2_hex)
```
### Penjelasan
```py
def num_to_bin(a):
	.
	.
	.
```
Fungsi `num_to_bin` menerima sebuah bilangan sebagai input dan mengembalikan representasi biner dari bilangan tersebut. Fungsi ini menggunakan metode konversi bilangan ke biner dengan menggunakan operasi modulo dan pembagian.
```py
def num_to_hex(n):
	.
	.
	.
```
Fungsi `num_to_hex` menerima sebuah bilangan sebagai input dan mengembalikan representasi heksadesimal dari bilangan tersebut. Fungsi ini menggunakan metode konversi bilangan ke heksadesimal dengan menggunakan operasi modulo dan pembagian.
```py
def main():
	.
	.
	.
```
Fungsi `main` adalah fungsi utama yang digunakan untuk menjalankan program. Fungsi ini menerima input dari pengguna berupa suhu, kelembapan, dan CO2. Kemudian, fungsi ini menggunakan fungsi `num_to_bin` dan `num_to_hex` untuk mengonversi input tersebut ke dalam format biner dan heksadesimal.
