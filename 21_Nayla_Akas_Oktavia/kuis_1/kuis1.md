# Quiz 1 MatDas

1. Argumen nyata :
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
2. Berikut adalah tabel kebenaran untuk setiap implikasi 

 - (a) ~p → (p → q )

| p | q | ~p|p -> q | ~p -> (p -> q)|
|--|--|--|--|--|
| T | T | F| T| T|
| T | F | F| F| T|
| F | T | T| T| T|
| F | F | T| T| T|

 - (b) ~(p →q) → ~q

| p | q | p->q|(p -> q) | ~q|(p->q)-> ~q |
|--|--|--|--|--|--|
| T | T | T| F| F| T |
| T | F | F| T| T| T |
| F | T | T| F| F| T |
| F | F | T| F| T| T |

 - (c) (p ∧ q) → (p → q)

| p | q | p ∧ q|p -> q | (p∧q)->(p->q)|
|--|--|--|--|--|
| T | T | T| T| T|
| T | F | F| F| T|
| F | T | F| T| T|
| F | F | F| T| T|

Kesimpulan : Pernyataan (p ∧ q ) -> (p -> q) adalah tautologi karena hasilnya selalu benar (T).

3. **Diketahui:**
-   **U:** Himpunan semesta (semua mahasiswa)
-   **P:** Himpunan mahasiswa yang nilai UTS di atas 80 (P ⊆ U)
-   **Q:** Himpunan mahasiswa yang nilai UAS di atas 80 (Q ⊆ U)

	**Mahasiswa yang mendapat nilai A:**
    
    -   Syarat: Nilai UTS dan UAS keduanya di atas 80.
    -   Notasi:  **A = P ∩ Q** 
    
	 **Mahasiswa yang mendapat nilai B:**
    
    -   Syarat: Salah satu nilai UTS atau UAS di atas 80.
    -   Notasi:  **B = (P ∪ Q) - (P ∩ Q)**
	 
	 **Mahasiswa yang mendapat nilai C:**
    
    -   Syarat: Kedua nilai UTS dan UAS di bawah 80.
    -   Notasi:  **C = U - (P ∪ Q)** 
4. ![enter image description here](https://i.postimg.cc/MpWMfyRr/image.png)

5. Anggota yang sama antara A dan C adalah: 1, 2, 6, 13, 18
jadi, A ∩ C = {1, 2, 6, 13, 18}


