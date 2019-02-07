package abstractfactory;

import lombok.NonNull;

import java.time.DayOfWeek;

public class BookFactory {

    private BookFactory() {
    }

    public static BookAbstractFactory getFactory(@NonNull final DayOfWeek dayOfWeek) {
        if (isDayOfNonLiteratureReadingDay(dayOfWeek)) {
            return new NonLiteratureFactory();
        } else {
            return new LiteratureFactory();
        }
    }

    private static boolean isDayOfNonLiteratureReadingDay(final DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
            case WEDNESDAY:
            case FRIDAY:
            case SUNDAY:
                return true;
            case TUESDAY:
            case THURSDAY:
            case SATURDAY:
                return false;
            default:
                throw new IllegalArgumentException();
        }
    }

}
