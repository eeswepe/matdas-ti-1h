# Jawaban Kuis 1

## 1. p -> ~r  (Jika saya pulang kampung, maka saya tidak bisa mengikuti ujian susulan)
 ~q -> p (Jika saya tidak lulus ujian, maka saya pulang kampung)
    r (Saya bisa mengikuti ujian susulan)
    Kesimpulan yang diambil : q  (Saya lulus ujian).
   -  **Maka Argumen itu VALID** 

## 2. Tabel Kebenaran
### Tabel kebenaran Tautologi

### ( A ). ~p -> ( p -> q )
- Semua hasil dalam kolom terakhir adalah benar (**T**), jadi ~p -> ( p -> q ) adalah *tautologi*.
| p     | q     | ~p    | p -> q | ~p -> ( p -> q ) |
|-------|-------|-------|-------|---------------|
| T     | T     | F     | T     | T             |
| T     | F     | F     | F     | T             |
| F     | T     | T     | T     | T             |
| F     | F     | T     | T     | T             |




---

### ( B ).  ~( p -> q ) -> ~q
- Semua hasil dalam kolom terakhir adalah benar ( **T** ), jadi ~( p -> q ) → ~q adalah *tautologi*.
| p     | q     | p → q | ¬(p → q) | ¬q    | ¬(p → q) → ¬q |
|-------|-------|-------|----------|-------|----------------|
| T     | T     | T     | F        | F     | T              |
| T     | F     | F     | T        | T     | T              |
| F     | T     | T     | F        | F     | T              |
| F     | F     | T     | F        | T     | T              |
  
  


---

### ( C ). ( p ∧ q )  ( p -> q )
Semua hasil dalam kolom terakhir adalah benar (**T**), jadi ( p ∧ q ) → ( p -> q ) adalah *tautologi*.
| p     | q     | p ∧ q | p -> q | ( p ∧ q ) -> ( p -> q ) |
|-------|-------|-------|-------|--------------------|
| T     | T     | T     | T     | T                  |
| T     | F     | F     | F     | T                  |
| F     | T     | F     | T     | T                  |
| F     | F     | F     | T     | T                  |



# 3. Notasi Himpunan Mahasiswa

- *U* = himpunan mahasiswa
- *P* = himpunan mahasiswa yang nilai ujian UTS di atas 80
- *Q* = himpunan mahasiswa yang nilai ujian UAS di atas 80

## Klasifikasi Nilai

1. *Nilai A*: Seorang mahasiswa mendapat nilai A jika nilai UTS dan UAS keduanya di atas 80.
   - *Notasi himpunannya*: \( P \cap Q \)  
   - *Artinya*: Mahasiswa yang mendapat nilai A adalah anggota dari himpunan \( P \) dan himpunan \( Q \) (nilai UTS dan UAS keduanya di atas 80).

2. *Nilai B*: Seorang mahasiswa mendapat nilai B jika salah satu ujian di atas 80.
   - *Notasi himpunannya*: \( P \cup Q \)  
   - *Artinya*: Mahasiswa yang mendapat nilai B adalah anggota dari himpunan \( P \) atau himpunan \( Q \) (minimal salah satu dari nilai UTS atau UAS di atas 80).

3. *Nilai C*: Seorang mahasiswa mendapat nilai C jika kedua ujian di bawah 80.
   - *Notasi himpunannya*: \( U - (P \cup Q) \)  
   - *Artinya*: Mahasiswa yang mendapat nilai C adalah semua mahasiswa dalam himpunan \( U \) yang tidak termasuk dalam himpunan \( P \) dan \( Q \) (kedua ujian di bawah 80).

## Ringkasan Notasi Himpunan

- Mahasiswa dengan nilai A: \( P \cap Q \)
- Mahasiswa dengan nilai B: \( P \cup Q \)
- Mahasiswa dengan nilai C: \( U - (P \cup Q) \)


# 4. Berikut ini adalah hasil diagram venn:
![Diagram Venn][def]

[def]: diagramven.png


# 5. Irisan Himpunan

Nilai himpunan Sebagai berikut:

- *A* = {1, 2, 5, 6, 7, 11, 12, 13, 15, 18, 20}
- *C* = {1, 2, 3, 6, 8, 9, 10, 13, 17, 18}
- *S* = {x | x <= 20, x = bilangan asli}

## Menentukan Nilai Irisan \( A \cap C \)

Untuk menentukan irisan antara dua himpunan \( A \) dan \( C \) (dinyatakan sebagai \( A \cap C \)), kita perlu mencari elemen-elemen yang ada di kedua himpunan tersebut.

### Caranya Adalah:

1. *Identifikasi elemen yang ada di \( A \)*.
2. *Periksa setiap elemen \( A \) untuk melihat apakah elemen tersebut juga ada di \( C \)*.

### Elemen di \( A \):
- 1 (ada di \( C \))
- 2 (ada di \( C \))
- 5 (tidak ada di \( C \))
- 6 (ada di \( C \))
- 7 (tidak ada di \( C \))
- 11 (tidak ada di \( C \))
- 12 (tidak ada di \( C \))
- 13 (ada di \( C \))
- 15 (tidak ada di \( C \))
- 18 (ada di \( C \))
- 20 (tidak ada di \( C \))

### Elemen yang terdapat di \( A \) dan \( C \):
- 1
- 2
- 6
- 13
- 18

### Hasil \( A \cap C \):

(A \cap C = \){1, 2, 6, 13, 18\}


Nilai \( A \cap C \) adalah:
\{1, 2, 6, 13, 18\}