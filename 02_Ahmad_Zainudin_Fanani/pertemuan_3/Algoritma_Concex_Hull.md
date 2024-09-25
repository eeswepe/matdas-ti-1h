# Algoritma Komputasi Geometri: Convex Hull dengan Algoritma Graham Scan

## Pendahuluan

Komputasi geometri adalah bidang ilmu komputer yang berfokus pada pemecahan masalah-masalah geometris menggunakan algoritma. Dalam banyak aplikasi praktis, seperti grafika komputer, sistem informasi geografis, robotika, dan rekayasa, sering kali diperlukan solusi untuk masalah-masalah seperti:
- Menentukan batas luar dari sekumpulan titik (*convex hull*),
- Mencari jarak terdekat antar titik,
- Menyelesaikan perpotongan antara objek geometris.

Salah satu masalah paling mendasar dalam komputasi geometri adalah membangun *convex hull*, yaitu poligon cembung terkecil yang mencakup semua titik dalam kumpulan tersebut. Salah satu algoritma yang efisien untuk menyelesaikan masalah ini adalah **Algoritma Graham Scan**.

## Apa itu Convex Hull?

Secara intuitif, convex hull dapat dibayangkan seperti meletakkan karet gelang di sekeliling paku yang tertancap pada papan. Karet tersebut akan melingkupi semua paku dan membentuk kontur luar dari kumpulan paku tersebut. Dalam geometri komputasi, convex hull dari sekumpulan titik adalah poligon cembung terkecil yang mencakup semua titik tersebut.


## Algoritma Graham Scan

Algoritma **Graham Scan** adalah salah satu metode untuk menemukan convex hull dari sekumpulan titik dalam dua dimensi. Algoritma ini bekerja dengan mengurutkan titik-titik berdasarkan sudut polar relatif terhadap sebuah titik referensi, kemudian memeriksa setiap titik secara berurutan untuk membentuk hull.

### Langkah-Langkah Algoritma Graham Scan:
1. **Menemukan titik acuan (P0)**: Pilih titik dengan koordinat y terendah. Jika terdapat lebih dari satu titik dengan koordinat y terendah, pilih titik dengan koordinat x terendah.
2. **Mengurutkan titik**: Urutkan titik-titik lain berdasarkan sudut polar relatif terhadap titik acuan P0.
3. **Membangun convex hull**: Lakukan pemindaian (scan) terhadap titik-titik yang telah diurutkan. Untuk setiap tiga titik berturut-turut, tentukan apakah mereka membentuk belokan ke kiri atau ke kanan. Jika belokan ke kanan, hapus titik tengah dari convex hull karena tidak dapat menjadi bagian dari poligon cembung.
4. **Mengembalikan hasil**: Setelah memproses semua titik, titik-titik yang tersisa membentuk convex hull.

### Pseudocode Algoritma Graham Scan

Berikut adalah pseudocode dari algoritma Graham Scan:

```plaintext
GRAHAM_SCAN(points):
    # Step 1: Temukan titik dengan y terendah
    P0 = titik dengan y terendah (jika ada tie, pilih yang x-nya terendah)
    
    # Step 2: Urutkan titik berdasarkan sudut polar relatif terhadap P0
    sorted_points = urutkan titik berdasarkan sudut polar dengan P0
    
    # Step 3: Inisialisasi stack untuk convex hull
    hull = stack kosong
    push P0, sorted_points[0], sorted_points[1] ke hull
    
    # Step 4: Proses titik-titik yang tersisa
    for i = 2 hingga n-1:
        while ukuran hull > 1 dan arah belokan dari 3 titik terakhir adalah ke kanan:
            pop dari hull
        push sorted_points[i] ke hull
    
    return hull
```

### Implementasi Graham Scan dalam Python

Untuk memahami lebih jauh, berikut adalah implementasi sederhana dari algoritma Graham Scan menggunakan Python:

