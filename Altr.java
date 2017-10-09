import java.util.*;

public class Altr{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
Arrays.sort(a);
int x=0;
int y=n-1;
int z=n/2;
for(int i=0;i<z;i++)
{
	System.out.print(a[y]+" ");
	y--;
	System.out.print(a[x]+" ");
	x++;
}
System.out.print(a[z]+" ");
	}
	
	}