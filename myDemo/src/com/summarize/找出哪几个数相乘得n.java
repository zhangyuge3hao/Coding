package com.summarize;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��1��18�� ����5:24:28
* 
* 
*/
public class �ҳ��ļ�������˵�n {
	public static void main(String [] args){//������ҳ��Ǽ�������˵�n
		int n=14;
		int x=0;
		int sum=1;
		for(int i=2;i<=n;i++){
			if(n%i==0){
				sum+=i;
				n/=i;
				System.out.println(i);
				i=1;
			}
		}
	}
}
