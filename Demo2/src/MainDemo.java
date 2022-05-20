
public class MainDemo {

	public static void main(String[] args) {
		Department department = new Department(); //creates an new object
		
		System.out.println(department); //memory address where is obj is created
		department.setDeptId(1);
		department.setDeptName("sai");
		department.setDeptSalary(30000);
		

		System.out.println(department.getDeptId());
		System.out.println(department.getDeptName());
		//creates second object 
		Department department2 = new Department();
		department2.setDeptId(2);
		department2.setDeptName("krishna");
		department.setDeptSalary(35000);
		
		
		if (department.getDeptSalary() == department2.getDeptSalary()) {
			System.out.println("Both the Salary are equal");
		}else {
			System.out.println("Both the Salary  are not equal");
		}
		
		System.out.println(department2.getDeptId());
	}
	
}
