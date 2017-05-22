#include <stdio.h>
#include <stdlib.h>

long int Hexa(long int);
long int Penta(long int);
long int isPenta(long int , long int);

int main ()
{
	long int i , result;
	i = 144;
	result = Hexa(i);
	while (isPenta(result,i) != 0)
	{
		i++;
		result = Hexa(i);
	}
	 i = 2*i - 1;
	printf("Bulunan triangle, hexagonal ve pentagonal sayi : %ld\n", result);
	return 0;
}

long int Hexa(long int a)
{
	long int b;
	b = a * (2*a-1);
	return b;
}

long int Penta (long int c)
{
	long int d;
	d = c * (3*c - 1) / 2;
	return d;
}

long int isPenta(long int x , long int f)
{
	long int r;
	r = x - Penta(f);
	while (r > 0)
	{
		f++;
		r = x - Penta(f);
	}
	return r;
}
