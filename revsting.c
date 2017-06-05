#include<stdio.h>
#include<string.h>
int main()
{
char a[100],tmp;
int x,y=0;
printf("enter string:");
gets(a);
x=0;
y=strlen(a)-1;
while(x<y)

{
      tmp = a[x];
      a[x] = a[y];
      a[y] = tmp;
      x++;
      y--;
   }
  printf("\nReverse string is :%s",a);
   return (0);

}
