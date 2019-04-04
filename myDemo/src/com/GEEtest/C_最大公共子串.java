package com.GEEtest;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年1月17日 下午5:40:05
* 
* 
*/
import java.util.Scanner;

public class C_最大公共子串 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入第一个字符串");
			char[] s1 = sc.next().toCharArray();
			//char[] s1 = "123456".toCharArray();
			System.out.println("请输入第一个字符串");
			//char[] s2 = "12a123456".toCharArray();
			char[] s2 = sc.next().toCharArray();
			check(s1, s2);
		}
	}
/*思路：获取到字符串后：
1，用toCharArray()转为char行形数组：s1，s2
2，用s1{最外}的每一个元素向s2{中层}匹配
3，每当有s1与s2元素相同时，使用temp1，2记录当前索引，进入小循环，判断当前索引后的元素是否仍然相同，相同则通过String字符串相加累计结果
4，当小循环出现对应为不相等时，判断累计结果的长度是否为最大*/
	public static void check(char[] s1, char[] s2) {
		int len1 = s1.length;
		int len2 = s2.length;
		int t1 = 0,t2=0;
		int index = 0;
		int lenM = 0;
		boolean flag = true;
		String ch = "";
		for (int i = 0; i < len1; i++) {//最外层遍历s1
			for (int j = 0; j < len2; j++) {//用s2的每一个元素和s1匹配
				flag=true;
				if(s1[i]==s2[j]){//当发现有相同元素时，两个数组同时从当前索引向后遍历，判断是否有后继元素相同
					ch = "";//每当发现相同元素，重置当前索引和累计结果
					t1 = i;
					t2=j;
					//System.out.println("s1i["+i+"]="+s1[i]+"---s2j["+j+"]"+s2[j]);
					while (flag) {
						if (t1 < len1 && t2 < len2 && s1[t1] == s2[t2]) {//判断是否有后继元素相同
							//System.out.println("s1t1["+t1+"]="+s1[t1]+"---s2t2["+t2+"]"+s2[t2]);
							flag = true;
							ch = ch+s1[t1] ;
							t1++;
							t2++;
						} else {
							flag = false;
						}
					}
				}
			}
			if (ch.length() > lenM) {
				lenM = ch.length();
				index = i;
			}
		}
		System.out.println("lenM:" + lenM+"---index:"+index);
		for(int i=index;i<index+lenM;i++){
			System.out.print(s1[i]);
		}
	}
}
