package com.method;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月18日 上午10:12:15
* 
* 
*/
public class MethodPracticeFlower {
	public static void main(String[] args) {
		flower();
	}
	//获取原数及其位数长度
	public static int getLength(int tempFlower) {
		int len = String.valueOf(tempFlower).length();
		return len;
	}
	public static void check(int sumFlower,int tempFlower){
		if(sumFlower==tempFlower){
			System.out.println("/------幂和："+sumFlower+"，则原数："+tempFlower+"是水仙花数------/");
		}else{
			//System.out.println("/------幂和："+sumFlower+"，则原数："+tempFlower+"--不--是水仙花数------/");
		}
	}
	//通过长度拆分原数，并计算判断
	public static void flower() {
		int flower = 100;
		int lenth = 0;
		int tempFlower;
		int temp_each;
		int each_number;
		int sumFlower;
		int increase_number;
		for(tempFlower=flower;tempFlower<=1000;tempFlower++){
			sumFlower=0;
			increase_number=tempFlower;
			lenth=getLength(tempFlower);
			//System.out.println("lenth:"+lenth);
			for(temp_each=0;temp_each<lenth;temp_each++){
				each_number=increase_number%10;
				//System.out.println("each_number:"+each_number);
				sumFlower+=Math.pow(each_number, lenth);
				increase_number/=10;
			}
			check(sumFlower,tempFlower);
		}
	}
}
