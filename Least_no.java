import java.util.*;
import java.util.Arrays;
public class Least_no {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the value:");
int a=sc.nextInt();
String str=String.valueOf(a);;
char b[]=str.toCharArray();
Arrays.sort(b);
System.out.println("enter the number of digit delete :");
int x=sc.nextInt();
for(int i=0;i<x-1;i++){
System.out.print(b[i]);
	}
	}
}
