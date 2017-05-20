sayi = 2 ** 1000

toplam = 0

while sayi != 0:
    toplam += sayi % 10
    sayi //= 10

print(toplam)
