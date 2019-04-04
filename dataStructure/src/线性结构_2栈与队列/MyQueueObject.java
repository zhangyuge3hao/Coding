package 线性结构_2栈与队列;

import java.util.Arrays;

/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年4月1日 下午5:05:01
* 
* 
*/
public class MyQueueObject {
	//定义队列
	private int[] elements;
	
	//构造方法初始化队列
	public MyQueueObject(){
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
	
	//en方法
	public void en(int num){
		int len = elements.length;
		int[] temp = new int[len + 1];
		for(int i = 0;i<len;i++){
			temp[i] = elements[i];
		}
		temp[len] = num;
		elements = temp;
	}
	
	//out方法
	public int out() throws Exception{
		if(isEmpty()){
			throw new Exception("队列为空，不可out");
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
	
	//show方法
	public void show(){
		System.out.println(Arrays.toString(elements));
	}
}
