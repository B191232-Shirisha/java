import java.util.Scanner;
class calculator
{
	public static void main(String args[])
	{
		int a;
		int b;
		char c;
		Scanner in=new Scanner(System.in);
		System.out.println("enter first number");
		a=in.nextInt();
		System.out.println("enter second number");
		b=in.nextInt();
		System.out.println("enter operator");
		c=in.next().charAt(0);
		switch(c)
		{
			case '+':
			System.out.print(a+b);
			break;
			case '-':
			System.out.println(a-b);
			break;
			case '*':
			System.out.println(a*b);
			break;
			case '/':
			System.out.println(a/b);
			break;
			default:
			System.out.println("enter a valid numbers");
			break;
		}
	}
}
			
