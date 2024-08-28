class RangeAm
{
	public static void main(String[] args) 
	{
		int ip = 1634;
		int count = 0;
		
			for(int i = ip; i>0; i=i/10)
			{
				count++;
			}
			int sum=0;
			for(int num=ip; num>0; )
			{
				int last = num%10;
				int power = 1;
				for (int i=0; i<count ;i++ )
				{
					power= power*last;
				}
				sum=sum+power;
			    num= num/10;
			}
			if(ip==sum)
			{
				System.out.println("it is Armstrong number");
				
			} 
			
		
		
	}
}
