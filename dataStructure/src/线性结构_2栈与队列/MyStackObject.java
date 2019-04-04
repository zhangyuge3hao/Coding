package 线性结构_2栈与队列;

import java.util.Arrays;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年4月1日 下午4:07:35
* 
* 
*/
public class MyStackObject {
	
	//定义栈对象
	private int[] elements;
	
	//构造方法初始化
	public MyStackObject(){
		elements = new int[0];
	}
	
	//size方法
	public int size(){
		return elements.length;
	}
	
	//isEmpty方法
	public boolean isEmpty(){
		if(size() == 0){
			return true;
		}else{
			return false;
		}
	}
	
	//peek方法
	public int peek(){
		if(isEmpty()){
			throw new RuntimeException("栈空不可peek");
		}
		return elements[0];
	}
	
	//push方法
	public void push(int num){
		int len = elements.length;
		int[] temp = new int[len+1];
		for(int i = 0;i<len;i++){
			temp[i+1] = elements[i];
		}
		temp[0] = num;
		elements = temp;
 	}
	
	//pop方法
	public int pop(){
		if(isEmpty()){
			throw new RuntimeException("栈空不可pop");
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
	
	//show方法
	public void show(){
		System.out.println(Arrays.toString(elements));
	}
}
