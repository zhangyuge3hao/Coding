package com.GEE1917;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��3��21�� ����2:32:13
* 
* 
*/
public class Test1_learn {

	    public static int maxSubSum1(int[] a) {
	        int maxSum = 0;
	        for (int i = 0; i < a.length; i++) {
	            for (int j = i; j < a.length; j++) {
	                int tempSum = 0;

	                for (int k = i; k <= j; k++) {
	                    tempSum += a[k];
	                }

	                if (tempSum > maxSum) {
	                    maxSum = tempSum;
	                }
	            }
	        }
	        return maxSum;
	    }

	    public static int maxSubSum2(int[] a) {
	        int maxSum = 0;

	        for (int i = 0; i < a.length; i++) {
	            int tempSum = 0;

	            for (int j = i; j < a.length; j++) {
	                tempSum += a[j];

	                if (tempSum > maxSum)
	                    maxSum = tempSum;
	            }
	        }
	        return maxSum;
	    }

	    public static int maxSubSum3(int[] a) {
	        return subSum3(a, 0, a.length - 1);
	    }

	    private static int subSum3(int[] a, int left, int right) {
	        if (left == right)
	            if (a[left] > 0)
	                return a[left];
	            else
	                return 0;

	        int center = (left + right) / 2;
	        int maxLeftSum = subSum3(a, left, center);
	        int maxRightSum = subSum3(a, center + 1, right);

	        int maxLeftBorderSum = 0, leftBorderSum = 0;
	        for (int i = center; i >= left; i--) {
	            leftBorderSum += a[i];
	            if (leftBorderSum > maxLeftBorderSum)
	                maxLeftBorderSum = leftBorderSum;
	        }

	        int maxRightBorderSum = 0, rightBorderSum = 0;
	        for (int i = center + 1; i <= right; i++) {
	            rightBorderSum += a[i];
	            if (rightBorderSum > maxRightBorderSum)
	                maxRightBorderSum = rightBorderSum;
	        }

	        return Math.max(Math.max(maxLeftSum, maxRightSum), maxLeftBorderSum + maxRightBorderSum);

	    }

	    public static int maxSubSum4(int[] a) {
	        int maxSum = 0;
	        int tempSum = 0;

	        for (int i = 0; i < a.length; i++) {
	            tempSum += a[i];

	            if (tempSum > maxSum)
	                maxSum = tempSum;
	            else if (tempSum < 0)
	                tempSum = 0;
	        }
	        return maxSum;
	    }

	    public static int maxSubSum5(int[] a) {
	        int maxSum = 0;
	        int tempSum = 0;
	        int begin = 0;

	        for (int i = 0; i < a.length; i++) {
	            if (tempSum > 0)
	                tempSum += a[i];
	            else {
	                tempSum = a[i];
	                begin = i;  //���
	            }

	            if (tempSum > maxSum) {
	                maxSum = tempSum;
	                //�����������ȡ������������к͵����λ��begin���ص�λ��i
	            }

	        }
	        return maxSum;
	    }

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        //int[] a = { 1, -3, 7, 8, -4, 12, -10, 6 };
	        int[] a = {-2,11,-4,13,-5,-2};
	        System.out.println("��һ�ֱ���������" + maxSubSum1(a));
	        System.out.println("�ڶ��ֱ����Ľ�������" + maxSubSum2(a));
	        System.out.println("�����ַ��β��Է�����" + maxSubSum3(a));
	        System.out.println("���������Է�����" + maxSubSum4(a));
	        System.out.println("�����ֶ�̬�滮������" + maxSubSum5(a));
	    }

}
