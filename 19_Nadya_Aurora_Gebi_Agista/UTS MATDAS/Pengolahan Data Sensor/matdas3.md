## BAGIAN 2 : Aplikasi Sistem Bilangan
### 3. Pengolahan Data Sensor
- Mengonversi data dibawah ini ke format biner dan heksadesimal
	▪ Diberikan data sensor berikut: 
		▪ Suhu: 28.6 °C 
		▪ Kelembapan: 65 % 
		▪ CO2: 420 ppm
		![](https://i.postimg.cc/xCMLG8t7/Sensor.jpg)
	
#### KODE PROGRAM :
```java
import java.util.Scanner;
public class matdas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan suhu (°C): ");
        double suhu = scanner.nextDouble();
        
        System.out.print("Masukkan kelembapan (%): ");
        int kelembapan = scanner.nextInt();
        
        System.out.print("Masukkan CO2 (ppm): ");
        int co2 = scanner.nextInt();


        System.out.println("\n------------------------");
        System.out.println("--- DATA SENSOR AWAL ---");
        System.out.println("------------------------");
        System.out.println("Suhu: " + suhu + " °C");
        System.out.println("Kelembapan: " + kelembapan + " %");
        System.out.println("CO2: " + co2 + " ppm");
        System.out.println();


        System.out.println("------------------------");
        System.out.println("     HASIL KONVERSI     ");
        System.out.println("------------------------");

        
        // Konversi Suhu
        System.out.println("1. Suhu (" + (int)suhu + " °C)");
        int suhuInt = (int)(suhu); 
        System.out.print("   Biner: ");
        printBiner(suhuInt);
        System.out.print("   Hexa : ");
        printHexa(suhuInt);

        // Konversi Kelembapan
        System.out.println("2. Kelembapan (" + kelembapan + " %)");
        System.out.print("   Biner: ");
        printBiner(kelembapan);
        System.out.print("   Hexa : ");
        printHexa(kelembapan);
    
        // Konversi CO2
        System.out.println("3. CO2 (" + co2 + " ppm)");
        System.out.print("   Biner: ");
        printBiner(co2);
        System.out.print("   Hexa : ");
        printHexa(co2);
    }

    public static void printBiner(int n) {
        if (n == 0) {
            System.out.println("0");
            return;
        }
        
        int[] biner = new int[32];
        int i = 0;
        
        while (n > 0) {
            biner[i] = n % 2;
            n = n / 2;
            i++;
        }
        
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(biner[j]);
        }
        System.out.println();
    }

    public static void printHexa(int n) {
        if (n == 0) {
            System.out.println("0");
            return;
        }
        
        char[] hexa = new char[100];
        int i = 0;
        
        while (n != 0) {
            int temp = n % 16;
            if (temp < 10) {
                hexa[i] = (char)(temp + 48);
            } else {
                hexa[i] = (char)(temp + 55);
            }
            i++;
            n = n / 16;
        }
        
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(hexa[j]);
        }
        System.out.println();
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

-**Pengguna menginputkan bilangan**
```java
	System.out.print("Masukkan suhu (°C): ");
	double  suhu  =  scanner.nextDouble();

	System.out.print("Masukkan kelembapan (%): ");
	int  kelembapan  =  scanner.nextInt();

	System.out.print("Masukkan CO2 (ppm): ");
	int  co2  =  scanner.nextInt();
```
- Suhu dalam bentuk tipe data `double`, memungkinkan nilai inputan berupa bilangan desimal.
- Kelembapan dan CO₂ dalam bentuk tipe data `int`, yang berarti hanya menerima bilangan bulat.

-**Menampilkan Data Sensor Awal**
```java
	System.out.println("\n------------------------");
	System.out.println("--- DATA SENSOR AWAL ---");
	System.out.println("------------------------");
	System.out.println("Suhu: "  +  suhu  +  " °C");
	System.out.println("Kelembapan: "  +  kelembapan  +  " %");
	System.out.println("CO2: "  +  co2  +  " ppm");
	System.out.println();
```
- digunakan untuk menampilkan kembali data sensor yang telah diinput oleh pengguna saat awal pemrograman dimulai. Dengan begitu, pengguna dapat melihat data asli sebelum konversi dijalankan.

-**Konversi Data ke Biner dan Heksadesimal**
```java
	//Konversi Suhu
	System.out.println("1. Suhu ("  + (int)suhu  +  " °C)");
	int  suhuInt  = (int)(suhu);
	System.out.print(" Biner: ");
	printBiner(suhuInt);
	System.out.print(" Hexa : ");
	printHexa(suhuInt);  

	// Konversi Kelembapan
	System.out.println("2. Kelembapan ("  +  kelembapan  +  " %)");
	System.out.print(" Biner: ");
	printBiner(kelembapan);
	System.out.print(" Hexa : ");
	printHexa(kelembapan);

	// Konversi CO2
	System.out.println("3. CO2 ("  +  co2  +  " ppm)");
	System.out.print(" Biner: ");
	printBiner(co2);
	System.out.print(" Hexa : ");
	printHexa(co2);
	}
