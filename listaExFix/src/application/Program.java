package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão cadastrados? ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<Employee>();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Empregado #" + (i+1) + ":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("Id já existe. Tente novamente: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salário: ");
			Double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		
		System.out.print("Informe o id do funcionário que terá aumento de salário: ");
		sc.nextLine();
		int id = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Este id não existe!");
		} else {
			System.out.print("Informe a porcentagem: ");
			double increase = sc.nextDouble();
			emp.increaseSalary(increase);
		}		
		
		System.out.println();
		System.out.println("Lista de funcionarios:");
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
