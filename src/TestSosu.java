import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestSosu {

	@Test
	public void testGetPrimeNumberList1() {
		List<Integer> lst = Sosu.getPrimeNumberList(1, 5);
		assertThat(lst.get(0),is(2));
		assertThat(lst.get(1), is(3));
		assertThat(lst.get(2), is(5));
		assertThat(lst.size(), is(3));
	}
	@Test
	public void testGetPrimeNumberList2() {
		List<Integer> lst = Sosu.getPrimeNumberList(10, 20);
		assertThat(lst.get(0),is(11));
		assertThat(lst.get(1),is(13));
		assertThat(lst.get(2),is(17));
		assertThat(lst.get(3),is(19));
		assertThat(lst.size(),is(4));
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
