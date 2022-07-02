package org.employee;

public class EmployeeDetails {

	// method 1
	private void empName() {

		System.out.println("Employee name : Anand");
	}

	// method 2
	private void empMobile() {

		System.out.println("Employee mobile : 8939278836");
	}
	private void empAdd() {
		System.out.println("Employee add: OMR");
	}
	private void empId() {
		System.out.println("Employee id:1234");
	}
//<<<<<<< HEAD
	
//=======
	
//>>>>>>> 17da5151f8de4d5a4446d4a78be6c2a7c5ca5329

	// main method
	public static void main(String[] args) {

		// obj
		EmployeeDetails e = new EmployeeDetails();

		// method call
		e.empName();
		e.empMobile();

	}

}
