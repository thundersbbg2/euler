#include <stdio.h>

#define n 10000
#define N 100000

void generatePrimes(int * primes) {
    int numbers[N];
    for(int i = 0; i < N; i++) {
        numbers[i] = i+1;
    }

    int k = 0;

    for(int i = 2; i < N && k < n; i++) {
        if (numbers[i] != 0) {
            primes[k++] = i;
            int j = i+i;

            while (j < N) {
                numbers[j] = 0;
                j += i;
            }
        }

    }

}

int number_of_factors(int number, int * primes) {
    int factors = 1;
    int upper = number / 2;
    int count, tmp_number;
    int i;
    for(i = 0; primes[i] <= upper; i++) {
        tmp_number = number;
        count = 0;
        while(tmp_number % primes[i] == 0) {
            tmp_number /= primes[i];
            count++;
        }
        factors *= count + 1;
    }
    return factors;
}

int main(void) {

    int primes[n];

    generatePrimes(primes);

    int number = 1;
    int i = 1;

    while (number_of_factors(number, primes) <= 500) {
        i++;
        number += i;
    }

    printf("%d\n", number);

    return 0;
}
