public class Number14 
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		long number = 100000, max_num = 0, copyNumber = 0;
		int countChain = 0, maxCountChain = 0;
		while (number != 1000000)
		{
			copyNumber = number;
			while (copyNumber != 1)
			{
				if (copyNumber % 2 == 0)
				{
					copyNumber /= 2;
					countChain++;
				}
				else
				{
					copyNumber = (3 * copyNumber) + 1;
					countChain++;
				}
			}
			if (countChain > maxCountChain)
			{
				maxCountChain = countChain;
				max_num = number;
			}
			countChain = 0;
			number++;
		}
		System.out.println(max_num);
		System.out.println(s.elapsedTime());
	}
	
}
