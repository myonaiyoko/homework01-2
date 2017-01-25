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

		if(n < 1) {
			throw new IllegalArgumentException ("引数が自然数ではありません。");
		}

		if(n == 1) {
			 n = 2;
		}

		if(m == 1) {
			m = 2;
		}

		int startNumber;
		int endNumber;

		if(n <= m) {
			startNumber = n;
			endNumber = m;
		} else {
			startNumber = m;
			endNumber = n;
		}

		//素数の計算は最大値の平方根までで十分
//		endNumber = (int)Math.sqrt(endNumber);
		List<Integer> primeNumberList = new ArrayList<Integer>();
//		if (startNumber == 2) {
//			primeNumberList.add(2);
//		}

		for (int i = startNumber; i <= endNumber; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
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
