public class lat13Switchstring {
	public static void main(String[] args) {
		String dayOfWeekArg = "Sunday";
		String typeOfDay = "";

		switch (dayOfWeekArg) {
			case "Monday":
				typeOfDay = "Start of work week";
				break;
			case "Tuesday":
			case "Wednesday":
			case "Thursday":
				typeOfDay = "Midweek";
				break;
			case "Friday":
				typeOfDay = "End of work week";
				break;
			case "Saturday":
			case "Sunday":
				typeOfDay = "Weekend";
				break;
			default:
				System.out.println ("Invalid day of the week: " +dayOfWeekArg);
		}
		System.out.println (typeOfDay);
	}
}

/* Code ini digunakan untuk mengaplikasikan switch-case pada tipe data string */