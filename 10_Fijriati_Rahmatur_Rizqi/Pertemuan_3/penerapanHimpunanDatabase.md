## Konsep Himpunan dalam Database: Contoh Pencarian Pelanggan dan Transaksi

Sebagai seorang programmer, kita dapat memanfaatkan konsep himpunan dalam pengelolaan database. Bayangkan kita memiliki dua tabel utama: `pelanggan` dan `transaksi`.

**Mencari Pelanggan yang Pernah Melakukan Transaksi**

Jika kita ingin mencari pelanggan yang pernah melakukan transaksi, kita dapat menggunakan konsep **himpunan irisan**.

**Notasi Himpunan:**

- **A ∩ B:** Ini adalah notasi untuk menyatakan irisan dari dua himpunan A dan B. Dalam konteks ini, A bisa mewakili himpunan pelanggan dan B mewakili himpunan transaksi. Irisan dari A dan B akan menghasilkan himpunan pelanggan yang terdapat di _kedua_ himpunan tersebut.

- **{pelanggan | pelanggan yang memiliki transaksi}:** Ini adalah cara menjelaskan himpunan irisan tersebut.

**Pseudocode:**

```
function irisan(himpunanPelanggan, himpunanTransaksi):
  hasil = himpunan kosong
  for setiap elemen in himpunanPelanggan:
    if elemen ada di himpunanTransaksi:
      tambahkan elemen ke hasil
  return hasil
```

**Implementasi dalam SQL:**

```sql
SELECT *
FROM pelanggan
INNER JOIN transaksi ON pelanggan.id_pelanggan = transaksi.id_pelanggan;
```

**Penjelasan:**

- **INNER JOIN:** Digunakan untuk menggabungkan data dari dua tabel berdasarkan kolom yang sama (dalam kasus ini, `id_pelanggan`).

**Kesimpulan:**

Konsep himpunan memberikan dasar yang kuat untuk memahami dan memanipulasi data dalam database. Dengan memahami operasi-operasi himpunan, kita dapat melakukan berbagai query yang kompleks dan mendapatkan informasi yang kita butuhkan.
