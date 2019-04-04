package com.flowcontrol;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月6日 下午11:17:13
* 
* 	水仙花数是指一个 n位正整数 ( n≥3 )，一般为3位数，它的每个位上的数字的 n 次幂之和等于它本身。（例如：1^3 + 5^3+ 3^3 = 153）
*/
public class ForDemo水仙花数的相关 {
	/*找出1000以内（100~1000）所有的水仙花数*/
	
	public static void main(String[] args) {
		int shuiXian = 0;	//表示for循环中(100~1000)每个原数，用于和被拆开后的各位上数字结果判断原数是否为水仙花数
		int all = 100000;		//寻找水仙花数的范围，从100到all；
		int temp = 0;		//用于同级范围内水仙花数的个数
		
		for(shuiXian=100;shuiXian<=all;shuiXian++){
			int temp_shuiXian = shuiXian;	//在循环中代表当前得数（原数）(需要一个变量进入循环缩减)
			int sx_long = 1;	//表示当前得数temp_shuiXian的长度、是几位数（一个数至少有1位，初始值位1）
			int sx_first = 0;	//记录当前得数temp_shuiXian的最高位数字
			int temp_tenTimes = 0;	//计算最高位数字sx_first时需要的整百被除数 290/100=2
			int temp_result = 0;	//用于拆分时每个数字的n次幂求和
			int temp_sx_long = 0;	//用于在循环中记录得数的当前长度sx_long
			int loop_long = 0;		//用于判断位数的循环
			int loop_resolve = 0;	//用于判断拆分原数的循环是否完成
			/** 
			 * A. 对每一个原数temp_shuiXian，先判断它是几位数
			 * 		方法：
			 * 		原数，每次除10取整，直到结果<10（是个位数）。循环的次数即为几位数
			 */
			for(loop_long=temp_shuiXian;loop_long>=10;loop_long/=10){
				sx_long++;
			}
			//System.out.println("原数shuiXian "+temp_shuiXian+" 为  "+sx_long+" 位数");
			temp_sx_long=sx_long;	//让temp_sx_long在循环中记录得数的当前长度sx_long
			/**
			 * B. 得出位数以后，分解原数(for),并将每位数^sx_long求和与shuiXian比较
			 * 		方法：  假定原数为290
			 * 		得首位sx_first：	290为3位数---首位是2 {---2=290/100，其中100=10^(2)，其中2=3-1}
			 * 							sx_first=temp_shuiXian/temp_tenTimes;
			 * 							temp_tenTimes=(int) Math.pow(10,--sx_long);	
			 * 		计算首位求和：		temp_result += (int) Math.pow(sx_first,sx_long);
			 * 		下次循环：			下次进入循环的是90---{90=290-200，其中200=100*2}
			 * 							得数去掉最高位：temp_shuiXian-=temp_tenTimes*sx_first;
			 * 							长度（位数）减一：sx_long--;
			 */
			for(loop_resolve=1;loop_resolve<=sx_long;loop_resolve++){	//原数从左起为第1位
				//得首位sx_first：
				temp_tenTimes=(int)Math.pow(10,--temp_sx_long);
				sx_first=temp_shuiXian/temp_tenTimes;
				//System.out.println("得数temp_shuiXian:"+temp_shuiXian+" 的第"+loop_resolve+"位sx_first是：(--"+sx_first+"--)");
				//计算首位求和：
				temp_result+=(int) Math.pow(sx_first,sx_long);
					//System.out.println("计算首位求和时，temp_sx_long为："+temp_sx_long);
				//下次循环：
				temp_shuiXian-=temp_tenTimes*sx_first;	//得数去掉最高位：
				//mp_sx_long--;	//长度（位数）减一：
				//System.out.println("得数去掉最高位后为："+temp_shuiXian+" 是"+temp_sx_long+"位数");
			}
			/**
			 * 	C. 判断是否是水仙花数：
			 */
			if(temp_result==shuiXian){
				System.out.println("/--------计算结果是： "+temp_result+" ,则  "+shuiXian+" 是水仙花数--------/");
				temp++;
			}else{
				//System.out.println("/--计算结果是： "+temp_result+" ,则  "+shuiXian+" 不是水仙花数--/");
			}
		}
		System.out.println("在100~"+all+"中，共有"+temp+"个水仙花数");
	}
}
