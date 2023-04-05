class Pattern7
{
	public static void main(String args[])
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int l=1; l<=i-1; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int l=1; l<=i-1; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}