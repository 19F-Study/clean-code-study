package abstractfactory;

import java.time.DayOfWeek;

public class Main {

    public static void main(String[] args) {
        var bookFactory = BookFactory.getFactory(DayOfWeek.WEDNESDAY);
        var book = bookFactory.getBook();
        System.out.println(book.getClass().getName());
    }

}
