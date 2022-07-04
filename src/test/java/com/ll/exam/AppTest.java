package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test // 컴퓨터가 읽는 주석
    public void 더하기_테스트() {
        int a = 10 + 5;
        // expected : 기대하는 값
        // 15 == a 인가를 물어본다.
        assertEquals(15, a);
    }
}
