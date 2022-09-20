package array;

public class AdditionOfNos {

	public static void main(String[] args) {
		
		int i1[]= {1,1,1,1,2};
		int sum=0;
		int mul=1;
		for(int i=0;i<=i1.length-1;i++)
		{
			sum=sum+i1[i];
			mul=mul*i1[i];
		}
		System.out.println(sum);
		System.out.println(mul);
		
	}

}
