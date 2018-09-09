package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterface {

	public static void main(String[] args) {
		final Function<String, Predicate<String>> startsWithLetter =
				(String letter) ->(String name) -> name.startsWith(letter);
				
				
		List<String> friends = Arrays.asList("na", "bcc", "c", "bd", "e");

		final long countFriendsStartN = friends.stream().filter(startsWithLetter.apply("n")).count();

		final long countFriendsStartB = friends.stream().filter(startsWithLetter.apply("b")).count();
		System.out.println(countFriendsStartB);
	}

}
