#include<stdio.h>
#include<conio.h>
int main()
{
int n,i;
unsigned long long factorial = 1;
printf("enter the number:");
scanf("%d",&n);
if(n<0)
printf("error! enter positive value: ");

else
{
for(i=1;i<=n;++i)
{
    factorial *=i;
}

printf("factorial value:%11u",n,factorial);
}
return 0;
}
