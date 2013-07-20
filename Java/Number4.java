public class Number4
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		int max = 0;
		for (int a = 999,b = 999; b >= 100 && a  >= 100; b--)
		{
			if (b == 100)
			{
				a--;
				b = 999;
			}
			int p = a * b;
			if(checkPalindrome(p))
			{
				if (p > max)
					max = p;
			}
			if (a <= 800 && b <= 800)
			{
				System.out.println(max);
				System.out.println("Time: " + s.elapsedTime());
				break;
			}	
		}

	}
	public static boolean checkPalindrome(int product)
	{
		String palindrome = Integer.toString(product);
		return (palindrome.equals(new StringBuffer(String.valueOf(palindrome)).reverse().toString()));
	}
}
