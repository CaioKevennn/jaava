package entits;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	String name;
	Double salary;

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return name + "  " + salary + "   " + id;
	}

	public static Employee registerEmployeer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome");
		String name = sc.next();
		System.out.println("Digite o Salario");
		Double salary = sc.nextDouble();
		System.out.println("Digite o ID");
		Integer id = sc.nextInt();
		return new Employee(id, name, salary);
	}

	public void increaseSalary(double percentage, Integer id, ArrayList<Employee> employeeListt) {
		
	
		for (Employee employee:employeeListt) {
			if(employee.id==id) {
				double moreSalary = getSalary() / 100 * percentage;
				employee.salary+=moreSalary;
			}
		}
		

	}

}
