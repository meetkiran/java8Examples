package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapForeachFilterCollect {
	public static void main(String[] args) {
		List<String> friends = Arrays.asList("a", "bcc", "c", "bd", "e");
		// using lambda expression
		friends.stream().map(friend -> friend.toUpperCase()).forEach(name -> System.out.print(name + " "));

		// using method reference
		friends.stream().map(String::length).forEach(name -> System.out.print(" " + name));

		List<String> stringStartWithB = friends.stream()
											   .filter(name -> name.startsWith("b"))
											   .collect(Collectors.toList());
		System.out.println(stringStartWithB);
		/* The filter() method expects a lambda expression that returns a boolean
 		   result. If the lambda expression returns a true, the element in context
		 while executing that lambda expression is added to a result collection;
		  it’s skipped otherwise. Finally the method returns a Stream with only
		  elements for which the lambda expression yielded a true. In the end we
		 transformed the result into a List using the collect() method
											 */
		
	}
}
