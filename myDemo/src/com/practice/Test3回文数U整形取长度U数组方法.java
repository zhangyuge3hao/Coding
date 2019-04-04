package com.practice;
/*
 * 需求：打印5位数中的所有回文数。
 * 		什么是回文数呢?举例：12321是回文数，个位与万位相同，十位与千位相同。
 * 
 * 分析：
 * 		A:5位数告诉了我们数据的范围,用for循环实现
 * 		B:拿到每一个5位数后,获取其个位,十位,千位,万位的数据
 * 			如何获取呢?假设x是一个5位数
 * 			个位：x%10
 * 			十位：x/10%10
 * 			千位：x/10/10/10%10
 * 			万位：x/10/10/10/10%10
 * 		C:根据条件进行判断,把满足条件的数据输出即可
 */
public class Test3回文数U整形取长度U数组方法 {
	public static void main(String[] args) {
		/*
		 * 思路：历遍10000~99999
		 * 将5位数的每一位存到数组里，然后分别取前后一位进行比较
		 * 		存数组是为了增强代码找出不同位数的回文数的可扩展性
		 */
		
		//历遍+拆分 5位数，存入数组
		int length = 0;
		int sum = 0;
		for (int i = 10000; i <= 99999; i++) {
			//判断一个int类型的变量有多长（判断整数的位数）
			Integer len = i;  					//转换为包装类Integer
			length = len.toString().length();	//用length()获取toString的长度
			
			//将该整形拆分后存入数组
			int arr[] = new int[length];
			split(i,length,arr);
			
			//判断是回文数即输出
			if(check (arr)){
				System.out.print("/---- ");
				for (int j = 0; j < length; j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println("----/");
				sum++;
			}
		//	System.out.println("---------------");	
		}
		System.out.println("共计回文数："+sum+" 个");
	}
	public static int[] split(int i,int length,int[] arr){
		
		//拆分这个数
		int index = length-1;
		while(i>0){
			arr[index]=i%10;
			i/=10;
			index--;
		}
		return arr;
	}
	public static boolean check (int[] arr){
		//boolean flag = true;
		//boolean temp = true;
		
		int flag = 0;
		int length = arr.length-1;
		//System.out.println("   ---"+length);
		for (int i = 0; i < (length+1)/2; i++) {
			if(arr[i]==arr[length-i]){
				flag += 0;
			}else{
				flag += -1;
			}
			//System.out.println("flag="+flag);
			//System.out.println(arr[i]+"  "+arr[length-i]);
		}
		//System.out.println("/---flag="+flag);
		if(flag==0){
			return true;
		}else{
			return false;
		}
	}
}
//5位数告诉了我们数据的范围,用for循环实现
/*for(int x=10000; x<100000; x++) {
	//拿到每一个5位数后,获取其个位,十位,千位,万位的数据
	int ge = x%10;
	int shi = x/10%10;
	int qian = x/10/10/10%10;
	int wan = x/10/10/10/10%10;
	
	//根据条件进行判断,把满足条件的数据输出即可
	if((ge == wan) && (shi == qian)) {
		System.out.println(x);
	}
}*/