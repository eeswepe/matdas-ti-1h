def xor_bit(bit1, bit2):
    return '0' if bit1 == bit2 else '1'

def binary_xor(bin, key):
    result = []
    for i in range(len(bin)):
        bit1 = bin[i]
        bit2 = key[i % len(key)]  # Jika kunci lebih pendek, ulangi dari awal
        result.append(xor_bit(bit1, bit2))
    return ''.join(result)

def binary_to_hexadecimal(binary):
    hex_chars = "0123456789ABCDEF"
    length = len(binary)

    # Menambahkan nol di depan agar panjangnya kelipatan 4
    while length % 4 != 0:
        binary = '0' + binary
        length += 1

    hex_result = []
    for i in range(0, length, 4):
        nibble = binary[i:i + 4]
        hex_result.append(binary_nibble_to_hex(nibble))
    return ''.join(hex_result)

def binary_nibble_to_hex(nibble):
    decimal_value = 0
    power = 0
    # Menghitung nilai desimal dari nibble biner
    for bit in reversed(nibble):
        decimal_value += int(bit) * (2 ** power)
        power += 1
    # Mengonversi nilai desimal ke karakter heksadesimal
    return "0123456789ABCDEF"[decimal_value]

def main():
    data = input("Masukkan data biner untuk dienkripsi: ")
    key = input("Masukkan kunci biner untuk enkripsi (harus memiliki panjang yang sama atau lebih pendek dari data): ")

    # Memastikan panjang kunci tidak lebih panjang dari data
    if len(key) > len(data):
        print("Kunci lebih panjang dari data. Silakan masukkan kunci yang panjangnya sama atau lebih pendek.")
        return

    # Melakukan operasi XOR manual
    encrypted_binary = binary_xor(data, key)
    encrypted_hexadecimal = binary_to_hexadecimal(encrypted_binary)
    print("Data terenkripsi dalam biner:", encrypted_binary)
    print("Data terenkripsi dalam heksadesimal:", encrypted_hexadecimal)

if __name__ == "__main__":
    main()
