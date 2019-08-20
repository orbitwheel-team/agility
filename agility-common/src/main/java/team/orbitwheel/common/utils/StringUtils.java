package team.orbitwheel.common.utils;

import java.util.regex.Pattern;

/**
 * @author carzy
 */
public class StringUtils {

    private static final Pattern INT_PATTERN = Pattern.compile("^\\d+$");

    public static final String EMPTY = "";


    private StringUtils() {
    }

    /**
     * is empty string.
     *
     * @param str source string.
     * @return is empty.
     */
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    /**
     * is not empty string.
     *
     * @param str source string.
     * @return is not empty.
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * is empty or blank.
     *
     * @param cs source string.
     * @return is isBlank.
     */
    public static boolean isBlank(CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * is not blank.
     *
     * @param cs source charSequence.
     * @return is not blank.
     */
    public static boolean isNotBlank(CharSequence cs) {
        return !isBlank(cs);
    }

    /**
     * Gets a CharSequence length or {@code 0} if the CharSequence is
     * {@code null}.
     *
     * @param cs a CharSequence or {@code null}
     * @return CharSequence length or {@code 0} if the CharSequence is
     * {@code null}.
     */
    public static int length(final CharSequence cs) {
        return cs == null ? 0 : cs.length();
    }

    /**
     * equals any two string.
     *
     * @param s1 source one.
     * @param s2 source two.
     * @return equals.
     */
    public static boolean isEquals(String s1, String s2) {
        if (s1 == null && s2 == null) {
            return true;
        }
        if (s1 == null || s2 == null) {
            return false;
        }
        return s1.equals(s2);
    }

    /**
     * is integer string.
     *
     * @param str
     * @return is integer
     */
    public static boolean isInteger(String str) {
        return isNotEmpty(str) && INT_PATTERN.matcher(str).matches();
    }
}
