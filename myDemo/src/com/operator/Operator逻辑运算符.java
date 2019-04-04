package com.operator;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月3日 下午10:48:49
* 	
* 逻辑运算符：
* 	单个： & , | , ^ , !
* 		&: 与          有 false 即 false
* 		|: 或          有 true 即 true
* 		^: 异或      相同为 false ，相异为 true
* 		!: 非          直接反相 true 则 false，false 则 true
* 
* 	组合（两个）：&& , || 
* 		&&： 与单 & 结果一样;
* 			---&不影响两侧运算的执行，无论其左边是什么，右侧都会执行---
*			---&&具有“短路效应”，当其左侧为false时，右侧不再执行---
*
* 		||： 与单 | 结果一样;
* 			---|不影响两侧运算的执行,其左边无论是什么，右侧都会执行---
			---||也具有“短路效应”，当其左侧为true时，右侧不再执行---
*/
public class Operator逻辑运算符 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 15;
		// &
		System.out.println((a>b)&(a>c));//false & false = false
		System.out.println((a<b)&(a>c));//true  & false = false
		System.out.println((a>b)&(a<c));//false & true  = false   
		System.out.println((a<b)&(a<c));//true  & true  = true
		System.out.println("-----------------------------");
		/**  &&  **/
		System.out.println((a>b)&&(a>c));//false && false = false
		System.out.println((a<b)&&(a>c));//true  && false = false
		System.out.println((a>b)&&(a<c));//false && true  = false   
		System.out.println((a<b)&&(a<c));//true  && true  = true
		System.out.println("--------&&： 与单 & 结果一样------");
		System.out.println((a++ > b) & (c++ > b));//false && false = false
		System.out.println("a="+a+"----"+"c="+c);//a=11,c=16
		a=10; b=20; c=15;
		System.out.println((a++ > b) && (c++ > b));//false && false = false
		System.out.println("a="+a+"----"+"c="+c);//a=11,c=15
		System.out.println("---&不影响两侧运算的执行,其左边无论是什么，右侧都会执行---");
		System.out.println("---&&具有“短路效应”，当其左侧为false时，不再进行右侧运算---");
		
		// |
		System.out.println((a>b)|(a>c));//false | false = false
		System.out.println((a<b)|(a>c));//true  | false = true
		System.out.println((a>b)|(a<c));//false | true  = true   
		System.out.println((a<b)|(a<c));//true  | true  = true
		System.out.println("-----------------------------");
		/**  ||  **/
		a=10; b=20; c=15;
		System.out.println((a>b)||(a>c));//false || false = false
		System.out.println((a<b)||(a>c));//true  || false = true
		System.out.println((a>b)||(a<c));//false || true  = true   
		System.out.println((a<b)||(a<c));//true  || true  = true
		System.out.println("--------||： 与单 | 结果一样------");
		System.out.println((a++ < b) | (c++ > b));//false | false = false
		System.out.println("a="+a+"----"+"c="+c);//a=11,c=16
		a=10; b=20; c=15;
		System.out.println((a++ < b) || (c++ > b));//false || false = false
		System.out.println("a="+a+"----"+"c="+c);//a=11,c=15
		System.out.println("---|不影响两侧运算的执行,其左边无论是什么，右侧都会执行---");
		System.out.println("---||也具有“短路效应”，当其左侧为true时，不再进行右侧运算---");	
		
		// ^
		System.out.println((a>b)^(a>c));//false ^ false = false
		System.out.println((a<b)^(a>c));//true  ^ false = true
		System.out.println((a>b)^(a<c));//false ^ true  = true   
		System.out.println((a<b)^(a<c));//true  ^ true  = false
		System.out.println("-----------------------------");
		
		// !
		System.out.println((a>b));   // false   = false
		System.out.println(!(a>b));  // !false  = true
		System.out.println(!!(a>b)); // !!false = !true = false   
		System.out.println("-----------------------------");

	}
}
