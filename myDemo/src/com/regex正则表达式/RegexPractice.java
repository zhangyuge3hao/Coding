package com.regex正则表达式;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年1月8日 下午5:44:54
* 
* 
*/
import java.util.Scanner;

public class RegexPractice {
	public static void main(String[] args) {
		//checkYuanYin();//判断元音字符
		//checkPhoneNum();//判断是否为电话号码，包括手机与固话
		checkEmail();
	}
	
	
//判断元音字符
	public static String scan() {
		String temp;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please type some words");
			temp = sc.next();
			return temp;
		} catch (Exception e) {
			return "#";
		}/* finally {
			sc.close();
		}*/
	}
	public static void checkYuanYin() {
		boolean res = true;
		while(res){
			String a = scan().toLowerCase();
			System.out.println("a:"+a);
			System.out.println("----" + a.matches("[aeiou]*"));
			System.out.println("----" + a.matches(".[aeiou]"));
			if(a.equals("#")){
				res=false;
			}
		}		
	}
	
	//号码由数字和—组成，固话7-8位，若包含区号，区号为3，4位，首位是0，区号和电话用—分割
	//移动号码为11位，前两位是13，15，17，18，19
	public static void checkPhoneNum(){
		boolean res = true;
		while(res){
			String a =scan();//"1[358][0-9]{9}|[0-9]{7,8}|0[0-9]{2,3}-[0-9]{7,8}"
			System.out.println(a+" 的号码判断为："+a.matches("1[35789]\\d{9}|\\d{7,8}|0\\d{2,3}-\\d{7,8}"));
			if(a=="#"){
				res=false;
			}
		}
	}
	//邮件验证：用户名：字母、数字、中划线、下划线		@	网址：数字和字母		小数点	组织域名2-4位字母	不区分大小写
	public static void checkEmail(){
		boolean res = true;
		while(res){
			String a = scan().toLowerCase();//不区分大小写
			System.out.println(a+"邮箱判断："+a.matches("[\\w-]+@[\\w]+(.[a-z]{2,4}){1,2}"));
			if(a=="#"){
				res=false;
			}
		}
	}
}
