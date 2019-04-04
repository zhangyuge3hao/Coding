package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 需求：
 * (1)定义一个int类型的一维数组，内容为{171,72,19,16,118,51,210,7,18}
 * (2)求出该数组中满足要求的元素和。
 * 		要求：求和的元素的个位和十位不能包含7,并且只能为偶数。
 * 
 * 分析：
 * 		A:定义一个int类型的一维数组
 * 		B:定义一个求和变量
 * 		C:遍历数组,获取数组中的每一个元素
 * 		D:判断该元素是否满足条件，如果满足条件就累加
 * 			假设该数据是x
 * 			个位不能是7：x%10 != 7
 * 			十位不能是7：x/10%10 != 7
 * 			必须是偶数：x%2 == 0
 * 		E:输出求和结果
 */
public class Test5 {
	public static void main(String[] args) {
		ArrayList<Integer> elem = new  ArrayList<Integer>();
		int i=64;
		do{
			elem.add(i);
			i++;
		}while(i<=75);
		
		// 转换 ArrayList 为 Array
		//String[] simpleArray = list.toArray(new String[list.size()]);
		//Integer[] newElem1 = new Integer[elem.size()];
		//newElem1 = elem.toArray(new Integer[elem.size()]);
		int temp=0;
		int sum= 0;
		
        for (Iterator<Integer> it = elem.iterator();it.hasNext();temp++) {
        	
        	int elem2=it.next();		//注！！！！！！！！在hasNext中，每个.next操作都是渠道链表的下一个元素，
        								//所以当对一个节点进行操作时，一定要将节点取出后再做操作，即只调用一次.next()
        	
        	if((elem2%10 != 7) && (elem2/10%10 != 7) && (elem2%2 == 0) ){
        	//if(elem2%10!=7 && (elem2/10)%10!=7 && elem2%2==0){
        		System.out.println("第"+temp+"个元数是：" + elem2);
        		sum+=elem2;
        	}
        }
		System.out.println("结果是："+sum);
	}
}		
		//定义一个int类型的一维数组
		/*int[] arr = {171,72,19,16,118,51,210,7,18};
		
		//定义一个求和变量
		int sum = 0;
		
		//遍历数组,获取数组中的每一个元素
		for(int x=0; x<arr.length; x++) {
			//判断该元素是否满足条件，如果满足条件就累加
			if((arr[x]%10 != 7) && (arr[x]/10%10 != 7) && (arr[x]%2 == 0)) {
				sum += arr[x];
			}
		}
		
		//输出求和结果
		System.out.println("sum:"+sum);*/

