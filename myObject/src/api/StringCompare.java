package api;

import java.util.Scanner;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年6月14日 上午9:00:43
* 
* 	通过构造方法创建的字符串对象 和 直接赋值创建的字符串对象 的区别:
* 
*		构造方法：
* 			栈里面存的是new出来String对象的堆地址，所以
* 		直接赋值：
* 			存储的是基本数据类型的值
* 
* 	A. 当使用构造方法给String类型赋值时：		String s1 = new String("abc");
* 		在栈内存中生成(String的)s1变量，s1里放的是指向堆内存的地址001，而堆内存中001里放的则是指向方法区常量池中的地址002，这个002里放的才是真正的构造方法赋给String s1的值
*		1.直接输出s1，系统会通过
*			【栈内存[s1=（堆地址001）]->堆内存[方法区的常量池地址002]】
*		      两级地址找到存储的值，并【直接输出这个值】
*		2.而String作为引用类型，使用“==”进行比较时，会直接用（栈内存里存的）堆地址001和其他数据进行比较
*
*	B. 当给String类型直接值时：	String s2 = "abc";
* 		在栈内存中
* 	【==】等于号的作用：
* 		引用数据类型：比较的是引用数据类型的[地址] <- String
* 		普通数据类型：比较的是普通数据类型的[值]
* 		
*/
public class StringCompare {
	public static void main(String[] args) {
/*		Scanner sc = new Scanner(System.in);
		System.out.println("sc:"+sc);*/
		String s1 = new String("abc");	//s1
		String s2 = "abc";
		String s3 = "abc";
		System.out.println("s1:"+s1+" ---s2:"+s2+" ---s3:"+s3);
		System.out.println("s1==s2:"+(s1==s2));//false  地址!=地址
		System.out.println("s1==s3:"+(s1==s3));//false  地址!=地址
		System.out.println("s2==s3:"+(s2==s3));//true   值==值
		System.out.println(s1+s2+s3);//String类型相加，是将字符串进行拼接
	}
}
