package 线性结构_2栈与队列;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年4月1日 下午4:25:08
* 
* 
*/
public class MyStack {
	public static void main(String[] args) {
		MyStackObject ms = new MyStackObject();
		
		//System.out.println(ms.peek());
		//ms.pop();
		
		ms.push(0);
		ms.push(1);
		ms.push(2);
		ms.show();
		
		System.out.println(ms.peek());
		System.out.println(ms.peek());
		ms.show();
		
		System.out.println(ms.pop());
		ms.show();
		System.out.println(ms.pop());
		ms.show();
		System.out.println(ms.pop());
		ms.show();
		
		System.out.println(ms.isEmpty());
	}
}
