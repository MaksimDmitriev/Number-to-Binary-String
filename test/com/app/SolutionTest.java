package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void one() {
        Solution solution = new Solution();
        assertEquals("00000000000000000000000000000001", solution.toBinaryString(1));
    }

    @Test
    void minusOne() {
        Solution solution = new Solution();
        assertEquals("11111111111111111111111111111111", solution.toBinaryString(-1));
    }

    @Test
    void intMin() {
        Solution solution = new Solution();
        assertEquals("10000000000000000000000000000000", solution.toBinaryString(Integer.MIN_VALUE));
    }

    @Test
    void intMax() {
        Solution solution = new Solution();
        assertEquals("01111111111111111111111111111111", solution.toBinaryString(Integer.MAX_VALUE));
    }

    @Test
    void even() {
        Solution solution = new Solution();
        assertEquals("00000000000000000000000001111100", solution.toBinaryString(124));
    }

    @Test
    void odd() {
        Solution solution = new Solution();
        assertEquals("00000000000000000000000000100101", solution.toBinaryString(37));
    }
}