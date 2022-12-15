package inheritance;

public class Main {
	public static void main(String[] args) {
		//instance of employe
		Employe ob= new Employe(" Waseem Ahmad ", 67," 7906327065"," Lucknow"," 50000"," Engineer");
		
		//instance of manager
		Manager ob1=new Manager(" Aryan",78," 90675489"," lucknow"," 890000"," Project manager");
		ob.printSalary();
		ob.printSpeciliazation();
		ob.printDetails();
		ob1.printDetails();
		ob1.printSalary();
		ob1.printDepartment();
		
		
		
	
		
	}

}
