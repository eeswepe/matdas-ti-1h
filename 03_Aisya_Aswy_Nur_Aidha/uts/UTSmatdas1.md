Program di atas adalah program Java yang mengonversi bilangan antara berbagai sistem bilangan: desimal, biner, dan heksadesimal. Program ini dibagi menjadi tiga bagian, masing-masing menangani konversi antara sistem bilangan yang berbeda. Berikut penjelasan fungsi dari setiap bagian program beserta potongan kodenya.

---

### Bagian 1: Konversi Desimal ke Biner dan Heksadesimal

1. **Inisialisasi Scanner dan Variabel**  
   Program menggunakan `Scanner` untuk membaca input desimal dari pengguna dan mendeklarasikan variabel yang dibutuhkan, seperti array `biner` untuk menyimpan hasil biner dan array `heksa` untuk menyimpan karakter heksadesimal.

   ```java
   Scanner sc = new Scanner (System.in);
   int desimal, sisa, i = 0;
   int biner[] = new int[100];
   char[] heksa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
   int desimal1;
   String bilHeksa = "";
   ```

2. **Input Desimal dari Pengguna**  
   Program meminta pengguna memasukkan bilangan desimal, yang disimpan dalam variabel `desimal`. Variabel `desimal1` disimpan sebagai salinan untuk konversi selanjutnya.
   
   ```java
   System.out.print("Masukkan bilangan Desimal  : ");
   desimal = sc.nextInt();
   desimal1 = desimal;
   ```

3. **Konversi Desimal ke Biner**  
   Menggunakan `while` loop untuk menghitung biner dari bilangan desimal. Sisa hasil pembagian (`desimal % 2`) disimpan dalam array `biner`, dan desimal dibagi 2 dalam setiap iterasi.

   ```java
   while(desimal != 0) {
       biner[i] = desimal % 2;
       desimal = desimal / 2;
       i++;
   }
   ```

4. **Output Hasil Biner**  
   Program mencetak bilangan biner dengan membaca array `biner` dari belakang.

   ```java
   for (int j = i - 1; j >= 0; j--) {
       System.out.print(biner[j]);
   }
   ```

5. **Konversi Desimal ke Heksadesimal**  
   Menggunakan `while` loop lain untuk menghitung bilangan heksadesimal. Sisa hasil pembagian (`desimal1 % 16`) digunakan sebagai indeks untuk array `heksa`, dan karakter yang sesuai ditambahkan ke string `bilHeksa`.

   ```java
   while(desimal1 > 0) {
       sisa = desimal1 % 16;
       bilHeksa = heksa[sisa] + bilHeksa;
       desimal1 = desimal1 / 16;
   }
   ```

6. **Output Hasil Heksadesimal**  
   Program mencetak hasil konversi heksadesimal.

   ```java
   System.out.println("Bilangan Heksadesimalnya   : " + bilHeksa);
   ```

---

### Bagian 2: Konversi Biner ke Desimal dan Heksadesimal

1. **Input Bilangan Biner**  
   Program meminta pengguna memasukkan bilangan biner dan menginisialisasi variabel untuk menyimpan nilai desimalnya.

   ```java
   System.out.print("Masukkan bilangan Biner    : ");
   bilBiner = sc.nextInt();
   ```

2. **Konversi Biner ke Desimal**  
   Menggunakan `while` loop untuk menghitung nilai desimal dari bilangan biner. Setiap digit biner (`reminder`) dikalikan dengan 2 pangkat `i` dan ditambahkan ke `desimal`.

   ```java
   while (bilBiner != 0) {
       reminder = bilBiner % 10;
       desimal += reminder * Math.pow(2, i);
       i++;
       bilBiner /= 10;
   }
   ```

3. **Konversi Desimal ke Heksadesimal**  
   Program menggunakan array `heksa` untuk menyimpan nilai heksadesimal dari desimal yang dihitung. Proses serupa dilakukan seperti pada Bagian 1.

   ```java
   while (desimal1 > 0) {
       reminder = desimal1 % 16;
       bilHeksa = heksa[reminder] + bilHeksa;
       desimal1 /= 16;
   }
   ```

4. **Output Hasil Konversi**  
   Program mencetak hasil konversi ke desimal dan heksadesimal.

   ```java
   System.out.print("Bilangan Desimalnya adalah : " + desimal);
   System.out.println("Bilangan Heksadesimalnya   : " + bilHeksa);
   ```

---

### Bagian 3: Konversi Heksadesimal ke Desimal dan Biner

1. **Input Bilangan Heksadesimal**  
   Program meminta pengguna memasukkan bilangan heksadesimal dan menyimpannya dalam variabel `bilHeksa`.

   ```java
   System.out.print("Masukkan bilangan Heksadesimal : ");
   bilHeksa = sc.nextLine().toUpperCase();
   ```

2. **Konversi Heksadesimal ke Desimal**  
   Menggunakan `for` loop untuk menghitung nilai desimal dari bilangan heksadesimal. Setiap karakter `bilHeksa` dikonversi ke nilai desimal, lalu dijumlahkan dengan mengalikan 16 untuk tiap digit.

   ```java
   for (int i = 0; i < panjang; i++) {
       char karakter = bilHeksa.charAt(i);
       if (karakter >= '0' && karakter <= '9') {
           nilai = karakter - '0';
       } else if (karakter >= 'A' && karakter <= 'F') {
           nilai = karakter - 'A' + 10;
       }
       desimal = desimal * 16 + nilai;
   }
   ```

3. **Konversi Desimal ke Biner**  
   Program menghitung biner dari hasil desimal menggunakan `while` loop. Sisa hasil pembagian (`desimalBiner % 2`) ditambahkan di awal string `bilBiner`.

   ```java
   while (desimalBiner > 0) { 
       int sisa = desimalBiner % 2;
       bilBiner = sisa + bilBiner;
       desimalBiner /= 2;
   }
   ```

4. **Output Hasil Konversi**  
   Program mencetak hasil konversi dari heksadesimal ke desimal dan biner.

   ```java
   System.out.println("Bilangan Desimalnya adalah     : " + desimal);
   System.out.println("Bilangan Binernya adalah       : " + bilBiner);
   ```