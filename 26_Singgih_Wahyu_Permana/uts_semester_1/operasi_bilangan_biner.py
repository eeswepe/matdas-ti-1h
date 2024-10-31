def add_bin(a, b):
    n = max(len(a), len(b))
    a = a.zfill(n)
    b = b.zfill(n)
    hasil = ""
    simpan = 0
    for i in range(n-1, -1, -1):
        jumlah_tunggal = simpan
        jumlah_tunggal += int(a[i])
        jumlah_tunggal += int(b[i])

        if jumlah_tunggal % 2 == 1:
            hasil = '1' + hasil
        else:
            hasil = '0' + hasil

        if jumlah_tunggal < 2:
            simpan = 0
        else:
            simpan = 1       

    if simpan != 0:
        hasil = '1' + hasil
    return hasil

def subtract_bin(a, b):
    n = max(len(a), len(b))
    a = a.zfill(n)
    b = b.zfill(n)
    hasil = ""
    pinjam = 0
    for i in range(n-1, -1, -1):
        pengurangan_tunggal = int(a[i]) - int(b[i]) - pinjam
        if pengurangan_tunggal < 0:
            hasil = '1' + hasil
            pinjam = 1
        else:
            hasil = str(pengurangan_tunggal) + hasil
            pinjam = 0
    return hasil

def multiply_bin(a, b):
    n = max(len(a), len(b))
    a = a.zfill(n)
    b = b.zfill(n)
    hasil = ""

    for i in range(n-1, -1, -1):
        if int(b[i]) == 1:
            hasil = add_bin(hasil, a)
        a = a[1:] + '0'

    return hasil

def and_bin(a, b):
    n = max(len(a), len(b))
    a = a.zfill(n)
    b = b.zfill(n)
    hasil = ""
    for i in range(n):
        tambahan = int(a[i]) & int(b[i])
        hasil += str(tambahan)

    return hasil

def or_bin(a, b):
    n = max(len(a), len(b))
    a = a.zfill(n)
    b = b.zfill(n)
    hasil = ""
    for i in range(n):
        tambahan = int(a[i]) | int(b[i])
        hasil += str(tambahan)
    return hasil

def xor_bin(a, b):
    
    n = max(len(a), len(b))
    a = a.zfill(n)
    b = b.zfill(n)
    hasil = ""
    for i in range(n):
        tambahan = int(a[i]) ^ int(b[i])
        hasil += str(tambahan)
    return hasil
