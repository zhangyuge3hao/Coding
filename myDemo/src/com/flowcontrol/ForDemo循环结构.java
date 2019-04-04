package com.flowcontrol;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月5日 下午3:41:02
* 	
* 	for(初始化语句;判断语句（boolean）;控制条件语句){
* 		循环体语句;
* 	}
* 	
* 	for语句的执行顺序：
* 		A. 先执行初始化语句
* 		B. 执行判断语句，若为false，则退出for循环
* 		C. 执行判断语句，若为true，则执行{}内循环体语句
* 		D. 执行完循环体语句后，执行控制条件语句
* 		E. 条件发生变化后，回到B，执行判断语句
*/
public class ForDemo循环结构 {
	public static void main(String[] args) {
		for(int a=1;a<=10;a++){
			System.out.println("输出"+a+"次");
		}
		
		//获取数据1-5,5-1
		System.out.println("/---------获取数据5-1------------/");
		for(int a=5;a>=1;a--){
			System.out.println("获取："+a);
		}
		//求1-5的和
		System.out.println("/-----------求1-5之间数据的和------------/");
		int temp=0;
		for(int a=5;a>=1;a--){
			temp += a;
		}
		System.out.println("/-----------1-5之间数据的和："+temp+"------------/");
		//求1-100之间的偶数和
		temp=0;
		for(int a=1;a<=100;a++){
			if(a%2==0){
				temp += a;
			}
		}
		System.out.println("/-----------1-100之间的偶数和："+temp+"------------/");
		
		//输出所有水仙花数-----水仙花数是指一个 n位正整数 ( n≥3 )，它的每个位上的数字的 n 次幂之和等于它本身。（例如：1^3 + 5^3+ 3^3 = 153）
		
		
		int flower =104;  //代表原数（水仙花数），因为要和拆分后的数字结果对比，所以变量不参与运算（不出现在等号左边）
		int num_long =1;  //表示原数的长度
		int ten_times =0; //表示原数对应位数的被除数，如：10、100、1000......
		temp = 0;         //表示原数每一位上的数字
		int temp_long =0; //表示原数每次缩减后的位数
		int temp_flower =flower; //表示在计算中代替原数的值
		/*int temp_flowerBefore =flower; //表示每次缩减前的原数
		int temp_flowerAfter =0; //表示每次缩减后的原数
*/		int get_checkNum =0;//表示水仙计算的结果，用于和原数相比判断是否是水仙数
		/*
		 *  输出水仙数的第一步，判断一个数是不是水仙花数
		 */
		for(int a=temp_flower;(a<-9)||(a>9);a/=10){   
			//a每除10取整，即去掉最低位，直到a<9,即表示已经缩减到个位数，退出循环
			num_long++;
		}
		System.out.println(temp_flower+"是"+num_long+"位数");
		temp_long=num_long-1;//表示原数每次缩减后的位数.若原数为3位(153)，则缩减后为2位
							//同时 原数/(10^2) 取整即为最高位上的数字
		/*找出原数的每一位是多少*/
		for(int a=1 ;a<=num_long;a++){		//num_long->1和1->num_long效果一样，但为了方便从左(1)至右顺序输出每一位数，择后者
			//计算被除数ten_times，并让当前位数temp_long缩减1位，以便下次循环计算被除数
			ten_times = (int) Math.pow(10,temp_long--);		
			System.out.println("被除数ten_times是："+ten_times);
			System.out.println("此时的得数temp_flower是："+temp_flower);
			
			//temp表示每次原数缩减后最高位上的数字（int 290/100=2），循环后即得原数每一位上的数字
			temp = temp_flower/ten_times;	 	
			System.out.println("原数flower的第"+a+"位是    (--"+temp+"--)");
			
			//找到最高位的数字后，就抛弃最高位，此时temp_flower表示原数每次缩减后的数字以便下次进入循环使用
			temp_flower -= temp*ten_times;   	
			System.out.println("去掉高位剩下的部分是："+temp_flower);
			
			//计算水仙花数：每个位上的数字的 n 次幂之和等于它本身，将每次计算结果计入get_checkNum
			get_checkNum += (int) Math.pow(temp,num_long);	
		}
		if(get_checkNum==flower){
			System.out.println("------------get_checkNum="+get_checkNum+" ,得数是水仙花数------------");
		}else{
			System.out.println("------------get_checkNum="+get_checkNum+" ,得数不是水仙花数------------");
		}
		/*
		 *  输出所有数字。。。找出其中的水仙花数
		 */
		for(int i=1;i<=2;i++){
			flower=i;
			//temp_flower =flower;
			
			
		}
		
		//统计水仙花数有多少
	}
}
