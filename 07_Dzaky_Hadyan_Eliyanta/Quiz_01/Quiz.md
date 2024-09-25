## Quiz 1 Matdas
```
 1. Argumen tersebut adalah sahih dan berikut pembuktiannya
p : saya pulang kampung
q : saya ikut ujian susulan
r : saya lulus ujian
p -> ~q
~r -> p
q -> r
- p -> ~q ≡ q -> ~p sesuai dengan modus tollens
Jika saya pulang kampung, maka saya tidak ikut ujian susulan ≡ Jika saya ikut ujian susulan, maka saya tidak pulang kampung 
- ~r -> p ≡ ~p -> r sesuai dengan modus tollens
Jika saya tidak lulus ujian, maka saya pulang kampung ≡ Jika saya tidak pulang kampung, maka saya lulus ujian
- q -> ~~~p~~ 
  ~~~p~~ -> r
Sehingga sahih q -> r karena sesuai dengan rumus silogisme
Jika saya ikut ujian susulan, maka saya lulus ujian
```
2. 
a. ~p -> (p -> q)

|p|q|~p|p -> q|~p -> (p -> q)|
|--|--|--|--|--|
|B|B|S|B|B|
|B|S|B|S|B|
|S|B|B|B|B|
|S|S|B|B|B|
b. ~(p -> q) -> ~q

|p|q|p -> q|~(p -> q)|~q|~(p -> q) -> ~q|
|--|--|--|--|--|--|
|B|B|B|S|S|B|
|B|S|S|B|B|B|
|S|B|B|S|S|B|
|S|S|B|S|B|B|
c. (p ∧ q) -> (p -> q)

|p|q|p ∧ q|p -> q|(p∧q) -> (p -> q)|
|--|--|--|--|--|
|B|B|B|B|B|
|B|S|S|S|S|
|S|B|S|B|B|
|S|S|S|B|B|

3.
```
P : himpunan mahasiswa yang nilai ujian UTS di atas 80
Q : himpunan mahasiswa yang nilai UAS di atas 80
A : himpunan mahasiswa yang mendapat nilai A
B : himpunan mahasiswa yang mendapat nilai B
C : himpunan mahasiswa yang mendapat nilai C
S : semesta/himpunan mahasiswa yang mendapat nilai 80 ke bawah
P U Q = { A | A ∈ P ∧ A ∈ Q}
Gabungan himpunan P dan Q adalah A, dimana A berisi elemen-elemen dari himpunan P dan Q 
(P ∩ Q)c = {B | B ~~∈~~ P ∩ Q ∧ B ∈ P V B ∈ Q}
Komplemen irisan himpunan P dan Q adalah B, dimana B tidak berisi elemen dari irisan himpunan P dan Q dan B berisi elemen dari himpunan P atau Q
(P U Q)c = {C | C ~~∈~~ P U Q ∧ C ∈ S}
Komplemen gabungan himpunan P dan Q adalah C, dimana C tidak berisi elemen dari gabungan himpunan P dan Q, namun masih termasuk dalam himpunan semesta(S)
```
4. ![](https://i.postimg.cc/mZnh2v2k/Screenshot-2024-09-25-150424.png)
A U B = {a, e, k, o, p, r, t}
5.
A = {1, 2, 5, 6, 7, 11, 12, 13, 15, 18, 20}
B = {2, 3, 4, 5,, 6, 7, 8, 12, 13}
C = {1, 2, 3, 6, 8, 9, 10, 13, 17, 18}
S = {x|x <= 20, x = bilangan asli}
A ∩ C = {1, 2, 6, 13, 18}
