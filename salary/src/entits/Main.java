package entits;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		ArrayList<Employee> employees2 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite N");
		Integer n = sc.nextInt();
		for (Integer i = 0; i < n; i++) {
			if (i == 0) {
				Employee e1 = Employee.registerEmployeer();
				employees.add(e1);
				System.out.println("ID Diferente");

			} else {
				Employee e1 = Employee.registerEmployeer();
				int z = 0;
				employees2.addAll(employees);
				while (z == 0) {
					for (Employee emp : employees2) {
						if (emp.id == e1.id) {
							System.out.println("ID já cadastrado, digite outro");
							e1 = Employee.registerEmployeer();
						} else {
							System.out.println("ID Diferente");
							z = 5;
							employees.add(e1);

						}
					}
				}
				employees2.clear();
			}
		}

		sc.close();

	}
}
