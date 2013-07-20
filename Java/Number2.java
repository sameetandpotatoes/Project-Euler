public class Number2 
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		int a = 0, b = 0, c = 1, sum = 0;
		while (a < 1000000)
		{
			a = b + c;
			if (a % 2 == 0) sum+=a;
			b = c + a;
			if (b % 2 == 0) sum+=b;
			c = a + b;
			if (c % 2 == 0) sum+=c;
		}
		System.out.println(sum);
		System.out.println("Time: " + s.elapsedTime());
	}
}
