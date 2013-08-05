import java.math.BigInteger;
public class Number55
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		int maxIterations = 0, count_Lychrel = 0;
		BigInteger number = new BigInteger("190");
		BigInteger copyNum = new BigInteger("0");
		int loop = 0;
		boolean firstLoop = true;
		while (loop <= 10000)
		{
			if (firstLoop)
			{
				copyNum = number;
				firstLoop = false;
			}
			BigInteger iteration = number.add(new BigInteger(new StringBuffer(String.valueOf(number)).reverse().toString()));
			if (checkPalindrome(iteration) || maxIterations == 50)
			{
				firstLoop = true;
				maxIterations = 0;
				//Next number
				number = copyNum.add(new BigInteger("1"));
			}
			else
			{
				maxIterations++;
				number = iteration;
			}
			if (maxIterations == 50) //Reached limit of iterations
				count_Lychrel++;
			loop = copyNum.intValue();
		}
		System.out.println(count_Lychrel);
		System.out.println(s.elapsedTime());
	}
	public static boolean checkPalindrome(BigInteger iteration)
	{
		return (iteration.toString().equals(new StringBuffer(iteration.toString()).reverse().toString()));
	}
}
