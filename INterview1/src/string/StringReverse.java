package string;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner string=new Scanner(System.in);
		String s=string.nextLine();
		
		String[] s1=s.split(" ");
//		System.out.println(s1.length);
		
		System.out.println("Reverse of String");
		
		for(int i=0;i<s1.length;i++)
		{
			String s2=s1[i];
			for(int j=s2.length()-1;j>=0;j--)
			{
				char k=s2.charAt(j);
				System.out.print(k);
			}
			System.out.print(" ");
		}
		
		
		}

}
