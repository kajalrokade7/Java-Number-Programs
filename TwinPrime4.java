import java.util.Scanner;
class TwinPrime4
{
  public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number");
		int n1 = sc.nextInt();
	    System.out.println("Enter a second number");
		int n2 = sc.nextInt();
			int ans = n2-n1;

		if(ans == 2 || ans <=2)
			{
			System.out.println("They are twin prime numbers");
			}
			else 
			{
				System.out.println("They are not a twin prime numbers");
			}
		}
	
}
