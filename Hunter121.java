import java.util.*;
public class Hunter121 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
int x=n/2;
int t=x+1;
   int p=0;
    for(int i=0;i<t;i++){
    	int a=97+x;
    if(i!=0){
    	p=i-1;
    }
    	for(int j=0;j<x-p;j++){
    		System.out.print((char)a);
    		a--;
    	}
    	if(i==0){
    		System.out.print("a");
    	}
    	else {for(int s=0;s<i+p;s++){
			System.out.print(" ");
		}}
    	for(int j=0;j<x-p;j++){
    		a++;
    		System.out.print((char)a);
       	}
    	System.out.println();
    }
    int b=0;
    int e=x+p-1;
    for(int i=0;i<x;i++){
    	int a=97+x;
    	if(i==x-1){b=1;}
    	for(int j=0;j<=i+1-b;j++){
    		System.out.print((char)a);
    		a--;
    	}
    	if(i==x-1){
    		System.out.print("a");
    	}
    	else {for(int s=1;s<e-i-i;s++){
			System.out.print(" ");
		}}
    	if(i==x-1){b=1;}
    	for(int j=0;j<=i+1-b;j++){
    		a++;
    		System.out.print((char)a);
       	}
    	System.out.println();
	}
}}
