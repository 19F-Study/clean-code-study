import org.jfree.date.SerialDate;
import org.jfree.date.SpreadsheetDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {

		// serial : 2 => 1900.1.1

		SerialDate serialDate = new SpreadsheetDate(3);
		System.out.println(serialDate.getMonth());
		System.out.println(serialDate.getDayOfMonth());

//		DateTimeFormatter yyyy = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
//		DateTimeFormatter YYYY = DateTimeFormatter.ofPattern("YYYYMMddHHmmss");
//
//		LocalDateTime localDateTime = LocalDateTime.of(2018, Month.DECEMBER, 30, 12, 30);
//
//		System.out.println("yyyy : " + localDateTime.format(yyyy));
//		System.out.println("YYYY : " + localDateTime.format(YYYY));

	}
}
