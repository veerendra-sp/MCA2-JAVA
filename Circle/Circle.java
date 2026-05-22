import java.util.Scanner;
public class circleArea
{
	public static void main (String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("enter the radius of the circle:");
		
		double radius=input.nextDouble();
		double area=Math.PI*radius*radius;
		double circumference=2*Math.PI*radius;
		System.out.println("Area of circle is:"+area);
		System.out.println("circumference of circle:"+circumference);

		input.close();
	}
}