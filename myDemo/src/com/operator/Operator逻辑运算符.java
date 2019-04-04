package com.operator;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��3�� ����10:48:49
* 	
* �߼��������
* 	������ & , | , ^ , !
* 		&: ��          �� false �� false
* 		|: ��          �� true �� true
* 		^: ���      ��ͬΪ false ������Ϊ true
* 		!: ��          ֱ�ӷ��� true �� false��false �� true
* 
* 	��ϣ���������&& , || 
* 		&&�� �뵥 & ���һ��;
* 			---&��Ӱ�����������ִ�У������������ʲô���Ҳ඼��ִ��---
*			---&&���С���·ЧӦ�����������Ϊfalseʱ���Ҳ಻��ִ��---
*
* 		||�� �뵥 | ���һ��;
* 			---|��Ӱ�����������ִ��,�����������ʲô���Ҳ඼��ִ��---
			---||Ҳ���С���·ЧӦ�����������Ϊtrueʱ���Ҳ಻��ִ��---
*/
public class Operator�߼������ {
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
		System.out.println("--------&&�� �뵥 & ���һ��------");
		System.out.println((a++ > b) & (c++ > b));//false && false = false
		System.out.println("a="+a+"----"+"c="+c);//a=11,c=16
		a=10; b=20; c=15;
		System.out.println((a++ > b) && (c++ > b));//false && false = false
		System.out.println("a="+a+"----"+"c="+c);//a=11,c=15
		System.out.println("---&��Ӱ�����������ִ��,�����������ʲô���Ҳ඼��ִ��---");
		System.out.println("---&&���С���·ЧӦ�����������Ϊfalseʱ�����ٽ����Ҳ�����---");
		
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
		System.out.println("--------||�� �뵥 | ���һ��------");
		System.out.println((a++ < b) | (c++ > b));//false | false = false
		System.out.println("a="+a+"----"+"c="+c);//a=11,c=16
		a=10; b=20; c=15;
		System.out.println((a++ < b) || (c++ > b));//false || false = false
		System.out.println("a="+a+"----"+"c="+c);//a=11,c=15
		System.out.println("---|��Ӱ�����������ִ��,�����������ʲô���Ҳ඼��ִ��---");
		System.out.println("---||Ҳ���С���·ЧӦ�����������Ϊtrueʱ�����ٽ����Ҳ�����---");	
		
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
