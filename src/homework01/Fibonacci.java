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
public class Fibonacci {

	public static List<Integer> getFibonacciNumberList(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("1以上の整数を入力してください。");
		}

		List<Integer> fibonacciList = new ArrayList<Integer>();

		fibonacciList.add(0);
		fibonacciList.add(1);

		int ikkomae = 1;
		int nikomae = 0;
		for (int i = 1; i <= n; i = ikkomae + nikomae) {
			fibonacciList.add(i);
			nikomae = ikkomae;
			ikkomae = i;
		}

		return fibonacciList;

	}

}
