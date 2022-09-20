package string;

public class UpperLowerCaseCount {

	public static void main(String[] args) {
		
		String a="HarShaL";
		int count1=0;
		int count2=0;

//		for(int i=0;i<a.length();i++)
//		{
//			char a1=a.charAt(i);
//			if(a1>=65 && a1<=90)
//			{
//				count1++;
//			}
//			else
//				count2++;
//		}
		
		for(int i=0;i<a.length();i++)
		{
			char a1=a.charAt(i);
			if(a1>='A' && a1<='Z')
			{
				count1++;
			}
			else
				count2++;
		}
		
		System.out.println("lower Case char no"+count2);
		System.out.println("upper Case char no"+count1);
		
		/////////////////////////////////////////////////////
		
		

		
		



	}

}
