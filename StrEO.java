import java.util.Scanner;

public class StrEO {
	
	public static void main(String[] args) {
		String str;
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		    StringBuffer sb = new StringBuffer();
		    for (String s : str.split(" ")) {
		        sb.append(Character.toUpperCase(s.charAt(0)));
		        if (s.length() > 1) {
		         sb.append(s.substring(1, s.length()).toLowerCase());
		        }
		    }
		   
	System.out.println(sb);
	}
	}

