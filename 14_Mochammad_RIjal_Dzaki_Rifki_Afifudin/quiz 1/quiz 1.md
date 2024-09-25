## Quiz 1 Matematika Dasar

  

### Jawaban Soal 1

- Premis 1: **p → q**
"Jika saya pulang kampung, maka saya tidak bisa mengikuti ujian susulan."
Ini berarti **p**: "Saya pulang kampung" dan **q**: "Saya tidak bisa mengikuti ujian susulan."

- Premis 2: **¬r → p**
"Jika saya tidak lulus ujian, maka saya pulang kampung."
Ini berarti **r**: "Saya lulus ujian" dan **p**: "Saya pulang kampung." Jadi, **¬r** adalah "Saya tidak lulus ujian," yang menyebabkan p.

- Premis 3: Saya bisa mengikuti ujian susulan (**¬q**).
Ini berarti **¬q**: "Saya bisa mengikuti ujian susulan," yang merupakan negasi dari premis **q**.
Kesimpulan: Oleh karena itu, saya lulus ujian (**r**).

Kesimpulan ini adalah **r**: "Saya lulus ujian."

#### Pemeriksaan Validitas Argumen

Langkah-langkah:

- Premis 1: **p → q** (Jika saya pulang kampung, maka saya tidak bisa mengikuti ujian susulan).
Premis ini dapat diinterpretasikan bahwa jika **p** benar, maka **q** harus benar. Jika **q** salah (saya bisa mengikuti ujian susulan), maka **p** harus salah. Jadi, **¬q → ¬p**. Artinya, jika saya bisa mengikuti ujian susulan (**¬q**), maka saya tidak pulang kampung (**¬p**).

- Premis 2: **¬r → p** (Jika saya tidak lulus ujian, maka saya pulang kampung).
Ini berarti, jika saya tidak lulus ujian, saya akan pulang kampung. Namun, jika **r** benar (saya lulus ujian), maka tidak ada konsekuensi langsung dari premis ini.

- Premis 3: **¬q** (Saya bisa mengikuti ujian susulan).  
Dari premis 1, kita sudah tahu bahwa **¬q → ¬p**, sehingga **p** salah (saya tidak pulang kampung).

Kesimpulan: Dari premis 2, kita tahu bahwa **¬r → p**. Namun, kita sudah menyimpulkan dari premis 1 bahwa **¬p** (saya tidak pulang kampung). Jika p salah, maka **¬r** juga harus salah, yang berarti **r** benar (saya lulus ujian).


### Jawaban Soal 2
a. **𝑝→(𝑝→𝑞)**
|p|q|p→q|p→(p→q)|
|--|--|--|--|
|T|T|T|T|
|T|F|F|F|
|F|T|T|T|
|F|F|T|T|
Hasil: Implikasi ini bukan tautologi karena ada baris di mana hasilnya salah (False).  

b.  **¬(𝑝→𝑞)→¬𝑞**
|p|q|p→q|¬(p→q)|¬q|¬(p→q)→¬q|
|--|--|--|--|--|--|
|T|T|T|F|F|T|
|T|F|F|T|T|T|
|F|T|T|F|F|T|
|F|F|T|F|T|T|

Hasil: Implikasi ini adalah tautologi karena hasilnya selalu benar (True) untuk semua kemungkinan kombinasi nilai

c.  **(𝑝→𝑞)→(𝑝∧𝑞)**

|p|q|p→q|p∧q|(p→q)→(p∧q)|
|--|--|--|--|--|
|T|T|T|T|T|
|T|F|F|F|T|
|F|T|T|F|F|
|F|F|T|F|F|

Hasil: Implikasi ini bukan tautologi karena ada baris di mana hasilnya salah (False).

Kesimpulan:

a : **𝑝→(𝑝→𝑞)** bukan tautologi.
b : **¬(p→q)→¬q** adalah tautologi.
c : **(p→q)→(p∧q)** bukan tautologi.


### Jawaban Soal 3

- Himpunan **U**: Mahasiswa dengan nilai UTS di atas 80.
**U**={x∣x adalah mahasiswa dan nilai UTS(x)>80}

- Himpunan **P**: Mahasiswa dengan nilai UAS di atas 80.
**P**={x∣x adalah mahasiswa dan nilai UAS(x)>80}

- Mahasiswa yang mendapat nilai **A**: Mahasiswa yang nilai UTS dan UAS keduanya di atas 80.
**A**=U∩P={x∣x∈U dan x∈P}

- Mahasiswa yang mendapat nilai **B**: Mahasiswa yang salah satu dari ujian di atas 80.
**B**=U∪P={x∣x∈U atau x∈P}

- Mahasiswa yang mendapat nilai **C**: Mahasiswa yang kedua ujian di bawah 80. Ini berarti mahasiswa tersebut tidak ada di himpunan U dan tidak ada di himpunan **P**.
**C**\=Uc∩Pc\={x∣x∈/U dan x∈/P}



### Jawaban Soal 4

![Diagram Vann](https://i.postimg.cc/m2TC7fWw/Whats-App-Image-2024-09-25-at-2-26-48-PM.jpg)

Penjelasan :
**Himpunan A**: A={a,p,o,t,e,k}A = \{ a, p, o, t, e, k \} A={a,p,o,t,e,k}
**Himpunan B**: B={r,a,p,o,t}B = \{ r, a, p, o, t \} B={r,a,p,o,t}

Irisan **(A ∩ B)**: 
{a,p,o,t}\{ a, p, o, t \}{a,p,o,t}

Gabungan **(A ∪ B)** :  
A∪B={a,p,o,t,e,k,r}


### Jawaban Soal 5

Himpunan A : **{1,2,5,6,7,11,12,13,15,18,20}**
Himpunan C : **{1,2,3,6,8,9,10,13,17,18}**

Pemeriksaan :
-   1: ada di A dan C
-   2: ada di A dan C
-   5: ada di A, tetapi tidak ada di C
-   6: ada di A dan C
-   7: ada di A, tetapi tidak ada di C
-   11: ada di A, tetapi tidak ada di C
-   12: ada di A, tetapi tidak ada di C
-   13: ada di A dan C
-   15: ada di A, tetapi tidak ada di C
-   18: ada di A dan C
-   20: ada di A, tetapi tidak ada di C
Hasil : **A∩C={1,2,6,13,18}**
