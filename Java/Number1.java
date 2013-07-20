public class Number1 
{
	public static void main(String[] args) 
	{
		Stopwatch s = new Stopwatch();
		int sum = 0;
		for(short number = 1; number < 1000; number++)
		{
			if (number % 3 == 0) 
				sum += number;
			else if (number % 5 == 0) 
				sum += number;
		}
		System.out.println(sum);
		System.out.println("Time: " + s.elapsedTime());
	}
}
