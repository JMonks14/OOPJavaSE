package streams;

import java.util.List;
import java.util.stream.*;
import java.util.Arrays;
import java.util.Collections;

public class Multiplier {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(3,4,7,8,12);
		int prod = 
				nums.stream()
				.reduce((a,b) -> a*b)
				.get();
		System.out.println(prod);

	}

}
