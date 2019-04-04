package com.practice;

import java.util.Scanner;

/*
 * 需求：键盘录入一个月份，输出该月份对应的季节。
 * 		一年有四季
 * 		3,4,5	春季
 * 		6,7,8	夏季
 * 		9,10,11	秋季
 * 		12,1,2	冬季
 * 
 * 分析：
 * 		A:键盘录入一个月份,用Scanner实现
 * 		B:判断该月份是几月,根据月份输出对应的季节
 * 			if
 * 			switch
 * case穿透
 */
public class Test2井号退出U设flag判断U正则表达式 {
	public static void main(String[] args) {
		//输入月份
		int monInt;
		boolean flag = false;			 //当用到switch、do while等循环判断语句，判断条件不易订时，可以用通过添加flag做判断语句
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入月份(以'#'结束)：");
			String month = sc.next();
			int length = month.length();
			
			flag = month.matches("#");
			//System.out.println(flag);
			
			if(month.matches("[0-9]{0,2}")){
				//System.out.println("是纯2位数字");
				monInt=Integer.parseInt(month);
				switch(monInt){
				case 1:
				case 2: 
				case 3:
					System.out.println("是第一季度");
					break;
				case 4:
				case 5:
				case 6:
					System.out.println("是第二季度");
					break;
				case 7:
				case 8:
				case 9:
					System.out.println("是第三季度");
					break;
				case 10:
				case 11:
				case 12:
					System.out.println("是第四季度");
					break;
					/*
					 * /---------default超级容易忘记----------/
					 */
				default:  
					System.out.println("你输入的月份有误");
					//break;
				}
			}else if(month.endsWith("#")){
				//System.out.println("#号退出");
			}else{
				System.out.println("月份输入错误");
			}
        }while(flag==false);   // 如果输入的值不是#就继续输入
        System.out.println("你输入了\"#\"，程序已经退出！");
        
        
      //  sc.close(); // 关闭资源
		
	}
}
