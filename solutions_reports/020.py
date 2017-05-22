def factorial(number):
    result = 1

    for i in range(2, number + 1):
        result *= i

    return result

def sum_of_digits(number):
    result = 0
    while number != 0:
        result += number % 10
        number //= 10
    return result

factorial_of_100 = factorial(100)
print(sum_of_digits(factorial_of_100))
