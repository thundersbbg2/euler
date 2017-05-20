#include <stdio.h>
#include <stdlib.h>

int LowTermDen(int,int);

int main ()
{
	int i , j , k , num_pro , denum_pro,sonuc;
	num_pro = 1;
	denum_pro = 1;
	for (i=1 ; i<10 ; i++)
	{
		for (j=1 ; j<10 ; j++)
		{
			for (k = 1 ; k<10 ; k++)
			{
				if (((10*i+j)*k) == ((10*j+k)*i))
				{
					num_pro *=i;
					denum_pro *=k;
				}
			}
		}
	}
	sonuc = LowTermDen(num_pro,denum_pro);
	printf("Sonuc : %d",sonuc);
	return 0;
}

int LowTermDen(int a , int b)
{
	int l , c , d;
	l = 3;
	c = a;
	d = b;
	while ((c % 2 == 0) && (d % 2 == 0))
	{
		c = c/2;
		d = d/2;
	}
	while ((l<=c) && (l<=d))
	{
		while ((c % l == 0) && (d % l == 0))
		{
			c = c / l;
			d = d / l;
		} 
		l = l + 2; 
	}
	return d;
}
