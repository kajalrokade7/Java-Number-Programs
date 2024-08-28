import java.util.Scanner;
class PerfectNum
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a number");
			int num = sc.nextInt();
		int sum = 0;
		int den =1;
		for(; den<num; den++)
		{
			if(num%den==0)
			{
				sum = sum + den;
			}
		}
		if (sum==num)
		{
			System.out.println(num+ ": is a perfect number");
		}
		else
	{
			System.out.println(num+ ": is not a perfect number");
	}
}
}
