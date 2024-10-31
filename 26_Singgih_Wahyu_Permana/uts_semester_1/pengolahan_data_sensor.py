def num_to_bin(a):
    s = ""
    while a > 0:
        b = a % 2
        a = a // 2
        s = str(b) + s
    return s

def num_to_hex(n):
    if n == 0:
        return "0"
    hex_chars = "0123456789ABCDEF"
    hex_str = ""
    while n > 0:
        remainder = n % 16
        hex_str = hex_chars[remainder] + hex_str
        n = n // 16
    return hex_str

def main():
    suhu = input("Masukkan suhu: ")
    kelembapan = input("Masukkan kelembapan: ")
    co2 = input("Masukkan CO2: ")

    suhu_bin = num_to_bin(int(float(suhu)))
    kelembapan_bin = num_to_bin(int(float(kelembapan)))
    co2_bin = num_to_bin(int(float(co2)))

    suhu_hex = num_to_hex(int(float(suhu)))
    kelembapan_hex = num_to_hex(int(float(kelembapan)))
    co2_hex = num_to_hex(int(float(co2)))

    print("Suhu dalam biner: ", suhu_bin)
    print("Kelembapan dalam biner: ", kelembapan_bin)
    print("CO2 dalam biner: ", co2_bin)

    print("Suhu dalam hex: ", suhu_hex)
    print("Kelembapan dalam hex: ", kelembapan_hex)
    print("CO2 dalam hex: ", co2_hex)

if __name__ == "__main__":
    main()
