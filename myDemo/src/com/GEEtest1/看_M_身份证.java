package com.GEEtest1;
/**
 * 我国身份证号为18位，前17位必为数字，最后一位可为数字或者字母X：
 * 其中前六位为地址码，即对象常住户口所在县（市，旗，区），
 * 第七至第十位为出生年份，第十一、十二位为出生月份，第十三、十四位为出生日期。
 * 那么问题来了，我们知道年份分为平年和闰年，所谓闰年就是：
 * 那些能被4整除但不能被100整除或者能被400整除的年份，我们谓之“闰年”，
 * 闰年的2月份有29天，而平年则有28天。请设计一个程序，判断一个身份证号的合法性：
如果一个人的身份证合法，则返回0；
如果一个人的身份证号长度不合法，则返回1；
如果一个人身份证号前17位出现非数字字符，则返回2；
如果一个人身份证号第18位既不是数字也不是X，则返回3；
如果一个人出生年份在（1900-2017）之外，则返回4；
如果一个人出生月份不合法，则返回5；
如果一个人出生日期不合法，则返回6；
（其他不合法情况，考生无需考虑）
 */
import java.util.Scanner;
public class 看_M_身份证 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入身份证");
		String s = sc.next();
		StringBuffer buffer = new StringBuffer(s); 
		int year = Integer.parseInt(buffer.substring(6,10));
		int mon = Integer.parseInt(buffer.substring(10,12));
		int day = Integer.parseInt(buffer.substring(12,14));
		boolean flag = true;
		if(year%400==0||(year%4==0&&year%100!=0)){
			flag = true;
		}else{
			flag = false;
		}
		System.out.println("year"+year+"mon"+mon+"day"+day);
		if(s.length()!=18){
			System.out.println("1 长度不合法");
		}else if(!s.matches("[\\d]{17}.")){//完全按照题目要求，一步一步写，不考虑上下关系
			System.out.println("前17位出现非数字字符，则返回2");
		}else if(!s.matches(".{17}[\\dxX]")){
			System.out.println("第18位既不是数字也不是X，则返回3");
		}else if(year<1900||year>2017){
			System.out.println("出生年份在（1900-2017）之外，则返回4");
		}else if(mon<1||mon>12){
			System.out.println("出生月份不合法，则返回5；");
		}else if((day<1||day>31)||(mon==2&&day>29)||(!flag)&&(mon==2&&day>28)){
			System.out.println("出生日期不合法，则返回6；");
		}else{
			System.out.println("1");
		}//620105199302292011
	}
}
