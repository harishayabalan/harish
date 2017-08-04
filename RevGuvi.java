import java.util.*;
public class RevGuvi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        for(int i=1;i<=s.length();i++){
        	System.out.print(s.charAt(s.length()-i));
        }
	}

}
