Berikut adalah penjelasan dari setiap fungsi dalam kode tersebut beserta baris-baris kode yang mewakili fungsinya:

### 1. `desimaltobiner` - Konversi Desimal ke Biner
Fungsi ini mengonversi angka desimal menjadi representasi biner dalam bentuk `String`.

```java
public static String desimaltobiner(int desimal) {
    StringBuilder biner = new StringBuilder();
    while (desimal > 0) {
        int sisa = desimal % 2;
        biner.insert(0, sisa);
        desimal /= 2;
    }
    return biner.length() > 0 ? biner.toString() : "0";
}
```

### 2. `desimaltohexa` - Konversi Desimal ke Heksadesimal
Fungsi ini mengonversi angka desimal menjadi representasi heksadesimal dalam bentuk `String` menggunakan karakter heksadesimal (`0-9` dan `A-F`).

```java
public static String desimaltohexa(int desimal) {
    StringBuilder hexa = new StringBuilder();
    char[] hexachar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    while (desimal > 0) {
        int sisa = desimal % 16;
        hexa.insert(0, hexachar[sisa]);
        desimal /= 16;
    }
    return hexa.length() > 0 ? hexa.toString() : "0";
}
```

### 3. `binertodesimal` - Konversi Biner ke Desimal
Fungsi ini mengonversi angka biner dalam bentuk `String` menjadi angka desimal (`int`).

```java
public static int binertodesimal(String biner) {
    int desimal = 0;
    int panjang = biner.length();

    for (int i = 0; i < panjang; i++) {
        char bit = biner.charAt(panjang - 1 - i);
        if (bit == '1') {
            desimal += Math.pow(2, i);
        }
    }
    return desimal;
}
```

### 4. `binertohexa` - Konversi Biner ke Heksadesimal
Fungsi ini mengonversi angka biner dalam bentuk `String` menjadi angka heksadesimal dengan menggunakan konversi biner ke desimal terlebih dahulu.

```java
public static String binertohexa(String biner) {
    int desimal = binertodesimal(biner);
    return desimaltohexa(desimal);
}
```

### 5. `hexatodesimal` - Konversi Heksadesimal ke Desimal
Fungsi ini mengonversi angka heksadesimal dalam bentuk `String` menjadi angka desimal (`int`). Setiap karakter heksadesimal dikonversi ke nilai desimalnya menggunakan fungsi `hexCharToDigit`.

```java
public static int hexatodesimal(String hexa) {
    int desimalvalue = 0;
    int length = hexa.length();
    for (int i = 0; i < length; i++) {
        char hexchar = hexa.charAt(i);
        int digitvalue = hexCharToDigit(hexchar);
        desimalvalue = desimalvalue * 16 + digitvalue;
    }
    return desimalvalue;
}
```

### 6. `hexCharToDigit` - Konversi Karakter Heksadesimal ke Nilai Desimal
Fungsi ini mengonversi satu karakter heksadesimal (`0-9`, `A-F`) menjadi nilai desimal (`int`). Jika karakter tidak valid, fungsi ini akan melemparkan pengecualian.

```java
public static int hexCharToDigit(char hexachar) {
    if (hexachar >= '0' && hexachar <= '9') {
        return hexachar - '0';
    } else if (hexachar >= 'A' && hexachar <= 'F') {
        return 10 + (hexachar - 'A');
    } else {
        throw new IllegalArgumentException("Input tidak valid: " + hexachar);
    }
}
```

### 7. `hexatobiner` - Konversi Heksadesimal ke Biner
Fungsi ini mengonversi angka heksadesimal dalam bentuk `String` menjadi representasi biner. Setiap karakter heksadesimal dikonversi ke representasi biner menggunakan `hexachartobiner`.

```java
public static String hexatobiner(String hexa) {
    StringBuilder biner = new StringBuilder();

    for (int i = 0; i < hexa.length(); i++) {
        char hexachar = hexa.charAt(i);
        biner.append(hexachartobiner(hexachar));
    }
    return biner.toString();
}
```

### 8. `hexachartobiner` - Konversi Karakter Heksadesimal ke Representasi Biner
Fungsi ini mengonversi satu karakter heksadesimal (`0-9`, `A-F`) menjadi representasi biner dalam bentuk `String`. Fungsi ini menggunakan switch-case untuk menterjemahkan setiap karakter ke bentuk biner 4-bit.

```java
public static String hexachartobiner(char hexachar) {
    switch (hexachar) {
        case '0': return "0000";
        case '1': return "0001";
        case '2': return "0010";
        case '3': return "0011";
        case '4': return "0100";
        case '5': return "0101";
        case '6': return "0110";
        case '7': return "0111";
        case '8': return "1000";
        case '9': return "1001";
        case 'A': return "1010";
        case 'B': return "1011";
        case 'C': return "1100";
        case 'D': return "1101";
        case 'E': return "1110";
        case 'F': return "1111";
        default: throw new IllegalArgumentException("Karakter tidak valid: " + hexachar);
    }
}
```