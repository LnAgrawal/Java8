package Java8_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import Pojo.Customer;

public class StreamFilterFindAnyOrElse {
	public static void main(String[] args)
	{
		List<Customer> customersList = Arrays.asList(
					new Customer("Varsha",27),
					new Customer("Babu",31),
					new Customer("kavita",32),
					new Customer("Gangu",33),
					new Customer("Amit",34)
				
				) ;
		System.out.println("Case1------");
		//1. Filter -- findAny
		Customer customer = customersList.stream() //conver list to stream
			.filter(c -> "Babu".equals(c.getName())) // filter it for Babu
			.findAny() // if it finds then return the Customer reference
			.orElse(null);  // or else return null
		System.out.println( customer.getName() + " " + customer.getAge());
		
		System.out.println("Case2------");
		//2. Filter -- or else		
		Customer customer1 = customersList.stream() //conver list to stream
				.filter(c -> "Naveen".equals(c.getName())) // filter it for Babu
				.findAny() // if it finds then return the Customer reference
				.orElse(null);  // or else return null
		System.out.println( customer1);
		
		System.out.println("Case3------");
		//3 Filter with multiple condition
		Customer customer3= customersList.stream()
			.filter(x -> "Amit".equals(x.getName()) && 34 == x.getAge() )
			.findAny()
			.orElse(null);
		System.out.println( customer3.getName() + " " + customer3.getAge());
			
			
	}
	
}
