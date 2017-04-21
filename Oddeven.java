package guvi2;
import java.util.Scanner;
public class Oddeven {

	public static void main(String[] args) {
		Scanner oc=new Scanner(System.in);
System.out.println("enter the A value:");
	int a=oc.nextInt();
	if(a%2==0)
		System.out.println("even");
	else 
		System.out.println("odd");
	oc.close();

	
	}

}
