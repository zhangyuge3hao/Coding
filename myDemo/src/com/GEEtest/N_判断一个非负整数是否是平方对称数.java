package com.GEEtest;
/**
 * 判断一个非负整数n(n<256)是否是平方对称数
（2018学硕）。
比如：11的平方是121 ，则是11是平方对称数。输出“yes”,否则输出“no”
•	思路：比较数组的数据是否满足对称的性质
•	对整数取余求每一位数

 * @author pc
 *
 */
public class N_判断一个非负整数是否是平方对称数 {
	public static void main(String[] args){

		for(int n =0; n<256 ;n++){
			int r = (int)Math.pow(n,2);//得到平方
			//System.out.println(r);
			char c[] = String.valueOf(r).toCharArray();//化为String -> char[]，得到每个数字
			/*for(char i :c){
				System.out.print(i);
			}
			System.out.println();*/
			int len = c.length;
			boolean f = true;
			for(int i = 0,j = len-1;i<=j;i++,j--){//i,j分别从两端向中间遍历
				if(c[i]==c[j]){//对称位相等，f=true
					f = true;
				}else{//对称位相等，f=false，且直接退出当前n的验证，直接看下一个n
					f = false;
					break;
				}
			}	
			if(f){//只有n的每个位数都对称位相等，f才会最终是true
				System.out.println(n+"----");
			}
		}
	}
}
