import java.util.ArrayList;
public class Number95
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		int answer = 0, longestChain = 0;
		for (int number = 6; number < 12498; number++)
		{
			int copyNum = number, counter = 0;
			int smallestNum = 1000000;
			System.out.print(number);
			do
			{
				copyNum = divisorSum(copyNum);
				if (copyNum == 0)
					break;
				System.out.print("Sum: " + copyNum + " ");
				if (copyNum < smallestNum)
					smallestNum = copyNum;
				counter++;
			} while(copyNum != number);
			if (counter > longestChain)
			{
				longestChain = counter;
				answer = smallestNum;
			}
		}
		System.out.println(answer);
		System.out.println(s.elapsedTime());
	}
	public static int divisorSum(int number)
	{
		int sum = 0, divisor = 1;
		while (divisor != number)
		{
			if (number % divisor == 0)
				sum += divisor;
			if (sum > 1000000)
				return 0;
			divisor++;
		}
		if (sum == 1)
			return 0;
		return sum;
	}
}
