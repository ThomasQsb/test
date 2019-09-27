package com.testju;

public class main {
    public int getlargestelement(int[] list){
        int max=Integer.MIN_VALUE;
        for (int a:list) {
            if (max<a){
                max=a;
            }
        }
        return max;
    }
}
