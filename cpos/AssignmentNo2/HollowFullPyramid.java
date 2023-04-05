class HollowFullPyramid
{
	public static void main(String args[])
{
	int var=4;
	for(int i=1; i<=6; i++)
	{
		for(int j=6; j>=i;j--)
		{
			System.out.print(" ");
		}
		
		for(int k=1; k<=i;k++)
		{
			if((i==3 && k==2) || (i==4 && (k==2 || k==3))  || (i==5 &&(k==2 || k==3 || k==4))) 
			{
				System.out.print("  ");					
			}
			else 
			System.out.print("* ");
		}
		System.out.println();
	}
}
}


/*
      *
     * *
    *   *
   *     *
  *       *
 * * * * * *
 
 */