#include <stdlib.h>
#include <stdio.h>

unsigned int Carpan(unsigned int);

int  main ()
{
	unsigned int n , sonuc , i , e1 , e2;
	printf("n degerini giriniz : ");
	scanf("%u",&n);
	sonuc = 0;
	for (i=1 ; i<n ; i++)
	{
		e1 = Carpan(i);
		e2 = Carpan(e1);
		if ((e2==i) && (e2 >e1))
		{
			sonuc = sonuc + e1 + e2;
		}
	}
	printf("the sum of amicable numbers which are less than %u : %u" , n, sonuc);
	return 0;
}

unsigned int Carpan(unsigned int a)
{
	unsigned int c , x , y;
	c = 1;
	x = 2;
	y = a;
	while (x < y)
	{
		if (a % x == 0)
		{
			y = a / x;
			c = c + x + y;
		}
		x++;
	}
	return c;
}
