package homework01;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.junit.Test;

public class TestMyCalendar {

	@Test(expected = IllegalArgumentException.class)
	public void testOutputCalendar1() {
		MyCalendar.outputCalendar(2017, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testOutputCalendar2() {
		MyCalendar.outputCalendar(2016, -1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testOutputCalendar3() {
		MyCalendar.outputCalendar(2016, 13);
	}

	@Test
	public void testGetCalendar1() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		MyCalendar myCalendar = new MyCalendar();
		Method myCalendarMethod = MyCalendar.class.getDeclaredMethod("getCalendar", int.class, int.class);
		myCalendarMethod.setAccessible(true);

		@SuppressWarnings("unchecked")
		List<String> lst = (List<String>) myCalendarMethod.invoke(myCalendar, 2017, 1);

		assertThat(lst.get(0), is("Sun  Mon  Tue  Wed  Thu  Fri  Sat"));
		assertThat(lst.get(1), is("  1    2    3    4    5    6    7"));
		assertThat(lst.get(2), is("  8    9   10   11   12   13   14"));
		assertThat(lst.get(3), is(" 15   16   17   18   19   20   21"));
		assertThat(lst.get(4), is(" 22   23   24   25   26   27   28"));
		assertThat(lst.get(5), is(" 29   30   31"));
		assertThat(lst.size(), is(6));
	}

	@Test
	public void testGetCalendar2() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		MyCalendar myCalendar = new MyCalendar();
		Method myCalendarMethod = MyCalendar.class.getDeclaredMethod("getCalendar", int.class, int.class);
		myCalendarMethod.setAccessible(true);

		@SuppressWarnings("unchecked")
		List<String> lst = (List<String>) myCalendarMethod.invoke(myCalendar, 2017, 1);

		assertThat(lst.get(0), is("Sun  Mon  Tue  Wed  Thu  Fri  Sat"));
		assertThat(lst.get(1), is("  1    2    3    4    5    6    7"));
		assertThat(lst.get(2), is("  8    9   10   11   12   13   14"));
		assertThat(lst.get(3), is(" 15   16   17   18   19   20   21"));
		assertThat(lst.get(4), is(" 22   23   24   25   26   27   28"));
		assertThat(lst.get(5), is(" 29   30   31"));
		assertThat(lst.size(), is(6));
	}

}
