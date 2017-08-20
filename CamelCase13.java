import java.util.Scanner;

public class CamelCase13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s= sc.nextLine();
        String[] words = s.split("[A-Z]");
        if(words.length>2){
        System.out.println("CamelCase");}
        else
        	 System.out.println("Not CamelCase");
    }
}