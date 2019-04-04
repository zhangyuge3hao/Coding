package com.flowcontrol;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月8日 下午4:43:16
* 
* 	初始化语句；
* 	do{
* 		循环体语句;
* 		条件控制语句;
* 	}while(判断语句);
* 	
* 
*/
public class DoWhileDemo循环结构 {
	public static void main(String[] args) {
		int a =1;		//初始化语句；
		do{
			System.out.println("a= "+a);	//循环体语句;
			a++;		//条件控制语句;
		}while(a<=10);	//判断语句
		
		System.out.println("/*-----统计水仙花数的个数------*/");
		int initial=100;
		int temp_initial = 0;
		int len = 0;
		int get_num=0;
		int get_all=0;
		do{
			get_all=0;
			temp_initial = initial;
			do{
				len = String.valueOf(temp_initial).length();
				get_num=temp_initial%10;
				temp_initial/=10;
				get_all+=Math.pow(get_num, 3);
			}while(temp_initial>=10);
			get_all+=Math.pow(temp_initial, 3);
			if(get_all==initial){
				System.out.println(initial+" 是水仙花数");
			}else{
				//System.out.println(initial+" 不是水仙花数");
			}
			initial++;
		}while(initial<=1000);
	}
}
