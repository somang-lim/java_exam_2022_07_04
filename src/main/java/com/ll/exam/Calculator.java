package com.ll.exam;

public class Calculator {

    public static int run(String s) {
        // -가 들어있으면 index 숫자를 반환한다. 없다면 -1을 반환한다.
        boolean isMinus = s.indexOf(" - ") != -1;
        boolean isMultiple = s.indexOf(" * ") != -1;

        if(isMinus) {
            return runMinus(s);
        } else if(isMultiple) {
            return runMultiple(s);
        }

        return runPlus(s);
    }

    private static int runPlus(String s) {
        String[] sBits = s.split(" \\+ ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 + no2;
    }

    private static int runMinus(String s) {
        String[] sBits = s.split(" \\- ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 - no2;
    }

    private static int runMultiple(String s) {
        String[] sBits = s.split(" \\* ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 * no2;
    }

}
