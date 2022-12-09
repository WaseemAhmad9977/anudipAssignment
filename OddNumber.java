package labtest;
class CheckNumber
{
	void Numbers()
	{
		int number =20;
		System.out.println("list of odd number from 1 to "+number+":");
		for(int i=1;i<=number;i++)
		{
			//logic to check For the odd number
			if(i%2!=0)
			{
				System.out.println(i+" ");
			}
		}
			
	}
		
}


public class OddNumber {
	public static void main(String[] args) {
		CheckNumber ob = new CheckNumber();
		ob.Numbers();
	}

}
