package inheritance;

public class Employe extends Member {
	private String speciliaztion;
	
	public Employe(String name ,int age ,String number ,String adress,String salary,String speciliazation )
	{
		super(name,age,number,adress,salary);
		this.speciliaztion=speciliazation;
		
		
	}
	public void printSpeciliazation()
	{
		System.out.println("speciliaztion"+speciliaztion);
	}
	
	
	

}
