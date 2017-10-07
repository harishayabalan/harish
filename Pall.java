
import java.util.Scanner;

public class Pall{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		int l=str.length();
		for(int i=0;i<l;i++){
		for(int j=i+1;j<l;j++){
		if(str.charAt(i)==str.charAt(j)){
		String t1=str.substring(i,j+1);
		StringBuffer t2=new StringBuffer(t1);
		String reverse=t2.reverse().toString();
		if(t1.equals(reverse)){
		System.out.println(t1);	
		}
        }}}}}