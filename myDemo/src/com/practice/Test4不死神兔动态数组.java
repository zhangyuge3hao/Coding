package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

/**
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
 * 		规律：从第三个月开始，每个月的兔子对数是前两个月的兔子对数之和
 *          第一个月和第二个月的兔子对数都是1
 * 
 * 分析：
 * 		A:由于数据比较多,所以我们就定义数组来实现了
 * 			int[] arr = new int[20];
 * 		B:给数组的元素赋值
 * 			arr[0] = 1
 * 			arr[1] = 2
 * 		C:找规律
 * 			arr[2] = arr[1] + arr[0];
 * 			arr[3] = arr[2] + arr[1];
 * 			arr[4] = arr[3] + arr[2];
 * 			arr[5] = arr[4] + arr[3];
 * 			...	
 */
public class Test4不死神兔动态数组 {
	public static void main(String[] args) {
		/**
		 *	思路1模拟实际情况：
		 *		A. 建立一个动态数组（兔笼）（用来放下所有的兔子-元素） 
		 *		B. 每个元素的数字都是它被创建时的月号
		 *		C. 每个月遍历一次数组（兔笼），让所有（当前月份—出生月份）>=2的元素（兔子）都生成新的元素并放入数组（生下新的兔子并放进兔笼）
		 *		D. 最后检索数组长度
		 */
		System.out.println("方法1：使用动态数组，模拟实际情况");
		//建立一个动态数组（兔笼）（用来放下所有的兔子-元素）
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//放入第一组元素（第一对兔子放进兔笼）
		list.add(1);
		int sum = 0;
		
		//开始20个月的养兔子历程
		for (int i = 1; i <= 20; i++) {					//遍历20次，20个月
			for (int j = 0; j < list.size(); j++) {
	            if((i-list.get(j))>=2){					//所有（当前月份i—出生月份.get(j)）>=2的元素（兔子）
	            	list.add(i);						//都生成新的元素并放入数组（生下新的兔子并放进兔笼）
	            }else{
	            	break;
	            }
	        }
        }
		for (Iterator<Integer> it = list.iterator(); it.hasNext();) {
           // System.out.println("/---数组内的元素有: " + it.next());
            it.next();
            sum++;
        }
		System.out.println("第20个月共有兔子： "+sum+" 对");
		list.clear();
		
		System.out.println("/------------------------------/");
		System.out.println("方法2：寻找规律：从第三个月开始，每个月的兔子对数是前两个月的兔子对数之和");
		/**
		 * 规律：从第三个月开始，每个月的兔子对数是前两个月的兔子对数之和
		 *     第一个月和第二个月的兔子对数都是1
		 */
		int[] arr={1,1,0};	//第一个月和第二个月的兔子对数都是1
		for (int i = 0; i < 18; i++) {
			arr[2]=arr[0]+arr[1];	//从第三个月开始，每个月的兔子对数是前两个月的兔子对数之和
			arr[0]=arr[1];
			arr[1]=arr[2];
		}
		System.out.println("20个月后兔子有"+arr[2]+"对");
	}
}




//定义数组
/*
int[] arr = new int[20];

//给数组的元素赋值
arr[0] = 1;
arr[1] = 1;

//找规律赋值
for(int x=2; x<arr.length; x++) {
	arr[x] = arr[x-1] + arr[x-2];
}

//输出结果
System.out.println("第二十个月兔子的对数是："+arr[19]);
//第二十个月兔子的对数是：6765
*/
 