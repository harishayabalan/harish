package zoomrx;

import java.util.Arrays;
import java.util.Scanner;

public class Day{
	public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
			System.out.println("Enter the day:");
			String Day=in.nextLine();
			Day=Day.toLowerCase();
			switch(Day){
			case "monday":
			case "mon":{
				System.out.println("true");
				break;
			}
			case "tuesday":
			case "tues":{
				System.out.println("true");
				break;
			}
			case "wednesday":
			case "wed":{
				System.out.println("true");
				break;
			}
			case "thursday":
			case "thurs":{
				System.out.println("true");
				break;
			}
			case "friday":
			case "fri":{
				System.out.println("true");
				break;
			}
			case "saturday":
			case "sat":{
				System.out.println("true");
				break;
			}
			case "sunday":
			case "sun":{
				System.out.println("false");
				break;
			}
			default:
				System.out.println("Invalid");
				break;
			
			}
		}
		}