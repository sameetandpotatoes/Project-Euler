import java.math.BigInteger;
public class Number20
{
    public static BigInteger factorial(BigInteger i)
    {
        if(i.equals(new BigInteger("1")))
        {
        	return new BigInteger("1");
        }
        else return i.multiply(factorial(i.subtract(new BigInteger("1"))));
    }
    public static void main(String [] args)
    {
        Stopwatch s = new Stopwatch();
        BigInteger product = factorial(new BigInteger("100"));
        System.out.println(getDigit(product));
        System.out.println(s.elapsedTime());
    }
    public static BigInteger getDigit(BigInteger num)
    {
        BigInteger sum = new BigInteger("0");
        while (num.compareTo(new BigInteger("1")) >= 1)
        {
            BigInteger remainder = num.mod(new BigInteger("10"));
            sum = sum.add(remainder);
            num = num.divide(new BigInteger("10"));
        }
        return sum;
    }
}
