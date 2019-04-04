package 线性结构_1数组;

import java.util.Arrays;
/**
* @author 张宇_Yu Zhang E-mail:zy1128zy@163.com
* @version 创建时间：2019年2月23日 下午5:02:58
* 
* 	这个类，用于封装面向对象的数组,建立数组对象
*/
public class MyArrayObject {//A数组对象
	
	//申明的，用于存储数据的目标数组（元素），只能用于存int，其他类型的存储用object类型
	private int[] elements;
	/**
	 * 跟类名相同的方法名被称作构造方法，其作用是用于当一个类被new成对象时，对象需要声明的一些变量的构造声明。具体有以下特点：

	（1）构造方法的名字必须与定义他的类名完全相同，没有返回类型，甚至连void也没有；

	（2）构造方法的调用是在创建一个对象时使用new操作进行的。构造方法的作用是初始化对象。举例如下：
    Person p = new Person();  Person()调用的就是Person的构造方法；

	（3）每个类可以有零个或多个构造方法；

	（4）不能被static、final、synchronized、abstract和native修饰。构造方法不能被子类继承。

	（5）构造方法在创建对象时自动执行,一般不能显式地直接调用。
	 */
	//对elements 进行构造方法
	public MyArrayObject(){
		//在构造方法中为elements 初始化一个空值,虽然长度是0，但是对象得有
		elements = new int[0];
	}
	
	/**
	 * 为elements对象添加使用方式
	 */
	//获取长度
	 public int size(){
		return elements.length;
	 }
	 //打印数组
	 public void show(){
		System.out.println(Arrays.toString(elements));
	 }
	 //在数组最后添加数据
	 public void add(int n){
		 int len = elements.length;
		 int arr[] = new int[len+1];
		 for(int i = 0;i<len; i++){
			 arr[i]=elements[i];
		 }
		 arr[len]=n;
		 elements = arr;//修改后要将指针指向elements
	 }
	 //在数组中添加数据
	 public void insert(int index ,int num){
		 int len = elements.length;
		 int[] arr = new int[len+1];
		 for(int i = 0;i<len+1;i++){
			 if(i < index){
				 arr[i] = elements[i];
			 }else if(i == index){
				 arr[i] = num;
			 }else{
				 arr[i] = elements[i-1];
			 }
		 }
		 elements = arr;
	 }
	 //获取目标下标元素
	 public int getEle(int index){
		 return elements[index];
	 }
	 //替换下标元素
	 public void replace(int index,int num){
		 elements[index] = num;
	 }
	 //删除对应下标元素
	 public void deleteAtInd(int index){
		 int len = elements.length;
		 int len1 = size();
		 int[] arr = new int[len1-1];
		 if(index < 0 || index>=size()){
			 System.out.println("下标越界");
		 }else{
			 for(int i = 0;i<len1-1;i++){
				 if(i < index){
					 arr[i] = elements[i];
				 }else{
					 arr[i] = elements[i+1];
				 }
			 }
			 elements = arr;
		 }
	 }
	 //从前往后删除第一个目标元素
	 public void remove(int n){
		 int len = elements.length;
		 int index = 0;
		 boolean flag = false;
		 //getIndex
		 for(int i = 0;i<len ;i++){
			 if(elements[i] == n){
				 index = i;
				 flag = true;
				 break;
			 }
		 }
		 if(flag){
			 deleteAtInd(index);
		 }else{
			 System.out.println("此元素不在数组中");
		 } 
	 }
	 //二分法查找有序数组的某个值是否存在
	 public boolean getIndOrder(int target){
		/**
		 * 使用begin、mid、end来记录数组边界和查找中间点
		 */
		int len = elements.length;
		int begin =0,end = len-1;
		int mid = (begin + end)/2;
		int times = 0;//记录查找的次数，用于在=len时退出循环，表示全部数字查找完毕
		boolean flag = false;//找到退出判断标记
		//--------视频错误----若开始的位置和结束的位置重合，或者开始位置在结束位置后面，即：begin >= end
		//若开始位置在结束位置后面，即：begin > end
		while(times <= len){
			if(elements[mid] < target){
				begin = mid+1;
			}else if(elements[mid] > target){
				end = mid-1;
			}else if(begin > end){
				System.out.println("while内，查无此数");
				break;
			}
			else{
				flag = true;
				break;
			}
			mid = (begin + end)/2;
			times++;
		}
		if(flag){
			System.out.println("找到这个数"+target+"，在下标："+mid);
			 return true;
		}else{
			System.out.println("查无此数");
			 return false;
		}
	}
}
