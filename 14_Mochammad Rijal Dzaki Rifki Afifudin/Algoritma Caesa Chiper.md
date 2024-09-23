## Penerapan Algoritma Caeser Chiper Dynamic Programming

### Pengertian

**Caesar Cipher** adalah metode enkripsi sederhana yang digunakan untuk menyembunyikan pesan dengan mengganti setiap huruf dengan huruf lain yang berada pada posisi tertentu dalam alfabet. Nama algoritma ini diambil dari Julius Caesar.

### Konsep

Dasar dari **Caesar Cipher** adalah *pergeseran.* Setiap huruf dalam pesan asli (plaintext) digeser sejauh sejumlah posisi tertentu. Misalnya, jika kita menggunakan pergeseran tiga, maka huruf 'A' akan menjadi 'D', 'B' menjadi 'E', dan seterusnya. Metode ini termasuk dalam kategori kriptografi simetris, di mana pengirim dan penerima menggunakan kunci yang sama untuk mengenkripsi dan mendekripsi pesan.

### Penerapan Caeser Chiper dalam Bahasa Pemprograman Java

```
public class CaesarCipherDP {

    // Fungsi untuk menginisialisasi array hasil enkripsi

    private static char[] initializeEncryptionArray(int shift) {
        char[] encryptedLetters = new char[26];
        for (int i = 0; i < 26; i++) {

            // Menggeser huruf dan menyimpannya di array
            encryptedLetters[i] = (char) ((i + shift) % 26 + 'A');
        }
        return encryptedLetters;
    }

    // Fungsi untuk mengenkripsi pesan

    public static String encryptMessage(String message, int shift) {
        char[] encryptedLetters = initializeEncryptionArray(shift);
        StringBuilder encryptedMessage = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {

                // Hanya mengenkripsi huruf kapital
                encryptedMessage.append(encryptedLetters[c - 'A']);
            } else {

                // Menyimpan karakter selain huruf
                encryptedMessage.append(c);
            }
        }

        return encryptedMessage.toString();
    }

    public static void main(String[] args) {
        String message = "POLINEMA";
        int shift = 3;

        String encrypted = encryptMessage(message, shift);
        System.out.println("Pesan terenkripsi: " + encrypted);
    }
}

```

### Hasil 

```

    Pesan terenkripsi: SROLQHPD

```

### Penjelasan

- **nitializeEncryptionArray:** Fungsi ini menginisialisasi array *encryptedLetters* yang menyimpan huruf-huruf terenkripsi berdasarkan kunci pergeseran.
- **encryptMessage:** Fungsi ini menerima pesan dan kunci pergeseran, kemudian menggunakan *encryptedLetters* untuk mengenkripsi setiap huruf dalam pesan.
- **main:** Fungsi ini mendefinisikan pesan yang ingin dienkripsi dan mencetak hasilnya.
- **Hasil:** Kalimat *POLINEMA* berubah Menjadi *SROLQHPD*


### Kesimpulan

Penerapan **Algoritma Caesar Cipher**\ menggunakan pendekatan Dynamic Programming dalam menggunakan bahasa Pemprogramman Java menunjukkan efisiensi dalam proses enkripsi. Dengan menyimpan hasil enkripsi setiap huruf dalam array, kita menghindari perhitungan ulang saat mengenkripsi pesan yang sama. Ini mempercepat proses enkripsi, terutama untuk pesan yang panjang.