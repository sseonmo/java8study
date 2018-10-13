package ch08.sec07;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.ofNullable;

public class OptionalDemo {
	public static void main(String[] args) throws IOException {
		String contents = new String(Files.readAllBytes(Paths.get("alice.txt")),
				StandardCharsets.UTF_8);
		List<String> wordList = Arrays.asList(contents.split("\\PL+"));

		Optional<String> optionalValue = wordList.stream().filter(s -> s.contains("Author"))
				.findFirst();
		System.out.print(optionalValue.orElse("No word") + " contains fred");

		Optional<String> optionalString = Optional.empty();
		String result = optionalString.orElse("N/A");
		System.out.println("result: " + result);

		result = optionalString.orElseGet(() -> System.getProperty("user.dir"));
		System.out.println("result: " + result);
		/*try {
			result = optionalString.orElseThrow(IllegalStateException::new);
			System.out.println("result: " + result);
		} catch (Throwable t) {
			t.printStackTrace();
		}*/

		optionalValue = wordList.stream().filter(s -> s.contains("red")).findFirst();
		System.out.println(optionalValue);

		optionalValue.ifPresent(s -> System.out.println(s + " contains red"));

		Set<String> results = new HashSet<>();
		optionalValue.ifPresent(results::add);
		System.out.println(Arrays.toString(results.toArray()));
		Optional<Boolean> added = optionalValue.map(results::add);
		Optional<Boolean> added1 = Optional.of(result).map(results::add);
		System.out.println(added);
		System.out.println(added1);
		System.out.println(Arrays.toString(results.toArray()));


		System.out.println(inverse(4.0).flatMap(OptionalDemo::squareRoot));	//not empty
		System.out.println(inverse(-1.0).flatMap(OptionalDemo::squareRoot));	//empty
		System.out.println(inverse(0.0).flatMap(OptionalDemo::squareRoot));	//empty
		Optional<Double> result2 = Optional.of(-4.0)
									.flatMap(OptionalDemo::inverse)
									.flatMap(OptionalDemo::squareRoot);
		System.out.println(result2);	//empty
	}

	public static Optional<Double> inverse(Double x) {
		return x == 0 ? Optional.empty() : Optional.of(1 / x);
	}

	public static Optional<Double> squareRoot(Double x) {
		return x < 0 ? Optional.empty() : Optional.of(Math.sqrt(x));
	}
}
