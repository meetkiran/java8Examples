package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningElement {

	public static void main(String[] args) {
		List<String> friends = Arrays.asList("na", "bcc", "c", "bd", "enna");
		System.out.println(String.join(", ", friends));
		System.out.println(
				friends.stream()
				.map(String::toUpperCase)
						.collect(Collectors.joining(", ")));
	}

}
