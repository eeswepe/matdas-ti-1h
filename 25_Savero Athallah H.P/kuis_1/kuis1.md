## **Soal 1**

 p = saya pulang kampung
 q = mengikuti ujian susulan
 r = lulus ujian

Argumen nyata:
Jika saya pulang kampung  -> p
maka saya tidak bisa mengikuti ujian susulan -> ~q
Jika saya tidak lulus ujian -> ~r
Maka saya pulang kampung -> p
Tetapi saya bisa mengikuti ujian susulan -> q
Oleh karena itu saya lulus ujian - > r

Pembuktian 

p -> ~q == q -> ~p

~r -> p  == ~p -> r

Karena ~p ada 2, maka kedua premis bisa dicoret sehingga bisa menghasilkan :

q -> r

q
____________ 
r

Maka dapat disimpulkan bahwa argumen tersebut shahih / benar

 **

## Soal 2

**
 
 a) ~p -> (p->q)
 Pernyataan yang akan dievaluasi: 
 p -> (p -> q)
 
|p  | q |~p |p->q  |~p -> (p->q) |  |  |
|--|--|--|--|--|--|--|
| T  |T  |F  |T  |T  |  |
| T |  F|  F| F |  T|  |  |
|  F|  T|  T|  T|  T|  |  |
|  F|  F|  T|  T|  T|  |  |
Semua nilai kolom terakhir adalah T, sehingga premis tersebut adalah tautologi.

b) ~(p -> q) -> ~q
Pernyataan yang akan dievaluasi:
~ (p -> q) -> ~q

|p  | q |p->q|~(p -> q)  |~q |~(p -> q) -> ~q  |  |
|--|--|--|--|--|--|--|
| T  |T  |T  |F  |F | T |
| T |  F|  F| T |  T| T |  |
|  F|  T|  T|  F|  F|T  |  |
|  F|  F|  F|  T|  T| T |  |
Semua nilai kolom terakhir adalah T, sehingga premis tersebut adalah tautologi.

c) (p ^ q) -> (p -> q)
Pernyataan yang akan dievaluasi:
(p ^ q) -> (p -> q)

|p  | q |p^q|p -> q  |(p ^ q) -> (p -> q) |  |  |
|--|--|--|--|--|--|--|
| T  |T  |T  |T  |T |  |
| T |  F|  F| F |  T|  |  |
|  F|  T|  F|  T|  T| |  |
|  F|  F|  F|  T|  T|  |  |
Semua nilai kolom terakhir adalah T, sehingga premis tersebut adalah tautologi.

**

## Soal 3

U = himpunan semua mahasiswa
P = himpunan mahasiswa yang nilai UTS di atas 80
Q = himpunan mahasiswa yang nilai UAS di atas 80
1.  **Nilai A**: Nilai UTS dan UAS keduanya di atas 80.
    
    Notasi: P ∩ Q
    
2.  **Nilai B**: Salah satu ujian di atas 80.
    
    Notasi: P ∪ Q − (P ∩ Q)
    
3.  **Nilai C**: Keduanya di bawah 80.

    Notasi: U − (P ∪ Q )
 
 **

## Soal 4
Diketahui :
A = {huruf pembentuk kata "apotek"} dan B = {r, a, p, o, t}, maka A  ∪ B
A ∪ B = {a, p, o ,t}
[![diagram-venn.png](https://i.postimg.cc/NFqM16h2/diagram-venn.png)](https://postimg.cc/47PsGhxX)

**

## Soal 5

 A = { 1, 2, 5, 6, 7, 11, 12, 13, 15, 18, 20} 
 B = {2, 3, 4, 5, 6, 7, 8, 12, 13} 
 C = {1, 2, 3, 6, 8, 9, 10, 13, 17, 18} S = {x|x <= 20, x = bilangan asli} 
 nilai A ∩ C = {1, 2, 6, 13, 18}
 