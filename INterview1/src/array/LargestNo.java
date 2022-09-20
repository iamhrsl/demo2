package array;

public class LargestNo {

	public static void main(String[] args) {

		int a[]= {110,20,30,100};
		int size,temp;
		size=a.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[size-1]);//largest no
		System.out.println(a[size-2]);//2nd largest no
	}

}
