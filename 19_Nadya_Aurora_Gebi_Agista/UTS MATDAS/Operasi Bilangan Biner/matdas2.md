## BAGIAN 1 : Sistem Bilangan
### 2. Operasi Bilangan Biner
- Penjumlahan biner: 110101 + 10111
  
![enter image description here](https://i.postimg.cc/fTFJ8Zpf/Penjumlahan.jpg)

- Pengurangan biner: 111001 - 10101
  
![enter image description here](https://i.postimg.cc/8CgsV41F/Pengurangan.jpg)

- Perkalian biner: 1011 × 110
  
![enter image description here](https://i.postimg.cc/TwRwKP5f/Perkalian.jpg)

- Operasi AND, OR, dan XOR pada bilangan biner 101011 dan 110101
  
![enter image description here](https://i.postimg.cc/mkKByZkc/AND-OR-XOR.jpg)


#### KODE PROGRAM :
```java
import java.util.Scanner;
public class matdas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            System.out.println("\nPilih operasi:");
            System.out.println("1. Penjumlahan Biner");
            System.out.println("2. Pengurangan Biner");
            System.out.println("3. Perkalian Biner");
            System.out.println("4. Operasi AND, OR, XOR");
            System.out.print("Masukkan pilihan (1-4): ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan < 1 || pilihan > 4) {
                System.out.println("Pilihan tidak valid!");
                return; 
            }

            System.out.print("Masukkan bilangan biner pertama : ");
            String biner1 = scanner.nextLine();
            System.out.print("Masukkan bilangan biner kedua   : ");
            String biner2 = scanner.nextLine();

            // Konversi biner ke desimal
            int bil1 = binerDesimal(biner1);
            int bil2 = binerDesimal(biner2);

            if (bil1 == -1 || bil2 == -1) {
                System.out.println("Tidak valid. Silakan coba lagi!");
                return;
            }

            switch (pilihan) {
                case 1: // Penjumlahan
                    int penjumlahan = bil1 + bil2;
                    System.out.println("HASIL: ");
                    System.out.println( biner1 + " + " + biner2 + " = " + desimalBiner(penjumlahan));
                    break;
                case 2: // Pengurangan
                    int pengurangan = bil1 - bil2;
                    if (pengurangan < 0) {
                        System.out.println("Hasil pengurangan negatif. Periksa kembali inputnya.");
                    } else {
                        System.out.println("HASIL: ");
                        System.out.println(biner1 + " - " + biner2 + " = " + desimalBiner(pengurangan));
                    }
                    break;
                case 3: // Perkalian
                    int perkalian = bil1 * bil2;
                    System.out.println("HASIL: " );
                    System.out.println( biner1 + " * " + biner2 + " = " + desimalBiner(perkalian));
                    break;
                case 4: // Operasi logika AND, OR, XOR
                    System.out.println("HASIL AND" + " = " + desimalBiner(bil1 & bil2));
                    System.out.println("HASIL OR " + " = " + desimalBiner(bil1 | bil2));
                    System.out.println("HASIL XOR" + " = " + desimalBiner(bil1 ^ bil2));
                    break;
                default:
                    System.out.println("Pilihan invalid");
                    break;
            }
        }
    
    // Konversi biner ke desimal
    public static int binerDesimal(String biner) {
        int desimal = 0;
        for (int i = 0; i < biner.length(); i++) {
            char bit = biner.charAt(biner.length() - 1 - i);
            if (bit == '1') {
                desimal += (1 << i); 
            } else if (bit != '0') {
                return -1; 
            }
        }
        return desimal;
    }

    // Konversi desimal ke biner
    public static String desimalBiner(int desimal) {
        if (desimal == 0) return "0";
        String hasil = "";
        while (desimal > 0) {
            hasil = (desimal % 2) + hasil;
            desimal /= 2;
        }
        return hasil;
    }
}
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

- **Pilihan Operasi**
	```java
			
			System.out.println("\nPilih operasi:");
			System.out.println("1. Penjumlahan Biner");
			System.out.println("2. Pengurangan Biner");
			System.out.println("3. Perkalian Biner");
			System.out.println("4. Operasi AND, OR, XOR");
			System.out.print("Masukkan pilihan (1-4): ");
			
			int  pilihan  =  scanner.nextInt();
			scanner.nextLine();
	```
	- Mencetak daftar operasi yang dipilih oleh pengguna.
	- `int pilihan = scanner.nextInt();` digunakan untuk membaca pilihan operasi yang dipilih oleh pengguna.
	- `scanner.nextLine();` digunakan untuk membersihkan newline setelah membaca integer.

- **Melakukan Validasi Pilihan**
	```java
		if (pilihan  <  1  ||  pilihan  >  4) {
			System.out.println("Pilihan tidak valid!");
			return;
		}
	```
	
	- Memeriksa apakah pilihan yang dimasukkan berada di pilihan antara 1 - 4. Jika tidak, program akan menampilkan pesan "Pilihan tidak valid!"

- **Membaca Bilangan Biner**
	```java
		System.out.print("Masukkan bilangan biner pertama : ");
		String  biner1  =  scanner.nextLine();
		System.out.print("Masukkan bilangan biner kedua : ");
		String  biner2  =  scanner.nextLine();
	```
	- Pengguna akan diperintahkan untuk memasukkan dua bilangan biner. Lalu, program akan menyimpan hasil inputan ke dalam variabel `biner1` dan `biner2`.

- **Konversi Biner ke Desimal**
	```java
		int  bil1  =  binerDesimal(biner1);
		int  bil2  =  binerDesimal(biner2);
	```
	- Mengkonversi bilangan biner yang diinput oleh pengguna menjadi nilai desimal.

- **Validasi Bilangan Biner**
	```java
		if (bil1  ==  -1  ||  bil2  ==  -1) {
			System.out.println("Tidak valid. Silakan coba lagi!");
			return;
		}
	```
	- Jika bilang biner mengandung karakter selain 0 dan 1, program akan menampilkan pesan "Tidak valid. Silahkan coba lagi!"

- **Pengolahan Berdasarkan Pilihan Pengguna**
	##### Case 1 (Penjumlahan)
		```java
			switch (pilihan) {
				case  1:  // Penjumlahan
					int  penjumlahan  =  bil1  +  bil2;
					System.out.println("HASIL: ");
					System.out.println( biner1  +  " + "  +  biner2  +  " = "  +  desimalBiner(penjumlahan));
					break;
		```
		- digunakan untuk menghitung penjumlahan antara dua bilangan desimal yang diperoleh dan menampilkan hasil dalam bentuk bilangan biner.
	
	##### Case 2 (Pengurangan)
		```java
			case  2:  // Pengurangan
				int  pengurangan  =  bil1  -  bil2;
				if (pengurangan  <  0) {
					System.out.println("Hasil pengurangan negatif. Periksa kembali inputnya.");
				} else {
					System.out.println("HASIL: ");
					System.out.println(biner1  +  " - "  +  biner2  +  " = "  +  desimalBiner(pengurangan));
				}
				break;
		```
		- digunakan untuk menghitung pengurangan dan menampilkan hasil dari operasi pengurangan bilangan biner tersebut. Jika hasilnya negatif, maka program akan menampilkan pesan bahwa hasil pengurangan negatif.
	
	##### Case 3 (Perkalian)
		```java
			case  3:  // Perkalian
				int  perkalian  =  bil1  *  bil2;
				System.out.println("HASIL: " );
				System.out.println( biner1  +  " * "  +  biner2  +  " = "  +  desimalBiner(perkalian));
				break;
		```
		- digunakan untuk menghitung perkalian dan menampilkan hasil.
	
	##### Case 4 (Operasi Logika) 
		```java
			case  4:  // Operasi logika AND, OR, XOR
				System.out.println("HASIL AND"  +  " = "  +  desimalBiner(bil1  &  bil2));
				System.out.println("HASIL OR "  +  " = "  +  desimalBiner(bil1  |  bil2));
				System.out.println("HASIL XOR"  +  " = "  +  desimalBiner(bil1  ^  bil2));
				break;
		```
		- digunakan untuk menghitung dan menampilkan hasil dari operasi logika AND, OR, dan XOR.

- **Metode Konversi Biner ke Desimal**
	```java
		public  static  int  binerDesimal(String  biner) {
			int  desimal  =  0;
			for (int  i  =  0; i  <  biner.length(); i++) {
				char  bit  =  biner.charAt(biner.length() -  1  -  i);
				if (bit  ==  '1') {
					desimal  += (1  <<  i);
				} else  if (bit  !=  '0') {
					return  -1;
				}
			}
			return  desimal;
		}
	```
	- `public static int binerDesimal(String biner)` : digunakan untuk mengonversi bilangan biner ke desimal. Jika terdapat karakter selain 0 atau 1, metode akan mengembalikan -1.

- **Metode Konversi Desimal ke Biner**
	```java
		public  static  String  desimalBiner(int  desimal) {
			if (desimal  ==  0) return  "0";
			String  hasil  =  "";
			while (desimal  >  0) {
				hasil  = (desimal  %  2) +  hasil;
				desimal  /=  2;
			}
			return  hasil;
		}
	}
	```
	- `public static int desimalBiner(int desimal)`: digunakan untuk mengonversi bilangan desimal ke biner dengan cara mengambil sisa pembagian, mengurangi nilai desimal secara berulang-ulang, dan menghasilkan bentuk string dari digit biner yang dihasilkan.
