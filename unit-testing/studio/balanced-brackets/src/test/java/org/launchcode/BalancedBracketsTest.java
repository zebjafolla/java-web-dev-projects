package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BalancedBracketsTest {

    //TODO: add tests here

    //@BeforeEach
    String test_case_false = "[Test";
    String test_case_true = "[Test]";

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test //1
    public void testStringAsParam() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("3"));
    }

    @Test //2
    public void testFalsieReturn() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(test_case_false));
    }

    @Test //3

    public void testTruthieReturn() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(test_case_true));
    }

    @Test //4
    public void testCloseOpen() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]][]]["));
    }

    @Test //5
    public void testBracketInStr() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("There was a time when a boy could drink from the well " +
                " but that time has passed. Would this be the only time that could happen [?}?"));
    }

    @Test //6
    public void testEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test //7
    public void testStringWithoutBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("And then there was only one left."));
    }

    @Test //8
    public void testSingleBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test //9
    public void testThreeBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test //10
    public void testUnevenBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][][][][]["));
    }

    @Test //11
    public void testBracketsWithinBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[]]]]]"));
    }

    @Test //12
    public void testMethodInsertingAInt() {

        assertThrows(IllegalArgumentException.class, () -> BalancedBrackets.hasBalancedBrackets(34));

    }
}
