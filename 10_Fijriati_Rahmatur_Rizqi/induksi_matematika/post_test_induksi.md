# Fijriati Rahmatur Rizqi - 244107020069

### NOMOR 1

P(n) = 2 + 4 + 6 + ... + 2n = n(n+1)

Basis Induksi
untuk n = 1

```
P(1) = 2 + 4 + 6 + ... + 2(1) = 1(1+1)
     = 2 + 4 + 6 + ... + 2 = 1(2)
     =                   2 = 2
```

Hal ini menunjukkan ini benar karena 2 = 2

Langkah Induksi
Kita harus memperlihatkan bahwa P(n+1) juga benar, yaitu

```
P(n) = 2 + 4 + 6 + ... + 2n = n(n+1)
P(n+1) = 2 + 4 + 6 + ... + 2n + 2n + 2 = n(n+1) + 2n + 2
```

```
P(n) = n(n+1)
P(n+1) = (n+1)((n+1)+1)
       = (n+1)(n+2)
       = (n^2^ + 2n + 1n + 2)
       = (n^2^ + 3n + 2)
       = n(n+1) + 2n + 2
```

Karena langkah basis dan langkah induksi keduanya telah diperlihatkan benar maka P(n) dinyatakan benar

---

### NOMOR 2

P(n) = 1 + 4 + 9 + ... + n^2^ = 1/6n (n+1)(2n+1)

Basis Induksi
untuk n = 1

```
P(1) = 1 + 4 + 9 + ... + 1^2^ = 1/6(1) (1+1) (2(1) + 1)
     = 1 + 4 + 9 + ... + 1^2^ = 1/6 (2) (3)
     = 1 + 4 + 9 + ... + 1^2^ = 1/6 (6)
     =                   1^2^ = 1
```

Hal ini membuktikan basis induksi benar karena 1^2^ = 1

Langkah Induksi
Kita harus memperlihatkan bahwa P(n+1) juga benar, yaitu

```
P(n) = 1 + 4 + 9 + ... + n^2^ = 1/6n (n+1)(2n+1)
P(n+1) = 1 + 4 + 9 + ... + n^2^ + 6(n+1) = 1/6n (n+1)(2n+1) + 6(n+1)
```

```
P(n) = 1/6n (n+1)(2n+1)
P(n+1) = 1/6(n+1) ((n+1)+1)(2(n+1)+1)
       = 1/6(n+1) (n+2) (2n+3)
       = 1/6(n+1) 2n^2^ + 3n + 4n +6
       = 1/6(n+1) 2n^2^ + 7n + 6
       = 1/6(n+1) 2n^2^ + n + 6n + 6
       = 1/6(n+1) n(2n+1) + 6(n+1)
       = 1/6n(n+1)(2n+1) + 6(n+1)
```

Karena langkah basis dan langkah induksi keduanya telah diperlihatkan benar maka P(n) dinyatakan benar.

---

### NOMOR 3

P(n) = 2 + 6 + 12 + ... + n(n+1) = 1/3n(n+1)(n+2)

Basis Induksi
untuk n = 1

```
P(1) = 2 + 6 + 12 + ... + 1(1+1) = 1/3(1) (1+1) (1+2)
     = 2 + 6 + 12 + ... + 1(2) = 1/3(1) (2) (3)
     = 2 + 6 + 12 + ... + 2 = 1/3 (6)
     =                    2 = 2
```

Hal ini menunjukkan ini benar karena 2 = 2

Langkah Induksi
Kita harus memperlihatkan bahwa P(n+1) juga benar, yaitu

```
P(n) = 2 + 6 + 12 + ... + n(n+1) = 1/3n(n+1)(n+2)
P(n+1) = 2 + 6 + 12 + ... + n(n+1) + 3(n+2) = 1/3n(n+1)(n+2) + 3(n+2)
```

```
P(n) = 1/3n(n+1)(n+2)
P(n+1) = 1/3(n+1)((n+1)+1)((n+1)+2)
       = 1/3(n+1) (n+2) (n3)
       = 1/3(n+1) n^2^ + 3n + 2n + 6
       = 1/3(n+1) n(n+2) + 3(n+2)
       = 1/3n(n+1)(n+2) + 3(n+2)
```

Karena langkah basis dan langkah induksi keduanya telah diperlihatkan benar maka P(n) dinyatakan benar.
