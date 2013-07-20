public class Number6
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		System.out.println(squareOfSum()-sumOfSquare());
		System.out.println(s.elapsedTime());
	}
	public static long sumOfSquare()
	{
		long sum = 0;
		for (int number = 1; number <= 100; number++)
			sum += (number * number);
		return sum;
	}
	public static long squareOfSum()
	{
		long sum = (100 * 101)/2;
		sum *= sum;
		return sum;
	}

}
