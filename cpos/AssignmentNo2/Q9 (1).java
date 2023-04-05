import java.util.Scanner;

class Q9
{
public static void main(String args[])
{
	System.out.println("Enter an integer value: ");
	Scanner sc=new Scanner(System.in);
	
	int letter=sc.nextInt();//enter 65
	for(int i=0;i<=5;i++)
	{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
		
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(letter+j)+" ");
			}
		
		System.out.println();
	}
}
}


