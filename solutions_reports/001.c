#include <stdio.h>

int main(void) {
    int sum = 0;
    for(int i = 3; i < 1000; i+=3) {
        sum += i;
    }
    for (int i = 5; i < 1000; i+=5) {
        if (i % 15 != 0)
            sum += i;
    }
    printf("%d\n", sum);
    return 0;
}
