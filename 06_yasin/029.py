distinctPower = []

for i in range(2, 101):
    for j in range(2, 101):
        power = i ** j
        if power not in distinctPower:
            distinctPower.append(power)

print(len(distinctPower))
