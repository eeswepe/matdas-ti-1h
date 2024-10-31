## BAGIAN 3 : Enkripsi dan Keamanan
### 4. Operasi Enkripsi
- Menampilkan hasil output XOR dengan format biner dan heksadesimal
	- Pertimbangkan bilangan biner 01101100 dengan kunci 10101010.
	![](https://i.postimg.cc/x1kdW7My/Enkripsi-1.jpg)
	
	-  Pertimbangkan bilangan biner 11010110 dengan kunci 10101010
	![](https://i.postimg.cc/fR6bZKv4/Enkripsi-2.jpg)
	
	
#### KODE PROGRAM :
```java

```
#### Penjelasan Kode Program :
 - **Deklarasi Scanner** 
	``` java
	import  java.util.Scanner;
	```
	- Library scanner digunakan untuk membaca inputan dari pengguna
	
 - **Scanner**
	``` java
	 Scanner  sc  =  new  Scanner(System.in);
	 ```
	- digunakan untuk membuat objek Scanner untuk menerima  dan membaca inputan dari pengguna.
	
- **Pengguna Memasukkan Bilangan Biner dan Kunci Biner**
	```java
		System.out.print("Masukkan bilangan biner untuk dienkripsi: ");
		String  biner  =  scanner.nextLine();
		System.out.print("Masukkan kunci biner: ");
		String  kunciBiner  =  scanner.nextLine();
	```
	- Program akan meminta pengguna untuk memasukkan dua nilai dalam bentuk biner ke dalam dua variabel berikut :
	    -   `biner`: data yang akan dienkripsi.
	    -   `kunciBiner`: kunci enkripsi.
	-   Data yang telah dimasukkan oleh pengguna akan disimpan dalam variabel `biner` dan `kunciBiner` dalam bentuk string.
	
- **Konversi Bilangan Biner ke Desimal**
	```java
		int  bilBiner  =  binerDesimal(biner);
		int  kunci  =  binerDesimal(kunciBiner);
	```

	-   Fungsi `binerDesimal` adalah untuk mengonversi string biner menjadi integer desimal untuk mempermudah program agar dapat melakukan operasi matematika, seperti XOR yang tidak dapat dilakukan langsung pada format biner.

- **Operasi XOR untuk Enkripsi**
	```java
		int  hasilXOR  =  bilBiner  ^  kunci;
	```
	- `int hasilXOR = bilBiner ^ kunci;` menggunakan operator bitwise XOR (`^`) untuk mengenkripsi data dengan melakukan operasi XOR antara dua nilai desimal, yaitu `bilBiner` dan `kunci`. XOR adalah operasi logika dimana bit akan menghasilkan angka 1, jika kedua bit berbeda dan akan menghasilkan angka 0, jika kedua bit sama.

- **Menampilkan data yang dimasukkan**
	```java
		System.out.println("\n---------- HASIL ENKRIPSI ----------");
		System.out.println("Bilangan Biner : "  +  biner);
		System.out.println("Kunci : "  +  kunciBiner);
	```
	-   `System.out.println("\nHASIL ENKRIPSI");`digunakan untuk mencetak judul bagian hasil enkripsi, yaitu **"HASIL ENKRIPSI"**, untuk menunjukkan kepada pengguna bahwa data yang akan ditampilkan berikutnya adalah hasil dari proses enkripsi.
	    -   Karakter `\n` adalah karakter escape yang digunakan untuk membuat baris baru sebelum menampilkan teks "HASIL ENKRIPSI", sehingga tampilan lebih rapi.
	-   `System.out.println("Bilangan Biner: " + biner);` digunakan untuk menampilkan bilangan biner asli yang diinput oleh pengguna.
	-   `System.out.println("Kunci : " + kunciBiner);`digunakan untuk menampilkan kunci enkripsi yang dimasukkan pengguna.

- **Konversi Hasil XOR ke Biner**
	```java
		String  hasilBiner  =  "";
		int  tempBiner  =  hasilXOR;
		if(tempBiner  ==  0) {
			hasilBiner  =  "0";
		} else {
			while(tempBiner  >  0) {
				hasilBiner  = (tempBiner  %  2) +  hasilBiner;
				tempBiner  =  tempBiner  /  2;
			}
		}
	```
	- `String hasilBiner = "";` digunakan untuk menampung hasil konversi biner sebagai string kosong.
	-   `int tempBiner = hasilXOR;` digunakan untuk mempermudah proses konversi tanpa mengubah nilai asli `hasilXOR`.
	-   `if(tempBiner == 0) { hasilBiner = "0"; }` 
		– Jika `tempBiner` bernilai `0`, `hasilBiner` langsung diisi `"0"` karena biner dari 0 adalah 0. 
	-   `else { while(tempBiner > 0) { ... } }` 
		- Jika `tempBiner` bukan `0`, perulangan `while` akan dijalankan seperti berikut ini:
		- `(tempBiner % 2)` akan memberikan bit paling rendah dari `tempBiner`, yang ditambahkan di depan `hasilBiner`.
		- `tempBiner` kemudian dibagi `2` hingga mencapai `0`, menghasilkan representasi biner dari `hasilXOR`.

	-**Konversi Hasil XOR ke Heksadesimal**
	```java
		String  hasilHexa  =  "";
		char[] hexChars  ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		if(hasilXOR  ==  0) {
			hasilHexa  =  "0";
		} else {
			while(hasilXOR  >  0) {
				hasilHexa  =  hexChars[hasilXOR  %  16] +  hasilHexa;
				hasilXOR  =  hasilXOR  /  16;
			}
		}
	```
	-    `String hasilHexa = "";`digunakan untuk menampung hasil konversi ke heksadesimal.
	    -   `char[] hexChars = {'0','1','2','3','4','5','6','7','8','9', 'A','B','C','D','E','F'};` digunakan untuk membantu konversi angka 0-15 menjadi karakter heksadesimal.
	    -   `if(hasilXOR == 0) { hasilHexa = "0"; }` 
	    Jika `hasilXOR` bernilai 0, langsung diatur agar `hasilHexa` menjadi `"0"` karena representasi heksadesimal dari 0 adalah 0. 
	    - `else { while(hasilXOR > 0) { ... } }`
		    Jika `hasilXOR` bukan 0, perulangan `while` mengonversinya ke heksadesimal dengan langkah berikut:
			- `hasilXOR % 16` memberikan sisa pembagian (0-15) sebagai indeks untuk `hexChars`, yang karakternya ditambahkan di depan `hasilHexa`.
			- `hasilXOR = hasilXOR / 16;` hasilXOR akan dibagi dengan16 hingga bernilai 0, menggeser ke digit heksadesimal berikutnya.

- **Menampilkan Hasil Enkripsi**
	```java
		System.out.println("Hasil XOR (biner) : "  +  hasilBiner);
		System.out.println("Hasil XOR (Heksadesimal) : "  +  hasilHexa);
	```
	Program menampilkan hasil enkripsi dalam dua bentuk:
	-   `hasilBiner`: hasil XOR dalam bentuk biner.
	-   `hasilHexa`: hasil XOR dalam bentuk heksadesimal.

- **Fungsi `binerDesimal` untuk Konversi Biner ke Desimal**
	```java
		static  int  binerDesimal(String  biner) {
			int  desimal  =  0;
			int  nilaiPosisi  =  1;

			for(int  i  =  biner.length()-1; i  >=  0; i--) {
				if(biner.charAt(i) ==  '1') {
					desimal  +=  nilaiPosisi;
				}
				nilaiPosisi  *=  2;
			}
			return  desimal;
			}
		}
	```
	-   `int desimal = 0;`digunakan untuk menyimpan hasil konversi ke bentuk desimal. 
	-   `int nilaiPosisi = 1;` digunakan untuk menyimpan nilai posisi bit ke dalam bilangan biner, dimulai dari bit paling kanan.
	- `for(int i = biner.length()-1; i >= 0; i--)` 
		Perulangan akan dimulai dari bit paling kanan atau indeks terakhir hingga bit paling kiri atau indeks 0.
	-   `biner.charAt(i) == '1'` digunakan untuk mengecek apakah karakter pada indeks `i` adalah `1`.
	- Jika ditemukan angka `1`, maka program akan menambahkan nilai posisi (1, 2, 4, dst.) pada variabel `desimal`, dan variabel `nilaiPosisi` akan dikalikan dua setiap perulangan.
