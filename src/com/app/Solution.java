package com.app;

public class Solution {

    public String toBinaryString(int n) {
        char[] buffer = new char[32];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = '0';
        }
        int i = buffer.length - 1;
        while (n != 0) {
            if (n % 2 != 0) {
                buffer[i] = '1';
            }
            i--;
            n >>>= 1;
        }
        return new String(buffer);
    }
}
