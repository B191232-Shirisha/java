import java.util.Scanner;
class array
{
	public static void main(String args[])
	{
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number of elements you want to store");
		n=in.nextInt();
		int[] a=new int[10];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		/*int a[]=new int[5];//declaration and instantiation  
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=5;  
		a[4]=50;  */
		int min=a[0];
		for(int i=0;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("minimum number in the array is"+min);
		int max=a[0];
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
			max=a[i];
			}
		}
		System.out.println("maximum number in the array is"+max);
	}
}
