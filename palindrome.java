import java.util.Scanner;
class palindrome
{
	public static void main(String args[])
	{
	int n;
	Scanner in=new Scanner(System.in);
	System.out.println("enter a number");
	n=in.nextInt();
	int r,p=n,sum=0;
	while(n>0)
	{
		r=n%10;
		n=n/10;
		sum=sum*10+r;
	}
	if(sum==p)
	{
		System.out.print(p+"is a palindrome");
	}
	else
	{
		System.out.print(p+"is not a palindrome");
	}
	}
	
}
		
