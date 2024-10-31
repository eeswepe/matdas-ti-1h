def binary_to_decimal(biner):
    desimal = 0
    pangkat = len(biner) - 1
    for digit in biner:
        desimal += (int(digit) * (2 ** pangkat))
        pangkat -= 1
    return desimal

def desimal_to_biner(desimal):
    if desimal == 0:
        return "0"
    biner = []
    while desimal > 0:
        biner.append(str(desimal % 2))
        desimal //= 2
    return ''.join(biner[::-1])

def aritmatika_biner(biner1, operasi, biner2):
    desimal1 = binary_to_decimal(biner1)
    desimal2 = binary_to_decimal(biner2)
    operasi_desimal = 0
    
    if operasi == '*':
        operasi_desimal = desimal1 * desimal2
    elif operasi == '+':
        operasi_desimal = desimal1 + desimal2
    elif operasi == '-':
        operasi_desimal = desimal1 - desimal2
    elif operasi == '&':
        operasi_desimal = desimal1 & desimal2
    elif operasi == '|':
        operasi_desimal = desimal1 | desimal2
    elif operasi == '^':
        operasi_desimal = desimal1 ^ desimal2
    else:
        print("Operasi tidak valid!")
        return ""
    
    hasil_biner = desimal_to_biner(operasi_desimal)
    print(f"{biner1} {operasi} {biner2} = {hasil_biner}")
    return hasil_biner

def main():
    biner1 = input("Masukkan angka biner pertama: ")
    operasi = input("Masukkan operasi hitung: ")
    biner2 = input("Masukkan angka biner kedua: ")
    aritmatika_biner(biner1, operasi, biner2)

if __name__ == "__main__":
    main()
