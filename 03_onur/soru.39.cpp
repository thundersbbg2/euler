#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main ()
{
	int p , a, b, maxsol , sol , maxp,c;
	maxsol = 0;
	for (p=1 ; p<=1000 ; p++)
	{
		sol = 0;
		for (a=1 ; a<=(int)((float)p/sqrt(2)) ; a++ )
		{
			for (b=1 ; b<=(int)((float)p/sqrt(2)) ; b++)
			{
				c = p - a - b;
				if (c*c == a*a + b*b)
				{
					sol++;
				}
			}
		}
		if (sol > maxsol)
		{
			maxp = p;
			maxsol = sol;
		}
	}
	printf("1000'den kucuk maksimum cozumum oldugu p sayisi ve cozum sayisi : %d / %d",maxp,maxsol);
	return 0;
}
