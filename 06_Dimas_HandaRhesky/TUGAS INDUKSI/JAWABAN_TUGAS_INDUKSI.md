
# Pembuktian Induksi Matematik

## Pernyataan 1
### \( P(n) = 2 + 4 + 6 + \ldots + 2n = n(n + 1) \)

**Basis Ingiduksi (n = 1):**
\[
P(1) = 2 = 1(1 + 1) = 1 \cdot 2 = 2
\]
Basis benar.

**Langkah Induksi:**
Misalkan \( P(k) \) benar untuk \( n = k \):
\[
P(k) = 2 + 4 + 6 + \ldots + 2k = k(k + 1)
\]
Kita perlu menunjukkan bahwa \( P(k + 1) \) juga benar:
\[
P(k + 1) = P(k) + 2(k + 1)
\]
Substitusi \( P(k) \):
\[
P(k + 1) = k(k + 1) + 2(k + 1) = (k + 1)(k + 1 + 2) = (k + 1)(k + 2)
\]
Sehingga,
\[
P(k + 1) = (k + 1)((k + 1) + 1) = (k + 1)(k + 2)
\]
Oleh karena itu, \( P(n) \) benar untuk semua \( n \geq 1 \).

---

## Pernyataan 2
### \( P(n) = 1 + 4 + 9 + \ldots + n^2 = \frac{1}{6} n(n + 1)(2n + 1) \)

**Basis Induksi (n = 1):**
\[
P(1) = 1 = \frac{1}{6} \cdot 1 \cdot (1 + 1) \cdot (2 \cdot 1 + 1) = \frac{1}{6} \cdot 1 \cdot 2 \cdot 3 = 1
\]
Basis benar.

**Langkah Induksi:**
Misalkan \( P(k) \) benar untuk \( n = k \):
\[
P(k) = 1 + 4 + 9 + \ldots + k^2 = \frac{1}{6} k(k + 1)(2k + 1)
\]
Kita perlu menunjukkan bahwa \( P(k + 1) \) juga benar:
\[
P(k + 1) = P(k) + (k + 1)^2
\]
Substitusi \( P(k) \):
\[
P(k + 1) = \frac{1}{6} k(k + 1)(2k + 1) + (k + 1)^2
\]
\[
= \frac{1}{6} k(k + 1)(2k + 1) + \frac{6(k + 1)^2}{6}
\]
\[
= \frac{1}{6} \left[ k(k + 1)(2k + 1) + 6(k + 1)^2 \right]
\]
\[
= \frac{1}{6} (k + 1) [k(2k + 1) + 6(k + 1)]
\]
\[
= \frac{1}{6} (k + 1) [2k^2 + k + 6k + 6] = \frac{1}{6} (k + 1)(2k^2 + 7k + 6)
\]
\[
= \frac{1}{6} (k + 1)(k + 2)(2k + 3)
\]
Oleh karena itu, \( P(n) \) benar untuk semua \( n \geq 1 \).

---

## Pernyataan 3
### \( P(n) = 2 + 6 + 12 + \ldots + n(n + 1) = \frac{1}{3} n(n + 1)(n + 2) \)

**Basis Induksi (n = 1):**
\[
P(1) = 2 = \frac{1}{3} \cdot 1 \cdot (1 + 1) \cdot (1 + 2) = \frac{1}{3} \cdot 1 \cdot 2 \cdot 3 = 2
\]
Basis benar.

**Langkah Induksi:**
Misalkan \( P(k) \) benar untuk \( n = k \):
\[
P(k) = 2 +
\]