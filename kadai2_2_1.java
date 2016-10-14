public class kadai2_2_1
{
	public static void main(String args[])
	{
		int y=0;
		int countflg=0;
		int dan=5;

		for( int i=0; i<dan; i++ )
		{
			for(int j=0; j<(i); j++)
			{
				y=j;
				countflg=1;
				System.out.print("  ");
			}
			for( int k=0; k<(dan*2-i*2-1); k++ )
			{
				if (countflg==1){
					y=y+1;
				}
				else
				{
					y=k;
				}
				System.out.print("☆");
			}
			System.out.println();
			countflg=0;
		}
	}
}