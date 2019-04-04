package com.GEE1917;

import java.util.ArrayList;
import java.util.Scanner;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年3月20日 下午5:37:28
* 
* 在某个字符串（长度不超过100)中有左括号、右括号和大小写字母；定（与常见的算数式子一样）任何一个左括号都从内到外与在它右边且距离最近的右括号匹配。
* 写一个程序，找到无法匹配的左括号和右括号，输出原来的字符串，并在下一行标出不能匹的括号，不能匹配的左括号用”$"标注，不能匹的右括号用”？”标注．
* （40分丿
输入格式：输入包括多组数据，每组数据一行，包含一个字符串，只包含左右括号大小写字母，字符串长度不过100。
注意：cin.get1ine(str,100)最多只能输入99个字符！
输出格式：对每组输出数据，输出两行，第一行包含原始输入字符，第二行由“$”和“？”和空格组成，下标“$”和“？”表示与之对应的左括号和右括号不能匹配·
样输入：
)(rttyy())sss)(
样输出：
)(rttyy())sss)(
?            ?$

*/

public class Test3_notAbsolutelyRight {
	static ArrayList<Integer> errIndleft = new ArrayList<Integer>();
	static ArrayList<Integer> errIndRight = new ArrayList<Integer>();
	static ArrayList<Integer> usedRight = new ArrayList<Integer>();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("input a formula,split it with space");
		String s = sc.nextLine();
		if(s.matches("[a-zA-Z\\(\\)]+")&&s.length()<=100){
			System.out.println("OK");//)(a())a(
			char[] arr = s.toCharArray();
			
			for(char a : arr){
				System.out.print(a);
			}
			System.out.println();
			checkFormat(arr);
			printOut(arr);
		}else{
			System.out.println("Input illeglal");
		}
	}
	public static void printOut(char[] arr){
		int len = arr.length;
		char[] out = new char[len];
		for(int i = 0;i<len;i++){
			out[i] = '.';
		}
		System.out.println("错误的(的下标有：");
		for(int i :errIndleft){
			System.out.print(i+" ");
			out[i] = '$'; 
		}
		System.out.println();
		System.out.println("错误的)的下标有：");
		for(int i :errIndRight){
			System.out.print(i+" ");
			out[i] = '?'; 
		}
		System.out.println();
		for(char a : out){
			System.out.print(a);
		}
	}
	public static void checkFormat(char[] arr){
		int len = arr.length;
		int left = 0;//记录出现的(的个数，出现(+1，出现)-1,用于判断)是否合法
		for(int i = 0 ;i<len ;i++){
			if(arr[i] == ')'){
				if(left <= 0){
					System.out.println((i+1)+"个第元素)前面已经没有(,错误");
					errIndRight.add(i);
				}else{
					left--;
					
					System.out.println((i+1)+"个第元素)前面仍有空闲(,正确，left--，(被使用");
				}
			}else if(arr[i] == '('){
				left++;
				if(findRight(arr,i)){
					System.out.println((i+1)+"个第元素(后面仍有)且未被使用,正确");
				}else{
					System.out.println((i+1)+"个第元素(后面没有)，或)已被使用,错误");
					errIndleft.add(i);
				}
			}
		}
	}
	public static boolean findRight(char[] arr, int index){//查找当前下标后是否有)，且未被使用
		boolean flag = false;
		int len = arr.length;
		for(int i = index+1;i<len;i++){
			if(arr[i]==')'&&ifUsedRight(arr,i)){//向后遍历，且判断)是否未被使用
				flag = true;
				usedRight.add(i);
				break;
			}
		}
		return flag;
	}
	public static boolean ifUsedRight(char[] arr, int index){//查找当前下标)是否未被使用
		boolean flag = true;
	
		for(int i : usedRight){
			System.out.println("usedRight中"+(i)+"元素)已被使用,查询index是"+index);
			if(index == i){
				flag = false;//若这个下标在usedRight中存在，表示已经被使用,返回false
				break;
			}
		}
		return flag;
	}
}
