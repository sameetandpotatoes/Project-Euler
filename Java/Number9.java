public class Number9
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		for (int a = 999, b = 999, c = 999; c > 100; a--)
		{
			if (a == 100)
			{	
				a = 999;
				b--;
			}
			if (b == 100)
			{
				b = 999;
				c--;
			}
			if (a + b + c == 1000) 
			{
				if (Math.pow(a,2) + Math.pow(b, 2) == Math.pow(c, 2))
				{
					System.out.println(a * b * c); 
					System.out.println(s.elapsedTime());
					break;
				}
			}	
		}
	}
}
