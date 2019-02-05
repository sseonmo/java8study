package ch12.sec06;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.util.Locale;

public class Formatting {
	public static void main(String[] args) {
		ZonedDateTime apollo11launch = ZonedDateTime.of(1969, 7, 16, 9, 32, 0, 0,
				ZoneId.of("America/New_York"));

		String formatted = DateTimeFormatter.ISO_DATE_TIME.format(apollo11launch);
		// 1969-07-16T09:32:00-05:00[America/New_York]
		System.out.println(formatted);

		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		formatted = formatter.format(apollo11launch);
		// July 16, 1969 9:32:00 AM EDT
		System.out.println(formatted);

		formatted = formatter.withLocale(Locale.US).format(apollo11launch);
		// 16 juillet 1969 09:32:00 EDT
		System.out.println(formatted);

		formatter = DateTimeFormatter.ofPattern("E yyyy-MM-dd HH:mm");
		formatted = formatter.format(apollo11launch);
		System.out.println(formatted);

		LocalDate churchsBirthday = LocalDate.parse("1903-06-14");
		System.out.println("churchsBirthday: " + churchsBirthday);
		apollo11launch = ZonedDateTime.parse("1969-07-16 03:32:00-0400", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssxx"));
		System.out.println("apollo11launch: " + apollo11launch);

		System.out.println(ZonedDateTime.ofInstant(Instant.parse("2019-02-05T08:40:52.815Z"), ZoneId.of("Asia/Seoul")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));

		for (DayOfWeek w : DayOfWeek.values()) {
			System.out.print(w.getDisplayName(TextStyle.SHORT, Locale.ENGLISH) + " ");
			System.out.print(w.getDisplayName(TextStyle.SHORT, Locale.KOREA) + " ");

		}
	}
}
