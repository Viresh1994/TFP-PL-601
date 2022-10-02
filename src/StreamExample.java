import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> seqStream = Arrays.asList("Hello", "G","E","E","K","S");
//		seqStream.stream().forEach(System.out::println);
//		seqStream.parallelStream().forEach(System.out::println);
//		seqStream.parallelStream().forEachOrdered(System.out::println);
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Sequential stream");
		numbers.stream().forEach(e ->{
				System.out.println(e + " " + Thread.currentThread().getName());
		});
		
		System.out.println("Parallel stream example");
		numbers.parallelStream().forEach(e -> {
			System.out.println(e + " " + Thread.currentThread().getName());
		});
		
		
		
	}

}
