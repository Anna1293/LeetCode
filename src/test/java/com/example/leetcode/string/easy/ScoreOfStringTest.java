package com.example.leetcode.string.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScoreOfStringTest {

    @Test
    void test1(){
        String s = "hello";

        int expect = 13;

        int result = ScoreOfString.scoreOfString(s);

        Assertions.assertEquals(expect, result);
    }
}

