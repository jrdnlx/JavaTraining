package com.hcl.AS5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	int id;
	String name;
	int age;
	String gender;
	String dept;
	int yearJoined;
	int salary;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(1, "John", 25, "Male", "IT", 1993, 50000));
		emp.add(new Employee(1, "Matt", 22, "Male", "Sales", 1990, 60000));
		emp.add(new Employee(1, "Jake", 29, "Male", "IT", 1995, 150000));
		emp.add(new Employee(1, "Emily", 32, "Female", "Service", 1990, 100000));
		emp.add(new Employee(1, "Jane", 45, "Female", "IT", 1983, 40000));
		emp.add(new Employee(1, "Mary", 41, "Female", "Sales", 2001, 20000));
		emp.add(new Employee(1, "Sam", 27, "Female", "Maintenance", 2001, 20000));
		
		//1
		Map<String, Long> maleFemale = emp.stream().collect(Collectors
				.groupingBy(Employee::getGender, Collectors.counting()));
		
		System.out.println(maleFemale);

		//2
		Map<String, Double> averageAge = emp.stream().collect(Collectors
				.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		
		System.out.println(averageAge);
		
		//3
		Optional<Employee> highest = emp.stream().collect(Collectors
				.maxBy(Comparator.comparingInt(Employee::getSalary)));
		
		System.out.println(highest);
		
		//4
		Map<String, List<Employee>> joined = emp.stream()
				.filter(e1 -> e1.getYearJoined() > 2015).collect(Collectors.groupingBy(Employee::getName));
;
		System.out.println(joined);
		
		//5
		Optional<Employee> senior = emp.stream()
				.sorted(Comparator.comparingInt(Employee::getYearJoined)).findFirst();
		
		System.out.println(senior);

		//6
		Map<String, Long> numDept = emp.stream().collect(Collectors
				.groupingBy(Employee::getDept, Collectors.counting()));

		System.out.println(numDept);
		
		//7
		Map<String, List<Employee>> main = emp.stream()
				.filter(e1 -> e1.getDept() == "Maintenance").collect(Collectors.groupingBy(Employee::getName));

		System.out.println(main);
		
		//8
		Map<String, Double> salary = emp.stream().collect(Collectors
				.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getSalary)));

		System.out.println(salary);
		
		//9
		Map<String, List<Employee>> age25and30 = emp.stream()
				.filter(e1 -> e1.getAge() > 25 && e1.getAge() < 30).collect(Collectors.groupingBy(Employee::getName));
		
		System.out.println(age25and30);
		
		//10
		Map<String, List<Employee>> dept = emp.stream().collect(Collectors.groupingBy(Employee::getDept));
		
		System.out.println(dept);
		
	}

}
