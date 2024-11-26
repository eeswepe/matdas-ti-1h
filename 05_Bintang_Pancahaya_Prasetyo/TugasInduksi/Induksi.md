## Tugas Induksi Matematika

### Nama    : Bintang Pancahaya Prasetyo
### NIM     : 244107020115
### Jurusan : Teknologi Informasi
### Prodi   : D4 Teknik Informatika
### Kelas   : TI 1H

##

**Gunakan induksi matematik untuk membuktikan bahwa pernyataan berikut benar untuk n>=1**  

### 1. P(n) = 2 + 4 + 6 + ... + 2n = n(n+1) 
#### (i) Basis Induksi  
    Untuk n = 1
    P(n) = 2 + 4 + 6 + ... + 2n = n(n+1)
    P(1) = 2 + 4 + 6 + ... + 2(1) = 1(1+1)
    P(1) = 1(1+1)
    P(1) = 2 (benar)
#### (ii) Langkah Induksi
    P(n)    = 2 + 4 + 6 + ... + 2n = n(n+1)
    P(n+1)  = 2 + 4 + 6 + ... + 2n + 2(n+1) = n(n+1)
    P(n+1)  = P(n) + 2(n+1)
            = n(n+1) + 2(n+1)
            = n(n+1) + 2n + 2
            = n² + n + 2n + 2
            = n² + 3n + 2
            = (n+1)(n+2)
            = (n+1)[(n+1)+1] (benar)

### 2. P(n) = 1 + 4 + 9 + ... + n² = 1/6n(n+1)(2n+1)
#### (i) Basis Induksi 
    Untuk n = 1
    P(n) = 1 + 4 + 9 + ... + n² = 1/6n(n+1)(2n+1)
    P(1) = 1 + 4 + 9 + ... + 1² = 1/6(1)(1+1)(2(1)+1)
    P(1) = 1/6 * 6
    P(1) = 1 (benar)
#### (ii) Langkah Induksi
    P(n)    = 1 + 4 + 9 + ... + n² = 1/6n(n+1)(2n+1)
    P(n+1)  = 1 + 4 + 9 + ... + n² + (n+1)² = 1/6n(n+1)(2n+1)
    P(n+1)  = P(n) + (n+1)²
            = 1/6 n(n+1)(2n+1) + (n+1)²
            = 1/6(n+1)[n(2n+1) + 6(n+1)]
            = n(2n+1) + 6(n+1)
            = 2n² + n + 6n + 6
            = 2n² + 7n + 6
            = (n+2)(2n+3)
            = 1/6(n+1)(n+2)(2n+3)
            = 1/6(n+1)((n+1)+1)(2(n+1)+1) (benar)
### 3. P(n) = 2 + 6 + 12 + ... + n(n+1) = 1/3n(n+1)(n+2)
#### (i) Basis Induksi 
    Untuk n = 1
    P(n) = 2 + 6 + 12 + ... + n(n+1) = 1/3n(n+1)(n+2)
    P(1) = 2 + 6 + 12 + ... + 1(1+1) = 1/3 1(1+1)(1+2)
    P(1) = 2 + 6 + 12 + ... + 2 = 1/3 * 6
    P(1) = 2 + 6 + 12 + ... + 2 = 2 (benar)
#### (ii) Langkah Induksi
    P(n)    = 2 + 6 + 12 + ... + n(n+1) = 1/3n(n+1)(n+2)
    P(n+1)  = 2 + 6 + 12 + ... + n(n+1) + n+1((n+1)+1) = 1/3n(n+1)(n+2) 
    P(n+1)  = P(n) + (n+1)(n+2)
            = 1/3n(n+1)(n+2) + (n+1)(n+2)
            = (n+1)(n+2)(1/3n + 1)
            = (n+1)(n+2)(n+3)/3
            = 1/3(n+1)(n+2)(n+3)
            = 1/3(n+1)((n+1)+1)((n+1)+2) (benar)