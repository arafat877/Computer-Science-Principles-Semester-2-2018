
public class TestEmployee {
	public static void main(String[] args) {
		Employee employee = new Employee(2410, "Andrew", "Bernas", 20);
		
		employee.setSalary(10);
		System.out.println(employee.getAnnualSalary());
		
		System.out.println(employee);

	}
}
