toplam = 0

x = 1
y = 1

while y < 4000000:
    y = x + y
    x = y - x
    if y % 2 == 0:
        toplam += y

print(toplam)
