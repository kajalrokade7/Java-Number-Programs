import java.util.Scanner;
class NeonNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
			System.out.println("enter a number");
	     int num = sc.nextInt();
		 int sum = 0;
		 int square = 1;
		for (int i=1; i<=2 ;i++ )
		{
			square = square*num;
		}
			while(square !=0)
		{
				int last = square % 10;
				sum = sum + last;
				square = square/10;
		}
		if (sum==num)
		{
			System.out.println("it is a neon number");
		
		}
	}
}
