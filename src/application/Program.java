package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("how many employess will be registered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println();
			System.out.println("Employee #" + i + ":");
			System.out.println("Id: ");
			int id = sc.nextInt();

			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));

		}

		System.out.println("Enter employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("id not found");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		System.out.println("list of employess: ");

		for (Employee obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

}
