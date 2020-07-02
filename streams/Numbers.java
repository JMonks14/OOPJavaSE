package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Numbers {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(9,9,3,2,12);
		
		List<Integer> max = 
			nums.stream()
			.sorted()
			.collect(Collectors.toList());
		System.out.println(max.get(max.size()-1));
		
		List<Integer> min = 
			nums.stream()
			.sorted()
			.collect(Collectors.toList());
		System.out.println(min.get(0));
		
		List<Integer> odds =
			nums.stream()
			.filter(i -> i % 2==1)
			.collect(Collectors.toList());
		System.out.println(odds);
		
		List<Integer> evens =
				nums.stream()
			.filter(i -> i % 2==0)
			.collect(Collectors.toList());
		System.out.println(evens);
		
		int sum = 
			nums.stream()
			.reduce((a,b) -> a+b)
			.get();
		System.out.println(sum);
		List<Integer> minSquareOdd =
			nums.stream()
			.filter(i -> i % 2==1)
			.map(x -> x*x)
			.sorted()
			.collect(Collectors.toList());
		System.out.println(minSquareOdd.get(0));
		
				

	}

}
