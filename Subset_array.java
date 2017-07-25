import java.util.*;
public class Subset_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array1 size:");
		int n1=sc.nextInt();
		System.out.println("enter the array2 size:");
		int n2=sc.nextInt();
		int[] array1 = new int[n1];
		int[] array2 = new int[n2];
		System.out.println("enter the array1");
		for(int i=0;i<n1;i++)
		{
			array1[i]=sc.nextInt();
		}
		System.out.println("enter the array2");
		for(int j=0;j<n2;j++)
		{
			array2[j]=sc.nextInt();
		}
		
		ArrayList<Integer> Al1 = new ArrayList<Integer>();
		ArrayList<Integer> Al2 = new ArrayList<Integer>();
		
		for(int i=0;i<array1.length;i++){
			Al1.add(array1[i]);
		}
		System.out.println("ArrayList1 : "+Al1);
		for(int j=0;j<array2.length;j++){
			Al2.add(array2[j]);
		}
		System.out.println("ArrayList2 : "+Al2);
		
		if(Al1.containsAll(Al2)){
			System.out.println("Subset");
		}
		else{
			System.out.println("Not subset");
	}}}
