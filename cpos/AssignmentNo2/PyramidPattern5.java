class PyramidPattern5
{
	public static void main(String args[])
	{
		for(int i=1; i<=9; i++)//row
		{
			for(int j=9; j>=i; j--)//space
			{
				System.out.print(" ");
			}
			for(int k=10-i; k<=9; k++)//1st triangle
			{
				System.out.print(k);
			}
			for(int l=1; l<=i-1 ; l++)//2nd triangle
			{
				System.out.print(9-l);
			}
			System.out.println();
		}
	}
}
