package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = {5, 10, 3};
        int el = 5;
        int result = FindLoop.ibdexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNotThenMinus1() {
        int[] data = {3, 7, 0};
        int el = 9;
        int result = FindLoop.ibdexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas7Then3() {
        int[] data = {12, 0, 9, 7, 15};
        int el = 7;
        int result = FindLoop.ibdexOf(data, el);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}