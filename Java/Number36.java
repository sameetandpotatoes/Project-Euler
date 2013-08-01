public class Number36
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		int sum = 0;
		String separator = "";
		for (int number = 1; number < 1000000; number++)
		{
			//First checking palindrome in base 10
			String testing = Integer.toString(number);
			if (testing.equals(new StringBuffer(String.valueOf(testing)).reverse().toString()))
			{
				int copyNum = number;
				StringBuffer base2 = new StringBuffer();
				//Converting to base2
				while (copyNum >= 1)
				{
					int remainder = copyNum % 2;
					base2.append(separator);
					base2.append(Integer.toString(remainder));
					copyNum /= 2;
				}
			  	String newbase = base2.toString();
			  	//Checking palindrome in base 2
				if (newbase.equals(new StringBuffer(String.valueOf(newbase)).reverse().toString()))
					sum += number;
			}
		}
		System.out.println(sum);
		System.out.println(s.elapsedTime());
	}

}
