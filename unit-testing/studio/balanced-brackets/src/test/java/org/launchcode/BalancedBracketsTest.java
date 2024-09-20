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

    /*@Test //5
    public void testBracketInStr() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(
    }
 */
    }
