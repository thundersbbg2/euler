#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int FonkDeger(int,int,int);
bool AsalMi(int);


int main ()
{
	int nMax,a,b,d,coef,n,aMax,bMax;
	bool e;
	nMax = 0;
	aMax = 0;
	bMax = 0;
	for (a=(-999) ; a<1000 ; a++)
	{
		for (b=(-1000) ; b<=1000 ; b++)
		{
			n = 0;
			d = FonkDeger(n,a,b);
			e = AsalMi(d);
			while (e)
			{
				n++;
				d = FonkDeger(n,a,b);
				e = AsalMi(d);
			}
			if (n > nMax)
			{
				nMax = n;
				aMax = a;
				bMax = b;
			}
		}
	}
	coef = aMax * bMax;
	printf("sequence of length : %d\n",nMax);
	printf("a : %d\n",aMax);
	printf("b : %d\n", bMax);
	printf("Pespese n degerleri icin en cök asal sayi cýkaran cöefficient'lerin carpimi : %d",coef);
	return 0;
}

int FonkDeger(int n , int x , int y)
{
	int c;
	c = n*n + x*n + y;
	c = fabs(c);
	return c;
}

bool AsalMi (int z)
{
	int sayac,f,i;
	sayac = 0;
	i = 2;
	while ((i<=z) && (sayac <= 1))
	{
		if (z%i == 0)
		{
			sayac++;
		}
		i++;
	}
	if (sayac == 1)
	{
		return true;
	}else{
		return false;
	}
}
