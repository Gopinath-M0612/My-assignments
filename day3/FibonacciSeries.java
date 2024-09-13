package week1.day3;

public class FibonacciSeries {
	
	public void fibSer(int n)
	{
		int first = 0, second = 1;
		int third;
		
		System.out.print(first +","+second);
		for(int i = 0; i <= n; i++)
		{
			if(first < n)
			{
				third = first + second;
				first = second;
				second = third;
				System.out.print(","+third);
			}
		}
	}
	
	

	public static void main(String[] args) {
		
		FibonacciSeries F = new FibonacciSeries();
		F.fibSer(8);
		
		
		
	}

}