
# Pembuktian Induksi Matematika n≥1
Nama : Mochammad Rijal Dzaki Rifki Afifudin

No Absen : 14

NIM : 244107020240

## Post tes

***1. P(n) = 2+4+6+…+2n = n(n+1)***

    Basis induksi : (n = 1)
    -> P(n) = n(n+1)
    -> P(1) = 1(1+1)
    -> P(1) = 2 *(benar)*

    Langkah induksi :
    -> P(n) = 2+4+6+…+2n = n(n+1)
    -> P(n+1) = (n+1) ((n+1)+1) = (n+1) (n+2) = n² + n + 2n + 2
    -> P(n+1) = n(n+1) + 2(n+1)
    -> 2+4+6+…+2n+2(n+1) =  (n+1) (n+2) + 2(n+1) *(benar)*

***2. P(n) = 1+4+9+…+n² = 1/6 n(n+1)(2n+1)***

    Basis induksi : (n = 1)
    -> P(n) = 1/6 n(n+1)(2n+1)
    -> P(1) = 1/6 * 1(1+1)(2*1+1)
    -> P(1) = 1 *(benar)*

    Langkah induksi :
    -> P(n) = 1+4+9+…+n^2 = 1/6 n(n+1)(2n+1)
    -> P(n+1) = 1/6 (n+1)(n+2)(2n+3)
    -> P(n+1) = 1/6 (n+1)(2n^2+7n+6)
    -> p(n+1) = 1/6 (n+1)(2n^2+n+6n+6)
    -> P(n+1) = 1/6 (n+1)n(2n+1) + 6(n+1)
    -> P(n+1) = 1/6 n(n+1)(2n+1) + 6(n+1)
    -> 1+4+9+…+n^2+6(n+1) = 1/6 (n+1)(n+2)(2n+3) + 6(n+1) *(benar)*

***3. P(n) = 2+6+12+…+n(n+1)  = 1/3 n(n+1)(n+2)***

    Basis induksi : (n = 1)
    -> P(n) = 1/3 n(n+1)(n+2)
    -> P(1) = 1/3 1(1+1)(1+2)
    -> P(1) = 2 *(benar)*

    Langkah induksi :
    -> P(n) = 2+6+12+…+n(n+1)
    -> P(n) = 1/3 n(n+1)(n+2)
    -> P(n+1) = 1/3 (n+1)((n+1)+1)((n+1)+2)
    -> P(n+1) = 1/3 (n+1)(n+2)(n+3)
    -> P(n+1) = 1/3 (n+1)(n² + 5n + 6)
    -> P(n+1) = 1/3 (n+1)(n²+ 2n) + (3n + 6)
    -> P(n+1) = 1/3 n(n+1)(n+2) + 3(n+2)
    -> 2+6+12+…+n(n+1) + 3(n+2) = 1/3 n(n+1)(n+2) + 3(n+2) *(benar)*




**Kesimpulan:**

Karena ketiga pernyataan tersebut memenuhi ketiga langkah induksi matematika, maka dapat disimpulkan bahwa pernyataan-pernyataan tersebut benar untuk semua bilangan asli n ≥ 1.

