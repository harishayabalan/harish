import java.util.Scanner;

public class CoPrime {

	public static void main(String[] args) 
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Enter two numbers");
			int x=in.nextInt();
			int y=in.nextInt();
			System.out.println((isPrime(x)&&isPrime(y)?"Co-Prime":"Not Co-Prime"));
		}
		public static boolean isPrime(int q)
		{
			for(int i=2;i<=q/2;i++)
			{
				if(q%i==0)
				{
			 	return false;
				}
			}
			    return true;

	}

}
