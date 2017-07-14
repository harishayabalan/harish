import java.util.*;
public class Pramid1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Integer Input:");
		int n=sc.nextInt();
		int n1=n;
		for(int i=n;i>0;i--){
for(int j=0;j<n1;j++){
	System.out.print("*");
}
System.out.print(" ");
for(int k=0;k<n1;k++){  
    System.out.print("*");
    
	}
System.out.println();
n1--;
		}
}
}