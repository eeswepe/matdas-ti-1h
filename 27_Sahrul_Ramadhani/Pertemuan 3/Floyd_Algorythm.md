# Algoritma **Floyd-Warshall**

Algoritma **Floyd-Warshall** adalah salah satu algoritma yang digunakan untuk menemukan **jalur terpendek** antara **semua pasangan simpul (vertices)** dalam suatu graf berarah berbobot (directed weighted graph). Algoritma ini bekerja untuk graf dengan **bobot positif dan negatif** (asalkan tidak ada siklus negatif), dan kompleksitas waktunya adalah **O(V³)**, di mana **V** adalah jumlah simpul dalam graf.

Algoritma ini terkenal karena **kesederhanaannya** dalam mengimplementasikan pendekatan **dynamic programming** untuk menyelesaikan masalah **all-pairs shortest paths**.

### **Tujuan**

Tujuan algoritma Floyd-Warshall adalah mencari jarak terpendek dari setiap simpul ke semua simpul lain dalam graf. Jika ada simpul **i** dan **j**, maka algoritma ini menghitung jarak minimum dari simpul **i** ke simpul **j**, baik secara langsung maupun melalui simpul-simpul lain di antara keduanya.

### **Prinsip Dasar**

Floyd-Warshall bekerja berdasarkan prinsip **relaksasi** berulang-ulang dari jalur antar-simpul dengan memeriksa apakah melalui simpul perantara dapat memberikan jalur yang lebih pendek daripada jalur langsung antara dua simpul.

Misalkan:
- **d(i, j)** adalah jarak terpendek dari simpul **i** ke simpul **j**.
- **d(i, k) + d(k, j)** adalah jarak dari **i** ke **j** yang melalui simpul **k**.

Floyd-Warshall berusaha memperbarui nilai jarak terpendek **d(i, j)** dengan memeriksa apakah lebih menguntungkan melewati simpul **k** dibandingkan jalur langsung antara **i** dan **j**.

### **Langkah-langkah Algoritma**

1. **Inisialisasi Matriks Jarak**
   - Buat matriks jarak **D** berukuran **V x V**, di mana **V** adalah jumlah simpul dalam graf.
   - Untuk setiap pasangan simpul **(i, j)**, inisialisasi nilai awal jarak:
     - **D[i][j] = w(i, j)**, di mana **w(i, j)** adalah bobot (berat) dari tepi (edge) antara simpul **i** dan **j**.
     - Jika tidak ada tepi langsung antara **i** dan **j**, inisialisasi dengan **tak hingga** (∞).
     - Set **D[i][i] = 0**, karena jarak dari simpul ke dirinya sendiri adalah 0.

2. **Iterasi Melalui Simpul Perantara**
   - Lakukan tiga perulangan bertingkat (nested loop), di mana variabel perantara **k** berjalan dari 1 hingga **V**.
     - Untuk setiap pasangan simpul **(i, j)**, periksa apakah melewati simpul perantara **k** memberikan jalur yang lebih pendek:
       - **D[i][j] = min(D[i][j], D[i][k] + D[k][j])**
     - Artinya, periksa apakah jarak dari **i** ke **j** lebih pendek melalui simpul **k** dibandingkan jarak langsung dari **i** ke **j**.

3. **Pembaruan Matriks Jarak**
   - Jika melewati **k** menghasilkan jalur yang lebih pendek, perbarui nilai **D[i][j]** dengan jarak yang lebih pendek.

4. **Hasil Akhir**
   - Setelah semua iterasi selesai, matriks **D** akan berisi jarak terpendek dari setiap simpul ke semua simpul lain dalam graf. Jika **D[i][j]** tetap tak hingga (∞), berarti tidak ada jalur antara **i** dan **j**.

### **Pseudocode Algoritma Floyd-Warshall**

```python
def floyd_warshall(graph):
    # Inisialisasi matriks jarak dengan bobot dari graf
    dist = list(map(lambda i: list(map(lambda j: j, i)), graph))
    V = len(graph)  # Jumlah simpul

    # Iterasi melalui semua simpul perantara
    for k in range(V):
        for i in range(V):
            for j in range(V):
                # Jika jarak melalui simpul k lebih pendek, perbarui jarak
                dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])

    return dist
