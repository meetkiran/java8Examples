package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LexicalScopingNClosure {

	
//returns function
	public static Predicate<String> checkIfStartsWith(final String letter) {
		return name -> name.startsWith(letter);
	}
	public static void main(String[] args) {
		
		List<String> friends = Arrays.asList("na", "bcc", "c", "bd", "e");
		
		final long countFriendsStartN =
				friends.stream()
				.filter(checkIfStartsWith("n")).count();
		
				final long countFriendsStartB =
				friends.stream()
				.filter(checkIfStartsWith("b")).count();
			System.out.println(countFriendsStartB);	
	}
}
