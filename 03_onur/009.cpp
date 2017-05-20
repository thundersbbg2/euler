#include <stdio.h>
#include <stdlib.h>

int main ()
{
	int a,b,c,ans;
	for (a=0 ; a<(1000/3) ; a++)
	{
		for (b=(a+1) ; b<(1000/2) ; b++)
		{
			c = 1000 - a - b;
			if ((c>b) && (c*c == b*b + a*a))
			{
				ans = a*b*c;
				printf("Cevap : %d\n",ans);
			}
		}
	}
	return 0;

}

