package oops;
public class Allo {
	 public static void main(String args[])
	    {
	        String har="";
	        int count=0,k,flag=0;
	        String s[]=new String[args.length];
	        for(int i=0;i<args.length;i++)
	        {
	            s[i]=new String(args[i]);
	        }for(int j=0;j<s[0].length();j++)
	        {
	            for(k=0;k<args.length;k++)
	            {
	                if(s[0].charAt(j)==s[k].charAt(j))
	                {
	                    count++;
	                }
	                else
	                {
	                flag=1;
	                break;}
	            }if(count==args.length)
	            {
	                har=s[0].substring(0,j+1);
	            }count=0;
	            if(flag==1)
	            break;
	        }
	        System.out.println(har);
	        
	    }

	
}

