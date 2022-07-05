package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test // 컴퓨터가 읽는 주석
    public void 더하기() {
        int rs = Calculator.run("10 + 20");

        // expected : 기대한(예상한) 값
        assertEquals(30, rs);
    }

    @Test
    public void 더하기_2() {
        int rs = Calculator.run("20 + 20");

        assertEquals(40, rs);
    }

    @Test
    public void 더하기_3() {
        int rs = Calculator.run("10 + 10");

        assertEquals(20, rs);
    }
    
    @Test
    public void 빼기() {
        int rs = Calculator.run("10 - 10");

        assertEquals(0, rs);
    }

    @Test
    public void 곱하기() {
        int rs = Calculator.run("10 * 10");

        assertEquals(100, rs);
    }

    @Test
    public void 나누기() {
        int rs = Calculator.run("100 / 10");

        assertEquals(10, rs);
    }
}
