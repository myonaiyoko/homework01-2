import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestSosu {

	@Test
	public void testGetPrimeNumberList1() {
		List<Integer> lst = Sosu.getPrimeNumberList(1, 5);
		assertThat(2, is(lst.get(0)));
		assertThat(3, is(lst.get(1)));
		assertThat(5, is(lst.get(2)));
		assertThat(3, is(lst.size()));
	}
	@Test
	public void testGetPrimeNumberList2() {
		List<Integer> lst = Sosu.getPrimeNumberList(10, 20);
		assertThat(11,is(lst.get(0)));
		assertThat(13,is(lst.get(1)));
		assertThat(17,is(lst.get(2)));
		assertThat(19,is(lst.get(3)));
		assertThat(4,is(lst.size()));
	}
	@Test(expected= IllegalArgumentException.class)
	public void testGetPrimeNumberList3() {
		Sosu.getPrimeNumberList(0, 3);
	}
	@Test
	public void testGetPrimeNumberList5() {
		List<Integer> lst = new ArrayList<Integer>();
		assertEquals(Sosu.getPrimeNumberList(20, 22),lst);
	}
	@Test
	public void testGetPrimeNumberList6() {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(5);
		assertEquals(Sosu.getPrimeNumberList(5,5),lst);
	}
	@Test
	public void testGetPrimeNumberList7() {
		List<Integer> lst = new ArrayList<Integer>();
		assertEquals(Sosu.getPrimeNumberList(4, 4),lst);
	}

}
