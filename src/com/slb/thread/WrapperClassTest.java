package com.slb.thread;

import java.util.ArrayList;

public class WrapperClassTest {

    public static void main(String[] args) {

        //below is not allowed
        //ArrayList<int> listOfNumbers = new ArrayList<int>();
        //below works fine because of Wrapper class Integer
        ArrayList<Integer> listOfNumbersInt = new ArrayList<Integer>();

    }
}
