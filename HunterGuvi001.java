import java.util.*;
public class HunterGuvi001 {

	public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the size:");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=sc.nextInt();}
for(int i=0;i<n;i++){
if(a[i]==i){
	System.out.println("the number "+i+" equals its index: "+i);
}
}
}
}
