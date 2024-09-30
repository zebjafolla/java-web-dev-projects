package org.launchcode;
public class BalancedBrackets {
    /*
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */

    public static boolean hasBalancedBrackets(String str) {
        int ctrOpen = 0;
        int ctrClose = 0;
        if(str == null){
            throw new IllegalArgumentException("Input cannot be null");
        }
        if (str instanceof String) {
            for (char ch : str.toCharArray()) {
                if (ch == '[') {
                    if (ctrClose > ctrOpen) {
                        return false;
                    }
                    ctrOpen++;
                } else if (ch == ']') {
                    ctrClose++;
                }
            }
            return (ctrClose == ctrOpen);
        }
        return false;
    }

    public static boolean hasBalancedBrackets(Object object){
        throw new IllegalArgumentException("Input must be a string");
    }
}