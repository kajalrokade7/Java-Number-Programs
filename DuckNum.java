import java.util.Scanner;
class DuckNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num;
		
		while(num!=0)
		{
			int last = num%10;
		    if (last ==0)
		    {
				System.out.println(temp+": is a Duck Number");
				break;
		    }
			else
			{
				System.out.println(temp+":is not a Duck Number");
			}
			num= num/10;
		}
	}
}
