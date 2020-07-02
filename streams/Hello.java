package streams;

import java.util.List;
import java.util.stream.*;
import java.util.Arrays;
import java.util.Collections;

public class Hello {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
		names.stream()
				.forEach(x -> System.out.println("Hello " + x));
	}
	
}
