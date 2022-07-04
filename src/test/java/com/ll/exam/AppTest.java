package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test // 컴퓨터가 읽는 주석
    public void 더하기_테스트() {
        int rs = Calculator.add("10 + 20");

        // expected : 기대한(예상한) 값
        assertEquals(30, rs);
    }

    @Test
    public void 더하기_테스트_2() {
        int rs = Calculator.add("20 + 20");

        assertEquals(40, rs);
    }
}
