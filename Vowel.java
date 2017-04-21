package guvi2;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
Scanner cd=new Scanner(System.in);
System.out.println("enter the alphabet:");
char mn=cd.next().charAt(0);
if(mn=='a'||mn=='e'||mn=='i'||mn=='o'||mn=='u')
{	System.out.println("vowel");}
else	if(mn=='A'||mn=='E'||mn=='I'||mn=='O'||mn=='U')
		{System.out.println("vowel");}
		else
		{
			System.out.println("consonant");}
cd.close();
	}

}
