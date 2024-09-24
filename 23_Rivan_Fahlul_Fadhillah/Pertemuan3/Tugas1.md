# Contoh Algoritma Diffie-Hellman

## Deskripsi
Algoritma Diffie-Hellman adalah metode untuk bertukar kunci kriptografis secara aman melalui saluran publik. Dalam contoh ini, kita akan menunjukkan langkah-langkah untuk menghasilkan kunci rahasia bersama antara dua pihak, Fata dan Rivan.
Melakukan inisialisasi parameter:

•	Menetukan bilangan prima p dan basis g (generator). Misalnya, kita memilih p = 97 dan g = 5. Ini merupakan elemen dari himpunan bilangan bulat modulo p.

Pemilihan Private Key :

•	Kami masing – masing memilih kunci pribadi secara acak dari himpunan {1,2, ..., p-1}:

Fata memilih x (misalnya x = 36) 

Rivan memilih y (misalnya y = 58)


## Kode Pemrograman

```python


def power_mod(base, exponent, modulus):
    """Fungsi untuk menghitung (base^exponent) mod modulus dengan metode eksponensial cepat."""
    result = 1
    base = base % modulus
    while exponent > 0:
        if (exponent % 2) == 1:  # Jika exponent ganjil
            result = (result * base) % modulus
        exponent = exponent >> 1  # Membagi exponent dengan 2
        base = (base * base) % modulus
    return result

def diffie_hellman():
    # Inisialisasi parameter
    p = 97  # Bilangan prima
    g = 5   # Basis

    # Pemilihan kunci pribadi
    x = 36  # Kunci pribadi Fata
    y = 58  # Kunci pribadi Rivan

    # Menghitung kunci publik
    X = power_mod(g, x, p)  # Kunci publik Fata
    Y = power_mod(g, y, p)  # Kunci publik Rivan

    print(f"Kunci Publik Alice (X): {X}")
    print(f"Kunci Publik Bob (Y): {Y}")

    # Menghitung kunci rahasia bersama
    K_Fata = power_mod(Y, x, p)  # Kunci rahasia Fata
    K_Rivan = power_mod(X, y, p)     # Kunci rahasia Rivan

    print(f"Kunci Rahasia Bersama Fata (K): {K_Fata}")
    print(f"Kunci Rahasia Bersama Rivan (K): {K_Rivan}")

# Menjalankan fungsi
if __name__ == "__main__":
    diffie_hellman()
