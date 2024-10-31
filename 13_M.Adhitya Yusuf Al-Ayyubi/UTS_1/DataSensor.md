# DATA SENSOR #
```
System.out.print("Masukkan suhu (°C): ");
    int suhu = (int) scanner.nextDouble();
    System.out.print("Masukkan kelembapan (%): ");
    int kelembapan = scanner.nextInt();
    System.out.print("Masukkan CO2 (ppm): ");
    int co2 = scanner.nextInt();
```
kode di atas berfungsi untuk menerima inputan yg akan di masukkan oleh pengguna.

```
public static void cetakBinar(int number) {
    int[] binar = new int[32];
    int index = 0;
```
Deklarasi Array untuk Menyimpan Hasil Biner:  
``int[] binar = new int[32];`` - Array ``binar`` berukuran 32 bit untuk menyimpan representasi biner angka (32 bit karena tipe ``int`` di Java berukuran 32 bit).  
``int index = 0;`` - Variabel ``index`` untuk melacak posisi dalam array.  

```
    if (number == 0) {
        System.out.print("0");
        return;
    }

    while (number > 0) {
        binar[index++] = number % 2;
        number /= 2;
    }
```
Proses Konversi:  
``if (number == 0)`` - Kondisi untuk menampilkan 0 jika nilai input adalah 0.  
``binar[index++] = number % 2;`` - Mengambil bit paling kanan dari ``number`` dengan operasi modulus ``number % 2``. Jika hasilnya 0, bit bernilai 0; jika hasilnya 1, bit bernilai 1. Nilai bit disimpan di ``binar``.  
``number /= 2;`` - Membagi ``number`` dengan 2, menggeser bit ke kiri.  

```
    for (int i = index - 1; i >= 0; i--) {
        System.out.print(binar[i]);
    }
}
```
Karena array ``binar`` diisi dari indeks paling kiri, cetakan harus dimulai dari indeks terakhir untuk mendapatkan urutan biner yang benar.  
```
public static void cetakHexadesimal(int number) {
    char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    char[] hexArray = new char[8];
    int index = 0;
```
Deklarasi Array untuk Heksadesimal:  
``char[] hexChars`` - Array ``hexChars`` menyimpan karakter heksadesimal (0–9 dan A–F).  
``char[] hexArray`` - Array untuk menyimpan hasil konversi heksadesimal hingga 8 digit (cukup untuk tipe ``int``).  
``int index`` - Untuk melacak posisi dalam array ``hexArray``.  
```
    if (number == 0) {
        System.out.print("0");
        return;
    }

    while (number > 0) {
        hexArray[index++] = hexChars[number % 16];
        number /= 16;
    }
```
Proses Konversi ke Heksadesimal:  
``hexArray[index++] = hexChars[number % 16];`` - Menggunakan operasi modulus ``number % 16`` untuk mendapatkan sisa hasil bagi ``number`` terhadap 16, yang menentukan digit heksadesimal.  
``number /= 16;`` - Membagi ``number`` dengan 16 untuk mendapatkan digit berikutnya.  
```
    for (int i = index - 1; i >= 0; i--) {
        System.out.print(hexArray[i]);
    }
}
```
Mirip dengan proses pada array ``binar``, hasil heksadesimal harus dicetak dari indeks terakhir untuk mendapatkan urutan yang benar.  
```
System.out.println("\nKonversi Suhu (°C): " + suhu);
        System.out.print("Biner: ");
        cetakBinar(suhu);
        System.out.print("\nHeksadesimal: ");
        cetakHexadesimal(suhu);

        System.out.println("\n\nKonversi Kelembapan (%): " + kelembapan);
        System.out.print("Biner: ");
        cetakBinar(kelembapan);
        System.out.print("\nHeksadesimal: ");
        cetakHexadesimal(kelembapan);

        System.out.println("\n\nKonversi CO2 (ppm): " + co2);
        System.out.print("Biner: ");
        cetakBinar(co2);
        System.out.print("\nHeksadesimal: ");
        cetakHexadesimal(co2);

        scanner.close();
```
kode program di atas digunakan untuk menampilkan hasil output program tersebut.