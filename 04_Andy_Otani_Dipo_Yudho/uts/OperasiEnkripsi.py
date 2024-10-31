def binary_to_decimal(biner):
    desimal = 0
    pangkat = len(biner) - 1
    for digit in biner:
        desimal += int(digit) * (2 ** pangkat)
        pangkat -= 1
    return desimal

def decimal_to_hexadecimal(desimal):
    hex_chars = "0123456789ABCDEF"
    if desimal == 0:
        return "0"
    heksadesimal = []
    while desimal > 0:
        heksadesimal.append(hex_chars[desimal % 16])
        desimal //= 16
    return ''.join(heksadesimal[::-1])

def main():
    pesan_dasar = input("Masukkan pesan dasar: ")
    kunci = "10101010"
    operasi_XOR = ""
    hasil_biner = []

    if len(pesan_dasar) == len(kunci):
        for i in range(len(pesan_dasar)):
            angka1 = int(pesan_dasar[i])
            angka2 = int(kunci[i])
            hasil_XOR = angka1 ^ angka2
            operasi_XOR += str(hasil_XOR)
            hasil_biner.append(str(hasil_XOR))
        
        print("\nHasil Enkripsi (Biner):", operasi_XOR)
        hasil_enkripsi_biner = ''.join(hasil_biner)
        
        # Konversi hasil biner ke heksadesimal
        hasil_desimal = binary_to_decimal(hasil_enkripsi_biner)
        hasil_hex = decimal_to_hexadecimal(hasil_desimal)
        print("Hasil Enkripsi (Heksadesimal):", hasil_hex)
    else:
        print("Panjang pesan dasar harus sama dengan panjang kunci (8 bit).")

if __name__ == "__main__":
    main()
