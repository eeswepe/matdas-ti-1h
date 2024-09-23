# Algoritma Trial Division

Algoritma trial division adalah metode sederhana untuk menentukan apakah suatu bilangan bulat n adalah bilangan prima atau tidak. Algoritma ini bekerja dengan membagi n dengan semua bilangan bulat dari 2 hingga akar kuadrat n.

## Penjelasan Cara Kerja Algoritma Trial Division
1. Inisialisasi Himpunan Pembagi Potensial
    -   Tentukan himpunan pembagi potensial, yaitu bilangan-bilangan yang dapat membagi n tanpa sisa. Himpunan ini terdiri dari semua bilangan prima dari 2 hingga √n.
    -   Pembagi potensial hanya dipilih dari bilangan prima karena bilangan komposit sudah mengandung faktor bilangan prima yang lebih kecil, sehingga tidak perlu dicek lagi.
2. Pengecekan Awal
    -   Jika n <= 1, maka n bukan bilangan prima.
    -   Jika n adalah 2 dan 3, maka n adalah bilangan prima.
    -   jika n habis dibagi oleh 2 atau 3, maka n bukan bilangan prima.
3. Membentuk Himpunan Pembagi Potensial
    -   Misal n = 29, tentukan √n = 5.
    -   Himpunan pembagi potensial : {2,3,5}.
    -   Jika kita ingin lebih efisien, bisa langsung menggunakan bilangan prima dalam kisaran ini.
4. Pengencekan Bilangan dalam Himpunan :
    -   Untuk setiap elemen dalam himpunan pembagi potensial, periksa apakah n habis digabi elemen tersebut
    -   Jika ditemukan elemen yang dapat membagi n tanpa sisa, maka n bukan bilangan prima.
    -   Jika tidak ada elemen yang bisa membagi n, maka n adalah bilangan prima.

## Pseudocode Algoritma Trial Division

// Fungsi untuk mengecek apakah suatu bilangan adalah prima dengan himpunan pembagi
boolean isPrime(int n) {
    // Jika n kurang dari atau sama dengan 1, maka bukan bilangan prima
    if (n <= 1) {
        return false;
    }
    
    // Jika n adalah 2 atau 3, maka n adalah bilangan prima
    if (n == 2 || n == 3) {
        return true;
    }
    
    // Jika n habis dibagi 2 atau 3, maka n bukan bilangan prima
    if (n % 2 == 0 || n % 3 == 0) {
        return false;
    }
    
    // Inisialisasi himpunan pembagi potensial dengan bilangan prima dari 2 hingga sqrt(n)
    Set<Integer> divisors = new HashSet<>();
    int limit = (int) Math.sqrt(n);
    for (int i = 2; i <= limit; i++) {
        if (isPrimeHelper(i)) {
            divisors.add(i);
        }
    }
    
    // Cek apakah ada pembagi dalam himpunan yang bisa membagi n
    for (int divisor : divisors) {
        if (n % divisor == 0) {
            return false;  // n bukan bilangan prima
        }
    }
    
    return true;  // n adalah bilangan prima
}

// Fungsi bantu untuk memeriksa apakah suatu bilangan adalah prima
boolean isPrimeHelper(int x) {
    if (x <= 1) {
        return false;
    }
    for (int i = 2; i * i <= x; i++) {
        if (x % i == 0) {
            return false;
        }
    }
    return true;
}

## Contoh Penggunaan Trial Division

public class TrialDivision {
    // Fungsi untuk memeriksa apakah sebuah bilangan adalah prima
    public static boolean isPrime(int n) {
        // Pengecekan awal
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        // Cek pembagi potensial dari 5 hingga sqrt(n)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Contoh penggunaan algoritma trial division
        int[] testNumbers = {29, 35, 2, 97, 49};
        
        for (int n : testNumbers) {
            if (isPrime(n)) {
                System.out.println(n + " adalah bilangan prima.");
            } else {
                System.out.println(n + " bukan bilangan prima.");
            }
        }
    }
}

# Studi Kasus: Mengecek Jumlah Gol Tim Sepak Bola

## Masalah
Sebuah tim sepak bola mencetak sejumlah gol dalam beberapa pertandingan. Kita ingin mengecek apakah jumlah gol yang dicetak di setiap pertandingan adalah bilangan prima. Hal ini berguna untuk analisis performa tim dan melihat apakah mereka mencetak gol "istimewa" (bilangan prima).

## Data Masukan
Daftar jumlah gol yang dicetak oleh tim dalam beberapa pertandingan:

Pertandingan 1  :   3 gol  
Pertandingan 2  :   4 gol  
Pertandingan 3  :   5 gol  
Pertandingan 4  :   8 gol  
Pertandingan 5  :   13 gol  
Pertandingan 6  :   14 gol  
Pertandingan 7  :   17 gol  

## Algoritma Pengecekan Jumlah Gol
Langkah-langkah Algoritma

Inisialisasi Daftar Jumlah Gol:
Buat daftar yang berisi jumlah gol yang dicetak oleh tim dalam setiap pertandingan, misalnya:

                                 (A = {3, 4, 5, 8, 13, 14, 17})

1. Pertandingan 1 (3 gol)  
    - (n = 3)  
    - 3 adalah bilangan prima  
    - Masukkan ke himpunan (P) : (P = {3})  

2. Pertandingan 2 (4 gol)
    - (n = 4)
    - 4 habis dibagi 2, jadi bukan bilangan prima
    - Masukkan ke himpunan (N) : (N = {4})

3. Pertandingan 3 (5 gol)
    - (n = 5)
    - Tidak habis dibagi 2 atau 3, tidak ada pembagian hingga akar kuadrat 5, maka 5 adalah bilangan prima
    - Masukkan ke himpunan (P) : (P = {3,5})

4. Pertandingan 4 (8 gol)
    - (n = 8)
    - 8 habis dibagi 2, jadi bukan bilangan prima
    - Masukkan ke himpunan (N) : (N = {4,8})

5. Pertandingan 5 (13 gol)
    - (n = 13)
    - Tidak habis dibagi 2 atau 3, tidak ada pembagi hingga akar kuadrat 13, maka 13 adalah bilangan prima
    - Masukkan ke himpunan (P) : (P = {3,5,13})

6. Pertandingan 6 (14 gol)
    - (n = 14)
    - 14 habis dibagi 2, jadi bukan bilangan prima
    - Masukkan ke himpunan (N) : (N = {4,8,14})

7. Pertandingan 7 (17 gol)
    - (n = 17)
    - Tidak habis dibagi 2 atau 3, tidak ada pembagi hingga akar kuadrat 17, maka 17 adalah bilangan prima
    - Masukkan ke himpunan (P) : (P = {3,5,13,17})

Hasil Akhir
    - Himpunan bilangan prima (P) (gol istimewa) adalah (P = {3,5,13,17})
    - Himpunan bilangan non-prima (N) (gol biasa) adalah (N = {4,8,14})