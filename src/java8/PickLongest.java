package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PickLongest {

	public static void main(String[] args) {
		List<String> friends = Arrays.asList("na", "bcc", "c", "bd", "enna");
		final Optional<String> aLongName = friends.stream()
				.reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
		aLongName.ifPresent(name -> System.out.println(String.format("A longest name: %s", name)));
	
		final String aShortName = friends.stream()
				.reduce("enna",(name1, name2) -> name1.length() <= name2.length() ? name1 : name2);
		 System.out.println(String.format("A longest name: %s", aShortName));
	}

}
