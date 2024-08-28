import java.util.Scanner;
class BuzzNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		while(num!=0)
		{
			int last = num%10;
			if(last==7 || num%7==0)
			{
				System.out.println(num+":is Buzz number");
				break;
			}
			else
			{
				System.out.println(num+":is not a Buzz number");
				break;
			}
		}
	}
}
