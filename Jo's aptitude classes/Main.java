#include <stdio.h>
int main()
{
    int a,b,c,hcf,st,d;
	scanf("%d%d%d%d", &a,&b,&c,&d);
 
 	st=a<b?(a<c?a:c):(b<c?b:c);
 
	 for (hcf=st;hcf>=1;hcf--)
 	{
  	  if (a%hcf==0 && b%hcf==0 && c%hcf==0)
  		 break;
 	} 
 if(hcf==d)
   printf("Answer is correct.");
else
  printf("Answer is wrong.");
 return 0;
}
        