class DuplicateArray1
{
	public static void main(String s[])
	{
		int i,j;
		int a[] = {1,2,3,4,5,2,4,5,7,6,7};
		System.out.println("Elements of the array : ");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(i=0;i<a.length-1;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate values : "+a[j]);
				}
			}
		}
	}
}