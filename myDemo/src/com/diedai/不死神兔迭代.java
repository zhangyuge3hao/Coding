package com.diedai;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��2��22�� ����4:29:55
* 
* ����
 * 		��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ�
 * 		�������Ӷ��������ʵڶ�ʮ���µ����Ӷ���Ϊ���٣� 
 * 
 * ���ɣ�
 * 		��һ���£�1
 * 		�ڶ����£�1
 * 		�������£�2
 * 		���ĸ��£�3
 * 		������£�5
 * 		...
 * 
 * 		���ɣ��ӵ������¿�ʼ��ÿ���µ����Ӷ�����ǰ�����µ����Ӷ���֮�ͣ�
 *          ��һ���º͵ڶ����µ����Ӷ�������1
* 		 ���ӵĶ�������һ������ǰ�������ĺ�
* 
* 	�Ȼ�Ϊ��ѧģ�ͣ�Ȼ��д�����ͺܷ���
* 	
* 		f(x)= |f(x-1)+f(x-2),	x>2	
* 			  |1,				x<=2
*/
public class �������õ��� {
	public static void main(String []args){
		System.out.println("�������ã�");
		for(int i = 1; i<8;i++){
			System.out.println(rabbit(i));
		}
		System.out.println("�ӵڶ�λ��ÿһ��������ǰһ����+��ǰλ�ã�");
		for(int i = 1; i<=10;i++){
			System.out.println(f(i));
		}
		System.out.println("count:"+count);
		System.out.println("���ĸ���=ǰ�������ĺͣ�");
		for(int i = 1; i<=10;i++){
			System.out.println(f2(i));
		}
		System.out.println("���������3���ݴΣ�");
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
	 * �ӵڶ�λ��ÿһ��������ǰһ����+��ǰλ��
	 * ��ÿ��nλ�ö�Ҫ����n��f()
	 */
	static int count = 0;//���������棬û�����µ�ʹ�����ƣ����¶�����
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
	 * ���ĸ���=ǰ�������ĺ�
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
	 * ��n����=ǰһ����+n+2
	 * 
	 * 3 4 7 16 ���� 124
	 * ���������3���ݴ�
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
