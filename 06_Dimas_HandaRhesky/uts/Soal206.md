Berikut adalah penjelasan dari setiap operasi dalam program di atas beserta kode yang mewakili masing-masing fungsinya:

### 1. Penjumlahan Biner
Fungsi ini melakukan penjumlahan dua bilangan biner (`biner1` dan `biner2`) secara manual dengan memproses setiap digit dari belakang. Jika penjumlahan dua bit menghasilkan nilai lebih dari 1, maka `carry` ditambahkan ke bit berikutnya.

```java
StringBuilder hasilPenjumlahan = new StringBuilder();
int carry = 0, i = biner1.length() - 1, j = biner2.length() - 1;
while (i >= 0 || j >= 0 || carry > 0) {
    int bit1 = (i >= 0) ? biner1.charAt(i--) - '0' : 0;
    int bit2 = (j >= 0) ? biner2.charAt(j--) - '0' : 0;
    int sum = bit1 + bit2 + carry;
    hasilPenjumlahan.insert(0, sum % 2);
    carry = sum / 2;
}
System.out.println("Penjumlahan biner: " + biner1 + " + " + biner2 + " = " + hasilPenjumlahan);
```

### 2. Pengurangan Biner
Fungsi ini mengurangi `biner4` dari `biner3`. Jika pengurangan dua bit menghasilkan nilai negatif, `carry` akan dipinjam dari bit berikutnya.

```java
StringBuilder hasilPengurangan = new StringBuilder();
carry = 0; i = biner3.length() - 1; j = biner4.length() - 1;
while (i >= 0 || j >= 0) {
    int bit1 = (i >= 0) ? biner3.charAt(i--) - '0' : 0;
    int bit2 = (j >= 0) ? biner4.charAt(j--) - '0' : 0;
    int diff = bit1 - bit2 - carry;
    if (diff < 0) {
        diff += 2;
        carry = 1;
    } else {
        carry = 0;
    }
    hasilPengurangan.insert(0, diff);
}
System.out.println("Pengurangan biner: " + biner3 + " - " + biner4 + " = " + hasilPengurangan);
```

### 3. Perkalian Biner
Fungsi ini mengalikan dua bilangan biner (`biner5` dan `biner6`) dengan menambahkan hasil perkalian setiap digit `1` dari `biner6` dengan `biner5` yang di-shift sesuai posisinya. Hasilnya ditambahkan ke `hasilPerkalian`.

```java
StringBuilder hasilPerkalian = new StringBuilder("0");
for (int k = biner6.length() - 1; k >= 0; k--) {
    if (biner6.charAt(k) == '1') {
        StringBuilder temp = new StringBuilder(biner5);
        for (int l = 0; l < (biner6.length() - 1 - k); l++) {
            temp.append("0");
        }
        carry = 0;
        StringBuilder tempHasil = new StringBuilder();
        int x = hasilPerkalian.length() - 1, y = temp.length() - 1;
        while (x >= 0 || y >= 0 || carry > 0) {
            int bitX = (x >= 0) ? hasilPerkalian.charAt(x--) - '0' : 0;
            int bitY = (y >= 0) ? temp.charAt(y--) - '0' : 0;
            int sum = bitX + bitY + carry;
            tempHasil.insert(0, sum % 2);
            carry = sum / 2;
        }
        hasilPerkalian = tempHasil;
    }
}
System.out.println("Perkalian biner: " + biner5 + " * " + biner6 + " = " + hasilPerkalian);
```

### 4. Operasi Bitwise AND, OR, dan XOR
Fungsi ini melakukan operasi AND, OR, dan XOR pada dua bilangan biner (`biner7` dan `biner8`). Setiap operasi dilakukan bit per bit dari kanan ke kiri.

- **AND**: Menghasilkan `1` jika kedua bit adalah `1`, sebaliknya `0`.
- **OR**: Menghasilkan `1` jika salah satu atau kedua bit adalah `1`.
- **XOR**: Menghasilkan `1` jika kedua bit berbeda, sebaliknya `0`.

```java
StringBuilder hasilAND = new StringBuilder();
StringBuilder hasilOR = new StringBuilder();
StringBuilder hasilXOR = new StringBuilder();
i = biner7.length() - 1;
j = biner8.length() - 1;
while (i >= 0 || j >= 0) {
    int bit1 = (i >= 0) ? biner7.charAt(i--) - '0' : 0;
    int bit2 = (j >= 0) ? biner8.charAt(j--) - '0' : 0;
    hasilAND.insert(0, (bit1 & bit2));
    hasilOR.insert(0, (bit1 | bit2));
    hasilXOR.insert(0, (bit1 ^ bit2));
}
System.out.println("Operasi AND: " + biner7 + " & " + biner8 + " = " + hasilAND);
System.out.println("Operasi OR: " + biner7 + " | " + biner8 + " = " + hasilOR);
System.out.println("Operasi XOR: " + biner7 + " ^ " + biner8 + " = " + hasilXOR);
```

### Ringkasan
Kode ini melakukan operasi matematika dasar pada bilangan biner termasuk penjumlahan, pengurangan, perkalian, dan operasi bitwise. Setiap operasi diimplementasikan dengan manual manipulasi bit.