package com.method;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月17日 上午11:24:20
* 	
* 	方法：完成特定功能的代码块
* 
* 	方法固定的定义格式：
* 		修饰符  返回值类型  方法名(参数类型  参数名称1，参数类型  参数名称2.....){
* 			代码块;
* 			return 返回值;
* 		} 
* 
* 	格式解释：
* 		修饰符：	暂时默认 public static
* 		返回值类型：	用于限定方法结束后返回个调用者的数值的类型
* 		方法名：	调用时方法的名字
* 		参数类型：	方法执行时需要传入的变量类型
* 		参数名称：	方法执行时需要传入的变量
* 			（---这个变量名要直接在方法内部被使用）
* 			（而在被调用时，只要方法名、变量类型名称和变量个数与方法定义一致即可，形参的名称不要求，但建议同一 ）
* 		方法体：	完成方法功能的代码
* 		return：	表示方法结束，并给调用者返回规定类型的返回值
* 
* 	定义方法的注意事项：
* 		A. 返回类型：一定要明确方法的返回类型
* 		B. 参数列表：一定要明确方法的参数列表，有几个参数需要在调用时传入？  每个参数的类型？
* 		
* 	方法的调用（--调用有明确返回值的方法--）：
* 		A. 直接调用，无意义
* 			sum(10,20);
* 		B. 输出调用，无意义
* 			System.out.println(sum(10,20));
* 		C. 复制调用，把结果赋值给可操作的变量，推荐
* 			int result = sum(10,20);
* 			System.out.println(result+10);
* 
*  	方法的调用（--调用void（空类型）方法--）：
*  		void即没有返回值，如主函数main。
*  		A. （能且只能）直接调用
* 
*/
public class MethodBasic {
	public static void main(String[] args) {
		int result = sum(10,20);
		System.out.println(result+10);
	}

	public static int sum(int a ,int b){
		int c = a+b;
		return c;
	}
}
