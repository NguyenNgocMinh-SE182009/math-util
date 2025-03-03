package com.m1nh;

import com.m1nh.mathutil.core.MathUtility;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        testFactorialGivenRightArgument0ReturnsWell();
        testFactorialGivenRightArgument1ReturnsWell();
        testFactorialGivenRightArgument5ReturnsWell();
        testFactorialGivenWrongArgumentMinus1ThrowsException();


    }
    //Hàm kiểm thử code chính của mình, hàm này dân dev dùng để test code chính,
    // code chính chính là hàm getFactorial() bên .core
    //VD dưới này: cho tham số tủ tế RightArg 0 thì hàm phải chạy ngon runs well


    public static  void  testFactorialGivenWrongArgumentMinus1ThrowsException(){

        MathUtility.getFactorial( -1);
        //Chạy hàm này, thấy ngoại lệ bung ra
        //vì đưa -1 mà hàm ngoại lệ nghĩa là hàm chạy đúng dò data cà chớn
        //hàm dc thiết kế là n âm thì ném ngoại lệ
        //vậy giờ đưa n = -1 ném loại lệ là ok


    }

    public static  void  testFactorialGivenRightArgument0ReturnsWell(){

        int n=0;   //0!
        long expectedResult = 1; //hy vọng trả về 1
        long actualResult = MathUtility.getFactorial(n); //thực tế sẽ là mấy


        //đi so sánh 2 giá trị coi expected == actual?
        System.out.println("Expected: " + expectedResult + "vs. Actual: " + actualResult);
        System.out.println(expectedResult == actualResult); //True/false


    }


    public static  void  testFactorialGivenRightArgument1ReturnsWell(){

        int n = 1;   //0!
        long expectedResult = 1; //hy vọng trả về 1
        long actualResult = MathUtility.getFactorial(n); //thực tế sẽ là mấy


        //đi so sánh 2 giá trị coi expected == actual?
        System.out.println("Expected: " + expectedResult + "vs. Actual: " + actualResult);
        System.out.println(expectedResult == actualResult); //True/false


    }

    public static  void  testFactorialGivenRightArgument5ReturnsWell(){

        int n = 5;   //0!
        long expectedResult = 120; //hy vọng trả về 120
        long actualResult = MathUtility.getFactorial(n); //thực tế sẽ là mấy


        //đi so sánh 2 giá trị coi expected == actual?
        System.out.println("Expected: " + expectedResult + "vs. Actual: " + actualResult);
        System.out.println(expectedResult == actualResult); //True/false


    }

    //Dân dev phải test code của chính họ.
    //Họ test code của họ như thế nào?
    //Trước khi test (test run) thì cần có test case

    //Test case #1
    //Check getfactorial() with n = 0
    //Step:
    //(1) given n = 0
    //(2) call getfactorial(0)
    //Expected result / value : 1

    //Test case #2
    //Check getfactorial() with n = 1
    //Step:
    //(1) given n = 1
    //(2) call getfactorial(1)
    //Expected result / value : 1

    //Test case #3
    //Check getfactorial() with n = 5
    //Step:
    //(1) given n = 5
    //(2) call getfactorial(5)
    //Expected result / value : 120

    //Test case #4
    //Check getfactorial() with n = -1
    //Step:
    //(1) given n = -1
    //(2) call getfactorial(-1)
    //Expected result / value : an exception is thrown

    //Test case #5
    //Check getfactorial() with n = 21
    //Step:
    //(1) given n = 21
    //(2) call getfactorial(21)
    //Expected result / value : an exception is thrown

}