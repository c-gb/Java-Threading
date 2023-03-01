package com.slb.thread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertAllTest {

    @Test
    public void assertAllTestCase(){
    //we will be testing addition use case for multiple assertions
     assertAll(
             () -> {assertEquals(4, addition(2,2));},
             () -> {assertEquals(7, addition(5,2));},
             () -> {assertEquals(5, addition(2,3));},
             () -> {assertEquals(25, addition(3,2));}, //wrong one
             () -> {assertEquals(55, addition(52,3));}


     );

    }

    private int addition(int i, int j) {
        System.out.println("adding "+ i + "with:" + j);
        return i + j;
    }
}
