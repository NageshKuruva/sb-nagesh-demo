package org.nagesh.demo.controller.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

@Service
public class StreamServiceImpl implements StreamService {

	@Override
	public String convertStringToInt() {
		// List of String
		List<String> numbers = Arrays.asList("1","2","3","4","5","6","7","8");
		System.out.println("List of Strings"+numbers);
		//convert the numbers into stream
		List<Integer> num = numbers.stream()
							.map(s->Integer.valueOf(s))
							.filter(n -> n % 2 == 0)
							.collect(Collectors.toList());
		//printing filter only even numbers
		System.out.println("List of Integers"+num);
		String methodOutput = "SUCCESS";//TODO -> add method definiton & output -> display on frontend
		
		return methodOutput;
	}

	@Override
	public String printRangeF() {
		IntStream
		.range(0, 24).forEach(System.out::print);
		return null;
	}

}
