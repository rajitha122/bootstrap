class Pattern
{
	public static void main(String [] args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
			for(int l=2;l<=i;l++)
				{
					System.out.print("*");
		        }
			System.out.println(" ");	
		}
		for(int i=1;i<=3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=3;k>=i;k--)
				{
					System.out.print("*");
				}
			for(int l=2;l>=i;l--)
				{
					System.out.print("*");
		        }
			System.out.println(" ");	
		}
		
	}	
}