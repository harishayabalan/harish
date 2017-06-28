import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value");
	    int n=sc.nextInt();
	    int x=1;
	    for(int i=1;i<=n;i++)
	    {
	    	  x=i*x;
	          
	    }
	    System.out.println(x);
	
	}

}
