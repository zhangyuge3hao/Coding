package com.flowcontrol;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2017年5月8日 上午10:03:34
* 
* 	初始化语句
* 	while(判断语句){
* 		循环体语句；
* 		【控制条件语句；
* 	}
* 
* 对比for语句
* 	for(初始化语句；判断语句；【控制条件语句){
* 		循环体语句；
* 	}
* 
* 	所以while能做的for都能做，for能做的while也都能做
*/
public class WihleDome循环结构 {
	public static void main(String[] args) {
		int a;
		for( a=1;a<=10;a++){
			System.out.println("for第"+a+"条");
		}
		System.out.println("/---------------------/");
		a=1;	//初始化语句
		while(a<=10){	//判断语句
			System.out.println("while第"+a+"条"); //循环体语句；
			a++;	//控制条件语句；
		}
		
		
		/*--------------求1~100的和--------------*/
		System.out.println("/----------求1~100的和-----------/");
		int temp = 1;
		int initial =0;
		while(temp<=100){
			initial+=temp;
			temp++;
			//System.out.println(initial);
		}
		System.out.println("1~100的和是"+initial); //循环体语句；
		
		/*--------------求100~1000的水仙花数的个数--------------*/
		System.out.println("/----------求100~1000的水仙花数的个数-----------/");
		initial = 152;
		int temp_initial = initial;
		int get_num=0;	//表示每一位上的数
		int len=0;	//表示数字长度
		int get_all= 0;	//求幂和的值
		int count=0;
		
		while(temp_initial<=1000){
			get_all= 0;
			initial = temp_initial;
			len=String.valueOf(initial).length();
			int tempLen=len;
			while(len>0){
				get_num=initial/(int)Math.pow(10, len-1);
				get_all+=(int)Math.pow(get_num, tempLen);
				initial-=get_num*(int)Math.pow(10, len-1);
				len--;	
				}
			if(get_all==temp_initial){
				System.out.println("---------水仙花"+get_all);
				count++;
			}
			temp_initial++;
		}
		System.out.println(count);

/*		while(initial<=1000){
			get_all=0;	//用于累计幂和，每次获取新的原数时应当清零重计
			temp_initial = initial;
			len = String.valueOf(initial).length();
			//System.out.println("len："+len+",temp_initial:"+initial);
			while(temp_initial>=10){
				get_num=temp_initial%10;
				
				temp_initial/=10;
				//System.out.println("get_num："+get_num+"   temp_initial:"+temp_initial);
				get_all+=Math.pow(get_num, len);
			}
			//System.out.println("刚出循环get_all："+get_all);
			get_all+=Math.pow(temp_initial, len);
			if(get_all==initial){
				//System.out.println("是水仙花数，值是："+get_all+"多了"+Math.pow(temp_initial, len));
				System.out.println("是水仙花数，值是："+get_all);
			}else{
				//System.out.println("不是水仙花数，值是："+get_all+"多了"+Math.pow(temp_initial, len));
			}
			initial++;
		}*/
		

	}
}
