
public class Executor {

	public static void main(String[] args) {

		
		/*
		 * Employee e=new Employee(30, "sujay", 30000); int
		 * row=SttementInterfaceDemo.addEmployee(e);
		 * System.out.println(row+" row inserted");
		 */
		  
		  
		
		Employee e=new Employee();
		e.setEmployeeId(33);
		int row1=SttementInterfaceDemo.deleteEmployee(e);
		 System.out.println(row1+" row deleted");
		 
		//Retrieving Employee information
			SttementInterfaceDemo.getEmployee();
	}

}
