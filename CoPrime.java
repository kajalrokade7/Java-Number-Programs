import java.util.Scanner;
class CoPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a second number");
		int num2 = sc.nextInt(); 

		for(int den=2; den<num; den++)
		{
			if(num%den==0)
			{
				System.out.println(num+": is a Coprime num");
				break;
			}
			else
			{
				System.out.println(num+":is not a Coprime num");
				break;
			}
		}
	}
}
