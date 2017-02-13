package homework01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MyCalendar {

	private static final int FIRST_DAY = 1;
	private static final int FIRST_MONTH = 1;
	private static final int WEEK_OF_DAY = 7;
	private static final int END_OF_WEEK = 6;
	private static final int MAX_MONTH = 12;
	private static final String SPACE = "  ";
	private static final String DAY_FORMAT = "%3s";
	private static final String CALENDAR_HEADER = String.format(DAY_FORMAT, "Sun") + SPACE
			+ String.format(DAY_FORMAT, "Mon") + SPACE + String.format(DAY_FORMAT, "Tue") + SPACE
			+ String.format(DAY_FORMAT, "Wed") + SPACE + String.format(DAY_FORMAT, "Thu") + SPACE
			+ String.format(DAY_FORMAT, "Fri") + SPACE + String.format(DAY_FORMAT, "Sat");

	public static void outputCalendar(int year, int month) {
		if ((month < FIRST_MONTH) || (month > MAX_MONTH)) {
			throw new IllegalArgumentException("月は1から12の間で入力してください。");
		}

		List<String> calendarList = getCalendar(year, month);
		for (String calender : calendarList) {
			System.out.println(calender);
		}
	}

	private static List<String> getCalendar(int year, int month) {
		month--;
		List<String> dayOfMonth = new ArrayList<String>();
		for (int i = 1; i < getWeekOfFirstDay(year, month); i++) {
			dayOfMonth.add(String.format(DAY_FORMAT, ""));
		}

		for (int i = FIRST_DAY; i <= getLastDayOfMonth(year, month); i++) {
			dayOfMonth.add(String.valueOf(i));
		}

		List<String> calendarList = new ArrayList<String>();
		calendarList.add(CALENDAR_HEADER);

		StringBuilder week = new StringBuilder();

		for (int i = 0; i < dayOfMonth.size(); i++) {
			week.append(String.format(DAY_FORMAT, dayOfMonth.get(i)) + SPACE);
			if ((i % WEEK_OF_DAY == END_OF_WEEK) || (i == dayOfMonth.size() - 1)) {
				calendarList.add(week.substring(0, week.length() - SPACE.length()));
				week.setLength(0);
			}
		}

		return calendarList;
	}

	private static int getWeekOfFirstDay(int year, int month) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, FIRST_DAY);

		return calendar.get(Calendar.DAY_OF_WEEK);
	}

	private static int getLastDayOfMonth(int year, int month) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);

		return calendar.getActualMaximum(Calendar.DATE);
	}
}
