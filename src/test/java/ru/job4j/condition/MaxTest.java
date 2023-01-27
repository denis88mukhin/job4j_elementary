package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int expected = 5;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To9Then9() {
        int left = 4;
        int right = 9;
        int expected = 9;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To7Then7() {
        int left = 7;
        int right = 7;
        int expected = 7;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To5To10Then10() {
        int first = 7;
        int second = 5;
        int third = 10;
        int expected = 10;
        int result = Max.max(first, second, third);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax6To0To2Then6() {
        int first = 6;
        int second = 0;
        int third = 2;
        int expected = 6;
        int result = Max.max(first, second, third);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax6To9To2Then9() {
        int first = 6;
        int second = 9;
        int third = 2;
        int expected = 9;
        int result = Max.max(first, second, third);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax6To9To2To15Then15() {
        int first = 6;
        int second = 9;
        int third = 2;
        int fourth = 15;
        int expected = 15;
        int result = Max.max(first, second, third, fourth);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax6To3To8To1Then8() {
        int first = 6;
        int second = 3;
        int third = 8;
        int fourth = 1;
        int expected = 8;
        int result = Max.max(first, second, third, fourth);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax14To9To2To10Then14() {
        int first = 14;
        int second = 9;
        int third = 2;
        int fourth = 10;
        int expected = 14;
        int result = Max.max(first, second, third, fourth);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax14To29To17To10Then29() {
        int first = 14;
        int second = 29;
        int third = 17;
        int fourth = 10;
        int expected = 29;
        int result = Max.max(first, second, third, fourth);
        assertThat(result).isEqualTo(expected);
    }
}