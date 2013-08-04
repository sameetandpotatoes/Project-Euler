import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.*;
public class Number42
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Stopwatch s = new Stopwatch();
		int countTriWords = 0;
		Scanner console = new Scanner(System.in);
		String inputFileName = "Number42.txt";
		FileReader reader = new FileReader(inputFileName);
		Scanner in = new Scanner(reader);
		while (in.hasNextLine())
		{
			String line = in.nextLine();
			String[] words = line.split(",");
			for (int i = 0; i < words.length; i++)
			{
				String word = words[i];
				word = word.substring(1, word.length() - 1); //Removes quotes
				int number = getNameValue(word);
				if (checkTriangleNumber(number))
					countTriWords++;
			}
		}
		System.out.println(countTriWords);
		System.out.println(s.elapsedTime());
	}
	public static boolean checkTriangleNumber(int number)
	{
		for (int i = 1; i * (i + 1)/2 <= number; i++)
			if (i * (i + 1)/2 == number)
				return true;
		return false;
	}
	public static int getNameValue(String word)
	{
		int sum = 0;
		for (int i = 0; i < word.length(); i++)
		{
			int charValue = word.charAt(i);
			charValue -= 'A';
			sum += charValue + 1;
		}
		return sum;
	}
}