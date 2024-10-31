def num_to_bin(a):
    s = ""
    while a > 0:
        b = a % 2
        a = a // 2
        s = str(b) + s
    return s

def bin_to_num(b):
    b = str(b)
    n = 0
    for digit in b:
        n = n * 2 + int(digit)
    return n

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

def hex_to_num(h):
    h = str(h)
    n = 0
    power = 0
    hex_chars = "0123456789ABCDEF"
    for char in h[::-1]:
        index = hex_chars.index(char.upper())
        n += index * (16 ** power)
        power += 1
    return n

def hex_to_bin(a):
    b = hex_to_num(a)
    return num_to_bin(b)

def bin_to_hex(a):
    b = bin_to_num(a)
    return num_to_hex(b)
