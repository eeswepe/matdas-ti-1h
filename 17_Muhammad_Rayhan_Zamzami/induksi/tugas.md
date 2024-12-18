# INDUKSI MATEMATIKA
**Muhammad Rayhan Zamzami 
244107020027
17**

## Soal 1

Menguji Basis
```
P(n)= 2 + 4 + 6 + ... + 2n = n (n+1)
p(1) = 2 + 4 + 6 +...+ 2.1 = 1(1+1)
					   2  = 1 (2)
					   2  = 2
```
Benar

Langkah Induksi 
```
p(n+1) = n(n+1) + 2(n+1) = (n+1) (n+1+1)
	     n² + n + 2n + 2 = (n+1) (n+2)
	     n² + 3n + 2	 = n² + 2n + n + 2
					     = n² + 3n + 2
					     = n(n+1) + (2n + 2)
					     = n(n+1) + 2(n+1) 
```
```
p(n+1) = 2 + 4 + 6 + ...+ 2n + 2n + 2
p(2) = 2(1) + 2
p(2) = 4
```
**TERBUKTI**

## Soal 2
Menguji Basis
```
P(n)= 1 + 4 + 9 +...+ n² = 1/6n (n+1) (2n+1)
p(1) = 1 + 4 + 9 + ...+ 1² = 1/6.1 (1+1) (2.1+1)
						1 = 1/6 (2) (3)
						1 = 1/3 (3)
						1 = 1
```
Benar

Langkah Induksi
```
p(n+1) = 1/6(n+1) (n+1+1) (2(n+1)+1)
	   = 1/6(n+1) (n+2) (2n+3)
	   = 1/6(n+1) (2n² + 3n + 4n + 6)
	   = 1/6(n+1) (2n² + 7n + 6)
	   = 1/6(n+1) (2n² + n + 6n + 6)
	   = 1/6(n+1) . n(2n+1) + 6(n+1)
```
```
p(n+1) = 1 + 4 + 9 + ... + n² + 6(n+1)
p(2) = 6.2
p(2) = 12
```
**TERBUKTI**
## Soal 3
Menguji basis
```
P(n) = 2 + 6 + 12 +...+ n(n+1) = 1/3n (n+1)(n+2)
p(1) = 2 + 6 + 12 +....+ 1(1+1) = 1/3.1 (1+1) (1+2)
p(1) = 2 + 6 + 12 +...+ 2 = 1/3. 2 . 3
						2 = 2
```
Langkah Induksi
```
p(n+1) = 1/3(n+1) (n+1+1) (n+2+1)
	   = 1/3(n+1) (n+2) (n+3)
	   = 1/3(n+1) (n² + 3n + 2n + 6)
	   = 1/3(n+1) n(n+2) + 3(n+2)
	   = 1/3(n+1) (n+2) + 3(n+2) 	
```
```
p(n+1) = 2 + 6 + 12 +...+ n(n+1) + 3(n+2)
p(2) = 3(1+2)
	 = 3 (3)
	 = 9
```

**TERBUKTI**