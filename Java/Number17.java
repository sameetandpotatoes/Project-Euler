import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Number17
{
	public static void main(String[] args) throws FileNotFoundException
	{
            Stopwatch s = new Stopwatch();
            int sum = 0;
		for (int i = 1; i < 5; i++)
		{
		    int copy = i;
                while (getLength(copy) != 0)
                {
                  sum += getLength(copy);
                  copy -= getLength(copy);
                }
		}
            System.out.println(sum);
            System.out.println(s.elapsedTime());
	}
	public static int getLength(int n)
	{
		switch (n) {
            case 0: return 0; 
            case 1: return "One".length(); 
            case 2: return "Two".length(); 
            case 3: return "Three".length(); 
            case 4: return "Four".length(); 
            case 5: return "Five".length(); 
            case 6: return "Six".length(); 
            case 7: return "Seven".length(); 
            case 8: return "Eight".length(); 
            case 9: return "Nine".length(); 
            case 10: return "Ten".length(); 
            case 11: return "Eleven".length(); 
            case 12: return "Twelve".length(); 
            case 13: return "Thirteen".length(); 
            case 14: return "Fourteen".length(); 
            case 15: return "Fifteen".length(); 
            case 16: return "Sixteen".length(); 
            case 17: return "Seventeen".length(); 
            case 18: return "Eighteen".length(); 
            case 19: return "Nineteen".length(); 
            case 20: return "Twenty".length(); 
            case 30: return "Thirty".length(); 
            case 40: return "Forty".length(); 
            case 50: return "Fifty".length(); 
            case 60: return "Sixty".length(); 
            case 70: return "Seventy".length(); 
            case 80: return "Eighty".length(); 
            case 90: return "Ninety".length(); 
            case 100: return "OneHundred".length(); 
            case 200: return "TwoHundred".length(); 
            case 300: return "ThreeHundred".length(); 
            case 400: return "FourHundred".length(); 
            case 500: return "FiveHundred".length(); 
            case 600: return "SixHundred".length(); 
            case 700: return "SevenHundred".length(); 
            case 800: return "EightHundred".length(); 
            case 900: return "NineHundred".length(); 
            case 1000: return "OneThousand".length(); 
            }
	}
}
