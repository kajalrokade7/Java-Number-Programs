class TwistedNum 
{
	public static void main(String[] args) 
	{
		int num = 123;
		int temp = num;
		int reverse = 0;
	    int den = 2;
		for(; den<num; den++)
		{
			if(num%den==0)
			{
				break;
			}
		}
		if(den==num)
		{
			
			while(temp!=0)
			{
				int last = temp%10;
				reverse = (reverse*10)+last;
				temp=temp/10;
			}
			
		}
		if(temp==reverse)
			{
				System.out.println("It is a twisted number");
			}
	}
}
