package com.diedai;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年2月23日 上午9:30:46
* 
* 分解	100 = 1*2*2*5*5
* 		50 = 1*2*5*5
*/
public class 分解质因数 {
	public static void main(String [] args){
		resolve(100);
		System.out.println(re);
	}
	static String re = "1";
	
	static void resolve(int n){
		//boolean flag = true;
		if(n!=1){
			for(int i=2;i<=n;i++){
				if(n%i==0){
					n=n/i;
					//flag=false;
					re = re +"*"+ i;
					System.out.println(i);
					resolve(n);
					break;
				}
			}
		}
	}
}
