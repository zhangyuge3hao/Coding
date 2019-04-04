package com.summarize;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月8日 上午9:04:07
* 
* 
*/
public class 获取数字各个位数上的数 {
	public static void main(String[] args) {
		int initial = 291;
		/**
		 * 方法一：
		 * 		A. 先获取数字的长度：（1）每次除以10，当结果<10的时候停止，循环了几次即为几位数。 （2）String.valueOf(initial).length();  先转成string，然后求字符长
		 * 		B. 以这个长度为循环依据，让原数除以与其等长的整百、千数，得数向下取整（int）即为最高位的数字。原数再减去等长的整百、千数，得到下次循环的原数
		 * 			如：291，291为3位数，291/（10^2）=2，得百位为2，下次循环的原数是：291-10^2	
		 */
		System.out.println("/----------第一种获取"+initial+"各个位数上数字的方法----------/");
		/*----------求数字长度----------*/
		int len = 1;	//原数长度，只要是数字至少是一位数
		int temp_initial ;	//传递原数数值进入循环运算
		//第一种方法  求数字长度方法【推荐】
		for(temp_initial= initial;temp_initial>=10;temp_initial/=10){
			len++;
		}
		System.out.println("方法一得原数长度"+len);
		//第二种方法  求数字长度方法
		len=String.valueOf(initial).length();	//String.valueOf(initial)---转string
													//.length()求字符长，长度是int类型
		System.out.println("方法二得原数长度"+len);
		
		/*----------获取每个位数上的数字----------*/
		int temp_lenth=0;	//传递整百、千数
		int get_singleNum=0;//获取每一位上的数字
		for(temp_initial=initial;len>=1;){
			temp_lenth=(int)Math.pow(10, len-1);
			//System.out.println(temp_lenth+"  "+len);
			get_singleNum=temp_initial/temp_lenth;
			len--;
			temp_initial-=get_singleNum*(int)Math.pow(10, len);
			System.out.println("从左到右数字是："+get_singleNum);
		}
		
		/**
		 * 方法二：
		 * 		A. 个位：291%10=1
		 * 		B. 十位：291/10%10=9
		 * 		C. 百位：291/10/10%10=2
		 * 		......
		 * 		思路：将每次用%10都获取个位数
		 * 			每次循环结束的时候将原数/10，用于下次循环
		 * 			循环结束判断：原数是个位数即退出循环
		 */
		System.out.println("/----------第二种获取"+initial+"各个位数上数字的方法----------/");
		for(temp_initial=initial;temp_initial>=10;temp_initial/=10){
			get_singleNum=temp_initial%10;
			System.out.println("从右到左数字是："+get_singleNum);
		}
		System.out.println("从右到左数字是："+temp_initial);
	}
}
