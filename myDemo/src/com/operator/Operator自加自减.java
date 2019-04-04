package com.operator;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年4月21日 下午4:03:34
* 
* 	++/--单独使用的时候，在变量前后没有影响
* 
* 	当++/--在表达式里作为一个部分时：       （++/--同理）
* 
* 		++在后，则先用变量在表达式里做操作，然后变量再++
* 		++在前 ，则变量先自加++，再在表达式里做操作
* 
*/
public class Operator自加自减 {
	public static void main(String[] args){
		int a = 10;
		int b ;
		int c ;
		b = a++;   //b=10   ++在后，则先用a在表达式里做操作，然后变量再++
		c = a;     //c=11
		//b = ++a;   //b=11
		System.out.println("b:"+b); 
		System.out.println("c:"+c);	
		
		int A = 10;
		int B ;  
		int C ;
		B = ++A;    //B=11   ++在前 ，则先用a++，再把A在表达式里做操作
		C = A++;    //C=11
		System.out.println("B:"+B);
		System.out.println("C:"+C);
	}
}
