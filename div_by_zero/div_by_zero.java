public class DivByZero
{
	public static void main(String args[])
	{
		try 
		{
			int a=5,b=0;
			System.out.println("Quetient is:"+a/b);
		}
		catch(Exception e)
		{
			System.out.println("cannot divided by zero");
		}
	}
}
