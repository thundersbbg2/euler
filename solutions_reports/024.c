#include <stdio.h>
#include <stdbool.h>

int factorial(int num) {
    int result = 1;

    for(int i = 2; i <= num; i++) {
        result *= i;
    }

    return result;
}

int main(void) {
    int numbers[] = {0,1,2,3,4,5,6,7,8,9};
    int oneMillion[10];

    int i = 9;
    int sum = 0;
    int index = 0;

    while(i > 0) {
        int j = 0;
        while (sum < 1000000) {
            sum += factorial(i);
            j++;
        }
        sum -= factorial(i);
        i--;
        j--;
        oneMillion[index++] = numbers[j];

        for(int k = j; k < 9; k++) {
            numbers[k] = numbers[k+1];
        }
    }

    sum = 0;

    for(i = 0; i < 9; i++) {
        sum += oneMillion[i];
    }

    oneMillion[9] = 45 - sum;

    for(int i = 0; i < 10; i++) {
        printf("%d", oneMillion[i]);
    }

    printf("\n");

    return 0;
}
