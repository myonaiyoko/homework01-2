package homework01;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TestFibonacci {

	@Test(expected = IllegalArgumentException.class)
	public void testGetFibonacciNumberList1() {
		Fibonacci.getFibonacciNumberList(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetFibonacciNumberList2() {
		Fibonacci.getFibonacciNumberList(-100);
	}

	@Test
	public void testGetFibonacciNumberList3() {
		List<Integer> lst = Fibonacci.getFibonacciNumberList(6);
		assertThat(lst.get(0), is(Integer.valueOf(0)));
		assertThat(lst.get(1), is(Integer.valueOf(1)));
		assertThat(lst.get(2), is(Integer.valueOf(1)));
		assertThat(lst.get(3), is(Integer.valueOf(2)));
		assertThat(lst.get(4), is(Integer.valueOf(3)));
		assertThat(lst.get(5), is(Integer.valueOf(5)));
		assertThat(lst.size(), is(6));

	}

	@Test
	public void testGetFibonacciNumberList4() {
		List<Integer> lst = Fibonacci.getFibonacciNumberList(233);
		assertThat(lst.get(0), is(Integer.valueOf(0)));
		assertThat(lst.get(1), is(Integer.valueOf(1)));
		assertThat(lst.get(2), is(Integer.valueOf(1)));
		assertThat(lst.get(3), is(Integer.valueOf(2)));
		assertThat(lst.get(4), is(Integer.valueOf(3)));
		assertThat(lst.get(5), is(Integer.valueOf(5)));
		assertThat(lst.get(6), is(Integer.valueOf(8)));
		assertThat(lst.get(7), is(Integer.valueOf(13)));
		assertThat(lst.get(8), is(Integer.valueOf(21)));
		assertThat(lst.get(9), is(Integer.valueOf(34)));
		assertThat(lst.get(10), is(Integer.valueOf(55)));
		assertThat(lst.get(11), is(Integer.valueOf(89)));
		assertThat(lst.get(12), is(Integer.valueOf(144)));
		assertThat(lst.get(13), is(Integer.valueOf(233)));
	}

}
