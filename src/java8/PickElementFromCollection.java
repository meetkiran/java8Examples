package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PickElementFromCollection {
	public static void pickName(final List<String> names, final String startingLetter) {
		final Optional<String> foundName = names.stream().filter(name -> name.startsWith(startingLetter)).findFirst();

		foundName.ifPresent(name -> System.out.println("Hello " + name));

		System.out.println(
				String.format("A name starting with %s: %s", startingLetter, foundName.orElse("No name found")));
	}

	public static void main(String[] args) {
		List<String> friends = Arrays.asList("na", "bcc", "c", "bd", "enna");
		pickName(friends, "e");
		System.out.println(
				"Total number of characters in all names: " + friends.stream().mapToInt(name -> name.length()).sum());
	}

}
