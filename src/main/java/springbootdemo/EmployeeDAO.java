package springbootdemo;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	private static Employees list = new Employees();
	
	static {
		list.getEmplyeeList().add(new Employee(1,"Lokesh","Gupta","howtodoinjava@gmail.com"));
		list.getEmplyeeList().add(new Employee(2,"Alex","kolenchiskey","abc@gmail.com"));
		list.getEmplyeeList().add(new Employee(3,"David","Kameron","titanic@gmail.com"));
	}
	
	public Employees getAllEmployees() {
		return list;
	}
	public void addEmployee(Employee employee) {
		list.getEmplyeeList().add(employee);
	}
}
