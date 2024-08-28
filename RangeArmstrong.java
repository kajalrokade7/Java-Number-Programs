class RangeArmstrong 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end=550;
		
		for(; start<=end; start++)
		{ 
			int count = 0;
			for(int i = start; i>0; i=i/10)
			{
				count++;
			}
			int sum=0;
			for(int num=start; num>0; )
			{
				int last = num%10;
				int power = 1;
				if(last>0)
				{
				for (int i=0; i<count ;i++ )
				{
					power= power*last;
				}
				}
				sum=sum+power;
			    num= num/10;
			}
			if(start==sum)
			{
				System.out.println(sum);
				
			} 
			
		}start++;
		
	}
}
