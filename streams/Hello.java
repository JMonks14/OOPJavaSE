package streams;

import java.util.List;
import java.util.stream.*;
import java.util.Arrays;
import java.util.Collections;

public class Hello {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
		names.stream()
		    .filter(i -> !i.contentEquals("James"))		
			.forEach(x -> System.out.println("Hello " + x));
	}
	
}
