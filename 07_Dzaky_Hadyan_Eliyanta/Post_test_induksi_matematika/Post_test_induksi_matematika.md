# Dzaky Hadyan Eliyanta/244107020117  
## Post Test Induksi Matematika  
# 1. $P(n) = 2 + 4 + 6 + ... + 2n = n(n + 1)$  
  
## Penyelesaian:  
- *Basis Induksi:*  
Untuk $n = 1$ atau $P(1)$ kita peroleh $2 * 1 = 1(1 + 1)$.  
Ini jelas benar sebab $2 * 1 = 1(1 + 1)$  
$2 = 2$  
*quod erat demonstrandum*  
  
- *Langkah Induksi:*  
Kita harus memperlihatkan bahwa P(n + 1) juga benar, yaitu  
$P(n) = ... + 2n = n(n + 1)$  
$P(n + 1) = ... + 2n + 2(n + 1) = (n+1)((n + 1) + 1)$  
$P(n + 1) = P(n) + 2(n + 1) = (n+ 1)((n + 1) + 1)$  
$P(n + 1) = n(n + 1) + 2(n + 1) = (n + 1)((n + 1) + 1)$  
$P(n + 1) = n^2 + n + 2n + 2 = n^2 + n + 2n + 2$  
$P(n + 1) = n^2 + 3n + 2 = n^2 + 3n + 2$  
*quod erat demonstrandum*  
  
# 2. $P(n) = 1 + 4 + 9 + ... + n^2 = ⅙n(n + 1)(2n + 1)$  
## Penyelesaian:  
- *Basis Induksi:*  
Untuk $n = 1$ atau $P(1)$ kita peroleh $1^2 = ⅙ * 1(1 + 1)(2 * 1 + 1)$.  
$1 = ⅙(2)(3)$  
$1 = 1$  
*quod erat demonstrandum*  
  
- *Langkah Induksi:*  
Kita harus memperlihatkan bahwa $P(n + 1)$ juga benar, yaitu  
$P(n) = ... + n^2 = ⅙n(n + 1)(2n + 1)$  
$P(n) = ... + n^2 = n(2n^2 + 3n + 1)/_6$  
$P(n) = ... + n^2 = n^3/_3 + n^2/_2 + n/_6$  
$P(n + 1) = ... + n^2 + (n + 1)^2 = ⅙(n + 1)((n + 1) + 1)(2(n + 1) + 1)$  
$P(n + 1) = ... + n^2 + n^2 + 2n + 1 = ⅙(n + 1)(2n^2 + 4n + 3n + 6)$  
$P(n + 1) = n^3/_3 + n^2/_2 + n/_6 + n^2 + 2n + 1 = n^3/_3 + 3n^2/_2 + 13n/_6 + 1$  
$P(n + 1) = n^3/_3 + 3n^2/_2 + 13n/_6 = n^3/_3 + 3n^2/_2 + 13n/_6 + 1$  
*quod erat demonstrandum*  
  
# 3. $P(n) = 2 + 6 + 12 + ... + n(n + 1) = ⅓n(n + 1)(n + 2)$  
## Penyelesaian:   
- *Basis Induksi:*  
Untuk $n = 1$ atau $P(1)$ kita peroleh $1(1 + 1) = ⅓ * 1(1 + 1).$  
$2 = ⅓ * 2$  
$2 = 2$  
*quod erat demonstrandum*  
  
- *Langkah Induksi:*  
Kita harus memperlihatkan bahwa $P(n + 1)$ juga benar, yaitu  
$P(n) = ... + n(n + 1) = ⅓n(n + 1)(n + 2)$  
$P(n) = ... + n(n + 1) = n(n^2 + 3n + 2)/_3$  
$P(n) = ... + n(n + 1) = n(n^2 + 3n + 2)/_3$  
$P(n) = ... + n(n + 1) = n^3/_3 + n^2 + 2n/_3$  
$P(n + 1) = ... + n(n + 1) + (n + 1)((n + 1) + 1) = ⅓(n + 1)((n + 1) + 1)((n + 1) + 2)$  
$P(n + 1) = n^3/_3 + n^2 + 2n/_3 + (n^2 + 2n + 1 + n + 1) = (n/_3 + 1/_3)(n + 2)(n + 3)$  
$P(n + 1) = n^3/_3 + 2n^2 + 11n/_3 + 2 = (n/_3 + 1/_3)(n^2 + 5n + 6)$  
$P(n + 1) = n^3/_3 + 2n^2 + 11n/_3 + 2 = n^3/_3 + 5n^2/_3 + 2n + n^2/_3 + 5n/_3 + 2$  
$P(n + 1) = n^3/_3 + 2n^2 + 11n/_3 + 2 = n^3/_3 + 2n^2 + 2n + 11n/_3 + 2$  
*quot erat demonstrandum*