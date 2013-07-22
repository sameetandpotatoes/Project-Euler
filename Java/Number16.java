import java.math.BigInteger;
public class Number16
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		BigInteger answer = new BigInteger("2").pow(1000);
		BigInteger sum = new BigInteger("1");
		int counter = 0;
		while(answer.compareTo(new BigInteger("1")) >= 1)
		{
			BigInteger remainder = (answer.remainder(new BigInteger("10"))); 
			sum = sum.add(remainder);
			counter++;
			answer = answer.divide(new BigInteger("10"));
		}
		System.out.println(sum);
		System.out.println(s.elapsedTime());
		
		

	}

}
