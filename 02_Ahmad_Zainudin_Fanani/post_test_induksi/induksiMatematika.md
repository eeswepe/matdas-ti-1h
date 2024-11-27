
## 1. P(n) = 2 + 4 + 6 + ... + 2n = n(n + 1)

### (i) Basis Induksi
Untuk n = 1, kita peroleh:  
P(1) = 2 × 1 = 1 × (1 + 1)  
P(1) = 2 = 2  
**(Terbukti)**

### (ii) Langkah Induksi
Misalkan P(n) = 2 + 4 + 6 + ... + 2n = n(n + 1) benar untuk n.  
Buktikan bahwa P(n+1) juga benar, yaitu:  
P(n+1) = 2 + 4 + 6 + ... + 2n + 2(n+1)

**Penjabaran:**
P(n+1) = P(n) + 2(n+1)  
P(n+1) = n(n + 1) + 2(n + 1)  
P(n+1) = n² + n + 2n + 2  
P(n+1) = n² + 3n + 2  
P(n+1) = (n + 1)(n + 2)

**Kesimpulan:**  
P(n+1) terbukti benar.  
jadi, pernyataan P(n) = n(n + 1) terbukti untuk semua n.

---

## 2. P(n) = 1 + 4 + 9 + ... + n² = (1/6) * n(n + 1)(2n + 1)

### (i) Basis Induksi
Untuk n = 1, kita peroleh:  
P(1) = 1² = (1/6) * 1(1 + 1)(2(1) + 1)  
P(1) = 1 = (1/6) * 1 * 2 * 3  
P(1) = 1 (Terbukti)

### (ii) Langkah Induksi
Misalkan P(k) = 1 + 4 + 9 + ... + k² = (1/6) * k(k + 1)(2k + 1) benar untuk k.  
Buktikan bahwa P(k+1) juga benar, yaitu:  
1 + 4 + 9 + ... + k² + (k + 1)² = (1/6) * (k + 1)(k + 2)(2(k + 1) + 1)

**Penjabaran:**
P(k+1) = P(k) + (k + 1)²  
P(k+1) = (1/6) * k(k + 1)(2k + 1) + (k + 1)²  
P(k+1) = (1/6) * (k + 1)(k + 2)(2k + 3)  

Dengan mengganti, kita peroleh:  
k(2k + 1) + 6(k + 1) = (k + 2)(2k + 3)  
k²(2k + 1) + k(2k + 1) + 6k + 6 = (k + 2)(2k + 3)  
2k² + k + 6k + 6 = 2k² + 7k + 6  

**Kesimpulan:**  
2k² + 7k + 6 = 2k² + 7k + 6 (Terbukti)

---

## 3. P(n) = 2 + 6 + 12 + ... + n(n+1) = (1/3) * n(n+1)(n+2)

### (i) Basis Induksi
Untuk n = 1, kita peroleh:  
P(1) = 2 + 6 + 12 + ... + 1(1+1) = (1/3) * 1(1+1)(1+2)  
P(1) = 2 + 6 + 12 + ... + 2 = (1/3) * 6  
P(1) = 2 + 6 + 12 + ... + 2 = 2 (Benar)

### (ii) Langkah Induksi
Misalkan P(n) = 2 + 6 + 12 + ... + n(n+1) = (1/3) * n(n+1)(n+2) benar untuk n.  
Buktikan bahwa P(n+1) juga benar, yaitu:  
P(n+1) = 2 + 6 + 12 + ... + n(n+1) + (n+1)((n+1)+1) = (1/3) * n(n+1)(n+2)

**Penjabaran:**
P(n+1) = P(n) + (n+1)(n+2)  
P(n+1) = (1/3) * n(n+1)(n+2) + (n+1)(n+2)  
P(n+1) = (n+1)(n+2) * (1/3n + 1)  
P(n+1) = (n+1)(n+2)(n+3)/3  
P(n+1) = (1/3) * (n+1)(n+2)(n+3)  
P(n+1) = (1/3) * (n+1)((n+1)+1)((n+1)+2) (Benar)

### Kesimpulan
jadi pernyataan P(n) = 2 + 6 + 12 + ... + n(n+1) = (1/3) * n(n+1)(n+2) terbukti benar untuk semua nilai n.

---
