import java.util.*;
public class LongString 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		ArrayList<Integer> al=new ArrayList<Integer>();
		HashSet<Character> h1=new HashSet<Character>();
		HashSet<String> h2=new HashSet<String>();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String s1=s.substring(i, j+1);
				char[] c=s1.toCharArray();
				for(int k=0;k<c.length;k++)
				{
					h1.add(c[k]);
				}
				if(s1.length()==h1.size())
				{
					h2.add(s1);
					al.add(s1.length());
				}
				h1.clear();	
			}
		}
		Collections.sort(al);
		for(String z:h2)
		{
			if(z.length()==(int)al.get(al.size()-1))
			{
				System.out.println(z);
			}
		}
	}
}