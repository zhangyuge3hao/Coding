package com.GEEtest;
/**
 * 题目描述：
我国身份证号为18位，前17位必为数字，最后一位可为数字或者字母X：
其中前六位为地址码，即对象常住户口所在县（市，旗，区）
第七至第十位为出生年份，
第十一、十二位为出生月份
第十三、十四位为出生日期。

那么问题来了，我们知道年份分为平年和闰年，所谓闰年就是：
那些能被4整除  但不能被100整除  或者能被400整除的年份，我们谓之“闰年”，
闰年的2月份有29天，而平年则有28天。

请设计一个程序，判断一个身份证号的合法性：
如果一个人的身份证合法，则返回0；
如果一个人的身份证号长度不合法，则返回1；
如果一个人身份证号前17位出现非数字字符，则返回2；
如果一个人身份证号第18位既不是数字也不是X，则返回3；
如果一个人出生年份在（1900-2017）之外，则返回4；
如果一个人出生月份不合法，则返回5；
如果一个人出生日期不合法，则返回6；
（其他不合法情况，考生无需考虑）
例如：
输入：						输出：
362329199411015334			0
35393099939849				1
.......................等等

 * @author pc
 *
 */
import java.util.Scanner;
public class M_身份证号合法性判断 {
	public static void main(String []args){
		boolean f = true;
		Scanner sc = new Scanner(System.in);
		String n1 = "362329199411015334";
		boolean a = n1.matches("[\\d]{17}.");
		System.out.println("a"+a);

		while(f){
			System.out.println("输入身份证号");
			String n = sc.next();
			
			char car[] = n.toCharArray();
			String year = "";//提取年份
			for(int i = 6;i<10;i++){
				year += car[i];
			}
			int y = Integer.parseInt(year);
			System.out.println("y"+year);
			
			String mon = "";//提取月份 第十一、十二位为出生月份
			for(int i = 10;i<12;i++){
				mon += car[i];
			}
			int m = Integer.parseInt(mon);
			System.out.println("m"+mon);
			
			String day = "";//提取日期 第十三、十四位为出生日期
			for(int i = 12;i<14;i++){
				day += car[i];
			}
			int d = Integer.parseInt(day);
			System.out.println("d"+day);
			
			char c = n.charAt(17);//Java 【】获取字符串指定下标位置的值 charAt(),返回char
	        System.out.println(c);
	        

	        if(n.length()!=18){//如果一个人的身份证号长度不合法，则返回1；
				System.out.println(1+"长度不合法");
			}else if(!n.matches("[\\d]{17}.")){//如果一个人身份证号前17位出现非数字字符，则返回2；
				System.out.println(2+"前17位出现非数字字符");
			}else if(String.valueOf(c).matches("[^(\\dxX)]")){//如果一个人身份证号第18位既不是数字也不是X，则返回3；
				System.out.println(3+"第18位既不是数字也不是X");
			}
			//第七至第十位为出生年份,如果一个人出生年份在（1900-2017）之外，则返回4；
			else if(y<1900||y>2017){
				System.out.println(4+"人出生年份在（1900-2017）之外");
			}
			//如果一个人出生月份不合法，则返回5；m>12,m<0
			else if(m>12||m<0){
				System.out.println(5+"出生月份不合法，y>12,y<0");
			}
			//如果一个人出生日期不合法，则返回6；d>31,d<0,闰年(y%4==0&&y%100!=0&&y%400!=0)2月d>28，平时m==2&&d>29
			else if(m<0||m>31||(y%4==0&&y%100!=0&&d>28)||(y%400==0&&d>28)||(m==2&&d>29)){
				System.out.println(6+"生日期不合法");
			}else if(n.matches("[\\d]{17}[\\dxXS]")){//如果一个人的身份证合法，则返回0；
				System.out.println(0+"身份证合法");
			}
		}//362329199602295334
	}
}
