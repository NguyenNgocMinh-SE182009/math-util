package com.m1nh.mathutil.core;

import org.junit.jupiter.api.Test;

//Import static là cách khai báo trc tên class chưá hàm static
//Để ở dưới gọi hàm static ngắn gọn như bên pascal, c : gọi hàm ko cần dấu chấm
import static com.m1nh.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {



    //class này sài bộ thư viện junit, dc tải  trên mạng về tự động bởi maven
    //Bọ thư viện junit này dùng để test tự động các hàm class chính
    //Nó sẽ tự chạy khi đóng gói app, để check xem các hàm có chạy đúng ko
    //đúng tức là expected == actual
    //Nếu có nhiều test case, thì nó sẽ gom status của các test case lại thành 2 màu xanh đỏ, mắt dân dev chỉ cần chỉnh
    //...


    //Test case #1: verify getfactorrial with n = 0. Ex

    @Test
    public   void  testFactorialGivenRightArgument5ReturnsWell(){

        assertEquals(120, getFactorial(5)); //hy vọng trả về 120
    }


    @Test
    public   void  testFactorialGivenRightArgument4ReturnsWell(){

        assertEquals(24, getFactorial(4)); //hy vọng trả về 24
    }

    @Test
    public   void  testFactorialGivenRightArgument1ReturnsWell(){

       assertEquals(1, getFactorial(1)); //hy vọng trả về 1
         }

    //Test case #1: verify getfactorrial with n = 0. Ex

    @Test
    public   void  testFactorialGivenRightArgument0ReturnsWell(){

        int n=0;   //0!
        long expectedResult = 1; //hy vọng trả về 1
        long actualResult = getFactorial(n); //thực tế sẽ là mấy


        //đi so sánh 2 giá trị coi expected == actual?
        //System.out.println("Expected: " + expectedResult + "vs. Actual: " + actualResult);
        //System.out.println(expectedResult == actualResult); //True/false

        assertEquals(expectedResult,actualResult);
        //so sánh xem 2 đứa expected == actual ko? nhưng ko viết sout()
        //hàm nay của class thư viện JUnit

    }
}