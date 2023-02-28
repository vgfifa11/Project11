package modifier1;

public class M1 
{
	int a;
	int b;
	
	 M1(int x, int y)
	{
		a=x;
		b=y;
		
	}
	public M1()
	{
		a=10;
		b=20;
		
	}
	
	public void method1()
	{
		int sum=a+b;
		System.out.println(sum);
	}

}
