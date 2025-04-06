package Java8_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import Pojo.Customer;

public class StreamsFilterMap {

	public static void main(String[] args) {
		List<Customer> customersList = Arrays.asList(
				new Customer("Varsha",27),
				new Customer("Babu",31),
				new Customer("kavita",32),
				new Customer("Gangu",33),
				new Customer("Amit",34)
			
			) ;
		
		String name = customersList.stream()
			.filter(x-> "Gangu".equals(x.getName()))
			.map(Customer::getName)
			.findAny()
			.orElse(null);
		System.out.println(name);
		
		//2. Print all the name
		System.out.println("Case2: Print all name");
		List<String> customerNameList = customersList.stream()
			.map(Customer::getName)
			.collect(Collectors.toList());
		
		customerNameList.forEach(System.out::println);
	}

}
