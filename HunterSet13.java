import java.util.*;
public class HunterSet13{
public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
String s=sc.nextLine();

char a[]=s.toCharArray();
for(int i=0;i<s.length();i++){
	int f=0;
for(int j=0;j<s.length();j++){
	if(a[i]==a[j]){
		f++;
	}
	}
	if(f==1){
		System.out.print(a[i]);
}
}
}}