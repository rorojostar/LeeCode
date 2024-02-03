package com.rongwen.zuo.test;

public class Test01 {
    /**
     * 整型数组中一种数出现了奇数次，其他所有数都出现了偶数次，
     * 1.怎么找到奇数次的数？
     * 2.两种数出现了奇数次，其他所有数都出现了偶数次，怎么找到这两种数？
     * (时间复杂度O(N)，空间复杂度O(1))
     */

    public static void findOddTimesNum1() {
        int[] arr = {2, 1, 1, 3, 2, 1, 3, 1, 3};
        int eor = 0;
        for (int cur : arr) {
            eor ^= cur; //偶数次异或后都是0
        }
        System.out.println(eor);
    }

    public static void findOddTimesNum2() {
        int[] arr = {2, 1, 1, 3, 1, 3, 1, 3};
        //假设a和b出现了奇数次
        int eor1 = 0;
        for (int cur : arr) {
            eor1 ^= cur;
        } //循环结束 结果为a^b，因为a!=b,所以eor1!=0 eor1必有一个位置上是1

        //假设eor1第八位是1，说明a和b的第八位异
        //数组此时可以分为两类，一类是第八位是1的一组数，另一类是第八位是0
        //此时a和b各被分在一类
        //eor2只去异或第八位为1的数，eor2可能等于a或者b，假设为a
        //那么eor1^eor2=b
        int eor2 = 0;
        int rightOne = eor1 & (~eor1 + 1); //提取出最右的1
        for (int cur : arr) {
            if ((cur & rightOne) == 0) eor2 ^= cur;
        }
        System.out.println(eor2 + " " + (eor1 ^ eor2));
    }

    public static void main(String[] args) {
        findOddTimesNum1();
        findOddTimesNum2();
    }


}
