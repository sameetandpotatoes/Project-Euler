import java.math.BigInteger;
public class Number56
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		BigInteger a = new BigInteger("1");
		int b = 2;
		BigInteger max = new BigInteger("0");
		while (b != 100)
		{
			if (a.equals(new BigInteger("100")))
			{
				a = new BigInteger("1");
				b++;
			}
			BigInteger product = a.pow(b);
			int sum = digitAdder(product);
			if (sum > max.intValue())
				max = BigInteger.valueOf(sum);
			a = a.add(new BigInteger("1"));
		}
		System.out.println(max.intValue());
		System.out.println(s.elapsedTime());
	}
	public static int digitAdder(BigInteger product)
	{
		int sum = 0;
		while(product.compareTo(new BigInteger("1")) >= 1)
		{
			BigInteger remainder = product.remainder(new BigInteger("10"));
			sum += remainder.intValue();
			product = product.divide(new BigInteger("10"));
		}
		return sum;
	}
}
