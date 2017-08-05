import java.util.*;

public class TallGuvi {

	public static void main(String[] args) {

			   ArrayList<Double> arraylist = new ArrayList<Double>();
			   Scanner sc=new Scanner(System.in);
			   System.out.println("enter the number of Students:");
			   int n=sc.nextInt();
			  double a[]=new double[n];
			   System.out.println("enter the height of "+n+" Students:");
			   for(int i=0;i<n;i++){
				   a[i]=sc.nextDouble();
				   arraylist.add((double) a[i]);
			   }
			   Collections.sort(arraylist);
			   System.out.println("enter the position:");
			 int y=sc.nextInt();
					System.out.println("The "+y+" tallest height is "+arraylist.get(n-y));
				}

	}


