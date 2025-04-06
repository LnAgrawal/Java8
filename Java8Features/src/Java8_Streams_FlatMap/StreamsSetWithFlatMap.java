package Java8_Streams_FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Pojo.Employee;

public class StreamsSetWithFlatMap {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("Laxmi");
		emp1.addDevices("Iphone8");
		emp1.addDevices("Lenovo Laptop");
		emp1.addDevices("Hornet Bike");
		emp1.addDevices("MI note 7");
		
		Employee emp2 = new Employee();
		emp2.setName("Varsha");
		emp2.addDevices("Iphone11");
		emp2.addDevices("Dell Laptop");
		emp2.addDevices("Mahindra car");
		emp2.addDevices("MI note 7");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		
		List<String> devicesList =  empList.stream()
				.map(x -> x.getDevices())// this is returning stream of set of string Stream<Set<String>>
				.flatMap(x -> x.stream()) // Stream<String>
				.distinct()
				.collect(Collectors.toList());
		
		devicesList.forEach(x-> System.out.println(x));
	}

}
