package com.diedai;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年2月22日 下午4:29:55
* 
* 需求：
 * 		有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 		假如兔子都不死，问第二十个月的兔子对数为多少？ 
 * 
 * 规律：
 * 		第一个月：1
 * 		第二个月：1
 * 		第三个月：2
 * 		第四个月：3
 * 		第五个月：5
 * 		...
 * 
 * 		规律：从第三个月开始，每个月的兔子对数是前两个月的兔子对数之和：
 *          第一个月和第二个月的兔子对数都是1
* 		 兔子的对数：后一个数是前两个数的和
* 
* 	先化为数学模型，然后写迭代就很方便
* 	
* 		f(x)= |f(x-1)+f(x-2),	x>2	
* 			  |1,				x<=2
*/
public class 不死神兔迭代 {
	public static void main(String []args){
		System.out.println("不死神兔：");
		for(int i = 1; i<8;i++){
			System.out.println(rabbit(i));
		}
		System.out.println("从第二位起，每一个数都是前一个数+当前位置：");
		for(int i = 1; i<=10;i++){
			System.out.println(f(i));
		}
		System.out.println("count:"+count);
		System.out.println("第四个数=前三个数的和：");
		for(int i = 1; i<=10;i++){
			System.out.println(f2(i));
		}
		System.out.println("相邻数相差3的幂次：");
		for(int i = 1; i<=10;i++){
			System.out.println(f3(i));
			
		}
	}
	public static int rabbit(int m){
		if(m>2){
			return rabbit(m-1)+rabbit(m-2);
		}else{
			return 1;
		}
	}
	/**
	 * 1 3 6 10 15 21
	 * 从第二位起，每一个数都是前一个数+当前位置
	 * 且每个n位置都要调用n次f()
	 */
	static int count = 0;//定义在外面，没有上下的使用限制，上下都能用
	static int f(int x){
		count++;
		if(x==1){
			return 1;
		}else{
			return f(x-1)+x;
		}
	}
	/**
	 * 1 2 3 6 11 20
	 * 第四个数=前三个数的和
	 */
	static int f2(int x){
		if(x<4){
			return x;
		}else{
			return f2(x-1)+f2(x-2)+f2(x-3);
		}
	}
	/**
	 * 9 13 18 24 31
	 * 第n个数=前一个数+n+2
	 * 
	 * 3 4 7 16 （） 124
	 * 相邻数相差3的幂次
	 */
	static int f3(int x){
		if(x==1){
			return 3;
		}else if(x==2){
			return 4;
		}else{
			//System.out.println(f3(x-1)+"----"+Math.pow(3, x-2));
			return f3(x-1)+(int)Math.pow(3, x-2);
			
		}
	}
}
