import java.math.BigInteger;
public class Number48
{
	public static void main(String[] args)
	{
		Stopwatch s = new Stopwatch();
		BigInteger base = new BigInteger ("1");
		BigInteger sum = new BigInteger("0");
		int base2 = base.intValue();
		while (base2 <= 1000)
		{
			int base1 = base.intValue();
			sum = sum.add(base.pow(base1));
			base = base.add(new BigInteger("1"));
			base2 = base.intValue();
		}
		String answer = sum.toString();
		System.out.println(answer.substring(answer.length() - 10));
		System.out.println(s.elapsedTime());
	}
}
