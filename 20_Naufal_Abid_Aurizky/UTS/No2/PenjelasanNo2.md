## Penjelasan kode pemrograman (UTS NO 2)

## Penjumlahan Biner
```
public static String addBinary(String a, String b) {
    StringBuilder result = new StringBuilder();
    int carry = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;
    
    while (i >= 0 || j >= 0 || carry > 0) {
        int sum = carry;
        if (i >= 0) sum += a.charAt(i--) - '0';
        if (j >= 0) sum += b.charAt(j--) - '0';
        result.insert(0, sum % 2);
        carry = sum / 2;
    }
    
    return result.toString();
}
```
* Fungsi: addBinary menambahkan dua bilangan biner berbentuk String dengan mengelola sisa atau carry.
* Logika:
    * while (i >= 0 || j >= 0 || carry > 0): Selama ada angka yang harus ditambahkan atau terdapat nilai carry.
    * sum += a.charAt(i--) - '0': Menambahkan digit dari a (jika ada) ke sum dan mengurangi indeks i.
    * result.insert(0, sum % 2): Menambahkan sisa bagi sum dengan 2 (0 atau 1) ke awal result.
    * carry = sum / 2: Memperbarui nilai carry.

## Pengurangan Biner
```
public static String subtractBinary(String a, String b) {
    StringBuilder result = new StringBuilder();
    int borrow = 0;
    char[] num1 = a.toCharArray();
    char[] num2 = b.toCharArray();
    int i = a.length() - 1;
    int j = b.length() - 1;
    
    while (i >= 0) {
        int digit1 = num1[i] - '0';
        int digit2 = (j >= 0) ? num2[j] - '0' : 0;
        
        digit1 = digit1 - borrow;
        
        if (digit1 < digit2) {
            digit1 = digit1 + 2;
            borrow = 1;
        } else {
            borrow = 0;
        }
        
        result.insert(0, digit1 - digit2);
        i--;
        j--;
    }
    
    while (result.length() > 1 && result.charAt(0) == '0') {
        result.deleteCharAt(0);
    }
    
    return result.toString();
}
```
* Fungsi: subtractBinary mengurangi bilangan biner kedua dari bilangan biner pertama, memperhitungkan borrow jika diperlukan.
* Logika:
    * digit1 = digit1 - borrow: Mengurangi digit pertama dengan borrow.
    * if (digit1 < digit2): Jika digit1 lebih kecil dari digit2, maka perlu borrow, jadi digit1 ditambah 2.
    * result.insert(0, digit1 - digit2): Menambahkan hasil pengurangan ke awal result.

## Perkalian Biner
```
public static String multiplyBinary(String a, String b) {
    String result = "0";
    String temp = a;
    
    for (int i = b.length() - 1; i >= 0; i--) {
        if (b.charAt(i) == '1') {
            result = addBinary(result, temp);
        }
        temp += "0";
    }
    
    return result;
}
```
* Fungsi: multiplyBinary mengalikan dua bilangan biner menggunakan metode shift-and-add.
* Logika:
    * Jika digit b saat ini adalah 1, maka temp ditambahkan ke result.
    * temp += "0" menggeser temp ke kiri dengan menambahkan nol di akhir untuk setiap posisi.

## Operasi AND Biner
```
public static String andBinary(String a, String b) {
    StringBuilder result = new StringBuilder();
    int maxLength = Math.max(a.length(), b.length());
    
    a = String.format("%" + maxLength + "s", a).replace(' ', '0');
    b = String.format("%" + maxLength + "s", b).replace(' ', '0');
    
    for (int i = 0; i < maxLength; i++) {
        result.append((a.charAt(i) == '1' && b.charAt(i) == '1') ? '1' : '0');
    }
    
    return result.toString();
}
```
* Fungsi: andBinary melakukan operasi AND biner antara dua bilangan biner.
* Logika:
    * Jika digit a dan b keduanya 1, tambahkan 1 ke result, jika tidak tambahkan 0.

## Operasi OR Biner
```
public static String orBinary(String a, String b) {
    StringBuilder result = new StringBuilder();
    int maxLength = Math.max(a.length(), b.length());
    
    a = String.format("%" + maxLength + "s", a).replace(' ', '0');
    b = String.format("%" + maxLength + "s", b).replace(' ', '0');
    
    for (int i = 0; i < maxLength; i++) {
        result.append((a.charAt(i) == '1' || b.charAt(i) == '1') ? '1' : '0');
    }
    
    return result.toString();
}
```
* Fungsi: orBinary melakukan operasi OR biner antara dua bilangan biner.
* Logika:
    * Jika salah satu digit a atau b adalah 1, tambahkan 1 ke result, jika tidak tambahkan 0.

## Operasi XOR Biner
```
public static String xorBinary(String a, String b) {
    StringBuilder result = new StringBuilder();
    int maxLength = Math.max(a.length(), b.length());
    
    a = String.format("%" + maxLength + "s", a).replace(' ', '0');
    b = String.format("%" + maxLength + "s", b).replace(' ', '0');
    
    for (int i = 0; i < maxLength; i++) {
        result.append(a.charAt(i) == b.charAt(i) ? '0' : '1');
    }
    
    return result.toString();
}
```
* Fungsi: xorBinary melakukan operasi XOR biner antara dua bilangan biner.
* Logika:
    * Jika digit a dan b berbeda, tambahkan 1 ke result, jika sama tambahkan 0.

## Main Method
```
public static void main(String[] args) {
    // Test penjumlahan: 110101 + 10111
    String num1 = "110101";
    String num2 = "10111";
    System.out.println("Penjumlahan: " + num1 + " + " + num2 + " = " + addBinary(num1, num2));
    
    // Test pengurangan: 111001 - 10101
    num1 = "111001";
    num2 = "10101";
    System.out.println("Pengurangan: " + num1 + " - " + num2 + " = " + subtractBinary(num1, num2));
    
    // Test perkalian: 1011 × 110
    num1 = "1011";
    num2 = "110";
    System.out.println("Perkalian: " + num1 + " × " + num2 + " = " + multiplyBinary(num1, num2));
    
    // Test operasi logika: 101011 dan 110101
    num1 = "101011";
    num2 = "110101";
    System.out.println("AND: " + num1 + " AND " + num2 + " = " + andBinary(num1, num2));
    System.out.println("OR: " + num1 + " OR " + num2 + " = " + orBinary(num1, num2));
    System.out.println("XOR: " + num1 + " XOR " + num2 + " = " + xorBinary(num1, num2));
}
```
* Fungsi: main berfungsi untuk menguji setiap metode dengan beberapa pasangan bilangan biner.
* Logika:
    * Setiap operasi dicetak ke layar dengan hasilnya, memberikan panduan bagi pengguna untuk memahami keluaran dari operasi biner.