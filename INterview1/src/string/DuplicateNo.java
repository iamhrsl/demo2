package string;

import java.util.Scanner;

public class DuplicateNo {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
//		String s1=input.nextLine();
		String s1="harshal h";
			
		
		for(int i=0;i<s1.length()-1;i++)
		{
			for(int j=i+1;j<s1.length()-1;j++)
			{
				char s2 = 0;
				if(s1.charAt(i)==s1.charAt(j) && s1.charAt(i)!=0 && s1.charAt(j)!=s2)
					
				System.out.println(s1.charAt(i));	
				s2=s1.charAt(i);
			}
			
					
		}
			
		}

}
