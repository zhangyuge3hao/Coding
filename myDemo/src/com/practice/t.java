package com.practice;
import java.util.ArrayList;
import java.util.List;

public class t {
    public static List<Double> list = new ArrayList<Double>();

    public static void main(String[] args) {
        double[] keys = { 1, 2, 3 };
        System.err.println(getNum(keys, 3));
    }

    static List<Double> getNum(double[] keys, double kill) {
        int n = keys.length;
        int nbit = 1 << n;
        double in;
        List<Double> list = new ArrayList<Double>();
        for (int i = 0; i < nbit; i++) {
            in = 0;
            list.clear();
            for (int j = 0; j < n; j++) {
                int tmp = 1 << j; // 由0到n右移位
                if ((tmp & i) != 0) { // 与运算，同为1时才会是1
                    in += keys[j];
                    list.add(keys[j]);
                }
            }
            if (in == kill)
                return list;
        }
        return list;
    }

}
