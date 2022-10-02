import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = Arrays.asList(
				new Employee("Emp1", "CS", 10000),
				new Employee("Emp2", "CS", 15000),
				new Employee("Emp3", "IT", 2000),
				new Employee("Emp4", "IT", 25000));
		
		//get highest salary by dept
		Map<String, Employee> byDept = employees.stream()
				.collect
					(Collectors.groupingBy(e -> e.getDepartment(),Collectors.collectingAndThen(
							Collectors.maxBy(Comparator.comparingInt(e -> e.getSalary())), Optional::get)));
		System.out.println(byDept);
		
	}

}
