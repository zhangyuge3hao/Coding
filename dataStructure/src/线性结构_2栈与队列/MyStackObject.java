package ���Խṹ_2ջ�����;

import java.util.Arrays;

/**
* @author ����_Yu Zhang E-mail:zy1128zy@163.com
* @version ����ʱ�䣺2019��4��1�� ����4:07:35
* 
* 
*/
public class MyStackObject {
	
	//����ջ����
	private int[] elements;
	
	//���췽����ʼ��
	public MyStackObject(){
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
	
	//peek����
	public int peek(){
		if(isEmpty()){
			throw new RuntimeException("ջ�ղ���peek");
		}
		return elements[0];
	}
	
	//push����
	public void push(int num){
		int len = elements.length;
		int[] temp = new int[len+1];
		for(int i = 0;i<len;i++){
			temp[i+1] = elements[i];
		}
		temp[0] = num;
		elements = temp;
 	}
	
	//pop����
	public int pop(){
		if(isEmpty()){
			throw new RuntimeException("ջ�ղ���pop");
		}
		int len = elements.length;
		int p = elements[0];
		int[] temp = new int[len - 1];
		for(int i = 0;i<len-1;i++){
			temp[i] = elements[i+1];
		}
		elements = temp;
		return p;
	}
	
	//show����
	public void show(){
		System.out.println(Arrays.toString(elements));
	}
}
