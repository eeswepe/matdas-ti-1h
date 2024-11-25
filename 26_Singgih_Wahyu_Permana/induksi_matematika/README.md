# Induksi Matematika
Nama: Singgih Wahyu Permana
NIM: 244107020102
Kelas: TI 1H
---
## Pembuktian Rumus
### `1. P(n) = 2 + 4 + 6 + ... + 2n = n(n+1)`
Untuk membuktikan formula tersebut, kita harus mensubtitusikan nilai `n+1` kepada nilai n, untuk mendapatkan persamaan ke-2
```
P(n+1) = 2 + 4 + 6 + ... + 2n + (2n+2) = n+1 (n+1) + 1
P(n+1) = 2 + 4 + 6 + ... + 2n + (2n+2) = n^2 + 3n + 2
```
berdasarkan persamaan yang diperoleh melalui subtitusi tersebut, kita dapat menggantikan nilai ` 2 + 4 + 6 + ... + 2n ` dengan `n(n+1)`, Sehingga diperoleh
```
P(n+1) = n(n+1) + (2n+2) = n^2 + 3n + 2
P(n+1) = (n^2+n) + (2n+2) = n^2 + 3n + 2
P(n+1) = n^2 + 3n + 2 = n^2 + 3n + 2
```
setelah kedua ruas dari persamaan tersebut sama, maka dapat dikatakan bahwa rumus tersebut benar

---

### `2. P(n) = 1 + 4 + 9 + ... + n^2 = 1/6 n (n+1)(2n+1)`
Untuk membuktikan formula tersebut, kita harus mensubtitusikan nilai `n+1` kepada nilai n, untuk mendapatkan persamaan ke-2
```
P(n+1) = 1 + 4 + 9 + ... + n^2 + (n^2+2n+1) = 1/6(n+1)(n+1+1)(2n+2+1)
P(n+1) = 1 + 4 + 9 + ... + n^2 + (n^2+2n+1) = 1/6(n+1)(n+2)(2n+3)
```
berdasarkan persamaan yang diperoleh melalui subtitusi tersebut, kita dapat menggantikan nilai ` 1 + 4 + 9 + ... + n^2 ` dengan `1/6 n (n+1)(2n+1)`, Sehingga diperoleh
```
P(n+1) = 1/6n(n+1)(2n+1) + (n+1)^2 = 1/6(n+1)(n+2)(2n+3)
P(n+1) = 1/6n(n+1)(2n+1) + (n+1)(n+1) = 1/6(n+1)(n+2)(2n+3)
```
kita dapat menghilangkan `(n+1)` dengan membagi setiap ruas dengan `(n+1)` hingga dihasilkan persamaan
```
P(n+1) = 1/6n(2n+1)(1) + (n+1)(1)= 1/6(n+2)(2n+3)(1)
```
untuk menghilangkan pecahan `1/6` kita dapat mengalikan setiap ruas dengan `6` hingga dihasilkan persamaan 
```
P(n+1) = n(2n+1) + 6(n+1) = (n+2)(2n+3)
P(n+1) = 2n^2+7n+6 = 2n^2+7n+6 
```
setelah kedua ruas dari persamaan tersebut sama, maka dapat dikatakan bahwa rumus tersebut benar

---
### `3. P(n) = 2 + 6 + 12 + ... + n(n+1) = 1/3 n(n+1)(n+2)`
Untuk membuktikan formula tersebut, kita harus mensubtitusikan nilai `n+1` kepada nilai n, untuk mendapatkan persamaan ke-2
```
P(n+1) = 2 + 6 + 12 + ... + n(n+1) + (n+1)(n+1+1) = 1/3 (n+1)(n+2)(n+3)
P(n+1) = 2 + 6 + 12 + ... + n(n+1) + (n+1)(n+2) = 1/3 (n+1)(n+2)(n+3)
```
berdasarkan persamaan yang diperoleh melalui subtitusi tersebut, kita dapat menggantikan nilai ` 2 + 6 + 12 + ... + n(n+1) ` dengan `1/3 n(n+1)(n+2)`, Sehingga diperoleh
```
P(n+1) = 1/3 n(n+1)(n+2) + (n+1)(n+2) = 1/3 (n+1)(n+2)(n+3)
```
kita dapat menghilangkan `(n+1)(n+2)` dengan membagi setiap ruas dengan `(n+1)(n+2)`, Sehingga diperoleh:
```
P(n+1) = 1/3 n(1) + (1) = 1/3 (n+3)(1)
```
untuk menghilangkan pecahan `1/3` kita dapat mengalikan setiap ruas dengan `3`, sehingga diperoleh
```
P(n+1) = n+3 = n+3
```
setelah kedua ruas dari persamaan tersebut sama, maka dapat dikatakan bahwa rumus tersebut benar

---
Made by [@eeswepe](github.com/eeswepe)