```
- Setiap data sensor akan diubah terlebih dahulu menjadi tipe data`int` agar bilangan bulatnya saja yang dikonversi, lalu dilakukan pemanggilan metode `printBiner` dan `printHexa`.
- Proses ini dilakukan di setiap variabel suhu, kelembapan, dan CO₂.

-**Metode `printBiner(int n)`** 
```java
	public  static  void  printBiner(int  n) {
		if (n  ==  0) {
			System.out.println("0");
			return;
		}

		int[] biner  =  new  int[32];
		int  i  =  0;

		while (n  >  0) {
			biner[i] =  n  %  2;
			n  =  n  /  2;
			i++;
		}

		for (int  j  =  i  -  1; j  >=  0; j--) {
			System.out.print(biner[j]);
		}
		System.out.println();
		}
```
Metode ini akan melakukan konversi bilangan desimal ke bilangan biner :
-   Inisialisasi Array `biner` digunakan untuk menyimpan nilai biner hasil konversi.
-    Perulangan konversi akan membagi bilangan `n` dengan 2 secara berulang-ulang. Lalu, akan menyimpan hasil sisa bagi (`n % 2`) ke dalam array `biner` hingga `n` habis menjadi nol.
-  Setelah konversi selesai, array `biner` ditampilkan terbalik (dari belakang ke depan) untuk menghasilkan angka biner dengan benar.

-**Metode `printHexa(int n)`**
```java	
	public  static  void  printHexa(int  n) {
		if (n  ==  0) {
			System.out.println("0");
			return;
		}

		char[] hexa  =  new  char[100];
		int  i  =  0;

		while (n  !=  0) {
			int  temp  =  n  %  16;
			if (temp  <  10) {
				hexa[i] = (char)(temp  +  48);
			} else {
				hexa[i] = (char)(temp  +  55);
			}
			i++;
			n  =  n  /  16;
		}

		for (int  j  =  i  -  1; j  >=  0; j--) {
			System.out.print(hexa[j]);
		}
		System.out.println();
	}
}
```
Metode ini akan melakukan konversi bilangan desimal  ke bilangan heksadesimal dan menampilkannya.
- Inisialisasi Array`hexa` digunakan untuk menyimpan hasil konversi dari `n` setelah dibagi 16.
- Perulangan Konversi digunakan untuk membagi bilanagan nilai `n` dengan 16 secara berulang-ulang. Lalu, akan menyimpan hasil sisa bagi (`n % 16`) ke dalam array `hexa`. Jika sisa bagi kurang dari 10, dikonversi ke karakter '0' hingga '9'. Jika lebih, sisa bagi dikonversi ke karakter 'A' hingga 'F'.
- Output  Array `hexa` akan ditampilkan dari belakang ke depan sehingga menghasilkan bilangan hexadesimal dengan benar.


