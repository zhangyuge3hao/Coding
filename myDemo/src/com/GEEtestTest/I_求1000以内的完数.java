package com.GEEtestTest;

public class I_求1000以内的完数 {
	public static void main(String[] args){
		int count = 0;
		for(int i = 1;i<1000;i++){
			int sum = 0;
			for(int j = 1;j<i;j++){//寻找完数：除了自己以外的因数和=自己，就是完数
				if(i%j == 0){
					sum += j;
				}
			}		
			if(sum == i){
				System.out.println("是完数："+i);
				count++;
			}
		}
		System.out.println("总数："+count);
	}
}
