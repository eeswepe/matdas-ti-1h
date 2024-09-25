# SOAL 1
Argumen tersebut adalah valid. Karena,
- Asumsikan kesimpulan salah ~r (negasi dari r)
- Dari premis kedua (~r → p) dan asumsi ~r, kita bisa menyimpulkan p (menggunakan modus ponens)
- Dari premis pertama (p → ~q) dan hasil langkah 2, kita bisa menyimpulkan
~q (menggunakan modus ponens lagi)
- Tetapi, kita memiliki premis ketiga q
~q (dari langkah 3) dan q (premis ketiga) membentuk kontradiksi
- Karena kita menemukan kontradiksi, asumsi awal kita (~r) harus salah
- Jika ~r salah, maka r harus benar

# SOAL 2
a. ~p → (p → q)
| p   | q   | ~p  | (p → q) | ~p → (p → q) |
|-----|-----|-----|---------|--------------|
| B   | B   | S   | B       | B            |
| B   | S   | S   | S       | B            |
| S   | B   | B   | B       | B            |
| S   | S   | B   | B       | B            |

b. ~(p → q) → ~q
| p   | q   | ∼q  | (p → q) | ∼(p → q) | ∼(p → q) → ∼q |
|-----|-----|-----|---------|----------|----------------|
| B   | B   | S   | B       | S        | B              |
| B   | S   | B   | S       | B        | B              |
| S   | B   | S   | B       | S        | S              |
| S   | S   | B   | B       | S        | B              |

c. (p ∧ q) → (p → q)
| p   | q   | (p ∧ q) | (p → q) | (p ∧ q) → (p → q) |
|-----|-----|---------|---------|-------------------|
| B   | B   | B       | B       | B                 |
| B   | S   | S       | S       | B                 |
| S   | B   | S       | B       | B                 |
| S   | S   | S       | B       | B                 |

# SOAL 3 
1. Mahasiswa yang mendapat nilai A (nilai UTS dan nilai UAS keduanya di atas 80):

    𝐴 = 𝑃 ∩ 𝑄

    Ini merupakan irisan antara himpunan P (mahasiswa dengan nilai UTS di atas 80) dan Q (mahasiswa dengan nilai UAS di atas 80).

2. Mahasiswa yang mendapat nilai B (salah satu ujian di atas 80, baik UTS atau UAS):

    𝐵 = (𝑃 ∪ 𝑄)∖(𝑃 ∩ 𝑄)

    Ini adalah himpunan gabungan P dan Q tetapi tanpa elemen irisan. Artinya, mahasiswa yang hanya salah satu dari nilainya yang di atas 80 (bukan keduanya).

3. Mahasiswa yang mendapat nilai C (nilai UTS dan UAS keduanya di bawah 80):

    𝐶 = 𝑈∖(𝑃 ∪ 𝑄)

    Ini adalah komplemen dari gabungan P dan Q terhadap himpunan U. Mahasiswa ini tidak termasuk di dalam himpunan P ataupun Q.

Jadi, notasi himpunan untuk tiap nilai mahasiswa adalah:

- A = 𝑃 ∩ 𝑄

- B = (𝑃 ∪ 𝑄)∖(𝑃 ∩ 𝑄)

- C = 𝑈∖(𝑃 ∪ 𝑄)


# SOAL 4
[![bidau.png](https://i.postimg.cc/4NzZkqYr/bidau.png)](https://postimg.cc/ykY20fXP)
A ∪ B = {a, p, o, t}

# SOAL 5
Cari elemen yang ada di kedua himpunan:

Elemen yang ada di 
𝐴 : 1, 2, 5, 6, 7, 11, 12, 13, 15, 18, 20
Elemen yang ada di 
𝐶 : 1, 2, 3, 6, 8, 9, 10, 13, 17, 18

Elemen yang sama di kedua himpunan adalah:
1, 2, 6, 13, 18

Maka, irisan dari himpunan 
𝐴 dan 𝐶 adalah:

𝐴 ∩ 𝐶 = {1, 2 , 6, 13, 18}