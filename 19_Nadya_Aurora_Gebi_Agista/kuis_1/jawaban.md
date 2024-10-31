# QUIZ MATDAS 1

### NO. 1
Argumen nyata :
 -  Jika Saya pulang kampung,maka saya tidak bisa mengikuti ujian susulan.-> p , ->~q
 - Jika saya tidak lulus ujian,maka saya pulang kampung. ->~r , ->p
 - Tetapi saya bisa mengikuti ujian susulan. -> q
 - Oleh karena itu saya lulus ujian. -> r

Pembuktian : 
 - p -> ~q == q -> ~r (p -> ~q Setara dengan q -> ~r)
 - ~ r -> p == ~ p -> r ( ~ r -> p Setara dengan ~ p -> r )

karena ~ p ada pada 2 premis , maka keduanya dapat di hilangkan sehingga menghasilkan : 
q -> r
q

Oleh karena itu , dapat disimpulkan r.


### NO. 2
Berikut adalah tabel kebenaran untuk setiap implikasi 

##### (a) ~p → (p → q )

| p | q | ~p|p -> q | ~p -> (p -> q)|
|--|--|--|--|--|
| T | T | F| T| T|
| T | F | F| F| T|
| F | T | T| T| T|
| F | F | T| T| T|

Hasil : Pernyataan ini selalu benar (tautologi)


##### (b) ~(p →q) → ~q

| p | q | p->q|(p -> q) | ~q|(p->q)-> ~q |
|--|--|--|--|--|--|
| T | T | T| F| F| T |
| T | F | F| T| T| T |
| F | T | T| F| F| T |
| F | F | T| F| T| T |

Hasil : Pernyataan ini termasuk tautologi


##### (c) (p ∧ q) → (p → q)

| p | q | p ∧ q|p -> q | (p∧q)->(p->q)|
|--|--|--|--|--|
| T | T | T| T| T|
| T | F | F| F| T|
| F | T | F| T| T|
| F | F | F| T| T|


Hasil : Pernyataan ini termasuk tautologi


### NO. 3

Diketahui :
U = himpunan mahasiswa 
P = himpunan mahasiswa yang nilai ujian UTS di atas 80 
Q = himpunan mahasiswa yang nilai ujian UAS di atas 80 
Seorang mahasiswa mendapat nilai A jika nilai UTS dan nilai UAS keduanya di atas 80, mendapat nilai B jika salah satu ujian di atas 80, dan mendapat nilai C jika kedua ujian di bawah 80. 

Ditanya :
Nyatakan notasi himpunannya dari pernyataan diatas.

##### Jawaban :
-   Nilai **A**: Mahasiswa yang mendapatkan nilai UTS dan UAS di atas 80. Ini berarti himpunan **A** adalah irisan antara P dan Q, yaitu A=P ∩ Q.
-   Nilai **B**: Mahasiswa yang mendapatkan salah satu ujian (UTS atau UAS) di atas 80. Ini adalah gabungan antara P dan Q tanpa irisan (yaitu mahasiswa yang hanya salah satu ujiannya di atas 80). Himpunan ini adalah B=(P ∪ Q)−(P ∩ Q)
-   Nilai **C**: Mahasiswa yang kedua nilai UTS dan UAS di bawah 80. Ini berarti komplemen dari gabungan P dan Q, yaitu C=U - (P∪Q)

Jadi, notasi himpunannya adalah:

-   A= P ∩ Q
-   B= (P ∪ Q)−(P ∩ Q)
-   C= U - (P ∪ Q)

### NO. 4
#### Diagram Venn
![Diagram Venn](https://i.postimg.cc/DyGdPdSv/DIAGRAM-VENN-2.jpg)

A = {a, p, o, t, e, k}

B = {r, a, p, o, t}

A ∪ B = {a, p, o, t, e, k, r}

### NO. 5 
 Diketahui :
  
 - A = { 1, 2, 5, 6, 7, 11, 12, 13, 15, 18, 20}

 - B = {2, 3, 4, 5, 6, 7, 8, 12, 13} 

 - C = {1, 2, 3, 6, 8, 9, 10, 13, 17, 18} 
 
 - S = {x|x <= 20, x = bilangan asli}
 
 Ditanya : Tentukan nilai A ∩ C
 
 ##### Jawaban :
A ∩ C = {1, 2, 6, 13, 18}
