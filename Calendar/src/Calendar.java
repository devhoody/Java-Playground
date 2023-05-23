
public class Calendar {

	private static final int[] Max_Days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_Max_Days = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}

	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_Max_Days[month];
		}
		return Max_Days[month];
	}

	private int getWeekDay(int year, int month, int day) {
		int syear = 1970;
		final int STANDARD_WEEKDAY = 4; // 1970/1/1/Thusday

		int count = 0;

		for (int i = syear; i < year; i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}
		for (int i = 1; i < month; i++) {
			int delta = getMaxDaysOfMonth(year, i);
			count += delta;
		}

		count += day - 1;
		int weekday = (count + STANDARD_WEEKDAY) % 7;
		return weekday;
	}

	// Simple test code
	public static void main(String[] args) {
		Calendar c = new Calendar();
		System.out.println(c.getWeekDay(1970, 1, 1) == 3);
		System.out.println(c.getWeekDay(1971, 1, 1) == 4);
		System.out.println(c.getWeekDay(1972, 1, 1) == 5);
		System.out.println(c.getWeekDay(1973, 1, 1) == 0);
		System.out.println(c.getWeekDay(1974, 1, 1) == 1);

	}

	public void printSampleCalendar(int year, int month) {
		System.out.printf("   <<%4d³â %3d¿ù>> \n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("--------------------");

		// get weekday automatically
		int weekday = getWeekDay(year, month, 1);

		// print black space
		for (int i = 0; i < weekday; i++) {
			System.out.print("   ");
		}

		int count = 7 - weekday;
		int delim = (count < 7) ? count : 0;
		/*
		 * if(count < 7) delim = count; else delim = 0;
		 */

		for (int i = 1; i <= count; i++) {
			System.out.printf("%3d", i);

		}
		System.out.println();

		int maxDay = getMaxDaysOfMonth(year, month);

//		count ++;
		for (int i = count + 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == delim)
				System.out.println();
		}

		System.out.println();
		System.out.println();
	}

}
