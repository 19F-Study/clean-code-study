package ch15;

/**
 * This class is copied from https://github.com/ludwiggj/CleanCode
 */
public class Assert {
    // Copied from Assert class, since cannot access it here
    public static String format(String message, String expected, String actual) {
        String formatted = "";
        if (message != null)
            formatted = message + " ";
        return formatted + "expected:<" + expected + "> but was:<" + actual + ">";
    }
}
