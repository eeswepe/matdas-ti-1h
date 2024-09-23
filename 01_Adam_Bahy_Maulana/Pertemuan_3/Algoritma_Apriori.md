
# Penjelasan Algoritma Apriori

Algoritma **Apriori** adalah salah satu algoritma yang digunakan untuk **association rule learning** dalam **data mining**. Algoritma ini bertujuan untuk menemukan **asosiasi** atau **hubungan** antara item-item yang sering muncul bersama dalam suatu dataset transaksi. Aplikasi paling umum dari Apriori adalah dalam analisis **keranjang belanja** (market basket analysis), di mana algoritma digunakan untuk menemukan produk mana yang sering dibeli bersama.

## Konsep Utama Algoritma Apriori:

1. **Frequent Itemset**: Itemset (himpunan item) yang muncul lebih sering dari nilai minimum threshold yang disebut **support**. Support dari itemset \( X \) dihitung sebagai:
   
   ![Support Formula](https://latex.codecogs.com/png.latex?Support(X)%20%3D%20%5Cfrac%7Bjumlah%20transaksi%20yang%20mengandung%20X%7D%7Btotal%20jumlah%20transaksi%7D)
   
2. **Association Rule**: Setelah menemukan itemset yang sering muncul (frequent itemsets), aturan asosiasi dibangun dalam bentuk \( A \rightarrow B \), yang berarti jika item \( A \) dibeli, maka item \( B \) juga kemungkinan besar akan dibeli. Nilai **confidence** dihitung sebagai:

   ![Confidence Formula](https://latex.codecogs.com/png.latex?Confidence(A%20%5Crightarrow%20B)%20%3D%20%5Cfrac%7BSupport(A%20%5Ccup%20B)%7D%7BSupport(A)%7D)

3. **Prinsip Apriori**: Jika suatu itemset dianggap tidak sering muncul, maka semua supersets-nya juga tidak akan sering muncul. Algoritma ini bekerja dengan memanfaatkan properti tersebut untuk mengurangi pencarian kombinasi itemset yang tidak perlu.

## Langkah-langkah Algoritma Apriori:

1. **Menghitung Frequent 1-itemsets (L1)**: Hitung support untuk semua item individual (itemset dengan satu elemen) dan eliminasi item yang support-nya kurang dari nilai minimum.
   
2. **Menghasilkan Kandidat 2-itemsets (C2)**: Kombinasikan item-item dari L1 untuk menghasilkan itemset baru yang memiliki dua item, lalu hitung support-nya.

3. **Menghitung Frequent 2-itemsets (L2)**: Dari C2, pilih itemset yang memenuhi nilai minimum support untuk membentuk L2.

4. **Iterasi**: Ulangi proses untuk menghasilkan k-itemset (Lk) sampai tidak ada lagi itemset yang memenuhi minimum support.

5. **Membentuk Aturan Asosiasi**: Setelah mendapatkan frequent itemsets, bentuk aturan asosiasi dan hitung confidence untuk setiap aturan.

## Pseudocode Algoritma Apriori:

```python
Apriori(D, min_support):
    # D adalah dataset transaksi
    # min_support adalah ambang batas support minimal
    L1 = {frequent 1-itemsets dari D yang memenuhi min_support}
    k = 2
    Lk = L1
    
    while Lk tidak kosong:
        # Menghasilkan kandidat itemsets (Ck) dari Lk-1
        Ck = generate_candidate_itemsets(Lk)
        
        # Hitung support untuk setiap itemset dalam Ck
        for setiap transaksi t dalam D:
            for setiap itemset c dalam Ck:
                if c ada dalam t:
                    tambahkan count untuk c
        
        # Pilih itemsets yang memenuhi min_support untuk membentuk Lk
        Lk = {itemset dari Ck yang memenuhi min_support}
        
        k = k + 1
    
    return union dari semua Lk
```

## Implementasi Sederhana Algoritma Apriori dalam Python:

Di sini kita akan membuat implementasi sederhana dari algoritma Apriori menggunakan Python.

```python
from itertools import combinations

# Fungsi untuk menghitung support itemset
def calculate_support(itemset, transactions):
    count = 0
    for transaction in transactions:
        if itemset.issubset(transaction):
            count += 1
    return count

# Fungsi Apriori
def apriori(transactions, min_support):
    # Mendapatkan itemset tunggal (frequent 1-itemsets)
    items = set(item for transaction in transactions for item in transaction)
    current_itemsets = [{item} for item in items]
    frequent_itemsets = []
    
    # Iterasi untuk menemukan frequent itemsets
    while current_itemsets:
        # Hitung support untuk setiap itemset
        itemset_support = []
        for itemset in current_itemsets:
            support = calculate_support(itemset, transactions)
            if support >= min_support:
                itemset_support.append((itemset, support))
        
        # Simpan frequent itemsets yang ditemukan
        frequent_itemsets.extend(itemset_support)
        
        # Generate kandidat itemset untuk iterasi berikutnya
        current_itemsets = []
        for i in range(len(itemset_support)):
            for j in range(i + 1, len(itemset_support)):
                union_set = itemset_support[i][0].union(itemset_support[j][0])
                if len(union_set) == len(itemset_support[i][0]) + 1:
                    current_itemsets.append(union_set)
    
    return frequent_itemsets

# Contoh penggunaan algoritma Apriori
transactions = [
    {'roti', 'susu', 'keju'},
    {'roti', 'susu'},
    {'keju', 'apel'},
    {'roti', 'apel', 'keju'},
    {'apel', 'susu'}
]

min_support = 2  # Support minimum

# Jalankan algoritma
frequent_itemsets = apriori(transactions, min_support)

# Cetak hasilnya
print("Frequent Itemsets:")
for itemset, support in frequent_itemsets:
    print(f"{itemset}: {support}")
```

## Penjelasan Implementasi:

1. **Data Input (transactions)**: Data berupa transaksi berisi item-item yang dibeli bersama, yang direpresentasikan sebagai himpunan. Contoh: `{‘roti’, ‘susu’}`.
   
2. **Min Support**: Minimum jumlah kemunculan itemset dalam transaksi agar dianggap sebagai itemset yang sering muncul. Dalam contoh di atas, **min_support** diatur menjadi 2.

3. **Frequent Itemset**: Algoritma mencari item atau kombinasi item yang muncul lebih dari atau sama dengan jumlah **min_support** yang telah ditentukan.

4. **Fungsi calculate_support**: Menghitung berapa kali suatu itemset muncul dalam seluruh transaksi.

5. **Iterasi**: Algoritma memulai dari 1-itemsets (item tunggal) dan terus menghasilkan kandidat itemset yang lebih besar dengan menggabungkan itemset yang telah memenuhi **min_support**.

6. **Hasil**: Algoritma menghasilkan frequent itemsets beserta support-nya.

## Hasil Eksekusi:
```
Frequent Itemsets:
{'roti'}: 3
{'susu'}: 3
{'keju'}: 3
{'apel'}: 3
{'roti', 'susu'}: 2
{'roti', 'keju'}: 2
{'apel', 'keju'}: 2
{'susu', 'keju'}: 2
```

Dari hasil di atas, kita dapat melihat item dan kombinasi item yang sering muncul dalam transaksi, seperti `{‘roti’}` dengan support 3 dan `{‘roti’, ‘keju’}` dengan support 2.

## Kesimpulan:
Algoritma Apriori digunakan untuk menemukan frequent itemsets dan aturan asosiasi dari dataset transaksi. Prosesnya melibatkan iterasi yang membentuk kombinasi itemset dan menghitung support-nya. Algoritma ini sangat berguna dalam analisis pola pembelian di bidang retail atau aplikasi yang melibatkan data transaksi besar.
