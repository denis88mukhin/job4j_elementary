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
}