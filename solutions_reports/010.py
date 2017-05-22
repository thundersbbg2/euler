toplam = 0

primes = []

for i in range(2000000):
    primes.append(1)

for i in range(2, 2000000):
    if primes[i] == 1:
        toplam += i
        j = i + i
        while j < 2000000:
            primes[j] = 0
            j += i

print(toplam)
