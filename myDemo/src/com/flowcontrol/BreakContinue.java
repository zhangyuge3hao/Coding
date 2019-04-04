package com.flowcontrol;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月8日 下午5:23:50
* 
* 	break：表示中断，用于结束和跳出循环
* 		注： 	能---且只能---用在一定场景下：循环   和   switch 里
* 			若在类中直接使用，会报错
* 			break cannot be used outside of a loop or a switch
* 	
* 	continue: 表示中断，结束本次循环。
* 		注：	A.  跳过continue下方的语句，直接进入下次循环，但并不跳出循环体
* 				只要判断语句通过，continue并不影响整个循环的继续
* 			
* 			B.	同样，能---且只能---用在一定场景下：循环   和   switch 里
* 				若在类中直接使用，会报错
*/
public class BreakContinue {
	public static void main(String[] args) {
		
		System.out.println("/--------break--------/");
		int a = 0;
		for(a=1;a<=5;a++){
			if(a==3){
				break;
			}
			System.out.println("break前执行a="+a);
		}
		System.out.println("外面 的a： "+a);
		
		System.out.println("/--------continue--------/");
		for(a=1;a<=5;a++){
			if(a==3){  //跳过3的情况，再次进入循环，a=4
				continue;
			}
			System.out.println("continue前a="+a);//当a=3的时候，效果continue下方的语句
		}
		
		System.out.println("/--------break 和 continue 的区别练习--------/");
		for(a=1;a<=10;a++){
			if(a%3==0){  //能被3整除：3，6，9
				break;	//1,2后直接跳出循环
				//continue;	//只是没有3，6，9
			}
			System.out.println("continue前a="+a);//当a=3的时候，效果continue下方的语句
		}
	}
}
