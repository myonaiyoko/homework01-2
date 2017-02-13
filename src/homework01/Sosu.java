package homework01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */

/**
 * @author Administrator
 *
 */
public class Sosu {

	public static List<Integer> getPrimeNumberList(int n, int m) {

		if (n < 1) {
			throw new IllegalArgumentException("引数が自然数ではありません。");
		}

		if (n == 1) {
			n = 2;
		}

		if (m == 1) {
			m = 2;
		}

		int startNumber;
		int endNumber;

		if (n <= m) {
			startNumber = n;
			endNumber = m;
		} else {
			startNumber = m;
			endNumber = n;
		}

		List<Integer> primeNumberList = new ArrayList<Integer>();

		for (int i = startNumber; i <= endNumber; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeNumberList.add(i);
			}
		}

		return primeNumberList;
	}

}
