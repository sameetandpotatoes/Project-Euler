import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Number22
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Stopwatch s = new Stopwatch();
		String inputFileName = "Number22.txt";
		FileReader reader = new FileReader(inputFileName);
		Scanner in = new Scanner(reader);
		long answer = 0;
		int counter = 1;
		ArrayList<String> names = new ArrayList<String>();
		while (in.hasNextLine())
		{
			String line = in.nextLine();
			String[] words = line.split(",");
			for (int i = 0; i < words.length; i++)
				names.add(words[i].substring(1, words[i].length() - 1)); //Removes quotes, adds to arraylist
		}
		Collections.sort(names);
		for (String word : names)
		{
			answer += getNameValue(word, counter);
			counter++;
		}
		System.out.println(answer);
		System.out.println(s.elapsedTime());
	}
	public static int getNameValue(String word, int counter)
	{
		if (word == null || word.trim().length() == 0)
			return 0;
		int sum = 0;
		for (int i = 0; i < word.length(); i++)
		{
			int charValue = word.charAt(i);
			charValue -= 'A';
			sum += charValue + 1;
		}
		int product = sum * counter;
		return product;
	}
}
