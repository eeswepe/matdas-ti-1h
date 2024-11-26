
# Pembuktian dengan Induksi Matematika
## Nabil Hanief Mafazi
## TI-1H
## 244107020114


### 1. Pernyataan
P(n): 2 + 4 + 6 + \dots + 2n = n(n+1)

#### Langkah 1: Basis Induksi
Untuk \( n = 1 \):

P(1) = 2 = 1(1+1) = 2

Pernyataan benar untuk \( n = 1 \).

#### Langkah 2: Hipotesis Induksi
Misalkan pernyataan benar untuk \( n = k \):

2 + 4 + 6 + \dots + 2k = k(k+1)


#### Langkah 3: Bukti untuk \( n = k+1 \)
Kita tambahkan suku berikutnya \( 2(k+1) \) ke jumlah hipotesis:

2 + 4 + 6 + \dots + 2k + 2(k+1) = k(k+1) + 2(k+1)


= (k+1)(k + 2)

Jadi, pernyataan benar untuk \( n = k+1 \).

#### Kesimpulan
Dengan induksi matematika, pernyataan \( P(n): 2 + 4 + 6 + \dots + 2n = n(n+1) \) benar untuk \( n \geq 1 \).

---

### 2. Pernyataan

P(n): 1 + 4 + 9 + \dots + n^2 = \frac{1}{6}n(n+1)(2n+1)


#### Langkah 1: Basis Induksi
Untuk \( n = 1 \):

P(1) = 1 = \frac{1}{6}(1)(1+1)(2(1)+1) = \frac{1}{6}(1)(2)(3) = 1

Pernyataan benar untuk \( n = 1 \).

#### Langkah 2: Hipotesis Induksi
Misalkan pernyataan benar untuk \( n = k \):

1 + 4 + 9 + \dots + k^2 = \frac{1}{6}k(k+1)(2k+1)


#### Langkah 3: Bukti untuk \( n = k+1 \)
Kita tambahkan suku berikutnya \( (k+1)^2 \):

1 + 4 + 9 + \dots + k^2 + (k+1)^2 = \frac{1}{6}k(k+1)(2k+1) + (k+1)^2

Faktorkan \( (k+1) \):

= \frac{1}{6}(k+1)\left[k(2k+1) + 6(k+1)\right]


= \frac{1}{6}(k+1)\left[2k^2 + k + 6k + 6\right]


= \frac{1}{6}(k+1)\left[2k^2 + 7k + 6\right]

Faktorkan ekspresi dalam kurung:

= \frac{1}{6}(k+1)(k+2)(2k+3)

Sama dengan bentuk \( P(k+1) \).

#### Kesimpulan
Dengan induksi matematika, pernyataan \( P(n): 1 + 4 + 9 + \dots + n^2 = \frac{1}{6}n(n+1)(2n+1) \) benar untuk \( n \geq 1 \).

---

### 3. Pernyataan

P(n): 2 + 6 + 12 + \dots + n(n+1) = \frac{1}{3}n(n+1)(n+2)


#### Langkah 1: Basis Induksi
Untuk \( n = 1 \):

P(1) = 2 = \frac{1}{3}(1)(1+1)(1+2) = \frac{1}{3}(1)(2)(3) = 2

Pernyataan benar untuk \( n = 1 \).

#### Langkah 2: Hipotesis Induksi
Misalkan pernyataan benar untuk \( n = k \):

2 + 6 + 12 + \dots + k(k+1) = \frac{1}{3}k(k+1)(k+2)


#### Langkah 3: Bukti untuk \( n = k+1 \)
Tambahkan suku berikutnya \( (k+1)(k+2) \):

2 + 6 + 12 + \dots + k(k+1) + (k+1)(k+2) = \frac{1}{3}k(k+1)(k+2) + (k+1)(k+2)

Faktorkan \( (k+1)(k+2) \):

= \frac{1}{3}(k+1)(k+2)\left[k + 3\right]


= \frac{1}{3}(k+1)(k+2)(k+3)

Sama dengan bentuk \( P(k+1) \).

#### Kesimpulan
Dengan induksi matematika, pernyataan \( P(n): 2 + 6 + 12 + \.... + n(n+1) = \frac{1}{3}n(n+1)(n+2) \) benar untuk \( n \geq 1 \).
