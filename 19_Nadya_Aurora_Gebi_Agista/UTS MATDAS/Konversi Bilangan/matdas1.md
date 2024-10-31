# **KONVERSI BILANGAN**
Nama : Nadya Aurora Gebi Agista
NIM : 244107020034
Kelas : TI 1H

## BAGIAN 1 : Sistem Bilangan
### 1. Konversi Bilangan
 - Ubah bilangan desimal 450 ke biner dan heksadesimal : 
![biner](https://i.postimg.cc/YSd345GL/desimal-ke-biner-dan-heksa.jpg)
 - Ubah bilangan biner 11011000 ke desimal dan heksadesimal :
![enter image description here](https://i.postimg.cc/RF3cWNx2/biner-ke-desimal-dan-heksa.jpg)
 - Ubah bilangan heksadesimal 1F4 ke desimal dan biner :
 ![enter image description here](https://i.postimg.cc/RF3cWNx2/biner-ke-desimal-dan-heksa.jpg)
 
#### KODE PROGRAM :
```java
import java.util.Scanner;
public class matdas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jenis konversi bilangan: ");
        System.out.println("1. Desimal ke Biner dan Heksadesimal");
        System.out.println("2. Biner ke Desimal dan Heksadesimal");
        System.out.println("3. Heksadesimal ke Desimal dan Biner");
        System.out.print("Pilih jenis konversi bilangan (1-3): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan bilangan desimal: ");
                int desimal = sc.nextInt();
                System.out.println();
                System.out.println("==================");
                System.out.println("  HASIL KONVERSI  ");
                System.out.println("==================");
                System.out.print("Biner = ");
                desimalBiner(desimal);
                System.out.println();
                System.out.print("Heksadesimal = ");
                desimalHeksa(desimal);
                System.out.println();
                break;
            case 2:
                System.out.print("Masukkan bilangan biner: ");
                String biner = sc.next();
                int desimalBiner = binerDesimal(biner);
                System.out.println();
                System.out.println("==================");
                System.out.println("  HASIL KONVERSI  ");
                System.out.println("==================");
                System.out.println("Desimal = " + desimalBiner);
                System.out.print("Heksadesimal = ");
                desimalHeksa(desimalBiner);
                System.out.println();
                break;
            case 3:
                System.out.print("Masukkan bilangan heksadesimal: ");
                String heksa = sc.next();
                int desimalHeksa = heksaDesimal(heksa);
                System.out.println();
                System.out.println("==================");
                System.out.println("  HASIL KONVERSI  ");
                System.out.println("==================");
                System.out.println("Desimal = " + desimalHeksa);
                System.out.print("Biner = ");
                desimalBiner(desimalHeksa);
                System.out.println();
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        System.out.println();
    }

    public static void desimalBiner(int i) {
        if (i > 1) {
            desimalBiner(i / 2);
        }
        System.out.print(i % 2);
    }

    public static void desimalHeksa(int i) {
        if (i > 15) {
            desimalHeksa(i / 16);
        }
        int hexDigit = i % 16;
        if (hexDigit < 10) {
            System.out.print(hexDigit);
        } else {
            System.out.print((char) ('A' + (hexDigit - 10)));
        }
    }

    public static int binerDesimal(String biner) {
        int desimal = 0;
        int pangkat = 1;
        for (int i = biner.length() - 1; i >= 0; i--) {
            if (biner.charAt(i) == '1') {
                desimal += pangkat;
            }
            pangkat *= 2;
        }
        return desimal;
    }

    public static void binerHeksa(String biner) {
        int desimal = binerDesimal(biner);
        desimalHeksa(desimal);
    }

    public static int heksaDesimal(String heksa) {
        int desimal = 0;
        int pangkat = 1;
        for (int i = heksa.length() - 1; i >= 0; i--) {
            char c = heksa.charAt(i);
            int nilai;
            if (c >= '0' && c <= '9') {
                nilai = c - '0';
            } else {
                nilai = c - 'A' + 10;
            }
            desimal += nilai * pangkat;
            pangkat *= 16;
        }
        return desimal;
    }

    public static void heksaBiner(String heksa) {
        int desimal = heksaDesimal(heksa);
        desimalBiner(desimal);
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
	
 - **Menu Konversi**
	``` java
		System.out.println("Jenis konversi bilangan: ");
		System.out.println("1. Desimal ke Biner dan Heksadesimal");
		System.out.println("2. Biner ke Desimal dan Heksadesimal");
		System.out.println("3. Heksadesimal ke Desimal dan Biner");
		System.out.print("Pilih jenis konversi bilangan (1-3): ");
		int  pilihan  =  sc.nextInt();
	```
	- Program akan menampilkan 3 menu kepada pengguna, yaitu konversi dari desimal, biner, dan heksadesimal ke format lain, serta meminta pengguna untuk memilih jenis konversi.
	- `int pilihan = sc.nextInt();` digunakan untuk membaca pilihan yang dimasukkan oleh pengguna


 - **Switch-case berdasarkan pilihan pengguna**
Berdasarkan nilai pilihan pengguna, program akan menjalankan salah satu kasus dari tiga kasus berikut :
	#### Case 1 : Konversi Desimal ke Biner dan Heksadesimal
	``` java
		case  1:
			System.out.print("Masukkan bilangan desimal: ");
			int  desimal  =  sc.nextInt();
			System.out.println();
			System.out.println("==================");
			System.out.println(" HASIL KONVERSI ");
			System.out.println("==================");
			System.out.print("Biner = ");
			desimalBiner(desimal);
			System.out.println();
			System.out.print("Heksadesimal = ");
			desimalHeksa(desimal);
			System.out.println();
			break;
	```
	 - Meminta pengguna untuk input bilangan desimal. Lalu, akan program akan menyimpan hasil inputan ke dalam variabel desimal.
	 - Menampilkan hasil konversi bilangan tersebut :
		* Biner : memanggil method `desimalBiner(desimal)` untuk konversi bilangan desimal menjadi biner.
		* Heksadesimal : memanggil method `desimalHeksa(desimal)` untuk konversi bilangan desimal menjadi heksadesimal.
			
	#### Case 2 : Konversi Biner ke Desimal dan Heksadesimal
	``` java
			
		case  2:
			System.out.print("Masukkan bilangan biner: ");
			String  biner  =  sc.next();
			int  desimalBiner  =  binerDesimal(biner);
			System.out.println();
			System.out.println("==================");
			System.out.println(" HASIL KONVERSI ");
			System.out.println("==================");
			System.out.println("Desimal = "  +  desimalBiner);
			System.out.print("Heksadesimal = ");
			desimalHeksa(desimalBiner);
			System.out.println();
			break;
	```

	- Meminta pengguna untuk input bilangan biner. Lalu, akan program akan menyimpan hasil inputan ke dalam variabel biner.
	- Mengonversi bilangan biner ke desimal melalui `binerDesimal(biner)` dan menyimpannya ke dalam variabel `desimalBiner`.
	- Menampilkan hasil konversi bilangan tersebut :
		* Desimal : Mencetak hasi desimal dari variabel `desimalBiner`.
		* Heksadesimal : Mengonversi nilai yang ada di dalam variabel `desimalBiner` ke heksadesimal.

	#### Case 3 : Konversi Heksadesimal ke Desimal dan Biner

	``` java	
		case  3:
			System.out.print("Masukkan bilangan heksadesimal: ");
			String  heksa  =  sc.next();
			int  desimalHeksa  =  heksaDesimal(heksa);
			System.out.println();
			System.out.println("==================");
			System.out.println(" HASIL KONVERSI ");
			System.out.println("==================");
			System.out.println("Desimal = "  +  desimalHeksa);
			System.out.print("Biner = ");
			desimalBiner(desimalHeksa);
			System.out.println();
			break;
	```

	- Meminta pengguna untuk input bilangan heksadesimal lalu program akan menyimpan ke dalam variabel `heksa`.
	- Mengonversi heksadesimal ke desimal melalui variabel `heksaDesimal(heksa)` dan menyimpannya ke dalam variabel `desimalHeksa`.
	- Menampilkan hasil konversi :
		* Desimal : Mencetak hasil desimal yang telah disimpan didalam variabel `desimalHeksa`.
		* Biner : Mengomversi nilai yang ada di dalam variabel `desimalHeksa` ke biner.
		
- **Method Desimal ke Biner**
```java
			public  static  void  desimalBiner(int  i) {
				if (i  >  1) {
					desimalBiner(i  /  2);
				}
				System.out.print(i  %  2);
			}
```
- Melakukan pembagian antar `i` dengan 2 hingga tidak dapat dibagi lagi, lalu mencetak hasil sisa pembagian ` i % 2` yang mencetak bit dari bilangan biner.

- **Method Desimal ke Heksadesimal**
```java
		
		public  static  void  desimalHeksa(int  i) {
			if (i  >  15) {
				desimalHeksa(i  /  16);
			}
			int  hexDigit  =  i  %  16;
			if (hexDigit  <  10) {
				System.out.print(hexDigit);
			} else {
				System.out.print((char) ('A'  + (hexDigit  -  10)));
			}
		}
```
- Melakukan pembagian berturut-turut antara `i` dengan 16 
- Jika nilai digit heksadesimal kurang dari 10, maka akan langsung dicetak.
- Jika nilai digit heksadesimal lebih dari 10, maka akan dikonversikan terlebih dahulu ke huruf A-F.

- **Method Biner ke Desimal **
```java
	public  static  int  binerDesimal(String  biner) {
		int  desimal  =  0;
		int  pangkat  =  1;
		for (int  i  =  biner.length() -  1; i  >=  0; i--) {
			if (biner.charAt(i) ==  '1') {
				desimal  +=  pangkat;
			}
			pangkat  *=  2;
		}	
		return  desimal;
	}
```

- Membaca bilangan biner dari kanan ke kiri.
- Jika digit adalah 1, nilai desimal ditambahkan dengan pangkat dari dua dan menambahkannya ke variabel desimal.

- **Method Biner ke Heksadesimal **
```java
	public  static  void  binerHeksa(String  biner) {
		int  desimal  =  binerDesimal(biner);
		desimalHeksa(desimal);
	}
```
- Mengonversi menggunakan nilai yang ada di dalam variabel `binerDesimal` untuk mengubah biner ke desimal, lalu variabel `desimalHeksa` akan menampilkan hasil konversi dalam bentuk heksadesimal.

- **Method Heksadesimal ke Desimal**
```java	
	public  static  int  heksaDesimal(String  heksa) {	
		int  desimal  =  0;
		int  pangkat  =  1;
		for (int  i  =  heksa.length() -  1; i  >=  0; i--) {
			char  c  =  heksa.charAt(i);
			int  nilai;
			if (c  >=  '0'  &&  c  <=  '9') {
				nilai  =  c  -  '0';
			} else {
				nilai  =  c  -  'A'  +  10;
			}
			desimal  +=  nilai  *  pangkat;
			pangkat  *=  16;
		}
		return  desimal;
	}
```

- Method ini akan membaca karakter dari kanan ke kiri.
- Jika karakter berada di antara `0` dan `9`, `nilai` dihitung dengan `c - '0'`
- Jika karakter berada di antara `A` dan `F`, `nilai` dihitung sebagai `c - 'A' + 10`.
- Nilai setiap digit akan dikalikan pangkat dari 16. Lalu, akan ditambahkan ke variabel `desimal`.

- **Method Heksadesimal ke Biner**
```java
	public  static  void  heksaBiner(String  heksa) {
		int  desimal  =  heksaDesimal(heksa);
		desimalBiner(desimal);
		}
	}
```

- Mengonversi bilangan melalui variabel `heksaDesimal` untuk mendapatkan nilai desimal, lalu mengonversikannya ke biner melalui variabel `desimalBiner`.

		
