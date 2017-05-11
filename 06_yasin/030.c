#include <stdio.h>
#include <stdbool.h>
#include <math.h>

bool basamaklarin5UssuSayiyaEsitMi(int sayi) {
    int toplam = 0;
    int bozulmamisSayi = sayi;

    while (sayi != 0) {
        toplam += pow(sayi % 10, 5);
        sayi /= 10;
    }

    return toplam == bozulmamisSayi;
}

int main(void) {
    int toplam = 0;
    for(int i = 10; i < 354294; i++) {
        if (basamaklarin5UssuSayiyaEsitMi(i)) {
            toplam += i;
        }
    }
    printf("%d\n", toplam);
}
