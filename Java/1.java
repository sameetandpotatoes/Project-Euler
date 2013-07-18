public class 1 
{
	public static void main(String[] args) 
	{
		int answer = 0;
		for(int number = 1; number < 1000; number++)
		{
			if (number % 3 == 0 && number % 5 == 0) answer += number;
			else if (number % 3 == 0) answer+=number;
			else if (number % 5 == 0) answer+=number;
		}
		System.out.println(answer);
	}

}
