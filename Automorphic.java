import java.util.Scanner;
class Automorphic 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int square = 1;

		for(int i = 1; i<=2; i++)
		{
			square = square + num;
		}
		while(square != 0)
		{
			int last = square%10;
		
		    
			if(last==num)
			{
				System.out.println(num+": is a automorphic number");
				break;
			}
			else
			{
				System.out.println(num+": is not a automorphic number");
			}
		}
		
	}
}
