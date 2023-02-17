package com.slb.thread;

public class TypeCastingExplicitExample {
        public static void main(String args[]) {

            int smallGlassCap = 2;
            double bigGlassCap = 20;
//            smallGlassCap = bigGlassCap;
            smallGlassCap = (int) bigGlassCap;
            System.out.println(smallGlassCap + bigGlassCap);
        }
    }
