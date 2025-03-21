package com.m1nh.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.m1nh.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    //Chuẩn bị bô data, các cặp data x! kì vọng bằng mấy
    //chính là mãng 2 chiều
    //hàm này phải là public static để các hàm @Test mò vào lấy data để test run

    public static Object[][] initData()
    {
        return new Object[][] {
                {0 , 1},  //01 h vọng là 1
                {1 , 1},
                {2 , 2},
                {3 , 6},
                {4 , 24},
                {5 , 120}, //5! hy vọng là 120
                {6 , 720},
        };
    }

 @ParameterizedTest
 @MethodSource("initData")  //DDT - Data Driven Testing
    public void  testFactorialGivenRightArgumentReturnsWell(int n, long expectedResult){
        assertEquals(expectedResult, getFactorial(n));
    }

}