import java.util.Scanner;
class Spynum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int product = 1;
		while(num>0)
		{
			int last = num % 10;
		

			sum = sum + last;
			product= product* last;
			num=num/10;
		}
		
			if(sum==product)
			{
				System.out.println(temp+": is a spy number");
			}
			else
		{ 
				System.out.println(temp+": is not a spy number");
		}
		
	}
}
