package com.method;
/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2017��5��18�� ����10:12:15
* 
* 
*/
public class MethodPracticeFlower {
	public static void main(String[] args) {
		flower();
	}
	//��ȡԭ������λ������
	public static int getLength(int tempFlower) {
		int len = String.valueOf(tempFlower).length();
		return len;
	}
	public static void check(int sumFlower,int tempFlower){
		if(sumFlower==tempFlower){
			System.out.println("/------�ݺͣ�"+sumFlower+"����ԭ����"+tempFlower+"��ˮ�ɻ���------/");
		}else{
			//System.out.println("/------�ݺͣ�"+sumFlower+"����ԭ����"+tempFlower+"--��--��ˮ�ɻ���------/");
		}
	}
	//ͨ�����Ȳ��ԭ�����������ж�
	public static void flower() {
		int flower = 100;
		int lenth = 0;
		int tempFlower;
		int temp_each;
		int each_number;
		int sumFlower;
		int increase_number;
		for(tempFlower=flower;tempFlower<=1000;tempFlower++){
			sumFlower=0;
			increase_number=tempFlower;
			lenth=getLength(tempFlower);
			//System.out.println("lenth:"+lenth);
			for(temp_each=0;temp_each<lenth;temp_each++){
				each_number=increase_number%10;
				//System.out.println("each_number:"+each_number);
				sumFlower+=Math.pow(each_number, lenth);
				increase_number/=10;
			}
			check(sumFlower,tempFlower);
		}
	}
}
