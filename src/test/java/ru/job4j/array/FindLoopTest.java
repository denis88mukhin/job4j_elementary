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
    void whenDiaposonHasSomeEqualeElementThen3() {
        int[] data = new int[] {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int el = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[] {4, 14, 4, 3, 21, 16};
        int el = 8;
        int start = 0;
        int finish = 2;
        int result = FindLoop.indexRange(data, el, start, finish);
        int expected = -1;
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