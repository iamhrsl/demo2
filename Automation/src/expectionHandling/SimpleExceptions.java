package expectionHandling;

import java.util.Scanner;

public class SimpleExceptions {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Two Numbers:");
		Scanner sc=new Scanner(System.in);
				short m=sc.nextShort();
				short n=sc.nextShort();
		float d;
//		d=m/n;
//		System.out.println(d);

		try {
			d=m/n;
			System.out.println(d);
			}
		catch(Exception e){
				System.out.println("Denominator cant be '0'");
				e.printStackTrace();
//				e.getMessage();
//				e.toString();
		}
	}
}

