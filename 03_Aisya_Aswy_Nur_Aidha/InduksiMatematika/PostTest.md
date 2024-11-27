# TUGAS MATDAS
#### Aisya Aswy Nur Aidha (03) / TI 1H
 ##### INDUKSI MATEMATIKA (POST TEST)

	1. P(n) = 2 + 4 + 6 + .... + 2n = n(n + 1)
		i) Basis Induksi untuk n = 1
		   P(1) = 2.1 = 1(1 + 1)
				   2  =  2
	   ii) Langkah Induksi untuk n = n + 1
		   P(n + 1) = 2 + 4 + 6 + .... + 2n + 2(n + 1) = (n + 1)((n + 1) + 1)
					  2 + 4 + 6 + .... + 2n + (2n + 2) = (n + 1)(n + 2)
						  n(n + 1) + (2n + 2) = n² + 3n + 2
						  n(n + 1) + (2n + 2) = n² + n + 2n + 2
						  n(n + 1) + 2(n + 1) = n(n + 1) + 2(n + 1)
---
	2. P(n) = 1 + 4 + 9 + .... + n² = 1/6n(n + 1)(n + 2)
	   i) Basis Induksi untuk n = 1
		  P(1) = 1² = 1/6.1(1 + 1)(1 + 2)
				 1  = 1/6.6
				 1  =  1
	  ii) Langkah Induksi untuk n = n + 1
		  P(n + 1) = 1 + 4 + 9 + .... + n² = 1/6(n + 1)((n + 1) + 1)((n + 1) + 2)
				  1/6(n + 1)((n + 1) + 1)((n + 1) + 2)
				  1/6(n + 1)(n + 2)(n + 3)
				  1/6(n + 1)((2n² + 7n + 6)
				  1/6(n + 1)((2n² + 6n + n + 6)
				  1/6(n + 1) (2n² + n) + (6n + 6)
				  1/6(n + 1) n(2n + 1) + 6(n + 1)
				  1/6n(n + 1) (2n + 1) + 6(n + 1)
					 P(n) + 6(n + 1) = P(n + 1)
		1 + 4 + 9 + .... + n² + 6(n + 1) = P(n + 1)
---
	3. P(n) = 2 + 6 + 12 + .... + n(n + 1) = 1/3n(n + 1)(n + 2)
	   i) Basis Induksi untuk n = 1
		  P(1) = 1(1 + 1) = 1/3.1(1 + 1)(1 + 2)
					   2  = 1/3.6
					   2  =  2
	  ii) Langkah Induksi untuk n = n + 1
		  P(n + 1) = 2 + 6 + 12 + .... + n(n + 1) = 1/3n(n + 1)(n + 2)
				  1/3(n + 1)((n + 1) + 1)((n + 1) + 2)
				  1/3(n + 1)(n + 2)(n + 3)
				  1/3(n + 1)(n² + 3n + 2n + 6)
				  1/3(n + 1)(n² + 2n + 3n + 6)
				  1/3(n + 1)(n² + 2n)+(3n + 6)
				  1/3(n + 1) n(n + 2) + 3(n + 2)
				  1/3n(n + 1) (n + 2) + 3(n + 2)
					  P(n) + 3(n + 2) = P(n + 1)
			2 + 6 + 12 + .... + n(n + 1) + 3(n + 2) = P(n + 1)
---
Pembuktian menggunakan Induksi Matematika bahwa pernyataan-pernyataan diatas adalah benar untuk n >= 1