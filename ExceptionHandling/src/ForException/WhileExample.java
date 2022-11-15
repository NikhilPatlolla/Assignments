package ForException;

import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class WhileExample {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(6,5,2,8,9,6,5);
		Stream<Integer> stream = nums.stream();
		stream.forEach(n->System.out.println(n));
		
		
//		Consumer<Integer> consumer = new Consumer<Integer>() {
//			public void accept(){
//				System.out.println();
//		};
	}
}


class Cal{
	public void add(byte a, byte b) {
		System.out.println(a+b);
	}
}