```python
import math

# Fungsi untuk menentukan orientasi tiga titik
def orientation(p, q, r):
    val = (q[1] - p[1]) * (r[0] - q[0]) - (q[0] - p[0]) * (r[1] - q[1])
    if val == 0:
        return 0  # collinear
    elif val > 0:
        return 1  # clockwise
    else:
        return 2  # counterclockwise

# Fungsi untuk menghitung sudut polar antara dua titik
def polar_angle(p0, p1):
    return math.atan2(p1[1] - p0[1], p1[0] - p0[0])

# Algoritma Graham Scan
def graham_scan(points):
    # Step 1: Temukan titik dengan y terendah (P0)
    P0 = min(points, key=lambda p: (p[1], p[0]))
    
    # Step 2: Urutkan titik-titik berdasarkan sudut polar dengan P0
    sorted_points = sorted(points, key=lambda p: (polar_angle(P0, p), -p[1], p[0]))

    # Step 3: Inisialisasi convex hull dengan tiga titik pertama
    hull = [P0, sorted_points[0], sorted_points[1]]

    # Step 4: Proses titik-titik yang tersisa
    for p in sorted_points[2:]:
        while len(hull) > 1 and orientation(hull[-2], hull[-1], p) != 2:
            hull.pop()  # Hapus titik terakhir jika belokannya ke kanan
        hull.append(p)  # Tambahkan titik ke convex hull

    return hull

# Contoh penggunaan
points = [(0, 0), (1, 1), (2, 2), (2, 0), (1, 3), (3, 1)]
convex_hull = graham_scan(points)
print("Convex Hull:", convex_hull)
```

### Penjelasan Implementasi
1. **Fungsi `orientation`**: Menentukan apakah tiga titik membentuk belokan ke kiri, kanan, atau collinear. Nilai 0 menunjukkan bahwa tiga titik tersebut collinear, nilai 1 menunjukkan belokan searah jarum jam (*clockwise*), dan nilai 2 menunjukkan belokan berlawanan arah jarum jam (*counterclockwise*).
2. **Fungsi `polar_angle`**: Menghitung sudut polar antara dua titik berdasarkan perhitungan trigonometri.
3. **Algoritma Graham Scan**: Mengimplementasikan langkah-langkah yang dijelaskan dalam pseudocode di atas. Dimulai dengan memilih titik referensi (`P0`), kemudian mengurutkan titik-titik berdasarkan sudut polar, dan membangun convex hull menggunakan metode *scan*.

### Contoh Input dan Output
Misalkan kita memiliki kumpulan titik sebagai berikut:

```plaintext
points = [(0, 0), (1, 1), (2, 2), (2, 0), (1, 3), (3, 1)]
```

Ketika kita menjalankan algoritma Graham Scan pada titik-titik ini, hasilnya adalah:

```plaintext
Convex Hull: [(0, 0), (2, 0), (3, 1), (1, 3)]
```

Artinya, convex hull dari titik-titik tersebut terdiri dari empat titik `(0, 0)`, `(2, 0)`, `(3, 1)`, dan `(1, 3)`.

## Kompleksitas Waktu

Algoritma Graham Scan memiliki kompleksitas waktu sebesar **O(n log n)**, di mana *n* adalah jumlah titik dalam kumpulan. Kompleksitas ini terutama disebabkan oleh langkah pengurutan titik berdasarkan sudut polar. Setelah titik-titik diurutkan, langkah membangun convex hull membutuhkan waktu linier O(n).

## Kesimpulan

Algoritma Graham Scan adalah solusi yang efisien dan mudah diimplementasikan untuk masalah convex hull dalam dua dimensi. Algoritma ini sering digunakan dalam aplikasi seperti grafika komputer, perencanaan jalur robot, dan analisis spasial. Dengan kompleksitas O(n log n), algoritma ini cukup efisien untuk digunakan pada dataset berukuran sedang hingga besar.
```