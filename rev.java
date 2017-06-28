import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter an integer:");
	    int n=sc.nextInt();
	    int ans=0;
	    int c=0;
	    int rev;
	    while(n>0)
	    {
	   
	        rev=n%10;
        	n=n/10;
        	ans=ans*10+rev;
        }
	
	System.out.println("answer"+ans);
	
	}

}
