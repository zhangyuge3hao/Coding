package com.GEE1917;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年3月21日 上午11:44:45
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
public class Test3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("input a formula,split it with space");
		String s = sc.nextLine();
		if(s.matches("[a-zA-Z\\(\\)]+")&&s.length()<=100){
			System.out.println("OK");//)(a())a(
			char[] arr = s.toCharArray();
			
			checkFormat(arr);//为errIndleft、errIndRight填充数据
			for(char a : arr){
				System.out.print(a);
			}System.out.println();
			
			printOut(arr);//根据errIndleft、errIndRight输出结果
		}else{
			System.out.println("Input illeglal");
		}
	}
	static Stack<String> oper = new Stack<String>();
	static Stack<Character> cha = new Stack<Character>();
	static ArrayList<Integer> errIndRight = new ArrayList<Integer>();
	static ArrayList<Integer> errIndleft = new ArrayList<Integer>();
	public static void checkFormat(char[] arr){//为errIndleft、errIndRight填充数据
		/**
		 * 凡遇到大小学字母，全部入栈cha，遇到(、)判断后入栈oper
		 * 遇到(，，组合index,如"(+2"，直接入栈
		 * 遇到)，isEmpty，若oper为空，错误。记录errIndRight
		 * 				不空，peek拆分后有(,弹出(并抛弃这个)，表示成功配对
		 * 最后在oper中剩余的(均为错误，记录errIndleft
		 * 
		 */
		int len = arr.length;
		String push = "";
		
		for(int i = 0;i<len;i++){
			if(arr[i] == '('){//遇到(，，组合index,如"(+2"，直接入栈
				push = "(+"+i;
				oper.add(push);
			}else if(arr[i] == ')'){
				if(!oper.isEmpty()){//不空，peek拆分后有(,弹出(并抛弃这个)，表示成功配对
					String get = oper.peek();
					String[] p = get.split("\\+");
					if(p[0].equals("(")){
						oper.pop();
					}else{
						System.out.println("栈内输入错误");
					}
				}else{//isEmpty，若oper为空，错误。记录errIndRight
					errIndRight.add(i);
					System.out.println((i+1)+"个第元素)前面已经没有(,错误,计入errIndRight");
				}
			}else{
				cha.add(arr[i]);
			}
		}
		while(!oper.isEmpty()){
			String[] p = oper.peek().split("\\+");
			if(p[0].equals("(")){
				oper.pop();
				errIndleft.add(Integer.parseInt(p[1]));
			}else{
				System.out.println("栈内输入错误");
			}
		}
	}public static void printOut(char[] arr){//根据errIndleft、errIndRight输出结果 )(a())a(
		int len = arr.length;
		char[] out = new char[len];//新建一个与arr等长的out数组，所有元素初始化为.
		for(int i = 0;i<len;i++){
			out[i] = '.';
		}
		System.out.println("错误的(的下标有：");
		for(int i :errIndleft){
			System.out.print(i+" ");
			out[i] = '$'; //将errIndleft记录的(错误的下标替换为$
		}
		System.out.println();
		System.out.println("错误的)的下标有：");
		for(int i :errIndRight){
			System.out.print(i+" ");
			out[i] = '?'; //将errIndRight记录的)错误的下标替换为?
		}
		System.out.println();
		for(char a : out){
			System.out.print(a);
		}
	}

}
