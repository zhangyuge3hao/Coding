package com.random;

import java.util.Random;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月8日 下午9:38:34
* 	
* 	使用random函数：
* 		A. 导包（当出现未导包错误时，ctrl + shift + o快捷键导包）
* 			import java.util.Random;
* 		B. 创建random对象
* 			Random ra = new Random();
* 		C. 使用random对象
* 			ra.nextInt();  	()内什么都不写，即为无限制取随机数
* 			ra.nextInt(10);	()内写数字，如10.即表示随机生成[0,10)内的随机数
* 								[0,10)左闭右开，表示可以取到1，/----但取不到10----/
*/
public class RandomBasic {
	public static void main(String[] args) {
		Random ra = new Random();
		int random = ra.nextInt(10);
		System.out.println("[0,10)内的随机数："+random);
		/*要生成[1,100]的随机数*/
		int rd = ra.nextInt(100)+1;
		System.out.println("[1,100]内的随机数："+rd);
	}
}
