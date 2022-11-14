package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSort3Numbers() {
        int[] data = new int[] {7, 0, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 3, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSort5Numbers() {
        int[] data = new int[] {12, 55, 5, 34, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 5, 12, 34, 55};
        assertThat(result).containsExactly(expected);
    }
}