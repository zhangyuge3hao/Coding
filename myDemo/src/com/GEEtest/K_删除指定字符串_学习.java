package com.GEEtest;
import java.util.Scanner;
public class K_删除指定字符串_学习 {
/*	public static void main(String []args){
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag){
			System.out.println("input s1");
			String s1 = sc.next();
			System.out.println("input s2");
			String s2 = sc.next();
			
			 * String s = s1.replace(s2,"");//
			System.out.println(s);
			
		}
	}*/
	public static void main(String[] args) {
        String str = " woai javahaha javaai javao javaw";
        removeString(str);
    }
	/**
	 * 思路：首先使用String的trim（）方法去掉String中的空格，不改变字符串，
	 * 然后使用String的indexOf方法找到要删除的子串的位置，
	 * 再使用String的subString（）方法，
	 * 将要子字符串的开始位置以前的字符串和结束位置以后的字符串在拼接起来，
	 * 最后再给查找下一个子字符串出现的位置，整个过程使用while循环提高效率。
	 */
    public static void removeString(String str) {
        //trim去掉空格不改变字符串
       // str = str.trim();
        //找到java所在的位置
        int index = str.indexOf("java");
        //记录字符串中一共出现的java的个数
        int count = 0;
        while (index != -1) {//去掉一次后，再进循环，从口开始找，直到=-1，表示没有要删的字符串了
            //当字符串中不再含有java时就返回-1
            str = str.substring(0, index) + str.substring(index + 4);
            //找出下一个java的位置
            index = str.indexOf("java");
            //统计删除的java的个数
            count++;
        }
        System.out.println("删除了java后的字符串：" + str);
        System.out.println("删除了java的数量为：" + count);
    }

}
