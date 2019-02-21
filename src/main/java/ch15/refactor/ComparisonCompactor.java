package ch15.refactor;

import ch15.Assert;

/**
 * This class is copied from
 * ref) https://github.com/junit-team/junit4/blob/master/src/main/java/junit/framework/ComparisonCompactor.java
 */
public class ComparisonCompactor {

    private static final String ELLIPSIS = "...";
    private static final String DELTA_END = "]";
    private static final String DELTA_START = "[";

    private int contextLength;
    private String expected;
    private String actual;
    private int commonPrefixIndex;
    private int commonSuffixIndex;

    public ComparisonCompactor(int contextLength, String expected, String actual) {
        this.contextLength = contextLength;
        this.expected = expected;
        this.actual = actual;
    }

    @SuppressWarnings("deprecation")
    public String formatCompactedComparison(String message) {
        if (isValid()) {
            return Assert.format(message, expected, actual);
        }

        // 시간적인 결합
        commonPrefixIndex = findCommonPrefixIndex();
        commonSuffixIndex = findCommonSuffixIndex(commonPrefixIndex);

        String expected = compactString(this.expected);
        String actual = compactString(this.actual);

        return Assert.format(message, expected, actual);
    }

    private boolean isValid() {
        return expected == null || actual == null || areStringsEqual();
    }

    private int getSuffix() {
        // 왜 1을 더하는지 명시해야 한다.
        return commonSuffixIndex + 1;
    }

    private String compactString(String source) {
        String result = DELTA_START + source.substring(commonPrefixIndex, source.length() - getSuffix()) + DELTA_END;
        if (commonPrefixIndex > 0) {
            result = computeCommonPrefix() + result;
        }
        if (commonSuffixIndex > 0) {
            result = result + computeCommonSuffix();
        }
        return result;
    }

    private int findCommonPrefixIndex() {
        int prefix = 0;
        int end = Math.min(expected.length(), actual.length());
        for (; prefix < end; prefix++) {
            if (expected.charAt(prefix) != actual.charAt(prefix)) {
                break;
            }
        }
        return prefix;
    }

    private int findCommonSuffixIndex(int commonPrefix) {
        int expectedSuffix = expected.length() - 1;
        int actualSuffix = actual.length() - 1;
        for (; actualSuffix >= commonPrefix && expectedSuffix >= commonPrefix; actualSuffix--, expectedSuffix--) {
            if (expected.charAt(expectedSuffix) != actual.charAt(actualSuffix)) {
                break;
            }
        }
        return expected.length() - expectedSuffix;
    }

    private String computeCommonPrefix() {
        return (commonPrefixIndex > contextLength ? ELLIPSIS : "") + expected.substring(Math.max(0, commonPrefixIndex - contextLength), commonPrefixIndex);
    }

    private String computeCommonSuffix() {
        int end = Math.min(expected.length() - getSuffix() + contextLength, expected.length());
        return expected.substring(expected.length() - getSuffix(), end) + (expected.length() - getSuffix() < expected.length() - contextLength ? ELLIPSIS : "");
    }

    private boolean areStringsEqual() {
        return expected.equals(actual);
    }
}