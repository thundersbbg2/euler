#include <stdio.h>
#include <stdlib.h>

int main ()
{
	unsigned long long int result , i , j , n , sonuc;
	printf("n degerini giriniz : ");
	scanf("%llu",&n);
	sonuc = 1;
	j = 1;
	for (i=(n+1) ; i<=(2*n) ; i++)
	{
		sonuc = sonuc * i / j;
		j++;
	}
	printf("Routes which it has 20x20 grid : %llu",sonuc);
	return 0;
}
