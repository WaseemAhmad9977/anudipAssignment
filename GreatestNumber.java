package labtest;
import java.util.Scanner;

public class GreatestNumber {
	void Greatest()
	{
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first number");
		a=s.nextInt();
	
		System.out.println("enter the second number");
		b=s.nextInt();
				
		System.out.println("enter the Third number");
		c=s.nextInt();
		
				
		if(a>b && a>c)
			System.out.println(a+"is greatest");
		else if(b>c)
			System.out.println(b+"is greatest");
		else
			System.out.println(c+"is greatest");	
	}
	
	public static void main(String []args)
	{
		GreatestNumber ob2 = new GreatestNumber();
		ob2.Greatest();
	}

}
