# TUGAS MATDAS
#### Adam Bahy Maulana (244107020207) / TI 1H
##### INDUKSI MATEMATIKA (POST TEST)

---

### 1. P(n) = 1 + 3 + 5 + ... + (2n - 1) = n²
**i) Basis Induksi untuk n = 1**  
\[
P(1) = 1 = 1²
\]  
Benar, karena jumlah satu bilangan ganjil pertama adalah 1.

**ii) Langkah Induksi untuk n = n + 1**  
Misalkan pernyataan berlaku untuk \( n \), yaitu:  
\[
P(n) = 1 + 3 + 5 + ... + (2n - 1) = n²
\]  
Untuk \( n + 1 \), kita perlu membuktikan:  
\[
P(n+1) = 1 + 3 + 5 + ... + (2n - 1) + (2n + 1) = (n + 1)²
\]  
Substitusi \( P(n) \):  
\[
P(n+1) = n² + (2n + 1)
\]  
\[
P(n+1) = n² + 2n + 1 = (n + 1)²
\]  
Karena \( P(1) \) benar, dan \( P(n) \implies P(n+1) \) juga benar, maka terbukti \( P(n) \) benar untuk semua \( n \geq 1 \).

---

### 2. P(n) = 2⁰ + 2¹ + 2² + ... + 2ⁿ = 2ⁿ⁺¹ - 1
**i) Basis Induksi untuk n = 0**  
\[
P(0) = 2⁰ = 1 = 2¹ - 1
\]  
Benar.

**ii) Langkah Induksi untuk n = n + 1**  
Misalkan pernyataan berlaku untuk \( n \), yaitu:  
\[
P(n) = 2⁰ + 2¹ + 2² + ... + 2ⁿ = 2ⁿ⁺¹ - 1
\]  
Untuk \( n + 1 \), kita perlu membuktikan:  
\[
P(n+1) = 2⁰ + 2¹ + 2² + ... + 2ⁿ + 2ⁿ⁺¹ = 2ⁿ⁺² - 1
\]  
Substitusi \( P(n) \):  
\[
P(n+1) = (2ⁿ⁺¹ - 1) + 2ⁿ⁺¹
\]  
\[
P(n+1) = 2ⁿ⁺¹ + 2ⁿ⁺¹ - 1 = 2 × 2ⁿ⁺¹ - 1 = 2ⁿ⁺² - 1
\]  
Karena \( P(0) \) benar, dan \( P(n) \implies P(n+1) \) juga benar, maka terbukti \( P(n) \) benar untuk semua \( n \geq 0 \).

---

### 3. P(n) = 2 + 6 + 12 + ... + n(n + 1) = 1/3 n(n + 1)(n + 2)
**i) Basis Induksi untuk n = 1**  
\[
P(1) = 1(1 + 1) = 2
\]  
\[
1/3 × 1 × (1 + 1) × (1 + 2) = 2
\]  
Benar.

**ii) Langkah Induksi untuk n = n + 1**  
Misalkan pernyataan berlaku untuk \( n \), yaitu:  
\[
P(n) = 2 + 6 + 12 + ... + n(n + 1) = 1/3 n(n + 1)(n + 2)
\]  
Untuk \( n + 1 \), kita perlu membuktikan:  
\[
P(n+1) = 2 + 6 + 12 + ... + n(n + 1) + (n + 1)(n + 2) = 1/3 (n + 1)(n + 2)(n + 3)
\]  
Substitusi \( P(n) \):  
\[
P(n+1) = 1/3 n(n + 1)(n + 2) + (n + 1)(n + 2)
\]  
\[
P(n+1) = (n + 1)(n + 2) [1/3 n + 1]
\]  
\[
P(n+1) = (n + 1)(n + 2)(n/3 + 1) = 1/3 (n + 1)(n + 2)(n + 3)
\]  
Karena \( P(1) \) benar, dan \( P(n) \implies P(n+1) \) juga benar, maka terbukti \( P(n) \) benar untuk semua \( n \geq 1 \).

---

**Kesimpulan:** Semua pernyataan terbukti benar menggunakan metode induksi matematika.
