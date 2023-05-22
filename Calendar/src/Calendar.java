
public class Calendar {

	private static final int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_Max_Days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}

	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_Max_Days[month - 1];
		}
		return Max_Days[month - 1];
	}

	public void printCountCalendar(int maxDay, int count) {
		for (int i = count + 1; i < maxDay; i++) {
			System.out.printf("%3d", i);

		}
	}

	public void printSampleCalendar(int year, int month, int weekday) {
		System.out.printf("   <<%4d³â %3d¿ù>> \n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("--------------------");

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
