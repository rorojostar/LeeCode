package com.rongwen.top100.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralOrder {
    /**
     * 54. 螺旋矩阵
     * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
     * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * 输出：[1,2,3,6,9,8,7,4,5]
     *
     * 空值处理： 当 matrix 为空时，直接返回空列表 [] 即可。
     * 初始化： 矩阵 左、右、上、下 四个边界 l , r , t , b ，用于打印的结果列表 res 。
     * 循环打印： “从左向右、从上向下、从右向左、从下向上” 四个方向循环打印。
     * 根据边界打印，即将元素按顺序添加至列表 res 尾部。
     * 边界向内收缩 1 （代表已被打印）。
     * 判断边界是否相遇（是否打印完毕），若打印完毕则跳出。
     *
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new ArrayList<Integer>();
        int L = 0, T = 0, R = matrix[0].length - 1, B = matrix.length - 1, x = 0;
        Integer[] res = new Integer[(R + 1) * (B + 1)];

        while (true) {
            for (int i = L; i <= R; i++) {
                res[x++] = matrix[T][i];
            }
            if (++T > B) break;
            for (int i = T; i <= B; i++) {
                res[x++] = matrix[i][R];
            }
            if (--R < L) break;
            for (int i = R; i >= L; i--) {
                res[x++] = matrix[B][i];
            }
            if (--B < T) break;
            for (int i = B; i >= T; i--) {
                res[x++] = matrix[i][L];
            }
            if (++L > R) break;
        }
        return Arrays.asList(res);
    }
}
