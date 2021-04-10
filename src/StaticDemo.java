class Emp{
	
	int empId;
	String empName;
	double empSal;
	// when we need variable whose value is to remain the same
	//for all objects, then declare the variable as static 
	//here empOrg is same for all employees.
	static String empOrg;
	
	
	//we can initialize static variables with
	//static block.
	static {
		empOrg = "TATA";
	}
	
	public Emp(int empId, String empName, double empSal) {
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	
	public void PrintEmpData() {
		System.out.println(empId+":"+empName+":"+empSal+":"+empOrg);
	}
	
	
}

public class StaticDemo {
	
	public static void main(String[] args) {
		
		Emp GG = new Emp(2,"Gaurav",4000.00);
		Emp GA = new Emp(3,"GA",5000.00);
		
		GG.PrintEmpData();
		GA.PrintEmpData();
		
	}

}
