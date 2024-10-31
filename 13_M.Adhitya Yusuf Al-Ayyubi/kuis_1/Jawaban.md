## SOAL1.
PEMBUKTIAN:
  A. bahwa jika p benar, maka q tidak benar.
  B. bahwa q benar. Ini berarti p harus salah (karena jika p benar, q  tidak        akan benar). Jadi, p salah.
C. Karena p salah, ini berarti bahwa r juga harus salah (karena jika r benar, maka pakan benar). Jadi, r harus benar.
Kesimpulannya, argumen ini benar.

## SOAL 2.
(a) ~p → (p → q)
Tabel kebenaran untuk implikasi ini adalah sebagai berikut:

| p     | q     | ~p    | p → q | ~p → (p → q) |
|-------|-------|-------|-------|---------------|
| T     | T     | F     | T     | T             |
| T     | F     | F     | F     | T             |
| F     | T     | T     | T     | T             |
| F     | F     | T     | T     | T             |

Dari tabel di atas, kolom terakhir menunjukkan bahwa $$ ~p → (p → q) $$ selalu bernilai True. Oleh karena itu, ini adalah tautologi.

(b) ~(p → q) → ~q

Tabel kebenaran untuk implikasi ini adalah sebagai berikut:

| p     | q     | p → q | ~(p → q) | ~q    | ~(p → q) → ~q |
|-------|-------|-------|----------|-------|----------------|
| T     | T     | T     | F        | F     | T              |
| T     | F     | F     | T        | T     | T              |
| F     | T     | T     | F        | F     | T              |
| F     | F     | T     | F        | T     | T              |

Dari tabel di atas, kolom terakhir menunjukkan bahwa $$ ~(p → q) → ~q $$ selalu bernilai True. Oleh karena itu, ini juga adalah tautologi.

(c) (p ∧ q) → (p → q)

Tabel kebenaran untuk implikasi ini adalah sebagai berikut:

| p     | q     | p ∧ q | p → q  | (p ∧ q) → (p → q) |
|-------|-------|-------|--------|---------------------|
| T     | T     | T     | T      | T                   |
| T     | F     | F     | F      | T                   |
| F     | T     | F     | T      | T                   |
| F     | F     | F     | T      | T                   |

Dari tabel di atas, kolom terakhir menunjukkan bahwa $$ (p ∧ q) → (p → q) $$ selalu bernilai True. Oleh karena itu, ini juga adalah tautologi.
Kesimpulan:
Semua tiga implikasi adalah tautologi berdasarkan analisis tabel kebenaran yang telah disusun.

## SOAL 3.
Notasi Himpunan
U = himpunan mahasiswa
P = himpunan mahsiswa yang nilai ujian UTS di atas 80
Q = himpunan mahasiswa yang nilai ujian UAS diatas 80
maka notasinya :
A = P∩Q
B = (P∪Q)-(P∩Q)
C = U-(P∪Q)

## SOAL 4.
![enter image description here](https://i.postimg.cc/85rcJyYV/Cuplikan-layar-2024-09-25-135810.png)
## SOAL 5.
Nilai Irisan:
Dari himpunan A dan C yang diberikan:

-   A={1,2,5,6,7,11,12,13,15,18,20}
    
-   C={1,2,3,6,8,9,10,13,17,18}
    
    Elemen yang beririsan dari kedua Himpunan Tersebut adalah
    
    A∩C={1,2,6,13,18}
