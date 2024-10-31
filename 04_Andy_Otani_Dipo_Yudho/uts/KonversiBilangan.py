def desimal_ke_biner(desimal):
    return bin(desimal)[2:]

def desimal_ke_heksadesimal(desimal):
    return hex(desimal)[2:].upper()

def biner_ke_desimal(biner):
    return int(biner, 2)

def heksadesimal_ke_desimal(heksa):
    return int(heksa, 16)

def main():
    mulai = True
    while mulai:
        print("\nPilih jenis konversi:")
        print("1. Desimal ke Biner")
        print("2. Desimal ke Heksadesimal")
        print("3. Biner ke Desimal")
        print("4. Heksadesimal ke Desimal")
        print("0. Keluar")
        pilihan = int(input("Masukkan pilihan: "))
        
        if pilihan == 1:
            desimal = int(input("Masukkan bilangan desimal: "))
            hasil_biner = desimal_ke_biner(desimal)
            print(f"Hasil dalam biner: {hasil_biner}")
        
        elif pilihan == 2:
            desimal = int(input("Masukkan bilangan desimal: "))
            hasil_heksa = desimal_ke_heksadesimal(desimal)
            print(f"Hasil dalam heksadesimal: {hasil_heksa}")
        
        elif pilihan == 3:
            biner = input("Masukkan bilangan biner: ")
            hasil_desimal = biner_ke_desimal(biner)
            print(f"Hasil dalam desimal: {hasil_desimal}")
        
        elif pilihan == 4:
            heksa = input("Masukkan bilangan heksadesimal: ")
            hasil_desimal = heksadesimal_ke_desimal(heksa)
            print(f"Hasil dalam desimal: {hasil_desimal}")
        
        elif pilihan == 0:
            print("Program selesai.")
            mulai = False
        
        else:
            print("Pilihan tidak valid. Coba lagi.")

if __name__ == "__main__":
    main()
