#include <stdio.h>
#include <stdlib.h>

int main ()
{
	unsigned long long int n , i , l_prime;
	printf("n sayisini giriniz : ");
	scanf("%llu",&n);
	i = 3;
	while (n % 2 == 0)
	{
		n = n / 2;
		l_prime = 2;
	}
	while (n != 1)
	{
		while (n % i == 0)
		{
			n = n / i;
			l_prime = i;
		}
		i = i + 2;
	}
	printf("En buyuk asal carpan : %llu\n",l_prime);
	return 0;
}


