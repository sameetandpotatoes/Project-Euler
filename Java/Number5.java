public class Number5 
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		long number = 2520;
		while(true)
		{
			int divisor = 20;
			while(divisor > 3)
			{
				if (number % divisor != 0)
					break;
				divisor--;
			}
			if(divisor == 3) //Found it
			{
				System.out.println(number);
				System.out.println(s.elapsedTime());
				break;
			}
			number+=2;
		}
	}
}
