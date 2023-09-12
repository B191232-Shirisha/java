import java.util.Scanner;  
class primefactors
{
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("enter a number");
	int n=in.nextInt();
	int i,j;
	for(i=1;i<=n;i++)
	{
	if(n%i==0)
	{
		int c=0;
		for(j=1;j<=i;j++)
		{
		if(i%j==0)
		{
		c++;
		}
		}
		if(c==2)
		{
		System.out.println(i);
		}
	}
	}
	
	
}
}
