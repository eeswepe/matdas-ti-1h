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

def bin_to_hex(a):
    b = bin_to_num(a)
    return num_to_hex(b)

def num_to_bin(a):
    s = ""
    while a > 0:
        b = a % 2
        a = a // 2
        s = str(b) + s
    return s

def xor(a, b):
    s = ""
    for i in range(len(a)):
        s = s + str(int(a[i]) ^ int(b[i%len(b)]))
    return s

def encrypt(a, b):
    return xor(a, b), bin_to_hex(xor(a,b))

def enc_string(a,b):
    s = ""
    a = str(a)
    for c in a:
        c = num_to_bin(ord(c))
        c = c.zfill(8)
        s += chr(bin_to_num(xor(c,b)))
    return s
