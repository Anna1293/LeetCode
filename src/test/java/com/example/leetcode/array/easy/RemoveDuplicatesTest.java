package com.example.leetcode.array.easy;

import org.junit.jupiter.api.Test;

import static com.example.leetcode.array.easy.RemoveDuplicates.removeDuplicates;

public class RemoveDuplicatesTest {
    @Test
    void test1() {

        int[] nums = {1, 1, 2};
        int[] expect = {1, 2};

        int k = removeDuplicates(nums);

        assert k == expect.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expect[i];
        }
    }
}



