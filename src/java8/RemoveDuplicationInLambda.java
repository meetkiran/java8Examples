package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RemoveDuplicationInLambda {
	/*it’s possible to store the lambda expression in an explicit reference of type Predicate and then pass it to the
function; this is an easy way to remove the duplication.*/
	public static void main(String[] args) {
		
		List<String> friends = Arrays.asList("na", "bcc", "c", "bd", "e");
		List<String> editors = Arrays.asList("a", "nbcc", "c", "bd", "ne");
		
		final Predicate<String> startsWithN = name -> name.startsWith("n");
		
		final long countFriendsStartN =
		friends.stream()
		.filter(startsWithN)
		.count();
		
		final long countEditorsStartN =
		editors.stream()
		.filter(startsWithN)
		.count();
		
	}
}
