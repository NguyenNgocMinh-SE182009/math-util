package com.m1nh.mathutil.core;

public class MathUtility {
    //class ngày cung cấp các hàm liên quan đến  toán học.
    //nó là thư viện tính toán học. Mà thư viện tính toán thì các hàm thường sẽ là static
    //hàm tính n!
    //n! = 1.2.3.4...n trong đó n
    //0! = 1! = 1
    //mình không tính quá 20 vì 21! kiểu long không chứa nổi, sẽ tính sai
    //mình chỉ tinh từ 0 ... 20!
    //hàm nhận vào n , trả về n! (n trong đoạn từ [0..20])
    public static long getFactorial(int n) {
        //kĩ thuật nhồi con heo đất, ốc nhồi thịt, tiếp chiêu:
        //kĩ thuật nhân dồn, cộng dồn giá trị

        if (n <0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
        }

        long result = 1; //bài tổng thì ban đầu = 0
        if (n == 0) {
            return 1; //thoát sớm khi có thể, return ngay khi có thể
            //if và for neeuschir có 1 lệnh ko cần {...1 lệnh}
            //return sớm thì ko cần else luôn

        }
        //n = 1 2 3 4 => nhân dồn vào result = result * 1
        for (int i = 1; i <= n; i++) {
            //result = result * i
            result *= i; //nhân dồn từ 1 đến n , i tăng từ 1 2 3, dồn vào result

        }
        return  result;
    }
}
