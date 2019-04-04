package ���Խṹ_2ջ�����;

import java.util.Arrays;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��4��1�� ����5:05:01
* 
* 
*/
public class MyQueueObject {
	//�������
	private int[] elements;
	
	//���췽����ʼ������
	public MyQueueObject(){
		elements = new int[0];
	}
	
	//size����
	public int size(){
		return elements.length;
	}
	
	//isEmpty����
	public boolean isEmpty(){
		if(size() == 0){
			return true;
		}else{
			return false;
		}
	}
	
	//en����
	public void en(int num){
		int len = elements.length;
		int[] temp = new int[len + 1];
		for(int i = 0;i<len;i++){
			temp[i] = elements[i];
		}
		temp[len] = num;
		elements = temp;
	}
	
	//out����
	public int out() throws Exception{
		if(isEmpty()){
			throw new Exception("����Ϊ�գ�����out");
		}
		int len = elements.length;
		int num = elements[0];
		int[] temp = new int[len - 1];
		for(int i = 0;i<len-1;i++){
			temp[i] = elements[i+1];
		}
		elements = temp;
		return num;
	}
	
	//show����
	public void show(){
		System.out.println(Arrays.toString(elements));
	}
}
