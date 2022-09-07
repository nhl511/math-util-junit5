/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.longnh.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class MathUtilTest {

    public static Object[][] initData(){
        return new Integer[][]{
            {1, 1},
            {2, 2},
            {5, 120},
            {6, 720}
        };
    }
    
    @ParameterizedTest
    @MethodSource(value = "initData")
    public void testGetFactorialGivenRightArgReturnsWell(int input, long expected){
        assertEquals(expected, MathUtil.getFactorial(input));
    }    
    
//    @Test
//    public void testGetFactorialGivenRightArgReturnsWell(){
//        assertEquals(24, MathUtil.getFactorial(4));
//    }
    
    @Test
    public void testGetFactorialGivenWrongArgThrowException(){
//        Executable exObject = new Executable(){
//            @Override
//            public void execute() throws Throwable{
//                MathUtil.getFactorial(-5);
//            }
//        };
        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
    }    
        
}
