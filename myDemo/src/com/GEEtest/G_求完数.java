package com.GEEtest;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��1��18�� ����3:53:37
* 
* 
*/
import java.util.Scanner;
public class G_������ {
	public static void main(String [] args){
/*		���⣺���1000���ڵ�����
		���������һ����ǡ�õ��ڳ��������������֮�ͣ����������������
		����6=1+2+3;28=1+2+4+7+14
*/	
		Scanner sc =new Scanner(System.in);
		while(true){
			System.out.println("input a range,split the limits with .");
			String s =sc.next();
			if(s.matches("\\d+[\\.]\\d+")){
				String str[]=s.split("\\.");
				int a=0;
				if(Integer.parseInt(str[0])<=1){
					a=2;
				}else{
					a=Integer.parseInt(str[0]);
				}
				int b=Integer.parseInt(str[1]);
				if(a<=b){
					System.out.println("�����ڹ���"+getNum(a,b)+"������");
				}else{
					System.out.println("Input illegal");
				}
				//System.out.println(findX(a));
			}else{
				System.out.println("Input illegal");
			}
		}
	}
	public static int getNum(int n,int m){
		int count=0;
		for(int i=n;i<=m;i++){
			if(findX(i)==i){
				System.out.println(i+"������");
				count++;
			}
		}
		return count;
	}
	public static int findX(int n){//�ҳ����С���ȥ������ġ�Լ��
		int x=0;
		int sum=1;
		for(int i=2;i<n;i++){
			if(n%i==0){
				sum+=i;
			}
		}
		return sum;
	}
	/*public static int findX(int n){//������ҳ��Ǽ�������˵�n
		int x=0;
		int sum=1;
		for(int i=2;i<=n;i++){
			if(n%i==0){
				sum+=i;
				n/=i;
				i=1;
			}
		}
		return sum;
	}public static int findX(int n){
		int x=0;
		int sum=1;
		for(int i=2;i<=n;i++){
			if(n%i==0){
				sum+=i;
				findX(x=n/i);	
			}
		}
		return sum;
	}*/
}
