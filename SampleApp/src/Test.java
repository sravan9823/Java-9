import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 3);
		Set<Integer> set = new HashSet<Integer>();

		for (Integer val : list) {
			if (!set.add(val))
				System.out.println("Circular linked list");
		}
		System.out.println(set);

	}

}
